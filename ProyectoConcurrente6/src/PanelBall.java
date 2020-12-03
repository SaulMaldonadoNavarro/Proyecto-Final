import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

import java.util.ArrayList;
public class PanelBall extends JPanel{
    public MiX x;
    public MiY y;
    public NumeroBall nDron;
    public ArrayList<Ball> Drones;
    
    public PanelBall(MiX x, MiY y, NumeroBall nDron, ArrayList<Ball> Drones){
        this.x=x;
        this.y=y;
        this.nDron=nDron;
        this.Drones = Drones;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        for(int i=0;i<Drones.size();i++){
        g2.setColor(Color.black);
        g2.fill(new Ellipse2D.Double(Drones.get(i).x.getX(),Drones.get(i).y.getY(),20,20));
        g2.setColor(Color.white);
        //g2.drawString(String.valueOf(Drones.get(i).id),x.getX()+7,y.getY()+14);
        }
    }
}