package com.tracholar.recommend.engine.config;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.io.OutputStream;

public class ConfigUtils {
    public static RecEngineConfig loadFromJson(String json) throws IOException {
        return JSON.parseObject(json, RecEngineConfig.class);
    }
    public void saveAsJson(OutputStream os, RecEngineConfig config) throws IOException {
        os.write(config.toString().getBytes());
    }
}
