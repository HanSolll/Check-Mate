package com.checkmate.vo;

public class HomeworkVO {

	private int h_no;
	private String u_id;
	private int g_no;
	private String h_title;
	private String h_content;
	private String h_file;
	private String h_date;
	private int h_flag;
	private String h_deadline;
	private int h_score;
	
	public int getH_no() {
		return h_no;
	}
	public void setH_no(int h_no) {
		this.h_no = h_no;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public int getG_no() {
		return g_no;
	}
	public void setG_no(int g_no) {
		this.g_no = g_no;
	}
	public String getH_title() {
		return h_title;
	}
	public void setH_title(String h_title) {
		this.h_title = h_title;
	}
	public String getH_content() {
		return h_content;
	}
	public void setH_content(String h_content) {
		this.h_content = h_content;
	}
	public String getH_file() {
		return h_file;
	}
	public void setH_file(String h_file) {
		this.h_file = h_file;
	}

	public int getH_flag() {
		return h_flag;
	}
	public void setH_flag(int h_flag) {
		this.h_flag = h_flag;
	}
	public String getH_deadline() {
		return h_deadline;
	}
	public void setH_deadline(String h_deadline) {
		this.h_deadline = h_deadline;
	}
	public String getH_date() {
		return h_date;
	}
	public void setH_date(String h_date) {
		this.h_date = h_date;
	}
	public int getH_score() {
		return h_score;
	}
	public void setH_score(int h_score) {
		this.h_score = h_score;
	}
	
	@Override
	public String toString() {
		return "HomeworkVO [h_no=" + h_no + ", u_id=" + u_id + ", g_no=" + g_no + ", h_title=" + h_title
				+ ", h_content=" + h_content + ", h_file=" + h_file + ", h_date=" + h_date + ", h_flag=" + h_flag
				+ ", h_deadline=" + h_deadline + ", h_score=" + h_score + "]";
	}
}
