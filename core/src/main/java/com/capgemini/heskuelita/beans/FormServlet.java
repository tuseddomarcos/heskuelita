package com.capgemini.heskuelita.beans;

import javax.servlet.annotation.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger (FormServlet.class);

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {


        String name =  request.getParameter("name");

        String sex =  request.getParameter("ex");

        String email =  request.getParameter("email");

        String user =  request.getParameter("user");

        String pw =  request.getParameter("pw");


        logger.debug (String.format ("Request Received [name=%s, sex=%s, email=%s, user=%s, pw=%s",
                name, sex, email, user, pw));
        response.sendRedirect ("result.html");
    }
	
}
