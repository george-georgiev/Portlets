package com.gasmeters.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.gasmeters.portlet.service.InstalledLocalService;
import com.gasmeters.portlet.service.InstalledLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class InstallationProtocolsPortlet extends MVCPortlet {
 
	public void addMeter(ActionRequest request, ActionResponse response) throws IOException{
		
		long serialNums = ParamUtil.getLong(request, "serialNums");
		long currInd = ParamUtil.getLong(request, "currInd");
		String date = ParamUtil.getString(request, "date");
		int month = (Integer.parseInt(date.substring(0, 2)))-1;
		int day = Integer.parseInt(date.substring(3, 5));
		int year = Integer.parseInt(date.substring(6, 10));
		InstalledLocalServiceUtil.addMeter(serialNums, currInd, month, day, year);
		sendRedirect(request, response);
		
	}
	
}
