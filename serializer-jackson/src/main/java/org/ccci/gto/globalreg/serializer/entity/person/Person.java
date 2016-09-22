
package org.ccci.gto.globalreg.serializer.entity.person;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "account_number",
    "active_status",
    "birth_day",
    "birth_month",
    "cru_employee",
    "date_joined_staff",
    "first_name",
    "dept_code",
    "funding_source",
    "gender",
    "hr_status_code",
    "is_staff",
    "job_code",
    "job_descr",
    "lake_hart_mail_code",
    "last_name",
    "location_code",
    "location_work",
    "marital_status",
    "middle_name",
    "ministry_code",
    "ministry_descr",
    "name_address_edit_flag",
    "original_hire_date",
    "paygroup",
    "preferred_name",
    "sub_ministry_code",
    "sub_ministry_descr",
    "suffix",
    "supervisor_emplid",
    "title",
    "address",
    "email_address",
    "phone_number",
    "dept_descr",
    "client_integration_id"
})
public class Person {

    @JsonProperty("id")
    private String id;
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("active_status")
    private String activeStatus;
    @JsonProperty("birth_day")
    private Integer birthDay;
    @JsonProperty("birth_month")
    private Integer birthMonth;
    @JsonProperty("cru_employee")
    private Boolean cruEmployee;
    @JsonProperty("date_joined_staff")
    private String dateJoinedStaff;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("dept_code")
    private String deptCode;
    @JsonProperty("funding_source")
    private String fundingSource;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("hr_status_code")
    private String hrStatusCode;
    @JsonProperty("is_staff")
    private Boolean isStaff;
    @JsonProperty("job_code")
    private String jobCode;
    @JsonProperty("job_descr")
    private String jobDescr;
    @JsonProperty("lake_hart_mail_code")
    private String lakeHartMailCode;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("location_code")
    private String locationCode;
    @JsonProperty("location_work")
    private String locationWork;
    @JsonProperty("marital_status")
    private String maritalStatus;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("ministry_code")
    private String ministryCode;
    @JsonProperty("ministry_descr")
    private String ministryDescr;
    @JsonProperty("name_address_edit_flag")
    private String nameAddressEditFlag;
    @JsonProperty("original_hire_date")
    private String originalHireDate;
    @JsonProperty("paygroup")
    private String paygroup;
    @JsonProperty("preferred_name")
    private String preferredName;
    @JsonProperty("sub_ministry_code")
    private String subMinistryCode;
    @JsonProperty("sub_ministry_descr")
    private String subMinistryDescr;
    @JsonProperty("suffix")
    private String suffix;
    @JsonProperty("supervisor_emplid")
    private String supervisorEmplid;
    @JsonProperty("title")
    private String title;
    @JsonProperty("address")
    private List<Address> address = new ArrayList<Address>();
    @JsonProperty("email_address")
    private List<EmailAddress> emailAddress = new ArrayList<EmailAddress>();
    @JsonProperty("phone_number")
    private List<PhoneNumber> phoneNumber = new ArrayList<PhoneNumber>();
    @JsonProperty("dept_descr")
    private String deptDescr;
    @JsonProperty("client_integration_id")
    private String clientIntegrationId;

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The accountNumber
     */
    @JsonProperty("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 
     * @param accountNumber
     *     The account_number
     */
    @JsonProperty("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 
     * @return
     *     The activeStatus
     */
    @JsonProperty("active_status")
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * 
     * @param activeStatus
     *     The active_status
     */
    @JsonProperty("active_status")
    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    /**
     * 
     * @return
     *     The birthDay
     */
    @JsonProperty("birth_day")
    public Integer getBirthDay() {
        return birthDay;
    }

    /**
     * 
     * @param birthDay
     *     The birth_day
     */
    @JsonProperty("birth_day")
    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * 
     * @return
     *     The birthMonth
     */
    @JsonProperty("birth_month")
    public Integer getBirthMonth() {
        return birthMonth;
    }

    /**
     * 
     * @param birthMonth
     *     The birth_month
     */
    @JsonProperty("birth_month")
    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * 
     * @return
     *     The cruEmployee
     */
    @JsonProperty("cru_employee")
    public Boolean getCruEmployee() {
        return cruEmployee;
    }

    /**
     * 
     * @param cruEmployee
     *     The cru_employee
     */
    @JsonProperty("cru_employee")
    public void setCruEmployee(Boolean cruEmployee) {
        this.cruEmployee = cruEmployee;
    }

    /**
     * 
     * @return
     *     The dateJoinedStaff
     */
    @JsonProperty("date_joined_staff")
    public String getDateJoinedStaff() {
        return dateJoinedStaff;
    }

    /**
     * 
     * @param dateJoinedStaff
     *     The date_joined_staff
     */
    @JsonProperty("date_joined_staff")
    public void setDateJoinedStaff(String dateJoinedStaff) {
        this.dateJoinedStaff = dateJoinedStaff;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The deptCode
     */
    @JsonProperty("dept_code")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 
     * @param deptCode
     *     The dept_code
     */
    @JsonProperty("dept_code")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * 
     * @return
     *     The fundingSource
     */
    @JsonProperty("funding_source")
    public String getFundingSource() {
        return fundingSource;
    }

    /**
     * 
     * @param fundingSource
     *     The funding_source
     */
    @JsonProperty("funding_source")
    public void setFundingSource(String fundingSource) {
        this.fundingSource = fundingSource;
    }

    /**
     * 
     * @return
     *     The gender
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The hrStatusCode
     */
    @JsonProperty("hr_status_code")
    public String getHrStatusCode() {
        return hrStatusCode;
    }

    /**
     * 
     * @param hrStatusCode
     *     The hr_status_code
     */
    @JsonProperty("hr_status_code")
    public void setHrStatusCode(String hrStatusCode) {
        this.hrStatusCode = hrStatusCode;
    }

    /**
     * 
     * @return
     *     The isStaff
     */
    @JsonProperty("is_staff")
    public Boolean getIsStaff() {
        return isStaff;
    }

    /**
     * 
     * @param isStaff
     *     The is_staff
     */
    @JsonProperty("is_staff")
    public void setIsStaff(Boolean isStaff) {
        this.isStaff = isStaff;
    }

    /**
     * 
     * @return
     *     The jobCode
     */
    @JsonProperty("job_code")
    public String getJobCode() {
        return jobCode;
    }

    /**
     * 
     * @param jobCode
     *     The job_code
     */
    @JsonProperty("job_code")
    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    /**
     * 
     * @return
     *     The jobDescr
     */
    @JsonProperty("job_descr")
    public String getJobDescr() {
        return jobDescr;
    }

    /**
     * 
     * @param jobDescr
     *     The job_descr
     */
    @JsonProperty("job_descr")
    public void setJobDescr(String jobDescr) {
        this.jobDescr = jobDescr;
    }

    /**
     * 
     * @return
     *     The lakeHartMailCode
     */
    @JsonProperty("lake_hart_mail_code")
    public String getLakeHartMailCode() {
        return lakeHartMailCode;
    }

    /**
     * 
     * @param lakeHartMailCode
     *     The lake_hart_mail_code
     */
    @JsonProperty("lake_hart_mail_code")
    public void setLakeHartMailCode(String lakeHartMailCode) {
        this.lakeHartMailCode = lakeHartMailCode;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The locationCode
     */
    @JsonProperty("location_code")
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * 
     * @param locationCode
     *     The location_code
     */
    @JsonProperty("location_code")
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * 
     * @return
     *     The locationWork
     */
    @JsonProperty("location_work")
    public String getLocationWork() {
        return locationWork;
    }

    /**
     * 
     * @param locationWork
     *     The location_work
     */
    @JsonProperty("location_work")
    public void setLocationWork(String locationWork) {
        this.locationWork = locationWork;
    }

    /**
     * 
     * @return
     *     The maritalStatus
     */
    @JsonProperty("marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 
     * @param maritalStatus
     *     The marital_status
     */
    @JsonProperty("marital_status")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * 
     * @return
     *     The middleName
     */
    @JsonProperty("middle_name")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * 
     * @param middleName
     *     The middle_name
     */
    @JsonProperty("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * 
     * @return
     *     The ministryCode
     */
    @JsonProperty("ministry_code")
    public String getMinistryCode() {
        return ministryCode;
    }

    /**
     * 
     * @param ministryCode
     *     The ministry_code
     */
    @JsonProperty("ministry_code")
    public void setMinistryCode(String ministryCode) {
        this.ministryCode = ministryCode;
    }

    /**
     * 
     * @return
     *     The ministryDescr
     */
    @JsonProperty("ministry_descr")
    public String getMinistryDescr() {
        return ministryDescr;
    }

    /**
     * 
     * @param ministryDescr
     *     The ministry_descr
     */
    @JsonProperty("ministry_descr")
    public void setMinistryDescr(String ministryDescr) {
        this.ministryDescr = ministryDescr;
    }

    /**
     * 
     * @return
     *     The nameAddressEditFlag
     */
    @JsonProperty("name_address_edit_flag")
    public String getNameAddressEditFlag() {
        return nameAddressEditFlag;
    }

    /**
     * 
     * @param nameAddressEditFlag
     *     The name_address_edit_flag
     */
    @JsonProperty("name_address_edit_flag")
    public void setNameAddressEditFlag(String nameAddressEditFlag) {
        this.nameAddressEditFlag = nameAddressEditFlag;
    }

    /**
     * 
     * @return
     *     The originalHireDate
     */
    @JsonProperty("original_hire_date")
    public String getOriginalHireDate() {
        return originalHireDate;
    }

    /**
     * 
     * @param originalHireDate
     *     The original_hire_date
     */
    @JsonProperty("original_hire_date")
    public void setOriginalHireDate(String originalHireDate) {
        this.originalHireDate = originalHireDate;
    }

    /**
     * 
     * @return
     *     The paygroup
     */
    @JsonProperty("paygroup")
    public String getPaygroup() {
        return paygroup;
    }

    /**
     * 
     * @param paygroup
     *     The paygroup
     */
    @JsonProperty("paygroup")
    public void setPaygroup(String paygroup) {
        this.paygroup = paygroup;
    }

    /**
     * 
     * @return
     *     The preferredName
     */
    @JsonProperty("preferred_name")
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * 
     * @param preferredName
     *     The preferred_name
     */
    @JsonProperty("preferred_name")
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    /**
     * 
     * @return
     *     The subMinistryCode
     */
    @JsonProperty("sub_ministry_code")
    public String getSubMinistryCode() {
        return subMinistryCode;
    }

    /**
     * 
     * @param subMinistryCode
     *     The sub_ministry_code
     */
    @JsonProperty("sub_ministry_code")
    public void setSubMinistryCode(String subMinistryCode) {
        this.subMinistryCode = subMinistryCode;
    }

    /**
     * 
     * @return
     *     The subMinistryDescr
     */
    @JsonProperty("sub_ministry_descr")
    public String getSubMinistryDescr() {
        return subMinistryDescr;
    }

    /**
     * 
     * @param subMinistryDescr
     *     The sub_ministry_descr
     */
    @JsonProperty("sub_ministry_descr")
    public void setSubMinistryDescr(String subMinistryDescr) {
        this.subMinistryDescr = subMinistryDescr;
    }

    /**
     * 
     * @return
     *     The suffix
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * 
     * @param suffix
     *     The suffix
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * 
     * @return
     *     The supervisorEmplid
     */
    @JsonProperty("supervisor_emplid")
    public String getSupervisorEmplid() {
        return supervisorEmplid;
    }

    /**
     * 
     * @param supervisorEmplid
     *     The supervisor_emplid
     */
    @JsonProperty("supervisor_emplid")
    public void setSupervisorEmplid(String supervisorEmplid) {
        this.supervisorEmplid = supervisorEmplid;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The emailAddress
     */
    @JsonProperty("email_address")
    public List<EmailAddress> getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress
     *     The email_address
     */
    @JsonProperty("email_address")
    public void setEmailAddress(List<EmailAddress> emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * 
     * @return
     *     The phoneNumber
     */
    @JsonProperty("phone_number")
    public List<PhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     * @param phoneNumber
     *     The phone_number
     */
    @JsonProperty("phone_number")
    public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     * @return
     *     The deptDescr
     */
    @JsonProperty("dept_descr")
    public String getDeptDescr() {
        return deptDescr;
    }

    /**
     * 
     * @param deptDescr
     *     The dept_descr
     */
    @JsonProperty("dept_descr")
    public void setDeptDescr(String deptDescr) {
        this.deptDescr = deptDescr;
    }

    /**
     * 
     * @return
     *     The clientIntegrationId
     */
    @JsonProperty("client_integration_id")
    public String getClientIntegrationId() {
        return clientIntegrationId;
    }

    /**
     * 
     * @param clientIntegrationId
     *     The client_integration_id
     */
    @JsonProperty("client_integration_id")
    public void setClientIntegrationId(String clientIntegrationId) {
        this.clientIntegrationId = clientIntegrationId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(accountNumber).append(activeStatus).append(birthDay).append(birthMonth).append(cruEmployee).append(dateJoinedStaff).append(firstName).append(deptCode).append(fundingSource).append(gender).append(hrStatusCode).append(isStaff).append(jobCode).append(jobDescr).append(lakeHartMailCode).append(lastName).append(locationCode).append(locationWork).append(maritalStatus).append(middleName).append(ministryCode).append(ministryDescr).append(nameAddressEditFlag).append(originalHireDate).append(paygroup).append(preferredName).append(subMinistryCode).append(subMinistryDescr).append(suffix).append(supervisorEmplid).append(title).append(address).append(emailAddress).append(phoneNumber).append(deptDescr).append(clientIntegrationId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Person) == false) {
            return false;
        }
        Person rhs = ((Person) other);
        return new EqualsBuilder().append(id, rhs.id).append(accountNumber, rhs.accountNumber).append(activeStatus, rhs.activeStatus).append(birthDay, rhs.birthDay).append(birthMonth, rhs.birthMonth).append(cruEmployee, rhs.cruEmployee).append(dateJoinedStaff, rhs.dateJoinedStaff).append(firstName, rhs.firstName).append(deptCode, rhs.deptCode).append(fundingSource, rhs.fundingSource).append(gender, rhs.gender).append(hrStatusCode, rhs.hrStatusCode).append(isStaff, rhs.isStaff).append(jobCode, rhs.jobCode).append(jobDescr, rhs.jobDescr).append(lakeHartMailCode, rhs.lakeHartMailCode).append(lastName, rhs.lastName).append(locationCode, rhs.locationCode).append(locationWork, rhs.locationWork).append(maritalStatus, rhs.maritalStatus).append(middleName, rhs.middleName).append(ministryCode, rhs.ministryCode).append(ministryDescr, rhs.ministryDescr).append(nameAddressEditFlag, rhs.nameAddressEditFlag).append(originalHireDate, rhs.originalHireDate).append(paygroup, rhs.paygroup).append(preferredName, rhs.preferredName).append(subMinistryCode, rhs.subMinistryCode).append(subMinistryDescr, rhs.subMinistryDescr).append(suffix, rhs.suffix).append(supervisorEmplid, rhs.supervisorEmplid).append(title, rhs.title).append(address, rhs.address).append(emailAddress, rhs.emailAddress).append(phoneNumber, rhs.phoneNumber).append(deptDescr, rhs.deptDescr).append(clientIntegrationId, rhs.clientIntegrationId).isEquals();
    }

}