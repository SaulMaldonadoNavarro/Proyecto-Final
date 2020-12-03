import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.data.xy.XYSeries;
/**
 * @author saulm
 */
public class ProyectoConcurrente extends javax.swing.JFrame {
    private int mul,i,n,id,k,nDrones, algoritmo;
    private ArrayList<Ball> Drones;
    private PanelBall panelB;
    NumeroBall nDron;
    private MiX x1;
    private MiY y1;
    private Ball b1;
    public ProyectoConcurrente() {
        algoritmo = 0;
        nDrones = 0;
        mul = 1;
        n=1;
        i=0;
        id = 1;
        Drones = new ArrayList<Ball>();
        nDron = new NumeroBall(n);
        x1 = new MiX(0);
        y1 = new MiY(0);
        panelB = new PanelBall(x1,y1,nDron, Drones);
        panelB.setBounds(0,0,1080,500);
        panelB.setOpaque(false); 
        panelB.setVisible(false);
        add(panelB); 
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Salida = new javax.swing.JMenu();
        graficas = new javax.swing.JMenuItem();
        AboutProyect = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        nuevoDron = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        Mutex = new javax.swing.JMenuItem();
        Semaf = new javax.swing.JMenuItem();
        VariableC = new javax.swing.JCheckBoxMenuItem();
        Monitor = new javax.swing.JMenuItem();
        Barrera = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Red de Drones");
        setBounds(new java.awt.Rectangle(0, 0, 1100, 570));
        setMinimumSize(new java.awt.Dimension(1080, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MapaCU3.png"))); // NOI18N

        Salida.setText("File");

        graficas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        graficas.setText("Graficar");
        graficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficasActionPerformed(evt);
            }
        });
        Salida.add(graficas);

        AboutProyect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        AboutProyect.setText("About");
        AboutProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutProyectActionPerformed(evt);
            }
        });
        Salida.add(AboutProyect);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Salida.add(jMenuItem3);

        jMenuBar1.add(Salida);

        jMenu2.setText("Drones");

        nuevoDron.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        nuevoDron.setText("Nuevo Dron (Máximo 10)");
        nuevoDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoDronActionPerformed(evt);
            }
        });
        jMenu2.add(nuevoDron);

        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Sincronización");

        Mutex.setText("Mutex");
        Mutex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutexActionPerformed(evt);
            }
        });
        jMenu8.add(Mutex);

        Semaf.setText("Semaforos");
        Semaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemafActionPerformed(evt);
            }
        });
        jMenu8.add(Semaf);

        VariableC.setText("Variable Condición");
        VariableC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariableCActionPerformed(evt);
            }
        });
        jMenu8.add(VariableC);

        Monitor.setText("Monitor");
        Monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonitorActionPerformed(evt);
            }
        });
        jMenu8.add(Monitor);

        Barrera.setText("Barreras");
        Barrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarreraActionPerformed(evt);
            }
        });
        jMenu8.add(Barrera);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(this,"Gracias por usar.","Proyecto Final Programación Concurrente y Paralela",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void nuevoDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoDronActionPerformed
       //Validación de algoritmo. 
       if(algoritmo>0){
       //Validación de numero de drones 
       if(mul<=5){
        if(nDrones == 0){
            nDrones = 1;
            //JOptionPane.showMessageDialog(this,"Numero de drones: "+nDrones,"Drones.",JOptionPane.PLAIN_MESSAGE);
        }else{
            nDrones = mul*2;
            mul++;
            //JOptionPane.showMessageDialog(this,"Numero de drones: "+nDrones,"Drones.",JOptionPane.PLAIN_MESSAGE);
        }
       }else{
          JOptionPane.showMessageDialog(this,"Número de Drones máximo: "+nDrones,"Error.",JOptionPane.ERROR_MESSAGE); 
       }
       //Crear Drones
      panelB.setVisible(true); 
      if(i<10){
       switch(nDrones){
           case 1:  //Primer Dron
           XYSeries graph1 = new XYSeries("Dron 1");
           MiX x = new MiX(0);
           MiY y = new MiY(0);
           panelB.x=x;
           panelB.y=y;
           Ball dron = new Ball(panelB,x,y,1060,480,id,algoritmo,graph1);
           dron.setName("Dron"+nDron);
           panelB.Drones.add(dron);
           panelB.Drones.get(i).start();
           i++;
           id++;
           panelB.nDron.setConta(n++);
           break;
           
           case 2: 
           panelB.Drones.get(0).aux.clear();
           //Actualizar 1 Dron:
           panelB.Drones.get(0).x.setX(0);
           panelB.Drones.get(0).y.setY(0);
           panelB.Drones.get(0).fX = 540;
           panelB.Drones.get(0).fY = 500;
           //Dron 2
           XYSeries graph2 = new XYSeries("Dron 2");
           MiX x2 = new MiX(540);
           MiY y2 = new MiY(0);
           panelB.x=x2;
           panelB.y=y2;
           Ball dron2 = new Ball(panelB,x2,y2,1080,500,id,algoritmo, graph2);
           dron2.setName("Dron"+nDron);
           panelB.Drones.add(dron2);
           panelB.Drones.get(i).mX = 540;
           panelB.Drones.get(i).start();
           i++;
           id++;
           panelB.nDron.setConta(n++);
           break;
           
           case 4:
           for(k =0; k<panelB.Drones.size(); k++){
               panelB.Drones.get(k).aux.clear();
           }
           //Actualizar Dron 1:
           panelB.Drones.get(0).x.setX(0);
           panelB.Drones.get(0).y.setY(0);
           panelB.Drones.get(0).fX = 540;
           panelB.Drones.get(0).fY = 250;
           //Actualizar Dron 2:
           panelB.Drones.get(1).x.setX(540);
           panelB.Drones.get(1).y.setY(0);
           panelB.Drones.get(1).fX = 1080;
           panelB.Drones.get(1).fY = 250;
           panelB.Drones.get(1).mX = 540;
           // Dron 3
                 XYSeries graph3 = new XYSeries("Dron 3");
                MiX x3 = new MiX(0);
                MiY y3 = new MiY(250);
                panelB.x=x3;
                panelB.y=y3;
                Ball dron3 = new Ball(panelB,x3,y3,540,500,id,algoritmo,graph3);
                dron3.setName("Dron"+nDron);
                panelB.Drones.add(dron3);
                panelB.Drones.get(2).mY = 250;
                i++;
                id++;
                panelB.nDron.setConta(n++);  
           // Dron 4
                XYSeries graph4 = new XYSeries("Dron 4");
                MiX x4 = new MiX(540);
                MiY y4 = new MiY(250);
                panelB.x=x4;
                panelB.y=y4;
                Ball dron4 = new Ball(panelB,x4,y4,1080,500,id,algoritmo,graph4);
                dron4.setName("Dron"+nDron);
                panelB.Drones.add(dron4);
                panelB.Drones.get(3).mX = 540;
                panelB.Drones.get(3).mY = 250;
                i++;
                id++;
                panelB.nDron.setConta(n++); 
                
                panelB.Drones.get(2).start();
                panelB.Drones.get(3).start();                
           break;
           
           case 6:
           for(k =0; k<panelB.Drones.size(); k++){
               panelB.Drones.get(k).aux.clear();
           }               
           //Actualizar Dron 1:
           panelB.Drones.get(0).x.setX(0);
           panelB.Drones.get(0).y.setY(0);
           panelB.Drones.get(0).fX = 540;
           panelB.Drones.get(0).fY = 166;
           //Actualizar Dron 2:
           panelB.Drones.get(1).x.setX(540);
           panelB.Drones.get(1).y.setY(0);
           panelB.Drones.get(1).fX = 1080;
           panelB.Drones.get(1).fY = 166;
           panelB.Drones.get(1).mX = 540;
           //Actualizar Dron 3:
           panelB.Drones.get(2).mY = 332;
           panelB.Drones.get(2).x.setX(0);
           panelB.Drones.get(2).y.setY(166);
           panelB.Drones.get(2).fX = 540;
           panelB.Drones.get(2).fY = 332;
           panelB.Drones.get(2).mX = 0;
           panelB.Drones.get(2).mY = 166;           
           //Actualizar Dron 4:
           panelB.Drones.get(3).x.setX(540);
           panelB.Drones.get(3).y.setY(166);
           panelB.Drones.get(3).fX = 1080;
           panelB.Drones.get(3).fY = 332;
           panelB.Drones.get(3).mX = 540;
           panelB.Drones.get(3).mY = 166;
           //Dron 5
           XYSeries graph5 = new XYSeries("Dron 5");
           MiX x5 = new MiX(0);
           MiY y5 = new MiY(332);
           panelB.x=x5;
           panelB.y=y5;
           Ball dron5 = new Ball(panelB,x5,y5,540,498,id,algoritmo,graph5);
           dron5.setName("Dron"+nDron);
           panelB.Drones.add(dron5);
           panelB.Drones.get(4).mY = 332;
           i++;
           id++;
           panelB.nDron.setConta(n++);
           //Dron 6
           XYSeries graph6 = new XYSeries("Dron 6");
           MiX x6 = new MiX(540);
           MiY y6 = new MiY(332);
           panelB.x=x6;
           panelB.y=y6;
           Ball dron6 = new Ball(panelB,x6,y6,1080,498,id,algoritmo,graph6);
           dron6.setName("Dron"+nDron);
           panelB.Drones.add(dron6);
           panelB.Drones.get(5).mX = 540;
           panelB.Drones.get(5).mY = 332;
           i++;
           id++;
           panelB.nDron.setConta(n++);
           
           panelB.Drones.get(4).start();
           panelB.Drones.get(5).start();
           //*/
           break;
           
           case 8:
           for(k =0; k<panelB.Drones.size(); k++){
               panelB.Drones.get(k).aux.clear();
           }               
           //Actualizar Dron 1:
           panelB.Drones.get(0).x.setX(0);
           panelB.Drones.get(0).y.setY(0);
           panelB.Drones.get(0).fX = 540;
           panelB.Drones.get(0).fY = 125;
           panelB.Drones.get(0).mX = 0;
           panelB.Drones.get(0).mY = 0;           
           //Actualizar Dron 2:
           panelB.Drones.get(1).x.setX(540);
           panelB.Drones.get(1).y.setY(0);
           panelB.Drones.get(1).fX = 1080;
           panelB.Drones.get(1).fY = 125;
           panelB.Drones.get(1).mX = 540;
           panelB.Drones.get(1).mY = 0;
           //Actualizar Dron 3:
           panelB.Drones.get(2).x.setX(0);
           panelB.Drones.get(2).y.setY(125);
           panelB.Drones.get(2).fX = 540;
           panelB.Drones.get(2).fY = 250;
           panelB.Drones.get(2).mX = 0;
           panelB.Drones.get(2).mY = 125;           
           //Actualizar Dron 4:
           panelB.Drones.get(3).x.setX(540);
           panelB.Drones.get(3).y.setY(125);
           panelB.Drones.get(3).fX = 1080;
           panelB.Drones.get(3).fY = 250;
           panelB.Drones.get(3).mX = 540;
           panelB.Drones.get(3).mY = 125;
           //Actualizar Dron 5:
           panelB.Drones.get(4).x.setX(0);
           panelB.Drones.get(4).y.setY(250);
           panelB.Drones.get(4).fX = 540;
           panelB.Drones.get(4).fY = 375;
           panelB.Drones.get(4).mX = 0;
           panelB.Drones.get(4).mY = 250;           
           //Actualizar Dron 6:
           panelB.Drones.get(5).x.setX(540);
           panelB.Drones.get(5).y.setY(250);
           panelB.Drones.get(5).fX = 1080;
           panelB.Drones.get(5).fY = 375;
           panelB.Drones.get(5).mX = 540;
           panelB.Drones.get(5).mY = 250;
           //Dron 7
           XYSeries graph7 = new XYSeries("Dron 7");
           MiX x7 = new MiX(0);
           MiY y7 = new MiY(375);
           panelB.x=x7;
           panelB.y=y7;
           Ball dron7 = new Ball(panelB,x7,y7,540,500,id,algoritmo,graph7);
           dron7.setName("Dron"+nDron);
           panelB.Drones.add(dron7);
           panelB.Drones.get(6).mY = 375;           
           i++;
           id++;
           panelB.nDron.setConta(n++);
           //Dron 8
           XYSeries graph8 = new XYSeries("Dron 8");
           MiX x8 = new MiX(540);
           MiY y8 = new MiY(375);
           panelB.x=x8;
           panelB.y=y8;
           Ball dron8 = new Ball(panelB,x8,y8,1080,500,id,algoritmo,graph8);
           dron8.setName("Dron"+nDron);
           panelB.Drones.add(dron8);
           panelB.Drones.get(7).mX = 540;
           panelB.Drones.get(7).mY = 375;
           i++;
           id++;
           panelB.nDron.setConta(n++);
           
           panelB.Drones.get(6).start();
           panelB.Drones.get(7).start();
           break;
           
           case 10: 
           for(k =0; k<panelB.Drones.size(); k++){
               panelB.Drones.get(k).aux.clear();
           }
           //Actualizar Dron 1:
           panelB.Drones.get(0).x.setX(0);
           panelB.Drones.get(0).y.setY(0);
           panelB.Drones.get(0).fX = 540;
           panelB.Drones.get(0).fY = 100;
           panelB.Drones.get(0).mX = 0;
           panelB.Drones.get(0).mY = 0;
           
           //Actualizar Dron 2:
           panelB.Drones.get(1).x.setX(540);
           panelB.Drones.get(1).y.setY(0);
           panelB.Drones.get(1).fX = 1080;
           panelB.Drones.get(1).fY = 100;
           panelB.Drones.get(1).mX = 540;
           panelB.Drones.get(1).mY = 0;
           //Actualizar Dron 3:
           panelB.Drones.get(2).x.setX(0);
           panelB.Drones.get(2).y.setY(100);
           panelB.Drones.get(2).fX = 540;
           panelB.Drones.get(2).fY = 200;
           panelB.Drones.get(2).mX = 0;
           panelB.Drones.get(2).mY = 100;           
           //Actualizar Dron 4:
           panelB.Drones.get(3).x.setX(540);
           panelB.Drones.get(3).y.setY(100);
           panelB.Drones.get(3).fX = 1080;
           panelB.Drones.get(3).fY = 200;
           panelB.Drones.get(3).mX = 540;
           panelB.Drones.get(3).mY = 100;
           //Actualizar Dron 5:
           panelB.Drones.get(4).x.setX(0);
           panelB.Drones.get(4).y.setY(200);
           panelB.Drones.get(4).fX = 540;
           panelB.Drones.get(4).fY = 300;
           panelB.Drones.get(4).mX = 0;
           panelB.Drones.get(4).mY = 200;           
           //Actualizar Dron 6:
           panelB.Drones.get(5).x.setX(540);
           panelB.Drones.get(5).y.setY(200);
           panelB.Drones.get(5).fX = 1080;
           panelB.Drones.get(5).fY = 300;
           panelB.Drones.get(5).mX = 540;
           panelB.Drones.get(5).mY = 200;
           //Actualizar Dron 7:
           panelB.Drones.get(6).x.setX(0);
           panelB.Drones.get(6).y.setY(300);
           panelB.Drones.get(6).fX = 540;
           panelB.Drones.get(6).fY = 400;
           panelB.Drones.get(6).mX = 0;
           panelB.Drones.get(6).mY = 300;           
           //Actualizar Dron 8:
           panelB.Drones.get(7).x.setX(540);
           panelB.Drones.get(7).y.setY(300);
           panelB.Drones.get(7).fX = 1080;
           panelB.Drones.get(7).fY = 400;
           panelB.Drones.get(7).mX = 540;
           panelB.Drones.get(7).mY = 300;
           //Dron 9
           XYSeries graph9 = new XYSeries("Dron 9");
           MiX x9 = new MiX(0);
           MiY y9 = new MiY(400);
           panelB.x=x9;
           panelB.y=y9;
           Ball dron9 = new Ball(panelB,x9,y9,540,500,id,algoritmo,graph9);
           dron9.setName("Dron"+nDron);
           panelB.Drones.add(dron9);
           panelB.Drones.get(8).mY = 400;
           i++;
           id++;
           panelB.nDron.setConta(n++);
           //Dron 10
           XYSeries graph0 = new XYSeries("Dron 0");
           MiX x0 = new MiX(540);
           MiY y0 = new MiY(400);
           panelB.x=x0;
           panelB.y=y0;
           Ball dron0 = new Ball(panelB,x0,y0,1080,500,id,algoritmo,graph0);
           dron0.setName("Dron"+nDron);
           panelB.Drones.add(dron0);
           panelB.Drones.get(9).mX = 540;
           panelB.Drones.get(9).mY = 400;
           i++;
           id++;
           panelB.nDron.setConta(n++);
           panelB.Drones.get(8).start();
           panelB.Drones.get(9).start();
           break;
           
           default:
               JOptionPane.showMessageDialog(this,"Error al activar más drones","¡Error!.",JOptionPane.ERROR_MESSAGE);
       }       
      } 
  
    }else{
        JOptionPane.showMessageDialog(this,"Error, no hay algoritmo seleccionado.","¡Error!.",JOptionPane.ERROR_MESSAGE);   
       }
    }//GEN-LAST:event_nuevoDronActionPerformed

    private void MutexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutexActionPerformed
        algoritmo = 1;
        if(panelB.Drones.size()>0){
        for(int k=0;k<panelB.Drones.size();k++){
            panelB.Drones.get(k).key = false;
            }
            System.out.println("Mutex");
        }
        this.setVisible(false);
        ProyectoConcurrente PMutex = new ProyectoConcurrente();
        PMutex.algoritmo = 1;
        PMutex.setTitle("Red de Drones con Mutex");
        PMutex.setVisible(true);           
        

    }//GEN-LAST:event_MutexActionPerformed

    private void SemafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemafActionPerformed
        algoritmo = 2;
        if(panelB.Drones.size()>0){
        for(int k=0;k<panelB.Drones.size();k++){
            panelB.Drones.get(k).key = false;
         }
        System.out.println("Semaforo");
        }
        this.setVisible(false);
        ProyectoConcurrente PSemaforo = new ProyectoConcurrente();
        PSemaforo.algoritmo = 2;
        PSemaforo.setTitle("Red de Drones con Semaforo");
        PSemaforo.setVisible(true);
    }//GEN-LAST:event_SemafActionPerformed

    private void VariableCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariableCActionPerformed
        algoritmo = 3;
        if(panelB.Drones.size()>0){
        for(int k=0;k<panelB.Drones.size();k++){
            panelB.Drones.get(k).key = false;
            System.out.println("Variable Condicion");
         }
        }
        this.setVisible(false);
        ProyectoConcurrente PSemaforo = new ProyectoConcurrente();
        PSemaforo.algoritmo = 3;
        PSemaforo.setTitle("Red de Drones con Variable Condicion");
        PSemaforo.setVisible(true);
    }//GEN-LAST:event_VariableCActionPerformed

    private void MonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonitorActionPerformed
        algoritmo = 4;
        if(panelB.Drones.size()>0){
        for(int k=0;k<panelB.Drones.size();k++){
            panelB.Drones.get(k).key = false;
         }
        System.out.println("Monitor");
        }
        this.setVisible(false);
        ProyectoConcurrente PMonitor = new ProyectoConcurrente();
        PMonitor.algoritmo = 4;
        PMonitor.setTitle("Red de Drones con Monitor");
        PMonitor.setVisible(true);
    }//GEN-LAST:event_MonitorActionPerformed

    private void BarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarreraActionPerformed
        algoritmo = 5;
        if(panelB.Drones.size()>0){
        for(int k=0;k<panelB.Drones.size();k++){
            panelB.Drones.get(k).key = false;
         }
        System.out.println("Barrera");
        }
        this.setVisible(false);
        ProyectoConcurrente PBarrera = new ProyectoConcurrente();
        PBarrera.algoritmo = 5;
        PBarrera.setTitle("Red de Drones con Barrera");
        PBarrera.setVisible(true);
    }//GEN-LAST:event_BarreraActionPerformed

    private void graficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficasActionPerformed
        if(nDrones==0){
            
            JOptionPane.showMessageDialog(this,"No hay Drones que graficar","Error.",JOptionPane.ERROR_MESSAGE); 
        }else{     
            Grafica graph = new Grafica("Posicion de los drones");
            //System.out.println("Tamaño de array drones "+panelB.Drones.size());
            for(int j = 0; j<panelB.Drones.size(); j++){
                 graph.addSerie(panelB.Drones.get(j).aux);
            }
                 graph.graficar();
        }
    }//GEN-LAST:event_graficasActionPerformed

    private void AboutProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutProyectActionPerformed
        JOptionPane.showMessageDialog(this,"Saúl Maldonado Navarro Proyecto Programacion Concurrente y Paralela Otoño 2020","Acerca del proyecto",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_AboutProyectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProyectoConcurrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoConcurrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoConcurrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoConcurrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoConcurrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutProyect;
    private javax.swing.JMenuItem Barrera;
    private javax.swing.JMenuItem Monitor;
    private javax.swing.JMenuItem Mutex;
    private javax.swing.JMenu Salida;
    private javax.swing.JMenuItem Semaf;
    private javax.swing.JCheckBoxMenuItem VariableC;
    private javax.swing.JMenuItem graficas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem nuevoDron;
    // End of variables declaration//GEN-END:variables
}
