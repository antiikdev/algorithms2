## Kertaluokkamerkinnat (asymptotic analysis)

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


## Kertaluokkamerkinnät ja esimerkit epäyhtälöistä
Osoitetaan väitteet oikeaksi määritelmien avulla ja etsitään sopivat vakiot n0, c, c1, c2,
joilla epäyhtälöt toteutuvat.

### 2n^2 + 3n = O(n^2)

- f(n) = O(g(n)): f samaa tai alempaa kertaluokkaa kuin g.

```
c,n > 0 : 0 <= 2n^2 + 3n <= cn^2 >= n0
```

- Vasen <= aina tosi (n yleensa positiivisia kokonaislukuja, koska alkioiden maara)
- Oikea <= tosi, jos (c-2)n^2-3n >= 0

Siirretään termit samalle puolelle:
```
n((c - 2)n - 3) >= 0, jolloin c > 2 koska n positiivinen
```

Tosi kun valitaan esim. c = 3 ---> n >= 3
Siten vakiot c = 3 ja n0 = 3 



### 3n^2 + 4n = Ω(n^2)

- f(n) = Ω(g(n): f on samaa tai ylempaa kertaluokkaa kuin g.

```
c, n > 0 : 0 <= cg(n) <= f(n) n >= n0
c, n > 0 : 0 <= cn^2 <= 3n^2 + 4n  >= n
```

- Vasen <= aina tosi (n yleensa positiivisia kokonaislukuja, koska alkioiden maara)
- Oikea <= tosi, jos cn^2 <= 3n^2 + 4n

Siirretään termit samalle puolelle:
```
cn^2 <= 3n^2 + 4n
3n^2 + 4n - cn^2 => 0
n^2(3 - c) + 4n >= 0
<---->
n((3-c)n + 4) >= 0, joten oltava c <= 3
```

Tosi kun valitaan esim. c = 3 ---> n >= 0
Siten vakiot c = 3 ja n0 = 1



### 4n^2 + 5n = o(n^3)

- f(n) = o(g(n)): f on (aidosti) alempaa kertaluokkaa kuin g.

```
c, n > 0 : 0 <= f(n) < cg(n) n >= n0
c, n > 0 : 0 <= 4n^2 + 5n < o(n^3)
```

- Vasen <= aina tosi (n yleensa positiivisia kokonaislukuja, koska alkioiden maara)
- Oikea <= tosi, jos 4n^2 + 5n < cn^3

Siirretään termit samalle puolelle:
```
cn^3 - 4n^2 - 5n > 0
<---->
n(cn^2 - 4n - 5) > 0

Lasketaan nollakohdat:
n > (2 + SQUARE(4+5c)) / c
```

Tosi kun valitaan esim. n0 > (2 + SQUARE(4+5c)) / c



### 2n^2 + n = ω(n)

- f(n) = ω(g(n)): f on (aidosti) ylempaa kertaluokkaa kuin g.

```
c, n > 0 : 0 <= cg(n) < f(n)  n >= n0
c, n > 0 : 0 <= cn < 2n^2 + n
```

- Vasen <= aina tosi (n yleensa positiivisia kokonaislukuja, koska alkioiden maara)
- Oikea <= tosi, jos cn < 2n^2 + n 

Siirretään termit samalle puolelle:

```
cn < 2n^2 + n
2n^2 + n - cn > 0
2n^2 + (1 - c)n > 0
<---->
n(2n + 1 - c) > 0	||:2
--->
n > (c - 1) / 2
```

Tosi kun n > (c - 1) / 2



### n^2 + 2n + 5 = ϴ(n^2)

- f(n) = ϴ(g(n)): f on samaa kertaluokkaa kuin g.

```
c, n > 0 : 0 <= c1g(n) <= f(n) <= c2g(n)  n >= n0
c, n > 0 : 0 <= c1n^2 <= n^2 + 2n + 5 <= c2n^2
```

- Vasen <= aina tosi (n yleensa positiivisia kokonaislukuja, koska alkioiden maara)
- Keskimmainen <= tosi, jos c1n^2 <= n^2 + 2n + 5


Siirretään termit samalle puolelle:

```
n^2 + 2n + 5 - c1n^2 => 0
(1 - c1)n^2 + 2n + 5 => 0, joten oltava c1 <= 1
```
Kokeillaan c1 = 1 --> n >= 0


- Oikea <= tosi, jos n^2 + 2n + 5 <= c2n^2

Siirretään termit samalle puolelle:

```
n^2 + 2n + 5 <= c2n^2
0 <= c2n^2 - n^2 - 2n - 5
c2n^2 - n^2 - 2n - 5 => 0
(c2 - 1)n^2 - 2n - 5 => 0, joten oltava c2 > 1
```

Kokeillaan c2 = 2 --> >= 0, kun n >= 4


## Raja-arvotesti

```
         tA(n)
lim n->M ----- = C tai 0 tai ääretön (M)
         tB(n)
```

- Raja-arvo nollasta eroava vakio C (f(n) != 0): f(n) on asymptoottisesti yhtä suuri, eli funktiot ovat samaa kertaluokkaa
- Raja-arvo nolla: tB(n) funktio kasvaa nopeammin kuin tB(n), eli tA(n) on asymptoottisesti pienempi kuin tB(n)
- Raja-arvo ääretön: tA(n) osoittaja on asymptoottisesti suurempi kuin tB(n), eli tA(n) kasvaa nopeammin
