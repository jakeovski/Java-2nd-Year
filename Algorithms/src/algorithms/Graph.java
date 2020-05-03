/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

//Imports for JFreeChart
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Graph plotting class
 *
 * @author Vladimir Bardadom / 1807132
 */
public class Graph extends JFrame {
    /**
     * 2D array of countSort and BubbleSort data
     */
    double[][] data;
    /**
     * Determines which graph you want to create // 1 For BubbleSort Graph, 0 for CountSort
     */
    int index;
    /**
     * Name of the graph, either countSourt title or BubbleSort, will depend on the index
     */
    String[] graphName;
    
    public Graph(double[][] data, int index) {
        this.data = data;
        this.index = index;
        this.graphName = new String[]{"CountSort Complexity","BubbleSort Complexity"};
        initUI();
    }

    private void initUI() {
        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Complexity Chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private XYDataset createDataset() {
        
        var series = new XYSeries("");
        series.add(1,data[index][0]);
        series.add(10,data[index][1]);
        series.add(50,data[index][2]);
        series.add(100,data[index][3]);
        series.add(200, data[index][4]);
        series.add(300, data[index][5]);
        series.add(400, data[index][6]);
        series.add(500, data[index][7]);
        series.add(600, data[index][8]);
        series.add(700, data[index][9]);
        series.add(800, data[index][10]);
        series.add(900,data[index][11]);
        series.add(1000,data[index][12]);
        series.add(1500, data[index][13]);
        
        var dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        
        return dataset;
    }
    
    private JFreeChart createChart(XYDataset dataset) {
        
        JFreeChart chart = ChartFactory.createXYLineChart(
                graphName[index],
                "Array Size",
                "Complexity",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        
        XYPlot plot = chart.getXYPlot();
        
        var renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        
        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);
        
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);
        
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);
        
        chart.getLegend().setFrame(BlockBorder.NONE);
        
        chart.setTitle(new TextTitle(graphName[index],new Font("Serif",java.awt.Font.BOLD,18)));
        
        return chart;
        
    }
    
}
