package com.santander.case_bank.controller;

import com.santander.case_bank.model.Feature;
import com.santander.case_bank.service.FeatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/features")
public class FeatureController {

    private final FeatureService service;

    public FeatureController(FeatureService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Feature>> getAll() {
        return ResponseEntity.ok(service.getAllFeatures());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Feature> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getFeatureById(id));
    }

    @PostMapping
    public ResponseEntity<Feature> create(@RequestBody Feature feature) {
        return ResponseEntity.ok(service.createFeature(feature));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteFeature(id);
        return ResponseEntity.noContent().build();
    }
}
