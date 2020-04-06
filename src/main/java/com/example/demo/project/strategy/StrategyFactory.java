package com.example.demo.project.strategy;

/**
 * 抽象工厂
 * @param <T>
 */
public abstract class StrategyFactory<T> {
    abstract RewardStrategy createStrategy(Class<T> c);
}
