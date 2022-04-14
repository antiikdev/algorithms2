# Algoritmit 2 (Eng. algorithms)

## Aiheet per paketti (topics per packet):

- Prioriteettijono (priority queue) (algos01)
- Keko kokonaislukutaulukolla (heap and heapsort) (algos01)
- Hajautus (Hash) (algos02)
- B-puu (B-tree) (algos02)


### Kertaluokkamerkinnat (eng. asymptotic analysis)

- f(n) = O(g(n)): f samaa tai alempaa kertaluokkaa kuin g. (iso O)
    - c,n > 0 : 0 <= f(n) <= cg(n)   n >= n0
- f(n) = Ω(g(n): f on samaa tai ylempaa kertaluokkaa kuin g. (iso omega)
    - c, n > 0 : 0 <= cg(n) <= f(n)    n >= n0
- f(n) = o(g(n)): f on (aidosti) alempaa kertaluokkaa kuin g. (pieni o)
    - c, n > 0 : 0 <= f(n) < cg(n) n >= n0
- f(n) = ω(g(n)): f on (aidosti) ylempaa kertaluokkaa kuin g. (pieni omega)
    - c, n > 0 : 0 <= cg(n) < f(n)  n >= n0
- f(n) = ϴ(g(n)): f on samaa kertaluokkaa kuin g. (iso theta)
    - c, n > 0 : 0 <= c1g(n) <= f(n) <= c2g(n)  n >= n0

