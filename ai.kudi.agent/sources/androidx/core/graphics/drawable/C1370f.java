package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableState.java */
/* renamed from: androidx.core.graphics.drawable.f */
/* loaded from: classes2.dex */
public final class C1370f extends Drawable.ConstantState {

    /* renamed from: a */
    int f4240a;

    /* renamed from: b */
    Drawable.ConstantState f4241b;

    /* renamed from: c */
    ColorStateList f4242c;

    /* renamed from: d */
    PorterDuff.Mode f4243d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1370f(C1370f c1370f) {
        this.f4242c = null;
        this.f4243d = C1368d.f4232y;
        if (c1370f != null) {
            this.f4240a = c1370f.f4240a;
            this.f4241b = c1370f.f4241b;
            this.f4242c = c1370f.f4242c;
            this.f4243d = c1370f.f4243d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m36176a() {
        return this.f4241b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f4240a;
        Drawable.ConstantState constantState = this.f4241b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C1369e(this, resources);
        }
        return new C1368d(this, resources);
    }
}
