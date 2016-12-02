<%@include file="../header.jsp" %>
<h1>Inquiry</h1>
        <div class="pull-right">
                <p>
                <a href="${SITE_URL}/admin/inquiry/add" class="btn btn-primary" title="Add User"/>
                <span class="glyphicon glyphicon-plus"></span>
                </a>
                </p>
        </div>
<table class="table table-bordered table-hover table-striped">
            <tr>
                <td>ID</td>
                <td>PID</td>
                <td>UID</td>
                <td>InquiryDate</td>
                <td>Inquiry</td>
                <td>Status</td>
                 <td>Action</td>
                      
            </tr>
            <c:forEach var="i" items="${Inquiry}">
                <tr>
                <td>${i.inqid}</td>
                <td>${i.pid}</td>
                <td>${i.uid}</td>
                <td>${i.inquiry_date}</td>
                <td>${i.inquiry}</td>
                <td>${i.status}</td>
                
                <td>
                    <a href="${SITE_URL}/admin/inquiry/edit/${i.inqid}" class="btn btn-success" title="Edit Category"/>
                    <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                     <a href="${SITE_URL}/admin/inquiry/delete/${i.inqid}" class="btn btn-danger" title="Delete Category" onclick="return confirm('Are you sure to delete')"/>
                    <span class="glyphicon glyphicon-trash"></span>
                    </a
                </td>
                </tr>
                
                
            </c:forEach>
            
        </table>
  <%@include  file="../footer.jsp" %>