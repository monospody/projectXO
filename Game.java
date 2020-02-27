package XO;

public class Game {
    private Field field;
    private State state;

    public Game(){
        state = State.READY;
    }
    public void startGame(){
        if(state == State.READY) {
            state = State.RUNNING;
            field = new Field();
            field.shuffle();
        }
    }
    public void endGame(){
        if(state ==  State.RUNNING) {
            state = State.FINISH;
        }
    }
    public void resetGame(){
        if(state !=  State.READY) {
            state = State.READY;
            field = null;
        }
    }
    public void nextMove(int code){
        if(state ==  State.RUNNING) {
            field.toggleTiles(code);
            System.out.println(code);
            field.print();
        }
        if(field.isWinner()){
            endGame();
        }
    }

    public Field getField() {
        return field;
    }
}
