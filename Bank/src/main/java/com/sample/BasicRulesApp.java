package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class BasicRulesApp {

	public static final void main(String[] args) {
		
        try {
            // Drools 6.x Building Standard
        	// load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	Account account = new Account();
			account.setBalance(50);            
            kSession.insert(account);
            kSession.fireAllRules();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

	
	
// Drools 5.x Building Standard	
	
//	public static final void main(String[] args) {
//		KnowledgeBase knowledgeBase = createKnowledgeBase();
//		StatefulKnowledgeSession session = knowledgeBase.newStatefulKnowledgeSession();
//		
//		try{
//			
//			session.insert(account);
//			session.fireAllRules();
//		}
//		finally{
//			session.dispose();
//		}
//	}
//
//	private static KnowledgeBase createKnowledgeBase() {
//		KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();
//		builder.add(ResourceFactory.newClassPathResource("bankRules.drl"), ResourceType.DRL);
//		
//		if(builder.hasErrors())
//			throw new RuntimeException(builder.getErrors().toString());
//		
//		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
//		knowledgeBase.addKnowledgePackages(builder.getKnowledgePackages());
//		
//		return knowledgeBase;
//	}

}
