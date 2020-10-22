@Func1
Feature: Verifying the adaction functionalities

  Scenario Outline: Verify user can able to book the hotel with valid credentials
    Given User is on the adactin page
    When User should enter "<userName>","<password>"
    And User should click Login button
    When User should enter "<location>","<hotels>","<roomType>"
      | noOfRooms | adultroom | childroom |
      | 1 - One   | 1 - One   | 1 - One   |
      | 2 - Two   | 2 - Two   | 2 - Two   |
      | 3 - Three | 3 - Three | 3 - Three |
      | 4 - Four  | 4 - Four  | 4 - Four  |
      | 5 - Five  | 1 - One   | 0 - None  |
      | 6 - Six   | 1 - One   | 2 - Two   |
      | 7 - Seven | 1 - One   | 2 - Two   |
      | 8 - Eight | 1 - One   | 2 - Two   |
      | 9 - Nine  | 1 - One   | 2 - Two   |
      | 10 - Ten  | 1 - One   | 2 - Two   |
    And User should click on search button
    When User should click radio button
    Then User should click the continue button
    When User should enter "<firstName>","<LastName>","<address>","<cardNo>","<ExpDate>","<ExpYear>" and "<CVV>"
      | cardTypes        |
      | Master Card      |
      | American Express |
      | VISA             |
      | Other            |
    And User should click the book now button
    And User can check the booking confirmation order in the page

    Examples: 
      | userName        | password   | location | hotels      | roomType     | firstName | LastName | address | cardNo           | ExpDate | ExpYear | CVV  |
      | suganyasugan    | Suganya90  | London   | Hotel Creek | Standard     | Suganya   | R        | Chennai | 1236547890123654 | May     |    2022 | 2425 |
      | edwinraj        | edwin@123  | London   | Hotel Creek | Double       | Suganya   | R        | Chennai | 1236547890123654 | May     |    2022 | 2425 |
      | priyadharshiniM | priyasuji  | London   | Hotel Creek | Deluxe       | Suganya   | R        | Chennai | 1236547890123654 | May     |    2022 | 2425 |
      | Abhimanyuu      | Password01 | London   | Hotel Creek | Super Deluxe | Suganya   | R        | Chennai | 1236547890123654 | May     |    2022 | 2425 |
