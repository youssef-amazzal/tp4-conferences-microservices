package edu.amazzal.conferenceservice.mapper;

import edu.amazzal.conferenceservice.dto.ReviewDTO;
import edu.amazzal.conferenceservice.entity.Conference;
import edu.amazzal.conferenceservice.entity.Review;

public class ReviewMapper {

    public static Review mapToReview(ReviewDTO dto, Conference conference) {
        if (dto == null) {
            return null;
        }

        Review review = new Review();
        review.setId(dto.getId());
        review.setDate(dto.getDate());
        review.setTexte(dto.getTexte());
        review.setNote(dto.getNote());
        review.setConference(conference);
        return review;
    }

    public static ReviewDTO mapToReviewDTO(Review entity) {
        if (entity == null) {
            return null;
        }

        ReviewDTO dto = new ReviewDTO();
        dto.setId(entity.getId());
        dto.setDate(entity.getDate());
        dto.setTexte(entity.getTexte());
        dto.setNote(entity.getNote());
        dto.setConferenceId(
                entity.getConference() != null ? entity.getConference().getId() : null
        );
        return dto;
    }
}
