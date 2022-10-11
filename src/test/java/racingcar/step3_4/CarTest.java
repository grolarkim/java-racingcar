package racingcar.step3_4;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.step3_4.domain.Car;
import racingcar.step3_4.domain.Name;

class CarTest {

	@DisplayName("자동차 초기 위치 세팅하여 생성")
	@Test
	void createCarTest() {
		Car car = new Car(new Name("pobi"));

		assertThat(car.getPosition()).isZero();
	}

	@DisplayName("자동차 전진 - 랜덤값이 4이상일 경우")
	@ParameterizedTest(name = "랜덤값이 {0}일 경우")
	@ValueSource(ints = {4, 5, 6, 7, 8, 9})
	void moveTest(int value) {
		Car car = new Car(new Name("pobi"));

		assertThat(car.move(() -> value)).isEqualTo(1);
	}

	@DisplayName("자동차 멈춤 - 랜덤값이 4미만일 경우")
	@ParameterizedTest(name = "랜덤값이 {0}일 경우")
	@ValueSource(ints = {0, 1, 2, 3})
	void stopTest(int value) {
        Car car = new Car(new Name("pobi"));

		assertThat(car.move(() -> value)).isZero();
	}

	@DisplayName("이름을 설정하여 자동차 생성")
	@Test
	void createWithNameTest() {
		Car car = new Car(new Name("pobi"));

		assertThat(car).isEqualTo(new Car(new Name("pobi")));
		assertThat(car.getPosition()).isZero();
	}
}