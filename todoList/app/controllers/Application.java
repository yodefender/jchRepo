package controllers;

import play.mvc.*;
import play.data.validation.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        Date now = new Date();
        render(now);
    }
    
    public static void list() {

    	List<Task> tasks = Task.find("order by name").fetch();
        render(tasks);

    }
    
    public static void form(Long id) {
        if(id == null) {
            render();
        }

        Task task = Task.findById(id);
        render(task);
    }
    
    public static void save(@Valid Task task) {
        if(validation.hasErrors()) {
            if(request.isAjax()) error("Invalid value");
            render("@form", task);
        }
        task.save();
        list();
    }

}