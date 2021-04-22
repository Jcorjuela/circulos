import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class circulo extends JApplet {

  public void paint (Graphics g) {
    g.drawString ("o", 60, 52);
    g.drawString ("o", 55, 50);
    g.drawString ("o", 50, 52);
    g.drawString ("o", 45, 55);
    g.drawString ("o", 40, 60);
    g.drawString ("o", 37, 65);
    g.drawString ("o", 35, 70);
    g.drawString ("o", 37, 75);
    g.drawString ("o", 40, 80);
    g.drawString ("o", 45, 85);
    g.drawString ("o", 60, 88);
    g.drawString ("o", 55, 90);
    g.drawString ("o", 50, 88);
    g.drawString ("o", 65, 85);
    g.drawString ("o", 70, 80);
    g.drawString ("o", 73, 75);
    g.drawString ("o", 75, 70);
    g.drawString ("o", 73, 65);
    g.drawString ("o", 70, 60);
    g.drawString ("o", 65, 55);
    
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    circulo saludoApplet = new circulo();
    saludoApplet.init();
    frame.getContentPane().add(saludoApplet);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}