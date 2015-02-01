package com.endava.bugtracker.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.social.security.SocialUser;

import com.endava.bugtracker.domain.RoleService;
import com.endava.bugtracker.domain.SigninProvider;

public class UserDetailsDto extends SocialUser{
	
	
	  private Long id;

	    private String firstName;

	    private String lastName;

	    private RoleService roleService;

	    private SigninProvider signInProvider;

	    public UserDetailsDto(String username, String password, Collection<? extends GrantedAuthority> authorities) {
	        super(username, password, authorities);
	    }

	    public static Builder getBuilder() {
	    	
	        return new Builder();
	    }

	   
	    
	    
	    
	    

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public RoleService getRole() {
			return roleService;
		}

		public void setRole(RoleService role) {
			this.roleService = role;
		}

		public SigninProvider getSignInProvider() {
			return signInProvider;
		}

		public void setSignInProvider(SigninProvider signInProvider) {
			this.signInProvider = signInProvider;
		}

		@Override
	    public String toString() {
	        return new ToStringBuilder(this)
	                .append("id", id)
	                .append("username", getUsername())
	                .append("firstName", firstName)
	                .append("lastName", lastName)
	                .append("role", roleService)
	                .append("signInProvider", signInProvider)
	                .toString();
	    }

	    public static class Builder {

	        private Long id;

	        private String username;

	        private String firstName;

	        private String lastName;

	        private String password;

	        private RoleService role;

		    private SigninProvider signInProvider;

	        private Set<GrantedAuthority> authorities;

	        public Builder() {
	            this.authorities = new HashSet<GrantedAuthority>();
	        }

	        public Builder firstName(String firstName) {
	            this.firstName = firstName;
	            return this;
	        }

	        public Builder id(Long id) {
	            this.id = id;
	            return this;
	        }

	        public Builder lastName(String lastName) {
	            this.lastName = lastName;
	            return this;
	        }

	        public Builder password(String password) {
	            if (password == null) {
	                password = "SocialUser";
	            }

	            this.password = password;
	            return this;
	        }

	        public Builder role(RoleService role) {
	            this.role = role;

	            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.toString());
	            this.authorities.add(authority);

	            return this;
	        }

	        public Builder socialSignInProvider(SigninProvider signInProvider) {
	            this.signInProvider = signInProvider;
	            return this;
	        }

	        public Builder username(String username) {
	            this.username = username;
	            return this;
	        }

	        public UserDetailsDto build() {
	        	UserDetailsDto user = new UserDetailsDto(username, password, authorities);

	            user.id = id;
	            user.firstName = firstName;
	            user.lastName = lastName;
	            user.roleService = role;
	            user.signInProvider = signInProvider;

	            return user;
	        }
	    }

}
