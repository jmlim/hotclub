package com.jmlim.hotclub.model.member;

import java.util.Date;
import java.util.List;

import com.jmlim.hotclub.model.club.Club;
import com.jmlim.hotclub.model.common.Image;

public class Member {

	private Integer id;

	private String authId;

	private String password;

	private String name;

	private String description;

	private String phoneNumber;

	private Date birthday;

	private Image image;

	// 객체로 바뀔 가능성 존재
	private List<String> places;

	// 객체로 바뀔 가능성 존재
	private List<String> hobbies;

	private List<Club> joinClubs;

	private Date joinDate;
}
