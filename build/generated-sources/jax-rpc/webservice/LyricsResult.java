// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;


public class LyricsResult {
    protected java.lang.String artist;
    protected java.lang.String song;
    protected java.lang.String lyrics;
    protected java.lang.String url;
    
    public LyricsResult() {
    }
    
    public LyricsResult(java.lang.String artist, java.lang.String song, java.lang.String lyrics, java.lang.String url) {
        this.artist = artist;
        this.song = song;
        this.lyrics = lyrics;
        this.url = url;
    }
    
    public java.lang.String getArtist() {
        return artist;
    }
    
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }
    
    public java.lang.String getSong() {
        return song;
    }
    
    public void setSong(java.lang.String song) {
        this.song = song;
    }
    
    public java.lang.String getLyrics() {
        return lyrics;
    }
    
    public void setLyrics(java.lang.String lyrics) {
        this.lyrics = lyrics;
    }
    
    public java.lang.String getUrl() {
        return url;
    }
    
    public void setUrl(java.lang.String url) {
        this.url = url;
    }
}