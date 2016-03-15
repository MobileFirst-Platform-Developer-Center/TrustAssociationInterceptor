/**
* Copyright 2016 IBM Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
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
