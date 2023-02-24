public class VideoMediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void reproduzirVlc(String nome) {
        System.out.printf(String.format("Reproduzindo VLC: %s",  nome));
    }

    @Override
    public void reproduzirMp4(String nome) {
        System.out.printf(String.format("Reproduzindo MP4: %s",  nome));
    }
}
