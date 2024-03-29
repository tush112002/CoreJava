package twitter;

import java.sql.SQLException;

public interface UserDAO {
	
	public void signUp(Users users) throws SQLException;
	public void signIn(String u_email) throws SQLException;
	public void viewProfile(int u_id) throws SQLException;
	public void updateProfile();
	
}
