package com.moyeohaeng.tripplannerbo.menu.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moyeohaeng.tripplannerbo.menu.service.MenuService;

@Controller
@RequiredArgsConstructor
@RequestMapping("menu")
public class MenuController {
	
	private final MenuService menuService;
	
    @GetMapping("/menuList")
    public ResponseEntity<List<MenuRes>> menuList() {
    	final List<MenuRes> menuList = menuService.menuList();
        return ResponseEntity.ok(menuList);
    }
}
