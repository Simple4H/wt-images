package com.simple4h;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class WtImagesApplicationTests {

    @Test
    void contextLoads() {
        String originalFilename = "132.txt";
        int index = originalFilename.lastIndexOf('.');
        String suffix = originalFilename.substring(index);
        System.out.println(suffix);
    }

}
