<%
	if(session.getAttribute("user") != null){
	  
	}else {
	 <% response.sendRedirect("/") %>
	}
%>