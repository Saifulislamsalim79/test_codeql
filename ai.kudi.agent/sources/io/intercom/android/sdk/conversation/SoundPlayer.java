package io.intercom.android.sdk.conversation;

import android.content.Context;
import android.content.res.Resources;
import android.media.SoundPool;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes.dex */
public class SoundPlayer {
    static final int NOT_FOUND_ID = -1;
    private static final Twig TWIG;
    private final Provider<AppConfig> appConfigProvider;
    final int messageReceivedId;
    boolean messageReceivedLoaded;
    private final int operatorReceivedId;
    private boolean operatorReceivedLoaded;
    final int replyFailedId;
    boolean replyFailedLoaded;
    final int replySentId;
    boolean replySentLoaded;
    private final SoundPool soundPool;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Twig $r0 = LumberMill.getLogger();
        TWIG = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SoundPlayer(android.content.Context r5, io.intercom.android.sdk.Provider r6) {
        /*
            r4 = this;
            android.media.SoundPool r0 = new android.media.SoundPool
            r1 = 1
            r2 = 5
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.SoundPlayer.<init>(android.content.Context, io.intercom.android.sdk.Provider):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    SoundPlayer(Context context, Provider provider, SoundPool soundPool) {
        this.appConfigProvider = provider;
        this.soundPool = soundPool;
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: io.intercom.android.sdk.conversation.SoundPlayer.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                if (i2 == 0) {
                    SoundPlayer $r2 = SoundPlayer.this;
                    int $i1 = $r2.messageReceivedId;
                    if (i == $i1) {
                        $r2.messageReceivedLoaded = true;
                        return;
                    }
                    int $i12 = $r2.replyFailedId;
                    if (i == $i12) {
                        $r2.replyFailedLoaded = true;
                        return;
                    }
                    int $i13 = $r2.replySentId;
                    if (i == $i13) {
                        $r2.replySentLoaded = true;
                        return;
                    }
                    int $i14 = $r2.operatorReceivedId;
                    if (i == $i14) {
                        SoundPlayer.this.operatorReceivedLoaded = true;
                    }
                }
            }
        });
        int $i0 = C10110R.raw.intercom_received;
        this.messageReceivedId = loadSound(context, $i0);
        int $i02 = C10110R.raw.intercom_failed;
        this.replyFailedId = loadSound(context, $i02);
        int $i03 = C10110R.raw.intercom_sent;
        this.replySentId = loadSound(context, $i03);
        int $i04 = C10110R.raw.intercom_operator;
        this.operatorReceivedId = loadSound(context, $i04);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int loadSound(Context context, int i) {
        SoundPool $r2 = this.soundPool;
        try {
            int $i0 = $r2.load(context, i, 1);
            return $i0;
        } catch (Resources.NotFoundException $r3) {
            Twig $r4 = TWIG;
            Object[] $r5 = new Object[0];
            $r4.m13066e($r3, "Could not play sound", $r5);
            return -1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void playIfLoaded(boolean z, int i) {
        if (!z || i == -1) {
            return;
        }
        Provider $r2 = this.appConfigProvider;
        Object $r3 = $r2.get();
        AppConfig $r4 = (AppConfig) $r3;
        boolean $z0 = $r4.isAudioEnabled();
        if ($z0) {
            SoundPool $r1 = this.soundPool;
            $r1.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void playMessageReceivedSound() {
        boolean $z0 = this.messageReceivedLoaded;
        int $i0 = this.messageReceivedId;
        playIfLoaded($z0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void playOperatorReceivedSound() {
        boolean $z0 = this.operatorReceivedLoaded;
        int $i0 = this.operatorReceivedId;
        playIfLoaded($z0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void playReplyFailedSound() {
        boolean $z0 = this.replyFailedLoaded;
        int $i0 = this.replyFailedId;
        playIfLoaded($z0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void playReplySentSound() {
        boolean $z0 = this.replySentLoaded;
        int $i0 = this.replySentId;
        playIfLoaded($z0, $i0);
    }
}
