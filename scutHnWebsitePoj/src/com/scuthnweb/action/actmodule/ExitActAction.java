package com.scuthnweb.action.actmodule;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.BaseCustomer;
import com.scuthnweb.domain.Event;
import com.scuthnweb.service.interf.ActModule;

public class ExitActAction extends ActionSupport{
     
	private ActModule actModule;
     
    public String execute(){
    	ActionContext ctx = ActionContext.getContext();
    	BaseCustomer  event_customer = (BaseCustomer)ctx.getSession().get("admin");
    	if(event_customer==null){
    		event_customer = (BaseCustomer)ctx.getSession().get("customer");
    	    if(event_customer==null) return ERROR;
    	}
    	Event evt = (Event)ctx.getSession().get("event");
    	if(!this.actModule.exitAct(evt, event_customer))
    		return ERROR;
    	return SUCCESS;
    }

	public ActModule getActModule() {
		return actModule;
	}

	public void setActModule(ActModule actModule) {
		this.actModule = actModule;
	}
    
}
