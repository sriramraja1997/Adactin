Feature: Validation of Adactin Search Hotel page

@reg
  Scenario Outline: Verifying Adactin Search Hotel Page and Fields
    Given User is on login Page
    When User should enter "<userName>" and "<password>"
    When User should enter the search hotel fields "<location>","<hotel>","<roomType>", "<roomno>","<datePick>","<dateOut>","<adult>","<child>"
    Then User should verify the select hotel page

    Examples: 
      | userName   | password | location | hotel          | roomType | roomno | datePick   | dateOut    | adult | child |
      | sriramraja | JLQU4G   | Sydney   | Hotel Sunshine | Double   |      4 | 25/03/2021 | 26/03/2021 |     3 |     3 |

@reg
  Scenario Outline: Verifying Adactin Search Hotel mandatory fields
    Given User is on login Page
    When User should enter "<userName>" and "<password>"
    When User should enter the search hotel fields "<location>", "<roomno>","<datePick>","<dateOut>","<adult>"
    Then User should verify the select hotel page

    Examples: 
      | userName   | password | location | roomno | datePick   | dateOut    | adult |
      | sriramraja | JLQU4G   | Sydney   |      4 | 25/03/2021 | 26/03/2021 |     3 |
@smoke
  Scenario Outline: Validation of date fields
    Given User is on login Page
    When User should enter "<userName>" and "<password>"
    When User should enter the search hotel fields  "<datePick>","<dateOut>"
    Then User should verify the error messages

    Examples: 
      | userName   | password | datePick   | dateOut    |
      | sriramraja | JLQU4G   | 24/03/2021 | 23/03/2021 |

  @smoke
  Scenario Outline: Validation of Search page without enter any fields
    Given User is on login Page
    When User should enter "<userName>" and "<password>"
    And should verify the error message

    Examples: 
      | userName   | password |
      | sriramraja | JLQU4G   |
