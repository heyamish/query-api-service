package com.example.cdr.dto;

import java.time.LocalDateTime;

import com.example.cdr.entity.CallDetailRecord;

public record CdrResponse(
    LocalDateTime recordDate,
    String msisdn,
    String imsi
) {
  public static CdrResponse fromEntity(CallDetailRecord e) {
    return new CdrResponse(e.getRecordDate(), e.getMsisdn(), e.getImsi());
  }
}
