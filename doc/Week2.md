# Week2
 
# String, StringBuilder, StringBuffer Code Review

https://github.com/Flamme1004K/CrackingTheCodingInterview/blob/master/src/study/crackingthecodinginterview/Week1.java

## StringBuilder 코드 리뷰
1. StringBuilder의 내부를 보지 않고 코딩
2. 코딩을 하였지만, StringBuilder의 사용 이유와 장점에 대한 것은 잊고 리뷰를 함. 취지에 맞지 않다고 본다.

--> 앞으로의 자료구조에 대한 코딩은 코딩을 해보고 해당 자료구조에 대한 흐름을 봐야하지 않을까?

더욱 Dive Deep을 해야한다고 생각한다.

요번 코드 리뷰는 무언가 구현은 했지만, 너무 내 생각대로 코딩을 했다는 것, 취지에 안맞게 구현 다는 것에 대해 반성하는 시간이 되었다.

## 요번 Study에서 알게 된 것.

StringBuilder.java, AbstactStringBuilder.java 참고

https://www.youtube.com/watch?v=gc7bo5_bxdA

1. StringBuilder characters 16 Byte크기를 가지고 시작한다. --> 해당 Capacity는 설정 가능하다.
2. 초기 Capacity가 16 Byte인 이유는 초기 용량을 적용하고 추후 크기에 대한 적용을 위한 느슨함이라는 숫자라고 한다.
3. StringBuilder 는 String 값이 들어오면 현재 Capacity를 통하여 비교하며 많을 시 Capacity를 2배 더 증가시킨다.
4. System.copyOfRange Method를 이용하여 해당 Array를 다시 덮어쓰는 형식으로 다시 Array를 만든다.
5. Reverse method는 surrogate pair를 이용해서 UTF 설정을 한다.
6. MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8 는 Memory leak을 방지하기 위한 Trigger이다.

https://stackoverflow.com/questions/27562016/why-do-we-need-capacity-in-stringbuilder

## Next Study

배열과 문자열, 연결리스트 읽기
 
https://www.youtube.com/watch?v=Vi0hauJemxA

