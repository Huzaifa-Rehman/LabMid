/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAcessLayer;

/**
 *
 * @author rehma
 */

public class Student {
    private String name;
    private double homeDistance;
    private boolean hasPaidFee;
    private boolean needsAdditionalServices;

    // Constructor
    public Student(String name, double homeDistance, boolean hasPaidFee, boolean needsAdditionalServices) {
        this.name = name;
        this.homeDistance = homeDistance;
        this.hasPaidFee = hasPaidFee;
        this.needsAdditionalServices = needsAdditionalServices;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getHomeDistance() {
        return homeDistance;
    }

    public boolean hasPaidFee() {
        return hasPaidFee;
    }

    public boolean needsAdditionalServices() {
        return needsAdditionalServices;
    }
}
