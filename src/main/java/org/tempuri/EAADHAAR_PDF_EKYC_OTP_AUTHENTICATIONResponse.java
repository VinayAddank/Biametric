/**
 * EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse  implements java.io.Serializable {
    private org.tempuri.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponseEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult;

    public EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse() {
    }

    public EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse(
           org.tempuri.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponseEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult) {
           this.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult = EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult;
    }


    /**
     * Gets the EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult value for this EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse.
     * 
     * @return EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult
     */
    public org.tempuri.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponseEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult getEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult() {
        return EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult;
    }


    /**
     * Sets the EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult value for this EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse.
     * 
     * @param EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult
     */
    public void setEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult(org.tempuri.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponseEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult) {
        this.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult = EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse)) return false;
        EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse other = (EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult==null && other.getEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult()==null) || 
             (this.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult!=null &&
              this.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult.equals(other.getEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult())));
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
        if (getEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult() != null) {
            _hashCode += getEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponse>EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult"));
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
