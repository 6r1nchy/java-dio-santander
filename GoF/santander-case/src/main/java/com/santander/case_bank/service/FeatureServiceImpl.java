package com.santander.case_bank.service;

import com.santander.case_bank.model.Feature;
import com.santander.case_bank.repository.FeatureRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FeatureServiceImpl implements FeatureService {

    private final FeatureRepository featureRepository;

    public FeatureServiceImpl(FeatureRepository featureRepository) {
        this.featureRepository = featureRepository;
    }

    @Override
    public List<Feature> getAllFeatures() {
        return featureRepository.findAll();
    }

    @Override
    public Feature getFeatureById(Long id) {
        return featureRepository.findById(id).orElseThrow();
    }

    @Override
    public Feature createFeature(Feature feature) {
        return featureRepository.save(feature);
    }

    @Override
    public void deleteFeature(Long id) {
        featureRepository.deleteById(id);
    }
}
