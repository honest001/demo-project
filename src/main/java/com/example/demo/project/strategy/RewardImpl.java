package com.example.demo.project.strategy;

public class RewardImpl {
    private RewardContext rewardContext;
    FactorRewardStrategyFactory strategyFactory=new FactorRewardStrategyFactory();
    NewUserRewardStrategyA newUserRewardStrategyA= (NewUserRewardStrategyA) strategyFactory.createStrategy(NewUserRewardStrategyA.class);
    RewardContext rewardContext1=new RewardContext(newUserRewardStrategyA);
    //rewardContext1.d
}
