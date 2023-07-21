Meta:
@SampleTest2
@features new

Scenario: Searching for cucumber
Given Sergey is on the DuckDuckGo home pages
When he searches for <keyword>
Then all the result titles should contain the word <keyword>
Examples:
| keyword |
| Cucumber |
