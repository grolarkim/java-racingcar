package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

  private final List<Car> values;

  public Cars(List<Car> cars) {
    this.values = cars;
  }

  public void move(MovingStrategy movingStrategy) {
    values.forEach(car -> car.moveOrStop(movingStrategy));
  }

  public List<Integer> collectPositions() {
    return values.stream()
        .map(Car::getCurrentPosition)
        .collect(Collectors.toList());
  }

  public int size() {
    return values.size();
  }

  public static Cars createCars(int count) {
    List<Car> cars = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      cars.add(new Car());
    }
    return new Cars(cars);
  }
}
