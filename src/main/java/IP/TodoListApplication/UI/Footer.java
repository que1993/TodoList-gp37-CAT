package IP.TodoListApplication.UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class Footer extends JPanel{

    JButton addTask;
    JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder(10,10,10,10);
    Color cool = new Color(225, 70, 138);

    Footer()
    {
        this.setPreferredSize(new Dimension(400,60));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Rockwell",Font.BOLD, 18));
        addTask.setVerticalAlignment(JButton.BOTTOM);
//        addTask.setSize(100,50);
        addTask.setBackground(cool);
        addTask.setFocusable(false);
        this.add(addTask);


        this.add(Box.createHorizontalStrut(20));//Space between buttons
        clear = new JButton("Clear finished tasks");
        clear.setFont(new Font("Rockwell",Font.BOLD, 18));
        clear.setBorder(emptyBorder);
        clear.setBackground(cool);
        clear.setFocusable(false);
        this.add(clear);


    }

    public JButton getNewTask(){
        return addTask;
    }

    public JButton getClear() {
        return clear;
    }
}
