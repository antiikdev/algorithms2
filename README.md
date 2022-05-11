# Algoritmit 2 (Eng. algorithms)

## Aiheet per paketti (topics per packet):

- Prioriteettijono (priority queue) (algos01)
    - Example: [PriorityQueue.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/PriorityQueue.java)
- Keko kokonaislukutaulukolla (heap and heapsort) (algos01)
    - Heap example: [Heap.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/Heap.java)
    - Heapsort example: [Heapsort.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/Heapsort.java)
- Hajautus (Hash) (algos02)
    - Example: [Hash.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Hash.java)
- B-puu (B-tree) (algos02)
    - Examples: [Btree.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Btree.md)
- Nelipuu (Quadtree) (algos02)
    - Examples: [Quadtree01.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Quadtree01.md), [Quadtree02.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Quadtree02.md)
- Trie (algos03)
    - [Trie.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/Trie.md)
- Bittivektori (bit vector) (algos03)
    - Example: [BitVector.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/BitVector.java)
- Alkiovieraat osajoukot (disjoint sets) Union-find operations (algos03)
    - Example: -2, 1, -1, -1, -1
    - Example: [UnionFind.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/UnionFind.java) 
- Rekursio (recursion) (algos03, algos04, algos05)
    - Recursive count [RecursionCount.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/RecursionCount.java)
    - Recursive sum and sum using division [RecursiveSum.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/RecursiveSum.java)
- **Rekursioyhtalo (algos04)**
- Lyhin virittävä puu (spanning tree) (algos04)
    - Kruskal
        - valitse kaikista lyhyin tie, ei silmukkaa
        - Example: [Kruskal.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Kruskal.md)
    - Prim
        - aloita yhdesta solmusta, valitse lyhyin solmu seuraavaan
        - Example: [Prim.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Prim.md)
- Huffman koodit (Huffman coding) (algos04)
    - sort, valitaan kaksi painoarvoltaan pieninta puuta yhdeksi, joiden painoarvon summa juurisolmuun, jatketaan
    - Example: [Huffman.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Huffman.md)
- LZW-menetelma (algos04)
    - merkkijonon koodaus ja purkaminen
    - Example:  [LZW.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/LZW.md)
- 3-väritysongelma peruutusmenetelmällä (Three-Coloring Problem with backtracking method) (algos05)
    - Eri väri jokaisessa toisiinsa liittyvässä solmussa
    - Example: [ThreeColor.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/ThreeColor.md)
- Pelipuu (Game tree) (algos05)
    - "x is MAX player, large values are better y is MIN player, small values are better"
    - Example: [GameTree.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/GameTree.md)
- Rajoitehakumenetelmällä kapsäkkiongelma (Knapsack problem) (algos05)
    - Example: [Kapsakkiongelma.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/Kapsakkiongelma.md)


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

