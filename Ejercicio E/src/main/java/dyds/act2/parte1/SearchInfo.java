package dyds.act2.parte1;

public class SearchInfo {

  private String textToSearch;
  private String topic;
  private String baseURL;

  public SearchInfo(String textToSearch, String topic, String baseURL) {
    this.textToSearch = textToSearch;
    this.topic = topic;
    this.baseURL = baseURL; //in which wiki we should search
  }

  public String getTextToSearch() {
    return textToSearch;
  }

  public String getTopic() {
    return topic;
  }

  public String getBaseURL() {
      return baseURL;
  }
}
