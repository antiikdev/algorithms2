# Algoritmit 2 (Eng. algorithms)

## Aiheet per paketti (topics per packet):

- Prioriteettijono (priority queue) (algos01)
- Keko kokonaislukutaulukolla (heap and heapsort) (algos01)
- Hajautus (Hash) (algos02)
- B-puu (B-tree) (algos02)
- Nelipuu (Quadtree) (algos02)
- Trie (algos03)
    - Trie.md
- Bittivektori (bit vector) (algos03)
    - Example: BitVector.java
- Alkiovieraat osajoukot (disjoint sets) Union-find operations (algos03)
    - Example: UnionFind.java: -2, 1, -1, -1, -1
- Rekursio (recursion) (algos03)
- Rekursioyhtalo (algos04)
- Lyhin virittävä puu (spanning tree) (algos04)
    - Kruskal
        - valitse kaikista lyhyin tie, ei silmukkaa
        - Example: Kruskal.md
    - Prim
        - aloita yhdesta solmusta, valitse lyhyin solmu seuraavaan
        - Example: Prim.md
- Huffman koodit (Huffman coding) (algos04)
    - sort, valitaan kaksi painoarvoltaan pieninta puuta yhdeksi, joiden painoarvon summa juurisolmuun, jatketaan
    - Example: Huffman.md
- LZW-menetelma (algos04)
    - merkkijonon koodaus ja purkaminen
    - Example:  LZW.md



### Kertaluokkamerkinnat (asymptotic analysis)

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

