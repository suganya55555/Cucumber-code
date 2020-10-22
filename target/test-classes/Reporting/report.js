$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/DataProvider.feature");
formatter.feature({
  "name": "Verifying the adaction functionalities",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Func1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomType\u003e\"",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "noOfRooms",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "3 - Three",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "1 - One",
        "2 - Two"
      ]
    }
  ]
});
formatter.step({
  "name": "User should click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "User should click radio button",
  "keyword": "When "
});
formatter.step({
  "name": "User should click the continue button",
  "keyword": "Then "
});
formatter.step({
  "name": "User should enter \"\u003cfirstName\u003e\",\"\u003cLastName\u003e\",\"\u003caddress\u003e\",\"\u003ccardNo\u003e\",\"\u003cExpDate\u003e\",\"\u003cExpYear\u003e\" and \"\u003cCVV\u003e\"",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "cardTypes"
      ]
    },
    {
      "cells": [
        "Master Card"
      ]
    },
    {
      "cells": [
        "American Express"
      ]
    },
    {
      "cells": [
        "VISA"
      ]
    },
    {
      "cells": [
        "Other"
      ]
    }
  ]
});
formatter.step({
  "name": "User should click the book now button",
  "keyword": "And "
});
formatter.step({
  "name": "User can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotels",
        "roomType",
        "firstName",
        "LastName",
        "address",
        "cardNo",
        "ExpDate",
        "ExpYear",
        "CVV"
      ]
    },
    {
      "cells": [
        "suganyasugan",
        "Suganya90",
        "London",
        "Hotel Creek",
        "Standard",
        "Suganya",
        "R",
        "Chennai",
        "1236547890123654",
        "May",
        "2022",
        "2425"
      ]
    },
    {
      "cells": [
        "edwinraj",
        "edwin@123",
        "London",
        "Hotel Creek",
        "Double",
        "Suganya",
        "R",
        "Chennai",
        "1236547890123654",
        "May",
        "2022",
        "2425"
      ]
    },
    {
      "cells": [
        "priyadharshiniM",
        "priyasuji",
        "London",
        "Hotel Creek",
        "Deluxe",
        "Suganya",
        "R",
        "Chennai",
        "1236547890123654",
        "May",
        "2022",
        "2425"
      ]
    },
    {
      "cells": [
        "Abhimanyuu",
        "Password01",
        "London",
        "Hotel Creek",
        "Super Deluxe",
        "Suganya",
        "R",
        "Chennai",
        "1236547890123654",
        "May",
        "2022",
        "2425"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Func1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"suganyasugan\",\"Suganya90\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"London\",\"Hotel Creek\",\"Standard\"",
  "rows": [
    {
      "cells": [
        "noOfRooms",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "3 - Three",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "1 - One",
        "2 - Two"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click radio button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_click_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter \"Suganya\",\"R\",\"Chennai\",\"1236547890123654\",\"May\",\"2022\" and \"2425\"",
  "rows": [
    {
      "cells": [
        "cardTypes"
      ]
    },
    {
      "cells": [
        "Master Card"
      ]
    },
    {
      "cells": [
        "American Express"
      ]
    },
    {
      "cells": [
        "VISA"
      ]
    },
    {
      "cells": [
        "Other"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_can_check_the_booking_confirmation_order_in_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Func1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"edwinraj\",\"edwin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"London\",\"Hotel Creek\",\"Double\"",
  "rows": [
    {
      "cells": [
        "noOfRooms",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "3 - Three",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "1 - One",
        "2 - Two"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click radio button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_click_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter \"Suganya\",\"R\",\"Chennai\",\"1236547890123654\",\"May\",\"2022\" and \"2425\"",
  "rows": [
    {
      "cells": [
        "cardTypes"
      ]
    },
    {
      "cells": [
        "Master Card"
      ]
    },
    {
      "cells": [
        "American Express"
      ]
    },
    {
      "cells": [
        "VISA"
      ]
    },
    {
      "cells": [
        "Other"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_can_check_the_booking_confirmation_order_in_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Func1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"priyadharshiniM\",\"priyasuji\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"London\",\"Hotel Creek\",\"Deluxe\"",
  "rows": [
    {
      "cells": [
        "noOfRooms",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "3 - Three",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "1 - One",
        "2 - Two"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click radio button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_click_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter \"Suganya\",\"R\",\"Chennai\",\"1236547890123654\",\"May\",\"2022\" and \"2425\"",
  "rows": [
    {
      "cells": [
        "cardTypes"
      ]
    },
    {
      "cells": [
        "Master Card"
      ]
    },
    {
      "cells": [
        "American Express"
      ]
    },
    {
      "cells": [
        "VISA"
      ]
    },
    {
      "cells": [
        "Other"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_can_check_the_booking_confirmation_order_in_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify user can able to book the hotel with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Func1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"Abhimanyuu\",\"Password01\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"London\",\"Hotel Creek\",\"Super Deluxe\"",
  "rows": [
    {
      "cells": [
        "noOfRooms",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "3 - Three",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "1 - One",
        "0 - None"
      ]
    },
    {
      "cells": [
        "6 - Six",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "1 - One",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "1 - One",
        "2 - Two"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click radio button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_click_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter \"Suganya\",\"R\",\"Chennai\",\"1236547890123654\",\"May\",\"2022\" and \"2425\"",
  "rows": [
    {
      "cells": [
        "cardTypes"
      ]
    },
    {
      "cells": [
        "Master Card"
      ]
    },
    {
      "cells": [
        "American Express"
      ]
    },
    {
      "cells": [
        "VISA"
      ]
    },
    {
      "cells": [
        "Other"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can check the booking confirmation order in the page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_can_check_the_booking_confirmation_order_in_the_page()"
});
formatter.result({
  "status": "skipped"
});
});