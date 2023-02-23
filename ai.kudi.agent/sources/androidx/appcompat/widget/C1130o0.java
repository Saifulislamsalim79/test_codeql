package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: TintContextWrapper.java */
/* renamed from: androidx.appcompat.widget.o0 */
/* loaded from: classes2.dex */
public class C1130o0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f3447c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C1130o0>> f3448d;

    /* renamed from: a */
    private final Resources f3449a;

    /* renamed from: b */
    private final Resources.Theme f3450b;

    private C1130o0(Context context) {
        super(context);
        if (C1168w0.m36906c()) {
            C1168w0 c1168w0 = new C1168w0(this, context.getResources());
            this.f3449a = c1168w0;
            Resources.Theme newTheme = c1168w0.newTheme();
            this.f3450b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f3449a = new C1136q0(this, context.getResources());
        this.f3450b = null;
    }

    /* renamed from: a */
    private static boolean m37056a(Context context) {
        if ((context instanceof C1130o0) || (context.getResources() instanceof C1136q0) || (context.getResources() instanceof C1168w0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C1168w0.m36906c();
    }

    /* renamed from: b */
    public static Context m37055b(Context context) {
        if (m37056a(context)) {
            synchronized (f3447c) {
                if (f3448d == null) {
                    f3448d = new ArrayList<>();
                } else {
                    for (int size = f3448d.size() - 1; size >= 0; size--) {
                        WeakReference<C1130o0> weakReference = f3448d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f3448d.remove(size);
                        }
                    }
                    for (int size2 = f3448d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<C1130o0> weakReference2 = f3448d.get(size2);
                        C1130o0 c1130o0 = weakReference2 != null ? weakReference2.get() : null;
                        if (c1130o0 != null && c1130o0.getBaseContext() == context) {
                            return c1130o0;
                        }
                    }
                }
                C1130o0 c1130o02 = new C1130o0(context);
                f3448d.add(new WeakReference<>(c1130o02));
                return c1130o02;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f3449a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f3449a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3450b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f3450b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
