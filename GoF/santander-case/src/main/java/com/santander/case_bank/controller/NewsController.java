package com.santander.case_bank.controller;

import com.santander.case_bank.model.News;
import com.santander.case_bank.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService service;

    public NewsController(NewsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<News>> getAll() {
        return ResponseEntity.ok(service.getAllNews());
    }

    @GetMapping("/{id}")
    public ResponseEntity<News> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getNewsById(id));
    }

    @PostMapping
    public ResponseEntity<News> create(@RequestBody News news) {
        return ResponseEntity.ok(service.createNews(news));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteNews(id);
        return ResponseEntity.noContent().build();
    }
}
