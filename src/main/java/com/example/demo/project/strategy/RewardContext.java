package com.example.demo.project.strategy;

public class RewardContext {
    private RewardStrategy rewardStrategy;

    public RewardContext(RewardStrategy rewardStrategy){
        this.rewardStrategy=rewardStrategy;
    }

    public void doStrategy(Long userId){
        //执行奖励
        //rewardStrategy.reward(userId);
        //插入
        //rewardStrategy.insertRewardAndSettlement(userId,10L);
    }
}
