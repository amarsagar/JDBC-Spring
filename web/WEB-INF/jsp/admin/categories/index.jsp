<%@include file="../header.jsp" %>
<h1>Category</h1>
        <div class="pull-right">
                <p>
                <a href="${SITE_URL}/admin/categories/add" class="btn btn-primary" title="Add User"/>
                <span class="glyphicon glyphicon-plus"></span>
                </a>
                </p>
        </div>
<table class="table table-bordered table-hover table-striped">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>status</td>
                 <td>Action</td>
                      
            </tr>
            <c:forEach var="c" items="${Category}">
                <tr>
                <td>${c.catid}</td>
                <td>${c.name}</td>
                <td>${c.status}</td>
                
                <td>
                    <a href="${SITE_URL}/admin/categories/edit/${c.catid}" class="btn btn-success" title="Edit Category"/>
                    <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                     <a href="${SITE_URL}/admin/categories/delete/${c.catid}" class="btn btn-danger" title="Delete Category" onclick="return confirm('Are you sure to delete')"/>
                    <span class="glyphicon glyphicon-trash"></span>
                    </a
                </td>
                </tr>
                
                
            </c:forEach>
            
        </table>
  <%@include  file="../footer.jsp" %>