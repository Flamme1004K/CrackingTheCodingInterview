# 트리(Tree)

## 트리(Tree)란?

- 노드(Node)로 이루어진 자료구조.
- 그래프(Graph)의 한 부분이다. 
	- 트리는 비 순환 그래프이다. -> 서로 순환하지 않으며, 개별 요소들이 특정한 방향으로 향하고 있는 그래프.

## 트리(Tree)의 특징

- 하나의 루트 노드(Root Node)를 갖는다.
- 루트 노드(Root Node)는 0개 이상의 자식 노드(Child Node)를 갖는다.
- 자식 노드(Child Node) 또한 0개 이상의 자식 노드(Child Node)를 갖고 있고, 이는 반복적으로 정의 된다.
- 트리(Tree)에는 사이클(Cycle)이 존재할 수 없다.  (부모 자식 관계)
- 노드(Node)들은 특정 순서로 나열될 수 있고, 그럴 수 없을 수도 있다. 
- 각 노드(Node)는 어떤 자료형으로도 표현 가능하다.
- 항상 N-1개의 간선을 가진다.

## 트리(Tree)의 구조
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbbyVSy%2FbtqCvy6XZpM%2FOacTnki6JIQJuFYWaDpXY1%2Fimg.png" width="700" height="370">  
  
- 루트 노드(Root Node)
- 단말 노드(leaf Node) : 자식이 없는 노드.
- 내부(internal Node) : 단말 노드가 아닌 노드
- 간선(edge) : 노드를 연결하는 선
- 형제(sibiling) : 같은 부모를 가지는 노드
- 노드의 크기(size) : 자신을 포함한 모든 자손 노드의 개수
- 노드의 깊이(depth) : 루트에서 어떤 노드에 도달하기 위해 거쳐야하는 간선 수
- 노드의 차수(degree) : 각 노드에서 뻗어나온 가지의 수( D : 2)
- 트리의 차수(degree of tree) : 트리에서 가장 큰 차수(2)
- 트리의 높이(height): 가장 깊숙히 있는 노드의 깊이(3)

## 트리(Tree)의 종류

- 완전 이진 트리(Complete binary tree)
- 전 이진 트리(Full binary tree)
- 포화 이진 트리(Perfect binary tree)
- 이진 힙(Binary heap)
- 트라이(접두사 트리/ Prefix tree)
- 레드-블랙 트리
- AVL 트리


## 완전 이진 트리(Complete binary tree)

![Image for post](https://miro.medium.com/max/1004/1*Etc4C2_vkbIgBUApJKMJag.png)

- 모든 높이에서 노드가 꽉 차 있는 이진 트리.
- 마지막 단계(level)는 꽉 차 있지 않아도 되지만 노드가 왼쪽에서 오른쪽으로 채워져야 한다.

## 전 이진 트리(Full binary tree)

![전 이진 트리 이미지 검색결과](https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F992097335A0E6CC721)

- 모든 노드의 자식이 없거나 정확히 두개 있는 경우를 말한다. 
- 자식이 하나만 있는 노드가 존재해서는 안된다.

## 포화 이진 트리(Perfect binary tree)

![포화 이진 트리 이미지 검색결과](https://sites.google.com/site/2019algorithm3/_/rsrc/1574958571729/gwaje-gong-yu/gwaje3binarytree/%ED%8F%AC%ED%99%94%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%AC.PNG?height=267&width=400)

- 전 이진 트리(Full binary Tree) 이면서 완전 이진 트리(Complete binary Tree)인 경우를 말한다. 
- 모든 말단 노드는 같은 높이에 있어야하며,  마지막 단계에서 노드의 계수가 최대가 되어야 한다.
- 노드의 개수가 정확히 2^(k-1)개여야 한다. 

## 이진 트리 순회

### 종류
- 중위 순회(In-order traversal)
- 후위 순회(Post-order traversal)
- 전위 순회(Pre-order traversal)

### 중위 순회(In-order traversal)

- 왼쪽 가지 -> 현재 노드 -> 오른쪽 가지 순으로 방문

### 전위 순회(Pre-order traversal)

- 자식 노드보다 현재 노드를 먼저 방문하는 방법
- 가장 먼저 방문하게 될 노드는 언제나 루트이다.

### 후위 순회(Post-order traversal)

- 모든 자식 노드들은 먼저 방문한 뒤에 마지막에 현재 노드를 방문하는 방법을 말한다.
- 가장 마지막에 방문하게 될 노드는 언제나 루트이다.


## 이진 힙(Binary heap)

### 종류
- 최소힙(min-heap)
- 최대힙(max-heap)



## 유의점

- 트리와 이진 트리는 다르다. 
	- 이진 트리는 최대 두개의 자식을 갖는 트리를 말하며, 트리는 최대 자식 노드를 이진 트리보다 더 가질 수 있다.
- 이진 트리와 이진 탐색 트리는 다르다. 
	- 이진 탐색 트리는 '모든 왼쪽 자식들 <= n < 모든 오른쪽 자식들'속성은 모둔 노드 n에 대해서 반드시 참이어야 한다. 라는 속성이 있는 이진트리를 일컫는다.
	-  이진 탐색 트리는 모든 노드에 대해서 그 왼쪽 자식들의 값이 현재 노드 값보다 작거나 같도록 하고, 그리고 오른쪽 자식들의 값은 현재 노드의 값보다 반드시 커야 한다.
- 균형 vs 비균형
	- 많은 트리가 균형 잡혀 있긴 하지만 전부 그런 것은 아니다.  
	- 균형을 잡는다는 것이 왼쪽과 오른쪽 부분 트리의 크기가 완전히 같게 하는 것을 의미하지 않는다. (완전 이진 트리 정도면 균협 잡힌 것이다.)
	- 균형 잡힌 트리는 O(logN) 시간에 insert와 find를 할 수 있을 정도로 균형이 잘 잡혀 있지만, 그렇다고 꼭 완벽하게 균형 잡혀 있을 필요는 없다.
	- 균형 트리의 종류에서는 레드-블랙 트리, AVL 트리가 있다.


# 참고 사이트

http://wiki.hash.kr/index.php/%EB%B0%A9%ED%96%A5%EC%84%B1_%EB%B9%84%EC%88%9C%ED%99%98_%EA%B7%B8%EB%9E%98%ED%94%84

https://bamdule.tistory.com/68

https://medium.com/@dltkddud4403/%EC%9D%B4%EC%A7%84-%ED%8A%B8%EB%A6%AC%EA%B0%80-%EC%99%84%EC%A0%84-%EC%9D%B4%EC%A7%84-%ED%8A%B8%EB%A6%AC%EC%9D%B8%EC%A7%80-%ED%99%95%EC%9D%B8%ED%95%98%EB%8A%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-615ddc78f39c