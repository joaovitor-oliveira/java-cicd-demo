package com.joaovitor.democicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class DemoControllerTest {

    @Test
    void SimpleTestForCICD() {
        ResponseEntity<Integer> expect = new ResponseEntity<Integer>(HttpStatus.OK);
        Assertions.assertEquals(expect.getStatusCode(), HttpStatus.OK);
    }
}
