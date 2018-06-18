package org.wecancodeit.reviewsiteproject;

public class Review {

	private long movieId;
	private String title;
	private String imgUrl;
	private String catagory;
	private String content;

	public Review(long movieId, String title, String imgUrl, String catagory, String content) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.imgUrl = imgUrl;
		this.catagory = catagory;
		this.content = content;
	}

	public long getMovieId() {
		return movieId;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getCatagory() {
		return catagory;
	}

	public String getContent() {
		return content;
	}

}
