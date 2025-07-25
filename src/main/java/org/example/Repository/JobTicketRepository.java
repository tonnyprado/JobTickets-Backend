package org.example.Repository;

import org.example.Controller.JobInfoConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTicketRepository extends JpaRepository<JobInfoConstructor, Long> {
}
