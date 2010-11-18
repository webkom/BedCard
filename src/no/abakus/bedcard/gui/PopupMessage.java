package no.abakus.bedcard.gui;

public class PopupMessage {
	private String title;
	private String description;
		
	public PopupMessage() {
		super();
	}

	public PopupMessage(String title, String description) {
		super();
		this.title = title;
		this.description = description;
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
	
}
