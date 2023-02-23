package com.bumptech.glide.load.p074o.p078g;

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
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.p074o.p078g.C2270g;
import com.bumptech.glide.p065k.InterfaceC1965a;
import com.bumptech.glide.p086q.C2380j;
import java.nio.ByteBuffer;
import java.util.List;
import p201g.p267w.p268a.p269a.AbstractC8188b;
/* compiled from: GifDrawable.java */
/* renamed from: com.bumptech.glide.load.o.g.c */
/* loaded from: classes2.dex */
public class C2265c extends Drawable implements C2270g.InterfaceC2272b, Animatable {

    /* renamed from: A */
    private Paint f6606A;

    /* renamed from: B */
    private Rect f6607B;

    /* renamed from: C */
    private List<AbstractC8188b> f6608C;

    /* renamed from: c */
    private final C2266a f6609c;

    /* renamed from: d */
    private boolean f6610d;

    /* renamed from: e */
    private boolean f6611e;

    /* renamed from: f */
    private boolean f6612f;

    /* renamed from: w */
    private boolean f6613w;

    /* renamed from: x */
    private int f6614x;

    /* renamed from: y */
    private int f6615y;

    /* renamed from: z */
    private boolean f6616z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifDrawable.java */
    /* renamed from: com.bumptech.glide.load.o.g.c$a */
    /* loaded from: classes2.dex */
    public static final class C2266a extends Drawable.ConstantState {

        /* renamed from: a */
        final C2270g f6617a;

        C2266a(C2270g c2270g) {
            this.f6617a = c2270g;
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
            return new C2265c(this);
        }
    }

    public C2265c(Context context, InterfaceC1965a interfaceC1965a, InterfaceC2126l<Bitmap> interfaceC2126l, int i, int i2, Bitmap bitmap) {
        this(new C2266a(new C2270g(ComponentCallbacks2C1943b.m34169c(context), interfaceC1965a, i, i2, interfaceC2126l, bitmap)));
    }

    /* renamed from: b */
    private Drawable.Callback m33455b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m33453d() {
        if (this.f6607B == null) {
            this.f6607B = new Rect();
        }
        return this.f6607B;
    }

    /* renamed from: h */
    private Paint m33449h() {
        if (this.f6606A == null) {
            this.f6606A = new Paint(2);
        }
        return this.f6606A;
    }

    /* renamed from: j */
    private void m33447j() {
        List<AbstractC8188b> list = this.f6608C;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f6608C.get(i).m16553a(this);
            }
        }
    }

    /* renamed from: l */
    private void m33445l() {
        this.f6614x = 0;
    }

    /* renamed from: n */
    private void m33443n() {
        C2380j.m33132a(!this.f6612f, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f6609c.f6617a.m33435f() == 1) {
            invalidateSelf();
        } else if (this.f6610d) {
        } else {
            this.f6610d = true;
            this.f6609c.f6617a.m33423r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    private void m33442o() {
        this.f6610d = false;
        this.f6609c.f6617a.m33422s(this);
    }

    @Override // com.bumptech.glide.load.p074o.p078g.C2270g.InterfaceC2272b
    /* renamed from: a */
    public void mo33419a() {
        if (m33455b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m33450g() == m33451f() - 1) {
            this.f6614x++;
        }
        int i = this.f6615y;
        if (i == -1 || this.f6614x < i) {
            return;
        }
        m33447j();
        stop();
    }

    /* renamed from: c */
    public ByteBuffer m33454c() {
        return this.f6609c.f6617a.m33439b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f6612f) {
            return;
        }
        if (this.f6616z) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m33453d());
            this.f6616z = false;
        }
        canvas.drawBitmap(this.f6609c.f6617a.m33438c(), (Rect) null, m33453d(), m33449h());
    }

    /* renamed from: e */
    public Bitmap m33452e() {
        return this.f6609c.f6617a.m33436e();
    }

    /* renamed from: f */
    public int m33451f() {
        return this.f6609c.f6617a.m33435f();
    }

    /* renamed from: g */
    public int m33450g() {
        return this.f6609c.f6617a.m33437d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f6609c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6609c.f6617a.m33433h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6609c.f6617a.m33430k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int m33448i() {
        return this.f6609c.f6617a.m33431j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6610d;
    }

    /* renamed from: k */
    public void m33446k() {
        this.f6612f = true;
        this.f6609c.f6617a.m33440a();
    }

    /* renamed from: m */
    public void m33444m(InterfaceC2126l<Bitmap> interfaceC2126l, Bitmap bitmap) {
        this.f6609c.f6617a.m33426o(interfaceC2126l, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6616z = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m33449h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m33449h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        C2380j.m33132a(!this.f6612f, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f6613w = z;
        if (!z) {
            m33442o();
        } else if (this.f6611e) {
            m33443n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f6611e = true;
        m33445l();
        if (this.f6613w) {
            m33443n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f6611e = false;
        m33442o();
    }

    C2265c(C2266a c2266a) {
        this.f6613w = true;
        this.f6615y = -1;
        C2380j.m33129d(c2266a);
        this.f6609c = c2266a;
    }
}
