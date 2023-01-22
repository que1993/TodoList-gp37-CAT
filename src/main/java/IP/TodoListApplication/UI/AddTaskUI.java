package IP.TodoListApplication.UI;

import javax.swing.*;
import java.awt.*;

public class AddTaskUI extends JDialog{
    private JPanel ADDTASKpanel;
    private JTextField IDtf;
    private JTextField TITLEtf;
    private JTextField DUEDATEtf;
    private JTextField STATUStf;
    private JTextField PROJECTNAMEtf;
    private JLabel ADDTASKlabel;
    private JLabel IDlabel;
    private JLabel TITLElabel;
    private JLabel DUEDATElabel;
    private JLabel PROJECTNAMElabel;
    private JLabel STATUSlabel;
    private JButton ADDbutton;

    public AddTaskUI(JDialog parent){
        JFrame f2 = new JFrame("ADD TASK");
        JLabel ADDTASKlabel = new JLabel("ADD NEW TASK");

        JLabel IDlabel = new JLabel("TASK ID");
        JLabel TITLElabel = new JLabel("TASK TITLE");
        JLabel DUEDATElabel = new JLabel("TASK DUEDATE");
        JLabel STATUSlabel = new JLabel("TASK STATUS");
        JLabel PROJECTNAMElabel = new JLabel("TASK PROJECT NAME");

        JTextField IDtf,TITLEtf,DUEDATEtf,STATUStf,PROJECTNAMEtf;
        IDtf = new JTextField();
        TITLEtf = new JTextField();
        DUEDATEtf = new JTextField();
        STATUStf = new JTextField();
        PROJECTNAMEtf = new JTextField();

        IDlabel.setBounds(100,100,500,50);
        TITLElabel.setBounds(100,200,500,50);
        DUEDATElabel.setBounds(100,300,500,50);
        STATUSlabel.setBounds(100,400,500,50);
        PROJECTNAMElabel.setBounds(100,500,500,50);

        IDtf.setBounds(200,100,300,50);
        TITLEtf.setBounds(200,200,300,50);
        DUEDATEtf.setBounds(200,300,300,50);
        STATUStf.setBounds(200,400,300,50);
        PROJECTNAMEtf.setBounds(200,500,300,50);

        f2.add(ADDTASKlabel);
        f2.add(IDtf);
        f2.add(TITLEtf);
        f2.add(DUEDATEtf);
        f2.add(STATUStf);
        f2.add(PROJECTNAMEtf);
        f2.add(IDlabel);
        f2.add(TITLElabel);
        f2.add(DUEDATElabel);
        f2.add(STATUSlabel);
        f2.add(PROJECTNAMElabel);

//        super(parent);
        f2.setTitle("Add new task");
        //f2.setLayout(null);
        f2.setVisible(true);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //f2.setContentPanel(AddTaskPanel);
        f2.setMinimumSize(new Dimension(720,720));
        //f2.setModal(true);
        f2.setLocationRelativeTo(parent);

    }

//    public static void main(String[] args) {    //open
//        addtaskui task = addtaskui.task;
//        if(task != null) {
//            System.out.println("Successful adding task of: " + task.title);
//        }
//        else {
//            System.out.println("Adding a task fail");
//        }
//    }

//    }   //close main
}



