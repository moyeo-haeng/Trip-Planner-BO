package com.moyeohaeng.tripplannerbo.menu.repository;

@Repository
@RequiredArgsConstructor
public class MenuRepository extends JpaRepository<MenuModel, Long> {
	
	private final JPAQueryFactory queryFactory;

	public List<MenuModel> menuList() {
		QMenuModel parent = new QMenuModel("parent");
        QMenuModel child = new QMenuModel("child");

        return queryFactory.selectFrom(parent)
                .distinct()
                .leftJoin(parent.children, child)
                .fetchJoin()
                .where(
                        parent.parent.isNull()
                )
                .orderBy(parent.menu_seq.asc(), child.menu_seq.asc())
                .fetch();
    }
}
