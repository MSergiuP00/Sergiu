import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Proiect extends JFrame {
    private JButton buttonDetalii;
    private JPanel panel;
    private JTextField Optiuni;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JButton Masini;
    private JButton Motociclete;
    private String StringText;
    private String StringLabel1;
    private String StringLabel2;
    private String StringLabel3;
    private static final Color color = Color.red;
    private boolean gen=false;
    private String denumire;
    private int w,h;
    ArrayList<String> detalii=new ArrayList<String>();

    StringBuffer s=new StringBuffer("Afisare Detalii: ");

    @Override
    public String toString(){
        return s.toString();
    }

    public String getDenumire(){
        return denumire();
    }

    private String denumire() {
        return denumire;
    }

    public void setDenumire(String newDenumire){
        this.denumire=newDenumire;
    }

    public Dimension iaDimensiune(){
        Dimension d1= new Dimension(w,h);
        return d1;

    }

    public Proiect(int w,int h){
        this.w=w;
        this.h=h;
        Dimension d1=new Dimension(w,h);
    }


    public Proiect() {
        Masini.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("AUDI");
                Label2.setText("BMW");
                Label3.setText("MERCEDES");
                Label1.setVisible(true);
                Label2.setVisible(true);
                Label3.setVisible(true);
                panel.setBackground(Color.blue);
                gen=false;
            }
        });
        Masini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Masini.setBackground(color);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Masini.setBackground(Color.lightGray);
            }
        });
        Motociclete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("SUZUKI");
                Label2.setText("KAWASAKI");
                Label3.setText("KTM");
                panel.setBackground(color);
                gen=true;
            }
        });
        Motociclete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Motociclete.setBackground(color);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Motociclete.setBackground(Color.LIGHT_GRAY);
            }
        });
        buttonDetalii.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringText = Optiuni.getText();
                StringLabel1 = Label1.getText();
                StringLabel2 = Label2.getText();
                StringLabel3 = Label3.getText();
                if (gen == false) {
                    if (StringText.equals(StringLabel1)) {
                        s.append(StringLabel1);
                        buttonDetalii.setText(s.toString());
                        detalii.clear();
                        detalii.add("Siguranta:10");
                        detalii.add("Sportivitate:10");
                        detalii.add("Raport calitate/pret:9.5");
                        JOptionPane.showMessageDialog(null, detalii);
                    } else {
                        if (StringText.equals(StringLabel2)) {
                            s.append(StringLabel2);
                            buttonDetalii.setText(s.toString());
                            detalii.clear();
                            detalii.add("Siguranta:9");
                            detalii.add("Sportivitate:10");
                            detalii.add("Raport calitate/pret:9");
                            JOptionPane.showMessageDialog(null,  detalii);
                        } else {
                            if (StringText.equals(StringLabel3)) {
                                s.append(StringLabel3);
                                buttonDetalii.setText(s.toString());
                                detalii.clear();
                                detalii.add("Siguranta:9.5");
                                detalii.add("Sportivitate:9");
                                detalii.add("Raport calitate/pret:10");
                                JOptionPane.showMessageDialog(null, detalii);

                            } else {
                                s.append("Lipsa optiune");
                                buttonDetalii.setText(s.toString());
                                JOptionPane.showMessageDialog(null, "Alege una din marcile de mai sus", "Atentie !", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
                else{

                    if (StringText.equals(StringLabel1)) {
                        s.append(StringLabel1);
                        buttonDetalii.setText(s.toString());
                        detalii.clear();
                        detalii.add("Viteza maxima: 274km/h");
                        detalii.add("Rating franare de urgenta: 9.5");
                        detalii.add("Off-road / Sport: Sport");
                        JOptionPane.showMessageDialog(null, detalii);
                    } else {
                        if (StringText.equals(StringLabel2)) {
                            s.append(StringLabel1);
                            buttonDetalii.setText(s.toString());
                            detalii.clear();
                            detalii.add("Viteza maxima: 296km/h");
                            detalii.add("Rating franare de urgenta: 10");
                            detalii.add("Off-road / Sport: Sport");
                            JOptionPane.showMessageDialog(null, detalii);

                        } else {
                            if (StringText.equals(StringLabel3)) {
                                s.append(StringLabel1);
                                buttonDetalii.setText(s.toString());
                                detalii.clear();
                                detalii.add("Viteza maxima: 134km/h");
                                detalii.add("Rating franare de urgenta: 8");
                                detalii.add("Off-road / Sport: Off-road");
                                JOptionPane.showMessageDialog(null, detalii);
                            } else {
                                s.append("Lipsa optiune");
                                buttonDetalii.setText(s.toString());
                                JOptionPane.showMessageDialog(null, "Alege una din marcile de mai sus", "Atentie !", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
        });
    }



    public static void main(String[] args) {

        Proiect obiect1=new Proiect();
        obiect1.setDenumire("Marci");

        Proiect obiectConstructor2=new Proiect(700,300);
        JFrame frame = new JFrame(obiect1.getDenumire());
        frame.setPreferredSize(obiectConstructor2.iaDimensiune());
        frame.setContentPane(new Proiect().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
