package com.jmlim.hotclub.model.club;

public class Menu {

	private Integer id;

	private MenuType type;

	private String title;

	private Club parentClub;

	//null 가능
	private Menu parenMenu;
}
