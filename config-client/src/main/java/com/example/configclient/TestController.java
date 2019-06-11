package com.example.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class TestController {

    @Value("${profile}")
    private String profile;



    @RequestMapping("/getConfig")
    public String profile() {
       return profile;
    }


    @Value("${gitprofile}")
    private String gitprofile;

    @RequestMapping("/getGitprofile")
    public String getGitprofile() {
        return gitprofile;
    }
}
