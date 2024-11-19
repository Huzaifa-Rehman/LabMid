    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PresentationLayer;

import DataAcessLayer.Student;
import ObserverPattren.AdminNotifier;
import ServicesLayer.HostelService;

/**
 *
 * @author rehma
 */
public class PresentationLayer {

    public static void main(String[] args) {
        // Create service
        HostelService hostelService = new HostelService();
        hostelService.addObserver(new AdminNotifier() {});

        // Example students
        Student student1 = new Student("Alice", 15, true, true);
        Student student2 = new Student("Bob", 8, true, false);
        Student student3 = new Student("Charlie", 20, false, true);

        // Process applications
        hostelService.processStudentApplication(student1);
        hostelService.processStudentApplication(student2);
        hostelService.processStudentApplication(student3);
    }
}

