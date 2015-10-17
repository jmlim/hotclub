package com.jmlim.hotclub.model.common;

import java.util.Date;

import com.jmlim.hotclub.model.member.Member;

public class Comment {

	private Integer id;

	private Integer parentId;
	
	private ParentType parentType;

	private Member writer;
	
	private Date createdDate;
	
	private String content;
}
