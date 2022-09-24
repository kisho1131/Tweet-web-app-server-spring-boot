package com.tweetapp.likes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class LikesTest {
	
	@Autowired
	private LikesController likesController;
	

	public void contextLoads() throws Exception {
		assertThat(likesController).isNotNull();
	}
	

	public void getAll() throws Exception {
		assertThat(likesController.getAll()).isNotNull();
	}

	public void getlikeCount() throws Exception {
		assertThat(likesController.getLikeCount(4)).isNotNull();
	}
	

	public void updateLikes() throws Exception {
		Likes likes = new Likes(10,1); 
		ResponseEntity<Likes> value = new ResponseEntity<Likes>(likes, HttpStatus.OK);
		assertThat(likesController.updateLikes(-1, "test_user", likes)).isEqualTo(value);
	}
	

	public void deleteLike() throws Exception{
		ResponseEntity<Void> value = ResponseEntity.noContent().build();
		assertThat(likesController.Delete(0)).isEqualTo(value);
	}
	
	
	

}
