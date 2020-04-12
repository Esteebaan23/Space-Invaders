package space.invader.pkg2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;


public class FrmInvaderss extends javax.swing.JFrame implements KeyListener{
    int esc1;
    int esc2;
    int esc3;
    int esc4;
    int esc1a;
    int esc2a;
    int esc3a;
    int esc4a;
    int esc1b;
    int esc2b;
    int esc3b;
    int esc4b;
    
    int x1=90,x2=x1+20,x3=x2+30,x4=x1+170,x5=x4+20,x6=x5+30,x7=x4+170,x8=x7+20,x9=x8+30,x10=x7+170,x11=x10+20,x12=x11+30;
    int y=455;
    double disbalanave;
    
    
    
    double descinv1;
    double descinv2;
    double descinv3;
    double descinv4;
    double descinv5;
    double descinv6;
    double descinv7;
    double descinv8;
    double descinv9;
    double descinv10;
    double descinv11;
    double descinv12;
    
  
    int even = 1;
    int locationX = 20;
    int locationY = 50;
    int sign = 1;
    int random;
    int residuo,alienrojo;
    int aliens;
   int disparo;
   int coordx;
    int contador=0;
    int disparador=0;
    int espacio=32;
    double distancia1a;
    double distancia1b;
    double distancia2a;
    double distancia2b;
    double distancia3a;
    double distancia3b;
    double distanciarojo;
    double distancia;
    double balaY=530;
    int posrojo;
    
    int PosicionAliens, PosicionAlienNaranja, PosicionAlienNegro, PosicionAlienVerde, PosicionAlienRojo;
    int GenerarAliens=11, GenerarAliensNaranja=11, GenerarAliensVerde=11, GenerarAliensNegro=11, GenerarEscudo=1;
    int posy=50;
    int cont;
    int posx=0;
    int filas;
    int columnas;
    int puntaje = 0;
    int vidas = 3;
  
    Space1 tank = new Space1(10,535);
    Space1 shot = new Space1(locationX,locationY);
    
    Space1 invader1 = new Space1(locationX,locationY+40);
    Space1 invader2 = new Space1(locationX,locationY+80);
    Space1 invader3 = new Space1(locationX,locationY);
    
 
     int escucambio1=0;
    int escucambio2=0;
    int escucambio3=0;
    int escucambio1b=0;
    int escucambio2b=0;
    int escucambio3b=0;
    int escucambio1c=0;
    int escucambio2c=0;
    int escucambio3c=0;

    double de1;
    double de2;
    double de3;
    double de4;
    double de5;
    double de6;
    double de7;
    double de8;
    double de9;
    double de10;
    double de11;
    double de12;
    
    int escud1=1;
    int escud2=1;
    int escud3=1;
    int escud4=1;
     int escud5=1;
    int escud6=1;
    int escud7=1;
    int escud8=1;
     int escud9=1;
    int escud10=1;
    int escud11=1;
    int escud12=1;
    int cont2;
    
    
    Space escudo1 = new Space(40,450);
    Space escudo2 = new Space(340,450);
    Space escudo3 = new Space(640,450);
    Space escudo1b = new Space(70,450);
    Space escudo2b = new Space(370,450);
    Space escudo3b = new Space(670,450);
    Space escudo1c = new Space(100,450);
    Space escudo2c = new Space(400,450);
    Space escudo3c = new Space(700,450);
    
    Space[] invader1a = new Space[11];
    Space[] invader1b = new Space[11];
    Space[] invader2a = new Space[11];
    Space[] invader2b = new Space[11];
    Space[] invader3a = new Space[11];
    Space[] invader3b = new Space[11];
    Space dispinvader = new Space(0,-100);
    
    BufferedImage imgTank=null;
    
    BufferedImage imgInvader1a=null;
    BufferedImage imgInvader1b=null;
    
    BufferedImage imgInvader2a=null;
    BufferedImage imgInvader2b=null;
    
    BufferedImage imgInvader3a=null;
    BufferedImage imgInvader3b=null;
    BufferedImage imgbala=null;
    BufferedImage imgrojo=null;
    BufferedImage imgbalainvader=null;
    BufferedImage imgesc1=null;
    BufferedImage imgesc2=null;
    BufferedImage imgesc3=null;
    
   
        
    
    public FrmInvaderss() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
         addKeyListener(this);
         for (int i=0 ; i<11 ; i++)
        {
            invader1a[i] = new Space(locationX,locationY+240);
            invader1b[i] = new Space(locationX,locationY+200);
            invader2a[i] = new Space(locationX,locationY+160);
            invader2b[i] = new Space(locationX,locationY+120);
            invader3a[i] = new Space(locationX,locationY+40);
            invader3b[i] = new Space(locationX,locationY+80);
            locationX+=40;
        }
        
        try {
            imgTank = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\tank.png"));
            
            imgInvader1a = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\AlienVerde1.PNG"));
            imgInvader1b = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\AlienVerde2.PNG"));
            
            imgInvader2a = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\AlienNaranja1.PNG"));
            imgInvader2b = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\AlienNaranja2.PNG"));
            
            imgInvader3a = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\AlienNegro1.PNG"));
            imgInvader3b = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\AlienNegro2.PNG"));
            
            imgrojo = ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\AlienRojo.PNG"));
            
            imgbala=ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invaders\\src\\space\\invaders\\shot1.png"));
            imgbalainvader=ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invader 2\\src\\space\\invader\\pkg2\\shot2.png"));
            imgesc1=ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invader 2\\src\\space\\invader\\pkg2\\escudo.png"));
            imgesc2=ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invader 2\\src\\space\\invader\\pkg2\\escudo1.png"));
            imgesc3=ImageIO.read(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Space Invader 2\\src\\space\\invader\\pkg2\\escudoroto.png"));
        } catch (IOException ex) {
            Logger.getLogger(FrmInvaderss.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
     
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {
        
       
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
  
        if(e.getKeyCode()==39)
        {
            tank.setDrawLocationX(tank.getDrawLocationX()+5);
            if(tank.getDrawLocationX()>=740){
               tank.setDrawLocationX(740);
            }
        }
        else if(e.getKeyCode()==37)
        {
            tank.setDrawLocationX(tank.getDrawLocationX()-5); 
            if(tank.getDrawLocationX()<10){
               tank.setDrawLocationX(10);
           }
        }
         if(e.getKeyCode()==32){
           if(e.getKeyCode()==espacio){
            espacio=100;
           disparo=1;
           coordx=tank.getDrawLocationX()+22;
            
       } 
       } 
        
        
    }
    
    
     Timer temporizador = new Timer(50,new ActionListener()
            {
           
            public void actionPerformed(ActionEvent evento){

lblPuntaje.setText(String.valueOf(puntaje));
lblVidas.setText(String.valueOf(vidas));
even*=-1;
locationX+=sign*10;
posx+=sign*2;
cont2++;
if(posx<0 || posx>160)
{
    sign*=-1;
      for (int i=0 ; i<11 ; i++)
                    {
                        invader1a[i].setCoordY(invader1a[i].getCoordY()+10);
                        invader1b[i].setCoordY(invader1b[i].getCoordY()+10);
                        invader2a[i].setCoordY(invader2a[i].getCoordY()+10);
                        invader2b[i].setCoordY(invader2b[i].getCoordY()+10);
                        invader3a[i].setCoordY(invader3a[i].getCoordY()+10);
                        invader3b[i].setCoordY(invader3b[i].getCoordY()+10);
                    }
    
}


for (int i=0 ; i<11 ; i++)
                {
                    invader1a[i].setCoordX(invader1a[i].getCoordX()+sign*4);
                    invader1b[i].setCoordX(invader1b[i].getCoordX()+sign*4);
                    invader2a[i].setCoordX(invader2a[i].getCoordX()+sign*4);
                    invader2b[i].setCoordX(invader2b[i].getCoordX()+sign*4);
                    invader3a[i].setCoordX(invader3a[i].getCoordX()+sign*4);
                    invader3b[i].setCoordX(invader3b[i].getCoordX()+sign*4);
                }    

cont++;
if(cont==150)
{
    random=(int)(Math.random()*3+1);
    System.out.print(random);
    residuo=random%3;
    if(residuo==0)
    {
        alienrojo=1;
    }
    else
    {
        alienrojo=0;
    }
    cont=0;
}


 for (int i=0 ; i<11 ; i++)
        {
            distancia1a= Math.sqrt(Math.pow(invader1a[i].getCoordX()+20 - coordx,2) + Math.pow(invader1a[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia1a<=25)
            {
                balaY=530;
                disparo=0;
                espacio=32;
                invader1a[i].setAparecer(false);
                invader1a[i].setCoordY(-250);
                puntaje+=10;
                aliens++;
            }

            distancia1b= Math.sqrt(Math.pow(invader1b[i].getCoordX()+20 - coordx,2) + Math.pow(invader1b[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia1b<=25)
            {
                balaY=530;
                disparo=0;
                espacio=32;
                invader1b[i].setAparecer(false);
                invader1b[i].setCoordY(-250);
                puntaje+=10;
                aliens++;

            }
          

            distancia2a= Math.sqrt(Math.pow(invader2a[i].getCoordX()+20 - coordx,2) + Math.pow(invader2a[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia2a<=25)
            {
                balaY=530;
                disparo=0;
                espacio=32;
                invader2a[i].setAparecer(false);
                invader2a[i].setCoordY(-250);
                puntaje+=20;
                aliens++;
            }
            distancia2b= Math.sqrt(Math.pow(invader2b[i].getCoordX()+20 - coordx,2) + Math.pow(invader2b[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia2b<=25)
            {
                balaY=530;
                disparo=0;
                espacio=32;
                invader2b[i].setAparecer(false);
                invader2b[i].setCoordY(-250);           
                puntaje+=20;
                aliens++;
            }
            

            distancia3a= Math.sqrt(Math.pow(invader3a[i].getCoordX()+20 - coordx,2) + Math.pow(invader3a[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia3a<=25)
            {
                balaY=530;
                disparo=0;
                espacio=32;
                invader3a[i].setAparecer(false);              
                invader3a[i].setCoordY(-250);
                puntaje+=30;
                aliens++;
            }
            distancia3b= Math.sqrt(Math.pow(invader3b[i].getCoordX()+20 - coordx,2) + Math.pow(invader3b[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia3b<=25)
            {
                balaY=530;
                disparo=0;
                espacio=32;
                invader3b[i].setAparecer(false);
                
                invader3b[i].setCoordY(-250);
                puntaje+=30;
                aliens++;
            }
            else if(balaY<0)
            {
                balaY=530;
                disparo=0;
                espacio=32;
            }
        }

    
    
    distancia=Math.sqrt(Math.pow(invader1.getDrawLocationX()-coordx,2)+Math.pow(invader1.getDrawLocationY()-balaY, 2));
    
    if(disparo==1)
    {
        balaY-=10;
        
    }
    
    if(aliens==68)
    {
        temporizador.stop();
    }
    if(vidas==0)
    {
        temporizador.stop();
    }
    
    distanciarojo= Math.sqrt(Math.pow(posrojo+20 - coordx,2) + Math.pow(invader3a[1].getCoordY()-40+15 - balaY,2 ) );   
        if (distanciarojo<=25)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            alienrojo=0;
            
        }
        
        
         
          de1= Math.sqrt(Math.pow(x1+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de1<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc1++;
            if (esc1==3)        
            {
                x1=-1000;
                escud1=0;
                 
            }   
        }
        de2= Math.sqrt(Math.pow(x2+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de2<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc1a++;;
            if (esc1a==3)        
            {
               x2=-1000; 
             escud2=0;
                
            }   
        }
        de3= Math.sqrt(Math.pow(x3+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de3<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc1b++;
            if (esc1b==3)        
            {
                x3=-1000;
              escud3=0;
               
            }   
        }
        
        
        
        
        
        
        
        
         de4= Math.sqrt(Math.pow(x4+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de4<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc2++;
            if (esc2==3)        
            {
                x4=-1000;
                escud4=0;
                 
            }   
        }
        de5= Math.sqrt(Math.pow(x5+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de5<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc2a++;;
            if (esc2a==3)        
            {
               x5=-1000; 
             escud5=0;
                
            }   
        }
        de6= Math.sqrt(Math.pow(x6+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de6<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc2b++;
            if (esc2b==3)        
            {
                x6=-1000;
              escud6=0;
               
            }   
        }
        
        
        
        
        
        
                  de7= Math.sqrt(Math.pow(x7+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de7<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc3++;
            if (esc3==3)        
            {
                x7=-1000;
                escud7=0;
                 
            }   
        }
        de8= Math.sqrt(Math.pow(x8+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de8<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc3a++;;
            if (esc3a==3)        
            {
               x8=-1000; 
             escud8=0;
                
            }   
        }
        de9= Math.sqrt(Math.pow(x9+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de9<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc3b++;
            if (esc3b==3)        
            {
                x9=-1000;
              escud9=0;
               
            }   
        }
        
        
        
        
        
        
        de10= Math.sqrt(Math.pow(x10+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de10<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc4++;
            if (esc4==3)        
            {
                x10=-1000;
                escud10=0;
                 
            }   
        }
        de11= Math.sqrt(Math.pow(x11+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de11<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc4a++;;
            if (esc4a==3)        
            {
               x11=-1000; 
             escud11=0;
                
            }   
        }
        de12= Math.sqrt(Math.pow(x12+15 - coordx,2) + Math.pow(y+20 - balaY,2 ) );   
        if (de12<=20)
        {
            balaY=530;
            disparo=0;
            espacio=32;
            esc4b++;
            if (esc4b==3)        
            {
                x12=-1000;
              escud12=0;
               
            }   
        }
        
        
        
        
    if(cont2==75)   
    {
           int random = (int)(Math.random()*11+1);
            if(random==11)
                random=0;                
            if(invader3a[random].getAparecer() == true )
            {
                dispinvader.setCoordX(invader3a[random].getCoordX()+22);
                dispinvader.setCoordY(invader3a[random].getCoordY()+30);  
            } 
            cont2=0;
    }
    
    
    repaint();
    

                
            }
            
        }); 
     
     
//          Timer temporizador2= new Timer(1,new ActionListener()
//            {
//           
//            public void actionPerformed(ActionEvent evento){
//
//
//    repaint(0,450,800,475);
//
//                
//            }
//            
//        }); 
        
     Timer temporizador3 = new Timer(50,new ActionListener()
            {
           
            public void actionPerformed(ActionEvent evento){

posrojo+=7;
if(posrojo>800)
{
    
    temporizador3.stop();
    posrojo=0;
    alienrojo=0;
}
    repaint();
    

                
            }
            
        }); 
     

public void paint(Graphics g)
{

    super.paint(g);
    g.drawImage(imgTank, tank.getDrawLocationX(),tank.getDrawLocationY(),50,50,this);

    if(dispinvader.getAparecer()==true)
        {
            g.drawImage(imgbalainvader, dispinvader.getCoordX(), dispinvader.getCoordY(),10,10, this);
        }
    if(alienrojo==1)
    {
        temporizador3.start();
       g.drawImage(imgrojo, posrojo, invader3a[1].getCoordY()-40,40,30, this);     
    }
    
    
     
    if(disparo==1)
    {
        g.drawImage(imgbala, coordx,(int) balaY,10,20,this);
    }
    
    
    
    
    
   if(even==1){
   for (int i=0; i<11; i++)
            {
                if (invader1a[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader1a, invader1a[i].getCoordX(),invader1a[i].getCoordY(),40,30,this); 
                }
                else if (invader1a[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader1a, invader1a[i].getCoordX(),invader1a[i].getCoordY(),0,0,this); 
                }
                if (invader1b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader1a, invader1b[i].getCoordX(),invader1b[i].getCoordY(),40,30,this); 
                }
                else if (invader1b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader1a, invader1b[i].getCoordX(),invader1b[i].getCoordY(),0,0,this);
                }
        
                
                if (invader2a[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader2a, invader2a[i].getCoordX(),invader2a[i].getCoordY(),40,30,this);
                }
                else if (invader2a[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader2a, invader2a[i].getCoordX(),invader2a[i].getCoordY(),0,0,this); 
                }
                if (invader2b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader2a, invader2b[i].getCoordX(),invader2b[i].getCoordY(),40,30,this);
                }
                else if (invader2b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader2a, invader2b[i].getCoordX(),invader2b[i].getCoordY(),0,0,this); 
                }
                         
                
                if (invader3a[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader3a, invader3a[i].getCoordX(),invader3a[i].getCoordY(),40,30,this);
                }
                else if (invader3a[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader3a, invader3a[i].getCoordX(),invader3a[i].getCoordY(),0,0,this); 
                }
                if (invader3b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader3a, invader3b[i].getCoordX(),invader3b[i].getCoordY(),40,30,this);
                }
                else if (invader3b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader3a, invader3b[i].getCoordX(),invader3b[i].getCoordY(),0,0,this); 
                }
               
            }         
            
          
   }
    else if(even==-1){
       for (int i=0; i<11 ; i++)
            {
                if (invader1a[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader1b, invader1a[i].getCoordX(),invader1a[i].getCoordY(),40,30,this); 
                }
                else if (invader1a[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader1b, invader1a[i].getCoordX(),invader1a[i].getCoordY(),0,0,this); 
                }
                if (invader1b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader1b, invader1b[i].getCoordX(),invader1b[i].getCoordY(),40,30,this);
                }
                else if (invader1b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader1b, invader1b[i].getCoordX(),invader1b[i].getCoordY(),0,0,this); 
                }
               
                
                if (invader2a[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader2b, invader2a[i].getCoordX(),invader2a[i].getCoordY(),40,30,this);
                }
                else if (invader2a[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader2b, invader2a[i].getCoordX(),invader2a[i].getCoordY(),0,0,this); 
                }
                if (invader2b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader2b, invader2b[i].getCoordX(),invader2b[i].getCoordY(),40,30,this);
                }
                else if (invader2b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader2b, invader2b[i].getCoordX(),invader2b[i].getCoordY(),0,0,this);
                }
            
                
                if (invader3a[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader3b, invader3a[i].getCoordX(),invader3a[i].getCoordY(),40,30,this);
                }
                else if (invader3a[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader3b, invader3a[i].getCoordX(),invader3a[i].getCoordY(),0,0,this); 
                }
                if (invader3b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader3b, invader3b[i].getCoordX(),invader3b[i].getCoordY(),40,30,this);
                }
                else if (invader3b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader3b, invader3b[i].getCoordX(),invader3b[i].getCoordY(),0,0,this);
                }
                
                
            }
            
         
        }   
    
    
    
    if(escud1==1)
    {
     if (esc1==0) 
     {
            g.drawImage(imgesc1, x1,y,20,30,this);
     }
     else if (esc1==1)   
     {
            g.drawImage(imgesc2, x1,y,20,30,this);
     }
     else if (esc1==2)
     {
            g.drawImage(imgesc3, x1,y,20,30,this);
     }
    }
     
    if(escud2==1)
    { 
       if (esc1a==0) 
     {
            g.drawImage(imgesc1, x2,y,30,15,this);
     }
     else if (esc1a==1)   
     {
            g.drawImage(imgesc2, x2,y,30,15,this);
     }
     else if (esc1a==2)
     {
            g.drawImage(imgesc3, x2,y,30,15,this);
     }
    }
    
    if(escud3==1)
    {   
         if (esc1b==0) 
     {
            g.drawImage(imgesc1, x3,y,20,30,this);
     }
     else if (esc1b==1)   
     {
            g.drawImage(imgesc2, x3,y,20,30,this);
     }
     else if (esc1b==2)
     {
            g.drawImage(imgesc3, x3,y,20,30,this);
     }
         
    }
    
    
    
    
    if(escud4==1)
    {
    
         if (esc2==0) 
     {
            g.drawImage(imgesc1, x4,y,20,30,this);
     }
     else if (esc2==1)   
     {
            g.drawImage(imgesc2, x4,y,20,30,this);
     }
     else if (esc2==2)
     {
            g.drawImage(imgesc3, x4,y,20,30,this);
     }
    }
     
    if(escud5==1)
    { 
       if (esc2a==0) 
     {
            g.drawImage(imgesc1, x5,y,30,15,this);
     }
     else if (esc2a==1)   
     {
            g.drawImage(imgesc2, x5,y,30,15,this);
     }
     else if (esc2a==2)
     {
            g.drawImage(imgesc3, x5,y,30,15,this);
     }
    }
     
    if(escud6==1)
    {
         if (esc2b==0) 
     {
            g.drawImage(imgesc1, x6,y,20,30,this);
     }
     else if (esc2b==1)   
     {
            g.drawImage(imgesc2, x6,y,20,30,this);
     }
     else if (esc2b==2)
     {
            g.drawImage(imgesc3, x6,y,20,30,this);
     }
    }
    
    
    
   
 if(escud7==1)
 {

         if (esc3==0) 
     {
            g.drawImage(imgesc1, x7,y,20,30,this);
     }
     else if (esc3==1)   
     {
            g.drawImage(imgesc2, x7,y,20,30,this);
     }
     else if (esc3==2)
     {
            g.drawImage(imgesc3, x7,y,20,30,this);
     }
 }
 if(escud8==1)
    {
         if (esc3a==0) 
     {
            g.drawImage(imgesc1, x8,y,30,15,this);
     }
     else if (esc3a==1)   
     {
            g.drawImage(imgesc2, x8,y,30,15,this);
     }
     else if (esc3a==2)
     {
            g.drawImage(imgesc3, x8,y,30,15,this);
     }
    }
 if(escud9==1)
    {
       
         if (esc3b==0) 
     {
            g.drawImage(imgesc1, x9,y,20,30,this);
     }
     else if (esc3b==1)   
     {
            g.drawImage(imgesc2, x9,y,20,30,this);
     }
     else if (esc3b==2)
     {
            g.drawImage(imgesc3, x9,y,20,30,this);
     }
         
         
 }       
         
         
   if(escud10==1)     
   {
                  if (esc4==0) 
     {
            g.drawImage(imgesc1, x10,y,20,30,this);
     }
     else if (esc4==1)   
     {
            g.drawImage(imgesc2, x10,y,20,30,this);
     }
     else if (esc4==2)
     {
            g.drawImage(imgesc3, x10,y,20,30,this);
     }
   }
   
   if(escud11==1)
    {
         if (esc4a==0) 
     {
            g.drawImage(imgesc1, x11,y,30,15,this);
     }
     else if (esc4a==1)   
     {
            g.drawImage(imgesc2, x11,y,30,15,this);
     }
     else if (esc4a==2)
     {
            g.drawImage(imgesc3, x11,y,30,15,this);
     }
    }
     
   if(escud12==1)
    {
         if (esc4b==0) 
     {
            g.drawImage(imgesc1, x12,y,20,30,this);
     }
     else if (esc4b==1)   
     {
            g.drawImage(imgesc2, x12,y,20,30,this);
     }
     else if (esc4b==2)
     {
            g.drawImage(imgesc3, x12,y,20,30,this);
     }

   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
      
         
        
            
        dispinvader.setCoordY(dispinvader.getCoordY()+13);
         
        descinv1= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x1,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv1<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
           esc1++;
            if (esc1==3)        
            {
                x1=-1000;
                escud1=0;
                 
            }   
        }
        
        descinv2= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x2,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv2<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
           esc1a++;
            if (esc1a==3)        
            {
                x2=-1000;
                escud2=0;
                 
            }   
        }
        
        descinv3= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x3,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv3<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
           esc1b++;
            if (esc1==3)        
            {
                x3=-1000;
                escud3=0;
                 
            }   
        }
        
        descinv4= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x4,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv4<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            esc2++;
            if (esc2==3)        
            {
                x4=-1000;
                escud4=0;
                 
            }   
        }
        
        descinv5= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x5,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv5<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            esc2a++;
            if (esc2a==3)        
            {
                x5=-1000;
                escud5=0;
                 
            }   
        }
        
        descinv6= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x6,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv6<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            esc2b++;
            if (esc2b==3)        
            {
                x6=-1000;
                escud6=0;
                 
            }   
        }
        
        descinv7= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x7,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv7<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            esc3++;
            if (esc3==3)        
            {
                x7=-1000;
                escud7=0;
                 
            }   
        }
        
        descinv8= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x8,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv8<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            esc3a++;
            if (esc3a==3)        
            {
                x8=-1000;
                escud8=0;
                 
            }   
        }
        
        descinv9= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x9,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv9<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
           esc3b++;
            if (esc3b==3)        
            {
                x9=-1000;
                escud9=0;
                 
            }   
        }
        
        
        
        
        
        
        
        
               descinv10= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x10,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv10<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            esc4++;
            if (esc4==3)        
            {
                x10=-1000;
                escud10=0;
                 
            }   
        }
        
        descinv11= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x11,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv11<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            esc4a++;
            if (esc4a==3)        
            {
                x1=-1000;
                escud11=0;
                 
            }   
        }
        
        descinv12= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - x12,2) + Math.pow(dispinvader.getCoordY()+10 - y,2 ) );
        if(descinv12<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
           esc4b++;
            if (esc4b==3)        
            {
                x12=-1000;
                escud12=0;
                 
            }   
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        disbalanave = Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - tank.getDrawLocationX(),2) + Math.pow(dispinvader.getCoordY()+10 - tank.getDrawLocationY(),2 ) );
        if(disbalanave<=30)
        {
            vidas--;
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            tank.setDrawLocationX(375);
            
        }
            
            
        else if (dispinvader.getCoordY()>800)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
        }
        
     
    
    
         
         
         
        
         
         
         
         
         
         
    
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblVidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Puntaje:");

        lblPuntaje.setText("jLabel2");

        jLabel2.setText("Vidas:");

        lblVidas.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPuntaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVidas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPuntaje)
                    .addComponent(jLabel2)
                    .addComponent(lblVidas))
                .addGap(0, 284, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
temporizador.start();   
//temporizador2.start(); // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInvaderss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInvaderss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInvaderss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInvaderss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInvaderss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblVidas;
    // End of variables declaration//GEN-END:variables
}
