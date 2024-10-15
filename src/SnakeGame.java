import java.awt.*;
import javax.swing.*;

public class SnakeGame extends JPanel {
    int boardWidth;
    int boardHeight;

    public SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;

        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.black);
    }

    
}
