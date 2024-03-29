package assesment;

public class Comment {
	
	int cmtId;
	String cmtDesc;
	
	
	public Comment(){
		
	}
	
	public Comment(int cmtId, String cmtDesc) {
		this.cmtId = cmtId;
		this.cmtDesc = cmtDesc;
	}


	public int getCmtId() {
		return cmtId;
	}


	public void setCmtId(int cmtId) {
		this.cmtId = cmtId;
	}


	public String getCmtDesc() {
		return cmtDesc;
	}


	public void setCmtDesc(String cmtDesc) {
		this.cmtDesc = cmtDesc;
	}
	
	public void printComment() {
		System.out.println("Comment Id: "+cmtId);
		System.out.println("Comment Description: "+cmtDesc);
	}
	
	
	
}
