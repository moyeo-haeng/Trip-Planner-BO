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

	@GetMapping("/menuInfoList2")
	@ResponseBody
	public Map menuInfoList2() {
		Map result = new HashMap<String, Object>();
		Map result2 = new HashMap<String, Object>();
		Map result3 = new HashMap<String, Object>();

		result3.put("page", 1);
		result3.put("totalCount", 100);

		result2.put("contents", menuService.menuInfoList());
		result2.put("pagination", result3);


		result.put("result", true);
		result.put("data", result2);
		return result;
	}

    @GetMapping("/menuSave")
    public void menuSave(MenuRequest menuRequest) {
        MenuRequest menuFormInfo = MenuRequest.builder()
                                  			  .menuName("메뉴")
                                			  .menuUrl("")
                                			  .menuSeq(1)
                                			  .menuParentNo(null)
                                			  .siteDiviCd("00")
                                			  .useYn("Y")
                                			  .regId("CEO")
                                			  .regDtime(LocalDate.now().atStartOfDay())
                                			  .uptId("")
                                			  .uptDtime(LocalDate.now().atStartOfDay())
                                			  .build();

    	if(menuRequest.getMenuParentNo() == null) {
    		menuService.menuSave(menuFormInfo);
    	} else {
    		menuService.menuChildSave(menuFormInfo);
    	}
    }
    
}
