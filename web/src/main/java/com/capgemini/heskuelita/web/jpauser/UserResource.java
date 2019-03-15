
package com.capgemini.heskuelita.web.jpauser;


import com.capgemini.heskuelita.data.IUserDao;
import com.capgemini.heskuelita.data.entity.UserAnnotation;
import com.capgemini.heskuelita.data.impl.UserDaoHibernate;
import com.capgemini.heskuelita.data.util.HibernateUtil;
import org.hibernate.SessionFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;


@Path ("/UserAnnotation")
public class UserResource {

    SessionFactory manager = HibernateUtil.getSessionFactory();
	IUserDao userDao = new UserDaoHibernate(manager);


	public UserResource() {

	    super ();
    }

	@GET
	@Produces ({MediaType.APPLICATION_JSON })
	public Response findAll () {

        return Response.status (200).entity (this.userDao.findAll ()).build ();
	}

	@GET @Path("{id}")
	@Produces ({MediaType.APPLICATION_JSON })
	public Response findById (@PathParam("id") String id) {

        return Response.status (200).entity (this.userDao.findById (Integer.parseInt (id))).build ();
	}

    @POST
    @Consumes ({MediaType.APPLICATION_JSON })
    public Response add (UserAnnotation e) throws URISyntaxException {

        this.userDao.create (e.getName(),e.getPassword(),e.getEmail());

        return Response.created (new URI ("/heskuelita/api/UserAnnotation" + e.getId ())).build ();
    }

    @PUT @Path ("/{id}")
    @Consumes ({MediaType.APPLICATION_JSON })
    @Produces ({MediaType.APPLICATION_JSON })
    public Response update (@PathParam("id") Integer id, UserAnnotation e) {

        if (this.userDao.findById (id) == null) {

            return Response.status (404).build ();
        }

        e.setId (id);
        this.userDao.update (e);

        return Response.status (200).entity (e).build ();
    }

      /* @DELETE
    @Path ("/{id}")
    public Response delete (@PathParam("id") Integer id) {


        if (this.dao.findById (id) == null) {

            return Response.status (404).build ();
        }

        this.dao.remove (this.dao.findById (id));

        return Response.status (204).entity ("Employee " + id + " deleted successfully !!").build ();

    } */
}