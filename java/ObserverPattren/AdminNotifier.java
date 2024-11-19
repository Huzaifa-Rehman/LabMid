/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattren;

import DataAcessLayer.Student;

/**
 *
 * @author rehma
 */

public abstract class AdminNotifier implements Observer {
    public void update(Student student) {
        System.out.println("Admin notified: " + student.getName() + " has been successfully admitted to the hostel.");
    }
}
