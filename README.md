<h1>Progetto Schacchiera Rook</h1>

<pre>Questo progetto è una semplice implementazione in Java di un'applicazione che simula il movimento 
di una torre su una schacchiera.L'applicazione consente all'utente di muovere la torre su una schacchiera
8x8 e visualizzare la schacchiera aggiornata dopo ogni mossa.</pre>
<h2>Funzionalità</h2>
<pre>
-<b><i>Inizializzazione scacchiera</b></i>: La scacchiera viene inizializzata con la posizione iniziale della torre.
-<b><i>Disegno scacchiera</b></i>: La scacchiera corrente viene visualizzata a console.
-<b><i>Movimento torre</b></i>: L'utente può muovere la torre sulla scacchiera inserendo la posizione iniziale e quella finale.
-<b><i>Controllo validità mossa</b></i>: La mossa della torre viene controllata per verificarne la validità 
(ad esempio, se la torre si muove in orizzontale o verticale e se non ci sono ostacoli).
-<b><i>Log movimenti</b></i>: I movimenti della torre vengono salvati in un file di log.</pre>

<h2>Struttura del progetto</h2>

<pre>Il progetto è organizzato in tre classi:

ScacchieraRook: Questa classe contiene la rappresentazione della schacchiera e i metodi per inizializzarla e disegnarla.
MovimentoRook: Questa classe contiene la logica per muovere la torre sulla schacchiera e controllare se la mossa è valida.
Main: Questa classe contiene il metodo main che inizializza l'applicazione e gestisce il ciclo di gioco.
Funzionalità
Inizializzazione della schacchiera con la posizione iniziale della torre.
Disegno della schacchiera corrente.
Movimento della torre sulla schacchiera.
Controllo della validità del movimento della torre.
Utilizzo
Per utilizzare l'applicazione, eseguire la classe Main. 
L'applicazione chiederà all'utente di inserire la mossa della torre, 
specificando la posizione iniziale e la posizione finale. L'applicazione disegnerà la schacchiera aggiornata dopo ogni mossa.
</pre>
<h2>Esempio di utilizzo:</h2>
<pre>
  
8  T - - - - - -


7  - - - - - - -

6  - - - - - - -

5  - - - - - - -

4  - - - - - - -

3  - - - - - - -

2  - - - - - - -

1  - - - - - - -

  A B C D E F G H
  
Inserisci la mossa della torre, scrivi la posizione della pedina
poi la destinazione(es. A1-B1 il trattino deve essere assieme alle due posizioni): A8-B8

8  - T - - - - -

7  - - - - - - -

6  - - - - - - -

5  - - - - - - -

4  - - - - - - -

3  - - - - - - -

2  - - - - - - -

1  - - - - - - -

  A B C D E F G H
  </pre>
  
**Note**

Questo progetto è una semplice implementazione di base e non contiene tutte le funzionalità di un gioco di scacchi completo. Ad esempio, non è presente la logica per controllare se la mossa della torre causi scacco o scacco matto. Inoltre, non è presente la 

logica per gestire le mosse di altri pezzi scacchistici.
</h4>
