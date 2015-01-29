package com.endava.bugtracker.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ISSUE")
public class Issue implements Serializable {

	private static final long serialVersionUID = -2799590662348172064L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "TITLE")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "CAT_ID")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "PROJECT_ID")
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "STATE_ID")
	private State state;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User createdBy;
	
	@Column
	private Timestamp created;
	
	@Column
	private Timestamp modified;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User owner) {
		this.createdBy = owner;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getModified() {
		return modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}
}
