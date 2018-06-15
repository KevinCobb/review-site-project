package org.wecancodeit.reviewsiteproject;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RepositoryTest {

	ReviewSiteRepository reviewRepo = new ReviewSiteRepository();
	Review review = new Review(1L, "Test Title", "TestImg", "catagory", "content");
	
	
	@Test
	public void shouldAddNewReviewToSiteREpo() {
		
		int reviewRepoSiteBeforeAdding = reviewRepo.reviewRepository.size();
		reviewRepo.addReview(review);
		int reviewRepoSiteAfterAdding = reviewRepo.reviewRepository.size();
		
		assertThat(reviewRepoSiteAfterAdding, is(equalTo(reviewRepoSiteBeforeAdding + 1)));
	}
	
	@Test
	public void shouldReturnAllValuesOfRepository() {
		
		int actualSizeOfCollection = reviewRepo.getReviews().size();
		int expectedSizeOfCollection = 3;
		
		assertThat(actualSizeOfCollection, is(equalTo(expectedSizeOfCollection)));
		
	}
	
	@Test
	public void shouldReturnAReview() {
		reviewRepo.addReview(review);
		for(Review review : reviewRepo.getReviews()) {
			assertTrue(review instanceof Review);
		}
	}
	
	@Test
	
	public void shouldReturnReviewByFindId() {
		reviewRepo.addReview(review);
		Review underTest = reviewRepo.findById(1L); 
		
		Long expectedReviewId = 1L;
		
		assertThat(underTest.getMovieId(), is(equalTo(expectedReviewId)));		
		
	}
	
	
}
