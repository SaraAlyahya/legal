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
            |fdfbbfgvgf|farooq|
            |uggdbvgfs | majd|
            |uffgdbvffe| musalam|
            |uddvdfbdi|hala|
            |ufdvdgbfb|fareed|
            |ubfgdvdbdd |mohanad|
            |udfgdvdbm |elin|
            |ubfdgvdbd |kamel|
            |udfdddbvgz |kamal|
            |udfddvgbdc |basem|
            |unfdddvbgd|soheer|
            |ddfddvgbul|loreen|
            |udfddvgbdsp |walaa|
            |udfddvgbdw|ammar|
            |uafdgvdbd |jamal|
            |ueedgfvbgdd|samah|
            |usddgfdbvtt |jad|
            |fuddgfdvbi|monther|
            |uidgdfdbvdo |alia|
            |uidfdvgbddo |omran|
            |upddgfbvdd |mennah|
            |urdgddvbfdt |noreen|
            |tdwgdddbve| fatima|
            |tddgbdfdvvb| fahdah|
            |fddxgdfbvd|jory|
            |sddgddvfbf|ghader|
            |sddgdvdfbz|mais|
            |tdddgfdbvz|maiada|
            |sdddgfdvbzn |imad|
            |scdfgddvdb |haitham|
            |svdfgddvdbb |rasha|
            |sfdfddgdbv| ronza|
            |sfdfddgdbvdg |dalal|
            |seddfgddvbs|lial|
            |sgddfgddvbh |lia|
            |snddfgddvbmk|tia|
         
        
            
            