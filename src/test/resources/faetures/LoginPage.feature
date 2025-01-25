Feature: Login Tests

  @Login1
  Scenario: Test Case 1
    Given setup the app
    When click on Login Btn on HomePage
    When type "atafarivar@email.com" in username textbox
    When type "123456" in password textbox
    When Click on login btn on login page
    Then You should login to your account and see your name

  @Login @Performance
  Scenario Outline: TestCase2
    Given setup the app
    When click on Login Btn on HomePage
    When type "<user>" in username textbox
    When type "<pass>" in password textbox
    When Click on login btn on login page
    Then You should login to your account and see your "<message>"
    Examples:
      | user                  |  | pass   |  | message     |
      | atafarivar@email.com  |  | 123456 |  | Hello Ata   |
      | nilooAhmari@email.com |  | 123456 |  | Hello Niloo |
      | hasanhasani@email.com |  | 123456 |  | Hello Hasan |