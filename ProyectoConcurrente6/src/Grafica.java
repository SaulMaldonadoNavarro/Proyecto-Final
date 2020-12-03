import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.*;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
public class Grafica {
    String tipo;
    XYSeries data1,data2,data3,data4,data5,data6,data7,data8,data9,data10;
    XYSeriesCollection dataset;   
    JFrame ventana;
    private ArrayList<ChartPanel> paneles;
    
    Grafica(String tipo){
        this.tipo = tipo;
        dataset = new XYSeriesCollection();
        

        paneles = new ArrayList<ChartPanel>();
    }
    
    
    public void addSerie(XYSeries aux){
        dataset.addSeries(aux);
    }
    
    public void graficar(){
       JFreeChart grafica = ChartFactory.createXYLineChart("Comportamiento - "+tipo,"X","Y",dataset,PlotOrientation.VERTICAL,true,true,false);
       XYPlot plot = grafica.getXYPlot();
       ChartPanel panel = new ChartPanel(grafica);
       JFrame ventana = new JFrame("Grafica");
       ventana.setSize(1000,700);
       ventana.setVisible(true);
       ventana.add(panel);
       System.out.println("Tamaño de array "+paneles.size());
    }
    
    /*public void addPanel(int ndron){
           switch(ndron){
           case 1:
            ventana.add(paneles.get(0));
            break;
            
            case 2:
                paneles.get(0).setBounds(0,0,300,500);
                paneles.get(1).setBounds(300,0,300,500);
                ventana.add(paneles.get(1));
            break;

            
            case 4:
            break;
 
            
            case 6:
            break;
   
            
            case 7:
            break;
  
            
            case 8:
            break;            
        
        }
    }*/

        
        
    }
    
