package com.tweetapp.tweetsTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.tweetapp.tweet.Tweet;
import com.tweetapp.tweet.TweetController;

@SpringBootTest
public class TweetsTest {
	
	@Autowired
	private TweetController tweetController;
	

	public void contextLoads() throws Exception {
		assertThat(tweetController).isNotNull();
	}
	

	public void getTweet() throws Exception{
		assertThat(tweetController.getTweet(16)).isNotNull();
	}
	

	public void getAllTweet() throws Exception{
		assertThat(tweetController.getAllTweets()).isNotNull();
	}
	

	public void getAllTweetsOfUser() throws Exception{
		assertThat(tweetController.getAllTweetsOfUser("test_user")).isNotNull();
	}
	

	public void postTweet() throws Exception{
		Tweet t=new Tweet(16,"test_user","Hi !!", new Date());
		URI location = new URI("http://localhost/16");
		ResponseEntity<Void> value = ResponseEntity.created(location).build();
		System.out.print(t);
		assertThat(tweetController.postTweets("test_user", t)).isEqualTo(value);
		
	}
	

	public void deleteTweet() throws Exception{
		ResponseEntity<Void> value = ResponseEntity.noContent().build();
		assertThat(tweetController.deleteTweets(2)).isEqualTo(value);
		
	}
	

	public void updateTweet() throws Exception{
		Tweet t=new Tweet(10,"test_uset","Hi !! (Updated)", new Date());
		ResponseEntity<Tweet> value = new ResponseEntity<Tweet>(t, HttpStatus.OK);
		assertThat(tweetController.updateTweets(10, t)).isEqualTo(value);
		
	}

}
