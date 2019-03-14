
package com.capgemini.heskuelita.web.jpauser;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;


@Provider
public class CORSFilter implements ContainerResponseFilter {

  @Override
  public void filter(ContainerRequestContext request,
                     ContainerResponseContext response) throws IOException {


    response.getHeaders().add("Access-Control-Allow-Origin", "*");
    response.getHeaders().add("Access-Control-Allow-Headers",
            "origin, content-type, accept");
    response.getHeaders().add("Access-Control-Allow-Methods",
            "GET, POST, PUT, DELETE, OPTIONS, HEAD");
  }
}