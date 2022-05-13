# Algoritmit 2 (Eng. algorithms)

## Aiheet (per paketti) - Topics (per packet):

- Prioriteettijono (priority queue) (algos01)
    - Numeerinen arvo, joka kuvastaa alkion tärkeyttä. Löydettävä aina tärkein arvo.
    - Operaatioita: lisaaAlkio, poistaPienin, isEmpty
    - Example: [PriorityQueue.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/PriorityQueue.java)
- Keko kokonaislukutaulukolla (heap and heapsort) (algos01)
    - Tallennettavista alkioista binääripuu, jossa jokaisessa solmussa yhden alkio tiedot sekä osittain järjestetty tai täydellinen
    - Heap example: [Heap.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/Heap.java)
    - Heapsort example: [Heapsort.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/Heapsort.java)
- Hajautus (Hash) (algos02)
	- Hakemisto-tietorakenne, jossa avain-alkio-parit, eli avain on alkion jonkin avainkentän arvo, jolla voidaan hakea rakenteesta.
	- Operaatioita: lisäys, poisto, haku
	- Aikavaativuuksien vertailu: listaosoittimella lineaarinen olisi O(n), kuitenkin binäärihaulla (puolitushaku) tai tasapainoinen binääripuu O(log n),
	hajautusfunktion avulla keskimäärin jopa vakio O(1)
	- Hajautusfunktio:
		- Avaimien hajauttaminen: muodostuksessa esim. h(x) = x-a tai jakolaskumenetelmä jos arvoalue suuri h(x)=x mod x
		- Yhteentörmäys, jos avaimilla sama kotiosoite. Kaksi tapaa käsitellä:
			- Ketjutus: lineaarinen lista
			- Avoin osoitteenmuodostus: tallennus hajautustaulukkoon, aputilaa ei tarvita, jossa alkion paikan määrittäminen:
				- Lineaarinen etsintä (linear search): return (key + i) % this.m;
				- Neliöllinen etsintä (square seach): return (key + i * i) % this.m;
				- Kaksoishajautus (double hash): return (key + (7 - i * (key % 7))) % this.m;
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


