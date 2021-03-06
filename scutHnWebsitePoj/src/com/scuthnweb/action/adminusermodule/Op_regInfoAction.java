package com.scuthnweb.action.adminusermodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.Admin;
import com.scuthnweb.domain.Customer;
import com.scuthnweb.service.interf.AdminUserModule;

public class Op_regInfoAction extends ActionSupport{
	
	private AdminUserModule adminUserModule;
    
	private int accept;
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		Admin ad = (Admin)ctx.getSession().get("admin");
		Customer cs = (Customer)ctx.getSession().get("regCustomer");
		boolean _accept = accept==0?true:false;
	    if(this.adminUserModule.op_regInfo(ad, cs, _accept))
	    	 return SUCCESS;
	    else return ERROR;
	}

	public AdminUserModule getAdminUserModule() {
		return adminUserModule;
	}

	public void setAdminUserModule(AdminUserModule adminUserModule) {
		this.adminUserModule = adminUserModule;
	}

	public int getAccept() {
		return accept;
	}

	public void setAccept(int accept) {
		this.accept = accept;
	}
	
	
}
