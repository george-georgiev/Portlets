<%@page import="com.gasmeters.portlet.service.persistence.InstalledPersistence"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="com.gasmeters.portlet.model.Installed"%>
<%@ page import="com.gasmeters.portlet.service.InstalledLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.gasmeters.portlet.InstallStatisticsPortlet"%>

 
<portlet:renderURL var="viewStatisticsURL" />
<portlet:actionURL name="addRange" var="editRangeURL" windowState="normal" />

<liferay-ui:header
    title="Add Range"
/>

<aui:form action="<%= editRangeURL.toString() %>" method="POST" name="fm" >
    <aui:fieldset>
    
    	<aui:input name="startDay" label="Day"/>
    	<aui:input name="startMonth"  label="Month" />
    	<aui:input name="startYear"  label="Year" />
    	
    	<aui:input name="endDay" label="Day"/>
    	<aui:input name="endMonth"  label="Month" />
    	<aui:input name="endYear"  label="Year" />
    	
    	<aui:input name="nullFlag" type="hidden" value="0"/>
    </aui:fieldset>
    
    <aui:button-row>
        <aui:button type="submit" name = "Save" />

        <aui:button onClick="<%= viewStatisticsURL %>"  type="cancel" name = "Cancel"/>
    </aui:button-row>
</aui:form>