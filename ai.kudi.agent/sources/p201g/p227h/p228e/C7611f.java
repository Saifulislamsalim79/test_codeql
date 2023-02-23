package p201g.p227h.p228e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p057e.C1347c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p201g.p218e.C7534g;
import p201g.p227h.p234i.C7642f;
/* compiled from: TypefaceCompatApi24Impl.java */
/* renamed from: g.h.e.f */
/* loaded from: classes2.dex */
class C7611f extends C7615j {

    /* renamed from: b */
    private static final Class<?> f18289b;

    /* renamed from: c */
    private static final Constructor<?> f18290c;

    /* renamed from: d */
    private static final Method f18291d;

    /* renamed from: e */
    private static final Method f18292e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f18290c = constructor;
        f18289b = cls;
        f18291d = method2;
        f18292e = method;
    }

    /* renamed from: k */
    private static boolean m18032k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f18291d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m18031l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f18289b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f18292e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m18030m() {
        if (f18291d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f18291d != null;
    }

    /* renamed from: n */
    private static Object m18029n() {
        try {
            return f18290c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: b */
    public Typeface mo18013b(Context context, C1347c.C1349b c1349b, Resources resources, int i) {
        C1347c.C1350c[] m36267a;
        Object m18029n = m18029n();
        if (m18029n == null) {
            return null;
        }
        for (C1347c.C1350c c1350c : c1349b.m36267a()) {
            ByteBuffer m17997b = C7619k.m17997b(context, resources, c1350c.m36265b());
            if (m17997b == null || !m18032k(m18029n, m17997b, c1350c.m36264c(), c1350c.m36262e(), c1350c.m36261f())) {
                return null;
            }
        }
        return m18031l(m18029n);
    }

    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: c */
    public Typeface mo18012c(Context context, CancellationSignal cancellationSignal, C7642f.C7644b[] c7644bArr, int i) {
        Object m18029n = m18029n();
        if (m18029n == null) {
            return null;
        }
        C7534g c7534g = new C7534g();
        for (C7642f.C7644b c7644b : c7644bArr) {
            Uri m17935d = c7644b.m17935d();
            ByteBuffer byteBuffer = (ByteBuffer) c7534g.get(m17935d);
            if (byteBuffer == null) {
                byteBuffer = C7619k.m17993f(context, cancellationSignal, m17935d);
                c7534g.put(m17935d, byteBuffer);
            }
            if (byteBuffer == null || !m18032k(m18029n, byteBuffer, c7644b.m17936c(), c7644b.m17934e(), c7644b.m17933f())) {
                return null;
            }
        }
        Typeface m18031l = m18031l(m18029n);
        if (m18031l == null) {
            return null;
        }
        return Typeface.create(m18031l, i);
    }
}
