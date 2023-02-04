package com.moyeohaeng.tripplannerbo.menu.controller;

import com.moyeohaeng.tripplannerbo.menu.domain.request.MenuRequest;
import com.moyeohaeng.tripplannerbo.menu.domain.response.MenuResponse;
import com.moyeohaeng.tripplannerbo.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String menuList(Model model) {
        model.addAttribute("menuInfoList", menuService.menuInfoList());
        return "menu/menuList";
    }

    @GetMapping("/menuInfoList")
    public List<MenuResponse> menuInfoList() {
        return menuService.menuInfoList();
    }

    @GetMapping("/menuForm")
    public void menuForm() {
        MenuRequest menuRequest = MenuRequest.builder()
                                  .menuName("메뉴")
                                  .menuUrl("")
                                  .menuSeq(1)
                                  .menuParentNo("")
                                  .siteDiviCd("00")
                                  .useYn("Y")
                                  .regId("CEO")
                                  .regDtime(LocalDate.now().atStartOfDay())
                                  .uptId("")
                                  .uptDtime(LocalDate.now().atStartOfDay())
                                  .build();

        menuService.menuForm(menuRequest);
    }
}
