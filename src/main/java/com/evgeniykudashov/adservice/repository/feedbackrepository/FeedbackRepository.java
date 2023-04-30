package com.evgeniykudashov.adservice.repository.feedbackrepository;

import com.evgeniykudashov.adservice.model.domain.aggregate.feedback.Feedback;
import org.springframework.data.repository.ListCrudRepository;

public interface FeedbackRepository extends ListCrudRepository<Feedback, Long> {
}