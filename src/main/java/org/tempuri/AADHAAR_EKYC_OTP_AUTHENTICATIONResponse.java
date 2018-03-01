/**
 * AADHAAR_EKYC_OTP_AUTHENTICATIONResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AADHAAR_EKYC_OTP_AUTHENTICATIONResponse  implements java.io.Serializable {
    private org.tempuri.AADHAAR_EKYC_OTP_AUTHENTICATIONResponseAADHAAR_EKYC_OTP_AUTHENTICATIONResult AADHAAR_EKYC_OTP_AUTHENTICATIONResult;

    public AADHAAR_EKYC_OTP_AUTHENTICATIONResponse() {
    }

    public AADHAAR_EKYC_OTP_AUTHENTICATIONResponse(
           org.tempuri.AADHAAR_EKYC_OTP_AUTHENTICATIONResponseAADHAAR_EKYC_OTP_AUTHENTICATIONResult AADHAAR_EKYC_OTP_AUTHENTICATIONResult) {
           this.AADHAAR_EKYC_OTP_AUTHENTICATIONResult = AADHAAR_EKYC_OTP_AUTHENTICATIONResult;
    }


    /**
     * Gets the AADHAAR_EKYC_OTP_AUTHENTICATIONResult value for this AADHAAR_EKYC_OTP_AUTHENTICATIONResponse.
     * 
     * @return AADHAAR_EKYC_OTP_AUTHENTICATIONResult
     */
    public org.tempuri.AADHAAR_EKYC_OTP_AUTHENTICATIONResponseAADHAAR_EKYC_OTP_AUTHENTICATIONResult getAADHAAR_EKYC_OTP_AUTHENTICATIONResult() {
        return AADHAAR_EKYC_OTP_AUTHENTICATIONResult;
    }


    /**
     * Sets the AADHAAR_EKYC_OTP_AUTHENTICATIONResult value for this AADHAAR_EKYC_OTP_AUTHENTICATIONResponse.
     * 
     * @param AADHAAR_EKYC_OTP_AUTHENTICATIONResult
     */
    public void setAADHAAR_EKYC_OTP_AUTHENTICATIONResult(org.tempuri.AADHAAR_EKYC_OTP_AUTHENTICATIONResponseAADHAAR_EKYC_OTP_AUTHENTICATIONResult AADHAAR_EKYC_OTP_AUTHENTICATIONResult) {
        this.AADHAAR_EKYC_OTP_AUTHENTICATIONResult = AADHAAR_EKYC_OTP_AUTHENTICATIONResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AADHAAR_EKYC_OTP_AUTHENTICATIONResponse)) return false;
        AADHAAR_EKYC_OTP_AUTHENTICATIONResponse other = (AADHAAR_EKYC_OTP_AUTHENTICATIONResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AADHAAR_EKYC_OTP_AUTHENTICATIONResult==null && other.getAADHAAR_EKYC_OTP_AUTHENTICATIONResult()==null) || 
             (this.AADHAAR_EKYC_OTP_AUTHENTICATIONResult!=null &&
              this.AADHAAR_EKYC_OTP_AUTHENTICATIONResult.equals(other.getAADHAAR_EKYC_OTP_AUTHENTICATIONResult())));
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
        if (getAADHAAR_EKYC_OTP_AUTHENTICATIONResult() != null) {
            _hashCode += getAADHAAR_EKYC_OTP_AUTHENTICATIONResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AADHAAR_EKYC_OTP_AUTHENTICATIONResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AADHAAR_EKYC_OTP_AUTHENTICATIONResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AADHAAR_EKYC_OTP_AUTHENTICATIONResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AADHAAR_EKYC_OTP_AUTHENTICATIONResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>AADHAAR_EKYC_OTP_AUTHENTICATIONResponse>AADHAAR_EKYC_OTP_AUTHENTICATIONResult"));
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
