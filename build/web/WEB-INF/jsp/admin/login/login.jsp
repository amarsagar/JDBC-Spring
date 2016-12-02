<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>LOGIN</h1>
<form action="${SITE_URL}/admin/login/save" method="post" role="form">   
    <div class="form-group">
        <label>UserName</label>
        <input name="username" placeholder="Enter UserName" required="required" class="form-control"/>
    </div>
    
     <div class="form-group">
        <label>Password</label>
        <input name="password" type="password"  placeholder="Enter Password" required="required" class="form-control"/>
    </div>
     
      
   
    <div class="form-group"> 
    <button type="submit" class="btn btn-success" >LOG In</button>
    </div>
</form>
