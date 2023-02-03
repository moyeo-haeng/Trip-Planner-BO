package com.moyeohaeng.tripplannerbo.menu.domain;

@Entity
@Getter
@Setter
@Table(name="menu")
public class MenuModel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menu_no;
	
    private String menu_name;
    
    private String menu_url;

    private int menu_seq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_parent_no")
    private Menu parent;
    
    private String site_divi_cd;

    @OneToMany(mappedBy = "parent")
    private List<MenuModel> children = new ArrayList<>();
}