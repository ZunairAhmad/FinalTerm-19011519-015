package services;

import models.DiseaseRemarks;
import models.Patient;

import java.util.List;

public interface PatientService {

    boolean exists(Patient patient);

    boolean hasDisease(Patient patient);

    Patient savePatient(Patient diseases);
}
