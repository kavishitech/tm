package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.tm.dms.dto.Driver;
import com.tm.dms.utils.JsonUtils;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.util.logging.Logger;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class DriverController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok("YES!!");
    }


    public Result create(Http.Request request){
        JsonNode driverJson = request.body().asJson();
        try {
            Driver userCropDto = JsonUtils.getObjectMapper().treeToValue(driverJson, Driver.class);
            System.out.println("Uer "+userCropDto.getFirstName());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return ok("Created");
    }

}
