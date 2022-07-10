package br.com.prova.tech4music.Service;
import java.util.List;
import java.util.Optional;

import br.com.prova.tech4music.Compartilhado.MusicaDTO;

public interface MusicaService {
        MusicaDTO criarMusica(MusicaDTO musica);
        List<MusicaDTO> obterTodos();
        void removerMusica(String id);
        MusicaDTO atualizarMusica(String id,MusicaDTO musicaDTO);
        Optional <MusicaDTO>obterPorId(String ID);
        long contagem(); 
    }