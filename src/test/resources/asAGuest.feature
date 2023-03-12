Feature: GitHub search and navigation

  Scenario Outline: Search for a repository and navigate to the About page
    Given User is a guest user on the GitHub landing page
    When User search for "<search_term>" from the landing page search input
    Then User see a count of matching results
    And User verify that "<first_result>" is the first result
    When User click the About button in the landing page footer
    Then   User click on the About page

    Examples:
      | search_term       | first_result             |
      | create-react-app  | facebook/create-react-app|