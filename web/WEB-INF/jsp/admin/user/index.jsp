<%@include file="../header.jsp" %>
<h1>User</h1>
        <div class="pull-right">
                <p>
                <a href="${SITE_URL}/admin/user/add" class="btn btn-primary" title="Add User"/>
                <span class="glyphicon glyphicon-plus"></span>
                </a>
                </p>
        </div>
<table class="table table-bordered table-hover table-striped">
            <tr>
                <td>ID</td>
                <td>FirstName</td>
                <td>LastName</td>
                <td>UserName</td>
                <td>Password</td>
                <td>Email</td>
                <td>Phone</td>
                <td>Address</td>
                <td>Role_Id</td>
                <td>Action</td>
                      
            </tr>
            <c:forEach var="user" items="${User}">
                <tr>
                <td>${user.uid}</td>
                <td>${user.firstname}</td>
                <td>${user.lastname}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td>${user.address}</td>
                <td>${user.role_id}</td>
                
                <td>
                    <a href="${SITE_URL}/admin/user/edit/${user.uid}" class="btn btn-success" title="Edit User"/>
                    <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                     <a href="${SITE_URL}/admin/user/delete/${user.uid}" class="btn btn-danger" title="Delete User" onclick="return confirm('Are you sure to delete')"/>
                    <span class="glyphicon glyphicon-trash"></span>
                    </a
                </td>
                </tr>
                
                
            </c:forEach>
            
        </table>
  <%@include  file="../footer.jsp" %>