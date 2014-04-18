package Database;

import java.sql.*;

public class DatabaseSelect {

    public static void main(String args[]) {
        logAllFromDatabase();
        String a = getLyricsForSong("a", "b", "c");
        System.out.println("String a "+a);
    }

    public static String getLyricsForSong(String title, String artist, String album) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM SONGLIST WHERE TITLE = '" + title + "' AND ARTIST = '" + artist + "' AND ALBUM = '" + album + "';");
            while (rs.next()) {
                String title1 = rs.getString("TITLE");
                String artist1 = rs.getString("ARTIST");
                String album1 = rs.getString("ALBUM");
                String lyrics1 = rs.getString("LYRICS");
                System.out.println(title1 + "\t" + artist1 + "\t" + album1 + "\t" + lyrics1);
                return lyrics1;
            }
            rs.close();
            stmt.close();
            c.close();
            return "";
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return "";
        }
        System.out.println("Operation done successfully");
        return "";
    }

    public static void logAllFromDatabase() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM SONGLIST;");
            System.out.println("TITLE\tARTIST\tALBUM\tLYRICS");
            while (rs.next()) {
                String title = rs.getString("TITLE");
                String artist = rs.getString("ARTIST");
                String album = rs.getString("ALBUM");
                String lyrics = rs.getString("LYRICS");

                System.out.println(title + "\t" + artist + "\t" + album + "\t" + lyrics);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}