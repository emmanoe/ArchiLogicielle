
public class Receipt implements ReceiptPlan{
	
	private String _title;
	private String _text;
	private String _section;

	@Override
	public void setTitle(String title) {
		_title = title;
	}
	
	public String getTitle() { return _title; }

	@Override
	public void setText(String text) {
		_text = text;
	}
	
	public String getText() { return _text; }

	@Override
	public void setSection(String section) {
		_section = section;
	}
	
	public String getSection() { return _section; }

}
