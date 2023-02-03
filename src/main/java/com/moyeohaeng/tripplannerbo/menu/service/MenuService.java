package com.moyeohaeng.tripplannerbo.menu.service;

@Service
@RequiredArgsConstructor
public class MenuService {
	
	private final MenuRepository menuRepository;
	
	public List<MenuRes> menuList() {
        final List<MenuModel> menuList = menuRepository.menuList();
        return menuList.stream().map(MenuRes::new).collect(Collectors.toList());
    }
}
