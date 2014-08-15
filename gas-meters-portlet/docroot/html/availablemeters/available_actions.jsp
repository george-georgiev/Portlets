<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="com.gasmeters.portlet.model.Available"%>

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request
            .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Available available = (Available) row.getObject();

    long serialNums = available.getSerialNums();
    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>

<portlet:actionURL name="deleteMeter" var="deleteURL">
        <portlet:param name="serialNums" value="<%= String.valueOf(serialNums) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
    
</liferay-ui:icon-menu>
