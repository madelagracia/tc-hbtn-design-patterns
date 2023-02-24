public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipo, String nome) {
        if(tipo == TipoMedia.MP3){
            System.out.printf(String.format("Reproduzindo MP3: %s",  nome));
        }else {
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(tipo);
            mediaPlayerAdapter.reproduzir(tipo, nome);
        }
    }
}
