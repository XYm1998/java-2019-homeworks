/*
 * 这是造物主
 */

public class Main {
    public static void main(String[] args){
        Field field=new Field();
        Elder elder=new Elder(new Position(0,0),field);
        field.draw();
        elder.standAsSnake();
        field.draw();
        SnakeDemon snakeDemon=new SnakeDemon(new Position(Field.N-1,0),
                field,8);
        snakeDemon.standAsSwing();
        field.draw();
    }
}
