package com.gasmeters.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;




import com.gasmeters.portlet.model.Available;
import com.gasmeters.portlet.service.AvailableLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AvailableMetersPortlet
 */
public class AvailableMetersPortlet extends MVCPortlet {
 
	public void addMeter(ActionRequest request, ActionResponse response) throws SystemException, IOException{
		
		
		long serialNums = ParamUtil.getLong(request, "serialNums");		
		AvailableLocalServiceUtil.addMeter(serialNums);
		sendRedirect(request, response);
		
	}
	
	public void deleteMeter(ActionRequest request, ActionResponse response) throws NoSuchAvailableException, SystemException, IOException{
		
		long serialNums = ParamUtil.getLong(request, "serialNums");
		AvailableLocalServiceUtil.deleteMeter(serialNums);
		sendRedirect(request, response);
		
	}
	
	private static Log _log = LogFactoryUtil.getLog(AvailableMetersPortlet.class);
	
}
