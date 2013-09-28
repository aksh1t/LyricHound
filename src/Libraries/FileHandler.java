package Libraries;

import java.io.File;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

public class FileHandler {
    
    public Tag getMetaData(File file){
        try {
            
            //Reading audiofile from method argument
            AudioFile af = AudioFileIO.read(file);
            
            //Getting tag from audiofile
            Tag tag = af.getTag();
            
            //Return proper field
            return tag;
            
        } catch (Exception e) {
           
            //Return null in case of exception
            return null;
        }
    }

    public String getArtistTitleString(Tag tag) {
        try {
            
            //Get Artist and Title and bind in string
            String outputString = tag.getFirst(FieldKey.ARTIST);
            outputString = outputString + "•" + tag.getFirst(FieldKey.TITLE);
            
            //Return string for webparser
            return outputString;

        } catch (Exception e) {
            
            //Return null in case of exception
            return "";
            
        }
    }

    public boolean saveLyrics(File f, String lyric) {
        try {
            
            //Creating AudioFile object from input File
            AudioFile af = AudioFileIO.read(f);
            
            //Getting tag from audiofile
            Tag tag = af.getTag();
           
            //Setting Lyrics at the Lyric metadata            
            tag.setField(FieldKey.LYRICS, lyric);
            
            //Commit the audiofile
            af.commit();
            
            //Method successfully completed            
            return true;
            
        } catch (Exception e) {
            
            //Method unsuccessful
            return false;
            
        }
    }
    
    public boolean saveTag(File file, Tag tag) {
        try {
            
            //Creating AudioFile object from input File
            AudioFile af = AudioFileIO.read(file);
            
            //Setting tag to audiofile
            af.setTag(tag);
                       
            //Commit the audiofile
            af.commit();
            
            //Method successfully completed            
            return true;
            
        } catch (Exception e) {
            
            //Method unsuccessful
            return false;
            
        }
    }
}