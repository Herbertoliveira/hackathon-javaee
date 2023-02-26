package com.stefanini.resources;

import com.stefanini.model.Usuario;
import com.stefanini.repository.UsuarioRepository;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @Inject
    UsuarioRepository usuarioRepository;

    @GET
    @Path("teste")
    @Produces(MediaType.TEXT_PLAIN)
    public String teste(){
        return "teste";
    }


    @GET
    public Response hello() {
        return Response.ok(usuarioRepository.listAll()).build();
    }

    @POST
    public Response salvarUsuario(@Valid Usuario usuario) {

        return Response.ok(usuarioRepository.save(usuario)).status(Response.Status.CREATED).build();
    }

}
