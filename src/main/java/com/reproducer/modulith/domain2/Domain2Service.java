package com.reproducer.modulith.domain2;

import org.springframework.stereotype.Service;

import com.reproducer.modulith.domain2.persistence.dto.Domain2DTO;

@Service
public class Domain2Service {
   public void doStuff( Domain2DTO domain2DTO ) {
      System.out.println("Domain2Service.doStuff: " + domain2DTO.id());
   }
}
