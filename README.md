Progetto Schacchiera Rook
Questo progetto è una semplice implementazione in Java di un'applicazione che simula il movimento di una torre su una schacchiera. L'applicazione consente all'utente di muovere la torre su una schacchiera 8x8 e visualizzare la schacchiera aggiornata dopo ogni mossa.

Struttura del progetto
Il progetto è organizzato in tre classi:

ScacchieraRook: Questa classe contiene la rappresentazione della schacchiera e i metodi per inizializzarla e disegnarla.
MovimentoRook: Questa classe contiene la logica per muovere la torre sulla schacchiera e controllare se la mossa è valida.
Main: Questa classe contiene il metodo main che inizializza l'applicazione e gestisce il ciclo di gioco.
Funzionalità
Inizializzazione della schacchiera con la posizione iniziale della torre.
Disegno della schacchiera corrente.
Movimento della torre sulla schacchiera.
Controllo della validità del movimento della torre.
Utilizzo
Per utilizzare l'applicazione, eseguire la classe Main. L'applicazione chiederà all'utente di inserire la mossa della torre, specificando la posizione iniziale e la posizione finale. L'applicazione disegnerà la schacchiera aggiornata dopo ogni mossa.

Esempio di utilizzo:
1 T - - - - - -
2 - - - - - - -
3 - - - - - - -
4 - - - - - - -
5 - - - - - - -
6 - - - - - - -
7 - - - - - - -
8 - - - - - - -
  A B C D E F G H
Inserisci la mossa della torre, scrivi la posizione della pedina poi la destinazione(es. A1-B1 il trattino deve essere assieme alle due posizioni): A1-B1
1 - T - - - - -
2 - - - - - - -
3 - - - - - - -
4 - - - - - - -
5 - - - - - - -
6 - - - - - - -
7 - - - - - - -
8 - - - - - - -
  A B C D E F G H
Note
Questo progetto è una semplice implementazione di base e non contiene tutte le funzionalità di un gioco di scacchi completo. Ad esempio, non è presente la logica per controllare se la mossa della torre causi scacco o scacco matto. Inoltre, non è presente la logica per gestire le mosse di altri pezzi scacchistici.
