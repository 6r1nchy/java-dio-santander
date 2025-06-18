import gui.SudokuFrame;

public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new SudokuFrame().setVisible(true);
        });
    }
}
