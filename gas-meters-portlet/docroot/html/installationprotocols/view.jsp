<%@page import="com.gasmeters.portlet.service.persistence.InstalledPersistence"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="com.gasmeters.portlet.model.Installed"%>
<%@ page import="com.gasmeters.portlet.service.InstalledLocalServiceUtil"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

This is the <b>Installation Protocols</b> portlet in View mode.

<liferay-ui:search-container emptyResultsMessage="There are no meters to display">
    <liferay-ui:search-container-results
        results="<%= InstalledLocalServiceUtil.getMeters() %>"
        total="<%= InstalledLocalServiceUtil.getMetersCount() %>"
    />
    
    <%
    String redirect = PortalUtil.getCurrentURL(renderRequest);
	%>
	
	<aui:button-row>
	    <portlet:renderURL var="addInstalledURL">
	        <portlet:param name="mvcPath" value="/html/installationprotocols/protocol_form.jsp" />
	        <portlet:param name="redirect" value="<%= redirect %>" />
	    </portlet:renderURL>
	
	    <aui:button onClick="<%= addInstalledURL.toString() %>" value="Add Meter" />
	</aui:button-row>
    
    <liferay-ui:search-container-row
        className="com.gasmeters.portlet.model.Installed"
        keyProperty="serialNums"
        modelVar="installed" escapedModel="<%= true %>"
    >

    <liferay-ui:search-container-column-text
            name="Serial Numbers"
            value="<%= String.valueOf(installed.getSerialNums()) %>"
    />
    
    <liferay-ui:search-container-column-text
            name="Date"
            value="<%= String.valueOf(installed.getDate()) %>"
    />
    
    <liferay-ui:search-container-column-text
            name="Current Indication"
            value="<%= String.valueOf(installed.getCurrInd()) %>"
    />
    
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
