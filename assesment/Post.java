package assesment;

public class Post {

	int postId;
	String postBody;
	
	void getPostId(int postId) {
		System.out.println("PostID: "+postId);
	}
	
	void getPostBody(String postBody) {
		System.out.println("Body: "+postBody);
	}

	public static void main(String[] args) {
		
	    Post p = new Post();
        
		User us1 = new User(1, "John", new Comment(101, "This is a comment"));
		User us2 = new User(2, "Dean", new Comment(102, "This is a new comment"));
		User us3 = new User(3, "Roman", new Comment(103, "Hey!"));
		User us4 = new User(4, "Seth", new Comment(104, "Hello!"));
		
		p.getPostId(10001);
		p.getPostBody("This is body");
		System.out.println("---------------------------");
		us1.printUser();
		System.out.println("---------------------------");
		us2.printUser();
		System.out.println("---------------------------");
		us3.printUser();
		System.out.println("---------------------------");
		us4.printUser();

	}

}
