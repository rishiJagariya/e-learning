package com.elr.dao;

import com.elr.model.Auth;

public interface DaoInterface {
	
	public Auth getAuth();     //will return auth(type, username, password)
	public void addAuth();     //to add userAuth to database
	
	
	/*  COMMENTS 
	 * 
	>> trainer or student 
		>> 2 entries 
			1. trainer or students 
			2. Auth table 
			
	*/
}
