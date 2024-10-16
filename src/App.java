
import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boeardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boeardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boeardHeight);
        frame.add(snakeGame);
        //El titulo ocupa parte de los 600px. Por tanto con el .pack se ajusta sin contar esa barra.
        frame.pack();
    }
}
