<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Add Product</h1>
<form:form modelAttribute="Product" action="${SITE_URL}/admin/product/save" method="post" role="form">
    <div class="form-group">
        <label> Name</label>
        <form:input path="name" placeholder="Enter Name" required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Image</label>
        <form:input path="image" type="file" placeholder="Enter Image" required="required" />
    </div>
    
    <div class="form-group">
        <label>Description</label>
        <form:input path="description" placeholder="Enter Description" required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Added_Date</label>
        <form:input path="added_date" type="date" placeholder="Enter AddedDate" required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>CatId</label>
          <select name="catid">
             <option value="none">---Select---</option>
             <c:forEach items="${catid}" var="c">
                 <option value="${c.catid}">${c.catid}</option>
             </c:forEach>
         </select>
    </div>
     
    <div class="form-group">
        
        <label>Status </label>
        <form:input path="status" placeholder="Enter Status" required="required" class="form-control"/>
     </div>
    
   <form:hidden path="pid"/>
    <div class="form-group"> 
    <button type="submit" class="btn btn-success" >Save</button>
    </div>
</form:form>
