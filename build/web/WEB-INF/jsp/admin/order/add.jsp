<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Add Order</h1>
<form:form modelAttribute="Order" action="${SITE_URL}/admin/order/save" method="post" role="form">
      
    <div class="form-group">
        <label> UID</label>
        <select name="uid">
            <option value="None">---Select---</option>
            <c:forEach items="${uid}" var="u">
                <option value="${u.uid}">${u.uid}</option>
            </c:forEach>           
        </select>
    </div>
    
     <div class="form-group">
        <label> Order Date</label>
        <form:input path="order_date" type="date" placeholder="Enter Order Date" required="required" class="form-control"/>
    </div>
   
     <div class="form-group">
         <label>Status </label>
         <form:input path="status" placeholder="Enter Status" required="required" class="form-control"/>
     </div>
    
   <form:hidden path="oid"/>
    <div class="form-group"> 
    <button type="submit" class="btn btn-success" >Save</button>
    </div>
</form:form>
