
public class JavaFxReceipt implements ReceiptBuilder {
	
	private Receipt _receipt;
	
	public JavaFxReceipt() {
		this._receipt = new Receipt();
	}

	@Override
	public void buildTitle() {
		_receipt.setTitle("Rentals Record for Toto");
		
	}

	@Override
	public void buildText() {
		_receipt.setText("\tRogue One\t15.0 \n\tReine des neiges\t7.5 \n\tStar Wars III\t9.5 \nAmount owned is 32.0\nYou earned 4 frequent renter points");
		
	}

	@Override
	public void buildSection() {
		_receipt.setSection("Section");
	}
	
	public Receipt getReceipt() {
		return _receipt;
	}
	
}

