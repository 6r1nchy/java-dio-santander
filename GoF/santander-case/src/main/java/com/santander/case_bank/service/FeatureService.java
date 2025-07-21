package com.santander.case_bank.service;

import com.santander.case_bank.model.Feature;
import java.util.List;

public interface FeatureService {
    List<Feature> getAllFeatures();
    Feature getFeatureById(Long id);
    Feature createFeature(Feature feature);
    void deleteFeature(Long id);
}
