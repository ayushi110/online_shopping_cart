/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.105
 * Generated at: 2021-08-16 08:15:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Project.ConnectionProvider;
import java.sql.*;

public final class addNewProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/../footer.jsp", Long.valueOf(1628098141368L));
    _jspx_dependants.put("/admin/adminHeader.jsp", Long.valueOf(1629099804048L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("    \r\n");
      out.write("     \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("   ");
String email=session.getAttribute("email").toString();
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("            <center><h2>Welcome to Select.com</h2></center>\r\n");
      out.write("            <a href=\"addNewProduct.jsp\">Add New Product <i class='fas fa-plus-square'></i></a>\r\n");
      out.write("            <a href=\"allProductEditProduct.jsp\">All Products & Edit Products <i class='fab fa-elementor'></i></a>\r\n");
      out.write("            <a href=\"messagesReceived.jsp\">Messages Received <i class='fas fa-comment-alt'></i></a>\r\n");
      out.write("            <a href=\"ordersReceived.jsp\">Orders Received <i class=\"fas fa-archive\"></i></a>\r\n");
      out.write("            <a href=\"cancelOrders.jsp\">Cancel Orders <i class='fas fa-window-close'></i></a>\r\n");
      out.write("            <a href=\"deliveredOrders.jsp\">Delivered Orders <i class='fas fa-dolly'></i></a>\r\n");
      out.write("            <a href=\"../logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
      out.write(" \r\n");
      out.write("    ");
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Select</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/addNewProduct-style.css\">\r\n");
      out.write("<title>Add New Product</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
String msg=request.getParameter("msg");
if("done".equals(msg))
{
      out.write("\r\n");
      out.write("<h3 class=\"alert\">Product Added Successfully!</h3>\r\n");
} 
      out.write('\r');
      out.write('\n');
 
if("wrong".equals(msg))
{
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3 class=\"alert\">Some thing went wrong! Try Again!</h3>\r\n");
} 
      out.write('\r');
      out.write('\n');
int id=1;
try
{
	Connection con = ConnectionProvider.getCon();
	Statement st=con.createStatement();
	ResultSet rs = st.executeQuery("select max(id) from product");
	while(rs.next())
	{
		id=rs.getInt(1);
		id=id+1;
	}

}
catch(Exception e)
{
	
}

      out.write("\r\n");
      out.write("<form action=\"addNewProductAction.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<h3 style=\"color: yellow;\">Product ID: ");
out.println(id); 
      out.write(" </h3>\r\n");
      out.write("<input type=\"hidden\" name=\"id\" value=\"");
out.println(id); 
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write(" <h3>Enter Name</h3>\r\n");
      out.write(" <input class=\"input-style\" type=\"text\" name=\"name\" placeholder=\"Enter Name\" required>  \r\n");
      out.write(" \r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Enter Category</h3>\r\n");
      out.write("  <input class=\"input-style\" type=\"text\" name=\"category\" placeholder=\"Enter Category\" required>  \r\n");
      out.write(" \r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"left-div\">\r\n");
      out.write("<h3>Enter Price</h3>\r\n");
      out.write("  <input class=\"input-style\" type=\"number\" name=\"price\" placeholder=\"Enter Price\" required>  \r\n");
      out.write(" \r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-div\">\r\n");
      out.write("<h3>Active</h3>\r\n");
      out.write("   <select class=\"input-style\" name=\"active\">\r\n");
      out.write("   \t<option value=\"Yes\">Yes</option>\r\n");
      out.write("   \t<option value=\"No\">No</option>\r\n");
      out.write("   </select>\r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write(" <button class=\"button\">Save<i class='far fa-arrow-alt-circle-right'></i></button>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}