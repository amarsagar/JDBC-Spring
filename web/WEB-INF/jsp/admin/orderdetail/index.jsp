<%@include file="../header.jsp" %>
<h1>OrderDetail</h1>
        <div class="pull-right">
                <p>
                <a href="${SITE_URL}/admin/orderdetail/add" class="btn btn-primary" title="Add orderDetail"/>
                <span class="glyphicon glyphicon-plus"></span>
                </a>
                </p>
        </div>
<table class="table table-bordered table-hover table-striped">
            <tr>
                <td>ID</td>
                <td>PID</td>
                <td>Price</td>
                <td>OID</td>
                <td>Quantity</td>
                 <td>Action</td>
                      
            </tr>
            <c:forEach var="od" items="${OrderDetail}">
                <tr>
                <td>${od.odid}</td>
                <td>${od.pid}</td>
                <td>${od.price}</td>
                <td>${od.oid}</td>
                <td>${od.quantity}</td>
                
                
                <td>
                    <a href="${SITE_URL}/admin/orderdetail/edit/${od.odid}" class="btn btn-success" title="Edit OrderDetail"/>
                    <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                     <a href="${SITE_URL}/admin/orderdetail/delete/${od.odid}" class="btn btn-danger" title="Delete OrderDetail" onclick="return confirm('Are you sure to delete')"/>
                    <span class="glyphicon glyphicon-trash"></span>
                    </a
                </td>
                </tr>
                
                
            </c:forEach>
            
        </table>
  <%@include  file="../footer.jsp" %>