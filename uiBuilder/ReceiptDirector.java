
public class ReceiptDirector {
	
	private ReceiptBuilder _receiptBuilder;
	
	public ReceiptDirector(ReceiptBuilder receiptBuilder) {
		
		_receiptBuilder = receiptBuilder;
		
	}
	
	public Receipt getReceipt() {
		
		return _receiptBuilder.getReceipt();
				
	}
	
	public void makeReceipt() {
		
		_receiptBuilder.buildTitle();
		_receiptBuilder.buildText();
		_receiptBuilder.buildSection();
		
	}
	
}