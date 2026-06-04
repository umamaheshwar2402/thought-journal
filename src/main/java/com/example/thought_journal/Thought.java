package com.example.thought_journal;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Thought {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 1000) // Allows longer journal entries
    private String content;
    
    private String moodColor; // Stores hex codes (e.g., #E8D7FF)
    private LocalDateTime createdAt = LocalDateTime.now();

    // Boilerplate: Constructors, Getters, and Setters
    public Thought() {}

    public Long getId() { return id; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getMoodColor() { return moodColor; }
    public void setMoodColor(String moodColor) { this.moodColor = moodColor; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}