package gov.nist.healthcare.tools.hl7.v2.portal.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usefulLinks")
public class UsefulLinks {
	
	@Id
	private String id;
	
	private String category;	//subheading the link falls under, e.g. 'ONC Certification Program'
	private List<String> linkDescriptions = new ArrayList<String>();	//e.g. the text displayed as the link
	private List<String> links = new ArrayList<String>();				//e.g. the actual url
	
	public UsefulLinks(String id, String category, List<String> links) {
		super();
		this.id = id;
		this.category = category;
		this.links = links;
	}
	public UsefulLinks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getLinkDescriptions() {
		return linkDescriptions;
	}
	public void setLinkDescriptions(List<String> linkDescriptions) {
		this.linkDescriptions = linkDescriptions;
	}
	public List<String> getLinks() {
		return links;
	}
	public void setLinks(List<String> links) {
		this.links = links;
	}
}