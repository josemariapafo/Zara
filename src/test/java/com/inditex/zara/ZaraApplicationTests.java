package com.inditex.zara;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ContextConfiguration(classes = {ZaraApplication.class})
@ExtendWith(SpringExtension.class)
class ZaraApplicationTests {

	@Test
	void testMain() {
		assertNotNull(SpringApplication.run(ZaraApplication.class, new String[]{"efd", "sd"}));
	}

}
