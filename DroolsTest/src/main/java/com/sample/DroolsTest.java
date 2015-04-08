package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
//            Message message = new Message();
//            message.setMessage("Hello World");
//            message.setStatus(Message.HELLO);
//            kSession.insert(message);
        	Person p1 = new Person("Andrew", 35);
        	Person p2 = new Person("Barbara", 22);
        	Person p3 = new Person("Carl", 8);
        	Person p4 = new Person("Carl", 15);
        	Person p5 = new Person("Daisy", 25);
        	Person p6 = new Person("Carl", 40);
        	
        	kSession.insert(p1);
        	kSession.insert(p2);
        	kSession.insert(p3);
        	kSession.insert(p4);
        	kSession.insert(p5);
        	kSession.insert(p6);
        	kSession.insert(new Mail(p1, p4, "Do your homeworks!"));
        	kSession.insert(new Mail(p5,p5, "Remember to do your homeworks"));
        	        	
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    /*
    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }
    */

}
