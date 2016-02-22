package com.dk.groupware.message.model;

public class Message {

	/*
	 * 글번호,제목,내용,날짜,보내는 유저,받는 유저,읽음 확인
	 */
	private int no;
	private String title, content, sdate;
	private int sender, receiver;
	private String rdate, file_name;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	@Override
	public String toString() {
		return "Message [no=" + no + ", title=" + title + ", content=" + content + ", sdate=" + sdate + ", sender="
				+ sender + ", receiver=" + receiver + ", rdate=" + rdate + ", file_name=" + file_name + "]";
	}

	
	
	
	
}