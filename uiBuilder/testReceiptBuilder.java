
public class testReceiptBuilder {
	
	public static void main(String[] args) {
	
	ReceiptBuilder textStyleReceipt = new TextReceipt();
	
	ReceiptDirector receiptDirector = new ReceiptDirector(textStyleReceipt);
	
	receiptDirector.makeReceipt();
	
	Receipt firstReceipt = receiptDirector.getReceipt();
	
	System.out.println(firstReceipt.getTitle());
	System.out.println(firstReceipt.getText());
	
	}
	
}
