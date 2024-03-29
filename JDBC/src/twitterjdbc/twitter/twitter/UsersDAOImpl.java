package twitter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsersDAOImpl implements UserDAO {

	private Connection conn;

	public UsersDAOImpl() {
		conn = DBConnection.getConnection();
	}

	@Override
	public void signUp(Users users) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into users (u_name,u_email,u_pswd,u_id,u_avatar) values(?,?,?,?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, users.getU_name());
		preparedStatement.setString(2, users.getU_email());
		preparedStatement.setString(3, users.getU_pswd());
		preparedStatement.setInt(4, users.getU_id());
		preparedStatement.setString(5, users.getU_avatar());
		int res = preparedStatement.executeUpdate();
		System.out.println(+res+" User is created");
	}

	@Override
	public void signIn(String u_email) throws SQLException {
		
		String query = "select * from users where u_email = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1,u_email);
		ResultSet res = preparedStatement.executeQuery();
		if(res.next()) {
			System.out.println("User exists");
		}
		else {
			System.out.println("User doesn't exists pls signup!");
		}
	}

	@Override
	public void viewProfile(int u_id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from users where u_id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setInt(1,u_id);
		ResultSet res = preparedStatement.executeQuery();
		
		while(res.next()) {
			System.out.println("User ID: " + res.getInt("u_id"));
            System.out.println("User Name: " + res.getString("u_name"));
            System.out.println("User Email: " + res.getString("u_email"));
            System.out.println("User Bio: " + res.getString("u_bio"));
            System.out.println("User Avatar: " + res.getString("u_avatar"));
		}

	}
	
	public void updateProfile(Users users) throws SQLException {
		 String query = "UPDATE users SET u_name = ?, u_email = ?, u_pswd = ?, u_bio = ?, u_avatar = ? WHERE u_id = ?";
		 PreparedStatement preparedStatement = conn.prepareStatement(query);
         preparedStatement.setString(1, users.getU_name());
         preparedStatement.setString(2, users.getU_email());
         preparedStatement.setString(3, users.getU_pswd());
         preparedStatement.setString(4, users.getU_bio());
         preparedStatement.setString(5, users.getU_avatar());
         preparedStatement.setInt(6, users.getU_id());
         int rowsAffected = preparedStatement.executeUpdate();
         if (rowsAffected > 0) {
             System.out.println("Profile updated successfully!");
         } else {
             System.out.println("Failed to update profile!");
         }
				
	}

	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub
		
	}

}((res == 1) ? true : false);
