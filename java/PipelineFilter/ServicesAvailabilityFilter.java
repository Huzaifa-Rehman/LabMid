/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PipelineFilter;

import DataAcessLayer.Student;

/**
 *
 * @author rehma
 */
public class ServicesAvailabilityFilter implements Filter {
    @Override
    public boolean apply(Student student) {
        if (student.needsAdditionalServices()) {
            System.out.println("Offering additional services to " + student.getName());
        }
        return true; // Always passes for service availability.
    }
}