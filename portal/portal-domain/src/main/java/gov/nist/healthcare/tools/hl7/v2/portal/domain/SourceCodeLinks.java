package gov.nist.healthcare.tools.hl7.v2.portal.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sourceCodeLinks")
public class SourceCodeLinks {
	
	@Id
	private String id;
	
	private String name;
	private String link;
	public SourceCodeLinks(String id, String name, String link) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
	}
	public SourceCodeLinks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}