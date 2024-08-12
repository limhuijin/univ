"""
위상 정렬(축소 정복 기법)

방향 그래프 G = (V, E)에 대해 G에 존재하는 각 정점의 선행 순서를 지키며 모든 정점을 순서대로 나열하자. 

조건 : 축소 정복 기법 사용
"""
import time

def topological_sort(graph):    #그래프를 매개변수로 받아옴
    inDeg = {}                  #진입차수 저장
    for v in graph:             #모든 그래프를 0으로 초기화
        inDeg[v] = 0
    for v in graph:             #인접한 정점은 진입차수 1 증가
        for u in graph[v]:
            inDeg[u] += 1
    
    vlist = []                  #진입차수 0인 리스트
    for v in graph:             #집입차수가 0이라면 정점을 vlist에 추가
        if inDeg[v] == 0:
            vlist.append(v)
    
    while vlist:                #리스트가 공백이 아니라면 반복
        v = vlist.pop()         #진입차수가 0인 공백 가져옴
        print(v, end = ' ')     #출력

        for u in graph[v]:      #연결된 정접의 진입차수 감소
            inDeg[u] -= 1
            if inDeg[u] == 0:   #진입차수 0이면 vlist에 추가
                vlist.append(u)


mygraph = { "A" : {"C", "D"},
            "B" : {"D", "E"},
            "C" : {"D", "F"},
            "D" : {"F"},
            "E" : {"F"},
            "F" : set()
            }

print('topological_sort: ')

start = time.time()                   #함수의 시작 시간
topological_sort(mygraph)
end = time.time()                     #함수의 끝 시간
print("\n실행시간 = ", end - start)   #실행시간 프린트

"""
함수의 복잡도 : 정점의 수 n, 간선의 수 e인 경우
초기화 1단계 : O(n) + O(e) = O(n + e)
초기화 2단계 : O(n)
전체 복잡도 : O(n + e)
"""
