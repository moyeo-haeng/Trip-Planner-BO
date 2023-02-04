package com.moyeohaeng.tripplannerbo.menu.controller;

import com.moyeohaeng.tripplannerbo.menu.domain.request.MenuRequest;
import com.moyeohaeng.tripplannerbo.menu.domain.response.MenuResponse;
import com.moyeohaeng.tripplannerbo.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
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
    public ResponseEntity<List<MenuResponse>> menuInfoList() {
        return ResponseEntity.ok(menuService.menuInfoList());
    }

    @GetMapping("/menuForm")
    public void menuForm() {
        MenuRequest menuRequest = MenuRequest.builder()
                                  .menuNo("1")
                                  .menuName("메뉴")
                                  .menuUrl("/menu/menuList")
                                  .menuSeq(1)
                                  .menuParentNo("0")
                                  .siteDiviCd("00")
                                  .regId("CEO")
                                  .regDtime(LocalDate.now().atStartOfDay())
                                  .uptId("")
                                  .uptDtime(LocalDate.now().atStartOfDay())
                                  .build();

        menuService.menuForm(menuRequest);
    }
}
