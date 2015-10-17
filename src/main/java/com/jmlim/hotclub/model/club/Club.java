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

	/*
	 * private List<String> area;
	 * 
	 * private List<Meeting> meetings;
	 * 
	 * private List<Menu> menus;
	 */

	/*
	 * 이거 관련하여 테이블 하나 필요.
	 **/
	private List<Member> joiningMembers;

	private Date createdDate;
}
