package com.scuthnweb.action.needmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.BaseCustomer;
import com.scuthnweb.domain.Need;
import com.scuthnweb.service.interf.NeedModule;

public class AcceptNeedAction extends ActionSupport{
    
	private NeedModule needModule;	
    private ActionContext ctx;
	
    public String execute(){
    	ctx = ActionContext.getContext();
    	Need need = (Need)ctx.getSession().get("need");
    	BaseCustomer bs =  (BaseCustomer)ctx.getSession().get("customer");
    	if(bs==null)
    		bs = (BaseCustomer)ctx.getSession().get("admin");
    	if(this.needModule.acceptNeed(need, bs))
    		return SUCCESS;
    	return ERROR;
    }

	public NeedModule getNeedModule() {
		return needModule;
	}

	public void setNeedModule(NeedModule needModule) {
		this.needModule = needModule;
	}

	public ActionContext getCtx() {
		return ctx;
	}

	public void setCtx(ActionContext ctx) {
		this.ctx = ctx;
	}
}
