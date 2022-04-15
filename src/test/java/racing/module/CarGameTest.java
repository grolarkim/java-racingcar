package racing.module;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarGameTest {
    private final MoveStrategy alwaysTrueStrategy = () -> true;
    private final MoveStrategy alwaysFalseStrategy = () -> false;

    @Test
    @DisplayName("대수가 맞게 생성되었는지 확인")
    void carGame() {
        CarGame carGame = new CarGame(3);
        assertThat(carGame.getCarList().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("생성된 자동차들이 모두 움직였는지 확인")
    void AlwayMovingplay() {
        CarGame carGame = new CarGame(3);
        carGame.play(alwaysTrueStrategy);
        for (Car car : carGame.getCarList()) {
            assertThat(car.getPosition()).isEqualTo(1);

        }
    }

    @Test
    @DisplayName("생성된 자동차들이 모두 안움직였는지 확인")
    void AlwayStayplay() {
        CarGame carGame = new CarGame(3);
        carGame.play(alwaysFalseStrategy);
        for (Car car : carGame.getCarList()) {
            assertThat(car.getPosition()).isEqualTo(0);

        }
    }
}