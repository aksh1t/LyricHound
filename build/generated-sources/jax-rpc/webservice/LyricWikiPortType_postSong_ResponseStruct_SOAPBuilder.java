// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class LyricWikiPortType_postSong_ResponseStruct_SOAPBuilder implements SOAPInstanceBuilder {
    private webservice.LyricWikiPortType_postSong_ResponseStruct _instance;
    private java.lang.String artist;
    private java.lang.String song;
    private boolean dataUsed;
    private java.lang.String message;
    private static final int myARTIST_INDEX = 0;
    private static final int mySONG_INDEX = 1;
    private static final int myDATAUSED_INDEX = 2;
    private static final int myMESSAGE_INDEX = 3;
    
    public LyricWikiPortType_postSong_ResponseStruct_SOAPBuilder() {
    }
    
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }
    
    public void setSong(java.lang.String song) {
        this.song = song;
    }
    
    public void setDataUsed(boolean dataUsed) {
        this.dataUsed = dataUsed;
    }
    
    public void setMessage(java.lang.String message) {
        this.message = message;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myARTIST_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case mySONG_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myMESSAGE_INDEX:
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
                case myARTIST_INDEX:
                    _instance.setArtist((java.lang.String)memberValue);
                    break;
                case mySONG_INDEX:
                    _instance.setSong((java.lang.String)memberValue);
                    break;
                case myMESSAGE_INDEX:
                    _instance.setMessage((java.lang.String)memberValue);
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
        _instance = (webservice.LyricWikiPortType_postSong_ResponseStruct)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
