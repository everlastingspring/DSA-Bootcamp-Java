package code.src.com.kunal.solidprinciples.dependencyinversion;

public class ResponseParserWithoutDI {
    JsonParserWithoutDI jsonParser;
    public ResponseParserWithoutDI(JsonParserWithoutDI jsonParser) {
        this.jsonParser = jsonParser;
    }
    public void parse(){
        jsonParser.parse();
    }
}
