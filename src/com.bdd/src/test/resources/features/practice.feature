Feature: Practice Form Functionality

  @regression
  Scenario Outline: Register with multiple data
    Given user is on the registration page
    When user enters "<name>" as name
    And user enters "<email>" as email
    And user selects gender
    And user enters "<MoNum>" as mobile number
    And user enters "<DOB>" as DOB
    And user enters "<subject>" as subject
    And user selects hobbies
    And user uploads picture "<pic>"
    And user enters "<address>" as address
    And user selects "<state>" as state
    And user selects "<city>" as city
    And user clicks on login button
    Then user should sees "<expectedResult>"

    Examples:
      | name           | email          | MoNum      | DOB       | subject   | pic                           	  | address   | state          | city | expectedResult |
      | Sri Vaishnavi | sri@123.com    | 8185037579 | 22-03-2003| Selenium  | C:\Users\avina\Downloads\image.png | 123-IN-TS |Telangana  |   Siddipet  | Success        |