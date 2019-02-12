package com.rfid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfid.entity.RFIDTagScanHistory;

public interface RFIDTagScanHistoryRepository extends JpaRepository<RFIDTagScanHistory, Long> {

}
