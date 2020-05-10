package br.ufrn.dimap.petcc.comandos;

import br.ufrn.dimap.petcc.mapa.Mapa;

public class MoverParaCima implements Comando {

    @Override
    public void executar(Mapa mapa) {
        mapa.desenhar(mapa.coordenadasJogador, '|');
        if (mapa.coordenadasJogador.y > 0){
            mapa.coordenadasJogador.y--;
            mapa.desenhar(mapa.coordenadasJogador, 'o');
        }
        else {
            mapa.coordenadasJogador.y = mapa.matriz.length - 1;
            mapa.desenhar(mapa.coordenadasJogador, 'o');
        }
    }

    @Override
    public void desfazer(Mapa mapa) {
        mapa.desenhar(mapa.coordenadasJogador, '|');
        if (mapa.coordenadasJogador.y < mapa.matriz.length - 1){
            mapa.coordenadasJogador.y++;
            mapa.desenhar(mapa.coordenadasJogador, 'o');
        }
        else {
            mapa.coordenadasJogador.y = 0;
            mapa.desenhar(mapa.coordenadasJogador, 'o');
        }
    }
}
