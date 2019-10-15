import java.awt.*;

public class Token {

    private int x, y, z, score;
    private Snake snake;

    public Token(Snake s) {
        x = (int)(Math.random() * 395);
        y = (int)(Math.random() * 395);
        snake = s;
    }

    public void change() {
        x = (int)(Math.random() * 395);
        y = (int)(Math.random() * 395);
    }

    public int getScore() {
        return score;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 6, 6);
    }

    public boolean snakeCollision() {
        int snakeX = snake.getX() + 2;
        int snakeY = snake.getY() + 2;
        if(snakeX >= (x - 1) && snakeX <= (x + 7)) {
            if(snakeY >= (y - 1) && snakeY <= (y + 7)) {
                change();
                score++;
                snake.setElongate(true);
                return true;
            }
        }
        return false;
    }
}
