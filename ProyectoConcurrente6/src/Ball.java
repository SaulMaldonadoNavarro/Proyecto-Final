import org.jfree.data.xy.XYSeries;
import java.util.concurrent.CyclicBarrier;
import javax.swing.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
public class Ball extends Thread{
    private PanelBall panel;
    public MiX x;
    public MiY y;
    public boolean key;
    public int posX,fX,mX=0;
    public int posY,fY,mY=0;
    public XYSeries aux;
    private Semaphore sem;
    private Lock mutex,mutex2,VCond;
    private Condition condition;
    private CyclicBarrier barrera;
    public int id, Talgo;
    private final static int fin=50;
    
    Ball (PanelBall panel, MiX x, MiY y, int fX, int fY, int id, int Talgo, XYSeries aux){
        this.panel = panel;
        this.x = x;
        this.y = y;
        this.posX = 5; 
        this.posY = 5;
        this.fX = fX;
        this.fY = fY;
        this.id = id;
        this.Talgo = Talgo;
        this.aux = aux;
        key = true;
        mutex = new ReentrantLock();
        sem = new Semaphore(1);
        mutex2 = new ReentrantLock();
        VCond = new ReentrantLock();
        condition = VCond.newCondition();  
        barrera  = new CyclicBarrier(1);
    }
      
    public void run(){
        while(key){
            switch(Talgo){
                
                case 1:
            if(mutex.tryLock()){
                mutex.lock();
            //Entra
            this.x.setX(this.x.getX() + posX);
            this.y.setY(this.y.getY() + posY);
            System.out.println("Mutex");
            panel.repaint();
            if(this.x.getX() > fX){ 
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() > fY){
                this.setPosY(-this.getPosY()); 
            }
            if(this.x.getX() < mX ){
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() < mY ){
                this.setPosY(-this.getPosY());
            }
            aux.add(x.getX(),y.getY());
            mutex.unlock();
            }//Sale
            try{
            //Thread.sleep(50);
            Thread.sleep((int)(50+Math.random()*20));
            }catch(Exception e){}
                break;
                
                case 2:
            try{
            sem.acquire();
            //Entra
            this.x.setX(this.x.getX() + posX);
            this.y.setY(this.y.getY() + posY);
            System.out.println("Semaforo");
            panel.repaint();
            if(this.x.getX() > fX){ 
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() > fY){
                this.setPosY(-this.getPosY()); 
            }
            if(this.x.getX() < mX ){
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() < mY ){
                this.setPosY(-this.getPosY());
            }
            aux.add(x.getX(),y.getY());
            sem.release(); 
            //Sale
            }catch(Exception e){}
        try{
           Thread.sleep((int)(50+Math.random()*20));
        }catch(Exception e){}
                break;
                
                case 3:
            //Entra
            mutex2.lock();
            try{
              condition.signal();  
            }catch(Exception e){}
            finally{
                mutex2.unlock();
            }
            
            this.x.setX(this.x.getX() + posX);
            this.y.setY(this.y.getY() + posY);
            System.out.println("Variable Condicion");
            panel.repaint();           
            if(this.x.getX() > fX){ 
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() > fY){
                this.setPosY(-this.getPosY()); 
            }
            if(this.x.getX() < mX ){
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() < mY ){
                this.setPosY(-this.getPosY());
            }
            aux.add(x.getX(),y.getY());
            //Sale
            try{
                mutex2.lock();
                condition.await();
            }catch(Exception e){}
            finally{
                mutex2.unlock();
            }
            try{
            //Thread.sleep(50);
            Thread.sleep((int)(50+Math.random()*20));
            }catch(Exception e){}
                break;
                
                case 4:
            synchronized(panel){
            //Entra
            this.x.setX(this.x.getX() + posX);
            this.y.setY(this.y.getY() + posY);
            System.out.println("Monitor");
            panel.repaint();
            if(this.x.getX() > fX){ 
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() > fY){
                this.setPosY(-this.getPosY()); 
            }
            if(this.x.getX() < mX ){
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() < mY ){
                this.setPosY(-this.getPosY());
            }
            aux.add(x.getX(),y.getY());
        }//Sale
        try{
           Thread.sleep((int)(50+Math.random()*20));
        }catch(Exception e){}
                break;
                
                case 5:
           try{
               barrera.await();
           }catch(Exception e){}
            //Entra
            this.x.setX(this.x.getX() + posX);
            this.y.setY(this.y.getY() + posY);
            System.out.println("Barrera");
            panel.repaint();
            if(this.x.getX() > fX){ 
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() > fY){
                this.setPosY(-this.getPosY()); 
            }
            if(this.x.getX() < mX ){
                this.setPosX(-this.getPosX());
            }
            if(this.y.getY() < mY ){
                this.setPosY(-this.getPosY());
            }
            aux.add(x.getX(),y.getY());
            //Sale
            try{
            //Thread.sleep(50);
            Thread.sleep((int)(50+Math.random()*20));
            }catch(Exception e){}
                break;
            }   
        }
    }    
    

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }
    
    public void setPosY(int posY) {
        this.posY = posY;
    }
  
///////////////////Finales////////////////////////////////////////////////////////////
    
        public int getfX() {
        return fX;
    }

    public void setfX(int fX) {
        this.fX = fX;
    }

    public int getfY() {
        return fY;
    }

    public void setfY(int fY) {
        this.fY = fY;
    }
    
  }

