package com.elr.model;

import javax.persistence.Embeddable;

@Embeddable
public class Auth {
		private String userType;
		private String username;
		private String password;
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Auth(String userType, String username, String password) {
			super();
			this.userType = userType;
			this.username = username;
			this.password = password;
		}
		public Auth() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Auth [userType=" + userType + ", username=" + username + ", password=" + password + "]";
		}

	
}
