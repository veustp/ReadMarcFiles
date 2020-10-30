package libis.be.ReadMarcFiles;

import java.util.List;

public class Tag {
	private String tagCode;
	private char ind1;
	private char ind2;
	private String tagContent;
	private List<SubField> subfieldList;
	public String getTagCode() {
		return tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}
	public char getInd1() {
		return ind1;
	}
	public void setInd1(char ind1) {
		this.ind1 = ind1;
	}
	public char getInd2() {
		return ind2;
	}
	public void setInd2(char ind2) {
		this.ind2 = ind2;
	}
	public String getTagContent() {
		return tagContent;
	}
	public void setTagContent(String tagContent) {
		this.tagContent = tagContent;
	}
	public List<SubField> getSubfieldList() {
		return subfieldList;
	}
	public void setSubfieldList(List<SubField> subfieldList) {
		this.subfieldList = subfieldList;
	}

}
