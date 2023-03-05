package com.orj.oranjes.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.orj.oranjes.repository.TeamRepository;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
}
