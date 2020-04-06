package com.example.demo.project.strategy;

public class OldUserRewardStrategyB extends RewardStrategy {
    @Override
    public void reward(Long userId) {
        System.out.println("老用户B奖励--------");
    }
}
