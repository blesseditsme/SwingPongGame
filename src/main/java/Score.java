import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

//        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        g.drawString(player1 / 10 + String.valueOf(player1%10), (GAME_WIDTH/2 - 85), 50);
        g.drawString(player2 / 10 + String.valueOf(player2%10), (GAME_WIDTH/2 + 20), 50);

        //drawing a doted line in the middle
        Graphics2D g2d = (Graphics2D) g; /* a more complex Graphics class used to draw Objects (as in give in an Object
        in parameter and not dimensions or coordinates)
        How to make a dotted line: */
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10 }, 0);
        g2d.setStroke(dashed);
        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
    }
}