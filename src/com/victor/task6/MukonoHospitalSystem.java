package com.victor.task6;

public class MukonoHospitalSystem {

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println(" MUKONO HOSPITAL SYSTEM PERSONAL PORTAL ");
        System.out.println("---------------------------------------");

        MedicalStaff doc = new Doctor("DOC001", "Cardiology", 45.0,
                "Heart Surgery"
        );
        MedicalStaff nurse = new Nurse("NUR005", "Emergency", 60.0, 4);

        doc.showBaseDetails();
        doc.performDuties();
        System.out.println();
        nurse.showBaseDetails();
        nurse.performDuties();
    }
}
