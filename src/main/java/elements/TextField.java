package elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TextField extends Element{
    public TextField(WebElement nativeElement){
        super(nativeElement);
    }

    @Override
    public void clear() {
        sendKeys(Keys.CONTROL + "a");
        sendKeys(Keys.DELETE);
    }

    public void setValue(String value){
        clear();
        sendKeys(value);
    }

    public void sendEnter(){
        sendKeys(Keys.ENTER);
    }

    public void appendText(String value){
        sendKeys(value);
    }

    public String getValue(){
        return (getText()==null || getText().isEmpty()) ? getAttribute("value") : getText();
    }
}
