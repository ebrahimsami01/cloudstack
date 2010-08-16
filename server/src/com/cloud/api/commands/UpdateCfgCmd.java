/**
 *  Copyright (C) 2010 Cloud.com, Inc.  All rights reserved.
 * 
 * This software is licensed under the GNU General Public License v3 or later.
 * 
 * It is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.cloud.api.commands;

import org.apache.log4j.Logger;

import com.cloud.api.BaseCmd;
import com.cloud.api.BaseCmd.Manager;
import com.cloud.api.Implementation;
import com.cloud.api.Parameter;

@Implementation(method="updateConfiguration", manager=Manager.ConfigManager)
public class UpdateCfgCmd extends BaseCmd {
    public static final Logger s_logger = Logger.getLogger(UpdateCfgCmd.class.getName());
    private static final String s_name = "updateconfigurationresponse";

    /////////////////////////////////////////////////////
    //////////////// API parameters /////////////////////
    /////////////////////////////////////////////////////

    @Parameter(name="name", type=CommandType.STRING, required=true)
    private String cfgName;

    @Parameter(name="value", type=CommandType.STRING)
    private String value;

    /////////////////////////////////////////////////////
    /////////////////// Accessors ///////////////////////
    /////////////////////////////////////////////////////

    public String getCfgName() {
        return cfgName;
    }

    public String getValue() {
        return value;
    }

    /////////////////////////////////////////////////////
    /////////////// API Implementation///////////////////
    /////////////////////////////////////////////////////

    public String getName() {
        return s_name;
    }

//    @Override
//    public List<Pair<String, Object>> execute(Map<String, Object> params) {
//        String name = (String) params.get(BaseCmd.Properties.NAME.getName());
//        String value = (String) params.get(BaseCmd.Properties.VALUE.getName());
//        Long userId = (Long)params.get(BaseCmd.Properties.USER_ID.getName());
//        
//        if (userId == null) {
//            userId = Long.valueOf(User.UID_SYSTEM);
//        }
//        
//        try {
//        	getManagementServer().updateConfiguration(userId, name, value);
//        } catch (Exception ex) {
//        	throw new ServerApiException(BaseCmd.INTERNAL_ERROR, ex.getMessage());
//        }
//
//        List<Pair<String, Object>> returnValues = new ArrayList<Pair<String, Object>>();
//        returnValues.add(new Pair<String, Object>(BaseCmd.Properties.SUCCESS.getName(), "true"));
//        returnValues.add(new Pair<String, Object>(BaseCmd.Properties.DISPLAY_TEXT.getName(), "Successfully updated configuration value."));
//        
//        return returnValues;
//    }
}
