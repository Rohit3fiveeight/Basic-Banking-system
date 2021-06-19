package Service;

import Dao.TransferDao;
import Pojo.Transfer;
import Util.DbConnection;

public class TransferService {

	public static int processTranfer(String transferfrom, String transferto, int amount) {
		Transfer t=new Transfer(transferfrom,transferto,amount);  
        TransferDao dao=new TransferDao(DbConnection.getConnection());
        int p=dao.transferSuccess(t);
		return p;
	}

}
