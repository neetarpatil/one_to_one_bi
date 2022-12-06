package com.jsp.person.pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private long pan_num;
	
	@OneToOne
	private Person person;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public long getPan_num() {
		return pan_num;
	}
	public void setPan_num(long pan_num) {
		this.pan_num = pan_num;
	}
	
	
	
	

}
