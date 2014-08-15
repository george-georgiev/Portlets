package com.gasmeters.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class InstallStatisticsPortlet extends MVCPortlet {
	
	public static String start, end, startDay, startMonth, startYear, endDay, endMonth, endYear;
	public static int nullFlag = 1;
	
	public void addRange(ActionRequest request, ActionResponse response) throws IOException{
		
		startDay = ParamUtil.getString(request, "startDay");
		if(startDay.length()==1) startDay= "0" + startDay;
		startMonth = ParamUtil.getString(request, "startMonth");
		if(startMonth.length()==1) startMonth= "0" + startMonth;
		startYear = ParamUtil.getString(request, "startYear");
		start = startYear + startMonth + startDay;
		
		endDay = ParamUtil.getString(request, "endDay");
		if(endDay.length()==1) endDay= "0" + endDay;
		endMonth = ParamUtil.getString(request, "endMonth");
		if(endMonth.length()==1) endMonth= "0" + endMonth;
		endYear = ParamUtil.getString(request, "endYear");
		end = endYear + endMonth + endDay;
		
		nullFlag = ParamUtil.getInteger(request, "nullFlag");
		
		sendRedirect(request, response);

	}
	
	public void clearRange(ActionRequest request, ActionResponse response) throws IOException{
		
		nullFlag = ParamUtil.getInteger(request, "nullFlag");
		sendRedirect(request, response);
		
	}

	public static String start(){
		
		if(nullFlag==0)	return start;
		else return null;
		
	}
	

	public static String end(){
		
		if(nullFlag==0)	return end;
		else return null;
		
	}
	
}
