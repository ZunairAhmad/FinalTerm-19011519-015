package services;

import models.DiseaseRemarks;

import java.util.List;

public interface DiseaseService {

    boolean exists(DiseaseRemarks disease);

    DiseaseRemarks saveDiseaseRemarks(DiseaseRemarks diseases);

    DiseaseRemarks getDiseaseRemarksByValue(String disease);

    List<DiseaseRemarks> getAllDiseaseRemarkss();
}
