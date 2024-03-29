package twitter;

import java.sql.SQLException;

public interface TweetsDAO {

	public void addNewTweet(Tweets tweets) throws SQLException;
	public void viewMyTweet(int u_id)throws SQLException;
	public void updateMyTweet(int t_id, String newTweetBody) throws SQLException;
	public void deleteMyTweet(int t_id) throws SQLException;
	public void viewAllTweet() throws SQLException;
}
