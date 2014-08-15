<%@page import="com.gasmeters.portlet.service.persistence.InstalledPersistence"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="com.gasmeters.portlet.model.Installed"%>
<%@ page import="com.gasmeters.portlet.service.InstalledLocalServiceUtil"%>
<%@ page import="com.gasmeters.portlet.InstallStatisticsPortlet"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

This is the <b>Install Statistics</b> portlet in View mode.


<%
	String start = InstallStatisticsPortlet.start();
	String end = InstallStatisticsPortlet.end();
	if(start == null && end == null){
%>

<liferay-ui:search-container emptyResultsMessage="There are no meters to display">
    <liferay-ui:search-container-results
        results="<%= InstalledLocalServiceUtil.getDistinctDate() %>"
        total="<%= InstalledLocalServiceUtil.getDistinctDateCount() %>"
    />
   
	
	<aui:button-row>
	    <portlet:renderURL var="addRangeURL">
	        <portlet:param name="mvcPath" value="/html/installstatistics/add_range.jsp" />
	    </portlet:renderURL>
	
	    <aui:button onClick="<%= addRangeURL.toString() %>" value="Add Range" />
	</aui:button-row>
	
	<aui:button-row>
	    <portlet:renderURL var="clearRangeURL">
	        <portlet:param name="mvcPath" value="/html/installstatistics/clear_range.jsp" />
	    </portlet:renderURL>
	
	    <aui:button onClick="<%= clearRangeURL.toString() %>" value="Clear Range" />
	</aui:button-row>
    
    <liferay-ui:search-container-row
        className="com.gasmeters.portlet.model.Installed"
        keyProperty="serialNums"
        modelVar="installed" escapedModel="<%= true %>"
    >

    
    <liferay-ui:search-container-column-text
            name="Date"
            value="<%= String.valueOf(installed.getDate()) %>"
    />
    
    <liferay-ui:search-container-column-text
            name="Installed Meters"
            value="<%= String.valueOf(InstalledLocalServiceUtil.getMetersCountByDate(installed.getDate())) %>"
    />
    
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<%
	}else {
%>

<liferay-ui:search-container emptyResultsMessage="There are no meters to display">
    <liferay-ui:search-container-results
        results="<%= InstalledLocalServiceUtil.getDistinctDateInRange(start, end) %>"
        total="<%= InstalledLocalServiceUtil.getDistinctDateCountInRange(start, end) %>"
    />
   
	
	<aui:button-row>
	    <portlet:renderURL var="addRangeURL">
	        <portlet:param name="mvcPath" value="/html/installstatistics/add_range.jsp" />
	    </portlet:renderURL>
	
	    <aui:button onClick="<%= addRangeURL.toString() %>" value="Add Range" />
	</aui:button-row>
	
	<aui:button-row>
	    <portlet:renderURL var="clearRangeURL">
	        <portlet:param name="mvcPath" value="/html/installstatistics/clear_range.jsp" />
	    </portlet:renderURL>
	
	    <aui:button onClick="<%= clearRangeURL.toString() %>" value="Clear Range" />
	</aui:button-row>
    
    <liferay-ui:search-container-row
        className="com.gasmeters.portlet.model.Installed"
        keyProperty="serialNums"
        modelVar="installed" escapedModel="<%= true %>"
    >

    
    <liferay-ui:search-container-column-text
            name="Date"
            value="<%= String.valueOf(installed.getDate()) %>"
    />
    
    <liferay-ui:search-container-column-text
            name="Installed Meters"
            value="<%= String.valueOf(InstalledLocalServiceUtil.getMetersCountByDate(installed.getDate())) %>"
    />
    
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<%
	}
%>