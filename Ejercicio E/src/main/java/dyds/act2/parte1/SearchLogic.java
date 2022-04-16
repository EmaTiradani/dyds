package dyds.act2.parte1;

import com.google.gson.Gson;

import java.net.URI;
import java.net.URISyntaxException;

public class SearchLogic {

	private ServiceProvider serviceProvider;

	public SearchLogic(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	// GET Request to search in Wiki. Format: <base-wiki-url>/w/api.php?<actions>&srsearch=<search information>
	// Example:
	// https://en.wikipedia.org/w/api.php?action=query&format=json&list=search&srsearch=Baldurs%20Gate%203%20articletopic%3A%22video-games%22"
	// Result example: { "result" : "[pageid1, pageid2, pageid3,...]" }
	public String[] search(SearchInfo searchInfo) {
		/*
		//This is used at the end to return the result
		String[] resPosta = new String[0];

		//String baseUrl = "https://en.wikipedia.org"; //Moving this to searchInfo, because reasons
		String rest = "action=query&format=json&list=search";

		String s ="https://"+ searchInfo.getBaseURL() + "/w/api.php?"+ rest +"&srsearch=" + searchInfo.getTextToSearch();

		if(searchInfo.getTopic() != null && !searchInfo.getTopic().equals(""))
			s+=" articletopic%3A\"" + searchInfo.getTopic() + "\"";

		// replaces spaces with encoding %20 
		s = s.replace(" ", "%20");
		// replaces " with encoding %22
		s = s.replace("\"", "%22");
		*/
		String rest = "action=query&format=json&list=search";
		String request = formatRequest(rest, searchInfo);
		String json = null;

		try {
			json = serviceProvider.resolveCall(new URI(request));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Result resultado = null;
		resultado = obtenerResultado(,resultado) //TODO

		if (json != null) {
			Gson gson = new Gson();
			addUserResult = gson.fromJson(json, Result.class);
			//resPosta = addUserResult.getResult();
		}

		//return new String[5]; //resPosta;
	}


	private String formatRequest(String rest, SearchInfo searchInfo){
		String baseURL =  searchInfo.getBaseURL();
		String textToSearch =  searchInfo.getTextToSearch();
		String topic = searchInfo.getTopic();
		boolean emptyTopic = searchInfo.getTopic().equals("");

		String formattedRequest = "https://"+ baseURL + "/w/api.php?"+ rest +"&srsearch=" + textToSearch;

		if(topic != null && !emptyTopic) {
			formattedRequest+=" articletopic%3A\"" + searchInfo.getTopic() + "\"";
		}

		return replaceSpacesWithEnconding22(replaceSpacesWithEnconding20(formattedRequest));//Make a variable "encoded result" ??
	}
	private String replaceSpacesWithEnconding20(String request){
		return request.replace(" ", "%20");
	}
	private String replaceSpacesWithEnconding22(String request){
		return request.replace("\"", "%22");
	}

}
