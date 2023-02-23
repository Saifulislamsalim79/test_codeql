package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.p603l.InterfaceC14758a;
/* compiled from: GifDrawable.java */
/* renamed from: pl.droidsonroids.gif.b */
/* loaded from: classes3.dex */
public class C14741b extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: A */
    private ColorStateList f32962A;

    /* renamed from: B */
    private PorterDuffColorFilter f32963B;

    /* renamed from: C */
    private PorterDuff.Mode f32964C;

    /* renamed from: D */
    final boolean f32965D;

    /* renamed from: E */
    final HandlerC14753g f32966E;

    /* renamed from: F */
    private final C14756j f32967F;

    /* renamed from: G */
    private final Rect f32968G;

    /* renamed from: H */
    ScheduledFuture<?> f32969H;

    /* renamed from: I */
    private int f32970I;

    /* renamed from: J */
    private int f32971J;

    /* renamed from: K */
    private InterfaceC14758a f32972K;

    /* renamed from: c */
    final ScheduledThreadPoolExecutor f32973c;

    /* renamed from: d */
    volatile boolean f32974d;

    /* renamed from: e */
    long f32975e;

    /* renamed from: f */
    private final Rect f32976f;

    /* renamed from: w */
    protected final Paint f32977w;

    /* renamed from: x */
    final Bitmap f32978x;

    /* renamed from: y */
    final GifInfoHandle f32979y;

    /* renamed from: z */
    final ConcurrentLinkedQueue<InterfaceC14740a> f32980z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifDrawable.java */
    /* renamed from: pl.droidsonroids.gif.b$a */
    /* loaded from: classes3.dex */
    public class C14742a extends AbstractRunnableC14757k {
        C14742a(C14741b c14741b) {
            super(c14741b);
        }

        @Override // pl.droidsonroids.gif.AbstractRunnableC14757k
        /* renamed from: a */
        public void mo392a() {
            if (C14741b.this.f32979y.m425r()) {
                C14741b.this.start();
            }
        }
    }

    /* compiled from: GifDrawable.java */
    /* renamed from: pl.droidsonroids.gif.b$b */
    /* loaded from: classes3.dex */
    class C14743b extends AbstractRunnableC14757k {

        /* renamed from: d */
        final /* synthetic */ int f32982d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14743b(C14741b c14741b, int i) {
            super(c14741b);
            this.f32982d = i;
        }

        @Override // pl.droidsonroids.gif.AbstractRunnableC14757k
        /* renamed from: a */
        public void mo392a() {
            C14741b c14741b = C14741b.this;
            c14741b.f32979y.m421v(this.f32982d, c14741b.f32978x);
            this.f33017c.f32966E.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public C14741b(Resources resources, int i) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i));
        float m399b = C14750f.m399b(resources, i);
        this.f32971J = (int) (this.f32979y.m438e() * m399b);
        this.f32970I = (int) (this.f32979y.m432k() * m399b);
    }

    /* renamed from: a */
    private void m418a() {
        ScheduledFuture<?> scheduledFuture = this.f32969H;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f32966E.removeMessages(-1);
    }

    /* renamed from: g */
    private void m412g() {
        if (this.f32965D && this.f32974d) {
            long j = this.f32975e;
            if (j != Long.MIN_VALUE) {
                long max = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f32975e = Long.MIN_VALUE;
                this.f32973c.remove(this.f32967F);
                this.f32969H = this.f32973c.schedule(this.f32967F, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: i */
    private void m410i() {
        this.f32974d = false;
        this.f32966E.removeMessages(-1);
        this.f32979y.m427p();
    }

    /* renamed from: k */
    private PorterDuffColorFilter m408k(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public int m417b() {
        return this.f32979y.m442a();
    }

    /* renamed from: c */
    public int m416c() {
        int m441b = this.f32979y.m441b();
        return (m441b == 0 || m441b < this.f32979y.m437f()) ? m441b : m441b - 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return m415d() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return m415d() > 1;
    }

    /* renamed from: d */
    public int m415d() {
        return this.f32979y.m434i();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        if (this.f32963B == null || this.f32977w.getColorFilter() != null) {
            z = false;
        } else {
            this.f32977w.setColorFilter(this.f32963B);
            z = true;
        }
        InterfaceC14758a interfaceC14758a = this.f32972K;
        if (interfaceC14758a == null) {
            canvas.drawBitmap(this.f32978x, this.f32968G, this.f32976f, this.f32977w);
        } else {
            interfaceC14758a.m391a(canvas, this.f32977w, this.f32978x);
        }
        if (z) {
            this.f32977w.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public boolean m414e() {
        return this.f32979y.m430m();
    }

    /* renamed from: f */
    public void m413f() {
        this.f32973c.execute(new C14742a(this));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f32977w.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f32977w.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f32979y.m440c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f32979y.m439d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f32971J;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f32970I;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f32979y.m431l() || this.f32977w.getAlpha() < 255) ? -2 : -1;
    }

    /* renamed from: h */
    public void m411h(int i) {
        this.f32979y.m420w(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        m412g();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f32974d;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f32974d;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f32962A) != null && colorStateList.isStateful());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m409j(long j) {
        if (this.f32965D) {
            this.f32975e = 0L;
            this.f32966E.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        m418a();
        this.f32969H = this.f32973c.schedule(this.f32967F, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f32976f.set(rect);
        InterfaceC14758a interfaceC14758a = this.f32972K;
        if (interfaceC14758a != null) {
            interfaceC14758a.m390b(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f32962A;
        if (colorStateList == null || (mode = this.f32964C) == null) {
            return false;
        }
        this.f32963B = m408k(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (i >= 0) {
            this.f32973c.execute(new C14743b(this, i));
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f32977w.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f32977w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f32977w.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f32977w.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f32962A = colorStateList;
        this.f32963B = m408k(colorStateList, this.f32964C);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f32964C = mode;
        this.f32963B = m408k(this.f32962A, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f32965D) {
            if (z) {
                if (z2) {
                    m413f();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            if (this.f32974d) {
                return;
            }
            this.f32974d = true;
            m409j(this.f32979y.m424s());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.f32974d) {
                this.f32974d = false;
                m418a();
                this.f32979y.m422u();
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f32979y.m432k()), Integer.valueOf(this.f32979y.m438e()), Integer.valueOf(this.f32979y.m434i()), Integer.valueOf(this.f32979y.m436g()));
    }

    public C14741b(AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public C14741b(ContentResolver contentResolver, Uri uri) throws IOException {
        this(GifInfoHandle.m428o(contentResolver, uri), null, null, true);
    }

    C14741b(GifInfoHandle gifInfoHandle, C14741b c14741b, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f32974d = true;
        this.f32975e = Long.MIN_VALUE;
        this.f32976f = new Rect();
        this.f32977w = new Paint(6);
        this.f32980z = new ConcurrentLinkedQueue<>();
        this.f32967F = new C14756j(this);
        this.f32965D = z;
        this.f32973c = scheduledThreadPoolExecutor == null ? C14745d.m405a() : scheduledThreadPoolExecutor;
        this.f32979y = gifInfoHandle;
        Bitmap bitmap = null;
        if (c14741b != null) {
            synchronized (c14741b.f32979y) {
                if (!c14741b.f32979y.m430m() && c14741b.f32979y.m438e() >= this.f32979y.m438e() && c14741b.f32979y.m432k() >= this.f32979y.m432k()) {
                    c14741b.m410i();
                    Bitmap bitmap2 = c14741b.f32978x;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.f32978x = Bitmap.createBitmap(this.f32979y.m432k(), this.f32979y.m438e(), Bitmap.Config.ARGB_8888);
        } else {
            this.f32978x = bitmap;
        }
        this.f32978x.setHasAlpha(!gifInfoHandle.m431l());
        this.f32968G = new Rect(0, 0, this.f32979y.m432k(), this.f32979y.m438e());
        this.f32966E = new HandlerC14753g(this);
        this.f32967F.mo392a();
        this.f32970I = this.f32979y.m432k();
        this.f32971J = this.f32979y.m438e();
    }
}
