// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;


public class LyricWikiPortType_postSong_RequestStruct {
    protected boolean overwriteIfExists;
    protected java.lang.String artist;
    protected java.lang.String song;
    protected java.lang.String lyrics;
    protected java.lang.String language;
    protected webservice.AlbumResult[] onAlbums;
    
    public LyricWikiPortType_postSong_RequestStruct() {
    }
    
    public LyricWikiPortType_postSong_RequestStruct(boolean overwriteIfExists, java.lang.String artist, java.lang.String song, java.lang.String lyrics, java.lang.String language, webservice.AlbumResult[] onAlbums) {
        this.overwriteIfExists = overwriteIfExists;
        this.artist = artist;
        this.song = song;
        this.lyrics = lyrics;
        this.language = language;
        this.onAlbums = onAlbums;
    }
    
    public boolean isOverwriteIfExists() {
        return overwriteIfExists;
    }
    
    public void setOverwriteIfExists(boolean overwriteIfExists) {
        this.overwriteIfExists = overwriteIfExists;
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
    
    public java.lang.String getLanguage() {
        return language;
    }
    
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }
    
    public webservice.AlbumResult[] getOnAlbums() {
        return onAlbums;
    }
    
    public void setOnAlbums(webservice.AlbumResult[] onAlbums) {
        this.onAlbums = onAlbums;
    }
}