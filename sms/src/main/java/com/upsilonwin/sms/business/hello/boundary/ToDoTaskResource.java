package com.upsilonwin.sms.business.hello.boundary;

import com.upsilonwin.sms.business.hello.entity.ToDoTask;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("todos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ToDoTaskResource {
    
    @Inject
    private ToDoTaskService service;
    
    @GET
    public List<ToDoTask> getAll() {
        return service.getAll();
    }
    
    @GET
    @Path("{id}")
    public ToDoTask get(@PathParam("id") String id) {
        return service.get(id);
    }
    
    @POST
    public void save(ToDoTask toDoTask) {
        service.save(toDoTask);
    }
    
    @DELETE
    public void delete(ToDoTask toDoTask) {
        service.delete(toDoTask);
    }
}
