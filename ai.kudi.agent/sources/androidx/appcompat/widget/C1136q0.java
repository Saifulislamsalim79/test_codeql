package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* compiled from: TintResources.java */
/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes2.dex */
class C1136q0 extends C1113i0 {

    /* renamed from: b */
    private final WeakReference<Context> f3457b;

    public C1136q0(Context context, Resources resources) {
        super(resources);
        this.f3457b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C1113i0, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f3457b.get();
        if (drawable != null && context != null) {
            C1103h0.m37156h().m37140x(context, i, drawable);
        }
        return drawable;
    }
}
