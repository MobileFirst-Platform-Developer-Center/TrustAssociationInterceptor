/*
 *
    COPYRIGHT LICENSE: This information contains sample code provided in source code form. You may copy, modify, and distribute
    these sample programs in any form without payment to IBM® for the purposes of developing, using, marketing or distributing
    application programs conforming to the application programming interface for the operating platform for which the sample code is written.
    Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON AN "AS IS" BASIS AND IBM DISCLAIMS ALL WARRANTIES,
    EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY QUALITY,
    FITNESS FOR A PARTICULAR PURPOSE, TITLE, AND ANY WARRANTY OR CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT,
    INDIRECT, INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF THE SAMPLE SOURCE CODE.
    IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.

 */
package com.sample.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.JSONObject;

import com.worklight.security.ClientContext;


@Path("/api")
public class ServiceAPI {

    @GET
    @Path("/public")
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject getSomePublicData() throws JSONException
    {
    	JSONObject res = new JSONObject();
    	res.put("title", "Some public backend data");
    	res.put("description", "Some public backend data returned by a REST service");
        return res;
    }

    @GET
    @Path("/protected")
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject getSomeProtectedData() throws JSONException
    {
    	JSONObject res = new JSONObject();
    	res.put("title", "Some protected backend data");
    	res.put("description", "Some protected backend data returned by a REST service");
        return res;
    }

}
