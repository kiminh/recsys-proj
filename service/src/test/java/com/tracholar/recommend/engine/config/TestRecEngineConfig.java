package com.tracholar.recommend.engine.config;

import com.alibaba.fastjson.JSON;
import com.tracholar.recommend.feature.Hash;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

public class TestRecEngineConfig {
    @Test
    public void testLoad() throws IOException {
        String json = IOUtils.toString(getClass().getResourceAsStream("/engine.json"), "UTF-8");
        RecEngineConfig config = JSON.parseObject(json, RecEngineConfig.class);
        System.out.println(config);
    }

    @Test
    public void testHash() {
        Hash hash = new Hash();
        long v = hash.hash("fasdffdsaf");
        System.out.println(v);
    }
}
