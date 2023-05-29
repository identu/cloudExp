package org.exp.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider11001")
public interface UserFeignService {
    @GetMapping("/hello/say")
    String Hello();
}
