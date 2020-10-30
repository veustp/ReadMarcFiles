package libis.be.ReadMarcFiles;

import java.util.List;

public class Record {
	private String Leader;
	private List<Tag> tagList;
	public String getLeader() {
		return Leader;
	}
	public void setLeader(String leader) {
		Leader = leader;
	}
	public List<Tag> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
}
