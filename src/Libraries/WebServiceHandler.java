package Libraries;

import webservice.LyricWikiPortType;
import webservice.LyricWiki_Impl;
import webservice.LyricsResult;


public class WebServiceHandler {

    public String findLyric(String input) {
        
        //Check for empty input and return null string if input is empty
        if (input.equals("")) {
            
            return "";            
        }
       
        //Library classes object creation for web - service
        LyricWiki_Impl lyricwikiimpl = new LyricWiki_Impl();
        LyricWikiPortType port = lyricwikiimpl.getLyricWikiPort();
        LyricsResult lyricresult = null;
        WebURLParser parser = new WebURLParser();
        String lyric = "";
        
        try {
            
//METHOD 1
            //Split input for Artist and Title for web search
            String[] data = input.split("•");
            
            //Getting LyricResult object by library method
            lyricresult = port.getSong(data[0], data[1]);
            
            //Parse lyric from the URL source of LyricResult object
            lyric = parser.parseLyricWikiURL(parser.getStringFromURL(lyricresult.getUrl()));
            
            //Check for empty lyric and return output if lyric successfully obtained
            if (!lyric.equals("")) {  
                
                return lyric;               
            }
            
//METHOD 2
            //Write URL manually
            String url = "http://lyrics.wikia.com/";
            
            //Append Artist and Title of song to the URL
            url = url + data[0] + ":" + data[1];
            
            //Replace all spaces by _ 
            url = url.replace(" ", "_");
            
            //Parse lyric from the URL
            lyric = parser.parseLyricWikiURL(parser.getStringFromURL(url));
            
            //Check for empty lyric and return output if lyric successfully obtained
            if (!lyric.equals("")) {  
                System.out.println(url+"   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                return lyric;                
            }

//ADD MORE URL METHODS AND MAKE PARSERS FOR HINDI LYRICS AND ADD OTHER SITES HERE
            
//FINALLY return empty string if lyric is not found
            return "";
            
        } catch (Exception e) {

            //Empty string returned if exception occurs
            return "";
        }
    }
}
