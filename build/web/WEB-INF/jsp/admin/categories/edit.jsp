<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Add Category</h1>
<form:form modelAttribute="Category" action="${SITE_URL}/admin/categories/save" method="post" role="form">
    <div class="form-group">
        <label> Name</label>
        <form:input path="name" placeholder="Enter Name" required="required" class="form-control"/>
    </div>
   
     <div class="form-group">
       
        <label>Status </label>
         <form:input path="status" placeholder="Enter Status" required="required" class="form-control"/>
       
    </div>
    
   <form:hidden path="catid"/>
    <div class="form-group"> 
    <button type="submit" class="btn btn-success" >Save</button>
    </div>
</form:form>
