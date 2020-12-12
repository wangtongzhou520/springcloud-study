package com.springcloud.study.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon基础配置
 * ￿
 *
 * @author wangtongzhou
 * @since 2020-12-11 22:18
 */
//@Configuration
//public class RibbonConfig {
//    @Bean
//    public IRule randomRule() {
//        return new RandomRule();
//    }
//}
