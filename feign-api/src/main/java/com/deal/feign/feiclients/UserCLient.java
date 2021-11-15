package com.deal.feign.feiclients;

import com.deal.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userservice")
public interface UserCLient {

    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
