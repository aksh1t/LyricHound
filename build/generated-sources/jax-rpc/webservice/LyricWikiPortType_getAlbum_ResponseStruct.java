// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;


public class LyricWikiPortType_getAlbum_ResponseStruct {
    protected java.lang.String artist;
    protected java.lang.String album;
    protected int year;
    protected java.lang.String amazonLink;
    protected java.lang.String imgUrl;
    protected java.lang.String url;
    protected java.lang.String[] songs;
    
    public LyricWikiPortType_getAlbum_ResponseStruct() {
    }
    
    public LyricWikiPortType_getAlbum_ResponseStruct(java.lang.String artist, java.lang.String album, int year, java.lang.String amazonLink, java.lang.String imgUrl, java.lang.String url, java.lang.String[] songs) {
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.amazonLink = amazonLink;
        this.imgUrl = imgUrl;
        this.url = url;
        this.songs = songs;
    }
    
    public java.lang.String getArtist() {
        return artist;
    }
    
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }
    
    public java.lang.String getAlbum() {
        return album;
    }
    
    public void setAlbum(java.lang.String album) {
        this.album = album;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public java.lang.String getAmazonLink() {
        return amazonLink;
    }
    
    public void setAmazonLink(java.lang.String amazonLink) {
        this.amazonLink = amazonLink;
    }
    
    public java.lang.String getImgUrl() {
        return imgUrl;
    }
    
    public void setImgUrl(java.lang.String imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    public java.lang.String getUrl() {
        return url;
    }
    
    public void setUrl(java.lang.String url) {
        this.url = url;
    }
    
    public java.lang.String[] getSongs() {
        return songs;
    }
    
    public void setSongs(java.lang.String[] songs) {
        this.songs = songs;
    }
}
