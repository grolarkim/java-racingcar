## 1. 기능 요구사항   
***
- 초간단 자동차 경주 게임을 구현한다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

### Class & Method
***
- Car
   - straight()
   - stop()
- Game
   - randomSpeed()  
   - participate()
   - race()
 

## 2. 정리   
***
### 2-1. String + String 과 StringBuilder append() 차이   
#### 2-1-1. String + String   
String은 참조타입으로 연산자 '+'를 사용할 때 마다 새로운 String 객체가 생성된다.  
연산자 '+' 를 사용하는 만큼 메모리가 낭비되고 문자열 객체는 GC의 수거의 대상이 되어 성능 저하를 일으킬 수 있다. 

#### 2-1-2. StringBuilder append()
StringBuilder 클래스는 문자열 조작을 돕는 클래스이다.   
문자열을 조작할 때 새로운 String 객체를 생성하지 않고 문자열을 조작할 수 있어 메모리 누수를 막을 수 있다.   
