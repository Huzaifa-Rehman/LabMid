/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattren;

/**
 *
 * @author rehma
 */

import DataAcessLayer.Student;
import java.util.ArrayList;
import java.util.List;

public class HostelManagementSystem {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Student student) {
        for (Observer observer : observers) {
            observer.update(student);
        }
    }
}
