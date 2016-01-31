Feature: Web

@web
Scenario: Search DuckDuckGo
	Given I open DuckDuckGo
	And I enter "Transformers" in search field
	When I click on search button
	Then I should see "Transformers"