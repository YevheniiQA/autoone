Narrative:
As a Auto1 user
I want to perform cars filtering by first registration and price descending
So that i applied corresponding filters

Scenario: Verify sortby with price descending search filter
Given Auto1 user opens Search page
When Auto1 user selects '<firstRegistration>' on 'Erstzulassung ab' side search parameters panel
And Auto1 user selects sort by 'Höchster Preis' on top options panel
Then Auto1 user checks that all cars are sorted by price descending
And Auto1 user checks that pagination items contains filter 'sort' with 'PRICE_DESC'
And Auto1 user checks that pagination items contains filter 'yearMin' with '<firstRegistration>'
And Auto1 user checks that all cars are filtered by first registration from '<firstRegistration>'

Examples:
| firstRegistration |
| 2015              |