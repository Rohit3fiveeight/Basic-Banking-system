package Service;

import Dao.UserDao;
import Pojo.User;
import Util.DbConnection;

public class RegisterService {

	public static boolean processRegisrteration(String name, String email, int balance, int accountId) {
		  User user=new User(accountId,name,email,balance);
          UserDao dao = new UserDao(DbConnection.getConnection());
          boolean count = dao.saveUser(user);
		return count;
	}
}
