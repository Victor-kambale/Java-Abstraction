package com.victor.task6;

public abstract class MedicalStaff {

    public String employeeId;
    public String department;
    public double workingHours;

    public MedicalStaff(String employeeId, String department, double workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }

    public void showBaseDetails() {
        System.out.println("ID: "
                + employeeId + "\nDept: "
                + department + "\nHours: "
                + workingHours);
    }

    public abstract void performDuties();
}
