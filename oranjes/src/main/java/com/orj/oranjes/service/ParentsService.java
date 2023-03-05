package com.orj.oranjes.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.orj.oranjes.repository.ParentsRepository;

@Service
@RequiredArgsConstructor
public class ParentsService {

    private final ParentsRepository parentsRepository;
}
