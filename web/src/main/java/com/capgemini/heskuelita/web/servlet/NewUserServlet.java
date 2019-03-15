package com.capgemini.heskuelita.web.servlet;


import com.capgemini.heskuelita.data.entity.StudentAnnotation;
import com.capgemini.heskuelita.data.entity.UserAnnotation;
import com.capgemini.heskuelita.data.impl.StudentDaoHibernate;
import com.capgemini.heskuelita.data.impl.UserDaoHibernate;
import com.capgemini.heskuelita.data.util.HibernateUtil;
import com.capgemini.heskuelita.service.IStuentSecurityService;
import com.capgemini.heskuelita.service.IUserSecurityService;
import com.capgemini.heskuelita.service.impl.StudentSecurityServiceImpl;
import com.capgemini.heskuelita.service.impl.UserSecurityServiceImpl;
import org.hibernate.SessionFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/NewUser")
public class NewUserServlet extends HttpServlet {

    private IUserSecurityService securityServiceUser;
    private IStuentSecurityService securityServiceStudent;


    public NewUserServlet(){
        super();
    }

    @Override
    public void init (ServletConfig config) throws ServletException {

        SessionFactory manager = HibernateUtil.getSessionFactory();
        SessionFactory manager2 = HibernateUtil.getSessionFactory();


        try {

            this.securityServiceUser = new UserSecurityServiceImpl(new UserDaoHibernate(manager));
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

        try{
              this.securityServiceStudent = new StudentSecurityServiceImpl(new StudentDaoHibernate(manager2));
        }catch (Exception e){
            e.printStackTrace();
            throw new ServletException(e);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserAnnotation user = new UserAnnotation();
        StudentAnnotation student = new StudentAnnotation();
        user.setName (req.getParameter("first_name"));
        user.setPassword (req.getParameter ("password"));
        user.setEmail(req.getParameter("email"));
        student.setFirst_name(req.getParameter("first_name"));
        student.setLast_name(req.getParameter("last_name"));
        student.setType_id(req.getParameter("typo_id"));
        student.setNumber_id(req.getParameter("number_id"));
        student.setGender(req.getParameter("gender"));
        student.setPhone_number(req.getParameter("phone_number"));
        try {

            this.securityServiceUser.NewUser (user);
            this.securityServiceStudent.NewStudent(student);
            HttpSession session = req.getSession ();
            session.setAttribute ("user", user);

            resp.sendRedirect ("home.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect ("err.jsp");
        }


    }
}
