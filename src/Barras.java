import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class Barras extends java.awt.Canvas implements Serializable{
    private String[] nombre = {"Alan","Trix","Miguel","Mikecrack"};   
    //Valores iniciales de las barras
    private int[] valor = {20,40,60,80};
    //Escala de los valores
    private int[] medidas = {0,10,20,30,40,50,60,70,80,90,100};
           
    public void setNombre(String texto[]){
        nombre = texto;
    }
    public String[] getNombre(){
        return nombre;
    }
    public void setValor(int valorV[]){
        valor = valorV;
    }
    public int[] getValor(){
        return valor;
    }
    public void setMedidas(int medidasV[]){
        medidas = medidasV;
    }
    public int[] getMedidas(){
        return medidas;
    }
    
    
    public void paint(Graphics g){
        //Creación del objeto
        Graphics2D g2 = (Graphics2D)g;
        
        g.setColor(Color.gray);
                        
        ///Se establecen las medidas
        int x1= 325;
        g.setColor(Color.BLACK);
        for(int i=0 ; i <= 10; i++){                                
        g.drawString("" + medidas[i], 70,x1);
        x1 -=30;                
        }
        
        //Creación de la primera barra
        g.setColor(Color.BLACK);             
        g.drawString(nombre[0],110,350);
        g.setColor(Color.RED);
        g.fillRect(110, 325, 50, -valor[0]);
                        
        //Creación de la segunda barra
        g.setColor(Color.BLACK);      
        g.drawString(nombre[1],210,350);
        g.setColor(Color.CYAN);
        g.fillRect(210, 325, 50, -valor[1]);
                
        //Creación de la tercera barra
        g.setColor(Color.BLACK);    
        g.drawString( nombre[2],310,350);
        g.setColor(Color.ORANGE);
        g.fillRect(310, 325, 50, -valor[2]);
                       
        //Creación de la cuarta barra
        g.setColor(Color.BLACK);
        g.drawString(nombre[3],410,350);
        g.setColor(Color.MAGENTA);
        g.fillRect(410, 325, 50, -valor[3]);             
    }

    
}
