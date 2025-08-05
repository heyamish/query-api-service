package com.example.cdr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cdr.dto.QueryRequest;
import com.example.cdr.entity.CallDetailRecord;
import com.example.cdr.repository.CallDetailRecordRepository;

@Service
public class CdrQueryService {

  private final CallDetailRecordRepository repo;

  public CdrQueryService(CallDetailRecordRepository repo) {
    this.repo = repo;
  }

  public List<CallDetailRecord> query(QueryRequest req) {

    return repo.queryByFilters(
      req.recordDateStart(),
      req.recordDateEnd(),
      req.msisdn(),
      req.imsi()
    );
  }
}
