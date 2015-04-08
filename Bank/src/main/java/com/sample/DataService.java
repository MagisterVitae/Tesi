package com.sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Database object to load drivers and perform queries
 */
public class DataService {

    private static final String Driver = "com.mysql.jdbc.Driver";
    
    private Connection conn;
    private String user;
    private String pwd;
    private String dbName;
    private String ConnectionString;
  
    public DataService(String _user, String _pwd, String _dbName) {
    	this.user = _user;
    	this.pwd = _pwd;
    	this.dbName = _dbName;
    	this.ConnectionString = "jdbc:mysql://localhost/" + dbName + "?user=" + user +"&password=" + pwd;
    	try {
			this.conn = this.loadDriver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * Loads the database base driver
     * @return a database connection
     * @throws SQLException throws an exception if an error occurs
     */
    private Connection loadDriver() throws SQLException {
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        conn = DriverManager.getConnection(ConnectionString, user, pwd);
        return conn;
    }
    
    /**
     * Closes the connection to the database
     * @return int 0: if execution succeeded
     */
    public int closeConn(){
    	try {
			conn.close();  
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return e.getErrorCode();
		}    	
    }
    
    /**
     * Execute a SELECT query
     * @param query: the SQL query
     * @return ResultSet: the selected record set
     * @throws SQLException
     */
    public ResultSet qSelect(String query) throws SQLException {
        ResultSet rs;
        PreparedStatement st = conn.prepareStatement(query);
        rs = st.executeQuery();

        return rs;
    }
    
    /**
     * Execute an UPDATE query
     * @param query: the SQL query
     * @return int: 0 if execution succeeded
     * @throws SQLException
     */
    public int qUpdate(String query) throws SQLException {
        PreparedStatement st = conn.prepareStatement(query);
        st.executeUpdate();
        
        return 0;
    }
    
    public void qInsertObj(Object obj){
    	String sql="INSERT INTO provadrools.fatto(nome,stato) values (?,?)";
    	ObjectOutputStream oos = ObjectOutputStream(new ByteArrayOutputStream());
    	oos.writeObject(obj);
    	oos.close();
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1, "nome_n");
        pst.setObject(2, oos);
//        pst.setBinaryStream(2, oos);
        pst.executeUpdate();
        pst.close();
    }
    
}