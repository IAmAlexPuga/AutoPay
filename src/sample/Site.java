package sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class Site {

    protected String[] Actions;
    protected int actionStep = 0;
    protected boolean loginInfo = false;


    public abstract void ExecuteActions();
    protected abstract boolean insertCredentials();
    protected abstract boolean login();
    protected abstract boolean pay();

}
