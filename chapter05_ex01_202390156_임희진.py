"""
이진 트리의 순회 알고리즘(전위, 중위, 후위 순회)

루트 방문 : V, 왼쪽 서브 트리 방문 : L, 오른쪽 서브 트리 방문 : R

전위 : VLR, 중위 : LVR, 후위 : LRV
"""

import time

class TNode:
    def __init__ (self, data, left, right):	# 생성자
        self.data = data 			# 노드의 데이터
        self.left = left			# 왼쪽 자식을 위한 링크
        self.right = right			# 오른쪽 자식을 위한 링크

def preorder(n) :                                               #전위 순회
                if n is not None:                                #노드가 존재한다면
                                print(n.data, end = ' ')     #루트 노드 방문 후 왼쪽, 오른쪽 순서
                                preorder(n.left)
                                preorder(n.right)
                                
def inorder(n) :                                                #중위 순회
                if n is not None:                               #노드가 존재한다면
                                inorder(n.left)                   #왼쪽 노드 방문 후, 루트, 오른쪽 순서
                                print(n.data, end = ' ')
                                inorder(n.right)
                                
                
def postorder(n) :                                              #후위 순회
                if n is not None:                                 #노드가 존재한다면
                                postorder(n.left)                #왼쪽 노드 방문 후, 오른쪽, 왼쪽 순서
                                postorder(n.right)
                                print(n.data, end = ' ')
                                

d = TNode('D', None, None)                            #노드 작성
e = TNode('E', None, None)
b = TNode('B', d, e)
f = TNode('F', None, None)
c = TNode('C', f, None)
root = TNode('A', b, c)

"""
노드를 입력받는 방법 코드

n = int(input())
binary_tree = [TNode(_, Node, Node) for _ in range(1, n+1)]
for i in range(n):
                data, left, right = map(int, input().split())
                if left != -1:
                                binary_tree[i].left = binary_tree[left - 1]
                if right != -1:
                                binary_tree[i].right = binary_tree[right - 1]
root = binary_tree[0]
"""

print('Pre-Order : ', end='')
start = time.time()                   #함수의 시작 시간
preorder(root)
end = time.time()                     #함수의 끝 시간
print("\n실행시간 = ", end - start)   #실행시간 프린트
print()

print('In-Order : ', end='')
start = time.time()                   #함수의 시작 시간
inorder(root)
end = time.time()                     #함수의 끝 시간
print("\n실행시간 = ", end - start)   #실행시간 프린트
print()

print('Post-Order : ', end='')
start = time.time()                   #함수의 시작 시간
postorder(root)
end = time.time()                     #함수의 끝 시간
print("\n실행시간 = ", end - start)   #실행시간 프린트
print()

"""
복잡도 : 정렬 같은 것이 아닌 n개의 수를 한번 순회하는 것이기에
복잡도는 O(n)
"""
