package p201g.p227h.p228e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.p057e.C1347c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p201g.p227h.p234i.C7642f;
/* compiled from: TypefaceCompatApi26Impl.java */
/* renamed from: g.h.e.g */
/* loaded from: classes2.dex */
public class C7612g extends C7610e {

    /* renamed from: g */
    protected final Class<?> f18293g;

    /* renamed from: h */
    protected final Constructor<?> f18294h;

    /* renamed from: i */
    protected final Method f18295i;

    /* renamed from: j */
    protected final Method f18296j;

    /* renamed from: k */
    protected final Method f18297k;

    /* renamed from: l */
    protected final Method f18298l;

    /* renamed from: m */
    protected final Method f18299m;

    public C7612g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> m18018y = m18018y();
            constructor = m18017z(m18018y);
            method2 = m18020v(m18018y);
            method3 = m18019w(m18018y);
            method4 = m18028A(m18018y);
            method5 = m18021u(m18018y);
            method = mo18015x(m18018y);
            cls = m18018y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f18293g = cls;
        this.f18294h = constructor;
        this.f18295i = method2;
        this.f18296j = method3;
        this.f18297k = method4;
        this.f18298l = method5;
        this.f18299m = method;
    }

    /* renamed from: o */
    private Object m18027o() {
        try {
            return this.f18294h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m18026p(Object obj) {
        try {
            this.f18298l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m18025q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18295i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m18024r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f18296j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m18023s(Object obj) {
        try {
            return ((Boolean) this.f18297k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m18022t() {
        if (this.f18295i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f18295i != null;
    }

    /* renamed from: A */
    protected Method m18028A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // p201g.p227h.p228e.C7610e, p201g.p227h.p228e.C7615j
    /* renamed from: b */
    public Typeface mo18013b(Context context, C1347c.C1349b c1349b, Resources resources, int i) {
        C1347c.C1350c[] m36267a;
        if (!m18022t()) {
            return super.mo18013b(context, c1349b, resources, i);
        }
        Object m18027o = m18027o();
        if (m18027o == null) {
            return null;
        }
        for (C1347c.C1350c c1350c : c1349b.m36267a()) {
            if (!m18025q(context, m18027o, c1350c.m36266a(), c1350c.m36264c(), c1350c.m36262e(), c1350c.m36261f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c1350c.m36263d()))) {
                m18026p(m18027o);
                return null;
            }
        }
        if (m18023s(m18027o)) {
            return mo18016l(m18027o);
        }
        return null;
    }

    @Override // p201g.p227h.p228e.C7610e, p201g.p227h.p228e.C7615j
    /* renamed from: c */
    public Typeface mo18012c(Context context, CancellationSignal cancellationSignal, C7642f.C7644b[] c7644bArr, int i) {
        Typeface mo18016l;
        if (c7644bArr.length < 1) {
            return null;
        }
        if (!m18022t()) {
            C7642f.C7644b mo18007h = mo18007h(c7644bArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo18007h.m17935d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo18007h.m17934e()).setItalic(mo18007h.m17933f()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m17991h = C7619k.m17991h(context, c7644bArr, cancellationSignal);
        Object m18027o = m18027o();
        if (m18027o == null) {
            return null;
        }
        boolean z = false;
        for (C7642f.C7644b c7644b : c7644bArr) {
            ByteBuffer byteBuffer = m17991h.get(c7644b.m17935d());
            if (byteBuffer != null) {
                if (!m18024r(m18027o, byteBuffer, c7644b.m17936c(), c7644b.m17934e(), c7644b.m17933f() ? 1 : 0)) {
                    m18026p(m18027o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m18026p(m18027o);
            return null;
        } else if (m18023s(m18027o) && (mo18016l = mo18016l(m18027o)) != null) {
            return Typeface.create(mo18016l, i);
        } else {
            return null;
        }
    }

    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: e */
    public Typeface mo18010e(Context context, Resources resources, int i, String str, int i2) {
        if (!m18022t()) {
            return super.mo18010e(context, resources, i, str, i2);
        }
        Object m18027o = m18027o();
        if (m18027o == null) {
            return null;
        }
        if (!m18025q(context, m18027o, str, 0, -1, -1, null)) {
            m18026p(m18027o);
            return null;
        } else if (m18023s(m18027o)) {
            return mo18016l(m18027o);
        } else {
            return null;
        }
    }

    /* renamed from: l */
    protected Typeface mo18016l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f18293g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f18299m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: u */
    protected Method m18021u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: v */
    protected Method m18020v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: w */
    protected Method m18019w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: x */
    protected Method mo18015x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    protected Class<?> m18018y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    protected Constructor<?> m18017z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
