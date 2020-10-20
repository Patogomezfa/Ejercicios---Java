
package eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;
    
    
    public Ventana(){
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
        private void iniciarComponentes(){
            colocarPanel();
            //colocarEtiqueta();
            //colocarCajaDeTexto();
            colocarBoton();
            colocarAreaTexto();
        }
    
        private void colocarPanel(){
            panel = new JPanel();
            panel.setLayout(null);
            this.add(panel);
        }
        
        private void colocarEtiqueta(){
            JLabel etiqueta = new JLabel ("Ingrese su nombre: ");
            etiqueta.setBounds(30, 10, 200, 30);
            etiqueta.setFont(new Font("cooper black",0,18));
            panel.add(etiqueta);
        }
        
        private void colocarCajaDeTexto(){
            cajaTexto = new JTextField();
            cajaTexto.setBounds(30, 50, 300, 30);
            panel.add(cajaTexto);
        }
        
        private void colocarAreaTexto(){
            areaTexto = new JTextArea();
            areaTexto.setBounds(20, 20, 200, 300);
            panel.add(areaTexto);
        }
        
        private void colocarBoton(){
            boton = new JButton("¡Pulsa aquí!");
            boton.setBounds(150, 350, 150, 40);
            boton.setFont(new Font("arial", 0, 15));
            panel.add(boton);
            
            saludo = new JLabel();
            saludo.setBounds(50, 200, 300, 40);
            saludo.setFont(new Font("arial", 1, 20));
            panel.add(saludo);
            
            //eventoOyenteDeAccion();
            eventoOyenteDeRaton();
        }
            private void eventoOyenteDeAccion(){
            //Agregando el Evento de tipo ActionListener
            ActionListener oyenteDeAccion = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    saludo.setText("Hola "+cajaTexto.getText());
                }
            };
            boton.addActionListener(oyenteDeAccion);
            }
        
            private void eventoOyenteDeRaton(){
                //Agregando oyente de raton - MouseListener
                MouseListener oyenteDeRaton = new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    areaTexto.append("mouseClicked\n");
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        areaTexto.append("mousePressed\n");
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        areaTexto.append("mouseReleased\n");
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        areaTexto.append("mouseEntered\n");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        areaTexto.append("mouseExited\n");
                    }
                };
                
                boton.addMouseListener(oyenteDeRaton);
                
            }
        }
        
