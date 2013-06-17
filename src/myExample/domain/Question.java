package myExample.domain;


public class Question {

	private String answera;
	private String answerb;
	private String answerc;
	private String answerd;
	private String answerkey;
	private int answersort;
	private String answertitle;
	private String answertype;
	private String createdate;
	private String invaliddate;
	private String sid;
	private String status; // 是否可用；数据库中的是int。1：可用；0：不可用
	public String getAnswera() {
		return answera;
	}
	public String getAnswerb() {
		return answerb;
	}
	public String getAnswerc() {
		return answerc;
	}
	public String getAnswerd() {
		return answerd;
	}
	public String getAnswerkey() {
		return answerkey;
	}
	public int getAnswersort() {
		return answersort;
	}
	public String getAnswertitle() {
		return answertitle;
	}
	public String getAnswertype() {
		return answertype;
	}
	public String getCreatedate() {
		return createdate;
	}
	public String getInvaliddate() {
		return invaliddate;
	}
	public String getSid() {
		return sid;
	}
	public String getStatus() {
		return status;
	}
	public void setAnswera(String answera) {
		this.answera = answera;
	}
	public void setAnswerb(String answerb) {
		this.answerb = answerb;
	}
	public void setAnswerc(String answerc) {
		this.answerc = answerc;
	}
	public void setAnswerd(String answerd) {
		this.answerd = answerd;
	}
	public void setAnswerkey(String answerkey) {
		this.answerkey = answerkey;
	}
	public void setAnswersort(int answersort) {
		this.answersort = answersort;
	}
	public void setAnswertitle(String answertitle) {
		this.answertitle = answertitle;
	}
	public void setAnswertype(String answertype) {
		this.answertype = answertype;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public void setInvaliddate(String invaliddate) {
		this.invaliddate = invaliddate;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Question [sid=" + sid + ", answertitle=" + answertitle
				+ ", answera=" + answera + ", answerb=" + answerb
				+ ", answerc=" + answerc + ", answerd=" + answerd
				+ ", answerkey=" + answerkey + ", answertype=" + answertype
				+ ", createdate=" + createdate + ", invaliddate=" + invaliddate
				+ ", status=" + status + ", answersort=" + answersort + "]";
	}

}
