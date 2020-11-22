Feature: Validating Place API's

@AddPlace
Scenario Outline:: verify if place is being succesfully added using AddPlaceAPI
   Given Add Place Payload with "<name>" "<language>" "<address>"
   When user calls "AddPlaceAPI" with "Post" http request
   Then the API call is success with status code 200
   And "status" in response body is "ok"
   And verify place_Id created maps to "<name>" using "getPlaceAPI"
Examples:
  |name| language| address|
  |asas|dhjashd|jsdkhsk|
  
@DeletePlace
Scenario: Verify if Delete Place functionality is working 
  Given DeletePlace Payload
  When user calls "deletePlaceAPI" with "Post" http request
  Then the API call is success with status code 200
  And "status" in response body is "ok"