package application.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Activity implements Serializable{

	@Id
	@GeneratedValue
	private int idActivity;
	
	@Temporal (TemporalType.DATE)
	private Date yearActivity;
	private String natureActivity;
	private String titleActivity;
	private String description;
	private String website;
	
	@EmbeddedId
	private Person person;
	
	public int getIdActivity() {
		return idActivity;
	}
	public void setIdActivity(int idActivity) {
		this.idActivity = idActivity;
	}
	
	public Date getYearActivity() {
		return yearActivity;
	}
	public void setYearActivity(Date yearActivity) {
		this.yearActivity = yearActivity;
	}
	
	public String getNatureActivity() {
		return natureActivity;
	}
	public void setNatureActivity(String natureActivity) {
		this.natureActivity = natureActivity;
	}
	
	public String getTitleActivity() {
		return titleActivity;
	}
	public void setTitleActivity(String titleActivity) {
		this.titleActivity = titleActivity;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
}
