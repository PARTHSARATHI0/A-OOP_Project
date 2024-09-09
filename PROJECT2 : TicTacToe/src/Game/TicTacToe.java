package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener {

    private JFrame frame = new JFrame("Tic-Tac-Toe");
    public JButton[] buttons = new JButton[9];
    private boolean playerTurn = true; 

    public TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 60));
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            frame.add(buttons[i]);
        }

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        if (buttonClicked.getText().equals("")) {
            buttonClicked.setText(playerTurn ? "X" : "O");
            playerTurn = !playerTurn;
            checkForWin();
        }
    }

    private void checkForWin() {
        String[][] board = new String[3][3];
        for (int i = 0; i < 9; i++) {
            board[i / 3][i % 3] = buttons[i].getText();
        }


        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals("")) {
                showWinMessage(board[i][0]);
            }
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals("")) {
                showWinMessage(board[0][i]);
            }
        }

        // Check diagonals
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("")) {
            showWinMessage(board[0][0]);
        }
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("")) {
            showWinMessage(board[0][2]);
        }

        
        
        boolean draw = true;
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText().equals("")) {
                draw = false;
                break;
            }
        }

        if (draw) {
            JOptionPane.showMessageDialog(frame, "It's a draw!");
            resetBoard();
        }
    }

    private void showWinMessage(String winner) {
        JOptionPane.showMessageDialog(frame, "Player " + winner + " wins!");
        resetBoard();
    }

    private void resetBoard() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
        }
        playerTurn = true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
