package assesment;

public class User {

	int userId;
	String userName;
	Comment userComment;
	 

	public User() {

	}

	public User(int userId, String userName, Comment userComment) {
		this.userId = userId;
		this.userName = userName;
		this.userComment = userComment;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Comment getUserComment() {
		return userComment;
	}

	public void setUserComment(Comment userComment) {
		this.userComment = userComment;
	}
	
	public void printUser() {
		System.out.println("User Id: " +userId);
		System.out.println("User Name: "+userName);
		userComment.printComment();
	}

}
