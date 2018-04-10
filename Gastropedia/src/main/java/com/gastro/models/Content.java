package com.gastro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONTENT")
public class Content {
	
	@Id
	@Column(name = "CONTENT_ID")
	@SequenceGenerator(name = "CONTENT_ID_SEQ", sequenceName = "CONTENT_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTENT_ID_SEQ")
	private int contentID;
	
	@ManyToOne
	@JoinColumn(name = "categoryID")
	private Category category;
	
	@Column(name = "CONTENT")
	private String content;

	public Content(String content) {
		super();
		this.content = content;
	}

	public int getContentID() {
		return contentID;
	}

	public void setContentID(int contentID) {
		this.contentID = contentID;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Content [contentID=" + contentID + ", category=" + category + ", content=" + content + "]";
	}
	
	
	

}
