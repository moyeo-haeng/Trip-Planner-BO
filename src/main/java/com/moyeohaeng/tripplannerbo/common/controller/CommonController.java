package com.moyeohaeng.tripplannerbo.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/")
    public String login() {
        return "common/login";
    }

    @GetMapping("/main")
    public String main() {
        return "common/main";
    }

    @GetMapping("/comm-cd-mgmt")
    public String commCdMgmt() {
        return "common/commCdMgmt";
    }
}
