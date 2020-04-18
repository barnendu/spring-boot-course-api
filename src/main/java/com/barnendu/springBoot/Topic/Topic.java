package com.barnendu.springBoot.Topic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

@ApiModel(description = "All the details about topics.")
public class Topic {
	private String id;
	@Size(min=2, message="Name should have atleast 2 charecters.")
	@ApiModelProperty(notes = "Name should have atleast 2 characters")
	private String name;
	@ApiModelProperty(notes = "Description should have atleast 50 characters")
	private String description;
	
	public Topic() {
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
