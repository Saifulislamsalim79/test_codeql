package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
/* compiled from: VectorEnabledTintResources.java */
/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: classes2.dex */
public class C1168w0 extends Resources {

    /* renamed from: b */
    private static boolean f3574b = false;

    /* renamed from: a */
    private final WeakReference<Context> f3575a;

    public C1168w0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3575a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m36908a() {
        return f3574b;
    }

    /* renamed from: b */
    public static void m36907b(boolean z) {
        f3574b = z;
    }

    /* renamed from: c */
    public static boolean m36906c() {
        return m36908a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final Drawable m36905d(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.f3575a.get();
        if (context != null) {
            return C1103h0.m37156h().m37144t(context, this, i);
        }
        return super.getDrawable(i);
    }
}
