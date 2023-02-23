package p201g.p202a.p203k.p204a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C1103h0;
import androidx.core.content.C1335a;
import androidx.core.content.p057e.C1345a;
import java.util.WeakHashMap;
/* compiled from: AppCompatResources.java */
/* renamed from: g.a.k.a.a */
/* loaded from: classes2.dex */
public final class C7462a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f17673a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C7463a>> f17674b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f17675c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatResources.java */
    /* renamed from: g.a.k.a.a$a */
    /* loaded from: classes2.dex */
    public static class C7463a {

        /* renamed from: a */
        final ColorStateList f17676a;

        /* renamed from: b */
        final Configuration f17677b;

        C7463a(ColorStateList colorStateList, Configuration configuration) {
            this.f17676a = colorStateList;
            this.f17677b = configuration;
        }
    }

    /* renamed from: a */
    private static void m18693a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f17675c) {
            SparseArray<C7463a> sparseArray = f17674b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f17674b.put(context, sparseArray);
            }
            sparseArray.append(i, new C7463a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m18692b(Context context, int i) {
        C7463a c7463a;
        synchronized (f17675c) {
            SparseArray<C7463a> sparseArray = f17674b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c7463a = sparseArray.get(i)) != null) {
                if (c7463a.f17677b.equals(context.getResources().getConfiguration())) {
                    return c7463a.f17676a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m18691c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList m18692b = m18692b(context, i);
        if (m18692b != null) {
            return m18692b;
        }
        ColorStateList m18688f = m18688f(context, i);
        if (m18688f != null) {
            m18693a(context, i, m18688f);
            return m18688f;
        }
        return C1335a.m36323e(context, i);
    }

    /* renamed from: d */
    public static Drawable m18690d(Context context, int i) {
        return C1103h0.m37156h().m37154j(context, i);
    }

    /* renamed from: e */
    private static TypedValue m18689e() {
        TypedValue typedValue = f17673a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f17673a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: f */
    private static ColorStateList m18688f(Context context, int i) {
        if (m18687g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C1345a.m36295a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m18687g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue m18689e = m18689e();
        resources.getValue(i, m18689e, true);
        int i2 = m18689e.type;
        return i2 >= 28 && i2 <= 31;
    }
}
