package simplejavarestapi;
import static spark.Spark.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before((request,response) -> response.type("application/json"));
		
		get("/greeting", (request,response) -> new Greeting(1,"Hello World!"), new JsonTransformer());
		post("/greeting", (request,response) -> new Greeting(2,"Hello I am adding!" +request.queryParams("name") ), new JsonTransformer());
		put("/greeting", (request,response) -> new Greeting(3,"Hello I am updating!" +request.queryParams("name")), new JsonTransformer());
		delete("/greeting", (request,response) -> new Greeting(4,"Hello I am deleting!" +request.queryParams("name")), new JsonTransformer());

	}

}
