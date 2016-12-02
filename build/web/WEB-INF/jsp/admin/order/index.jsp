<%@include file="../header.jsp" %>
<h1>Order</h1>
        <div class="pull-right">
                <p>
                <a href="${SITE_URL}/admin/order/add" class="btn btn-primary" title="Add order"/>
                <span class="glyphicon glyphicon-plus"></span>
                </a>
                </p>
        </div>
<table class="table table-bordered table-hover table-striped">
            <tr>
                <td>ID</td>
                <td>UID</td>
                <td>Order Date</td>
                <td>status</td>
                 <td>Action</td>
                      
            </tr>
            <c:forEach var="o" items="${Order}">
                <tr>
                <td>${o.oid}</td>
                <td>${o.uid}</td>
                <td>${o.order_date}</td>
                <td>${o.status}</td>
                
                <td>
                    <a href="${SITE_URL}/admin/order/edit/${o.oid}" class="btn btn-success" title="Edit Order"/>
                    <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                     <a href="${SITE_URL}/admin/order/delete/${o.oid}" class="btn btn-danger" title="Delete Order" onclick="return confirm('Are you sure to delete')"/>
                    <span class="glyphicon glyphicon-trash"></span>
                    </a
                </td>
                </tr>
                
                
            </c:forEach>
            
        </table>
  <%@include  file="../footer.jsp" %>