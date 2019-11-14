package com.sanz.workbench.model;

import java.io.Serializable;

public class MeEmployees implements Serializable {
    private Long id;

    private Long departmentId;

    private String roleId;

    private Long arearId;

    private String loginId;

    private String password;

    private String name;

    private String qq;

    private String email;

    private Long sex;

    private String duty;

    private String mobile;

    private String phone;

    private String fax;

    private String belongRole;

    private Integer isloginenabled;

    private Long userState;

    private Long orderno;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public Long getArearId() {
        return arearId;
    }

    public void setArearId(Long arearId) {
        this.arearId = arearId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getBelongRole() {
        return belongRole;
    }

    public void setBelongRole(String belongRole) {
        this.belongRole = belongRole == null ? null : belongRole.trim();
    }

    public Integer getIsloginenabled() {
        return isloginenabled;
    }

    public void setIsloginenabled(Integer isloginenabled) {
        this.isloginenabled = isloginenabled;
    }

    public Long getUserState() {
        return userState;
    }

    public void setUserState(Long userState) {
        this.userState = userState;
    }

    public Long getOrderno() {
        return orderno;
    }

    public void setOrderno(Long orderno) {
        this.orderno = orderno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", roleId=").append(roleId);
        sb.append(", arearId=").append(arearId);
        sb.append(", loginId=").append(loginId);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", qq=").append(qq);
        sb.append(", email=").append(email);
        sb.append(", sex=").append(sex);
        sb.append(", duty=").append(duty);
        sb.append(", mobile=").append(mobile);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", belongRole=").append(belongRole);
        sb.append(", isloginenabled=").append(isloginenabled);
        sb.append(", userState=").append(userState);
        sb.append(", orderno=").append(orderno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}