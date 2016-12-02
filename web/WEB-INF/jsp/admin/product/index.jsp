<%@include  file="../header.jsp" %>
        <h1>Product</h1>
        <div class="pull-right">
            <p>
                <a href="${SITE_URL}/admin/product/add" class="btn btn-primary" title="Add Product"/>
                <span class="glyphicon glyphicon-plus"></span>
                </a>
                
            </p>
        </div>
        
        <table class="table table-bordered table-hover table-striped">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Image</td>
                <td>Description</td>
                <td>Added_Date</td>
                <td>Cat_Id</td>
                <td>Status</td>
                <td>Action</td>
                      
            </tr>
            <c:forEach var="product" items="${Product}">
                <tr>
                <td>${product.pid}</td>
                <td>${product.name}</td>
                <td>${product.image}</td>
                <td>${product.description}</td>
                <td>${product.added_date}</td>
                <td>${product.catid}</td>
                <td>${product.status}</td>
                <td>
                    <a href="${SITE_URL}/admin/product/edit/${product.pid}" class="btn btn-success" title="Edit Product"/>
                    <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                     <a href="${SITE_URL}/admin/product/delete/${product.pid}" class="btn btn-danger" title="Delete Product" onclick="return confirm('Are you sure to delete')"/>
                    <span class="glyphicon glyphicon-trash"></span>
                    </a
                </td>
                </tr>
                
                
            </c:forEach>
            
        </table>
  <%@include  file="../footer.jsp" %>