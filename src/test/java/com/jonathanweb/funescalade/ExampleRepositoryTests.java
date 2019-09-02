package com.jonathanweb.funescalade;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.junit4.SpringRunner;

import com.jonathanweb.funescalade.FunEscaladeApplication;
import com.jonathanweb.funescalade.model.User;
import com.jonathanweb.funescalade.repository.UserRepository;

import org.springframework.boot.test.autoconfigure.orm.jpa.*;

import static org.assertj.core.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ExampleRepositoryTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private UserRepository repository;

	@Test
	public void testExample() throws Exception {
		
		//
		User user = new User();
		user.setName("toto");
		user.setLastName("titi");
		user.setEmail("titijava@gmail.com");
		//BCryptPasswordEncoder bCryptPasswordEncoderLocal = new BCryptPasswordEncoder();
		//String encodepwd = bCryptPasswordEncoderLocal.encode("admin2017");
		//user.setPassword(encodepwd);
		//System.out.println("admin2017  encoder = " +encodepwd);
		user.setPassword("$2a$10$fE7BKQcc.tesDzaptjL8luXZB6MV5rvUJ13ub5aVYKqnoPmMqYd8m");
		user.setActive(true);
		
		this.entityManager.persist(user);
		List<User> userList = this.repository.findByName("toto");
		user = userList.get(0);
		assertThat(user.getName()).isEqualTo("toto");
		assertThat(user.getLastName()).isEqualTo("titi");
	}
	
	/**
		
			@Test
			public void save_scenario_1() {
			// Given
			Comment comment = new Comment();
			comment.setComment("Test");
			comment.setType(CommentType.PLUS);
			comment.setCreatedDate(new Timestamp(System.currentTimeMillis()));

			// When
			Comment saved = commentRepository.save(comment);

			// Then
			assertThat(testEntityManager.find(Comment.class,
			saved.getId())).isEqualTo(saved);
			}
	**/

}