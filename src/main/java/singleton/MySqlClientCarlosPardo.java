package singleton;

import java.sql.*;
public class MySqlClientCarlosPardo {
    private static MySqlClientCarlosPardo client = null;
    private static Connection con;

    private MySqlClientCarlosPardo(){
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/Test","root","12345678");
    }
    catch(Exception e){System.out.println(e);}
}

    public static MySqlClientCarlosPardo getClient()
    {
        if (client == null){
            System.out.println("first time");
            client = new MySqlClientCarlosPardo();
        }
        else
        {System.out.println("does not the first time");}

        return client;
    }
    public void getData(){

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Test");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
        }
        catch(Exception e){System.out.println(e);}
    }
}


