package io.prudhvi.api.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "Movies.findAll", query = "SELECT u FROM Movies u"),
	@NamedQuery(name = "Movies.findOne", query = "SELECT u FROM Movies u WHERE u.movie_Id=:pMovies_Id"), 
	@NamedQuery(name = "Movies.findBytitle", query = "SELECT u FROM Movies u WHERE u.title=:pTitle"), 
	@NamedQuery(name = "Movies.topRatedMovies", query = "SELECT u FROM Movies u WHERE u.type='movie' order by u.imdbRating"),
	@NamedQuery(name = "Movies.topRatedSeries", query = "SELECT u FROM Movies u WHERE u.type='series' order by u.imdbRating"),
	@NamedQuery(name = "Movies.type", query = "SELECT u FROM Movies u WHERE u.type=:pType"),
	@NamedQuery(name = "Movies.genre", query = "SELECT u FROM Movies u WHERE u.genre1=:pGenre or u.genre2=:pGenre or u.genre3=:pGenre"),
	@NamedQuery(name = "Movies.year", query = "SELECT u FROM Movies u WHERE u.year=:pYear"),
	@NamedQuery(name = "Movies.sortImdbRaing", query = "SELECT u FROM Movies u order by u.imdbRating"),
	@NamedQuery(name = "Movies.sortImdbVotes", query = "SELECT u FROM Movies u order by u.imdbVotes"),
	@NamedQuery(name = "Movies.sortYear", query = "SELECT u FROM Movies u order by u.year"),
})

public class Movies 
{
	@Id
	private String movie_Id;
	
	@Column(unique=true)
	private String title;
	
	private String year;
	private String rated;
	private String released;
	private String runtime;
	private String genre1;
	private String genre2;
	private String genre3;
	private String director;
	private String writer;
	private String actor1;
	private String actor2;
	private String actor3;
	private String actor4;
	private String plot;
	private String language;
	private String country;
	private String awards;
	private String poster;
	private String metaScore;
	private String imdbRating;
	private String imdbVotes;
	private String imdbId;
	private String type;
	
	public Movies() {
		this.movie_Id = UUID.randomUUID().toString();
	}
	
	public String getMovie_Id() {
		return movie_Id;
	}
	public void setMovie_Id(String movie_Id) {
		this.movie_Id = movie_Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getMetaScore() {
		return metaScore;
	}
	public void setMetaScore(String metaScore) {
		this.metaScore = metaScore;
	}
	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getGenre1() {
		return genre1;
	}

	public void setGenre1(String genre1) {
		this.genre1 = genre1;
	}

	public String getGenre2() {
		return genre2;
	}

	public void setGenre2(String genre2) {
		this.genre2 = genre2;
	}

	public String getGenre3() {
		return genre3;
	}

	public void setGenre3(String genre3) {
		this.genre3 = genre3;
	}

	public String getActor1() {
		return actor1;
	}

	public void setActor1(String actor1) {
		this.actor1 = actor1;
	}

	public String getActor2() {
		return actor2;
	}

	public void setActor2(String actor2) {
		this.actor2 = actor2;
	}

	public String getActor3() {
		return actor3;
	}

	public void setActor3(String actor3) {
		this.actor3 = actor3;
	}

	public String getActor4() {
		return actor4;
	}

	public void setActor4(String actor4) {
		this.actor4 = actor4;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public String getImdbVotes() {
		return imdbVotes;
	}
}
