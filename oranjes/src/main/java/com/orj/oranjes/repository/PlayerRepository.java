package com.orj.oranjes.repository;

import com.orj.oranjes.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.orj.oranjes.model.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    Player getPlayerByTeam(Team team);
}
