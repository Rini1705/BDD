package starter.login;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I'm on the main LinkedIn page")
    public void onTheLoginpage() {
        System.out.println("I'm on the main LinkedIn page");
    }

    @Step("I click the \"Login\" button")
    public void EnterUsenameAndPassword() {
        System.out.println("I click the \"Login\" button");
    }

    @Step("I entered a valid email and password" + "I chose the login option with a Google or Microsoft account"
    + "I entered a valid email and password" + "I clicked the \"Login\" button")
    public void ClickLoginBUtton() {
       System.out.println("I entered a valid email and password");
    }

    @Step("I will be able to successfully login to my LinkedIn account")
    public void onTheHomePage() {
       System.out.println("I will be able to successfully login to my LinkedIn account");
    }
}
