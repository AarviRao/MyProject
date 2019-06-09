package com.slokam.pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "whats_app")
public class WhatsAppPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int persionId;
	@Column(name = "person_name")
	private String personName;
	@Column(name = "person_mail")
	private String personMail;

	public WhatsAppPojo() {

	}

	public WhatsAppPojo(int persionId, String personName, String personMail) {
		super();
		this.persionId = persionId;
		this.personName = personName;
		this.personMail = personMail;
	}

	public int getPersionId() {
		return persionId;
	}

	public void setPersionId(int persionId) {
		this.persionId = persionId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonMail() {
		return personMail;
	}

	public void setPersonMail(String personMail) {
		this.personMail = personMail;
	}

	@Override
	public String toString() {
		return "WhatsAppPojo [persionId=" + persionId + ", personName=" + personName + ", personMail=" + personMail
				+ "]";
	}

}
