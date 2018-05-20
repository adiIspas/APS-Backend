package com.aps.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSum() {
        TestFile testFile = new TestFile();
        assert testFile.sum(1,2) == 3;
    }

}
