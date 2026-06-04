package com.example.thought_journal;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ThoughtRepository extends JpaRepository<Thought, Long> {
    // Fetches the latest thoughts first
    List<Thought> findAllByOrderByCreatedAtDesc();
}