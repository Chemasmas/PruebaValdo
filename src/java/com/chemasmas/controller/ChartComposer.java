/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chemasmas.controller;

import org.zkoss.chart.Charts;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
//import org.zkoss.zul.CategoryModel;
import org.zkoss.zul.SimpleCategoryModel;
import org.zkoss.zul.Window;
import org.zkoss.chart.model.DefaultCategoryModel;
import org.zkoss.chart.model.CategoryModel;

public class ChartComposer extends SelectorComposer<Window> {
 
    @Wire
    Charts chart;
 
    public void doAfterCompose(Window comp) throws Exception {
        super.doAfterCompose(comp);
 
        CategoryModel model = new DefaultCategoryModel(); 
        
        // Create a predefined implementation category model
        //CategoryModel model = new SimpleCategoryModel();
 
        // Set value to the model
        
        model.setValue("Tokyo", "Spring", new Integer(11));
        model.setValue("Tokyo", "Summer", new Integer(20));
        model.setValue("Tokyo", "Fall", new Integer(16));
        model.setValue("Tokyo", "Winter", new Integer(-2));
        model.setValue("New York", "Spring", new Integer(6));
        model.setValue("New York", "Summer", new Integer(12));
        model.setValue("New York", "Fall", new Integer(10));
        model.setValue("New York", "Winter", new Integer(2));
 
        // Set model to the chart
        chart.setModel(model);
    }
}