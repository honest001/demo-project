package com.example.demo.project.strategy;

public class NewUserRewardStrategyA extends RewardStrategy {
    @Override
    public void reward(Long userId) {
        System.out.println("新用户A奖励--------");
    }
}
