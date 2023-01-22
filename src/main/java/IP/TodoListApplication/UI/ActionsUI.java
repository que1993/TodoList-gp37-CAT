package IP.TodoListApplication.UI;

import IP.TodoListApplication.Features.AddTask;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionsUI extends JFrame{

        private JPanel ActionPanel;
        private JLabel TitleLabel;
        private JButton ADDTASKbutton;
        private JButton MARKTASKbutton;
        private JButton REMOVETASKbutton;
        private JButton EDITASKbutton;
        private JButton DISPLAYALLbutton;
        private JButton SORTDATEbutton;
        private JButton SORTPROJECTbutton;
        private JButton SAVETASKSButton;
        private JButton READFILEbutton;
        private JButton EXITbutton;

    public ActionsUI(JFrame parent) {
        JFrame f1 = new JFrame("Actions");
        JLabel TitleLabel = new JLabel("TO-DO List1");

        JButton ADDTASKbutton = new JButton("ADD TASK");
        JButton MARKTASKbutton = new JButton("MARK TASK AS DONE");
        JButton REMOVETASKbutton = new JButton("REMOVE TASK");
        JButton EDITASKbutton = new JButton("EDIT TASK");
        JButton DISPLAYALLbutton = new JButton("DISPLAY ALL TASK");
        JButton SORTDATEbutton = new JButton("SORT TASKS BY DATE");
        JButton SORTPROJECTbutton = new JButton("SORT TASKS BY PROJECT");
        JButton SAVETASKSButton = new JButton("SAVE TASKS IN FILE");
        JButton READFILEbutton = new JButton("READ FROM FILE");
        JButton EXITbutton = new JButton("EXIT");

        ADDTASKbutton.setBounds(100,100,500,40);
        MARKTASKbutton.setBounds(100,200,500,40);
        REMOVETASKbutton.setBounds(100,300,500,40);
        EDITASKbutton.setBounds(100,400,500,40);
        DISPLAYALLbutton.setBounds(100,500,500,40);
        SORTDATEbutton.setBounds(100,600,500,40);
        SORTPROJECTbutton.setBounds(100,700,500,40);
        SAVETASKSButton.setBounds(100,800,500,40);
        READFILEbutton.setBounds(100,900,500,40);
        EXITbutton.setBounds(100,1000,500,40);

        f1.add(TitleLabel);

        f1.add(ADDTASKbutton);
        f1.add(MARKTASKbutton);
        f1.add(REMOVETASKbutton);
        f1.add(EDITASKbutton);
        f1.add(DISPLAYALLbutton);
        f1.add(SORTDATEbutton);
        f1.add(SORTPROJECTbutton);
        f1.add(SAVETASKSButton);
        f1.add(READFILEbutton);
        f1.add(EXITbutton);

        f1.setSize(720,720);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ADDTASKbutton.addActionListener(new ActionListener() {  //open outer add task action listener
            @Override
            public void actionPerformed(ActionEvent e) {//open inner add task action listener
                AddTaskUI addtaskui = new AddTaskUI(null);
                addtaskui.show(); //open frame add task
                dispose(); //close actions frame


            }   //close inner add task action listener
        }); //close outer add task action listener

    }   //close method ActionsUI()

//    public static void main(String[] args) {    //open main
//
//        ActionsUI actionui = new ActionsUI(null);
//    }//close main

}   //close class ActionUI





