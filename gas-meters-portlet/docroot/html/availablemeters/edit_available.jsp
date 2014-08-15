<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%@ page import="com.gasmeters.portlet.model.Available"%>
<%@ page import="com.gasmeters.portlet.service.AvailableLocalServiceUtil"%>
<%@ page import="java.util.List"%>

 <%
 	
    String redirect = ParamUtil.getString(request, "redirect");
 %>


<portlet:renderURL var="viewAvailableURL" />
<portlet:actionURL name="addMeter" var="editAvailableURL" windowState="normal" />
	

<liferay-ui:header
    backURL="<%= viewAvailableURL %>"
    title="New Meter"
/>

<aui:form action="<%= editAvailableURL.toString() %>" method="POST" name="fm" >
    <aui:fieldset>
    
    	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
    	<aui:input name="serialNums"  label="Serial Number" >
    	<%
	 	List<Available> available = AvailableLocalServiceUtil.getMeters();
	 	for(Available meter : available){
	 	%>
    		<aui:validator name="custom" errorMessage="This meter already exists">
    			function(value, fieldNode, ruleValue) { return (value != '<%= String.valueOf(meter.getSerialNums()) %>') }
			</aui:validator>
		<%
	 	}
		%>
    	</aui:input>
    
    </aui:fieldset>
     <aui:button-row>
        <aui:button type="submit" name = "Save" />

        <aui:button onClick="<%= viewAvailableURL %>"  type="cancel" name = "Cancel"/>
    </aui:button-row>
</aui:form>


