package br.ufrn.dimap.petcc.comandos;

import br.ufrn.dimap.petcc.mapa.Mapa;

public interface Comando {
    void executar(Mapa mapa);
    void desfazer(Mapa mapa);
}
