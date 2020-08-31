package com.doc.api.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="Person bean which contains person related info")
public class Person {

	@Id
	@ApiModelProperty(value="Uniquely identified by each person")
	@ApiParam(value="API param")
	private long personId;
	@ApiModelProperty(value="Name of the person")
	private String name;
	@ApiModelProperty(value="Age of the person")
	private int age;

}
