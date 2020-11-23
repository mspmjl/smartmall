package com.smartmall.mallthirdparty;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallThirdPartyApplicationTests {
    @Value("${coupon.user}")
    @Test
    void contextLoads() {
    }

}
