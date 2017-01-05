package gov.nist.healthcare.tools.hl7.v2.portal.domain;

import java.util.ArrayList;
import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "schemaOverview")
public class SchemaOverview {
	
	@Id
	private String id;
	
	private String title;
	private List<String> versions = new ArrayList<String>(); 
	private List<String> source = new ArrayList<String>();

	public SchemaOverview(String id, String title, List<String> versions, List<String> source) {
		super();
		this.id = id;
		this.title = title;
		this.versions = versions;
		this.source = source;
	}
	public SchemaOverview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getVersions() {
		return versions;
	}
	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	public List<String> getSource() {
		return source;
	}
	public void setSource(List<String> source) {
		this.source = source;
	}
}