package com.delta.cont;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.delta.models.User;
import com.delta.dao.UserDAO;
@WebServlet("/login")
public class LoginCont extends HttpServlet {
    private static final long serialVersionUID = -3462096228274971485L;
    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
	throws ServletException, IOException {
	//response.getWriter().println("Hello World!");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String email = request.getParameter("email");
	String password = request.getParameter("password");
	/* we need to access dao object after using jpa */
	//response.getWriter().println("username is "+username+" and password"+password);
	User user = null;
	/* We should validate parameter */
	if((user = UserDAO.getDAO().auth(email,password)) != null){
	    /* first we have to create session */
	    HttpSession session  = request.getSession();
	    session.setAttribute("user", user);
	    int usertype = user.getUserType();
	    if(usertype == 1){
		/* redirect to admin page */
		response.sendRedirect("admin.jsp");
	    }else if(usertype == 2) {
		/* redirect to user page */
		response.sendRedirect("tech.jsp");
	    }else if(usertype == 3){
		/* redirect to client */
		response.sendRedirect("client.jsp");
	    }else if(usertype == 4){
		/* redirect to emlpoyee */
		response.sendRedirect("empl.jsp");
	    }
	}else {
	    /* return to page with error */
	    response.sendRedirect("login.jsp?err=lgn");
	}
	
    }
}
