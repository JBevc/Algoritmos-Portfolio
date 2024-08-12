package com.example;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    String nombre;
    public static void main(String[] args) {
         // Creating instance of JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


         
         JLabel label = new JLabel("Ingrese su nombre");
         label.setBounds(50,25,120,80);
         frame.add(label);

         JTextField tf = new JTextField(20);
         tf.setBounds(50,100,200,50);
         frame.add(tf);

         JButton button = new JButton("Saludar");
         button.setBounds(50, 150, 200, 50);
         frame.add(button);
 
         // 400 width and 500 height
         frame.setSize(300, 300);
 
         // using no layout managers
         frame.setLayout(null);
 
         // making the frame visible
         frame.setVisible(true);

    }

    private void botonSaludarAccion(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "¡Hola, " + this.nombre +"!", null, 0);
    }
}