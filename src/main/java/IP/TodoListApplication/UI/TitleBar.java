package IP.TodoListApplication.UI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class TitleBar extends JPanel{

    Color Title = new Color(97, 155, 138);
    Border emptyBorder = BorderFactory.createLineBorder(Title, 6, true);

    TitleBar()
    {
        this.setPreferredSize(new Dimension(400,80));

        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,60));
        titleText.setFont(new Font("Rockwell",Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        titleText.setBorder(emptyBorder);
        titleText.setBackground(Title);
        this.add(titleText);
    }
}
