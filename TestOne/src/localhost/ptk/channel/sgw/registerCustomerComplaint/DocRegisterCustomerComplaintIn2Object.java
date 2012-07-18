/**
 * DocRegisterCustomerComplaintIn2Object.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ptk.channel.sgw.registerCustomerComplaint;

public class DocRegisterCustomerComplaintIn2Object  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String accountId;

    private java.lang.String contractId;

    private java.lang.String customerId;

    private java.lang.String accountCode;

    private java.lang.String operator;

    private java.lang.String designationNumber;

    private java.lang.String groupId;

    private java.lang.String personId;

    private java.lang.String loyaltyCardNumber;

    private java.lang.String auxContractId;

    public DocRegisterCustomerComplaintIn2Object() {
    }

    public DocRegisterCustomerComplaintIn2Object(
           java.lang.String msisdn,
           java.lang.String accountId,
           java.lang.String contractId,
           java.lang.String customerId,
           java.lang.String accountCode,
           java.lang.String operator,
           java.lang.String designationNumber,
           java.lang.String groupId,
           java.lang.String personId,
           java.lang.String loyaltyCardNumber,
           java.lang.String auxContractId) {
           this.msisdn = msisdn;
           this.accountId = accountId;
           this.contractId = contractId;
           this.customerId = customerId;
           this.accountCode = accountCode;
           this.operator = operator;
           this.designationNumber = designationNumber;
           this.groupId = groupId;
           this.personId = personId;
           this.loyaltyCardNumber = loyaltyCardNumber;
           this.auxContractId = auxContractId;
    }


    /**
     * Gets the msisdn value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the accountId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the contractId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return contractId
     */
    public java.lang.String getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param contractId
     */
    public void setContractId(java.lang.String contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the customerId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the accountCode value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return accountCode
     */
    public java.lang.String getAccountCode() {
        return accountCode;
    }


    /**
     * Sets the accountCode value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param accountCode
     */
    public void setAccountCode(java.lang.String accountCode) {
        this.accountCode = accountCode;
    }


    /**
     * Gets the operator value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the designationNumber value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return designationNumber
     */
    public java.lang.String getDesignationNumber() {
        return designationNumber;
    }


    /**
     * Sets the designationNumber value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param designationNumber
     */
    public void setDesignationNumber(java.lang.String designationNumber) {
        this.designationNumber = designationNumber;
    }


    /**
     * Gets the groupId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return groupId
     */
    public java.lang.String getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the personId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return personId
     */
    public java.lang.String getPersonId() {
        return personId;
    }


    /**
     * Sets the personId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param personId
     */
    public void setPersonId(java.lang.String personId) {
        this.personId = personId;
    }


    /**
     * Gets the loyaltyCardNumber value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return loyaltyCardNumber
     */
    public java.lang.String getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }


    /**
     * Sets the loyaltyCardNumber value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param loyaltyCardNumber
     */
    public void setLoyaltyCardNumber(java.lang.String loyaltyCardNumber) {
        this.loyaltyCardNumber = loyaltyCardNumber;
    }


    /**
     * Gets the auxContractId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @return auxContractId
     */
    public java.lang.String getAuxContractId() {
        return auxContractId;
    }


    /**
     * Sets the auxContractId value for this DocRegisterCustomerComplaintIn2Object.
     * 
     * @param auxContractId
     */
    public void setAuxContractId(java.lang.String auxContractId) {
        this.auxContractId = auxContractId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocRegisterCustomerComplaintIn2Object)) return false;
        DocRegisterCustomerComplaintIn2Object other = (DocRegisterCustomerComplaintIn2Object) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.contractId==null && other.getContractId()==null) || 
             (this.contractId!=null &&
              this.contractId.equals(other.getContractId()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.accountCode==null && other.getAccountCode()==null) || 
             (this.accountCode!=null &&
              this.accountCode.equals(other.getAccountCode()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.designationNumber==null && other.getDesignationNumber()==null) || 
             (this.designationNumber!=null &&
              this.designationNumber.equals(other.getDesignationNumber()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.personId==null && other.getPersonId()==null) || 
             (this.personId!=null &&
              this.personId.equals(other.getPersonId()))) &&
            ((this.loyaltyCardNumber==null && other.getLoyaltyCardNumber()==null) || 
             (this.loyaltyCardNumber!=null &&
              this.loyaltyCardNumber.equals(other.getLoyaltyCardNumber()))) &&
            ((this.auxContractId==null && other.getAuxContractId()==null) || 
             (this.auxContractId!=null &&
              this.auxContractId.equals(other.getAuxContractId())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getContractId() != null) {
            _hashCode += getContractId().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getAccountCode() != null) {
            _hashCode += getAccountCode().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getDesignationNumber() != null) {
            _hashCode += getDesignationNumber().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getPersonId() != null) {
            _hashCode += getPersonId().hashCode();
        }
        if (getLoyaltyCardNumber() != null) {
            _hashCode += getLoyaltyCardNumber().hashCode();
        }
        if (getAuxContractId() != null) {
            _hashCode += getAuxContractId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocRegisterCustomerComplaintIn2Object.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/ptk/channel/sgw/registerCustomerComplaint", ">docRegisterCustomerComplaintIn2>object"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loyaltyCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loyaltyCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxContractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auxContractId"));
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
