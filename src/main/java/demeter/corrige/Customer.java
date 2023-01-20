package demeter.corrige;

public class Customer {
	private Wallet wallet;

	public Customer() {

	}

	public Customer(Wallet wallet) {
		this.wallet = wallet;
	}

	public double makePayment(double amount) {
		if (wallet.getMoney() >= amount) {
			wallet.setMoney(wallet.getMoney() - amount);
			return amount;
		}

		return 0.0;
	}

	/**
	 * Getter for wallet
	 * 
	 * @return the wallet
	 */
	protected Wallet getWallet() {
		return wallet;
	}

	/**
	 * Setter
	 * 
	 * @param wallet the wallet to set
	 */
	protected void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
}
