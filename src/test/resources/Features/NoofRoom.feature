Feature: Verifying the adaction functionalities

@Reg
  Scenario Outline: Verify user can able to book the hotel with valid credentials
    Given User is on the adactin page
    When User should enter "<userName>","<password>"
    And User should click Login button
    Then User should verify the login page
    When User should enter "<location>","<hotels>","<roomType>","<roomno>","<adultroom>","<childroom>"
    And User should click on search button
    Then User should verify the search hotel page
    When User should click radio button
    Then User should click the continue button
    When User should enter "<firstName>","<LastName>","<address>","<cardNo>","<cardTypes>","<ExpDate>","<ExpYear>" and "<CVV>"
    And User should click the book now button
    Then User should verify the book hotel page
    And User can check the booking confirmation order in the page

    Examples: 
      | userName      | password    | location | hotels      | roomType | roomno    | adultroom | childroom | firstName | LastName | address | cardNo           | cardTypes        | ExpDate | ExpYear | CVV  |
      | suganyasugan  | Suganya90   | London   | Hotel Creek | Double   | 1 - One   | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | kalaivinitha  | W24133      | London   | Hotel Creek | Double   | 2 - Two   | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | sitalakshmi   | Selenium25  | London   | Hotel Creek | Double   | 3 - Three | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | praveenkv     | 5K6G51      | London   | Hotel Creek | Double   | 4 - Four  | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | suganyasugan  | Suganya90   | London   | Hotel Creek | Double   | 5 - Five  | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | sssaravinth30 | Aravinth    | London   | Hotel Creek | Double   | 6 - Six   | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | meenameenuu   | meenameenuu | London   | Hotel Creek | Double   | 7 - Seven | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | suganyasugan  | Suganya90   | London   | Hotel Creek | Double   | 8 - Eight | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | kalaivinitha  | W24133      | London   | Hotel Creek | Double   | 9 - Nine  | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
      | edwinraj      | edwin@123   | London   | Hotel Creek | Double   | 10 - Ten  | 3 - Three | 1 - One   | Suganya   | R        | Chennai | 1236547890123654 | Master Card      | May     |    2022 | 2425 |
     