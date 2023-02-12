package com.moyeohaeng.tripplannerbo.common.controller;

import com.moyeohaeng.tripplannerbo.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CommonController {

    private final MenuService menuService;

    @GetMapping("/")
    public String login() {
        return "common/login";
    }

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("menuInfoList", menuService.menuInfoList());
        return "common/main";
    }

    @GetMapping("/comm-cd-mgmt")
    public String commCdMgmt() {
        return "common/commCdMgmt";
    }

    @GetMapping("/calendarTest")
    public String calendarTest() {
        return "common/calendar";
    }

    @GetMapping("/layerPopupTest")
    public String layerPopupTest() {
        return "common/layerPopup";
    }

    @GetMapping("/message")
    public String messagePageRender(Model model) {
        model.addAttribute("price" , 1000);
        return "sample/message";
    }
}
