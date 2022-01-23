
package SGA.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BDconexao {
    
    private String host,bd,user,password,porta;
    
    public BDconexao(){
        this.host="localhost";//ou 127.0.0.1 
        this.bd="sga";
        this.password="";
        this.user="root";
        this.porta="3306";
    }
    
    public static Connection getConnection()throws ClassNotFoundException, SQLException{        
        Class.forName("com.mysql.cj.jdbc.Driver");
        BDconexao con=new BDconexao();      
        return DriverManager.getConnection("jdbc:mysql://"+con.host+"/"+con.bd,con.user,con.password);
    }    
    public String getHost() {
        return host;
    }
   
    public void setHost(String host) {
        this.host = host;
    }
   
    public String getBd() {
        return bd;
    }
    public void setBd(String bd) {
        this.bd = bd;
    }    
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPorta() {
        return porta;
    }
    public void setPorta(String porta) {
        this.porta = porta;
    }
    
}
