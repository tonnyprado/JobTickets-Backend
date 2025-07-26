package org.example.Repository;

import org.example.Model.JobInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTicketRepository extends JpaRepository<JobInfo, Long> {
}
