package com.jmlim.hotclub.model.club;

import java.util.Date;
import java.util.List;

import com.jmlim.hotclub.model.member.Member;

public class Meeting {

	private Integer id;

	private String title;

	private Date meetingDate;

	private String place;

	private String attendCosts;

	private Integer quota;

	private Club parent;

	private List<Member> attachMembers;

}
