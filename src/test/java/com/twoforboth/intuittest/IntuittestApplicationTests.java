package com.twoforboth.intuittest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class IntuittestApplicationTests {

	@Test
	void contextLoads() {
		Assert.isTrue(true, "True");
	}

}
