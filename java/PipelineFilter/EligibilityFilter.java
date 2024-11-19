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
public class EligibilityFilter implements Filter {
    @Override
    public boolean apply(Student student) {
        return student.getHomeDistance() > 10;
    }
}
