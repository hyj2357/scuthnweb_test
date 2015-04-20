package com.scuthnweb.action.useradminmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.interf.UserAdminModule;

public class UserIDRegistAction extends ActionSupport{
    
	private  UserAdminModule userAdminModule;

	private String customer_name, customer_password, customer_grade, customer_major,customer_email,customer_room; 
	private int customer_sex, customer_phone, customer_qq  ;

	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("customer",this.userAdminModule.userIDResgist(customer_name, customer_password, customer_sex, customer_grade, customer_major, customer_phone, customer_qq, customer_email, customer_room));
	    return SUCCESS;
	}

	public UserAdminModule getUserAdminModule() {
		return userAdminModule;
	}

	public void setUserAdminModule(UserAdminModule userAdminModule) {
		this.userAdminModule = userAdminModule;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	public String getCustomer_grade() {
		return customer_grade;
	}

	public void setCustomer_grade(String customer_grade) {
		this.customer_grade = customer_grade;
	}

	public String getCustomer_major() {
		return customer_major;
	}

	public void setCustomer_major(String customer_major) {
		this.customer_major = customer_major;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_room() {
		return customer_room;
	}

	public void setCustomer_room(String customer_room) {
		this.customer_room = customer_room;
	}

	public int getCustomer_sex() {
		return customer_sex;
	}

	public void setCustomer_sex(int customer_sex) {
		this.customer_sex = customer_sex;
	}

	public int getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(int customer_phone) {
		this.customer_phone = customer_phone;
	}

	public int getCustomer_qq() {
		return customer_qq;
	}

	public void setCustomer_qq(int customer_qq) {
		this.customer_qq = customer_qq;
	}
}