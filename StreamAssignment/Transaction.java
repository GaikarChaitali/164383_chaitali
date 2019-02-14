package StreamAssignment;

public class Transaction {
	int year,value;
	Trader trader;

	public Transaction(Trader trader,int year, int value) {
		
		super();
		this.trader=trader;
		this.year = year;
		this.value = value;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	

	@Override
	public String toString() {
		return "Transaction [year=" + year + ", value=" + value + ", trader="
				+ trader + "]";
	}

	public String getCity() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
