package twitter;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TweetsDAOImpl implements TweetsDAO {
	
	private Connection conn;

	public TweetsDAOImpl() {
		conn = DBConnection.getConnection();
	}

	public void addNewTweet(Tweets tweets) throws SQLException {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tweets (t_body, u_id,likes) VALUES (?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, tweets.getT_body());
		ps.setInt(2, tweets.getU_id());
		ps.setInt(3,tweets.getLikes());
		int res = ps.executeUpdate();
		if (res > 0) {
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
            
            System.out.println("Tweet ID: "+t_id);
            System.out.println("Tweet Body: "+t_body);
            System.out.println("User Id of Person who Twitted the Tweet: "+u_id);
	    }
    }    
	
	public void updateMyTweet(int t_id, String newTweetBody) throws SQLException {
	    String query = "UPDATE tweets SET t_body = ? WHERE t_id = ?";
	    PreparedStatement ps = conn.prepareStatement(query);
	    ps.setString(1, newTweetBody);
	    ps.setInt(2, t_id);
	    int res = ps.executeUpdate();
	    if (res > 0) {
	        System.out.println("Tweet updated successfully!");
	    } else {
	        System.out.println("Failed to update tweet!");
	    }
	}

	@Override
	public void deleteMyTweet(int t_id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from tweets where t_id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, t_id);
		int res = ps.executeUpdate();
		if (res > 0) {
	        System.out.println("Tweet deleted successfully!");
	    } else {
	        System.out.println("Failed to delete tweet!");
	    }
		
	}

	@Override
	public void viewAllTweet() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from tweets";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			int t_id = res.getInt("t_id");
			String t_body = res.getString("t_body");
			int u_id = res.getInt("u_id");
			int likes = res.getInt("likes");
			
			System.out.println("Tweet ID: "+t_id);
            System.out.println("Tweet Body: "+t_body);
            System.out.println("User Id of Person who Twitted the Tweet: "+u_id);
            System.out.println("Likes:" +likes);
            System.out.println("--------------------------------------------------");
		}
	}

}
