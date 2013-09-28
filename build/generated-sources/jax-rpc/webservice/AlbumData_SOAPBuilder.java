// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class AlbumData_SOAPBuilder implements SOAPInstanceBuilder {
    private webservice.AlbumData _instance;
    private java.lang.String album;
    private int year;
    private java.lang.String amazonLink;
    private java.lang.String imgUrl;
    private java.lang.String url;
    private java.lang.String[] songs;
    private static final int myALBUM_INDEX = 0;
    private static final int myYEAR_INDEX = 1;
    private static final int myAMAZONLINK_INDEX = 2;
    private static final int myIMGURL_INDEX = 3;
    private static final int myURL_INDEX = 4;
    private static final int mySONGS_INDEX = 5;
    
    public AlbumData_SOAPBuilder() {
    }
    
    public void setAlbum(java.lang.String album) {
        this.album = album;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setAmazonLink(java.lang.String amazonLink) {
        this.amazonLink = amazonLink;
    }
    
    public void setImgUrl(java.lang.String imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    public void setUrl(java.lang.String url) {
        this.url = url;
    }
    
    public void setSongs(java.lang.String[] songs) {
        this.songs = songs;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myALBUM_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myAMAZONLINK_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myIMGURL_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myURL_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case mySONGS_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case myALBUM_INDEX:
                    _instance.setAlbum((java.lang.String)memberValue);
                    break;
                case myAMAZONLINK_INDEX:
                    _instance.setAmazonLink((java.lang.String)memberValue);
                    break;
                case myIMGURL_INDEX:
                    _instance.setImgUrl((java.lang.String)memberValue);
                    break;
                case myURL_INDEX:
                    _instance.setUrl((java.lang.String)memberValue);
                    break;
                case mySONGS_INDEX:
                    _instance.setSongs((java.lang.String[])memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (webservice.AlbumData)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
