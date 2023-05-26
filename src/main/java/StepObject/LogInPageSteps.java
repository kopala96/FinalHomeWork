package StepObject;

import PageObject.LogInPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class LogInPageSteps extends LogInPage {
    public LogInPageSteps ProfileBtn() {
        profileBtn.click();
        profileBtn.shouldBe(Condition.enabled);
        return this;
    }

    public LogInPageSteps EmailS (String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;
    }
    public LogInPageSteps PasswordS (String password) {
        passwordInput.setValue(password);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
}
    public LogInPageSteps LogIn () {
        logInBtn.click();
        return this;
    }
    public LogInPageSteps BackBtn () {
        backBtn.click();
        backBtn.shouldBe(Condition.enabled);
        return this;
    }
}
