package IP.TodoListApplication.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{

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

        taskName = new JTextField("TEST");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.pink);
        this.add(taskName,BorderLayout.CENTER);

        dueDate = new JTextField("DUE DATE");
        dueDate.setBorder(BorderFactory.createEmptyBorder());
        dueDate.setBackground(Color.red);
        this.add(dueDate,BorderLayout.AFTER_LAST_LINE);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setFocusPainted(false);
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
