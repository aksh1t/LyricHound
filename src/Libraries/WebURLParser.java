package Libraries;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class WebURLParser {
    
//Code for parsing lyrics from the source of the URL page
//WARNING : CODE ONLY USEFUL FOR LYRICWIKI URL PAGES
    
    public String parseLyricWikiURL(String page) {
        if(page.equals("")){return "";}
        int start = page.indexOf("</div>&#");
        int end = page.indexOf(";<!--");

        String asciilyrics = page.substring(start, end + 1);
        String asciinumbers = "";

        for (int i = 0; i < asciilyrics.length(); i++) {
            if (i + 6 < asciilyrics.length() && asciilyrics.substring(i, i + 6).equals("<br />")) {
                asciinumbers = asciinumbers + "0-";
            }
            if (i + 1 < asciilyrics.length() && asciilyrics.charAt(i) == '&' && asciilyrics.charAt(i + 1) == '#') {
                if (i + 4 < asciilyrics.length() && asciilyrics.charAt(i + 4) == ';') {
                    asciinumbers = asciinumbers + asciilyrics.charAt(i + 2) + asciilyrics.charAt(i + 3);
                    if (i + 5 < asciilyrics.length()) {
                        asciinumbers = asciinumbers + "-";
                    }
                }
                if (i + 5 < asciilyrics.length() && asciilyrics.charAt(i + 5) == ';') {
                    asciinumbers = asciinumbers + asciilyrics.charAt(i + 2) + asciilyrics.charAt(i + 3) + asciilyrics.charAt(i + 4);
                    if (i + 6 < asciilyrics.length()) {
                        asciinumbers = asciinumbers + "-";
                    }
                }
            }
        }
        String asciiarray[] = asciinumbers.split("-");
        int[] asciiint = new int[asciiarray.length];
        String finallyrics = "";

        for (int i = 0; i < asciiint.length; i++) {
            asciiint[i] = Integer.parseInt(asciiarray[i]);
            if (asciiint[i] == 0) {
                finallyrics = finallyrics + "\n";
            } else {
                finallyrics = finallyrics + (char) asciiint[i];
            }
        }
        return finallyrics;
    }

//Code for getting String from URL
    public String getStringFromURL(String url) {
        try {            
            URL u = new URL(url);
            String reader;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(u.openStream()))) {
                String inputLine;
                reader = "";
                while ((inputLine = in.readLine()) != null) {
                    reader = reader + "\n" + inputLine;
                }
            }
            return reader;            
        } catch (Exception e) {            
            return "";
        }
    }
}
