Feature: About this item feature

  Scenario: User should be able to see second highest priced item's about this section menu
    Given user is on the homepage of the application
    When user clicks the hamburger menu in the top left corner
    And user scrolls down and then Click on the TV, Appliances and Electronics link under Shop by Department section
    And user clicks on Televisions under Tv, Audio & Cameras sub section
    And user scrolls down and filter the results by Brand Samsung
    And user sorts the Samsung results with price High to Low
    And user clicks on the second highest priced item and window switches
    Then user should be able to see that About this item section present logs this section text to console-report



