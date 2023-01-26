package IP.TodoListApplication.UI;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class Task extends JPanel{

    Color date = new Color(97, 155, 138);
    Color donee = new Color(187,152,152);
    Border bevelBorder = BorderFactory.createRaisedBevelBorder();
    JLabel index;
    JTextField taskName;

    JTextField dueDate;
    JButton done;

    private boolean checked;

    Task()
    {
        this.setPreferredSize(new Dimension(400,20));
        this.setBackground(Color.pink);

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

//        taskName = new JTextField("TEST");
//        taskName.setBorder(BorderFactory.createEmptyBorder());
//        taskName.setBackground(Color.pink);
//        this.add(taskName,BorderLayout.CENTER);

        taskName = new JTextField();
        taskName.setBounds(100,20,165,25);
        taskName.setText("Enter Task");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.pink);
        taskName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent event) {
                if (taskName.getText().equals("Enter Task")){
                    taskName.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent event) {
                if (taskName.getText().equals("")){
                    taskName.setText("Enter Task");
                }
            }
        });

        this.add(taskName,BorderLayout.CENTER);

        Font font =  new Font ("Baloo Bhai 2", Font.PLAIN, 20);

        dueDate = new JTextField("");
//        dueDate.setBorder(BorderFactory.createEmptyBorder());
//        dueDate.setBackground(date);
//        dueDate.setFont(font);
//        this.add(dueDate,BorderLayout.AFTER_LAST_LINE);

//        taskName = new JTextField();
        dueDate.setBounds(100,20,165,25);
        dueDate.setText("Due Date");
        dueDate.setBorder(BorderFactory.createEmptyBorder());
        dueDate.setBackground(date);
        dueDate.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent event) {
                if (dueDate.getText().equals("Due Date")){
                    dueDate.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent event) {
                if (dueDate.getText().equals("")){
                    dueDate.setText("Due Date");
                }
            }
        });

        this.add(dueDate,BorderLayout.AFTER_LAST_LINE);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(bevelBorder);
        done.setFocusPainted(false);
        done.setBackground(donee);
        this.add(done,BorderLayout.EAST);

    }

    public void changeIndex(int num)
    {
        this.index.setText(num+"");
        this.revalidate();
    }


    public JButton getDone()
    {
        return done;
    }

    public boolean getState()
    {
        return checked;
    }

    public void changeState()
    {
        this.setBackground(Color.gray);
        taskName.setBackground(Color.gray);
        checked = true;
        revalidate();
    }
}
