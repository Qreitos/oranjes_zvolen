package com.orj.oranjes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.orj.oranjes.model.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    Team getTeamByName(String name);
}
