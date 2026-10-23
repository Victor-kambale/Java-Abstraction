package com.victor.task6;

public class Doctor extends MedicalStaff {

    public String speciality;

    public Doctor(String employeeId,String department,double workingHours,String speciality) {
        super(employeeId, department, workingHours);
        this.speciality = speciality;
    }

    @Override
    public void performDuties() {
        System.out.println("[DOCTOR ROLE]: Diagnosing patients and prescribing medications in"
                + speciality
        );
    }
}
