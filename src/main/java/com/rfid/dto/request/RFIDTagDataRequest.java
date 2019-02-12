package com.rfid.dto.request;

import java.util.Date;

public class RFIDTagDataRequest {

	private String rfid_tage;
	private String rfid_reader_name;
	private Date timestamp;

	public RFIDTagDataRequest() {
		super();
	}

	public RFIDTagDataRequest(String rfid_tage, String rfid_reader_name, Date timestamp) {
		super();
		this.rfid_tage = rfid_tage;
		this.rfid_reader_name = rfid_reader_name;
		this.timestamp = timestamp;
	}

	public String getRfid_tage() {
		return rfid_tage;
	}

	public void setRfid_tage(String rfid_tage) {
		this.rfid_tage = rfid_tage;
	}

	public String getRfid_reader_name() {
		return rfid_reader_name;
	}

	public void setRfid_reader_name(String rfid_reader_name) {
		this.rfid_reader_name = rfid_reader_name;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "RFIDTagData [rfid_tage=" + rfid_tage + ", rfid_reader_name=" + rfid_reader_name + ", timestamp="
				+ timestamp + "]";
	}

}
