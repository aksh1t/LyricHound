// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class LyricWikiPortType_getSongResult_ResponseStruct_SOAPBuilder implements SOAPInstanceBuilder {
    private webservice.LyricWikiPortType_getSongResult_ResponseStruct _instance;
    private webservice.LyricsResult songResult;
    private static final int mySONGRESULT_INDEX = 0;
    
    public LyricWikiPortType_getSongResult_ResponseStruct_SOAPBuilder() {
    }
    
    public void setSongResult(webservice.LyricsResult songResult) {
        this.songResult = songResult;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case mySONGRESULT_INDEX:
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
                case mySONGRESULT_INDEX:
                    _instance.setSongResult((webservice.LyricsResult)memberValue);
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
        _instance = (webservice.LyricWikiPortType_getSongResult_ResponseStruct)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
