package IP.TodoListApplication.UI;

import javax.swing.*;

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

    public ActionsUI() {
        JFrame f = new JFrame("Actions");
        JLabel l = new JLabel("TO-DO List1");
        JButton b1 = new JButton("ADD TASK");
        JButton b2 = new JButton("MARK TASK AS DONE");
        JButton b3 = new JButton("REMOVE TASK");
        JButton b4 = new JButton("EDIT TASK");
        JButton b5 = new JButton("DISPLAY ALL TASK");
        JButton b6 = new JButton("SORT TASKS BY DATE");
        JButton b7 = new JButton("SORT TASKS BY PROJECT");
        JButton b8 = new JButton("SAVE TASKS IN FILE");
        JButton b9 = new JButton("READ FROM FILE");
        JButton b10 = new JButton("EXIT");

        b1.setBounds(100,100,100,40);
        b2.setBounds(100,100,100,40);
        b3.setBounds(100,100,100,40);
        b4.setBounds(100,100,100,40);
        b5.setBounds(100,100,100,40);
        b6.setBounds(100,100,100,40);
        b7.setBounds(100,100,100,40);
        b9.setBounds(100,100,100,40);
        b8.setBounds(100,100,100,40);
        b10.setBounds(100,100,100,40);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);

        f.setSize(480,480);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

