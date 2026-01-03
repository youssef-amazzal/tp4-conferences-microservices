package edu.amazzal.conferenceservice.repository;

import edu.amazzal.conferenceservice.dto.ReviewDTO;
import edu.amazzal.conferenceservice.entity.Conference;
import edu.amazzal.conferenceservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findReviewsByConferenceId(Long conferenceId);

}