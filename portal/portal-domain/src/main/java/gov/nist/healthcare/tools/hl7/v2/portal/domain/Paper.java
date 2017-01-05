package gov.nist.healthcare.tools.hl7.v2.portal.domain;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "paper")
public class Paper {
	
	@Id
	private String id;
	
	private String title;
	public String date;
	public List<String> authors = new ArrayList<String>();
	public List<String> publications = new ArrayList<String>();
	public String slides;
	
	public Paper(String id, String title, String date, List<String> authors, List<String> publications, String slides) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.authors = authors;
		this.publications = publications;
		this.slides = slides;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public List<String> getPublications() {
		return publications;
	}

	public void setPublications(List<String> publications) {
		this.publications = publications;
	}

	public String getSlides() {
		return slides;
	}

	public void setSlides(String slides) {
		this.slides = slides;
	}

	public Paper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}