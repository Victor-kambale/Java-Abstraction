package com.victor.task6;

public class Nurse extends MedicalStaff {
    public int assignedWards;

    public Nurse(String employeeId, String department, double workingHours, int i) {
        super(employeeId, department, workingHours);
        this.assignedWards = assignedWards;
    }

    @Override
    public void performDuties() {
        System.out.println("[NURSE ROLE]: Administering patient treatment logs across "
                + assignedWards + "wards"
        );
    }
}
