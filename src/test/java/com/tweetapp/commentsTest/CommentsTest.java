package com.tweetapp.commentsTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.tweetapp.comments.Comments;
import com.tweetapp.comments.CommentsController;

@SpringBootTest
public class CommentsTest {
	
	@Autowired
	private CommentsController commentsController;
	

	public void contextLoads() throws Exception {
		assertThat(commentsController).isNotNull();
	}
	

	public void getAll() throws Exception {
		assertThat(commentsController.getAll(0)).isNotNull();
	}
	

	public void postComment() throws Exception {
		Comments comments=new Comments("Hello",10,new Date(),"test_user");
		URI location = new URI("http://localhost/Hello");
		ResponseEntity<Void> value = ResponseEntity.created(location).build();
		assertThat(commentsController.postComment(10, comments)).isEqualTo(value);
	}
}
