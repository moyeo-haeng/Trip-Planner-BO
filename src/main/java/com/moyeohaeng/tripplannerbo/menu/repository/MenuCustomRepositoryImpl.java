package com.moyeohaeng.tripplannerbo.menu.repository;

import com.moyeohaeng.tripplannerbo.menu.domain.Menus;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MenuCustomRepositoryImpl implements MenuCustomRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Menus> menuInfoList(String menuParentNo) {
        return null;
    }
}
