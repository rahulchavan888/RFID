package com.rfid.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rfid.dto.request.RFIDTagDataRequest;
import com.rfid.dto.responce.RFIDTagDataResponce;
import com.rfid.entity.RFIDTagScanHistory;
import com.rfid.service.RFIDService;

@RestController
@RequestMapping("/rfid")
public class RFIDController {

	@Autowired
	private RFIDService rfidService;

	// rest end-point for accept scanned RFID tag
	@RequestMapping(value = "/post-tag-data", method = RequestMethod.POST)
	ResponseEntity<?> getRFIDDataFromReder(@RequestBody RFIDTagDataRequest rfidTagDataRequest) {
		System.out.println(rfidTagDataRequest.toString());
		rfidService.saveRFIDScanData(rfidTagDataRequest);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	// rest end-point for to send scanned RFID tag data
	@RequestMapping(value = "/get-tag-data", method = RequestMethod.GET)
	ResponseEntity<?> postRFIDDataFrom() {

		List<RFIDTagScanHistory> scanHistories = rfidService.getAllRFIDTagScanHistory();
		return new ResponseEntity<>(scanHistories, HttpStatus.OK);
	}

}
