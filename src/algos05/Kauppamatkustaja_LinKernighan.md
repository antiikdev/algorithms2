# Kauppamatkustajan ongelma (Traveling salesman problem) - Lin & Kernighan heuristic

Kauppamatkusjan ongelma: lyhin reitti joka kulkee kaikkien solmujen
kautta täsmälleen kerran

**Verkko - kaikki solmut yhteydessa**

```

		A
	4  2 2	7	
E	    8		B
	 			
  8			   2
	 3	   5
	D	5	C

```

Reitti			pituus
A-B-C-D-E-A		7+2+5+8+4=26

1. Poistetaan reitiltä kaksi tietä, jotka eivät ole peräkkäin,
ja lisätään kaksi uutta tietä siten, että muodostuu sallittu reitti.
2. Kaydaan lapi kaikki kahden tien vaihdot.
3. Uudeksi ratkaisuksi valitaan reitit, jotka lyhentävät reittiä eniten.

Iteroidin jalkeen reitti:
A-D-B-C-E-A: 2+3+2+5+4=16
