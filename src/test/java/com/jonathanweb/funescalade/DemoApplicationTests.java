package com.jonathanweb.funescalade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jonathanweb.funescalade.FunEscaladeApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FunEscaladeApplication.class)
/**

By default, @SpringBootTest does not start the server. 
@SpringBootTest(classes = DemoApplication.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT), an available port is picked at random each time your test runs.
**/
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
