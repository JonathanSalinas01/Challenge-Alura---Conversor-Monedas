package ar.com.conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.String.valueOf;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Temperatura extends JFrame implements ActionListener {
    private JMenuBar menu;
    private JMenu opciones, acerca;
    private JMenuItem CMonedas, CTemperatura, CDistancia, salir, creador;
    private JLabel titulo, flecha;
    private JTextField temperaturaIn, temperaturaOut;
    private JComboBox opcion1, opcion2;
    private JButton convertir;
    
    
    
    public Temperatura(){
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
        
        
        titulo = new JLabel("Conversor de Temperaturas");
        titulo.setBounds(145,20,180,40);
        add(titulo);
        
        temperaturaIn = new JTextField();
        temperaturaIn.setBounds(50,120,150,40);
        add(temperaturaIn);
        
        flecha = new JLabel(">>>");
        flecha.setBounds(215,120,90,45);
        add(flecha);
        
        opcion1 = new JComboBox();
        opcion1.setBounds(50,170,150,40);
        opcion1.addItem("Grados Celcius");
        opcion1.addItem("Grados Farenheit");
        opcion1.addItem("Grados Kelvin");
        add(opcion1);
        
        temperaturaOut = new JTextField();
        temperaturaOut.setBounds(250,120,150,40);
        add(temperaturaOut);
        temperaturaOut.setEditable(false);
        
        opcion2 = new JComboBox();
        opcion2.setBounds(250,170,150,40);
        opcion2.addItem("Grados Celcius");
        opcion2.addItem("Grados Farenheit");
        opcion2.addItem("Grados Kelvin");
        add(opcion2);
        opcion2.setSelectedItem("Grados Farenheit");
        
        convertir = new JButton("Convertir");
        convertir.setBounds(150,250,100,40);
        add(convertir);
        convertir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == convertir){
            ConvertirTemperatura conversor = new ConvertirTemperatura();
            double valorEntrada = Double.parseDouble(temperaturaIn.getText());
            double resultado = conversor.convertirTemepratura((String)opcion1.getSelectedItem(), (String) opcion2.getSelectedItem(), valorEntrada);
            temperaturaOut.setText(valueOf(resultado));
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

