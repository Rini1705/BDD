package starter.search;

import net.thucydides.core.annotations.Step;

public class Search {
    @Step("I have successfully logged into my LinkedIn account")
    public void onTheSearchpage() {
        System.out.println("I have successfully logged into my LinkedIn account");
    }

    @Step("I enter the username I want to search for in the search field")
    public void EnterUsernameInthesearchfielad() {
        System.out.println("I enter the username I want to search for in the search field");
    }

    @Step("I clicked the \"Search\" button")
    public void ClickSearchBUtton() {
        System.out.println("I clicked the \"Search\" button");
    }

    @Step("I will see search results relevant to the username I'm looking for")
    public void onTheUserSearch() {
        System.out.println("I will see search results relevant to the username I'm looking for");
    }
}
