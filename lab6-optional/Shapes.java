package com.company;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel{

    final MainFrame frame;

    JComboBox availableShapes;
    JLabel saveAs ;
    JLabel loadFrom ;
    JTextField text1;
    JTextField text2;


    public Shapes(MainFrame frame) {
        this.frame = frame;
        init();
    }

    public void init(){
    setLayout(new GridLayout(10, 1));
    String shapes[]={"Polygon" ,"Circle","NewShape"};
    availableShapes=new JComboBox(shapes);

    text1=new JTextField();
    saveAs=new JLabel("You can save as: ");

    text2=new JTextField();
    loadFrom=new JLabel("Load file with name(from this directory) : ");
    add(availableShapes);
    add(saveAs);
    add(text1);
    add(loadFrom);
    add(text2);
    }


}
