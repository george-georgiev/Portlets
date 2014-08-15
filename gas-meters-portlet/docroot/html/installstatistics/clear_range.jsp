<%@page import="com.gasmeters.portlet.service.persistence.InstalledPersistence"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="com.gasmeters.portlet.model.Installed"%>
<%@ page import="com.gasmeters.portlet.service.InstalledLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>


<portlet:renderURL var="viewStatisticsURL" />
<portlet:actionURL name="clearRange" var="editRangeURL" windowState="normal" />

<liferay-ui:header
    title="Range will be cleared!"
/>

<aui:form action="<%= editRangeURL.toString() %>" method="POST" name="fm" >
    <aui:fieldset>
    
    	<aui:input name="nullFlag" type="hidden" value="1"/>
    	
    </aui:fieldset>
    
    <aui:button-row>
        <aui:button type="submit" name = "Clear" value = "Clear"/>

        <aui:button onClick="<%= viewStatisticsURL %>"  type="cancel" name = "Cancel"/>
    </aui:button-row>
</aui:form>