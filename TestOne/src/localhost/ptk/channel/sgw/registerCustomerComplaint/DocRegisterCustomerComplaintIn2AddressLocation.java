/**
 * DocRegisterCustomerComplaintIn2AddressLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ptk.channel.sgw.registerCustomerComplaint;

public class DocRegisterCustomerComplaintIn2AddressLocation  implements java.io.Serializable {
    private java.lang.String coordinateX;

    private java.lang.String coordinateY;

    public DocRegisterCustomerComplaintIn2AddressLocation() {
    }

    public DocRegisterCustomerComplaintIn2AddressLocation(
           java.lang.String coordinateX,
           java.lang.String coordinateY) {
           this.coordinateX = coordinateX;
           this.coordinateY = coordinateY;
    }


    /**
     * Gets the coordinateX value for this DocRegisterCustomerComplaintIn2AddressLocation.
     * 
     * @return coordinateX
     */
    public java.lang.String getCoordinateX() {
        return coordinateX;
    }


    /**
     * Sets the coordinateX value for this DocRegisterCustomerComplaintIn2AddressLocation.
     * 
     * @param coordinateX
     */
    public void setCoordinateX(java.lang.String coordinateX) {
        this.coordinateX = coordinateX;
    }


    /**
     * Gets the coordinateY value for this DocRegisterCustomerComplaintIn2AddressLocation.
     * 
     * @return coordinateY
     */
    public java.lang.String getCoordinateY() {
        return coordinateY;
    }


    /**
     * Sets the coordinateY value for this DocRegisterCustomerComplaintIn2AddressLocation.
     * 
     * @param coordinateY
     */
    public void setCoordinateY(java.lang.String coordinateY) {
        this.coordinateY = coordinateY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocRegisterCustomerComplaintIn2AddressLocation)) return false;
        DocRegisterCustomerComplaintIn2AddressLocation other = (DocRegisterCustomerComplaintIn2AddressLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coordinateX==null && other.getCoordinateX()==null) || 
             (this.coordinateX!=null &&
              this.coordinateX.equals(other.getCoordinateX()))) &&
            ((this.coordinateY==null && other.getCoordinateY()==null) || 
             (this.coordinateY!=null &&
              this.coordinateY.equals(other.getCoordinateY())));
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
        if (getCoordinateX() != null) {
            _hashCode += getCoordinateX().hashCode();
        }
        if (getCoordinateY() != null) {
            _hashCode += getCoordinateY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocRegisterCustomerComplaintIn2AddressLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/ptk/channel/sgw/registerCustomerComplaint", ">>docRegisterCustomerComplaintIn2>address>location"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinateX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordinateX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinateY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordinateY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
