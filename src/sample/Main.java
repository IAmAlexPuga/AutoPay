package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Libs\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.pse.com/en/account-and-billing/payment-options/guest-payment");
        launch(args);


    }
}
