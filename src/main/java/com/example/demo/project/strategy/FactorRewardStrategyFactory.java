package com.example.demo.project.strategy;

import lombok.Getter;
import lombok.Setter;

/**
 * 具体策略
 */
@Getter
@Setter
public class FactorRewardStrategyFactory extends StrategyFactory{
    @Override
    public RewardStrategy createStrategy(Class c) {
        RewardStrategy rewardStrategy=null;
        try {
            rewardStrategy=(RewardStrategy) Class.forName(c.getName()).newInstance();
        }catch (Exception e){

        }
        return rewardStrategy;
    }

    public void AA(){
        System.out.println("adddddddd");
    }
}
