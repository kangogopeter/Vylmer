import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");
        staticFiles.location("/public"); // Static files
        String display = "templates/index.vtl"; //velocity template
        //methods of Get(get)/PUT(put)/PATCH(patch)/DELETE(delete)
        // e.g. get("/hello", (request, response))
        get("/", (res,req)->{
        	Map<String, Object> data = new HashMap<String, Object>();
        	data.put("user",User.all());
        	data.put("photo",Photo.all());
        	data.put("state",State.all());
        	data.put("sex",Sex.all());
        	data.put("joinedat",JoinedAt.all());
        	data.put("template","templates/userdata.vtl");
        	return new ModelAndView(data, display);
        });

        get("/user", (res,req)->{
        	Map<String, Object> secData = new HashMap<String, Object>();
        	secData.put("image",Image.all());
        	secData.put("info",Info.all());
        	secData.put("price", Price.all());
        	secData.put("created_at",CreatedDate.all());
        	return new ModelAndView(secData, display);

        });

        get("/comment", (res, req)->{
        	Map<String,Object> comm = new HashMap<String, Object>();
        	comm.put("comments", State.all());
        	return new ModelAndView(comm, display);
		});

        post("/contents", (res,req)->{
        	Map<String, Object> data3 = new HashMap<String, Object>();


        	return new ModelAndView(  , display);
        });

    }

    
}
