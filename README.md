# GoF 의 디자인 패턴

디자인 패턴(Design Pattern) 은 프로그래밍을 할때 문제를 해결하고자 코드의 구조들을 일정한 형태로 만들어 제어하기 편리하게 만든 일정한 패턴 입니다.   

GoF 는 (Gang of Four) 의 약자로 Erich Gamma, Richard Helm, Ralph Johnson, John Vissides 가 정의해둔 
**생성 패턴 5개, 구조 패턴 7개, 행위 패턴 11개** 로 구성된 **23개의 디자인 패턴**을 말합니다.


### 예제 저장
실습한 코드는 [/src/main/java/me/kyungjun/pattern/](./src/main/java/me/kyungjun/pattern/) 경로에 저장이 되며,   
최대한 [테스트 케이스](./src/test/java/me/kyungjun/pattern/) 를 작성하면서 공부하고있습니다.   
강의 이외에도 따로 공부한 개념과 특징을 마크다운으로 정리한 [docs](./docs) 도 포함되어 있습니다.

### 생성 패턴 
- [싱글톤 패턴(Singleton Pattern)](./docs/singleton-pattern.md)
  - [예제 코드](./src/main/java/me/kyungjun/pattern/singleton)
  - [테스트 코드](./src/test/java/me/kyungjun/pattern/singleton)
- [팩토리 메서드 패턴(FactoryMethod Pattern)](./docs/factorymethod-pattern.md)
  - [예제 코드](./src/main/java/me/kyungjun/pattern/factorymethod)
  - [테스트 코드](./src/test/java/me/kyungjun/pattern/factorymethod)
- [추상 팩토리 패턴(AbstractFactory_Pattern)](./docs/abstractfactory-pattern.md)
  - [예제 코드](./src/main/java/me/kyungjun/pattern/abstractfactory)
  - [테스트 코드](./src/test/java/me/kyungjun/pattern/abstractfactory)
- [빌더 패턴(Builder_Pattern)](./docs/builder-pattern.md)
  - [에제 코드](./src/main/java/me/kyungjun/pattern/builder)
  - [테스트 코드](./src/test/java/me/kyungjun/pattern/builder)

### Reference By.
- 이 레포지토리는 백기선님의 [코딩으로 학습하는 GoF의 디자인 패턴](https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4) 를 기반으로 만들어졌습니다.