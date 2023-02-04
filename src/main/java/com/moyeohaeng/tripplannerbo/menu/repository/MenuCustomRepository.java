package com.moyeohaeng.tripplannerbo.menu.repository;

import com.moyeohaeng.tripplannerbo.menu.domain.Menus;

import java.util.List;

public interface MenuCustomRepository {

    public List<Menus> menuInfoList(String menuParentNo);
}
