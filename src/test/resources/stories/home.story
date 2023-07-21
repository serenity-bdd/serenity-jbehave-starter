Meta:
@SampleTest1
@features new


Scenario: Searching for gherkin
Given Sergey is on the DuckDuckGo home page
When he searches for <keyword>
Then all the result titles should contain the word <keyword>
Examples:
| keyword |
| Gherkin |
