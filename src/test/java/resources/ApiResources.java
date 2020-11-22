package resources;

public enum ApiResources {

	
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");

	private String resource;
	ApiResources(String resource) {
		// TODO Auto-generated constructor stub
	
		this.resource=resource;
	}
	
	public String getResources() {
		return resource;
	}
}
