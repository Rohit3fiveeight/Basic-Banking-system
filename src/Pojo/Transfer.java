package Pojo;

public class Transfer {
	private String transferfrom;
	private String transferto;
	private int amount;

    public Transfer(String transferfrom2, String transferto2, int amount2) {
		this.amount = amount2;
		this.transferfrom = transferfrom2;
		this.transferto = transferto2;
	}

	public String getTransferfrom() {
        return transferfrom;
    }

    public void setTransferfrom(String transferfrom) {
        this.transferfrom = transferfrom;
    }

    public String getTransferto() {
        return transferto;
    }

    public void setTransferto(String transferto) {
        this.transferto = transferto;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}


