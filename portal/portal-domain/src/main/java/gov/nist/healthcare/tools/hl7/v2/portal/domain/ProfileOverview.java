package gov.nist.healthcare.tools.hl7.v2.portal.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profileOverview")
public class ProfileOverview {
	
	@Id
	private String id;
	
	private String category;	//ex. 'HL7 V2.5.1 Implementation Guide Laboratory Results Interface for US Realm, Release 1'
	private String domain;		//ex. 'ss(Syndromic Surveillance)' or 'all'
	private String title;		//ex. 'ADT_A01'
	private String description;
	private String profileLink;
	private String valueLink;
	private String constraintLink;
	public ProfileOverview(String id, String category, String title, String description, String profileLink,
			String valueLink, String constraintLink) {
		super();
		this.id = id;
		this.category = category;
		this.title = title;
		this.description = description;
		this.profileLink = profileLink;
		this.valueLink = valueLink;
		this.constraintLink = constraintLink;
	}
	public ProfileOverview() {
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
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProfileLink() {
		return profileLink;
	}
	public void setProfileLink(String profileLink) {
		this.profileLink = profileLink;
	}
	public String getValueLink() {
		return valueLink;
	}
	public void setValueLink(String valueLink) {
		this.valueLink = valueLink;
	}
	public String getConstraintLink() {
		return constraintLink;
	}
	public void setConstraintLink(String constraintLink) {
		this.constraintLink = constraintLink;
	}
	
	
}