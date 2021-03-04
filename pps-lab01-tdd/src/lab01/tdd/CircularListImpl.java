package lab01.tdd;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {
    private final List<Integer> List;
    private Integer currentIndexElement;

    public CircularListImpl() {
        List = new LinkedList<>();
        currentIndexElement = null;
    }

    @Override
    public void add(int element) {
        List.add(element);
    }

    @Override
    public int size() {
        return List.size();
    }

    @Override
    public boolean isEmpty() {
        return List.isEmpty();
    }

    @Override
    public Optional<Integer> next() {
        if(this.isEmpty()) {
            return Optional.empty();
        }
        if(currentIndexElement == null || currentIndexElement == List.size() - 1 ) {
            this.reset();
            return Optional.of(List.get(currentIndexElement));
        } else {
            return Optional.of(List.get(++currentIndexElement));
        }
    }

    @Override
    public Optional<Integer> previous() {
        if(this.isEmpty()) {
            return Optional.empty();
        }
        if(currentIndexElement == null || currentIndexElement == 0 ) {
            currentIndexElement = List.size() - 1;
            return Optional.of(List.get(currentIndexElement));
        } else {
            return Optional.of(List.get(--currentIndexElement));
        }
    }

    @Override
    public void reset() {
        currentIndexElement = 0;
    }

    @Override
    public Optional<Integer> next(SelectStrategy strategy) {
        int element;
        reset();

        for (currentIndexElement=0; currentIndexElement < List.size(); currentIndexElement++) {
            element = this.next().get();
            if(strategy.apply(element)){
                return Optional.of(element);
            }
        }

        return Optional.empty();
    }
}
