package com.moyeohaeng.tripplannerbo.menu.repository;

import com.moyeohaeng.tripplannerbo.menu.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface MenuRepository extends JpaRepository<Menu, String> {
}
