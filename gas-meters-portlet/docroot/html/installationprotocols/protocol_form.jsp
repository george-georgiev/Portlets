<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%@ page import="com.gasmeters.portlet.model.Installed"%>
<%@ page import="com.gasmeters.portlet.service.InstalledLocalServiceUtil"%>
<%@ page import="com.gasmeters.portlet.service.AvailableLocalServiceUtil"%>
<%@ page import="com.gasmeters.portlet.model.Available"%>
<%@ page import="java.util.List"%>
<%@ page import="com.gasmeters.portlet.InstallationProtocolsPortlet"%>

 <%
 	Installed installed = null;
    String redirect = ParamUtil.getString(request, "redirect");
 %>
 

 <portlet:renderURL var="viewInstalledURL" />
 <portlet:actionURL name="addMeter" var="addMeterURL" windowState="normal" />
 
 <liferay-ui:header
    backURL="<%= viewInstalledURL %>"
    title="New Meter"
 />
 <aui:form action="<%= addMeterURL.toString() %>" method="POST" name="fm">
	 <aui:select label="Serial Number" name="serialNums"> 
	 
	 <%
	 	List<Available> available = AvailableLocalServiceUtil.getMeters();
	 	for(Available meter : available){
	 %>
	 
	 
	 <aui:option selected="<%= true %>" value="<%= String.valueOf(meter.getSerialNums()) %>">
	 <%= String.valueOf(meter.getSerialNums()) %>
	 </aui:option> 
	 
	 <%
	 	}
	 %>
	
	  </aui:select>
	  <aui:fieldset >

	   	<aui:input name="currInd"  label="Current Indication" />
	   	<aui:input name="date"  label="Date: MM/DD/YYYY" >
	   		<aui:validator name="date" />
	   		<aui:validator name="custom" errorMessage="Invalid date!">
	   			function(value, fieldNode, ruleValue) { 
	   				var date = new Date(Date.parse(value,"MM/DD/YYYY"));
	   				var today = new Date();
	   				return (date <= today); 
	   			}
	   		</aui:validator>
		</aui:input>
	  </aui:fieldset>
	  
	  <aui:button-row>
        <aui:button type="submit" name = "Save" />

        <aui:button onClick="<%= viewInstalledURL %>"  type="cancel" name = "Cancel"/>
    </aui:button-row>
</aui:form>