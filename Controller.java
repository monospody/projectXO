package XO;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Random;

public class Controller {
    public Button btne;
    public Button btnr;
    public Button btns;
    public Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15;
    private Game game;

    public Controller() {
        game = new Game();
    }

    public void clickedOnBtn(ActionEvent actionEvent) {
        String temp = ((Button)actionEvent.getSource()).getId().substring(3);
        int value = Integer.parseInt(temp);
        game.nextMove(value);
        if(game.getField() != null)
        rePaint();
    }

    private void rePaint() {
        Tile[][] a = game.getField().getArr();
        btn0.setText(a[0][0].isValue()?"X":"O");
        btn1.setText(a[1][0].isValue()?"X":"O");
        btn2.setText(a[2][0].isValue()?"X":"O");
        btn3.setText(a[3][0].isValue()?"X":"O");

        btn4.setText(a[0][1].isValue()?"X":"O");
        btn5.setText(a[1][1].isValue()?"X":"O");
        btn6.setText(a[2][1].isValue()?"X":"O");
        btn7.setText(a[3][1].isValue()?"X":"O");

        btn8.setText(a[0][2].isValue()?"X":"O");
        btn9.setText(a[1][2].isValue()?"X":"O");
        btn10.setText(a[2][2].isValue()?"X":"O");
        btn11.setText(a[3][2].isValue()?"X":"O");

        btn12.setText(a[0][3].isValue()?"X":"O");
        btn13.setText(a[1][3].isValue()?"X":"O");
        btn14.setText(a[2][3].isValue()?"X":"O");
        btn15.setText(a[3][3].isValue()?"X":"O");
    }

    public void restartGame(ActionEvent actionEvent) {
        game.resetGame();
        btns.setDisable(false);
        btnr.setDisable(true);

    }
    public void endGame(ActionEvent actionEvent) {
        Stage stage = (Stage) btne.getScene().getWindow();
        stage.close();

    }
    public void startGame(ActionEvent actionEvent) {
        game.startGame();
        btns.setDisable(true);
        btnr.setDisable(false);
        rePaint();
    }
}
