package com.moyeohaeng.tripplannerbo.menu.service;

import com.moyeohaeng.tripplannerbo.menu.domain.Menu;
import com.moyeohaeng.tripplannerbo.menu.domain.request.MenuRequest;
import com.moyeohaeng.tripplannerbo.menu.domain.response.MenuResponse;
import com.moyeohaeng.tripplannerbo.menu.repository.MenuCustomRepository;
import com.moyeohaeng.tripplannerbo.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService {
	
	private final MenuRepository menuRepository;

    private final MenuCustomRepository menuCustomRepository;
	
	public List<MenuResponse> menuInfoList() {
        List<Menu> menuInfoList = menuCustomRepository.menuInfoList();
        return menuInfoList.stream().map(MenuResponse::new).collect(Collectors.toList());
    }

    public void menuSave(MenuRequest menuRequest) {
        Menu menu = new Menu(menuRequest);
        menuRepository.save(menu);
    }
    
    public void menuChildSave(MenuRequest menuRequest) {
    	Menu menu = null;
    	menu.setMenuNo(menuRequest.getMenuParentNo());
    	Menu parent = menuRepository.findById(menu.getMenuNo());
    	Menu children = new Menu(menuRequest);
    	parent.addChildrenmenu(children);
    }
}
