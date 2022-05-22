# Rekursioyhtalo ja master-lause (master theorem)

### 1. Ositetaan suoritusajan (s) osaongelmien lukumäärä.
 
```
 int laske(n)					// n > 1
  {
    if (n <= 1)                // Lopetus
      return 0;
    for (i = 0; i < k; i++)    // k*T(n/4), k kertaa rekursiivinen kutsu koolla n/4 
      x = 2*laske(n/4);			// huom: aina 1, x nollaut.
    for (j = 1; j <= n; j++)    // n kertaa vakioaikainen lause
      x = x + j;
    return x;
  }
```

### 2. Määritellään osaongelmien perusteella rekursioyhtälö

        | c1				kun n <= 1
T(n) =  |
        | kT(n/4) + cn		kun n > 1


### 3. Sovelletaan kohtana 2. master-lausetta (master theorem) aikavaativuuden kertaluokkaan tapauksissa k=2, k=4, k=6

**Master-lause - sovelletaan kun ositus tehty jakamalla (alla: n/b)**
	 | c1					kun n = 1
T(n)=|
	 | aT(n/b) + cn^α		kun n= b^k, k >= 1
	 
Oleelliset arvot: a, b, α ja c

Ratkaisun kertaluokka on
ϴ(n^log_ba), 	jos a > b^α tai c = 0
ϴ(n^α), 		jos a < b^α ja c != 0
ϴ(n^α log_bn), 	jos a = b^α ja c != 0

**Master-lauseessa tehtävässä:**

a=k, b=4, α=1 ja c !=0

**k=2**
a=k (k=2), b=4, α=1 ja c !=0

a < b^α
2 < 4^1 ==> T(n) = ϴ(n^α) = ϴ(n)

**k=4**
a=k (k=4), b=4, α=1

a = b^α
4 = 4^1 ==> T(n) = ϴ(n^αlog_bn) = ϴ(nlogn)

**k=6**
a=k (k=6), b=4, α=1 

a > b^α
6 > 4^1 ==> T(n) = ϴ(n^log_46) = ϴ(log_46 = 1,29)

