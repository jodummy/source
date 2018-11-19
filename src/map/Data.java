package map;

import java.util.Date;
import java.util.Objects;

public class Data {
	int year;
	String address;
	Date startDate;

	@Override
	public int hashCode() {
		return Objects.hash(year, address, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Data == false)
			return false;
		Data d = (Data) obj;
		return this.year == d.year && Objects.equals(this.address, d.address)
				&& Objects.equals(this.startDate, d.startDate);
	}
}
