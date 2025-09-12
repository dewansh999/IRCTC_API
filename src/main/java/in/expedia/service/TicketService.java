package in.expedia.service;

import java.util.Collection;

import in.expedia.bindings.Passenger;
import in.expedia.bindings.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger p);

	public Collection<Ticket> getAllTickets();

}
