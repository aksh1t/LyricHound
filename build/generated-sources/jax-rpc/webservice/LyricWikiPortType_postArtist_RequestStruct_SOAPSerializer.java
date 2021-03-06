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

public class LyricWikiPortType_postArtist_RequestStruct_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_overwriteIfExists_QNAME = new QName("", "overwriteIfExists");
    private static final javax.xml.namespace.QName ns2_boolean_TYPE_QNAME = SchemaConstants.QNAME_TYPE_BOOLEAN;
    private CombinedSerializer ns2_myns2__boolean__boolean_Boolean_Serializer;
    private static final javax.xml.namespace.QName ns1_artist_QNAME = new QName("", "artist");
    private static final javax.xml.namespace.QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns2_myns2_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_albums_QNAME = new QName("", "albums");
    private static final javax.xml.namespace.QName ns3_AlbumDataArray_TYPE_QNAME = new QName("urn:LyricWiki", "AlbumDataArray");
    private CombinedSerializer ns3_myns3_AlbumDataArray__AlbumDataArray_SOAPSerializer1;
    private static final int myOVERWRITEIFEXISTS_INDEX = 0;
    private static final int myARTIST_INDEX = 1;
    private static final int myALBUMS_INDEX = 2;
    
    public LyricWikiPortType_postArtist_RequestStruct_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns2_myns2__boolean__boolean_Boolean_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, boolean.class, ns2_boolean_TYPE_QNAME);
        ns2_myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns2_string_TYPE_QNAME);
        ns3_myns3_AlbumDataArray__AlbumDataArray_SOAPSerializer1 = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, webservice.AlbumData[].class, ns3_AlbumDataArray_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        webservice.LyricWikiPortType_postArtist_RequestStruct instance = new webservice.LyricWikiPortType_postArtist_RequestStruct();
        webservice.LyricWikiPortType_postArtist_RequestStruct_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        for (int i=0; i<3; i++) {
            elementName = reader.getName();
            if (reader.getState() == XMLReader.END) {
                break;
            }
            if (elementName.equals(ns1_overwriteIfExists_QNAME)) {
                member = ns2_myns2__boolean__boolean_Boolean_Serializer.deserialize(ns1_overwriteIfExists_QNAME, reader, context);
                instance.setOverwriteIfExists(((Boolean)member).booleanValue());
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_artist_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_artist_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new webservice.LyricWikiPortType_postArtist_RequestStruct_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myARTIST_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setArtist((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_albums_QNAME)) {
                member = ns3_myns3_AlbumDataArray__AlbumDataArray_SOAPSerializer1.deserialize(ns1_albums_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new webservice.LyricWikiPortType_postArtist_RequestStruct_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myALBUMS_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setAlbums((webservice.AlbumData[])member);
                }
                reader.nextElementContent();
                continue;
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_albums_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        webservice.LyricWikiPortType_postArtist_RequestStruct instance = (webservice.LyricWikiPortType_postArtist_RequestStruct)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        webservice.LyricWikiPortType_postArtist_RequestStruct instance = (webservice.LyricWikiPortType_postArtist_RequestStruct)obj;
        
        ns2_myns2__boolean__boolean_Boolean_Serializer.serialize(new Boolean(instance.isOverwriteIfExists()), ns1_overwriteIfExists_QNAME, null, writer, context);
        ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getArtist(), ns1_artist_QNAME, null, writer, context);
        ns3_myns3_AlbumDataArray__AlbumDataArray_SOAPSerializer1.serialize(instance.getAlbums(), ns1_albums_QNAME, null, writer, context);
    }
}
