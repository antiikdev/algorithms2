# Algoritmit 2 (Eng. algorithms)

Aiheet (per paketti) - Topics (per packet)
Lähde (source): Jyu, TIEA211

## Tietorakenteet (Data structures)
- **Algoritmien tehokkuuden analysointi** (algos01, [Algoritmit1.git](https://github.com/antiikdev/algorithms1))
	- Kertaluokkamerkinnat (asymptotic analysis), epäyhtälöt ja raja-arvotesti
	- Example: [Kertaluokkamerkinnat.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/Kertaluokkamerkinnat.md)
- Prioriteettijono (priority queue) (algos01)
    - Numeerinen arvo, joka kuvastaa alkion tärkeyttä, eli esim. pienempi tai suurempi arvo tarkoittaa tärkeämpää (minimi- tai maksimiprioriteettijono). Löydettävä aina tärkein arvo jonosta, esim. järjestämätön lineaarinen lista Θ(1), tai läpikäynti pahimmillaan Θ(n).
    - Operaatioita: lisaaAlkio, poistaPienin, isEmpty
    - Example: [PriorityQueue.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/PriorityQueue.java)
- **Keko kokonaislukutaulukolla (heap and heapsort)** (algos01)
    - Tallennettavista alkioista binääripuu, jossa jokaisessa solmussa yhden alkio tiedot. Lapsisolmujen arvot eivät saa olla pienempiä kuin niiden vanhempien arvot. Puu on osittain järjestetty tai täydellinen. 
    - Operaatiot: lisäys alas ja vertailu vanhempiin sekä nosto ylöspäin. Toteutus taulukolla
	- Aikavaativuus: logaritminen solmujen määrän mukaan
	- Esim. (Heap.java) Keko, joka totetutettu kokonaislukutaulukolla, muodostaa keon niin kauan lapsi t[i] on suurempi (>) kuin vanhempansa t[i/2]. Toiseksi pienin voidaan löytää vakioajassa t[2] tai t[3], jossa pienimmat. Vastaavasti suurin löytyy taulukon lopusta, jossa 1. lehtisolmu on paikassa t[n/2]+1, ja siitä eteenpäin O(n).
	- Heap example: [Heap.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/Heap.java)
    - Heapsort example: [Heapsort.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos01/Heapsort.java)
- **Hajautus (Hash)** (algos02)
	- Hakemisto-tietorakenne, jossa avain-alkio-parit, eli avain on alkion jonkin avainkentän arvo, jolla voidaan hakea rakenteesta.
	- Operaatioita: lisäys, poisto, haku
	- Aikavaativuuksien vertailu: listaosoittimella lineaarinen olisi O(n), kuitenkin binäärihaulla (puolitushaku) tai tasapainoinen binääripuu O(log n),
	hajautusfunktion avulla keskimäärin jopa vakio O(1)
	- Hajautusfunktio:
		- Avaimien hajauttaminen: muodostuksessa esim. h(x) = x-a tai jakolaskumenetelmä jos arvoalue suuri h(x)=x mod x
		- Yhteentörmäys, jos avaimilla sama kotiosoite. Kaksi tapaa käsitellä:
			- Ketjutus: lineaarinen _lista_, osoittimet listojen 1. alkioihin, yleensä järjestämätön. Yksinkertaisia listaoperaatioita.
			- Avoin osoitteenmuodostus: tallennus suoraan hajautustaulukkoon, aputilaa ei tarvita, jossa alkion paikan määrittäminen:
				- Lineaarinen etsintä (linear search): return (key + i) % this.m;
				- Neliöllinen etsintä (square seach): return (key + i * i) % this.m;
				- Kaksoishajautus (double hash): return (key + (7 - i * (key % 7))) % this.m;
    - Examples: [Hash.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Hash.java), [HashSearch.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/HashSearch.java)
- **B-puu (B-tree)** (algos02)
	- 2-3-4-puu, jossa lkm:t ovat m(korkeus)-solmut-osoittimet
	- Lisays: tarkkaillaan solmujen maksimimaaraa, jottei tule liian tayteen.
	- Poisto: Tarkkaillaan solmujen minimimaaraa, jottei tule liian vajaaksi
			- Vaihtoehdot: alkoiden siirto, solmujen yhdistaminen tai etsitaan edeltaja tai seuraaja
    - Examples: [Btree.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Btree.md)
- Nelipuu (Quadtree) (algos02)
	- x,y-pisteitä koordinaatistoon, josta haarautuu puuksi oikeaan ja vasempaan ylä- sekä alanurkkaan
    - Examples: [Quadtree01.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Quadtree01.md), [Quadtree02.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos02/Quadtree02.md)
- Trie (algos03)
	- Standardtrie (standard trie): joukko S, järjestetty puu, jossa juurisolmua lukuunottamatta liittyy aakkoston (A) merkki, haarautuminen aakkoston mukaan, lehtisolmuja s kpl:tta,
	jokaiseen lehtisolmuun liittyy yksi joukon S merkkijono joka kootaan polun merkeista
	- Pakattu trie (packed trie): yksilapsisia solmuja yhdistetään. Merkkijonot puussa tai erillisessä taulukkossa, jossa alimerkkijonot: S[i][j..k], eli i:n merkkijonon merkit paikasta j paikkaan k
    - Example: [Trie.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/Trie.md)
- Joukot
	- Lista, taulukko ja bittivektori
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
			- Liitetään alkio 5 osaksi 1:tä, jolloin -2, -1, -1, -1, 1, jossa indeksissä 1 on -2 nyt juurisolmu ja puun alkioiden lukumäärä (-2).
		- Example: [DisjointSetTree.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/DisjointSetTree.md)
		- Code example: [UnionFind.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos03/UnionFind.java) 

## Algoritmien suunnittelumenetelmat (Algorithms design and analysis)

- Suunnittelumenetelmiä: raaka voima (suoraviivainen), osittaminen (osa tehtävät, rekursio), taulukointi (ratkaisuiden), ahne menetelmä (parhaimmalta näyttävän ratk. valinta)
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
	- Master-lause (master theorem): sovelletaan kun ositus on tehty jakamalla, eli kun T(n) = aT(n/b) + cn^α	
		- a = kuinka monta rekursiivista kutsua
		- b = minkä kokoisia kutsuja
		- cn^α = mitä muuta ulkopuolella (vakio-aikaisia α=0, lineaarinen yksi silmukka α=1 tai sisäkkäiset silmukat α=n^2)
	- Example: [Rekursioyhtalo.md](https://github.com/antiikdev/algorithms2/blob/e058c2ead9f556b4868b1f9d6cde6b48e3c54996/src/algos04/Rekursioyhtalo.md)
- **Verkon lyhin virittävä puu (spanning tree) menetelmät** (algos04)
    - Kruskal
        - Valitaan kaikista joukon S teistä lyhyin tie ja lisätään lyhyimpien teiden joukkoon (T), jatketaan toiseksi lyhimpään, jne. Ei syntyä silmukkaa
        - Example: [Kruskal.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Kruskal.md)
    - Prim
        - Aloita yhdesta solmusta (U=aloitus-solmu), valitse lyhyin solmu seuraavaan, jossa toinen pää joukossa U, ja toinen pää joukon U ulkopuolella, ja lisataan joukkoon T
        - Example: [Prim.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Prim.md)
- Merkkitiedon tiivistäminen ja koodaus
	- **Huffman koodit (Huffman coding)** (algos04)
		- 1) Suuruusjarjestykseen, 2) valitaan kaksi painoarvoltaan pieninta puuta yhdeksi ja painoarvojen summa niiden juurisolmuun, jatketaan yhdistelya solmuissa.
		- Example: [Huffman.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Huffman.md)
	- LZW-menetelma (algos04)
		- Merkkijonon koodaus ja purkaminen
		- Example:  [LZW.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/LZW.md)
- **3-väritysongelma peruutusmenetelmällä (Three-Coloring Problem with "backtracking" method)** (algos05)
    - Eri väri jokaisessa toisiinsa liittyvässä solmussa. Ratkaistaan puulla. Jos vari jo kaytossa, peruutetaan taaksepain ja vaihdetaan vareja.
    - Example: [ThreeColor.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/ThreeColor.md)
- **Pelipuu (Game tree)** (algos05)
    - X and y take turns and in each turn: "x is MAX player, where large values are chosen; y is MIN player, where small values are chosen"
	- alpha-beta pruning (a-b-karsinta): Save computation in the nodes (to alpha and beta) bottom-up by min and max and only go through possible outcome values
    - Example: [GameTree.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/GameTree.md)
-  Kapsäkkiongelma (Knapsack problem) (algos04, algos05)
	- Taulukoimalla: [Knapsack.java](https://github.com/antiikdev/algorithms2/blob/master/src/algos04/Knapsack.java)
    - Rajoitehakumenetelmällä: [Kapsakkiongelma.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/Kapsakkiongelma.md)
- Kauppamatkustajan ongelma (Travelling salesman problem)
	- Kauppamatkusjan ongelma: lyhin reitti joka kulkee kaikkien solmujen kautta täsmälleen kerran
	- **Lin & Kernighan -vaihtoalgoritmi** (heuristic):
		- 1. Poistetaan reitiltä kaksi tietä, jotka eivät ole peräkkäin, ja lisätään kaksi uutta tietä siten, että muodostuu sallittu reitti.
		- 2. Kaydaan lapi kaikki kahden tien vaihdot.
		- 3. Uudeksi ratkaisuksi valitaan reitit, jotka lyhentävät reittiä eniten.
		- Example: [Kauppamatkustaja_LinKernighan.md](https://github.com/antiikdev/algorithms2/blob/master/src/algos05/Kauppamatkustaja_LinKernighan.md)
- Heuristiset ratkaisumenetelmät (heuristic solutions)
	- Lin & Kernighan (kts. esim. yllä kauppamatkustajan ongelma)
	- Geneettinen algoritmi
		- Ratkaisuehdokkaiden joukko populaationa, lisäämällä uusia ratkaisuja (risteytykset ja mutaatiot) ja 
		- Esim. bittijonona, tai joskus merkkijonona tai kokonaislukujen jonona.
	poistamalla vanhoja, tavoitteena paremmat ratkaisut.
	- **Simuloitu jäähdytys**
		- Vertaa paikallinen etsintä, jossa naapuriratkaisut lähellä nykyisiä ratkaisuja
		- Silmuloidussa jäähdytyksessä sallitaan satunnaisesti siirtyminen myös nykyistä ratkaisua huonompiin ratkaisuihin.
		- Esim. minimoidana kustannusta c(x) ja naapuriratkaisu c(x'), resurssin käyttö, reitin pituus, repin paino, jne.
		ratkaisujen kustannusten erotus d = c(x') - c(x), jolla e^-d/T naapuriratkaisun tod.nak., T satunnaisuutta säätelevä lämpötila
	- **Merkkijonon sovitus**
		- n ja m merkkiä pitkät merkkijonot, löytyykö mallimerkkijono jostain kohtaa merkkijonoa?  
		- Raa'an voiman menetelmä: merkkikerrallaan vertaillaan, Θ(nm) pahimmillaan
		- Horspoolin algoritmi: mallimerkkijono P asetetaan merkkijonon T alkuun. Vertaillaan P:n lopusta alkaen,
		jos jokin merkki ei täsmää, siirretään P:tä eteenpäin oikealle, useitakin askelia siirto, jatketaan kunnes kaikki P merkit
		täsmäävät, tai P:tä ei voi enää siirtää. Pahin Θ(nm), mutta käytännössä lineaarinen n:n suhteen

## Laskennallinen vaativuus

- Laskennallinen vaativuus: ongelmien luokittelu vaativuusluokkiin (computational complexity theory).
- Päätösongelmat (decision problem): kuuluuko syöttötieto x joukkoon S; boolean vastaus (0/1; false/true)
- Epädeterministinen algoritmi: 1) epädeterministinen "arvausvaihe" ratkaisuehdotuksella ja 2) deterministinen "tarkastusvaihe" onko ehdokas esiintymän ratkaisu
- Vaativuusluokat
	- P = päätösongelmat (kyllä/ei), jotka voidaan ratkaista polynomisella algoritmilla
	- NP = päätösongelmat, jotka voidaan ratkaista epädeterministisellä (arvauksella) polynomisella algoritmilla.
	Deterministinen (yksikäsitteiset askeleet) polynominen "tarkastus"
- NP-täydellisyys
	- Päätösongelman muuntaminen toiseksi päätösongelmaksi
	- Ongelma T on NP-täydellinen (NP vaikeimmat ongelmat), jos jokainen ongelma S voidaan muuntaa polynomisessa ajassa ongelmaksi T
	- Ei tunneta polynomisessa ajassa olevaa ratkaisua, mutta ratkaisu voidaan tarkastaa polynomisessa ajassa.
	- Ratkaiseminen: jos pieni ongelma, käydään kaikki ratkaisuvaihtoehdot läpi. Jos iso ongelma, käytetään polynomisessa ajassa toimivia heuristisia algoritmeja (tarpeeksi hyvä).
