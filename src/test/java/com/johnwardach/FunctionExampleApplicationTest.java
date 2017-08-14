package com.johnwardach;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FunctionExampleApplicationTest {

	@LocalServerPort
	private int port;

	@Test
	public void givenInputOf1ThenResultShouldBeFalse() {
		assertThat(new TestRestTemplate()
			.getForObject("http://localhost:" + port + "/isEven/1", Boolean.class))
				.isEqualTo(false);
	}
	
	@Test
	public void givenInputOf2ThenResultShouldBeTrue() {
		assertThat(new TestRestTemplate()
			.getForObject("http://localhost:" + port + "/isEven/2", Boolean.class))
				.isEqualTo(true);
	}
}
