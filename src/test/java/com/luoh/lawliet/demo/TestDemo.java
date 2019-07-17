package com.luoh.lawliet.demo;

import com.luoh.lawliet.LawlietApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: luoh
 * @Date: 2019-07-17 10:24
 * @Description:
 */
@Service
@RunWith(SpringRunner.class)
@SpringBootTest(classes= LawlietApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestDemo {
}
