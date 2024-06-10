package com.reproducer.modulith.domain1;

import org.springframework.stereotype.Service;

import com.reproducer.modulith.domain2.Domain2Service;
import com.reproducer.modulith.domain2.persistence.Domain2Repository;
import com.reproducer.modulith.domain2.persistence.dto.Domain2DTO;

@Service
public class Domain1Service {
   private final Domain2Repository domain2Repository;

   Domain1Service( Domain2Repository domain2Repository) {
      this.domain2Repository = domain2Repository;
   }

   public void doStuff( Domain2DTO domain2DTO ) {
      domain2Repository.add( domain2DTO );
      System.out.println("Domain1Service.doStuff: " + domain2DTO.id());
   }
}
