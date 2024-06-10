@org.springframework.modulith.ApplicationModule(
      allowedDependencies = {
            "domain2",
            "domain2 :: persistence.dto",
      }
)
package com.reproducer.modulith.domain1;
