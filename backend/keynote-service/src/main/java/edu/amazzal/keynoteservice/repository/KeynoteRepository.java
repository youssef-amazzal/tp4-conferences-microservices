package edu.amazzal.keynoteservice.repository;

import edu.amazzal.keynoteservice.entity.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KeynoteRepository extends JpaRepository<Keynote, Long> {
}
