package ar.com.conversor;

import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Selector extends JFrame implements ActionListener{
    private JMenuBar menu;
    private JMenu opciones, acerca;
    private JMenuItem CMonedas, CTemperatura, CDistancia, salir, creador;
    private JLabel titulo, imagen;
    private JButton opcion1, opcion2, opcion3;
    Ventana monedas = new Ventana();
    Temperatura temperatura = new Temperatura();
    Distancia distancia = new Distancia();
    
    public Selector(){
        setLayout(null);
        setTitle("Conversor Alura");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        menu = new JMenuBar();
        setJMenuBar(menu);
        
        opciones = new JMenu("Opciones");
        menu.add(opciones);
        
        CMonedas = new JMenuItem("Conversor de Monedas");
        opciones.add(CMonedas);
        CMonedas.addActionListener(this);
        
        CTemperatura = new JMenuItem("Conversor de Temperaturas");
        opciones.add(CTemperatura);
        CTemperatura.addActionListener(this);
        
        CDistancia = new JMenuItem("Conversor de Distancias");
        opciones.add(CDistancia);
        CDistancia.addActionListener(this);
        
        salir = new JMenuItem("Salir");
        opciones.add(salir);
        salir.addActionListener(this);
        
        acerca = new JMenu("Acerca De");
        menu.add(acerca);
        acerca.addActionListener(this);
        
        creador = new JMenuItem("El creador");
        acerca.add(creador);
        creador.addActionListener(this);
        
        titulo = new JLabel("Conversor Alura");
        titulo.setBounds(160,20,180,40);
        add(titulo);
        
        opcion1 = new JButton("Conversor de Monedas");
        opcion1.setBounds(110,80,200,50);
        add(opcion1);
        opcion1.addActionListener(this);
        
        opcion2 = new JButton("Conversor de Temperaturas");
        opcion2.setBounds(110,150,200,50);
        add(opcion2);
        opcion2.addActionListener(this);
        
        opcion3 = new JButton("Conversor de Distancias");
        opcion3.setBounds(110,220,200,50);
        add(opcion3);
        opcion3.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == opcion1){
            this.setVisible(false);
            monedas.setVisible(true);
            monedas.setBounds(0,0,450,400);
            monedas.setResizable(false);
            monedas.setLocationRelativeTo(null);
        }
        
        if(e.getSource() == opcion2){
            this.setVisible(false);
            temperatura.setVisible(true);
            temperatura.setBounds(0,0,450,400);
            temperatura.setResizable(false);
            temperatura.setLocationRelativeTo(null);
        }
        
        if(e.getSource() == opcion3){
            this.setVisible(false);
            distancia.setVisible(true);
            distancia.setBounds(0,0,450,400);
            distancia.setResizable(false);
            distancia.setLocationRelativeTo(null);
        }
        if(e.getSource() == CMonedas){
            Ventana ventanaMonedas = new Ventana();
            this.setVisible(false);
            ventanaMonedas.setVisible(true);
            ventanaMonedas.setBounds(0,0,450,400);
            ventanaMonedas.setResizable(false);
            ventanaMonedas.setLocationRelativeTo(null);
        }
        if(e.getSource() == CTemperatura){
            Temperatura ventanaTemperatura = new Temperatura();
            this.setVisible(false);
            ventanaTemperatura.setVisible(true);
            ventanaTemperatura.setBounds(0,0,450,400);
            ventanaTemperatura.setResizable(false);
            ventanaTemperatura.setLocationRelativeTo(null);
        }
        if(e.getSource() == CDistancia){
            Distancia ventanaDistancia = new Distancia();
            this.setVisible(false);
            ventanaDistancia.setVisible(true);
            ventanaDistancia.setBounds(0,0,450,400);
            ventanaDistancia.setResizable(false);
            ventanaDistancia.setLocationRelativeTo(null);
        }
        if(e.getSource() == salir){
            System.exit(0);
        }
        
        if(e.getSource() == creador){
            JOptionPane.showMessageDialog(null,"Salinas, Jonathan \nChallenge Conversor Alura \n2023");
        }
    }
    
}
