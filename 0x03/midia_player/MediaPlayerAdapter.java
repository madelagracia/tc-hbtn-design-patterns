public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if (tipoMedia != TipoMedia.MP3) {
            VideoMediaPlayer advancedMediaPlayer = new VideoMediaPlayer();
            this.advancedMediaPlayer = advancedMediaPlayer;
        }
    }

    @Override
    public void reproduzir(TipoMedia tipo, String nome) {
        if (tipo == TipoMedia.MP4) {
            advancedMediaPlayer.reproduzirMp4(nome);
        }
        if (tipo == TipoMedia.VLC) {
            advancedMediaPlayer.reproduzirVlc(nome);
        }
    }
}

