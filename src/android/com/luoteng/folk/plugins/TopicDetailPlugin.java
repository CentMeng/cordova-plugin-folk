/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/
package com.luoteng.folk.plugins;

import com.luoteng.folk.activity.TopicDetailActivity_;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;

/**
 * 跳转的plugin
 * @author mengxiangcheng
 *
 */
public class TopicDetailPlugin extends CordovaPlugin {

    static String TAG = "TopicDetailPlugin";

    public boolean execute(String action, CordovaArgs args, final CallbackContext callbackContext) throws JSONException {
        if (action.equals("topicDetail")) {
            String topicId = args.getString(1);
            TopicDetailActivity_.startAc(this.cordova.getActivity(),topicId,false);
            callbackContext.success();
            return true;
        }
        return false;
    }


}