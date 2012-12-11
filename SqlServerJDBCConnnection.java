/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sumit sharma
 */
public class SqlServerJDBCConnnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mssumit;user=sumit;password=sumit;");
                   // DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=mssumit;integratedSecurity=true");
                    
                    
            System.out.println("connected");
            Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from  [user]");
            while(resultSet.next()){
                System.out.println(" "+resultSet.getString(1)+"    "+resultSet.getNString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
