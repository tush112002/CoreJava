package twitter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DBConn;

public class TweetsDAOImpl implements TweetsDAO {
	private Connection conn;

	public TweetsDAOImpl() {
		conn = DBConn.getConnection();
//		System.out.println("impl's connection= " + conn.hashCode());
	}

	public void addNewTweet(Tweets tweets) throws SQLException {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tweets (t_body, u_id) VALUES (?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, tweets.getT_body());
		preparedStatement.setInt(2, tweets.getU_id());
		int rowsAffected = preparedStatement.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Tweet added successfully!");
		} else {
			System.out.println("Failed to add tweet!");
		}

	}

	public void viewMyTweet(int u_id) throws SQLException {
		String query = "SELECT * FROM tweets WHERE u_id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setInt(1, u_id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int t_id = resultSet.getInt("t_id");
            String t_body = resultSet.getString("t_body");
            int user_id = resultSet.getInt("u_id");
	    }
    }      
}
