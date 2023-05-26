
import Utills.ChromeRunner;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Buscket extends ChromeRunner {

    @Test
    public void sign() {

        $("#small-searchterms",0).setValue("iphone");
        sleep(2000);
        $(".h_search_btn").click();
        sleep(3000);
        $(byText("Apple iPhone 13 | 256GB Red"),0).click();
        sleep(3000);
        $(".n-add-cart").click();
        sleep(4000);
        $(".header_basket").click();
        sleep(3000);


    }

}

