/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicesLayer;

import DataAcessLayer.Student;
import ObserverPattren.HostelManagementSystem;
import ObserverPattren.Observer;
import PipelineFilter.EligibilityFilter;
import PipelineFilter.FilterPipeline;
import PipelineFilter.PaymentFilter;
import PipelineFilter.ServicesAvailabilityFilter;


/**
 *
 * @author rehma
 */

public class HostelService {
    private final FilterPipeline pipeline = new FilterPipeline();
    private final HostelManagementSystem managementSystem = new HostelManagementSystem();

    public HostelService() {
        // Initialize pipeline
        pipeline.addFilter(new EligibilityFilter());
        pipeline.addFilter(new PaymentFilter());
        pipeline.addFilter(new ServicesAvailabilityFilter());
    }

    public void addObserver(Observer observer) {
        managementSystem.addObserver(observer);
    }

    public void processStudentApplication(Student student) {
        System.out.println("Processing application for " + student.getName());

        if (pipeline.execute(student)) {
            System.out.println("Admission successful for " + student.getName());
            managementSystem.notifyObservers(student);
        } else {
            System.out.println("Admission failed for " + student.getName());
        }
    }
}
