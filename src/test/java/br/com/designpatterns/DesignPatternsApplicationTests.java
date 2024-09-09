package br.com.designpatterns;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternsApplicationTests {

    @Test
    public void applicationStartsSuccessfully() {
        String[] args = {};
        DesignPatternsApplication.main(args);
    }
}
