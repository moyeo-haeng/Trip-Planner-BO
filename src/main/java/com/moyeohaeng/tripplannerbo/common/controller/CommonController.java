package com.moyeohaeng.tripplannerbo.common.controller;

import com.moyeohaeng.tripplannerbo.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
@RequiredArgsConstructor
public class CommonController {

    private final MenuService menuService;

    @Autowired
    private MessageSource messageSource;

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
        model.addAttribute("test", messageSource.getMessage("error", new Object[]{}, Locale.getDefault()));
        model.addAttribute("hello", messageSource.getMessage("replace.hello", new String[]{"name"}, Locale.getDefault()));
        return "sample/message";
    }
}
