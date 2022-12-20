package com.WebAPI.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Email")
public class SendingEmail {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String subject;
	private String content;
	
	public SendingEmail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SendingEmail(String username, String email, String subject, String content) {
		super();
		this.username = username;
		this.email = email;
		this.subject = subject;
		this.content = content;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "SendingEmail [username=" + username + ", email=" + email + ", subject=" + subject + ", content="
				+ content + "]";
	}

	
	
	

}
