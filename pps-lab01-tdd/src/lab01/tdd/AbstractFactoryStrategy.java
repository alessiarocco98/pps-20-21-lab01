package lab01.tdd;

public class AbstractFactoryStrategy {

    public SelectStrategy createEvenStrategy() {
        SelectStrategy evenStrategy = (element) -> element%2 == 0;
        return evenStrategy;
    }

    public SelectStrategy createMultipleOfStrategy(int multiple) {
        SelectStrategy multipleOfStrategy = (element) -> element%multiple == 0;
        return multipleOfStrategy;
    }

    public SelectStrategy creatEequalsStrategy(int equalElement) {
        SelectStrategy equalsStrategy = (element) -> element == equalElement;
        return equalsStrategy;
    }
}
