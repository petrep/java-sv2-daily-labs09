package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

	private String extraCode;

	public FrontOfStageTicket(String band, LocalDateTime startTime, int price, String extraCode) {
		super(band, startTime, price);
		this.extraCode = extraCode;
	}

	public String getExtraCode() {
		return extraCode;
	}

	@Override
	public LocalTime entryTime() {
		return super.entryTime().minusHours(1);
	}
}
