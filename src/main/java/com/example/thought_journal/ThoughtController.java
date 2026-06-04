package com.example.thought_journal;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/thoughts")
@CrossOrigin(origins = "*") // Allows your frontend to talk to the backend safely
public class ThoughtController {

    private final ThoughtRepository repository;

    public ThoughtController(ThoughtRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Thought> getAllThoughts() {
        return repository.findAllByOrderByCreatedAtDesc();
    }

    @PostMapping
    public Thought createThought(@RequestBody Thought thought) {
        return repository.save(thought);
    }
}