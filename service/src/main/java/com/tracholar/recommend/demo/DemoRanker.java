package com.tracholar.recommend.demo;

import com.tracholar.recommend.data.IContext;
import com.tracholar.recommend.data.IUser;
import com.tracholar.recommend.data.RankResult;
import com.tracholar.recommend.engine.Ranker;
import com.tracholar.recommend.data.RecallResult;
import com.tracholar.recommend.model.SimpleScore;

import java.util.ArrayList;
import java.util.List;

public class DemoRanker implements Ranker<RecallResult, RankResult> {
    @Override
    public List<RankResult> rank(IUser user, List<RecallResult> results, IContext ctx){
        List<RankResult> rs = new ArrayList<>();
        for(int i=0; i<results.size(); i++){
            rs.add(new DemoRankResult((String) results.get(i).getId(), new SimpleScore(0.1f), i));
        }

        return rs;
    }
}
