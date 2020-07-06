package com.ederantonio.helpdesk.api.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ederantonio.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String>{

	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages,String userId);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc(
			String title,String status,String priority,Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc(
			String title,String status,String priority,Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssignedUserIdOrderByDateDesc(
			String title,String status,String priority,Pageable pages);
	
	Page<Ticket> findByNumber(Integer number,Pageable pages);
}
