<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Add Inquiry</h1>
<form:form modelAttribute="Inquiry" action="${SITE_URL}/admin/inquiry/save" method="post" role="form">
    <div class="form-group">
        <label>PID</label>
        <form:input path="pid" placeholder="Enter PID" required="required" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>UID</label>
        <form:input path="uid" placeholder="Enter UID" required="required" class="form-control"/>
    </div>
   
    <div class="form-group">
        <label>InquiryDate</label>
        <form:input path="inquiry_date" type="date" placeholder="Enter InquiryDate" required="required" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>Inquiry</label>
        <form:input path="inquiry" placeholder="Enter Inquiry" required="required" class="form-control"/>
    </div>
    
    
     <div class="form-group">
        <label>Status </label>
         <form:input path="status" placeholder="Enter Status" required="required" class="form-control"/>
       
    </div>
    
   <form:hidden path="inqid"/>
    <div class="form-group"> 
    <button type="submit" class="btn btn-success" >Save</button>
    </div>
</form:form>
