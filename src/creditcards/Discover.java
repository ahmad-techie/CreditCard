package creditcards;

public class Discover extends CreditCard{

	public Discover(String[] ccDetails) {
		super(ccDetails);
	}

	@Override
	public String toString() {
		return "Discover:\n=========== \nCardNumber: " + getCardNumber() + "\nHolderName: " + getCcHolderName() + "\nexpirationDate: "
				+ getExpirationDate()+"\ncsv: "+ getCsv();
	}
}
