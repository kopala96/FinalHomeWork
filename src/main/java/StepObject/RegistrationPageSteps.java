package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

public class RegistrationPageSteps extends RegistrationPage {

    @Step("პროფილის გვერდის გახსნა : {profileBtn}")
    public RegistrationPageSteps ProfileBtn() {
        profileBtn.click();
        profileBtn.shouldBe(Condition.enabled);
        return this;

    }
    @Step("რეგისტრაციაზე გადასვლა : {regBtn}")
    public RegistrationPageSteps GotoRegPage() {
        regBtn.click();

        return this;
    }
    @Step("იმეილის ველში იმეილის ჩაწერა : {emailInput}")
    public RegistrationPageSteps Email(String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;

    }


    public RegistrationPageSteps Password(String pass) {
        passwordInput.setValue(pass);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("პაროლის ველში პაროლის ჩაწერა : {confirmPasswordInput}")
    public RegistrationPageSteps ConfirmPassword(String pass) {
        confirmPasswordInput.setValue(pass);
        confirmPasswordInput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("რეგისტრაციის ღილაკი : {finRegBtn}")
    public RegistrationPageSteps FinReg() {
        finRegBtn.click();
        // Assert.assertTrue(finRegBtn.isDisplayed(),"regbtn visible");
        return this;

    }

    public RegistrationPageSteps CheckMark() {
        checkMarkBtn.click();
        checkMarkBtn.shouldBe(Condition.visible);
        return this;

    }
    @Step("უკვე გავლილი გაქვთ რეგისტრაცია ამ ფანჯარის გამორთვა : {closeBtn}")
    public RegistrationPageSteps Close() {
        closeBtn.click();
        return this;

    }
}