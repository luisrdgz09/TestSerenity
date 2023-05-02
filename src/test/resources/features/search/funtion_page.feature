Feature: Search by keyword

  @test
  Scenario: Searching for a term
    Given Sergey is researching things on the internet
    When he add and remove items to a table with
      | name    | last_name | email               | age | salary  | department |
      | Pruebas | QA        | Pruebasqa@gmail.com | 15  | 1200000 | Bogota     |
    Then he should add and remove correctly

  @test1
  Scenario: Searching for a term
    Given Sergey is researching things on the internet
    When he select date with day "25" month "January" year "2023"
    And he select day "25" and time hours "1:00"
    Then he should add and remove correctly

  @test3
  Scenario Outline: Select date in data piker
    Given Sergey is researching things on the internet
    When he open the differents alerts <alerts>:
    Then he should see the alert correctly
    Examples:
      | alerts                 |
      | "simple_alert"         |
      | "alert_after_5_second" |
      | "alert_confirm_box"    |
      | "alert_prompt_box"     |