package io.prudhvi.api.entity;

import java.util.UUID;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "MoviesComments.findAll", query = "SELECT u FROM MoviesComments u"),
	@NamedQuery(name = "MoviesComments.findBytitle", query = "SELECT u FROM MoviesComments u WHERE u.title=:pTitle") 
})

public class MoviesComments 
{
	@Id
	private String comment_Id;
	private String title;
	private String email;
	private String userRating;
	private String comments;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserRating() {
		return userRating;
	}

	public void setUserRating(String userRating) {
		this.userRating = userRating;
	}

	public MoviesComments() {
		this.comment_Id = UUID.randomUUID().toString();
	}
	
	public String getComment_Id() {
		return comment_Id;
	}
	public void setComment_Id(String comment_Id) {
		this.comment_Id = comment_Id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
