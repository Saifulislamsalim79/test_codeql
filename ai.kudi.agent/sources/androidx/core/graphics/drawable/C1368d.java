package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableApi14.java */
/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes2.dex */
public class C1368d extends Drawable implements Drawable.Callback, InterfaceC1367c, InterfaceC1366b {

    /* renamed from: y */
    static final PorterDuff.Mode f4232y = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private int f4233c;

    /* renamed from: d */
    private PorterDuff.Mode f4234d;

    /* renamed from: e */
    private boolean f4235e;

    /* renamed from: f */
    C1370f f4236f;

    /* renamed from: w */
    private boolean f4237w;

    /* renamed from: x */
    Drawable f4238x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1368d(C1370f c1370f, Resources resources) {
        this.f4236f = c1370f;
        m36180e(resources);
    }

    /* renamed from: d */
    private C1370f m36181d() {
        return new C1370f(this.f4236f);
    }

    /* renamed from: e */
    private void m36180e(Resources resources) {
        Drawable.ConstantState constantState;
        C1370f c1370f = this.f4236f;
        if (c1370f == null || (constantState = c1370f.f4241b) == null) {
            return;
        }
        mo36183a(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    private boolean m36179f(int[] iArr) {
        if (mo36178c()) {
            C1370f c1370f = this.f4236f;
            ColorStateList colorStateList = c1370f.f4242c;
            PorterDuff.Mode mode = c1370f.f4243d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f4235e || colorForState != this.f4233c || mode != this.f4234d) {
                    setColorFilter(colorForState, mode);
                    this.f4233c = colorForState;
                    this.f4234d = mode;
                    this.f4235e = true;
                    return true;
                }
            } else {
                this.f4235e = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC1367c
    /* renamed from: a */
    public final void mo36183a(Drawable drawable) {
        Drawable drawable2 = this.f4238x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4238x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1370f c1370f = this.f4236f;
            if (c1370f != null) {
                c1370f.f4241b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.InterfaceC1367c
    /* renamed from: b */
    public final Drawable mo36182b() {
        return this.f4238x;
    }

    /* renamed from: c */
    protected boolean mo36178c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f4238x.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C1370f c1370f = this.f4236f;
        return changingConfigurations | (c1370f != null ? c1370f.getChangingConfigurations() : 0) | this.f4238x.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C1370f c1370f = this.f4236f;
        if (c1370f == null || !c1370f.m36176a()) {
            return null;
        }
        this.f4236f.f4240a = getChangingConfigurations();
        return this.f4236f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f4238x.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4238x.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4238x.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C1365a.m36196f(this.f4238x);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f4238x.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f4238x.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f4238x.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f4238x.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f4238x.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f4238x.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C1365a.m36194h(this.f4238x);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C1370f c1370f;
        ColorStateList colorStateList = (!mo36178c() || (c1370f = this.f4236f) == null) ? null : c1370f.f4242c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f4238x.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f4238x.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f4237w && super.mutate() == this) {
            this.f4236f = m36181d();
            Drawable drawable = this.f4238x;
            if (drawable != null) {
                drawable.mutate();
            }
            C1370f c1370f = this.f4236f;
            if (c1370f != null) {
                Drawable drawable2 = this.f4238x;
                c1370f.f4241b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f4237w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4238x;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return C1365a.m36189m(this.f4238x, i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f4238x.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f4238x.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        C1365a.m36192j(this.f4238x, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f4238x.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4238x.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f4238x.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f4238x.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m36179f(iArr) || this.f4238x.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintList(ColorStateList colorStateList) {
        this.f4236f.f4242c = colorStateList;
        m36179f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f4236f.f4243d = mode;
        m36179f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f4238x.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1368d(Drawable drawable) {
        this.f4236f = m36181d();
        mo36183a(drawable);
    }
}
