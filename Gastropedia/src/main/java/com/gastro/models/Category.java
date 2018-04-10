package com.gastro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {
	
	@Id
	@Column(name = "CAT_ID")
	@SequenceGenerator(name = "CAT_ID_SEQ", sequenceName = "CAT_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAT_ID_SEQ")
	private int categoryID;
	
	@Column(name = "CAT_NAME")
	private String catName;

	public Category(String catName) {
		super();
		this.catName = catName;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", catName=" + catName + "]";
	}
	
	
	
}
