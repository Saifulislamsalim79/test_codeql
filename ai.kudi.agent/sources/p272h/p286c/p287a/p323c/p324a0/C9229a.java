package p272h.p286c.p287a.p323c.p324a0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.InterfaceC1366b;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n;
/* compiled from: RippleDrawableCompat.java */
/* renamed from: h.c.a.c.a0.a */
/* loaded from: classes2.dex */
public class C9229a extends Drawable implements InterfaceC9266n, InterfaceC1366b {

    /* renamed from: c */
    private C9231b f21635c;

    /* renamed from: a */
    public C9229a m15449a() {
        this.f21635c = new C9231b(this.f21635c);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C9231b c9231b = this.f21635c;
        if (c9231b.f21637b) {
            c9231b.f21636a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f21635c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f21635c.f21636a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable mutate() {
        m15449a();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f21635c.f21636a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f21635c.f21636a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m15443e = C9232b.m15443e(iArr);
        C9231b c9231b = this.f21635c;
        if (c9231b.f21637b != m15443e) {
            c9231b.f21637b = m15443e;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f21635c.f21636a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21635c.f21636a.setColorFilter(colorFilter);
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n
    public void setShapeAppearanceModel(C9250k c9250k) {
        this.f21635c.f21636a.setShapeAppearanceModel(c9250k);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTint(int i) {
        this.f21635c.f21636a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintList(ColorStateList colorStateList) {
        this.f21635c.f21636a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f21635c.f21636a.setTintMode(mode);
    }

    public C9229a(C9250k c9250k) {
        this(new C9231b(new C9243g(c9250k)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleDrawableCompat.java */
    /* renamed from: h.c.a.c.a0.a$b */
    /* loaded from: classes2.dex */
    public static final class C9231b extends Drawable.ConstantState {

        /* renamed from: a */
        C9243g f21636a;

        /* renamed from: b */
        boolean f21637b;

        public C9231b(C9243g c9243g) {
            this.f21636a = c9243g;
            this.f21637b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public C9229a newDrawable() {
            return new C9229a(new C9231b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public C9231b(C9231b c9231b) {
            this.f21636a = (C9243g) c9231b.f21636a.getConstantState().newDrawable();
            this.f21637b = c9231b.f21637b;
        }
    }

    private C9229a(C9231b c9231b) {
        this.f21635c = c9231b;
    }
}
