def dfs(G, start):
    stack = [start]
    visit = {start}
    while stack:
        v = stack.pop()
        print(v, end = ", ")
        for w in G[v]:
            if w not in visit:
                stack.append(w)
                visit.add(w)

def bfs(G, start):
    queue = [start]
    visit = {start}
    while queue:
        v = queue.pop(0)
        print(v, end = ", ")
        for w in G[v]:
            if w not in visit:
                queue.append(w)
                visit.add(w)

D = { "a" : ["c"],
      "b" : ["d", "f"],
      "c" : ["a", "d"],
      "d" : ["b", "c", "f"],
      "e" : ["g"],
      "f" : ["b", "d", "g", "i"],
      "g" : ["e", "f", "h", "i"],
      "h" : ["g"],
      "i" : ["f", "g"]
}

DF = { "a" : ["c", "d", "g"],
      "b" : ["g", "h"],
      "c" : ["a", "e", "f"],
      "d" : ["a", "g"],
      "e" : ["c"],
      "f" : ["c"],
      "g" : ["a", "b", "d"],
      "h" : ["b", "i", "j"],
      "i" : ["h"],
      "j" : ["h"]
}

rel_fr = {"Kim" : ["Choi", "Lee"],
          "Choi" : ["Kim", "Lee"],
          "Lee" : ["Kim", "Choi", "Jo"],
          "Jo" : ["Lee"],
          "Hong" : ["Park"],
          "Park" : ["Hong"],
}

dfs(D, "f")
bfs(D, "f")
dfs(DF, "f")
bfs(DF, "f")

















#dfs(DF, "a")