package com.moyeohaeng.tripplannerbo.menu.controller;

import com.moyeohaeng.tripplannerbo.menu.domain.response.MenuResponse;
import com.moyeohaeng.tripplannerbo.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("menu")
public class MenuController {
	
	private final MenuService menuService;
	
    @GetMapping("/menuList")
    public String menuList() {
        return "menu/menuList";
    }

    @PostMapping("/menuInfoList")
    public List<MenuResponse> menuInfoList() {
        return menuService.menuInfoList();
    }

    @GetMapping("/menuForm")
    public String menuForm() {
        return "menu/menuForm";
    }
}
