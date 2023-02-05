package com.moyeohaeng.tripplannerbo.menu.repository;

import com.moyeohaeng.tripplannerbo.menu.domain.Menu;
import com.moyeohaeng.tripplannerbo.menu.domain.QMenu;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MenuCustomRepositoryImpl implements MenuCustomRepository{

    private final JPAQueryFactory queryFactory;

    private final EntityManager em;

    @Override
    public List<Menu> menuInfoList() {
        return em.createQuery("select m from Menu m where m.parent is null", Menu.class).getResultList();
    }
}
