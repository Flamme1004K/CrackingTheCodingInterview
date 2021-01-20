# Week1

# String, StringBuilder, StringBuffer

## String 이란?

**개념 :** 
https://ko.wikipedia.org/wiki/%EB%AC%B8%EC%9E%90%EC%97%B4

- String은 새로운 값을 할당할 때마다 새로 생성
- **불변(immutable)**의 속성을 가지고 있다.
- 이유 : 
    - String의 값들은 외부에서 접근할 수 없도록 private로 보호
    - final형이기 때문에 초기값으로 주어진 String의 값은 불변(immutable)으로 바뀔 수 없다.
    - String pool 공간에 만들어지기 때문이다. https://www.baeldung.com/java-string-pool
- 변하지 않는 문자열을 자주 읽어들일 경우 String 사용
- 문자열 추가, 삭제 등의 연산이 빈번하게 발생하면 힙 메모리(Heap)에 많은 임시 가비지(Garbage)가 생성되어 치명적


문자열 추가 ,삭제 등의 연산이 빈번하게 발생하는 문제를 보안하기 위해서 StringBuilder와 StringBuffer가 나옴.

StringBuilder와 StringBuffer는 **가변성(mutable)**을 가지고 있다.

가변성을 가지고 있기 때문에 동일 객체내에서 문자열을 변경 가능.

## StringBuilder 란?

개념 : https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html

- 동기화(Synchronized)를 지원하지 않는다. (Non Thread Safe) -> 그대신 StrinbBuffer보다 속도가 빠르다
- 단일쓰레드에서의 성능은 StringBuffer 보다 뛰어나다.
- 기존의 데이터에 더하는 방식이라 속도가 빠르다.

## StringBuffer 란?

개념 : 
https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/StringBuffer.html

- 멀티쓰레드 환경(Thread Safe)에서 안전하다 (Thread Safe) --> Synchronized를 이용한 동기화 가능
- String 자료형 보다 메모리 사용량이 많고 속도가 느리다.
- Buffer라는 독립적인 공간을 가진다. 기본적으로 16개 단어 저장가능


## 숙제 : 

자료구조 : 배열과 문자열, 연결리스트 읽기
StringBuilder 클래스 기능 구현하기
