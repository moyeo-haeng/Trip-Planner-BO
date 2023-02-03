package com.moyeohaeng.tripplannerbo.menu.service;

import com.moyeohaeng.tripplannerbo.menu.domain.Menus;
import com.moyeohaeng.tripplannerbo.menu.domain.response.MenuResponse;
import com.moyeohaeng.tripplannerbo.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuService {
	
	private final MenuRepository menuRepository;
	
	public List<MenuResponse> menuInfoList() {
        List<Menus> menus = menuRepository.findAll();
        return menus.stream().map(MenuResponse::new).collect(Collectors.toList());
    }
}
