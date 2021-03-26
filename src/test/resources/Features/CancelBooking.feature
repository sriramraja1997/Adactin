Feature: Verifying Cancel booking on Adactin Application
@reg
  Scenario Outline: Adactin Cancel Booking Test
    Given User is on login Page
    When User should enter "<userName>" and "<password>"
    And User should enter all fields in search page "<location>","<hotel>","<roomType>","<roomno>","<datePick>","<dateOut>","<adult>","<child>" and click hotel and click Continue
    And User should fill all mandatory fields on page "<FirstName>", "<LastName>", "<BillingAddress>", "<CreditCardNo>","<CardType>", "<expMonth>", "<expYear>", "<cvvNumber>"
    And User should click Booknow button
    Then User Should verify the Cancel Booking

    Examples: 
      | userName   | password | location | hotel          | roomType | roomno | datePick   | dateOut    | adult | child | FirstName | LastName | BillingAddress | CreditCardNo     | CardType | expMonth | expYear | cvvNumber |
      | sriramraja | JLQU4G   | Sydney   | Hotel Sunshine | Double   |      4 | 25/03/2021 | 26/03/2021 |     3 |     3 | Sriram    | Raja     | No:12 Adyar    | 2316547891876543 | VISA     |        4 |    2022 |      1234 |

@smoke
  Scenario Outline: Adactin Cancel Booking Test with existing order no
    Given User is on login Page
    When User should enter "<userName>" and "<password>"
    When User should Booked Itinerary and select the orderno
    Then User should click and verify the cancel

    Examples: 
      | userName   | password |
      | sriramraja | JLQU4G   |
