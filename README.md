
***Design Pattern***

🐹 Singleton


![singleton.png](singleton.png)
- **생성자를 private 접근 제한**해서 외부에서 new 연산자로 생성자를 호출하라 수 없도록 막아서 외부에서 객체를 생성하지 못하게 함
- 대신 싱글톤 패턴이 제공하는 **정적 메소드를 통해 간접적으로 객체를 얻을 수 있음**


---
🐹 Adapter
- 사이에 끼워 재사용한다
- 두 개의 형태가 다른 객체 
-> 중간 매개체(어댑터)로 우회해서 연결 

- **Wrapper 패턴**이라고 불리기도 함
  ![img.png](img.png)

- Adapter 패턴의 종류
  - 클래스에 의한 Adapter 패턴(상속을 사용한 패턴)  ***-->위임보다 간단 !***
    - **adapter.adapter1**
    ![img_1.png](img_1.png)
  - 인스턴스에 의한 Adapter 패턴(위임을 사용한 패턴) ***-->상속보다 유연 !***
    - **adapter.adapter2**
    ![img_2.png](img_2.png)

★★ 코드 재사용은 '위임'을 권장 


- 어떤 경우에 사용?
  - 프로그래밍할 때 늘 백지상태에서 시작하는 것은 아님
  - 이미 존재하는 클래스를 이용하는 경우
  - 기존 클래스에 한 겹 덧씌워 필요한 클래스를 만듦
 

-----
🐹 template method 패턴 

- 템플릿 : 문자 모양대로 난 얇은 플라스틱 판
  - 절차는 **부모 클래스**가 결정, 각 절차에서 할 일은 **자식 클래스**가 판단
    
![image=template.png](image=template.png)


    - 부모 클래스는 보통 추상 클래스(추상 템플릿)
    - 자식이 상속 받아 해당 추상 메소드를 구현

-> 기존 클래스를 전혀 수정하지 않고 목적한 인터페이스에 맞추는 것
  - 기존 클래스의 소스 프로그램이 반드시 필요한 것이 아님

  - 왜 사용하는가?
      - 로직을 공통화할 수 있다
          - 상위 클래스의 템플릿 메소드에 알고리즘이 기술되어 있음
          - 하위 클래스는 알고리즘을 일일이 기술할 필요 없음
       
            -> **framework의 기본 패턴**

      - 상위 클래스와 하위 클래스의 연계 플레이
      - 하위 클래스를 상위 클래스와 동일시 한다
   

---
🐹 Iterator 패턴

- **Iterator - 처리를 반복하다**
    - **인덱스 사용하지 않고 처리를 반복**
    - 변수 i의 기능을 추상화하여 일반화한 것
![iterator2.png](iterator2.png)

iterator의 클래스 다이어그램
![iterator.png](iterator.png)


---
🐹 Command 패턴

- **Command pattern - 명령을 클래스로 표현한다**
    - Command 클래스
        - **‘이 일을 처리 하시오’**라는 **‘명령’**을 표현하는 클래스
        - 처리하고 싶은 일을 `객체`로서 표현
    - 명령의 `집합`을 저장해 둠
        - 같은 명령 **재실행** 가능
        - 여러 명령을 모아서 새로운 명령으로 **재사용** 가능(재사용성 ▲)
    - 예제 프로그램
        - CLI 메뉴 기반의 간단한 어플리케이션
            - 사용자가 선택한 메뉴를 실행
              ![command1.png](command1.png)
              ** equalsIgnoreCase() : 대소문자 구분 X

    - Command 클래스 다이어그램
      ![command2.png](command2.png)

---
🐹 Factory Method 패턴
- **Factory Method - 하위 클래스에서 인스턴스를 만든다**
    - templateMethod를 응용 → 인스턴스 생성 장면에 적용
        - templateMethod: 부모(로직, 알고리즘)←자식(하는 일, 알고리즘의 세부 단계**→를 인스턴스 생성 장면에:factoryMethod**)
    - **예제 프로그램(factorymethod파일)**
        - 신분증 카드를 만드는 공장
        - 프레임워크 역할
            - Product 클래스와 Factory 클래스
        - 구체적인 내용 역할
            - IDCard 클래스와 IDCardFactory 클래스
         
              
         ![factory1.png](factory1.png)
      - 예제 프로그램 클래스 다이어그램
              ![factory2.png](factory2.png)
        **이탤릭체 : 추상메서드

      - Factory Method 패턴의 사용
          - 같은 프레임워크를 사용하여 전혀 다른 제품과 공장을 만드는 경우
            -> framework 패키지의 내용은 수정하지 않아도 전혀 다른 제품과 공장을 만들 수 있음
        - 사용측은 framework의 내용으로 처리하므로 사용 측의 코드 변경 없음
            -> OCP

--- 
🐹 prototype 패턴
**prototype - 복사해서 인스턴스를 만든다**

> **인스턴스 생성 방법**

**1. Factory Method 패턴
2. Singleton 패턴
3. Prototype 패턴**
> 

## 🧡prototype pattern

- 원본을 복사하고, 이것을 클론해서 사용
- 클래스 이름을 지정하지 않고 인스턴스 생성 가능
    
    → 클래스로부터 인스턴스를 복사해서 새 인스턴스 생성
    

- **prototype 패턴의 클래스 다이어그램**
![prototype.png](prototype.png)
  - **prototype 패턴 사용 이유**
    - 종류가 너무 많아서 클래스로 정리할 수 없을 경우
    - 클래스로부터 인스턴스 생성이 어려운 경우
    - 프레임워크와 생성하는 인스턴스를 분리하고 싶은 경우

- **클래스 이름을 통해 인스턴스를 얻는 방법**
    - 소스 코드 안에 클래스 이름을 이용해 직접 생성시 → 클래스와 분리해서 재사용 불가
    - 부품으로서 재사용 → 코드 수정X
 
  ---

  🐹 Builder 패턴

  - **builder - 복잡한 인스턴스를 조립한다**
    - 어떤 객체는 new로 인스턴스를 만들었다고 해서 바로 사용할 수 없음
        - ex. new 생성자 {  … //이부분이 너무 많을 때 }
    - 일정 절차를 거친 후에 사용할 수 있는 상태가 됨
    - 들어가는 내용은 똑같지만, 나오는 내용이 다름
        - **예제 프로그램**
        - 이때, 실제 만드는 역할 : Builder
        - Builder의 구현체 : TextBuilder, HTMLBuilder
    
    - builder pattern의 클래스 다이어그램
   
      ![builder1.png](builder1.png)

    - builder pattern의 시퀀스 다이어그램

       ![builder2.png](builder2.png)

      **※주의※**

- **어느 클래스가 어느 메서드를 사용할 수 있는지에 주의하여 프로그래밍 해야 함**
- **Main 클래스**
    - Builder 클래스의 메서드를 모름
    - Director 클래스의 construct() 메서드만 호출
- **Director 클래스**
    - Builder 클래스만 알고 있음
    - 실제로 이용하는 클래스가 무엇인지 알지 못함
        
        → Builder 클래스의 하위 클래스이면 된다
        
        → 교체 가능(OCP)
