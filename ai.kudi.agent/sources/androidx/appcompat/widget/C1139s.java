package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C1365a;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* compiled from: AppCompatSeekBarHelper.java */
/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes2.dex */
class C1139s extends C1127n {

    /* renamed from: d */
    private final SeekBar f3462d;

    /* renamed from: e */
    private Drawable f3463e;

    /* renamed from: f */
    private ColorStateList f3464f;

    /* renamed from: g */
    private PorterDuff.Mode f3465g;

    /* renamed from: h */
    private boolean f3466h;

    /* renamed from: i */
    private boolean f3467i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1139s(SeekBar seekBar) {
        super(seekBar);
        this.f3464f = null;
        this.f3465g = null;
        this.f3466h = false;
        this.f3467i = false;
        this.f3462d = seekBar;
    }

    /* renamed from: f */
    private void m37023f() {
        if (this.f3463e != null) {
            if (this.f3466h || this.f3467i) {
                Drawable m36184r = C1365a.m36184r(this.f3463e.mutate());
                this.f3463e = m36184r;
                if (this.f3466h) {
                    C1365a.m36187o(m36184r, this.f3464f);
                }
                if (this.f3467i) {
                    C1365a.m36186p(this.f3463e, this.f3465g);
                }
                if (this.f3463e.isStateful()) {
                    this.f3463e.setState(this.f3462d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C1127n
    /* renamed from: c */
    public void mo37024c(AttributeSet attributeSet, int i) {
        super.mo37024c(attributeSet, i);
        C1138r0 m37026v = C1138r0.m37026v(this.f3462d.getContext(), attributeSet, C7461j.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f3462d;
        C7759x.m17502n0(seekBar, seekBar.getContext(), C7461j.AppCompatSeekBar, attributeSet, m37026v.m37030r(), i, 0);
        Drawable m37040h = m37026v.m37040h(C7461j.AppCompatSeekBar_android_thumb);
        if (m37040h != null) {
            this.f3462d.setThumb(m37040h);
        }
        m37019j(m37026v.m37041g(C7461j.AppCompatSeekBar_tickMark));
        if (m37026v.m37029s(C7461j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3465g = C1068a0.m37281e(m37026v.m37037k(C7461j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3465g);
            this.f3467i = true;
        }
        if (m37026v.m37029s(C7461j.AppCompatSeekBar_tickMarkTint)) {
            this.f3464f = m37026v.m37045c(C7461j.AppCompatSeekBar_tickMarkTint);
            this.f3466h = true;
        }
        m37026v.m37025w();
        m37023f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m37022g(Canvas canvas) {
        if (this.f3463e != null) {
            int max = this.f3462d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3463e.getIntrinsicWidth();
                int intrinsicHeight = this.f3463e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3463e.setBounds(-i, -i2, i, i2);
                float width = ((this.f3462d.getWidth() - this.f3462d.getPaddingLeft()) - this.f3462d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f3462d.getPaddingLeft(), this.f3462d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3463e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m37021h() {
        Drawable drawable = this.f3463e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3462d.getDrawableState())) {
            this.f3462d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m37020i() {
        Drawable drawable = this.f3463e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m37019j(Drawable drawable) {
        Drawable drawable2 = this.f3463e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3463e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3462d);
            C1365a.m36189m(drawable, C7759x.m17563C(this.f3462d));
            if (drawable.isStateful()) {
                drawable.setState(this.f3462d.getDrawableState());
            }
            m37023f();
        }
        this.f3462d.invalidate();
    }
}
