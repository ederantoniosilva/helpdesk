package com.ederantonio.helpdesk.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ederantonio.helpdesk.api.enums.StatusEnum;

@Document
public class ChangeStatus {

	@Id
	private String id;
	
	@DBRef
	private Ticket ticket;
	
	private User userChance;
	
	private Date dateChanceStatus;
	
	private StatusEnum status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUserChance() {
		return userChance;
	}

	public void setUserChance(User userChance) {
		this.userChance = userChance;
	}

	public Date getDateChanceStatus() {
		return dateChanceStatus;
	}

	public void setDateChanceStatus(Date dateChanceStatus) {
		this.dateChanceStatus = dateChanceStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
	
	
	
}
