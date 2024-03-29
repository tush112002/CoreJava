package twitter;

public class Tweets {
    private int t_id;
    private String t_body;
    private int u_id;
    private int likes;

    // Constructor
    public Tweets(int t_id, String t_body, int u_id, int likes) {
        this.t_id = t_id;
        this.t_body = t_body;
        this.u_id = u_id;
        this.likes = likes;
    }

    // Getters
    public int getT_id() {
        return t_id;
    }

    public String getT_body() {
        return t_body;
    }

    public int getU_id() {
        return u_id;
    }

    public int getLikes() {
        return likes;
    }

	@Override
	public String toString() {
		return "Tweets [t_id=" + t_id + ", t_body=" + t_body + ", u_id=" + u_id + ", likes=" + likes + "]";
	}
    
}