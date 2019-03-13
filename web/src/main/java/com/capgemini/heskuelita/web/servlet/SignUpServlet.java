package com.capgemini.heskuelita.web.servlet;
import com.capgemini.heskuelita.data.db.DBConnectionManager;
import org.apache.commons.dbcp2.BasicDataSource;

import java.io.*;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;




@WebServlet ("/registrar")
public class SignUpServlet extends HttpServlet {

    DBConnectionManager h = new DBConnectionManager("jdbc:postgresql://localhost:5432/heskuelita", "postgres", "4621", "org.postgresql.Driver");


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            PreparedStatement pstm = this.h.getConnection().prepareStatement ("INSERT INTO public.users(nombre, apellido, " +
                                                                                            "fnac, gen, doc, us_username, us_pw, us_email)" +
                                                                                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?);");

            pstm.setString(1,req.getParameter ("first_name"));
            pstm.setString(2,req.getParameter ("last_name"));
            pstm.setString(3,req.getParameter("birthday"));
            pstm.setString(4,req.getParameter("gender"));
            pstm.setInt(5,Integer.parseInt(req.getParameter("identification")));
            pstm.setString (6,req.getParameter("username"));
            pstm.setString (7,req.getParameter("pwd"));
            pstm.setString(8,req.getParameter("email"));
            pstm.executeUpdate ();


            resp.sendRedirect ("index.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect ("err.jsp");
        }
    }

    }
