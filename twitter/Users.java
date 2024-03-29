package twitter;

public class Users {
    private int u_id;
    private String u_name;
    private String u_email;
    private String u_password;
    private String u_bio;
    private String u_avatar;
	private String u_pswd;
    
    public Users(int u_id, String u_name, String u_email, String u_pswd, String u_bio, String u_avatar) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_email = u_email;
        this.u_pswd = u_pswd;
        this.u_bio = u_bio;
        this.u_avatar = u_avatar;
    }

    public int getU_id() {
		return u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public String getU_email() {
		return u_email;
	}

	public String getU_pswd() {
		return u_pswd;
	}

	public String getU_bio() {
		return u_bio;
	}

	public String getU_avatar() {
		return u_avatar;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_email=" + u_email + ", u_pswd=" + u_pswd
				+ ", u_bio=" + u_bio + ", u_avatar=" + u_avatar + "]";
	}
	
}
