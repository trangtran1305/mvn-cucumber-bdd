Feature: Facebook login page

  @tag1
  Scenario: verify login page
    Given open Facebook application
    Then verify email textbox is displayed
    And verify password textbox is displayed
    And close application

  @tag2
  Scenario: verify login page
    Given open Facebook application
    Then sendkey email textbox is "changtran1305@gmail.com"
    And sendkey password textbox is "123456"
    And close application

  @tag3
  Scenario Outline: Create
    Given open facebook application
    Then sendkey email textbox is  "<Email>"
    And sendkey password textbox is  "<Password>"

    Examples: 
      | Email                   | Password |
      | changtran1305@gmail.com |   123456 |
