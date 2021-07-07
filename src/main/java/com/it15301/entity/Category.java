package com.it15301.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Categories")
public class Category implements Serializable {
	@Id
	String id;
	String name;
	@OneToMany(mappedBy = "category")
	List<Product> products;
}
