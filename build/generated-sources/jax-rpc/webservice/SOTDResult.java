// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;


public class SOTDResult {
    protected java.lang.String artist;
    protected java.lang.String song;
    protected java.lang.String nominatedBy;
    protected java.lang.String reason;
    protected java.lang.String lyrics;
    
    public SOTDResult() {
    }
    
    public SOTDResult(java.lang.String artist, java.lang.String song, java.lang.String nominatedBy, java.lang.String reason, java.lang.String lyrics) {
        this.artist = artist;
        this.song = song;
        this.nominatedBy = nominatedBy;
        this.reason = reason;
        this.lyrics = lyrics;
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
    
    public java.lang.String getNominatedBy() {
        return nominatedBy;
    }
    
    public void setNominatedBy(java.lang.String nominatedBy) {
        this.nominatedBy = nominatedBy;
    }
    
    public java.lang.String getReason() {
        return reason;
    }
    
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }
    
    public java.lang.String getLyrics() {
        return lyrics;
    }
    
    public void setLyrics(java.lang.String lyrics) {
        this.lyrics = lyrics;
    }
}