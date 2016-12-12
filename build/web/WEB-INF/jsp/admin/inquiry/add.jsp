<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Add Inquiry</h1>
<form:form modelAttribute="Inquiry" action="${SITE_URL}/admin/inquiry/save" method="post" role="form">
    <div class="form-group">
        <label>PID</label>
           
        <select name="pid">     
            <option value="None">---Select---</option>
             <c:forEach items="${pid}" var="p">
                 
                 <option value="${p.pid}">${p.pid}</option>
             </c:forEach>
         </select>
    </div>
    
    <div class="form-group">
        <label>UID</label>
          
        <select name="uid">     
            <option value="None">---Select---</option>
             <c:forEach items="${uid}" var="u">
                 
                 <option value="${u.uid}">${u.uid}</option>
             </c:forEach>
         </select>
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
