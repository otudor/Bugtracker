package com.endava.bugtracker.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PASSWORD")
	private String password;

	@ManyToOne
	@JoinColumn(name = "ROLE_ID")
	private Role role;

	@OneToMany(mappedBy = "createdBy")
	private List<Issue> issues;

	@OneToMany(mappedBy = "owner")
	private List<Project> projects;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Enumerated(EnumType.STRING)
	@Column(name = "role", length = 20, nullable = false)
	private RoleService roles;

	@Enumerated(EnumType.STRING)
	@Column(name = "sign_in_provider", length = 20)
	private SigninProvider signInProvider;

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Issue> getIssues() {
		return issues;
	}

	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public RoleService getRoles() {
		return roles;
	}

	public void setRoles(RoleService roles) {
		this.roles = roles;
	}

	public SigninProvider getSignInProvider() {
		return signInProvider;
	}

	public void setSignInProvider(SigninProvider signInProvider) {
		this.signInProvider = signInProvider;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public static class Builder {

		private User user;

		public Builder() {
			user = new User();
			user.roles = RoleService.ROLE_USER;
		}

		public Builder email(String email) {
			user.email = email;
			return this;
		}

		public Builder firstName(String firstName) {
			user.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			user.lastName = lastName;
			return this;
		}

		public Builder password(String password) {
			user.password = password;
			return this;
		}

		public Builder signInProvider(SigninProvider signInProvider) {
			user.signInProvider = signInProvider;
			return this;
		}

		public User build() {
			return user;
		}
	}

}
