package tcking.github.com.giraffeplayer2;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p272h.p275b.p283c.p284a.C8231b;
import p272h.p275b.p283c.p284a.C8232c;
import tv.danmaku.ijk.media.player.AndroidMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
/* compiled from: GiraffePlayer.java */
/* renamed from: tcking.github.com.giraffeplayer2.e */
/* loaded from: classes3.dex */
public class C14863e implements MediaController.MediaPlayerControl {

    /* renamed from: P */
    public static boolean f33254P = false;

    /* renamed from: Q */
    public static boolean f33255Q = false;

    /* renamed from: A */
    private Uri f33256A;

    /* renamed from: B */
    private Map<String, String> f33257B;

    /* renamed from: C */
    private Context f33258C;

    /* renamed from: D */
    private IMediaPlayer f33259D;

    /* renamed from: E */
    private volatile boolean f33260E;

    /* renamed from: F */
    private Handler f33261F;

    /* renamed from: G */
    private Handler f33262G;

    /* renamed from: H */
    private C14898k f33263H;

    /* renamed from: I */
    private volatile int f33264I;

    /* renamed from: J */
    private WeakReference<? extends ViewGroup> f33265J;

    /* renamed from: K */
    private int f33266K;

    /* renamed from: L */
    private int f33267L;

    /* renamed from: M */
    private int f33268M;

    /* renamed from: N */
    private C14906p f33269N;

    /* renamed from: O */
    private WeakReference<? extends ViewGroup> f33270O;

    /* renamed from: c */
    private final HandlerThread f33271c;

    /* renamed from: d */
    private int f33272d;

    /* renamed from: e */
    private boolean f33273e;

    /* renamed from: f */
    private boolean f33274f;

    /* renamed from: w */
    private boolean f33275w;

    /* renamed from: x */
    private int f33276x;

    /* renamed from: y */
    private int f33277y;

    /* renamed from: z */
    private int f33278z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$a */
    /* loaded from: classes3.dex */
    public class C14864a implements IMediaPlayer.OnErrorListener {
        C14864a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            C14863e.this.m176F(-1);
            boolean mo76a = C14863e.this.m144f0().mo76a(C14863e.this, i, i2);
            int m32g = C14863e.this.f33269N.m32g();
            if (m32g > 0) {
                C14863e c14863e = C14863e.this;
                c14863e.m156Z("replay delay " + m32g + " seconds");
                C14863e.this.f33261F.sendEmptyMessageDelayed(5, (long) (m32g * 1000));
            }
            return mo76a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$b */
    /* loaded from: classes3.dex */
    public class C14865b implements IMediaPlayer.OnSeekCompleteListener {
        C14865b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            C14863e.this.m144f0().mo74c(C14863e.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$c */
    /* loaded from: classes3.dex */
    public class C14866c implements IMediaPlayer.OnVideoSizeChangedListener {
        C14866c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            C14900m m169M;
            if (C14863e.f33254P) {
                C14863e c14863e = C14863e.this;
                c14863e.m156Z("onVideoSizeChanged:width:" + i + ",height:" + i2);
            }
            int videoWidth = iMediaPlayer.getVideoWidth();
            int videoHeight = iMediaPlayer.getVideoHeight();
            if (videoWidth == 0 || videoHeight == 0 || (m169M = C14863e.this.m169M()) == null || !(m169M instanceof InterfaceC14899l)) {
                return;
            }
            m169M.mo57a(videoWidth, videoHeight);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$d */
    /* loaded from: classes3.dex */
    public class C14867d implements IMediaPlayer.OnTimedTextListener {
        C14867d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            C14863e.this.m144f0().mo64n(C14863e.this, ijkTimedText);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$e */
    /* loaded from: classes3.dex */
    public class TextureView$SurfaceTextureListenerC14868e implements TextureView.SurfaceTextureListener {

        /* renamed from: a */
        private SurfaceTexture f33283a;

        /* renamed from: b */
        final /* synthetic */ TextureView f33284b;

        TextureView$SurfaceTextureListenerC14868e(TextureView textureView) {
            this.f33284b = textureView;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C14863e.this.m156Z("onSurfaceTextureAvailable");
            SurfaceTexture surfaceTexture2 = this.f33283a;
            if (surfaceTexture2 == null) {
                C14863e.this.f33261F.obtainMessage(12, surfaceTexture).sendToTarget();
                this.f33283a = surfaceTexture;
                return;
            }
            this.f33284b.setSurfaceTexture(surfaceTexture2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C14863e.this.m156Z("onSurfaceTextureDestroyed");
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$f */
    /* loaded from: classes3.dex */
    public class RunnableC14869f implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ViewGroup f33286c;

        RunnableC14869f(ViewGroup viewGroup) {
            this.f33286c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            C14863e.this.m174H(this.f33286c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$g */
    /* loaded from: classes3.dex */
    public class RunnableC14870g implements Runnable {
        RunnableC14870g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C14863e.this.m171K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$h */
    /* loaded from: classes3.dex */
    public class C14871h extends C14889x {
        C14871h() {
            super(C14863e.this);
        }

        @Override // tcking.github.com.giraffeplayer2.C14863e.C14889x
        /* renamed from: a */
        public void mo110a(ViewGroup viewGroup, ViewGroup viewGroup2) {
            C14863e.this.m144f0().mo66l(C14863e.this.f33267L, 1);
            C14863e.this.f33267L = 1;
        }

        @Override // tcking.github.com.giraffeplayer2.C14863e.C14889x
        /* renamed from: b */
        public void mo109b(ViewGroup viewGroup, ViewGroup viewGroup2) {
            C14863e.this.m136j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$i */
    /* loaded from: classes3.dex */
    public class C14872i extends C14889x {
        C14872i() {
            super(C14863e.this);
        }

        @Override // tcking.github.com.giraffeplayer2.C14863e.C14889x
        /* renamed from: a */
        public void mo110a(ViewGroup viewGroup, ViewGroup viewGroup2) {
            C14863e.this.m144f0().mo66l(C14863e.this.f33267L, 0);
            C14863e.this.f33267L = 0;
        }

        @Override // tcking.github.com.giraffeplayer2.C14863e.C14889x
        /* renamed from: b */
        public void mo109b(ViewGroup viewGroup, ViewGroup viewGroup2) {
            C14863e.this.m136j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$j */
    /* loaded from: classes3.dex */
    public class C14873j extends C14889x {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f33291a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14873j(ViewGroup viewGroup) {
            super(C14863e.this);
            this.f33291a = viewGroup;
        }

        @Override // tcking.github.com.giraffeplayer2.C14863e.C14889x
        /* renamed from: a */
        void mo110a(ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f33291a.setVisibility(0);
            C14863e.this.m144f0().mo66l(C14863e.this.f33267L, 2);
            C14863e.this.f33267L = 2;
        }
    }

    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$k */
    /* loaded from: classes3.dex */
    class C14874k implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ Context f33293a;

        /* renamed from: b */
        final /* synthetic */ C14906p f33294b;

        C14874k(Context context, C14906p c14906p) {
            this.f33293a = context;
            this.f33294b = c14906p;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C14863e c14863e = C14863e.this;
            c14863e.m156Z("handleMessage:" + message.what);
            if (message.what == 4) {
                if (!C14863e.this.f33260E) {
                    C14863e.this.f33261F.removeCallbacks(null);
                    C14863e.this.m176F(6);
                    C14863e.this.m172J((String) message.obj);
                }
                return true;
            } else if (C14863e.this.f33259D == null || C14863e.this.f33260E) {
                C14863e.this.f33261F.removeCallbacks(null);
                try {
                    C14863e.this.m163S(true);
                    C14863e.this.f33261F.sendMessage(Message.obtain(message));
                } catch (UnsatisfiedLinkError e) {
                    C14863e c14863e2 = C14863e.this;
                    c14863e2.m156Z("UnsatisfiedLinkError:" + e);
                    C14863e.this.m176F(7);
                    LazyLoadManager.m217a(this.f33293a, this.f33294b.m35d(), Message.obtain(message));
                }
                return true;
            } else {
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        C14863e.this.f33259D.pause();
                        C14863e.this.m176F(4);
                    } else if (i != 3) {
                        if (i == 5) {
                            C14863e.this.m163S(false);
                            C14863e.this.f33261F.sendEmptyMessage(1);
                        } else if (i == 6) {
                            int intValue = ((Integer) message.obj).intValue();
                            if (C14863e.this.f33259D instanceof IjkMediaPlayer) {
                                ((IjkMediaPlayer) C14863e.this.f33259D).selectTrack(intValue);
                            } else if (C14863e.this.f33259D instanceof AndroidMediaPlayer) {
                                ((AndroidMediaPlayer) C14863e.this.f33259D).getInternalMediaPlayer().selectTrack(intValue);
                            }
                        } else if (i == 7) {
                            int intValue2 = ((Integer) message.obj).intValue();
                            if (C14863e.this.f33259D instanceof IjkMediaPlayer) {
                                ((IjkMediaPlayer) C14863e.this.f33259D).deselectTrack(intValue2);
                            } else if (C14863e.this.f33259D instanceof AndroidMediaPlayer) {
                                ((AndroidMediaPlayer) C14863e.this.f33259D).getInternalMediaPlayer().deselectTrack(intValue2);
                            }
                        } else if (i == 8) {
                            Map map = (Map) message.obj;
                            C14863e.this.f33259D.setVolume(((Float) map.get("left")).floatValue(), ((Float) map.get("right")).floatValue());
                        } else if (i == 12) {
                            Object obj = message.obj;
                            if (obj == null) {
                                C14863e.this.f33259D.setDisplay(null);
                            } else if (obj instanceof SurfaceTexture) {
                                C14863e.this.f33259D.setSurface(new Surface((SurfaceTexture) message.obj));
                            } else if (obj instanceof SurfaceView) {
                                C14863e.this.f33259D.setDisplay(((SurfaceView) message.obj).getHolder());
                            }
                        }
                    } else if (C14863e.this.f33275w) {
                        C14863e.this.f33259D.seekTo(((Integer) message.obj).intValue());
                    }
                } else if (C14863e.this.f33277y == -1) {
                    C14863e.this.f33261F.sendEmptyMessage(5);
                } else if (C14863e.this.m161U()) {
                    if (C14863e.this.f33275w) {
                        if (C14863e.this.f33277y == 5) {
                            C14863e.this.f33264I = 0;
                        }
                        if (C14863e.this.f33264I >= 0) {
                            C14863e.this.f33259D.seekTo(C14863e.this.f33264I);
                            C14863e.this.f33264I = -1;
                        }
                    }
                    C14863e.this.f33259D.start();
                    C14863e.this.m176F(3);
                }
                return true;
            }
        }
    }

    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$l */
    /* loaded from: classes3.dex */
    class RunnableC14875l implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f33296c;

        RunnableC14875l(int i) {
            this.f33296c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C14863e.this.m144f0().mo69i(C14863e.this, this.f33296c);
        }
    }

    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$m */
    /* loaded from: classes3.dex */
    class RunnableC14876m implements Runnable {

        /* renamed from: c */
        final /* synthetic */ String f33298c;

        RunnableC14876m(String str) {
            this.f33298c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C14863e.this.m144f0().mo71f(C14863e.this, this.f33298c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$n */
    /* loaded from: classes3.dex */
    public class RunnableC14877n implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Activity f33300c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f33301d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f33302e;

        /* renamed from: f */
        final /* synthetic */ C14889x f33303f;

        /* compiled from: GiraffePlayer.java */
        /* renamed from: tcking.github.com.giraffeplayer2.e$n$a */
        /* loaded from: classes3.dex */
        class C14878a implements Transition.TransitionListener {
            C14878a() {
            }

            /* renamed from: a */
            private void m111a() {
                ViewParent parent = RunnableC14877n.this.f33301d.getParent();
                RunnableC14877n runnableC14877n = RunnableC14877n.this;
                if (parent != runnableC14877n.f33302e) {
                    C14863e.this.m159W();
                    RunnableC14877n runnableC14877n2 = RunnableC14877n.this;
                    runnableC14877n2.f33302e.addView(runnableC14877n2.f33301d, new FrameLayout.LayoutParams(-1, -1));
                }
                RunnableC14877n runnableC14877n3 = RunnableC14877n.this;
                runnableC14877n3.f33303f.mo110a(runnableC14877n3.f33301d, runnableC14877n3.f33302e);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
                m111a();
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                m111a();
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }
        }

        /* compiled from: GiraffePlayer.java */
        /* renamed from: tcking.github.com.giraffeplayer2.e$n$b */
        /* loaded from: classes3.dex */
        class RunnableC14879b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Transition f33306c;

            /* renamed from: d */
            final /* synthetic */ FrameLayout.LayoutParams f33307d;

            RunnableC14879b(Transition transition, FrameLayout.LayoutParams layoutParams) {
                this.f33306c = transition;
                this.f33307d = layoutParams;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC14877n runnableC14877n = RunnableC14877n.this;
                runnableC14877n.f33303f.mo109b(runnableC14877n.f33301d, runnableC14877n.f33302e);
                TransitionManager.beginDelayedTransition(RunnableC14877n.this.f33301d, this.f33306c);
                RunnableC14877n.this.f33301d.setLayoutParams(this.f33307d);
            }
        }

        RunnableC14877n(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2, C14889x c14889x) {
            this.f33300c = activity;
            this.f33301d = viewGroup;
            this.f33302e = viewGroup2;
            this.f33303f = c14889x;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup = (ViewGroup) this.f33300c.findViewById(16908290);
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            viewGroup.getLocationInWindow(iArr2);
            if (this.f33301d.getParent() != viewGroup) {
                int[] iArr3 = {0, 0};
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f33301d.getWidth(), this.f33301d.getHeight());
                this.f33301d.getLocationInWindow(iArr3);
                layoutParams.leftMargin = iArr3[0] - iArr2[0];
                layoutParams.topMargin = iArr3[1] - iArr2[1];
                C14863e.this.m159W();
                viewGroup.addView(this.f33301d, layoutParams);
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f33302e.getLayoutParams());
            this.f33302e.getLocationInWindow(iArr);
            layoutParams2.leftMargin = iArr[0] - iArr2[0];
            layoutParams2.topMargin = iArr[1] - iArr2[1];
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setStartDelay(200L);
            changeBounds.addListener(new C14878a());
            C14863e.this.f33262G.post(new RunnableC14879b(changeBounds, layoutParams2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$o */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC14880o implements View.OnTouchListener {

        /* renamed from: c */
        float f33309c;

        /* renamed from: d */
        float f33310d;

        /* renamed from: e */
        float f33311e;

        /* renamed from: f */
        float f33312f;

        View$OnTouchListenerC14880o(C14863e c14863e) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 2) {
                    return true;
                }
                view.setTranslationY((this.f33310d + motionEvent.getRawY()) - this.f33309c);
                view.setTranslationX((this.f33312f + motionEvent.getRawX()) - this.f33311e);
                return true;
            }
            this.f33309c = motionEvent.getRawY();
            this.f33310d = view.getTranslationY();
            this.f33311e = motionEvent.getRawX();
            this.f33312f = view.getTranslationX();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$p */
    /* loaded from: classes3.dex */
    public class RunnableC14881p implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f33313c;

        /* renamed from: d */
        final /* synthetic */ int f33314d;

        RunnableC14881p(int i, int i2) {
            this.f33313c = i;
            this.f33314d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C14863e.this.m144f0().mo75b(this.f33313c, this.f33314d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$q */
    /* loaded from: classes3.dex */
    public class RunnableC14882q implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f33316c;

        /* renamed from: d */
        final /* synthetic */ int f33317d;

        RunnableC14882q(int i, int i2) {
            this.f33316c = i;
            this.f33317d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C14863e.this.m144f0().mo61q(this.f33316c, this.f33317d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$r */
    /* loaded from: classes3.dex */
    public class RunnableC14883r implements Runnable {
        RunnableC14883r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C14863e.this.m144f0().mo68j(C14863e.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$s */
    /* loaded from: classes3.dex */
    public class C14884s implements IMediaPlayer.OnPreparedListener {
        C14884s() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            boolean z = C14863e.this.f33259D.getDuration() == 0;
            C14863e.this.f33274f = !z;
            C14863e.this.f33275w = !z;
            C14863e.this.m176F(2);
            C14863e.this.m144f0().mo62p(C14863e.this);
            if (C14863e.this.f33278z == 3) {
                C14863e.this.f33261F.sendEmptyMessage(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$t */
    /* loaded from: classes3.dex */
    public class RunnableC14885t implements Runnable {
        RunnableC14885t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C14863e.this.m144f0().mo76a(C14863e.this, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$u */
    /* loaded from: classes3.dex */
    public class C14886u implements IMediaPlayer.OnBufferingUpdateListener {
        C14886u() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            C14863e.this.f33272d = i;
            C14863e.this.m144f0().mo72e(C14863e.this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$v */
    /* loaded from: classes3.dex */
    public class C14887v implements IMediaPlayer.OnInfoListener {
        C14887v() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            C14900m m169M;
            if (i == 10001 && (m169M = C14863e.this.m169M()) != null) {
                m169M.setRotation(i2);
            }
            return C14863e.this.m144f0().mo70g(C14863e.this, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$w */
    /* loaded from: classes3.dex */
    public class C14888w implements IMediaPlayer.OnCompletionListener {
        C14888w() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            C14863e.this.m176F(5);
            C14863e.this.m144f0().mo63o(C14863e.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiraffePlayer.java */
    /* renamed from: tcking.github.com.giraffeplayer2.e$x */
    /* loaded from: classes3.dex */
    public class C14889x {
        C14889x(C14863e c14863e) {
        }

        /* renamed from: a */
        void mo110a(ViewGroup viewGroup, ViewGroup viewGroup2) {
            throw null;
        }

        /* renamed from: b */
        void mo109b(ViewGroup viewGroup, ViewGroup viewGroup2) {
        }
    }

    private C14863e(Context context, C14906p c14906p) {
        new IntentFilter("tcking.github.com.giraffeplayer2.action");
        this.f33272d = 0;
        this.f33273e = true;
        this.f33274f = true;
        this.f33275w = true;
        this.f33277y = 0;
        this.f33278z = 0;
        this.f33262G = new Handler(Looper.getMainLooper());
        this.f33264I = -1;
        this.f33266K = -100;
        this.f33267L = 0;
        this.f33268M = 0;
        this.f33258C = context.getApplicationContext();
        this.f33269N = c14906p;
        m156Z("new GiraffePlayer");
        VideoView m87l = C14894j.m92g().m87l(c14906p);
        WeakReference<? extends ViewGroup> weakReference = new WeakReference<>(m87l != null ? m87l.getContainer() : null);
        this.f33270O = weakReference;
        if (weakReference.get() != null) {
            this.f33270O.get().setBackgroundColor(c14906p.m36c());
        }
        this.f33263H = new C14898k(c14906p);
        HandlerThread handlerThread = new HandlerThread("GiraffePlayerInternal:Handler", -16);
        this.f33271c = handlerThread;
        handlerThread.start();
        this.f33261F = new Handler(this.f33271c.getLooper(), new C14874k(context, c14906p));
        C14894j.m92g().m78u(this);
    }

    /* renamed from: A */
    private C14863e m181A(TextureView textureView) {
        textureView.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC14868e(textureView));
        return this;
    }

    /* renamed from: C */
    private ViewGroup m179C() {
        m136j0();
        Activity m88k = C14894j.m92g().m88k();
        ViewGroup viewGroup = (ViewGroup) m88k.findViewById(16908290);
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(m88k.getApplication()).inflate(C8232c.giraffe_float_box, (ViewGroup) null);
        viewGroup2.setBackgroundColor(this.f33269N.m36c());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C14906p.f33350I, C14906p.f33351J);
        if (C14906p.f33352K != 2.14748365E9f && C14906p.f33353L != 2.14748365E9f) {
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = (int) C14906p.f33352K;
            layoutParams.topMargin = (int) C14906p.f33353L;
        } else {
            layoutParams.gravity = 8388693;
            layoutParams.bottomMargin = 20;
            layoutParams.rightMargin = 20;
        }
        viewGroup.addView(viewGroup2, layoutParams);
        viewGroup2.setOnTouchListener(new View$OnTouchListenerC14880o(this));
        return viewGroup2;
    }

    /* renamed from: D */
    private IMediaPlayer m178D() {
        if ("system".equals(this.f33269N.m33f())) {
            return new AndroidMediaPlayer();
        }
        return new IjkMediaPlayer(Looper.getMainLooper());
    }

    /* renamed from: E */
    public static C14863e m177E(Context context, C14906p c14906p) {
        return new C14863e(context, c14906p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m176F(int i) {
        int i2 = this.f33277y;
        this.f33277y = i;
        if (i2 != i) {
            this.f33262G.post(new RunnableC14882q(i2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m174H(ViewGroup viewGroup) {
        m156Z("doCreateDisplay");
        m160V();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(C8231b.player_display_box);
        frameLayout.setBackgroundColor(this.f33269N.m36c());
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        C14900m c14900m = new C14900m(viewGroup.getContext());
        c14900m.setAspectRatio(this.f33269N.m37b());
        c14900m.setId(C8231b.player_display);
        frameLayout.addView(c14900m, new FrameLayout.LayoutParams(-2, -2, 17));
        viewGroup.addView(frameLayout, 0, layoutParams);
        m181A(c14900m);
        this.f33265J = new WeakReference<>(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m172J(String str) {
        if (this.f33260E) {
            return;
        }
        m156Z("doRelease");
        C14894j.m92g().m79t(str);
        this.f33271c.quit();
        m140h0();
        m138i0();
        this.f33260E = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m171K() {
        m156Z("doReleaseDisplayBox");
        C14900m m169M = m169M();
        if (m169M != null) {
            m169M.setSurfaceTextureListener(null);
        }
        m160V();
    }

    /* renamed from: L */
    private Activity m170L() {
        VideoView m87l = C14894j.m92g().m87l(this.f33269N);
        if (m87l != null) {
            return (Activity) m87l.getContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m163S(boolean z) {
        VideoView m87l;
        m156Z("init createDisplay:" + z);
        this.f33262G.post(new RunnableC14883r());
        m138i0();
        IMediaPlayer m178D = m178D();
        this.f33259D = m178D;
        if (m178D instanceof IjkMediaPlayer) {
            IjkMediaPlayer.native_setLogLevel(f33255Q ? 3 : 6);
        }
        m128n0();
        this.f33260E = false;
        this.f33259D.setAudioStreamType(3);
        this.f33259D.setLooping(this.f33269N.m26m());
        this.f33259D.setOnPreparedListener(new C14884s());
        m162T();
        if (z && (m87l = C14894j.m92g().m87l(this.f33269N)) != null && m87l.getContainer() != null) {
            m180B(m87l.getContainer());
        }
        try {
            Uri m30i = this.f33269N.m30i();
            this.f33256A = m30i;
            this.f33259D.setDataSource(this.f33258C, m30i, this.f33257B);
            m176F(1);
            this.f33259D.prepareAsync();
        } catch (IOException e) {
            m176F(-1);
            e.printStackTrace();
            this.f33262G.post(new RunnableC14885t());
        }
    }

    /* renamed from: T */
    private void m162T() {
        this.f33259D.setOnBufferingUpdateListener(new C14886u());
        this.f33259D.setOnInfoListener(new C14887v());
        this.f33259D.setOnCompletionListener(new C14888w());
        this.f33259D.setOnErrorListener(new C14864a());
        this.f33259D.setOnSeekCompleteListener(new C14865b());
        this.f33259D.setOnVideoSizeChangedListener(new C14866c());
        this.f33259D.setOnTimedTextListener(new C14867d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public boolean m161U() {
        int i;
        return (this.f33259D == null || (i = this.f33277y) == -1 || i == 0 || i == 1) ? false : true;
    }

    /* renamed from: V */
    private C14863e m160V() {
        WeakReference<? extends ViewGroup> weakReference = this.f33265J;
        if (weakReference != null) {
            m134k0(weakReference.get());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public C14863e m159W() {
        WeakReference<? extends ViewGroup> weakReference = this.f33270O;
        if (weakReference != null) {
            m134k0(weakReference.get());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m156Z(String str) {
        if (f33254P) {
            Log.d("GiraffePlayer", String.format("[fingerprint:%s] %s", this.f33269N.m35d(), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public C14898k m144f0() {
        return this.f33263H;
    }

    /* renamed from: h0 */
    private void m140h0() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m171K();
        } else {
            this.f33262G.post(new RunnableC14870g());
        }
    }

    /* renamed from: i0 */
    private void m138i0() {
        if (this.f33259D != null) {
            m156Z("releaseMediaPlayer");
            this.f33259D.release();
            this.f33259D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m136j0() {
        Activity m170L = m170L();
        if (m170L != null) {
            View findViewById = m170L.findViewById(C8231b.player_display_float_box);
            if (findViewById != null) {
                C14906p.f33352K = findViewById.getX();
                C14906p.f33353L = findViewById.getY();
            }
            m134k0(findViewById);
        }
    }

    /* renamed from: k0 */
    private void m134k0(View view) {
        ViewParent parent;
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).removeView(view);
    }

    /* renamed from: n0 */
    private void m128n0() {
        if (!(this.f33259D instanceof IjkMediaPlayer) || this.f33269N.m34e().size() <= 0) {
            return;
        }
        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) this.f33259D;
        Iterator<C14892h> it = this.f33269N.m34e().iterator();
        while (it.hasNext()) {
            C14892h next = it.next();
            if (next.m99d() instanceof String) {
                ijkMediaPlayer.setOption(next.m101b(), next.m100c(), (String) next.m99d());
            } else if (next.m99d() instanceof Long) {
                ijkMediaPlayer.setOption(next.m101b(), next.m100c(), ((Long) next.m99d()).longValue());
            }
        }
    }

    /* renamed from: p0 */
    private void m124p0(int i) {
        int i2 = this.f33278z;
        this.f33278z = i;
        if (i2 != i) {
            this.f33262G.post(new RunnableC14881p(i2, i));
        }
    }

    /* renamed from: r0 */
    private boolean m120r0() {
        return this.f33269N.m28k() && !this.f33269N.m25n() && Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: z */
    private void m112z(ViewGroup viewGroup, C14889x c14889x) {
        ViewGroup viewGroup2 = this.f33270O.get();
        if (!m120r0()) {
            c14889x.mo109b(viewGroup2, viewGroup);
            if (viewGroup2.getParent() != viewGroup) {
                m159W();
                viewGroup.addView(viewGroup2, new FrameLayout.LayoutParams(-1, -1));
            }
            c14889x.mo110a(viewGroup2, viewGroup);
            return;
        }
        Activity m170L = m170L();
        if (m170L == null) {
            return;
        }
        this.f33262G.post(new RunnableC14877n(m170L, viewGroup2, viewGroup, c14889x));
    }

    /* renamed from: B */
    public C14863e m180B(ViewGroup viewGroup) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f33262G.post(new RunnableC14869f(viewGroup));
        } else {
            m174H(viewGroup);
        }
        return this;
    }

    /* renamed from: G */
    public C14863e m175G(int i) {
        if (this.f33259D != null && !this.f33260E) {
            this.f33261F.removeMessages(7);
            this.f33261F.obtainMessage(7, Integer.valueOf(i)).sendToTarget();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public C14863e m173I(Message message) {
        this.f33261F.sendMessage(message);
        return this;
    }

    /* renamed from: M */
    public C14900m m169M() {
        ViewGroup viewGroup;
        WeakReference<? extends ViewGroup> weakReference = this.f33265J;
        if (weakReference == null || (viewGroup = weakReference.get()) == null) {
            return null;
        }
        return (C14900m) viewGroup.findViewById(C8231b.player_display);
    }

    /* renamed from: N */
    public int m168N() {
        return this.f33277y;
    }

    /* renamed from: O */
    public InterfaceC14893i m167O() {
        return this.f33263H;
    }

    /* renamed from: P */
    public int m166P(int i) {
        if (this.f33259D != null && !this.f33260E) {
            IMediaPlayer iMediaPlayer = this.f33259D;
            if (iMediaPlayer instanceof IjkMediaPlayer) {
                return ((IjkMediaPlayer) iMediaPlayer).getSelectedTrack(i);
            }
            if ((iMediaPlayer instanceof AndroidMediaPlayer) && Build.VERSION.SDK_INT >= 21) {
                return ((AndroidMediaPlayer) iMediaPlayer).getInternalMediaPlayer().getSelectedTrack(i);
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public ITrackInfo[] m165Q() {
        return (this.f33259D == null || this.f33260E) ? new ITrackInfo[0] : this.f33259D.getTrackInfo();
    }

    /* renamed from: R */
    public C14906p m164R() {
        return this.f33269N;
    }

    /* renamed from: X */
    public void m158X(String str) {
        this.f33262G.post(new RunnableC14876m(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m157Y(int i) {
        this.f33262G.post(new RunnableC14875l(i));
    }

    /* renamed from: a0 */
    public void m154a0() {
        m156Z("onActivityDestroyed");
        m142g0();
    }

    /* renamed from: b0 */
    public void m152b0() {
        int i;
        m156Z("onActivityPaused");
        if (this.f33259D == null) {
            return;
        }
        int i2 = this.f33278z;
        if (i2 == 3 || (i = this.f33277y) == 3 || i2 == 4 || i == 4) {
            this.f33264I = (int) this.f33259D.getCurrentPosition();
            m138i0();
        }
    }

    /* renamed from: c0 */
    public void m150c0() {
        m156Z("onActivityResumed");
        int i = this.f33278z;
        if (i == 3) {
            start();
        } else if (i == 4 && this.f33275w && this.f33264I >= 0) {
            seekTo(this.f33264I);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f33273e;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f33274f;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f33275w;
    }

    /* renamed from: d0 */
    public boolean m148d0() {
        m156Z("onBackPressed");
        if (!this.f33269N.m27l() && this.f33267L == 1) {
            m130m0(this.f33268M);
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public C14863e m146e0(Configuration configuration) {
        m156Z("onConfigurationChanged");
        if (this.f33266K == configuration.orientation) {
            m156Z("onConfigurationChanged ignore");
            return this;
        }
        if (this.f33269N.m25n()) {
            if (configuration.orientation == 1) {
                m130m0(this.f33268M);
            } else {
                m130m0(1);
            }
        }
        return this;
    }

    /* renamed from: g0 */
    public void m142g0() {
        m156Z("try release");
        String m35d = this.f33269N.m35d();
        C14894j.m92g().m79t(m35d);
        m144f0().mo73d(this);
        this.f33261F.obtainMessage(4, m35d).sendToTarget();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f33276x == 0) {
            this.f33276x = this.f33259D.getAudioSessionId();
        }
        return this.f33276x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return this.f33272d;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        IMediaPlayer iMediaPlayer = this.f33259D;
        if (iMediaPlayer == null) {
            return 0;
        }
        return (int) iMediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        IMediaPlayer iMediaPlayer = this.f33259D;
        if (iMediaPlayer == null) {
            return 0;
        }
        return (int) iMediaPlayer.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f33277y == 3;
    }

    /* renamed from: l0 */
    public C14863e m132l0(int i) {
        if (this.f33259D != null && !this.f33260E) {
            this.f33261F.removeMessages(6);
            this.f33261F.obtainMessage(6, Integer.valueOf(i)).sendToTarget();
        }
        return this;
    }

    /* renamed from: m0 */
    public C14863e m130m0(int i) {
        WeakReference<? extends ViewGroup> weakReference;
        Activity m170L;
        VideoView m87l;
        if (i != this.f33267L && (weakReference = this.f33270O) != null && weakReference.get() != null) {
            this.f33268M = this.f33267L;
            if (i == 1) {
                Activity m170L2 = m170L();
                if (m170L2 == null) {
                    return this;
                }
                C14905o m39d = C14905o.m39d(m170L2);
                if (this.f33269N.m25n()) {
                    m39d.m41b(0);
                    this.f33266K = 0;
                }
                m39d.m40c(false);
                m39d.m42a(true);
                m112z((ViewGroup) m170L2.findViewById(16908290), new C14871h());
            } else if (i == 0) {
                Activity m170L3 = m170L();
                if (m170L3 == null || (m87l = C14894j.m92g().m87l(this.f33269N)) == null) {
                    return this;
                }
                C14905o m39d2 = C14905o.m39d(m170L3);
                if (this.f33269N.m25n()) {
                    m39d2.m41b(1);
                    this.f33266K = 1;
                }
                m39d2.m40c(true);
                m39d2.m42a(false);
                m112z(m87l, new C14872i());
            } else if (i != 2 || (m170L = m170L()) == null) {
                return this;
            } else {
                C14905o m39d3 = C14905o.m39d(m170L);
                if (this.f33269N.m25n()) {
                    m39d3.m41b(1);
                    this.f33266K = 1;
                }
                m39d3.m40c(true);
                m39d3.m42a(false);
                ViewGroup m179C = m179C();
                m179C.setVisibility(4);
                m112z(m179C, new C14873j(m179C));
            }
        }
        return this;
    }

    /* renamed from: o0 */
    public void m126o0() {
        m142g0();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        m124p0(4);
        this.f33261F.sendEmptyMessage(2);
        m144f0().mo65m(this);
    }

    /* renamed from: q0 */
    public C14863e m122q0() {
        if (this.f33267L == 0) {
            m130m0(1);
        } else {
            m130m0(0);
        }
        return this;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        this.f33261F.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (this.f33277y == 5 && !this.f33275w) {
            m138i0();
        }
        m124p0(3);
        this.f33261F.sendEmptyMessage(1);
        m144f0().mo67k(this);
    }
}
