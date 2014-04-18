package Database;

import java.sql.*;

public class DatabaseInsert
{
  public static void main(String args[]){
      insertIntoDatabase("a", "b", "c", "lalala");   
  }

    
  public static void insertIntoDatabase(String title, String artist, String album, String lyrics)
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:database.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      String sql = "INSERT INTO SONGLIST (TITLE,ARTIST,ALBUM,LYRICS) " +
                   "VALUES ('"+title+"','"+artist+"','"+album+"','"+lyrics+"');"; 
      stmt.executeUpdate(sql);
      stmt.close();
      c.commit();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Records created successfully");
  }
}


//      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
//      while ( rs.next() ) {
//         int id = rs.getInt("id");
//         String  name = rs.getString("name");
//         int age  = rs.getInt("age");
//         String  address = rs.getString("address");
//         float salary = rs.getFloat("salary");
//         System.out.println( "ID = " + id );
//         System.out.println( "NAME = " + name );
//         System.out.println( "AGE = " + age );
//         System.out.println( "ADDRESS = " + address );
//         System.out.println( "SALARY = " + salary );
//         System.out.println();
//      }
//      rs.close();