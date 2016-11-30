package com.ibm.bluemix.iol;


import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ibm.json.java.JSONObject;

@Path("/dswidocprocess")
public class DSWIdocProcess {

	@POST
	@Produces("application/json")
	@Consumes("application/xml")
	public String proccess(String file) throws Exception, IOException {
		
		System.out.println("DSW Idoc Process Started!");
		
		//System.out.println("Data: requestFile[" + requestFile + "]");
		
		JSONObject myJSONObj = new JSONObject();
        myJSONObj.put("ProcessResult", "Success!");
        return myJSONObj.toString();
	    
	}

}
