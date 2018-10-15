package com.netcracker.repos;

import com.netcracker.models.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    List<Developer> findByName(String name);
}
