package com.moyeohaeng.tripplannerbo.menu.repository;

import com.moyeohaeng.tripplannerbo.menu.domain.Menu;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface MenuCustomRepository {

    List<Menu> menuInfoList();
    Menu useSaveChildren(String menuNo);
}
