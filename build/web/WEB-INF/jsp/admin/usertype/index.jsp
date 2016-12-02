<%@include file="../header.jsp" %>
<h1>UserType</h1>
        <div class="pull-right">
                <p>
                <a href="${SITE_URL}/admin/usertype/add" class="btn btn-primary" title="Add User"/>
                <span class="glyphicon glyphicon-plus"></span>
                </a>
                </p>
        </div>
<table class="table table-bordered table-hover table-striped">
            <tr>
                <td>ID</td>
                <td>Role</td>
                <td>Action</td>
               
                      
            </tr>
            <c:forEach var="u" items="${UserType}">
                <tr>
                <td>${u.role_id}</td>
                <td>${u.role}</td>
                
                
                
                <td>
                    <a href="${SITE_URL}/admin/usertype/edit/${u.role_id}" class="btn btn-success" title="Edit UserType"/>
                    <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                     <a href="${SITE_URL}/admin/usertype/delete/${u.role_id}" class="btn btn-danger" title="Delete UserType" onclick="return confirm('Are you sure to delete')"/>
                    <span class="glyphicon glyphicon-trash"></span>
                    </a
                </td>
                </tr>
                
                
            </c:forEach>
            
        </table>
  <%@include  file="../footer.jsp" %>