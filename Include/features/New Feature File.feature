 Feature: Login

  Scenario Outline: create Users
    Given User navigates to the Application
    When Maximise the Browser
    Then clicks on Usename Field
    And User enters username
    And User clicks on Password Field
    And User enters Password
    And clicks on Login
    And clicks on Administration
    And clicks on User Administration 
    And fills <username> and fills <firstname>   
    And user fills lastname
    And user fills Phone extenstion
    And user fills phone number
    And user fills emails notification
    And user fills email address
    And user fills enable disable
    And user fills role
    And user fills description
    And user fills user status  
    And clicks on Save
    
    
Examples:
            |username|firstname|
            |tttt|jojo|
            |tttttdd| sahar|
            |yyuuuu| dian|
            |yyyuiyyyy|Amaal|
            |yyyryyyyy|fahed|
            |yyeyytryyyyy|faisal|
            |yyyryyyyyyy|narjes|
            |yyyeeyyyyyyyy|ahmad|
            |yyyyyyy|bader|
            |yyyhh|bassam|
            |yhh|saleh|
            |yhhh|lora|
            |yhhh| waed|
            |yyhhh|hussam|
            |yyynhhafnan|
            |ybnm|surra|
            |yyynmm|umniah|
            |yymju|nader|
            |yhjl|ali|
            |yyyuio|omar|
            |yyyklo|foad|
            |www|noor|
            |wwww| noora|
            |wwwww| fatah|
            |wwwwww|marah|
            |wwwwwww|amany|
            |wwwwwwww|zeina|
            |wwwwwwwww|haneen|
            |wwwwwwwwww|areej|
            |wwwwwwwwwww|maram|
            |wwwwwwwwwwww|doha|
            |wwwwwwwwwwwww| rawan|
            |wwwwwwwwwwwwww|majdal|
            |wwwwwwwwwwwwwww|huda|
            |wwwwwwwwwwwwwwww|rozana|
            |wwwwwwwwwwwwwwwww|alaa|
            |wwwwwwwwwwwwwwwwwww|talal|
            |wwwwwwwwwwwwwwwwwwww|tamara|
            |iii|lana|
            |iiii|manal|
            |iiiii|ibtesam|
            |iiiiii|nawal|
            |iiiiiii|mila|
            |iiiiiiii|reem|
            |iiiiiiiii|berla|
            |iiiiiiiiii|dana|
            |iiiiiiiiiii|diala|
            |iiiiiiiiiiii|qais|
            |iiiiiiiiiiiii|kareem|
            
            