package com.moyeohaeng.tripplannerbo.menu.domain.response;

@Getter
public class MenuRes {
	
    private Long menu_no;
	
    private String menu_name;
    
    private String menu_url;

    private int menu_seq;
    
    private String site_divi_cd;
    
    private List<MenuRes> children;
    
    public MenuRes(final MenuModel menuModel) {
    	this.menu_no = menuModel.getMenu_no();
    	this.menu_name = menuModel.getMenu_name();
    	this.menu_url = menuModel.getMenu_url();
    	this.menu_seq = menuModel.getMenu_seq();
    	this.site_divi_cd = menuModel.getSite_divi_cd();
    	this.children = menuModel.getChildren().stream().map(MenuRes::new).collect(Collectors.toList());
    }
}
