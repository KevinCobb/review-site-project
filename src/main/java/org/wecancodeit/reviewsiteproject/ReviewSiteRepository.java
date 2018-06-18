package org.wecancodeit.reviewsiteproject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ReviewSiteRepository {
	
	public Map<Long, Review> reviewRepository = new HashMap<Long, Review>();
	
	public ReviewSiteRepository() {
	Review terminatorReview = new Review(2L, "Terminator (1984)", "/img/TerminatorPoster.jpg", "CATEGORY: Horror Action", "REVIEW: The Terminator was a good stretch into the special effects horror catagory. This film rates a 8 out of 10");
	Review ghostBustersReview = new Review(3L, "Ghostbusters (1984)", "/img/GhostbustersPoster.jpg", "CATEGORY: Comedy", "REVIEW: Billed as a comedy action film this movie gave the audience a whimsicle trip into the paranormal. This film rates 9.5 out of 10");
	Review jurasicParkReview = new Review(4L, "Jurassic park (1993)", "/img/jurassicParkPoster.jpg", "CATEGORY: Action Adventure", "REVIEW: The Jurassic Park film launched in 1993 as a special effects event that no one had imagined possible before and set box office records. Thiis film rates 9.5 out of 10");
	Review raidersReview = new Review(5L, "Raiders of the lost ark (1982)", "/img/raiders.jpg", "CATEGORY: Action Adventure", "REVIEW: The Indiana Jones series although not using CGI technics still managed to wow viewers with special effects galore. This film rates 9 out of 10");
	this.addReview(terminatorReview);
	this.addReview(ghostBustersReview);
	this.addReview(jurasicParkReview);
	this.addReview(raidersReview);
	}
	
	
	public int getSizeOfRepository() {
		return reviewRepository.size();
	}

	public void addRepo(Review review) {
		
	}
	
	public void addReview(Review review) {
		reviewRepository.put(review.getMovieId(), review);
	}

	public Collection<Review> getReviews() {
		return reviewRepository.values();
	}

	public Review findById(Long movieId) {
		return reviewRepository.get(movieId);
	}

}
