package com.tracholar.articlerecsys.recall;

import com.alibaba.fastjson.JSONObject;
import com.tracholar.articlerecsys.data.Article;
import com.tracholar.articlerecsys.data.ReqContext;
import com.tracholar.articlerecsys.data.User;
import com.tracholar.recommend.abtest.ABTestKey;
import com.tracholar.recommend.abtest.ABTestable;
import com.tracholar.recommend.engine.Recall;
import com.tracholar.recommend.engine.config.Configable;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class BaseRecall implements
        Recall<User, ReqContext, Article>, ABTestable, Configable<JSONObject> {
    @Getter
    @Setter
    private ABTestKey abTestKey;

    protected Logger loger = LoggerFactory.getLogger(getClass());

    @Override
    public void init(JSONObject conf){

    }
}
