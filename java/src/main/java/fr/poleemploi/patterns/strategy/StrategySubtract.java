package fr.poleemploi.patterns.strategy;

public class StrategySubtract implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
