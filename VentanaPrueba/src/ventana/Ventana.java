
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
        public JPanel panel;
    public Ventana(){
        setSize(500,500); //Establecemos el tamaño de la ventana
        setTitle("Paises latinoamericanos"); //Establecemos el titulo de la ventana
        //setLocation(500, 200);
        //setBounds(200, 100, 200, 100);
        setLocationRelativeTo(null);
        
        setMinimumSize(new Dimension(200, 200));
        
        //this.getContentPane().setBackground(Color.white);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        }
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesDeActivacion();
        //colocarCajasDeTexto();
        //colocarAreasDeTexto();
        colocarListasDesplegables();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();//creamos el panel
        //panel.setBackground(Color.GREEN); //Establecemos el color del panel
        panel.setLayout(null);
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        
        
    }
    private void colocarEtiquetas(){
        
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel(); //Creamos una etiqueta - se puede colocar como parametro setText y setHorizontalAlignment
        etiqueta.setText("Mundial 2018");//Establecemos el texto de la etiqueta
        etiqueta.setBounds(85, 10, 300, 80);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Establecemos la alineacion horizontal del txt
        etiqueta.setForeground(Color.BLACK);//Establecemos el color de la letra
        //etiqueta.setOpaque(true); //Establecemos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.black);//Cambiamos el color de fondo de la etiqueta
        etiqueta.setFont(new Font("cooper black",0, 40)); //Establecemos la fuente del txt
        panel.add(etiqueta); // Agregamos la etiqueta al panel
        
        //Etiqueta 2 - etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("pelo2018.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80, 90, 300, 300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void colocarBotones(){
        //Boton 1 - Boton de texto
        JButton boton1 = new JButton();
        boton1.setText("Click");//Establecemos un texto al boton
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//Habilitamos o deshabilitamos el boton
        boton1.setMnemonic('a');//Establecemos acc directo ( alt+letra )
        boton1.setForeground(Color.blue);//color letra del boton
        boton1.setFont(new Font("cooper black", 3, 20));//Establecemos la fuente estilo y tamaño
        panel.add(boton1);
        
        //Boton 2 - boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        ImageIcon download = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(download.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.blue);//Establecemos el color de fondo del boton
        panel.add(boton2);
    } 

    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("Programacion");
        radioBoton1.setFont(new Font("cooper black", 0, 20));
        panel.add(radioBoton1);
        
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);
        
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField();
        
        cajaTexto.setBounds(50, 50, 200, 30);
        cajaTexto.setText("Hola..");
        System.out.println("Texto en la caja: "+cajaTexto.getText());
        panel.add(cajaTexto);
        
    }
    
    private void colocarAreasDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba el texto aqui...");
        areaTexto.append("\nEscribe por aqui..");//Añade mas texto al area
        areaTexto.setEditable(true);//en false Deshabilita edicion del area de texto
        System.out.println("El texto es: "+ areaTexto.getText());
        
        
        panel.add(areaTexto);
    }
    
    private void colocarListasDesplegables(){
        String[] paises = {"Bolivia", "Colombia", "Paraguay", "Ecuador"};
        JComboBox listaDesplegable1 = new JComboBox(paises);
        listaDesplegable1.setBounds(20, 20, 100, 30);
        
        listaDesplegable1.addItem("Argentina");//Añaldir objetos a tu lista desplegable
        listaDesplegable1.setSelectedItem("Argentina"); // Seleccionar el primer objeto visto
        panel.add(listaDesplegable1);
    }
}
