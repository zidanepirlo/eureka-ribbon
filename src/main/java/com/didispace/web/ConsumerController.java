package com.didispace.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
//        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
//        return restTemplate.getForEntity("http://compute-service/add?a=10&b=20", String.class).getBody();
        //        return restTemplate.getForEntity("http://127.0.0.1:2111/add?a=10&b=20", String.class).getBody();
//        return restTemplate.getForEntity("http://SpringCloudsSrvDemo/add?a=10&b=20", String.class).getBody();
        return restTemplate.getForEntity("http://SpringCloudsSrvDemo/getUserById?id="+"1", String.class).getBody();
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public String getUserById(@RequestParam String id) {
        return restTemplate.getForEntity("http://SpringCloudsSrvDemo/getUserById?id="+id, String.class).getBody();
    }


}