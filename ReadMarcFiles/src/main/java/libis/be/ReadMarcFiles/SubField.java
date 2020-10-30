package libis.be.ReadMarcFiles;

public class SubField {
	private char SubFieldCode;
	private String SubFieldContent;
	public char getSubFieldCode() {
		return SubFieldCode;
	}
	public void setSubFieldCode(char subFieldCode) {
		SubFieldCode = subFieldCode;
	}
	public String getSubFieldContent() {
		return SubFieldContent;
	}
	public void setSubFieldContent(String subFieldContent) {
		SubFieldContent = subFieldContent;
	}
}
