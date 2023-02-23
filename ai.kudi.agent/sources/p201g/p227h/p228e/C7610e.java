package p201g.p227h.p228e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p057e.C1347c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p201g.p227h.p234i.C7642f;
/* compiled from: TypefaceCompatApi21Impl.java */
/* renamed from: g.h.e.e */
/* loaded from: classes2.dex */
class C7610e extends C7615j {

    /* renamed from: b */
    private static Class<?> f18284b = null;

    /* renamed from: c */
    private static Constructor<?> f18285c = null;

    /* renamed from: d */
    private static Method f18286d = null;

    /* renamed from: e */
    private static Method f18287e = null;

    /* renamed from: f */
    private static boolean f18288f = false;

    /* renamed from: k */
    private static boolean m18037k(Object obj, String str, int i, boolean z) {
        m18034n();
        try {
            return ((Boolean) f18286d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface m18036l(Object obj) {
        m18034n();
        try {
            Object newInstance = Array.newInstance(f18284b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f18287e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m18035m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m18034n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f18288f) {
            return;
        }
        f18288f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f18285c = constructor;
        f18284b = cls;
        f18286d = method2;
        f18287e = method;
    }

    /* renamed from: o */
    private static Object m18033o() {
        m18034n();
        try {
            return f18285c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: b */
    public Typeface mo18013b(Context context, C1347c.C1349b c1349b, Resources resources, int i) {
        C1347c.C1350c[] m36267a;
        Object m18033o = m18033o();
        for (C1347c.C1350c c1350c : c1349b.m36267a()) {
            File m17994e = C7619k.m17994e(context);
            if (m17994e == null) {
                return null;
            }
            try {
                if (!C7619k.m17996c(m17994e, resources, c1350c.m36265b())) {
                    return null;
                }
                if (!m18037k(m18033o, m17994e.getPath(), c1350c.m36262e(), c1350c.m36261f())) {
                    return null;
                }
                m17994e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m17994e.delete();
            }
        }
        return m18036l(m18033o);
    }

    @Override // p201g.p227h.p228e.C7615j
    /* renamed from: c */
    public Typeface mo18012c(Context context, CancellationSignal cancellationSignal, C7642f.C7644b[] c7644bArr, int i) {
        if (c7644bArr.length < 1) {
            return null;
        }
        C7642f.C7644b mo18007h = mo18007h(c7644bArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo18007h.m17935d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m18035m = m18035m(openFileDescriptor);
            if (m18035m != null && m18035m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m18035m);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                Typeface mo18011d = super.mo18011d(context, fileInputStream);
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return mo18011d;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
