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

- 이진트리(Binary tree)
	-  완전 이진 트리(Complete binary tree)
	-  전 이진 트리(Full binary tree)
	- 포화 이진 트리(Perfect binary tree)
	- 이진 탐색 트리(Binary search tree)
	- 레드-블랙 트리(Red black tree)
	- AVL 트리(Adelson velsky and Landis Tree)
- 이진 힙(Binary heap)
- 트라이(접두사 트리/ Prefix tree)


# 이진트리(Binary Tree) 

- 이진 트리는 최대 두개의 자식을 갖는 트리를 말한다.

## 트리(Tree)와 이진 트리(Binary Tree)
- 이진 트리는 최대 두개의 자식을 갖는 트리를 말하며, 트리는 최대 자식 노드를 이진 트리보다 더 가질 수 있다.
- 균형 vs 비균형
	- 많은 트리가 균형 잡혀 있긴 하지만 전부 그런 것은 아니다.  
	- 균형을 잡는다는 것이 왼쪽과 오른쪽 부분 트리의 크기가 완전히 같게 하는 것을 의미하지 않는다. (완전 이진 트리 정도면 균협 잡힌 것이다.)
	- 균형 잡힌 트리는 O(logN) 시간에 insert와 find를 할 수 있을 정도로 균형이 잘 잡혀 있지만, 그렇다고 꼭 완벽하게 균형 잡혀 있을 필요는 없다.
	- 균형 트리의 종류에서는 레드-블랙 트리, AVL 트리가 있다.

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

## 이진 탐색 트리(Binary search tree)
![이진트리탐색 이미지 검색결과](https://t1.daumcdn.net/cfile/tistory/2321CB4951A467AC0B)

- 이진 탐색 트리는 '모든 왼쪽 자식들 <= n < 모든 오른쪽 자식들'속성은 모둔 노드 n에 대해서 반드시 참이어야 한다. 라는 속성이 있는 이진트리를 일컫는다.
-  이진 탐색 트리는 모든 노드에 대해서 그 왼쪽 자식들의 값이 현재 노드 값보다 작거나 같도록 하고, 그리고 오른쪽 자식들의 값은 현재 노드의 값보다 반드시 커야 한다.

## 레드 블랙 트리(Red Black Tree) - 816Page
레드-블랙 트리(스스로 균형 잡은 이진 탐색 트리의 종류)는 엄격해서 균형을 잡지는 않지만, 상태가 Insert(삽입), Delete(삭제) , Retrieval(검색) 연산을 충분히 O(log N)에 수행하도록 보장한다.


## AVL 트리(Adelson velsky and Landis Tree) - 818Page
트리의 균형을 맞추는 흔한 방법 중 하나.

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
![](https://gmlwjd9405.github.io/images/data-structure-heap/types-of-heap.png)
- 완전 이진 트리(Complete binary tree)의 일종으로 우선 순위 큐(Priority Queue)를 위하여 만들어진 자료구조 이다.
- 최대 값, 최소 값을 빠르게 찾아내기 위함. 
- 이진트리와 반대로 중복 값을 허용한다.
- 반 정렬 상태이다.
- O(Log n)시간이 걸림

### 종류
- 최소힙(Min heap)
- 최대힙(Max heap)

### 최소힙(Min heap)이란?

***책에서는 일단 최대힙의 설명은 제외하고 최소힙에 대한 설명을 하였다.***

트리의 마지막 단계에서 오른쪽 부분을 뺀 나머지 부분이 가득 채워져 있다는 점에서 완전 이진 트리이며, 각 노드의 원소가 자식들의 원소보다 작다는 특성을 가지고 있다.

**삽입**
최소힙의 삽입은 항상 트리의 오른쪽 밑바닥에서부터 삽입을 시작한다.
--> 오른쪽 밑바닥에서 삽입을 하고, 비교해나가며 자리를 찾는다.

**최소 원소 뽑아내기**
최소 원소는 언제나 가장 위에 놓이기 때문에 최소 원소를 찾기란 쉬운 일이라고 한다.

하지만 뽑아내고 힙에서 제거하는 것이 어렵다고 한다.

1. 최소 원소를 제거한 후에 힙에 있는 가장 마지막 원소와 교환한다.
2. 최소힙의 성질을 만족하도록 해당 노드를 자식 노드와 교환해 나감으로써 밑으로 내보낸다.



## 트라이(접두사 트리)
![접두사 트리 이미지 검색결과](https://lh3.googleusercontent.com/proxy/LxNsxRq59I_rZAPMjMEg2sQaRY5BGsYIXfG3WYFxPirCuaj_OUz_NEELv5vt8qwn0EnQ5hwVeuWJlL_wgAJQr9qrR54vVmdh1auvYuDOonvVEXByxM9kfU5BkPFoQFZGC5RPzGd5P0OwYwhAe016h-f_WwaM-KpvXQnXzSk)

- 트라이(Tree)는 n-차 트리 (N-ary tree)의 변종으로 각 노드(Node)에 문자를 저장하는 자료구조이다.
- 트리를 아래쪽으로 순회하면 단어 하나가 나온다.
- 널 노드(null node)라고도 불리우는 *.노드가 종종 단어의 끝에 나온다.
	- 해당 단어가 끝났다는 표시.
	- TreeNode를 상속한 Terminating TreNode 표현
	-  *.노드의 부모 노드 안에 불린 플래그를 새로 정의함으로써 단어의 끝을 표현 할 수 있다.
- 트리에서 각 노드는 1개에서 ALPHABET_SIZE+1개까지 자식을 갖고 있을 수 있다.
- 접두사를 빠르게 찾아보기 위한 아주 흔한 방식으로, 모든 언어를 트라이에 정해놓는 방식이 있다.

#### 사용 용도
- 유효한 단어 집합을 이용하는 많은 문제들을 트라이를 통하여 최적화
- 트리에서 연관된 접두사를 반복적으로 검색해야 하는 상황에서는 트리의 현재 노드를 참조값으로 넘길 수 있다. --> 매번 검색할 때마다 루트에서 시작할 필요가 없고, 단순히 Y가 MAN의 자식인지만 확인해보면 된다.

# 참고 사이트

[ 방향성 비순환 그래프](http://wiki.hash.kr/index.php/%EB%B0%A9%ED%96%A5%EC%84%B1_%EB%B9%84%EC%88%9C%ED%99%98_%EA%B7%B8%EB%9E%98%ED%94%84)

[트리와 그래프](https://bamdule.tistory.com/68)

[이진 트리가 완전 이진 트리인지 확인하는 알고리즘](https://medium.com/@dltkddud4403/%EC%9D%B4%EC%A7%84-%ED%8A%B8%EB%A6%AC%EA%B0%80-%EC%99%84%EC%A0%84-%EC%9D%B4%EC%A7%84-%ED%8A%B8%EB%A6%AC%EC%9D%B8%EC%A7%80-%ED%99%95%EC%9D%B8%ED%95%98%EB%8A%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-615ddc78f39c)

[이진 탐색트리 탐색/ 삭제/ 삽입 알고리즘 시간 복잡도 분석](https://mattlee.tistory.com/30)

[이진 탐색 트리](https://blog.hexabrain.net/248)

[힙이란?](https://gmlwjd9405.github.io/2018/05/10/data-structure-heap.html)