<%@page import="com.gasmeters.portlet.service.persistence.AvailablePersistence"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="com.gasmeters.portlet.model.Available"%>
<%@ page import="com.gasmeters.portlet.service.AvailableLocalServiceUtil"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

This is the <b>Available Meters</b> portlet in View mode.

<liferay-ui:search-container emptyResultsMessage="There are no meters to display">
    <liferay-ui:search-container-results
        results="<%= AvailableLocalServiceUtil.getMeters() %>"
        total="<%= AvailableLocalServiceUtil.getMetersCount() %>"
    />
    
    <%
    String redirect = PortalUtil.getCurrentURL(renderRequest);
	%>
	
	<aui:button-row>
	    <portlet:renderURL var="addAvailableURL">
	        <portlet:param name="mvcPath" value="/html/availablemeters/edit_available.jsp" />
	        <portlet:param name="redirect" value="<%= redirect %>" />
	    </portlet:renderURL>
	
	    <aui:button onClick="<%= addAvailableURL.toString() %>" value="Add Meter" />
	</aui:button-row>
    
    
   	<liferay-ui:search-container-row
        className="com.gasmeters.portlet.model.Available"
        keyProperty="serialNums"
        modelVar="available" escapedModel="<%= true %>"
    >

    <liferay-ui:search-container-column-text
            name="Serial Numbers"
            value="<%= String.valueOf(available.getSerialNums()) %>"
    />
       
    <liferay-ui:search-container-column-jsp
    align="right"
    path="/html/availablemeters/available_actions.jsp"
	/>
    </liferay-ui:search-container-row>
   	

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
