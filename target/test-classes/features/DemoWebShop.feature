@all
Feature: to test the Demo Web Shop page on chrome browser

  Background: 
    Given the User is on the Demo Web Shop home page

  @login
  Scenario Outline: to test the Login page
    Then the User clicks on the login button on the home page
    When the User enter email as '<EmailId>' on the login page
    When the User enter password as '<password>' on the login page
    And the User clicks on the login button on the page
    And the User close the page and browser

    Examples: 
      | EmailId                | password |
      | seleniumjava@gmail.com | sel123   |

@search
  Scenario: to test search page
    Then the user hover Electronics and click on Cell phones
    Then the user click on the searched item
    And the user click on add to cart
    And the User close the page and browser