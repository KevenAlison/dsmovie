package com.devsuperior.dsmovie.DTO;

public class ScoreDTO {

	private Long serieId;
	private String email;
	private Double score;

	public ScoreDTO() {

	}

	public Long getMovieId() {
		return serieId;
	}

	public void setMovieId(Long serieId) {
		this.serieId = serieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}



}