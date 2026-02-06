package com.example.kartonpredmeta.service;

import com.example.kartonpredmeta.dto.LearningOutcomeDTO;
import com.example.kartonpredmeta.model.LearningOutcome;

import java.util.List;



public interface LearningOutcomeService {
    LearningOutcome create(LearningOutcome learningOutcome);
    List<LearningOutcomeDTO> findByCourse(Long courseId);
}
