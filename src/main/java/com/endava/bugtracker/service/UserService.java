package com.endava.bugtracker.service;

import com.endava.bugtracker.domain.User;
import com.endava.bugtracker.exceptions.ExistingEmailException;
import com.endava.bugtracker.registration.RegistrationForm;

public interface UserService {
	
	 public User registerNewUserAccount(RegistrationForm userAccountData) throws ExistingEmailException;

}
