Feature: Verifying Adactin hotel Application Booking

  @reg
  Scenario Outline: Adactin Booking Test
    Given User is on login Page
    When User should enter "<userName>" and "<password>"
    And User should enter all fields in search page "<location>","<hotel>","<roomType>","<roomno>","<datePick>","<dateOut>","<adult>","<child>" and click hotel and click Continue
    And User should fill all mandatory fields on page "<FirstName>", "<LastName>", "<BillingAddress>", "<CreditCardNo>","<CardType>", "<expMonth>", "<expYear>", "<cvvNumber>"
    And User should click Booknow button
    Then User Should verify the Booking

    Examples: 
      | userName   | password | location | hotel          | roomType | roomno | datePick   | dateOut    | adult | child | FirstName | LastName | BillingAddress | CreditCardNo     | CardType | expMonth | expYear | cvvNumber |
      | sriramraja | JLQU4G   | Sydney   | Hotel Sunshine | Double   |      4 | 25/03/2021 | 26/03/2021 |     3 |     3 | Sriram    | Raja     | No:12 Adyar    | 2316547891876543 | VISA     |        4 |    2022 |      1234 |

  @smoke
  Scenario Outline: Verifying Adactin hotel Application Booking Without Entring values
    Given User is on login Page
    When User should enter "<userName>" and "<password>"
    And User should enter all fields in search page "<Location>","<Hotel>","<RoomType>","<roomno>","<CheckInDate>","<CheckOutDate>","<adult>","<child>" and click hotel and click Continue
    Then User should verify the error message

    Examples: 
      | userName   | password | Location | Hotel          | RoomType | roomno | CheckInDate | CheckOutDate | adult | child |
      | sriramraja | JLQU4G   | Sydney   | Hotel Sunshine | Double   |      4 | 25/03/2021  | 26/03/2021   |     3 |     3 |
