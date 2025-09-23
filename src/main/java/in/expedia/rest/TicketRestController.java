package in.expedia.rest;

import java.util.Collection;



import in.expedia.bindings.Passenger;
import in.expedia.bindings.Ticket;
import in.expedia.service.TicketService;

@RestController
public class TicketRestController {
	@Autowired
	private TicketService service;

	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p) {
		Ticket ticket = service.bookTicket(p);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

	@GetMapping("/tickets")
	public ResponseEntity<Collection<Ticket>> getTickets() {
		Collection<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<>(allTickets, HttpStatus.OK);
	}
}
