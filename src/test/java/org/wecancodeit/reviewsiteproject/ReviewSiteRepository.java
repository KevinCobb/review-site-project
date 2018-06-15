package org.wecancodeit.reviewsiteproject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ReviewSiteRepository {
	
	public Map<Long, Review> reviewRepository = new HashMap<Long, Review>();
	
	Review TermintorReview = new Review(2L, "Terminator", "terminatorImg", "Action", "This is a Terminator review");
	Review GhostBustersReview = new Review(3L, "Test Title", "GhostImg", "catagory", "content");
	Review JurasicParkReview = new Review(4L, "Test Title", "JurasicImg", "catagory", "content");
	
	this.addReview(TerminatorReview);
	this.addReview(GhostBustersReview);
	this.addReview(JurasicParkReview);
 	
	
	
	public int getSizeOfRepository() {
		return reviewRepository.size();
	}

	public void addRepo(Review review) {
		
	}
	
	public void addReview(Review review) {
		reviewRepository.put(review.getMovieId(), review);
	}

	public Collection<Review> getReviews() {
		return reviewRepostory.values();
	}

	public Review findById(Long movieId) {
		return reviewRepository.get(movieId);
	}

}
