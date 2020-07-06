package com.ederantonio.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ederantonio.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatus(String ticketId);
}
