package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

	@Test
	public void setupTest() {
		Ticket ticket1 = new Ticket("MyBand", LocalDateTime.of(2019, Month.MARCH, 28, 14, 33), 20);
		Ticket ticket2 = new FrontOfStageTicket("MyBand", LocalDateTime.of(2019, Month.MARCH, 28, 14, 33), 20, "x");

		LocalDateTime ld1 = LocalDateTime.of(2019, Month.MARCH, 28, 14, 33);
		System.out.println(ticket1.entryTime(new Person(ticket1),ld1.toLocalDate()));

	}

	@Test
	void initTest() {
		Ticket ticket = new Ticket("GNR", LocalDateTime.parse("2021-05-08T21:00"), 18_000);

		assertEquals("GNR", ticket.getBand());
		assertEquals(LocalDateTime.of(2021, 5, 8, 21, 0), ticket.getStartTime());
		assertEquals(18_000, ticket.getPrice());
		assertEquals(LocalTime.parse("20:00"), ticket.entryTime());
	}

}