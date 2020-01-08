package com.deloitte.Hibernate.entityRelationship.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "acard")
public class AadharCard {

	@Id
	@Column(columnDefinition = "number(12)", name = "aid")
	int aid;

	@Column(columnDefinition = "varchar2(20)")
	private String issueAuth;

	@Column(columnDefinition = "Date")
	private Date issueDate;

	@OneToOne(mappedBy = "acard")
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public AadharCard() {
		super();
	}

	public AadharCard(int aid, String issueAuth, Date issueDate) {
		super();
		this.aid = aid;
		this.issueAuth = issueAuth;
		this.issueDate = issueDate;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getIssueAuth() {
		return issueAuth;
	}

	public void setIssueAuth(String issueAuth) {
		this.issueAuth = issueAuth;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

}
