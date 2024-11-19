package PipelineFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rehma
 */

import DataAcessLayer.Student;
import java.util.ArrayList;
import java.util.List;

public class FilterPipeline {
    private final List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public boolean execute(Student student) {
        for (Filter filter : filters) {
            if (!filter.apply(student)) {
                return false; // Fail the pipeline if any filter fails.
            }
        }
        return true;
    }
}
