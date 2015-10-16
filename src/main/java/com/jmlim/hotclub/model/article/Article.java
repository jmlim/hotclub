package com.jmlim.hotclub.model.article;

import java.util.Date;
import java.util.List;

import com.jmlim.hotclub.model.club.Menu;
import com.jmlim.hotclub.model.common.Comment;
import com.jmlim.hotclub.model.common.Image;
import com.jmlim.hotclub.model.member.Member;

public class Article {

	private Integer id;

	private String title;

	private String content;

	private Menu parent;

	private Member writer;

	// 공통으로 사용할 객체
	private List<Comment> comments;

	// 공통으로 사용할 객체
	private List<Image> attachImages;

	private List<Member> likeMembers;

	private Date createdDate;

	private Date updatedDate;

}
