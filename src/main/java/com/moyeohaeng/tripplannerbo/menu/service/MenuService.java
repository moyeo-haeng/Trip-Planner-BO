package com.moyeohaeng.tripplannerbo.menu.service;

import com.moyeohaeng.tripplannerbo.menu.domain.Menus;
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
//        List<Menus> menus = menuCustomRepository.menuInfoList("0");
//        return menus.stream().map(MenuResponse::new).collect(Collectors.toList());
        return null;
    }

    public void menuForm(MenuRequest menuRequest) {
        Menus menus = new Menus(menuRequest);
        System.out.println(menus);
//        menuRepository.save(menus);
    }
}
