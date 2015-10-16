package com.jmlim.hotclub.model.article;

import java.util.Date;
import java.util.List;

import com.jmlim.hotclub.model.club.Menu;
import com.jmlim.hotclub.model.common.Comment;
import com.jmlim.hotclub.model.common.Image;
import com.jmlim.hotclub.model.member.Member;

public class PhotoAlbum {

	private String id;

	private String title;
	// 공통으로 사용할 객체
	private List<Image> attachImages;

	private Menu parent;

	private Date createdDate;

	private List<Member> likeMembers;

	private List<Comment> comments;
}
