# 옵저버 패턴

## 옵저버 패턴의 정의
 -  객체의 상태 변화를 관찰하는 옵저버(관찰자)를 두어 객체에 상태 변화가 있을 때마다 직접 옵저버에게 알리도록 하는 디자인 패턴


 - 서로 느슨하게 결합하는 디자인을 사용하기 위해 만들어진 패턴(상호 의존성을 최소화하여 변경 사항이 생겨도 무난히 처리할 수 있는 유연성을 확보하기 위함)
 

  - 구독자 패턴이라고도 부른다. (실제로 신문 구독의 예시를 들어서 설명한 예제가 많음.)

 
## 옵저버 패턴의 구성 요소
 - 주제 객체 : 상태를 저장하고 있는 주제 인터페이스를 구현한 객체. 하나만 존재.


 - 옵저버 객체 : 주제 객체에 의존하고 있는 옵저버 인터페이스를 구현한 객체. 다수개가 존재.


## 옵저버 패턴의 데이터 전달 방식

  - 푸시 방식 : 주제객체에서 옵저버로 데이터를 보내는 방식

  
  - 풀 방식 : 옵저버에서 주제객체의 데이터를 가져가는 방식 


## 옵저버 패턴 참고사이트

  - 사이트1 : http://flowarc.tistory.com/entry/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4-%EC%98%B5%EC%A0%80%EB%B2%84-%ED%8C%A8%ED%84%B4Observer-Pattern
  
  - 사이트2 : http://jusungpark.tistory.com/8
  
  - 사이트3 : https://ko.wikipedia.org/wiki/%EC%98%B5%EC%84%9C%EB%B2%84_%ED%8C%A8%ED%84%B4
