package models;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Task extends Model{
	
	@Required
	public String name;
	
	@Required
	public String task;
	
	@Required
	public String importance;
	
	@Required
	public String isDone;
	
}
