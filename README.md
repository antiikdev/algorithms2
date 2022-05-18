# Algoritmit 2 (Eng. algorithms)

Aiheet (per paketti) - Topics (per packet)

## Tietorakenteet (Data structures
- Algoritmien tehokkuuden analysointi
	- Kertaluokkamerkinnat (asymptotic analysis), epäyhtälöt ja raja-arvotesti
	- Example: [Kertaluokkamerkinnat.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/Kertaluokkamerkinnat.md)
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
	- 2-3-4-puu, jossa lkm:t ovat m(korkeus)-solmut-osoittimet
	- Lisays: tarkkaillaan solmujen maksimimaaraa, jottei tule liian tayteen.
	- Poisto: Tarkkaillaan solmujen minimimaaraa, jottei tule liian vajaaksi
			- Vaihtoehdot: alkoiden siirto, solmujen yhdistaminen tai etsitaan edeltaja tai seuraaja
    - Examples: [Btree.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Btree.md),
	[HashSearch.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/HashSearch.java)
- Nelipuu (Quadtree) (algos02)
	- x,y-pisteitä koordinaatistoon, josta haarautuu puuksi oikeaan ja vasempaan ylä- sekä alanurkkaan
    - Examples: [Quadtree01.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Quadtree01.md), [Quadtree02.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Quadtree02.md)
- Trie (algos03)
	- Standardtrie (standard trie): joukko S, järjestetty puu, jossa juurisolmua lukuunottamatta liittyy aakkoston (A) merkki, haarautuminen aakkoston mukaan, lehtisolmuja s kpl:tta,
	jokaiseen lehtisolmuun liittyy yksi joukon S merkkijono joka kootaan polun merkeista
	- Pakattu trie (packed trie): yksilapsisia solmuja yhdistetään. Merkkijonot puussa tai erillisessä taulukkossa, jossa alimerkkijonot: S[i][j..k], eli i:n merkkijonon merkit paikasta j paikkaan k
    - Example: [Trie.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/Trie.md)
- Bittivektori (bit vector) (algos03)
	- Alkio tallennetaan taulukkoon ja viitataan suoraan taulukkoindeksillä 0 tai 1. Eli, a[i]=1, alkio i kuuluu bittivektorin joukkoon (0 ei kuuluisi)
	- Esim. int[] A = { 1, 0, 1, 0, 1, 0 }; // { 0, 2, 4 }
	- Operaatioita:
		- Lisaa x set A:n
		- Poista x set A:sta 
		- Kuuluuko x set A:n
		- Leikkaus, kuuluu A ja B:n (intersection: A nn B)
		- Yhdiste, kuuluu A, B tai molempiin (union: A uu B)
		- Erotus, kuuluu A:n muttei B:n (set difference: A \ B)
    - Example: [BitVector.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/BitVector.java)
- Alkiovieraat osajoukot (disjoint sets) Union-find operations (algos03)
    - Puurakenteen toteutus taulukolla:
		- Alkutilanne: 1 2 3 4 5, puu alussa -1 -1 -1 -1 -1, jossa jokainen juurisolmuna
		- Liitetään alkio 5 osaksi 1:tä, jolloin -2, 1, -1, -1, -1, jossa indeksissä 1 on -2 nyt juurisolmu ja puun alkioiden lukumäärä (-2).
    - Example: [UnionFind.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/UnionFind.java) 

## Algoritmien suunnittelumenetelmat (Algorithms design and analysis)

- **Rekursio (recursion) (algos03, algos04, algos05)**
	- Examples:
		- Remainder sum [Remainder.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/Remainder.java)
		- Array index multiplication sum [MultiplicationSum.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/MultiplicationSum.java)
		- Biggest number in array [RecursionBiggest.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/RecursionBiggest.java)
		- Biggest number by diving the table in half [RecursionBiggestHalf.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/RecursionBiggestHalf.java)
		- Recursive count [RecursionCount.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/RecursionCount.java)
		- Recursive sum and sum using division [RecursiveSum.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/RecursiveSum.java)
- **Rekursioyhtalo (algos04)**
	- Edellisillä luvuilla lasketaan seuraava, josta rekursio yhtälö, joka voidaan laskea purkamalla iteraatiot auki
	- Master-lause (master theorem: sovelletaan kun ositus on tehty jakamalla, eli kun T(n) = aT(n/b) + cn^α	
- Lyhin virittävä puu (spanning tree) menetelmät (algos04)
    - Kruskal
        - Valitaan kaikista joukon S teistä lyhyin tie ja lisätään lyhyimpien teiden joukkoon (T), jatketaan toiseksi lyhimpään, jne. Ei syntyä silmukkaa
        - Example: [Kruskal.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Kruskal.md)
    - Prim
        - Aloita yhdesta solmusta (U=aloitus-solmu), valitse lyhyin solmu seuraavaan, jossa toinen pää joukossa U, ja toinen pää joukon U ulkopuolella, ja lisataan joukkoon T
        - Example: [Prim.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Prim.md)
- Merkkitiedon tiivistäminen ja koodaus
	- Huffman koodit (Huffman coding) (algos04)
		- 1) Suuruusjarjestykseen, 2) valitaan kaksi painoarvoltaan pieninta puuta yhdeksi ja painoarvojen summa niiden juurisolmuun, jatketaan yhdistelya solmuissa.
		- Example: [Huffman.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Huffman.md)
	- LZW-menetelma (algos04)
		- Merkkijonon koodaus ja purkaminen
		- Example:  [LZW.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/LZW.md)
- 3-väritysongelma peruutusmenetelmällä (Three-Coloring Problem with "backtracking" method) (algos05)
    - Eri väri jokaisessa toisiinsa liittyvässä solmussa. Ratkaistaan puulla. Jos vari jo kaytossa, peruutetaan taaksepain ja vaihdetaan vareja.
    - Example: [ThreeColor.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/ThreeColor.md)
- Pelipuu (Game tree) (algos05)
    - X and y take turns and in each turn: "x is MAX player, where large values are chosen; y is MIN player, where small values are chosen"
	- alpha-beta pruning (a-b-karsinta): Save computation in the nodes (to alpha and beta) bottom-up by min and max and only go through possible outcome values
    - Example: [GameTree.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/GameTree.md)
-  Kapsäkkiongelma (Knapsack problem) (algos04, algos05)
	- Taulukoimalla: [Knapsack.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Knapsack.java)
    - Rajoitehakumenetelmällä: [Kapsakkiongelma.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/Kapsakkiongelma.md)
- Kauppamatkustajan ongelma (Travelling salesman problem)
	- Kauppamatkusjan ongelma: lyhin reitti joka kulkee kaikkien solmujen kautta täsmälleen kerran
	- Lin & Kernighan -vaihtoalgoritmi (heuristic):
		- 1. Poistetaan reitiltä kaksi tietä, jotka eivät ole peräkkäin, ja lisätään kaksi uutta tietä siten, että muodostuu sallittu reitti.
		- 2. Kaydaan lapi kaikki kahden tien vaihdot.
		- 3. Uudeksi ratkaisuksi valitaan reitit, jotka lyhentävät reittiä eniten.
		- Example: [Kauppamatkustaja_LinKernighan.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/Kauppamatkustaja_LinKernighan.md)


## Laskennallinen vaativuus

- NP-taydellisyys