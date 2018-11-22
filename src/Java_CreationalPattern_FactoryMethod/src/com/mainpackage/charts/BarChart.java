package com.mainpackage.charts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

public class BarChart implements Chart {

	@Override
	public void makeCharts(String A , String B , String C , int a, int b, int c) {
		ObservableList<PieChart.Data > pieChartData = 
				FXCollections.observableArrayList(
						new PieChart.Data (A , a ) , 
						new PieChart.Data (B , b ) ,
						new PieChart.Data (C , c ) 
						) ;
		       
		final PieChart piechart = new PieChart(pieChartData) ;
	}

}
