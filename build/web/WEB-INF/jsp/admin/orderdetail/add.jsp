<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Add OrderDetail</h1>
<form:form modelAttribute="OrderDetail" action="${SITE_URL}/admin/orderdetail/save" method="post" role="form">
      
    <div class="form-group">
        <label> PID</label>
        <select name="pid">     
            <option value="None">---Select---</option>
             <c:forEach items="${pid}" var="p">
                 
                 <option value="${p.pid}">${p.pid}</option>
             </c:forEach>
         </select>
    </div>
    
     <div class="form-group">
        <label> Price</label>
        <form:input path="price"  placeholder="Enter Price" required="required" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>OID</label>
        <select name="oid">     
            <option value="None">---Select---</option>
             <c:forEach items="${oid}" var="o">
                 
                 <option value="${o.oid}">${o.oid}</option>
             </c:forEach>
         </select>
    </div>
    
    <div class="form-group">
        <label>Quantity</label>
        <form:input path="quantity"  placeholder="Enter Quantity" required="required" class="form-control"/>
    </div>
    
    
   <form:hidden path="odid"/>
    <div class="form-group"> 
    <button type="submit" class="btn btn-success" >Save</button>
    </div>
</form:form>
