package com.orj.oranjes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.orj.oranjes.model.entity.Parents;

@Repository
public interface ParentsRepository extends JpaRepository<Parents, Long> {
}
