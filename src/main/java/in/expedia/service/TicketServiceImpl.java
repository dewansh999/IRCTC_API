package in.expedia.service;



import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.expedia.bindings.Passenger;
import in.expedia.bindings.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	Map<Integer, Ticket> db = new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger p) {

		Ticket t = new Ticket();
		Random r = new Random();
		int id = r.nextInt();
		t.setTicketNum(id);
		BeanUtils.copyProperties(p, t);
		t.setStatus("CONFIRMED");
		db.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {

		return db.values();

	}

}
