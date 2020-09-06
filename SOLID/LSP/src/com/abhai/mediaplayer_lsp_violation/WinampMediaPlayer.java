package com.abhai.mediaplayer_lsp_violation;

public class WinampMediaPlayer extends MediaPlayer {

    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
