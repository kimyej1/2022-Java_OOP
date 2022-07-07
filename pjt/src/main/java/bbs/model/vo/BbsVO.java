package bbs.model.vo;

/*
 * CREATE TABLE BBS_TBL(
 * 		IDX 	NUMBER PRIMARY KEY,
 * 		SUBJECT VARCHAR2(50),
 * 		CONTENT VARCHAR2(1000),
 * 		WRITER	VARCHAR2(50),
 * 		REGDATE	DATE,
 * 		CNT		NUMBER 
 * );
 */

public class BbsVO {
	
	private int idx ,cnt;
	private String subject, content, writer, regDate;
	
	public BbsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BbsVO(int idx, String subject, String content, String writer, String regDate, int cnt) {
		super();
		this.idx = idx;
		this.cnt = cnt;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "BbsVO [idx=" + idx + ", cnt=" + cnt + ", subject=" + subject + ", content=" + content + ", writer="
				+ writer + ", regDate=" + regDate + "]";
	}
	
	
}
