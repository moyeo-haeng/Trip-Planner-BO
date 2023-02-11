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
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("menu")
public class MenuController {
	
	private final MenuService menuService;
	
    @GetMapping("/menuList")
    public String menuList() {
        return "menu/menuList";
    }

    @GetMapping("/menuInfoList")
	@ResponseBody
    public List<MenuResponse> menuInfoList() {
        return menuService.menuInfoList();
    }

    @GetMapping("/menuSave")
    @ResponseBody
    public void menuSave(MenuRequest menuRequest) {

        MenuRequest saveInfo = MenuRequest.builder()
                                          .menuNo(menuRequest.getMenuNo())
                                          .menuName(menuRequest.getMenuName())
                                          .menuUrl(menuRequest.getMenuUrl())
                                          .menuSeq(menuRequest.getMenuSeq())
                                          .menuParentNo(menuRequest.getMenuParentNo())
                                          .siteDiviCd(menuRequest.getSiteDiviCd())
                                          .useYn(menuRequest.getUseYn())
                                          .regId(menuRequest.getRegId())
                                          .regDtime(LocalDate.now().atStartOfDay())
                                          .build();

    	if(saveInfo.getMenuParentNo() == "") {
    		menuService.menuSave(saveInfo);
    	} else {
    		menuService.menuChildSave(saveInfo);
    	}
    }
    
}
