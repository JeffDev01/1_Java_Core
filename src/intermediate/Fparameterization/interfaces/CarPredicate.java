package intermediate.Fparameterization.interfaces;

import intermediate.Fparameterization.domain.Car;


@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
