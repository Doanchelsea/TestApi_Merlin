
package com.example.testapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {

    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("facebookId")
    @Expose
    private String facebookId;
    @SerializedName("googlePlusId")
    @Expose
    private String googlePlusId;
    @SerializedName("identityCardNumber")
    @Expose
    private String identityCardNumber;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("stateCode")
    @Expose
    private Integer stateCode;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("companyId")
    @Expose
    private String companyId;
    @SerializedName("birthDay")
    @Expose
    private Integer birthDay;
    @SerializedName("createdDate")
    @Expose
    private Integer createdDate;
    @SerializedName("lastModifiedDate")
    @Expose
    private Integer lastModifiedDate;
    @SerializedName("sex")
    @Expose
    private Integer sex;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("assigneeVehicleId")
    @Expose
    private String assigneeVehicleId;
    @SerializedName("agencyStatus")
    @Expose
    private Integer agencyStatus;
    @SerializedName("commissionRate")
    @Expose
    private Integer commissionRate;
    @SerializedName("totalDeposits")
    @Expose
    private Integer totalDeposits;
    @SerializedName("reasonCode")
    @Expose
    private Integer reasonCode;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("currentGeoPoint")
    @Expose
    private CurrentGeoPoint currentGeoPoint;
    @SerializedName("currentLongitude")
    @Expose
    private Double currentLongitude;
    @SerializedName("currentLatitude")
    @Expose
    private Double currentLatitude;
    @SerializedName("lockType")
    @Expose
    private Integer lockType;
    @SerializedName("lockToTime")
    @Expose
    private Integer lockToTime;
    @SerializedName("lastLogin")
    @Expose
    private Integer lastLogin;
    @SerializedName("notifyOption")
    @Expose
    private Integer notifyOption;
    @SerializedName("userType")
    @Expose
    private Integer userType;
    @SerializedName("userStatus")
    @Expose
    private Integer userStatus;
    @SerializedName("verifyStatus")
    @Expose
    private Integer verifyStatus;
    @SerializedName("taxCompanyName")
    @Expose
    private String taxCompanyName;
    @SerializedName("taxCompanyAddress")
    @Expose
    private String taxCompanyAddress;
    @SerializedName("taxCompanyTaxNumber")
    @Expose
    private String taxCompanyTaxNumber;
    @SerializedName("driverOnOff")
    @Expose
    private Integer driverOnOff;
    @SerializedName("driverType")
    @Expose
    private Integer driverType;
    @SerializedName("updateUser")
    @Expose
    private String updateUser;
    @SerializedName("updateUserFullName")
    @Expose
    private String updateUserFullName;
    @SerializedName("updatedDate")
    @Expose
    private Integer updatedDate;
    @SerializedName("reputation")
    @Expose
    private Double reputation;
    @SerializedName("isHasPassword")
    @Expose
    private Boolean isHasPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getGooglePlusId() {
        return googlePlusId;
    }

    public void setGooglePlusId(String googlePlusId) {
        this.googlePlusId = googlePlusId;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStateCode() {
        return stateCode;
    }

    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Integer lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAssigneeVehicleId() {
        return assigneeVehicleId;
    }

    public void setAssigneeVehicleId(String assigneeVehicleId) {
        this.assigneeVehicleId = assigneeVehicleId;
    }

    public Integer getAgencyStatus() {
        return agencyStatus;
    }

    public void setAgencyStatus(Integer agencyStatus) {
        this.agencyStatus = agencyStatus;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getTotalDeposits() {
        return totalDeposits;
    }

    public void setTotalDeposits(Integer totalDeposits) {
        this.totalDeposits = totalDeposits;
    }

    public Integer getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CurrentGeoPoint getCurrentGeoPoint() {
        return currentGeoPoint;
    }

    public void setCurrentGeoPoint(CurrentGeoPoint currentGeoPoint) {
        this.currentGeoPoint = currentGeoPoint;
    }

    public Double getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentLongitude(Double currentLongitude) {
        this.currentLongitude = currentLongitude;
    }

    public Double getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(Double currentLatitude) {
        this.currentLatitude = currentLatitude;
    }

    public Integer getLockType() {
        return lockType;
    }

    public void setLockType(Integer lockType) {
        this.lockType = lockType;
    }

    public Integer getLockToTime() {
        return lockToTime;
    }

    public void setLockToTime(Integer lockToTime) {
        this.lockToTime = lockToTime;
    }

    public Integer getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getNotifyOption() {
        return notifyOption;
    }

    public void setNotifyOption(Integer notifyOption) {
        this.notifyOption = notifyOption;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getTaxCompanyName() {
        return taxCompanyName;
    }

    public void setTaxCompanyName(String taxCompanyName) {
        this.taxCompanyName = taxCompanyName;
    }

    public String getTaxCompanyAddress() {
        return taxCompanyAddress;
    }

    public void setTaxCompanyAddress(String taxCompanyAddress) {
        this.taxCompanyAddress = taxCompanyAddress;
    }

    public String getTaxCompanyTaxNumber() {
        return taxCompanyTaxNumber;
    }

    public void setTaxCompanyTaxNumber(String taxCompanyTaxNumber) {
        this.taxCompanyTaxNumber = taxCompanyTaxNumber;
    }

    public Integer getDriverOnOff() {
        return driverOnOff;
    }

    public void setDriverOnOff(Integer driverOnOff) {
        this.driverOnOff = driverOnOff;
    }

    public Integer getDriverType() {
        return driverType;
    }

    public void setDriverType(Integer driverType) {
        this.driverType = driverType;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUserFullName() {
        return updateUserFullName;
    }

    public void setUpdateUserFullName(String updateUserFullName) {
        this.updateUserFullName = updateUserFullName;
    }

    public Integer getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Integer updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Double getReputation() {
        return reputation;
    }

    public void setReputation(Double reputation) {
        this.reputation = reputation;
    }

    public Boolean getIsHasPassword() {
        return isHasPassword;
    }

    public void setIsHasPassword(Boolean isHasPassword) {
        this.isHasPassword = isHasPassword;
    }

}
