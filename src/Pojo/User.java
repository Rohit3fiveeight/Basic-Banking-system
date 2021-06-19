package Pojo;

public class User {
	private int account_id;
	private String name;
	private String email;
	private int Balance;
	public User(int accountid, String name2, String email2, int balance2) {
		// TODO Auto-generated constructor stub
		this.account_id = accountid;
        this.name = name2;
        this.email = email2;
        this.Balance = balance2;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}

	}
	


