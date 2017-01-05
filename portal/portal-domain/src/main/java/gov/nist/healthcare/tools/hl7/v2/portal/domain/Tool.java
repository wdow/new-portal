package gov.nist.healthcare.tools.hl7.v2.portal.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tool")
public class Tool {
	
	@Id
	private String id;
	
private String title;
private String Spec;
public String lastDate;
public String Use;
public String Status;
public List<String> conformanceProfiles= new ArrayList<String>();
public String link;
public String github;
public Tool(String id, String title, String spec, String lastDate, String use, String status,
		List<String> conformanceProfiles, String link, String github) {
	super();
	this.id = id;
	this.title = title;
	Spec = spec;
	this.lastDate = lastDate;
	Use = use;
	Status = status;
	this.conformanceProfiles = conformanceProfiles;
	this.link = link;
	this.github = github;
}
public Tool() {
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
public String getSpec() {
	return Spec;
}
public void setSpec(String spec) {
	Spec = spec;
}
public String getLastDate() {
	return lastDate;
}
public void setLastDate(String lastDate) {
	this.lastDate = lastDate;
}
public String getUse() {
	return Use;
}
public void setUse(String use) {
	Use = use;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public List<String> getConformanceProfiles() {
	return conformanceProfiles;
}
public void setConformanceProfiles(List<String> conformanceProfiles) {
	this.conformanceProfiles = conformanceProfiles;
}
public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}
public String getGithub() {
	return github;
}
public void setGithub(String github) {
	this.github = github;
}

}
