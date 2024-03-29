package twitter;

import java.sql.SQLException;

public interface TweetsDAO {

	public void addNewTweet(Tweets tweets) throws SQLException;
	public void viewMyTweet(int u_id)throws SQLException;
}
