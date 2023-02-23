package tcking.github.com.giraffeplayer2;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.SeekBar;
import java.util.Locale;
import p272h.p275b.p283c.p284a.C8230a;
import p272h.p275b.p283c.p284a.C8231b;
import p272h.p275b.p283c.p284a.C8232c;
import p272h.p275b.p283c.p284a.C8233d;
import p272h.p275b.p283c.p285b.C8234a;
import tcking.github.com.giraffeplayer2.p607q.C14910c;
import tv.danmaku.ijk.media.player.IjkTimedText;
/* compiled from: DefaultMediaController.java */
/* renamed from: tcking.github.com.giraffeplayer2.c */
/* loaded from: classes3.dex */
public class C14857c extends AbstractC14855a {

    /* renamed from: i */
    protected long f33234i;

    /* renamed from: j */
    protected boolean f33235j;

    /* renamed from: k */
    protected boolean f33236k;

    /* renamed from: l */
    protected boolean f33237l;

    /* renamed from: m */
    protected SeekBar f33238m;

    /* renamed from: n */
    protected int f33239n;

    /* renamed from: o */
    protected final int f33240o;

    /* renamed from: p */
    protected float f33241p;

    /* renamed from: q */
    private int f33242q;

    /* renamed from: r */
    protected final SeekBar.OnSeekBarChangeListener f33243r;

    /* renamed from: s */
    protected final View.OnClickListener f33244s;

    /* compiled from: DefaultMediaController.java */
    /* renamed from: tcking.github.com.giraffeplayer2.c$a */
    /* loaded from: classes3.dex */
    class C14858a implements SeekBar.OnSeekBarChangeListener {
        C14858a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z && C14857c.this.f33232g.m203d()) {
                C8234a c8234a = C14857c.this.f33229d;
                c8234a.m16453e(C8231b.app_video_status);
                c8234a.m16454d();
                C14863e player = C14857c.this.f33232g.getPlayer();
                double duration = player.getDuration();
                double d = i;
                Double.isNaN(d);
                Double.isNaN(duration);
                int i2 = (int) (duration * ((d * 1.0d) / 1000.0d));
                String m201A = C14857c.this.m201A(i2);
                if (C14857c.this.f33237l) {
                    player.seekTo(i2);
                }
                C8234a c8234a2 = C14857c.this.f33229d;
                c8234a2.m16453e(C8231b.app_video_currentTime);
                c8234a2.m16449i(m201A);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            C14857c c14857c = C14857c.this;
            c14857c.f33236k = true;
            c14857c.m194H(3600000);
            C14857c.this.f33231f.removeMessages(1);
            C14857c c14857c2 = C14857c.this;
            if (c14857c2.f33237l) {
                c14857c2.f33228c.setStreamMute(3, true);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (C14857c.this.f33232g.m203d()) {
                C14863e player = C14857c.this.f33232g.getPlayer();
                if (!C14857c.this.f33237l) {
                    double duration = player.getDuration();
                    double progress = seekBar.getProgress();
                    Double.isNaN(progress);
                    Double.isNaN(duration);
                    player.seekTo((int) (duration * ((progress * 1.0d) / 1000.0d)));
                }
                C14857c c14857c = C14857c.this;
                c14857c.m194H(c14857c.f33230e);
                C14857c.this.f33231f.removeMessages(1);
                C14857c.this.f33228c.setStreamMute(3, false);
                C14857c c14857c2 = C14857c.this;
                c14857c2.f33236k = false;
                c14857c2.f33231f.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    /* compiled from: DefaultMediaController.java */
    /* renamed from: tcking.github.com.giraffeplayer2.c$b */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC14859b implements View.OnClickListener {
        View$OnClickListenerC14859b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C14863e player = C14857c.this.f33232g.getPlayer();
            if (view.getId() == C8231b.app_video_fullscreen) {
                player.m122q0();
            } else if (view.getId() == C8231b.app_video_play) {
                if (player.isPlaying()) {
                    player.pause();
                } else {
                    player.start();
                }
            } else if (view.getId() == C8231b.app_video_replay_icon) {
                player.seekTo(0);
                player.start();
            } else if (view.getId() == C8231b.app_video_finish) {
                if (player.m148d0()) {
                    return;
                }
                ((Activity) C14857c.this.f33232g.getContext()).finish();
            } else if (view.getId() == C8231b.app_video_float_close) {
                player.m126o0();
                player.m130m0(0);
            } else if (view.getId() == C8231b.app_video_float_full) {
                player.m130m0(1);
            } else if (view.getId() == C8231b.app_video_clarity) {
                androidx.appcompat.app.e eVar = (Activity) C14857c.this.f33232g.getContext();
                if (eVar instanceof androidx.appcompat.app.e) {
                    androidx.fragment.app.h c14910c = new C14910c();
                    Bundle bundle = new Bundle();
                    bundle.putString("fingerprint", C14857c.this.f33232g.getVideoInfo().m35d());
                    c14910c.setArguments(bundle);
                    c14910c.show(eVar.getSupportFragmentManager(), "player_track");
                }
            }
        }
    }

    /* compiled from: DefaultMediaController.java */
    /* renamed from: tcking.github.com.giraffeplayer2.c$c */
    /* loaded from: classes3.dex */
    class View$OnTouchListenerC14860c implements View.OnTouchListener {

        /* renamed from: c */
        final /* synthetic */ GestureDetector f33247c;

        View$OnTouchListenerC14860c(GestureDetector gestureDetector) {
            this.f33247c = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (C14857c.this.f33242q == 2) {
                return false;
            }
            if (this.f33247c.onTouchEvent(motionEvent)) {
                return true;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3 || action == 4) {
                C14857c.this.m182z();
            }
            return true;
        }
    }

    /* compiled from: DefaultMediaController.java */
    /* renamed from: tcking.github.com.giraffeplayer2.c$d */
    /* loaded from: classes3.dex */
    public class C14861d extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: c */
        private boolean f33249c;

        /* renamed from: d */
        private boolean f33250d;

        /* renamed from: e */
        private boolean f33251e;

        public C14861d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f33249c = true;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C14857c.this.f33232g.m203d()) {
                float x = motionEvent.getX();
                float y = motionEvent.getY() - motionEvent2.getY();
                float x2 = x - motionEvent2.getX();
                if (this.f33249c) {
                    this.f33251e = Math.abs(f) >= Math.abs(f2);
                    this.f33250d = x > ((float) C14857c.this.f33232g.getWidth()) * 0.5f;
                    this.f33249c = false;
                }
                C14863e player = C14857c.this.f33232g.getPlayer();
                if (!this.f33251e) {
                    if (C14857c.this.f33242q == 0 && C14857c.this.f33232g.m206a()) {
                        return true;
                    }
                    float height = y / C14857c.this.f33232g.getHeight();
                    if (this.f33250d) {
                        C14857c.this.m196F(height);
                    } else {
                        C14857c.this.m198D(height);
                    }
                } else if (player.canSeekForward()) {
                    C14857c c14857c = C14857c.this;
                    c14857c.m197E((-x2) / c14857c.f33232g.getWidth());
                }
                return true;
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C14857c c14857c = C14857c.this;
            if (c14857c.f33235j) {
                c14857c.m200B(false);
                return true;
            }
            c14857c.m194H(c14857c.f33230e);
            return true;
        }
    }

    public C14857c(Context context) {
        super(context);
        this.f33234i = -1L;
        this.f33239n = -1;
        this.f33242q = 0;
        this.f33243r = new C14858a();
        this.f33244s = new View$OnClickListenerC14859b();
        this.f33240o = this.f33228c.getStreamMaxVolume(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public String m201A(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        return i4 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)) : String.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    /* renamed from: C */
    private boolean m199C() {
        return Build.VERSION.SDK_INT >= 17 && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m198D(float f) {
        Window window = ((Activity) this.f33227b).getWindow();
        if (this.f33241p < 0.0f) {
            float f2 = window.getAttributes().screenBrightness;
            this.f33241p = f2;
            if (f2 <= 0.0f) {
                this.f33241p = 0.5f;
            } else if (f2 < 0.01f) {
                this.f33241p = 0.01f;
            }
        }
        String simpleName = C14857c.class.getSimpleName();
        Log.d(simpleName, "brightness:" + this.f33241p + ",percent:" + f);
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_brightness_box);
        c8234a.m16446l();
        WindowManager.LayoutParams attributes = window.getAttributes();
        float f3 = this.f33241p + f;
        attributes.screenBrightness = f3;
        if (f3 > 1.0f) {
            attributes.screenBrightness = 1.0f;
        } else if (f3 < 0.01f) {
            attributes.screenBrightness = 0.01f;
        }
        C8234a c8234a2 = this.f33229d;
        c8234a2.m16453e(C8231b.app_video_brightness);
        c8234a2.m16449i(((int) (attributes.screenBrightness * 100.0f)) + "%");
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m197E(float f) {
        StringBuilder sb;
        String str;
        C14863e player = this.f33232g.getPlayer();
        long currentPosition = player.getCurrentPosition();
        long duration = player.getDuration();
        long min = ((float) Math.min(100000L, duration - currentPosition)) * f;
        if (m199C()) {
            min *= -1;
        }
        long j = min + currentPosition;
        this.f33234i = j;
        if (j > duration) {
            this.f33234i = duration;
        } else if (j <= 0) {
            this.f33234i = 0L;
            min = -currentPosition;
        }
        int i = ((int) min) / 1000;
        if (i != 0) {
            C8234a c8234a = this.f33229d;
            c8234a.m16453e(C8231b.app_video_fastForward_box);
            c8234a.m16446l();
            if (i > 0) {
                sb = new StringBuilder();
                str = "+";
            } else {
                sb = new StringBuilder();
                str = "";
            }
            sb.append(str);
            sb.append(i);
            String sb2 = sb.toString();
            C8234a c8234a2 = this.f33229d;
            c8234a2.m16453e(C8231b.app_video_fastForward);
            c8234a2.m16449i(sb2 + "s");
            C8234a c8234a3 = this.f33229d;
            c8234a3.m16453e(C8231b.app_video_fastForward_target);
            c8234a3.m16449i(m201A(this.f33234i) + "/");
            C8234a c8234a4 = this.f33229d;
            c8234a4.m16453e(C8231b.app_video_fastForward_all);
            c8234a4.m16449i(m201A(duration));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m196F(float f) {
        if (this.f33239n == -1) {
            int streamVolume = this.f33228c.getStreamVolume(3);
            this.f33239n = streamVolume;
            if (streamVolume < 0) {
                this.f33239n = 0;
            }
        }
        m200B(true);
        int i = this.f33240o;
        int i2 = ((int) (f * i)) + this.f33239n;
        if (i2 <= i) {
            i = i2 < 0 ? 0 : i2;
        }
        this.f33228c.setStreamVolume(3, i, 0);
        double d = i;
        Double.isNaN(d);
        double d2 = this.f33240o;
        Double.isNaN(d2);
        int i3 = (int) (((d * 1.0d) / d2) * 100.0d);
        String str = i3 + "%";
        if (i3 == 0) {
            str = "off";
        }
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_volume_icon);
        c8234a.m16452f(i3 == 0 ? C8230a.ic_volume_off_white_36dp : C8230a.ic_volume_up_white_36dp);
        C8234a c8234a2 = this.f33229d;
        c8234a2.m16453e(C8231b.app_video_brightness_box);
        c8234a2.m16454d();
        C8234a c8234a3 = this.f33229d;
        c8234a3.m16453e(C8231b.app_video_volume_box);
        c8234a3.m16446l();
        C8234a c8234a4 = this.f33229d;
        c8234a4.m16453e(C8231b.app_video_volume_box);
        c8234a4.m16446l();
        C8234a c8234a5 = this.f33229d;
        c8234a5.m16453e(C8231b.app_video_volume);
        c8234a5.m16449i(str);
        c8234a5.m16446l();
    }

    /* renamed from: B */
    protected void m200B(boolean z) {
        if (z || this.f33235j) {
            this.f33231f.removeMessages(1);
            m193I(false);
            C8234a c8234a = this.f33229d;
            c8234a.m16453e(C8231b.app_video_top_box);
            c8234a.m16454d();
            this.f33235j = false;
        }
    }

    /* renamed from: G */
    protected long m195G() {
        long j = 0;
        if (this.f33236k) {
            return 0L;
        }
        if (!this.f33232g.m203d()) {
            this.f33238m.setProgress(0);
            return 0L;
        }
        C14863e player = this.f33232g.getPlayer();
        int m168N = player.m168N();
        if (m168N != 0 && m168N != 1 && m168N != -1) {
            j = player.getCurrentPosition();
            int duration = player.getDuration();
            SeekBar seekBar = this.f33238m;
            if (seekBar != null) {
                if (duration > 0) {
                    seekBar.setProgress((int) ((1000 * j) / duration));
                }
                this.f33238m.setSecondaryProgress(player.getBufferPercentage() * 10);
            }
            C8234a c8234a = this.f33229d;
            c8234a.m16453e(C8231b.app_video_currentTime);
            c8234a.m16449i(m201A(j));
            if (duration == 0) {
                C8234a c8234a2 = this.f33229d;
                c8234a2.m16453e(C8231b.app_video_endTime);
                c8234a2.m16450h(C8233d.giraffe_player_live);
            } else {
                C8234a c8234a3 = this.f33229d;
                c8234a3.m16453e(C8231b.app_video_endTime);
                c8234a3.m16449i(m201A(duration));
            }
        }
        return j;
    }

    /* renamed from: H */
    protected void m194H(int i) {
        if (!this.f33235j) {
            if (!this.f33232g.getVideoInfo().m24o() && this.f33242q != 1) {
                C8234a c8234a = this.f33229d;
                c8234a.m16453e(C8231b.app_video_top_box);
                c8234a.m16454d();
            } else {
                C8234a c8234a2 = this.f33229d;
                c8234a2.m16453e(C8231b.app_video_top_box);
                c8234a2.m16446l();
                C8234a c8234a3 = this.f33229d;
                c8234a3.m16453e(C8231b.app_video_title);
                c8234a3.m16449i(this.f33232g.getVideoInfo().m31h());
            }
            m193I(true);
            this.f33235j = true;
        }
        m191K();
        this.f33231f.sendEmptyMessage(1);
        this.f33231f.removeMessages(2);
        if (i != 0) {
            Handler handler = this.f33231f;
            handler.sendMessageDelayed(handler.obtainMessage(2), i);
        }
    }

    /* renamed from: I */
    protected void m193I(boolean z) {
        if (this.f33242q == 2) {
            z = false;
        }
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_bottom_box);
        c8234a.m16447k(z ? 0 : 8);
    }

    /* renamed from: J */
    protected void m192J(int i) {
        if (i == -1) {
            C8234a c8234a = this.f33229d;
            c8234a.m16453e(C8231b.app_video_status);
            c8234a.m16446l();
            c8234a.m16453e(C8231b.app_video_status_text);
            c8234a.m16450h(C8233d.small_problem);
            this.f33231f.removeMessages(1);
            C8234a c8234a2 = this.f33229d;
            c8234a2.m16453e(C8231b.app_video_loading);
            c8234a2.m16454d();
        } else if (i == 4) {
            this.f33231f.removeMessages(1);
            m193I(false);
            C8234a c8234a3 = this.f33229d;
            c8234a3.m16453e(C8231b.app_video_replay);
            c8234a3.m16446l();
            C8234a c8234a4 = this.f33229d;
            c8234a4.m16453e(C8231b.app_video_loading);
            c8234a4.m16454d();
            C8234a c8234a5 = this.f33229d;
            c8234a5.m16453e(C8231b.app_video_status);
            c8234a5.m16454d();
        } else if (i == 1) {
            C8234a c8234a6 = this.f33229d;
            c8234a6.m16453e(C8231b.app_video_loading);
            c8234a6.m16446l();
            C8234a c8234a7 = this.f33229d;
            c8234a7.m16453e(C8231b.app_video_status);
            c8234a7.m16454d();
        } else if (i != 2) {
        } else {
            C8234a c8234a8 = this.f33229d;
            c8234a8.m16453e(C8231b.app_video_loading);
            c8234a8.m16454d();
            C8234a c8234a9 = this.f33229d;
            c8234a9.m16453e(C8231b.app_video_status);
            c8234a9.m16454d();
        }
    }

    /* renamed from: K */
    protected void m191K() {
        if (this.f33232g.m203d()) {
            if (this.f33232g.getPlayer().isPlaying()) {
                C8234a c8234a = this.f33229d;
                c8234a.m16453e(C8231b.app_video_play);
                c8234a.m16452f(C8230a.ic_stop_white_24dp);
                return;
            }
            C8234a c8234a2 = this.f33229d;
            c8234a2.m16453e(C8231b.app_video_play);
            c8234a2.m16452f(C8230a.ic_play_arrow_white_24dp);
            return;
        }
        C8234a c8234a3 = this.f33229d;
        c8234a3.m16453e(C8231b.app_video_play);
        c8234a3.m16452f(C8230a.ic_play_arrow_white_24dp);
        C8234a c8234a4 = this.f33229d;
        c8234a4.m16453e(C8231b.app_video_currentTime);
        c8234a4.m16449i("");
        C8234a c8234a5 = this.f33229d;
        c8234a5.m16453e(C8231b.app_video_endTime);
        c8234a5.m16449i("");
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: a */
    public boolean mo76a(C14863e c14863e, int i, int i2) {
        m192J(-1);
        return true;
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: b */
    public void mo75b(int i, int i2) {
        if (i2 != 0) {
            C8234a c8234a = this.f33229d;
            c8234a.m16453e(C8231b.app_video_cover);
            c8234a.m16454d();
        }
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: d */
    public void mo73d(C14863e c14863e) {
        C14900m m169M;
        this.f33231f.removeCallbacksAndMessages(null);
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_play);
        c8234a.m16452f(C8230a.ic_play_arrow_white_24dp);
        C8234a c8234a2 = this.f33229d;
        c8234a2.m16453e(C8231b.app_video_currentTime);
        c8234a2.m16449i("");
        C8234a c8234a3 = this.f33229d;
        c8234a3.m16453e(C8231b.app_video_endTime);
        c8234a3.m16449i("");
        C8234a c8234a4 = this.f33229d;
        c8234a4.m16453e(C8231b.app_video_cover);
        c8234a4.m16446l();
        C14906p videoInfo = this.f33232g.getVideoInfo();
        if (!videoInfo.m29j() || c14863e.m168N() == -1 || (m169M = c14863e.m169M()) == null) {
            return;
        }
        C8234a c8234a5 = this.f33229d;
        c8234a5.m16453e(C8231b.app_video_cover);
        ImageView m16451g = c8234a5.m16451g();
        if (m16451g != null) {
            int m37b = videoInfo.m37b();
            if (m37b == 1) {
                m16451g.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else if (m37b == 3) {
                m16451g.setScaleType(ImageView.ScaleType.FIT_XY);
            } else if (m37b == 2) {
                m16451g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                m16451g.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            m16451g.setImageBitmap(m169M.getBitmap());
        }
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: f */
    public void mo71f(C14863e c14863e, String str) {
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_loading);
        c8234a.m16454d();
        C8234a c8234a2 = this.f33229d;
        c8234a2.m16453e(C8231b.app_video_status);
        c8234a2.m16446l();
        C8234a c8234a3 = this.f33229d;
        c8234a3.m16453e(C8231b.app_video_status_text);
        c8234a3.m16449i(this.f33227b.getString(C8233d.giraffe_player_lazy_loading_error, str));
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: g */
    public boolean mo70g(C14863e c14863e, int i, int i2) {
        if (i == 3) {
            m192J(2);
        } else if (i == 701) {
            m192J(1);
        } else if (i == 702) {
            m192J(2);
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            m195G();
            if (!this.f33236k && this.f33235j) {
                this.f33231f.sendMessageDelayed(this.f33231f.obtainMessage(1), 300L);
                m191K();
            }
        } else if (i == 2) {
            m200B(false);
        } else if (i != 3) {
            if (i == 4) {
                C8234a c8234a = this.f33229d;
                c8234a.m16453e(C8231b.app_video_volume_box);
                c8234a.m16454d();
                C8234a c8234a2 = this.f33229d;
                c8234a2.m16453e(C8231b.app_video_brightness_box);
                c8234a2.m16454d();
                C8234a c8234a3 = this.f33229d;
                c8234a3.m16453e(C8231b.app_video_fastForward_box);
                c8234a3.m16454d();
            }
        } else if (this.f33234i >= 0) {
            this.f33232g.getPlayer().seekTo((int) this.f33234i);
            this.f33234i = -1L;
        }
        return true;
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: i */
    public void mo69i(C14863e c14863e, int i) {
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_loading);
        c8234a.m16454d();
        C8234a c8234a2 = this.f33229d;
        c8234a2.m16453e(C8231b.app_video_status);
        c8234a2.m16446l();
        C8234a c8234a3 = this.f33229d;
        c8234a3.m16453e(C8231b.app_video_status_text);
        c8234a3.m16449i(this.f33227b.getString(C8233d.giraffe_player_lazy_loading, Integer.valueOf(i)));
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: j */
    public void mo68j(C14863e c14863e) {
        m192J(1);
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: k */
    public void mo67k(C14863e c14863e) {
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_replay);
        c8234a.m16454d();
        m194H(this.f33230e);
        m192J(2);
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: l */
    public void mo66l(int i, int i2) {
        this.f33242q = i2;
        if (i2 == 2) {
            C8234a c8234a = this.f33229d;
            c8234a.m16453e(C8231b.app_video_float_close);
            c8234a.m16446l();
            C8234a c8234a2 = this.f33229d;
            c8234a2.m16453e(C8231b.app_video_float_full);
            c8234a2.m16446l();
            C8234a c8234a3 = this.f33229d;
            c8234a3.m16453e(C8231b.app_video_bottom_box);
            c8234a3.m16454d();
            return;
        }
        C8234a c8234a4 = this.f33229d;
        c8234a4.m16453e(C8231b.app_video_float_close);
        c8234a4.m16454d();
        C8234a c8234a5 = this.f33229d;
        c8234a5.m16453e(C8231b.app_video_float_full);
        c8234a5.m16454d();
        C8234a c8234a6 = this.f33229d;
        c8234a6.m16453e(C8231b.app_video_bottom_box);
        c8234a6.m16446l();
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: m */
    public void mo65m(C14863e c14863e) {
        m192J(3);
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: n */
    public void mo64n(C14863e c14863e, IjkTimedText ijkTimedText) {
        if (ijkTimedText == null) {
            C8234a c8234a = this.f33229d;
            c8234a.m16453e(C8231b.app_video_subtitle);
            c8234a.m16454d();
            return;
        }
        C8234a c8234a2 = this.f33229d;
        c8234a2.m16453e(C8231b.app_video_subtitle);
        c8234a2.m16446l();
        c8234a2.m16449i(ijkTimedText.getText());
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: o */
    public void mo63o(C14863e c14863e) {
        m192J(4);
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: p */
    public void mo62p(C14863e c14863e) {
        boolean z = c14863e.getDuration() == 0;
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_seekBar);
        c8234a.m16455c(!z);
        if (c14863e.m165Q().length > 0) {
            C8234a c8234a2 = this.f33229d;
            c8234a2.m16453e(C8231b.app_video_clarity);
            c8234a2.m16446l();
            return;
        }
        C8234a c8234a3 = this.f33229d;
        c8234a3.m16453e(C8231b.app_video_clarity);
        c8234a3.m16454d();
    }

    @Override // tcking.github.com.giraffeplayer2.C14862d, tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: q */
    public void mo61q(int i, int i2) {
        if (this.f33227b instanceof Activity) {
            if (i2 == 7) {
                C8234a c8234a = this.f33229d;
                c8234a.m16453e(C8231b.app_video_loading);
                c8234a.m16454d();
                C8234a c8234a2 = this.f33229d;
                c8234a2.m16453e(C8231b.app_video_status);
                c8234a2.m16446l();
                c8234a2.m16453e(C8231b.app_video_status_text);
                c8234a2.m16449i(this.f33227b.getString(C8233d.giraffe_player_lazy_loading, 0));
            }
            if (i2 == 3) {
                ((Activity) this.f33227b).getWindow().addFlags(128);
            } else {
                ((Activity) this.f33227b).getWindow().clearFlags(128);
            }
        }
    }

    @Override // tcking.github.com.giraffeplayer2.AbstractC14855a
    /* renamed from: r */
    protected void mo190r(View view) {
        C8234a c8234a = this.f33229d;
        c8234a.m16453e(C8231b.app_video_seekBar);
        SeekBar seekBar = (SeekBar) c8234a.m16448j();
        this.f33238m = seekBar;
        seekBar.setMax(1000);
        this.f33238m.setOnSeekBarChangeListener(this.f33243r);
        C8234a c8234a2 = this.f33229d;
        c8234a2.m16453e(C8231b.app_video_play);
        c8234a2.m16456b(this.f33244s);
        c8234a2.m16451g().setRotation(m199C() ? 180.0f : 0.0f);
        C8234a c8234a3 = this.f33229d;
        c8234a3.m16453e(C8231b.app_video_fullscreen);
        c8234a3.m16456b(this.f33244s);
        C8234a c8234a4 = this.f33229d;
        c8234a4.m16453e(C8231b.app_video_finish);
        c8234a4.m16456b(this.f33244s);
        c8234a4.m16451g().setRotation(m199C() ? 180.0f : 0.0f);
        C8234a c8234a5 = this.f33229d;
        c8234a5.m16453e(C8231b.app_video_replay_icon);
        c8234a5.m16456b(this.f33244s);
        c8234a5.m16451g().setRotation(m199C() ? 180.0f : 0.0f);
        C8234a c8234a6 = this.f33229d;
        c8234a6.m16453e(C8231b.app_video_clarity);
        c8234a6.m16456b(this.f33244s);
        C8234a c8234a7 = this.f33229d;
        c8234a7.m16453e(C8231b.app_video_float_close);
        c8234a7.m16456b(this.f33244s);
        C8234a c8234a8 = this.f33229d;
        c8234a8.m16453e(C8231b.app_video_float_full);
        c8234a8.m16456b(this.f33244s);
        GestureDetector gestureDetector = new GestureDetector(this.f33227b, m183y());
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setOnTouchListener(new View$OnTouchListenerC14860c(gestureDetector));
    }

    @Override // tcking.github.com.giraffeplayer2.AbstractC14855a
    /* renamed from: s */
    protected View mo189s() {
        return LayoutInflater.from(this.f33227b).inflate(C8232c.giraffe_media_controller, (ViewGroup) this.f33232g, false);
    }

    /* renamed from: y */
    protected GestureDetector.OnGestureListener m183y() {
        return new C14861d();
    }

    /* renamed from: z */
    protected void m182z() {
        this.f33239n = -1;
        this.f33241p = -1.0f;
        if (this.f33234i >= 0) {
            this.f33231f.removeMessages(3);
            this.f33231f.sendEmptyMessage(3);
        }
        this.f33231f.removeMessages(4);
        this.f33231f.sendEmptyMessageDelayed(4, 500L);
    }
}
