package com.upsilonwin.sms.business.hello.boundary;

import com.upsilonwin.sms.business.hello.entity.ToDoTask;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ToDoTaskService {
    
    @PersistenceContext(name = "SMS-PU")
    private EntityManager em;
    
    public List<ToDoTask> getAll() {
        return em.createQuery("SELECT t FROM ToDoTask t").getResultList();
    }
    
    public ToDoTask get(String id) {
        return em.find(ToDoTask.class, id);
    }
    
    public void save(ToDoTask toDoTask) {
        em.persist(toDoTask);
    }
    
    public void delete(ToDoTask toDoTask) {
        em.remove(toDoTask);
    }
}
