package ar.com.conversor;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ventana extends JFrame implements ActionListener{
    private JMenuBar menu;
    private JMenu opciones, acerca;
    private JMenuItem CMonedas, CTemperatura, CDistancia, salir, creador;
    private JLabel titulo, flecha;
    private JTextField monedaIn, monedaOut;
    private JComboBox opcion1, opcion2;
    private JButton convertir;

    
    
    public Ventana(){
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
        
        
        titulo = new JLabel("Conversor de Monedas");
        titulo.setBounds(145,20,150,40);
        add(titulo);
        
        monedaIn = new JTextField();
        monedaIn.setBounds(50,120,150,40);
        add(monedaIn);
        
        flecha = new JLabel(">>>");
        flecha.setBounds(215,120,90,45);
        add(flecha);
        
        opcion1 = new JComboBox();
        opcion1.setBounds(50,170,150,40);
        opcion1.addItem("Peso Argentino");
        opcion1.addItem("Dolar");
        opcion1.addItem("Euro");
        opcion1.addItem("Libra");
        add(opcion1);
        
        monedaOut = new JTextField();
        monedaOut.setBounds(250,120,150,40);
        add(monedaOut);
        monedaOut.setEditable(false);
        
        opcion2 = new JComboBox();
        opcion2.setBounds(250,170,150,40);
        opcion2.addItem("Peso Argentino");
        opcion2.addItem("Dolar");
        opcion2.addItem("Euro");
        opcion2.addItem("Libra");
        add(opcion2);
        opcion2.setSelectedItem("Dolar");
        
        convertir = new JButton("Convertir");
        convertir.setBounds(150,250,100,40);
        add(convertir);
        convertir.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == convertir){

                Convertir prueba = new Convertir();
                double valorEntrada = Double.parseDouble(monedaIn.getText());
                double resultado = prueba.convertir((String)opcion1.getSelectedItem(), (String) opcion2.getSelectedItem(), valorEntrada);
                
                monedaOut.setText(valueOf(resultado));

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
