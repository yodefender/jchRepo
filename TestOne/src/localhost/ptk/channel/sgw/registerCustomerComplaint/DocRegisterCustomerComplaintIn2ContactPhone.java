/**
 * DocRegisterCustomerComplaintIn2ContactPhone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ptk.channel.sgw.registerCustomerComplaint;

public class DocRegisterCustomerComplaintIn2ContactPhone  implements java.io.Serializable {
    private java.lang.String phoneNumber;

    private java.lang.String areaCode;

    public DocRegisterCustomerComplaintIn2ContactPhone() {
    }

    public DocRegisterCustomerComplaintIn2ContactPhone(
           java.lang.String phoneNumber,
           java.lang.String areaCode) {
           this.phoneNumber = phoneNumber;
           this.areaCode = areaCode;
    }


    /**
     * Gets the phoneNumber value for this DocRegisterCustomerComplaintIn2ContactPhone.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this DocRegisterCustomerComplaintIn2ContactPhone.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the areaCode value for this DocRegisterCustomerComplaintIn2ContactPhone.
     * 
     * @return areaCode
     */
    public java.lang.String getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this DocRegisterCustomerComplaintIn2ContactPhone.
     * 
     * @param areaCode
     */
    public void setAreaCode(java.lang.String areaCode) {
        this.areaCode = areaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocRegisterCustomerComplaintIn2ContactPhone)) return false;
        DocRegisterCustomerComplaintIn2ContactPhone other = (DocRegisterCustomerComplaintIn2ContactPhone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.areaCode==null && other.getAreaCode()==null) || 
             (this.areaCode!=null &&
              this.areaCode.equals(other.getAreaCode())));
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getAreaCode() != null) {
            _hashCode += getAreaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocRegisterCustomerComplaintIn2ContactPhone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/ptk/channel/sgw/registerCustomerComplaint", ">docRegisterCustomerComplaintIn2>contactPhone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "areaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
