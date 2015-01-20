package org.demo.domain;

public class Author {

    private String firstname;
    private String lastname;

    public Author setFirstname(String firstname) {
    	this.firstname = firstname;
    	return this;
    }
    public String getFirstname() {
    	return this.firstname;
    }
    public Author setLastname(String lastname) {
    	this.lastname = lastname;
    	return this;
    }
    public String getLastname() {
    	return this.lastname;
    }
  
}