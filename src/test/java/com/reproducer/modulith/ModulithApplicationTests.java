package com.reproducer.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class ModulithApplicationTests {

	@Test
	void verify_application_module_structure() {
		ApplicationModules modules = ApplicationModules.of( ModulithApplication.class);
		modules.verify();
	}

}
