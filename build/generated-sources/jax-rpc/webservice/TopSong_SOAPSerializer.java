// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class TopSong_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_rank_QNAME = new QName("", "rank");
    private static final javax.xml.namespace.QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns2_myns2__int__int_Int_Serializer;
    private static final javax.xml.namespace.QName ns1_artist_QNAME = new QName("", "artist");
    private static final javax.xml.namespace.QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns2_myns2_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_song_QNAME = new QName("", "song");
    private static final javax.xml.namespace.QName ns1_image_QNAME = new QName("", "image");
    private static final javax.xml.namespace.QName ns1_itunes_QNAME = new QName("", "itunes");
    private static final javax.xml.namespace.QName ns1_url_QNAME = new QName("", "url");
    private static final int myRANK_INDEX = 0;
    private static final int myARTIST_INDEX = 1;
    private static final int mySONG_INDEX = 2;
    private static final int myIMAGE_INDEX = 3;
    private static final int myITUNES_INDEX = 4;
    private static final int myURL_INDEX = 5;
    
    public TopSong_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns2_myns2__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, int.class, ns2_int_TYPE_QNAME);
        ns2_myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns2_string_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        webservice.TopSong instance = new webservice.TopSong();
        webservice.TopSong_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        for (int i=0; i<6; i++) {
            elementName = reader.getName();
            if (reader.getState() == XMLReader.END) {
                break;
            }
            if (elementName.equals(ns1_rank_QNAME)) {
                member = ns2_myns2__int__int_Int_Serializer.deserialize(ns1_rank_QNAME, reader, context);
                instance.setRank(((java.lang.Integer)member).intValue());
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_artist_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_artist_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new webservice.TopSong_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myARTIST_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setArtist((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_song_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_song_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new webservice.TopSong_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, mySONG_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setSong((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_image_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_image_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new webservice.TopSong_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myIMAGE_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setImage((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_itunes_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_itunes_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new webservice.TopSong_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myITUNES_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setItunes((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_url_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_url_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new webservice.TopSong_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myURL_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setUrl((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_url_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        webservice.TopSong instance = (webservice.TopSong)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        webservice.TopSong instance = (webservice.TopSong)obj;
        
        ns2_myns2__int__int_Int_Serializer.serialize(new java.lang.Integer(instance.getRank()), ns1_rank_QNAME, null, writer, context);
        ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getArtist(), ns1_artist_QNAME, null, writer, context);
        ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getSong(), ns1_song_QNAME, null, writer, context);
        ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getImage(), ns1_image_QNAME, null, writer, context);
        ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getItunes(), ns1_itunes_QNAME, null, writer, context);
        ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getUrl(), ns1_url_QNAME, null, writer, context);
    }
}
