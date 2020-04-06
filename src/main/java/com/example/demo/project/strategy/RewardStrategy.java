package com.example.demo.project.strategy;

/**
 * 抽象策略
 */
public abstract class RewardStrategy {
    public abstract void reward(Long userId);

    public void insertRewardAndSettlement(Long userId,Long reward){
        System.out.println("插入奖励------");
    }
}
