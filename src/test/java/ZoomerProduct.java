import StepObject.ZoomerProductSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ZoomerProduct extends ChromeRunner {
    ZoomerProductSteps zoomerProductSteps = new ZoomerProductSteps();

    @Description("ფასი ზრდადობით შემოწმება")
    @Test
    public void product() {
        zoomerProductSteps.MobileBtn()
                .GamoshBtn()
                .SortBtn()
                .checkfilter();

    }

    @Description("ფასი კლებადობით შემოწმება")
    @Test
    public void sortP() {
        zoomerProductSteps.MobileBtn()
                .GamoshBtn()
                .SortBtnK()
                .checkfilterN();
    }

    @Description("რაოდენობის შემოწმება")
    @Test
    public void checkCountS() {
        zoomerProductSteps.MobileBtn()
                .GamoshBtn()
                .checkCount();
    }
}


