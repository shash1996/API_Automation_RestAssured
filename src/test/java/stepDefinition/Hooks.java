package stepDefinition;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	//agar sirf delete place ka test cases chalana hai toh isiliye
	@Before("@DeletePlace")
	public void BeforedeletePlaceScenario() throws IOException {
		//execute this code only when place id is null
		//write a code that will give u place id
		stepDefinition sd=new stepDefinition();
		if(stepDefinition.place_id==null) {
		sd.add_Place_Payload_with("jhdjhfjdh", "ghjjk", "thtyr");
		sd.user_calls_with_http_request("AddPlaceAPI", "post");
		//to get place_id
		sd.verify_place_Id_created_maps_to_using("jhdjhfjdh", "deletePlaceAPI");
	}
}
	}
