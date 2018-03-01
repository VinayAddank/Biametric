/**
 * AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse  implements java.io.Serializable {
    private org.tempuri.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponseAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult;

    public AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse() {
    }

    public AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse(
           org.tempuri.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponseAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult) {
           this.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult = AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult;
    }


    /**
     * Gets the AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult value for this AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse.
     * 
     * @return AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult
     */
    public org.tempuri.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponseAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult getAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult() {
        return AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult;
    }


    /**
     * Sets the AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult value for this AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse.
     * 
     * @param AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult
     */
    public void setAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult(org.tempuri.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponseAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult) {
        this.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult = AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse)) return false;
        AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse other = (AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult==null && other.getAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult()==null) || 
             (this.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult!=null &&
              this.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult.equals(other.getAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult() != null) {
            _hashCode += getAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponse>AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
