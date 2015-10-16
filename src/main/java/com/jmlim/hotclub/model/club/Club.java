package com.jmlim.hotclub.model.club;

import java.util.Date;
import java.util.List;

import com.jmlim.hotclub.model.common.Image;
import com.jmlim.hotclub.model.member.Member;

public class Club {

	private Integer id;

	private String title;

	private Image mainImage;

	private String notice;
	
	private Desktop parent;

	/*private List<String> area;

	private List<Meeting> meetings;

	private List<Menu> menus;
*/
	private List<Member> joiningMembers;

	private Date createdDate;
}
