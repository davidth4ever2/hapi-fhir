package ca.uhn.fhir.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import ca.uhn.fhir.model.dstu.resource.Patient;

@Entity
@DiscriminatorValue("PATIENT")
public class PatientResourceTable extends BaseResourceTable<Patient> {

	@Override
	public Class<Patient> getResourceType() {
		return Patient.class;
	}

}
