package intro.news;

public class NewsVO {

	private int idx;
	private String msg;
	// �߰��Ѵٸ� �ۼ���, ����, �����, ��ȸ�� ���..
	
	public NewsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsVO(int idx, String msg) {
		super();
		this.idx = idx;
		this.msg = msg;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "NewsVO [idx=" + idx + ", msg=" + msg + "]";
	}
}
