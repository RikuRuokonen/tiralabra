### Aihe
Tavoittena on löytää lyhin polku ulos labyrintistä. Labyrinttinä toimii 2d-array. Ohjelman tavoitteena on piirtää lyhin reitti pois labyrintistä. Tarkoituksena on vertailla kahta algoritmia ja näiden tuottamia polkuja sekä nopeuksia.

Algoritmit joita vertaillaan on A* algoritmi ja siitä jalostettu JPS.

### Ohjelman käyttö ja syötteet

Ohjelmalle voi antaa syötteenä oman ASCII kartan tai antaa ohjelman generoida kartan. Ohjelma tulostaa lyhimmän reitin ja toteutuneen ajan.

### Aika- ja tilavaativuudet
Tavoitellut aika- ja tilavaativuudet vastaavat tunnettuja A* ja JPS vaatimuksia.

Aikavaativuudet:

A* = O((|E|+|V|)log|V|)

A* + JPS = O((|E|+|V|)log|V|)

Tilavaativuudet:

A* = O(|E|)

A* + JPS = O(|E|)

