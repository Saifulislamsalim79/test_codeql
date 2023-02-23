package io.intercom.com.bumptech.glide.load.p402o.p407g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10798g;
import io.intercom.com.bumptech.glide.p393l.InterfaceC10501a;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.nio.ByteBuffer;
/* compiled from: GifDrawable.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.g.c */
/* loaded from: classes3.dex */
public class C10793c extends Drawable implements C10798g.InterfaceC10800b, Animatable {

    /* renamed from: A */
    private Paint f24642A;

    /* renamed from: B */
    private Rect f24643B;

    /* renamed from: c */
    private final C10794a f24644c;

    /* renamed from: d */
    private boolean f24645d;

    /* renamed from: e */
    private boolean f24646e;

    /* renamed from: f */
    private boolean f24647f;

    /* renamed from: w */
    private boolean f24648w;

    /* renamed from: x */
    private int f24649x;

    /* renamed from: y */
    private int f24650y;

    /* renamed from: z */
    private boolean f24651z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifDrawable.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.g.c$a */
    /* loaded from: classes3.dex */
    public static final class C10794a extends Drawable.ConstantState {

        /* renamed from: a */
        final C10798g f24652a;

        C10794a(C10798g c10798g) {
            this.f24652a = c10798g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C10793c(this);
        }
    }

    public C10793c(Context context, InterfaceC10501a interfaceC10501a, InterfaceC10629l<Bitmap> interfaceC10629l, int i, int i2, Bitmap bitmap) {
        this(new C10794a(new C10798g(ComponentCallbacks2C10478c.m13034c(context), interfaceC10501a, i, i2, interfaceC10629l, bitmap)));
    }

    /* renamed from: b */
    private Drawable.Callback m12320b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m12318d() {
        if (this.f24643B == null) {
            this.f24643B = new Rect();
        }
        return this.f24643B;
    }

    /* renamed from: h */
    private Paint m12314h() {
        if (this.f24642A == null) {
            this.f24642A = new Paint(2);
        }
        return this.f24642A;
    }

    /* renamed from: k */
    private void m12311k() {
        this.f24649x = 0;
    }

    /* renamed from: m */
    private void m12309m() {
        C10892h.m12017a(!this.f24647f, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f24644c.f24652a.m12296f() == 1) {
            invalidateSelf();
        } else if (this.f24645d) {
        } else {
            this.f24645d = true;
            this.f24644c.f24652a.m12283s(this);
            invalidateSelf();
        }
    }

    /* renamed from: n */
    private void m12308n() {
        this.f24645d = false;
        this.f24644c.f24652a.m12282t(this);
    }

    @Override // io.intercom.com.bumptech.glide.load.p402o.p407g.C10798g.InterfaceC10800b
    /* renamed from: a */
    public void mo12280a() {
        if (m12320b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m12315g() == m12316f() - 1) {
            this.f24649x++;
        }
        int i = this.f24650y;
        if (i == -1 || this.f24649x < i) {
            return;
        }
        stop();
    }

    /* renamed from: c */
    public ByteBuffer m12319c() {
        return this.f24644c.f24652a.m12300b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f24647f) {
            return;
        }
        if (this.f24651z) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m12318d());
            this.f24651z = false;
        }
        canvas.drawBitmap(this.f24644c.f24652a.m12299c(), (Rect) null, m12318d(), m12314h());
    }

    /* renamed from: e */
    public Bitmap m12317e() {
        return this.f24644c.f24652a.m12297e();
    }

    /* renamed from: f */
    public int m12316f() {
        return this.f24644c.f24652a.m12296f();
    }

    /* renamed from: g */
    public int m12315g() {
        return this.f24644c.f24652a.m12298d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f24644c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f24644c.f24652a.m12293i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24644c.f24652a.m12290l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int m12313i() {
        return this.f24644c.f24652a.m12291k();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f24645d;
    }

    /* renamed from: j */
    public void m12312j() {
        this.f24647f = true;
        this.f24644c.f24652a.m12301a();
    }

    /* renamed from: l */
    public void m12310l(InterfaceC10629l<Bitmap> interfaceC10629l, Bitmap bitmap) {
        this.f24644c.f24652a.m12286p(interfaceC10629l, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f24651z = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m12314h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m12314h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        C10892h.m12017a(!this.f24647f, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f24648w = z;
        if (!z) {
            m12308n();
        } else if (this.f24646e) {
            m12309m();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f24646e = true;
        m12311k();
        if (this.f24648w) {
            m12309m();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f24646e = false;
        m12308n();
    }

    C10793c(C10794a c10794a) {
        this.f24648w = true;
        this.f24650y = -1;
        C10892h.m12014d(c10794a);
        this.f24644c = c10794a;
    }
}
