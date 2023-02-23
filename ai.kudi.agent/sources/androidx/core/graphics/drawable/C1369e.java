package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableApi21.java */
/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes2.dex */
public class C1369e extends C1368d {

    /* renamed from: z */
    private static Method f4239z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1369e(Drawable drawable) {
        super(drawable);
        m36177g();
    }

    /* renamed from: g */
    private void m36177g() {
        if (f4239z == null) {
            try {
                f4239z = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.C1368d
    /* renamed from: c */
    protected boolean mo36178c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f4238x;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f4238x.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f4238x.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f4238x;
        if (drawable != null && (method = f4239z) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f4238x.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f4238x.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.C1368d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.C1368d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTint(int i) {
        if (mo36178c()) {
            super.setTint(i);
        } else {
            this.f4238x.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C1368d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintList(ColorStateList colorStateList) {
        if (mo36178c()) {
            super.setTintList(colorStateList);
        } else {
            this.f4238x.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C1368d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo36178c()) {
            super.setTintMode(mode);
        } else {
            this.f4238x.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1369e(C1370f c1370f, Resources resources) {
        super(c1370f, resources);
        m36177g();
    }
}
