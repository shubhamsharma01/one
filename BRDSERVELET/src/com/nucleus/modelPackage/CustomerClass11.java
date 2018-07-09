package com.nucleus.modelPackage;

/*Customer class file to initialize  it's variables and 
to get and set their values by getter and setter method
*/
public class CustomerClass11 {
	//Initializing variables
	private long custId;
	private String customerCode;
	private String customerName;
	private String customerAddress1;
	private String customerAddresss2;
	private String customerPinCode;
	private String emailAddress;
	private String contactNumber;
	private String primaryContactPerson;
	private String recordStatus;
	private String activeInactiveFlag;
	private String createDate;
	private String createBy;
	private String modifiedDate;
	private String modifiedBy;
	private String authorizedDate;
	private String authorizedBy;
	//Getter methods to Get CustomerId
	public long getCustId() {
		return custId;
	}

	//Setter methods to Set ContactId
	public void setCustId(long custId) {
		this.custId = custId;
	}
	//Getter methods to Get CustomeCode
	public String getCustomerCode() {
		return customerCode;
	}
	//Setter methods to Set ContactCode
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	//Getter methods to Get CustomerName
	public String getCustomerName() {
		return customerName;
	}
	//Setter methods to Set ContactName
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	//Getter methods to Get CustomerAddress1
	public String getCustomerAddress1() {
		return customerAddress1;
	}
	//Setter methods to Set ContactAddress1
	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}
	//Getter methods to Get CustomerAddress2
	public String getCustomerAddresss2() {
		return customerAddresss2;
	}
	//Setter methods to Set ContactAddress2
	public void setCustomerAddresss2(String customerAddresss2) {
		this.customerAddresss2 = customerAddresss2;
	}
	//Getter methods to Get CustomerPinCode
	public String getCustomerPinCode() {
		return customerPinCode;
	}
	//Setter methods to Set ContactPinCode
	public void setCustomerPinCode(String customerPinCode) {
		this.customerPinCode = customerPinCode;
	}
	//Getter methods to Get CustomerEmail
	public String getEmailAddress() {
		return emailAddress;
	}
	//Setter methods to Set CustomerEmail
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	//Getter methods to Get CustomerContactNumber
	public String getContactNumber() {
		return contactNumber;
	}
	//Setter methods to Set ContactNumber
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	//Getter methods to Get PrimaryContactPerson
	public String getPrimaryContactPerson() {
		return primaryContactPerson;
	}
	//Setter methods to Set PrimaryContactPerson
	public void setPrimaryContactPerson(String primaryContactPerson) {
		this.primaryContactPerson = primaryContactPerson;
	}
	//Getter methods to Get RecordStatus
	public String getRecordStatus() {
		return recordStatus;
	}
	//Setter methods to Set RecordStatus
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	//Getter methods to Get Active/InactiveFlag
	public String getActiveInactiveFlag() {
		return activeInactiveFlag;
	}
	//Setter methods to Set Active/InactiveFlag
	public void setActiveInactiveFlag(String activeInactiveFlag) {
		this.activeInactiveFlag = activeInactiveFlag;
	}
	//Getter methods to Get CreateDate
	public String getCreateDate() {
		return createDate;
	}
	//Setter methods to Set CreateDate
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	//Getter methods to Get CreatedBy
	public String getCreateBy() {
		return createBy;
	}
	//Setter methods to Set CreateBy
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	//Getter methods to Get ModifiedDate
	public String getModifiedDate() {
		return modifiedDate;
	}
	//Setter methods to Set ModifiedDate
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	//Getter methods to Get ModifiedBy
	public String getModifiedBy() {
		return modifiedBy;
	}
	//Setter methods to Set ModifiedBy
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	//Getter methods to GetAuthorizedDate 
	public String getAuthorizedDate() {
		return authorizedDate;
	}
	//Setter methods to Set AuthorizedDate
	public void setAuthorizedDate(String authorizedDate) {
		this.authorizedDate = authorizedDate;
	}
	//Getter methods to Get AuthorizedBy
	public String getAuthorizedBy() {
		return authorizedBy;
	}
	//Setter methods to Set AuthorizedBy
	public void setAuthorizedBy(String authorizedBy) {

		this.authorizedBy = authorizedBy;
	}

		
	//Parameterized constructor 
	public CustomerClass11(long id, String customerCode2,

			String customerName2, String customerAddress12,
			String customerAddresss22, String customerPinCode2,
			String emailAddress2, String contactNumber2,
			String primaryContactPerson2, String recordStatus2,
			String activeInactiveFlag2, String createDate2, String createBy2,
			String modifiedDate2, String modifiedBy2, String authorizedDate2,
			String authorizedBy2) {
		
		this.custId=id ;
		this.customerCode = customerCode2;
		this.customerName = customerName2;
		this.customerAddress1 = customerAddress12;
		this.customerAddresss2 = customerAddresss22;
		this.customerPinCode = customerPinCode2;
		this.emailAddress = emailAddress2;
		this.contactNumber = contactNumber2;
		this.primaryContactPerson = primaryContactPerson2;
		this.recordStatus = recordStatus2;
		this.activeInactiveFlag = activeInactiveFlag2;
		this.createDate = createDate2;
		this.createBy = createBy2;
		this.modifiedDate = modifiedDate2;
		this.modifiedBy = modifiedBy2;
		this.authorizedDate = authorizedDate2;
		this.authorizedBy = authorizedBy2;
		
	}
	
	
	//To string method
	@Override
	
	public String toString() {

		return "CustomerClass11 [custId=" + custId + ", customerCode="
				+ customerCode + ", customerName=" + customerName
				+ ", customerAddress1=" + customerAddress1
				+ ", customerAddresss2=" + customerAddresss2
				+ ", customerPinCode=" + customerPinCode + ", emailAddress="
				+ emailAddress + ", contactNumber=" + contactNumber
				+ ", primaryContactPerson=" + primaryContactPerson
				+ ", recordStatus=" + recordStatus + ", activeInactiveFlag="
				+ activeInactiveFlag + ", createDate=" + createDate
				+ ", createBy=" + createBy + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + ", authorizedDate="
				+ authorizedDate + ", authorizedBy=" + authorizedBy + "]";
	}

	

}
