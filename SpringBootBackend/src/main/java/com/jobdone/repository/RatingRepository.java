package com.jobdone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobdone.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

}
