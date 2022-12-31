package com.example.search_engine_accio;
import java.sql.*;

public class DataConnection {
    String MySQLURL = "jdbc:mysql://localhost:3306/Search_Engine_Accio?useSSL=false" ;
    String DatabaseUserName = "root" ;
    String DatabasePassword = "Sahil@123" ;
    Connection con = null ;

    DataConnection() throws SQLException{
        con = DriverManager.getConnection(MySQLURL, DatabaseUserName,DatabasePassword);
        System.out.println("Connection to the Database is successful.");
    }

  public ResultSet executeQuery(String query) throws SQLException{
      ResultSet ans = null;
      Statement statement = con.createStatement();
      ans = statement.executeQuery(query);
      return ans;
  }
public int executeUpdate(String query) throws  SQLException{
        int ans =0;
        Statement statement = con.createStatement();
        ans = statement.executeUpdate(query);
        return ans;
}
}
