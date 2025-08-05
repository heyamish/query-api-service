package com.example.cdr.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.cdr.entity.CallDetailRecord;


public interface CallDetailRecordRepository extends JpaRepository<CallDetailRecord, Long> {

    @Query("SELECT c FROM CallDetailRecord c " +
           "WHERE c.recordDate BETWEEN :start AND :end " +
           "AND (:msisdn IS NULL OR c.msisdn = :msisdn) " +
           "AND (:imsi IS NULL OR c.imsi = :imsi)")
    List<CallDetailRecord> queryByFilters(
        @Param("start") LocalDateTime start,
        @Param("end") LocalDateTime end,
        @Param("msisdn") String msisdn,
        @Param("imsi") String imsi
    );
}
