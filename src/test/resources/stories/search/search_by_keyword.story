Search by keyword

Scenario: Searching for a term
Given Sergey is on the DuckDuckGo home page
When he searches for "<keyword>"
Then all the result titles should contain the word "<keyword>"
Examples:
| keyword |
| Cucumber |
| Gherkin |
