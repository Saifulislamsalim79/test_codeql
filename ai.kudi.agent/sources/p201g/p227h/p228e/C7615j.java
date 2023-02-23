package p201g.p227h.p228e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p057e.C1347c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p201g.p227h.p234i.C7642f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypefaceCompatBaseImpl.java */
/* renamed from: g.h.e.j */
/* loaded from: classes2.dex */
public class C7615j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C1347c.C1349b> f18300a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: g.h.e.j$a */
    /* loaded from: classes2.dex */
    public class C7616a implements InterfaceC7618c<C7642f.C7644b> {
        C7616a(C7615j c7615j) {
        }

        @Override // p201g.p227h.p228e.C7615j.InterfaceC7618c
        /* renamed from: c */
        public int mo18000a(C7642f.C7644b c7644b) {
            return c7644b.m17934e();
        }

        @Override // p201g.p227h.p228e.C7615j.InterfaceC7618c
        /* renamed from: d */
        public boolean mo17999b(C7642f.C7644b c7644b) {
            return c7644b.m17933f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: g.h.e.j$b */
    /* loaded from: classes2.dex */
    public class C7617b implements InterfaceC7618c<C1347c.C1350c> {
        C7617b(C7615j c7615j) {
        }

        @Override // p201g.p227h.p228e.C7615j.InterfaceC7618c
        /* renamed from: c */
        public int mo18000a(C1347c.C1350c c1350c) {
            return c1350c.m36262e();
        }

        @Override // p201g.p227h.p228e.C7615j.InterfaceC7618c
        /* renamed from: d */
        public boolean mo17999b(C1347c.C1350c c1350c) {
            return c1350c.m36261f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: g.h.e.j$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC7618c<T> {
        /* renamed from: a */
        int mo18000a(T t);

        /* renamed from: b */
        boolean mo17999b(T t);
    }

    /* renamed from: a */
    private void m18014a(Typeface typeface, C1347c.C1349b c1349b) {
        long m18005j = m18005j(typeface);
        if (m18005j != 0) {
            this.f18300a.put(Long.valueOf(m18005j), c1349b);
        }
    }

    /* renamed from: f */
    private C1347c.C1350c m18009f(C1347c.C1349b c1349b, int i) {
        return (C1347c.C1350c) m18008g(c1349b.m36267a(), i, new C7617b(this));
    }

    /* renamed from: g */
    private static <T> T m18008g(T[] tArr, int i, InterfaceC7618c<T> interfaceC7618c) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(interfaceC7618c.mo18000a(t2) - i2) * 2) + (interfaceC7618c.mo17999b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m18005j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* renamed from: b */
    public Typeface mo18013b(Context context, C1347c.C1349b c1349b, Resources resources, int i) {
        C1347c.C1350c m18009f = m18009f(c1349b, i);
        if (m18009f == null) {
            return null;
        }
        Typeface m18042d = C7608d.m18042d(context, resources, m18009f.m36265b(), m18009f.m36266a(), i);
        m18014a(m18042d, c1349b);
        return m18042d;
    }

    /* renamed from: c */
    public Typeface mo18012c(Context context, CancellationSignal cancellationSignal, C7642f.C7644b[] c7644bArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c7644bArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo18007h(c7644bArr, i).m17935d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface mo18011d = mo18011d(context, inputStream);
            C7619k.m17998a(inputStream);
            return mo18011d;
        } catch (IOException unused2) {
            C7619k.m17998a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            C7619k.m17998a(inputStream2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo18011d(Context context, InputStream inputStream) {
        File m17994e = C7619k.m17994e(context);
        if (m17994e == null) {
            return null;
        }
        try {
            if (C7619k.m17995d(m17994e, inputStream)) {
                return Typeface.createFromFile(m17994e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m17994e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo18010e(Context context, Resources resources, int i, String str, int i2) {
        File m17994e = C7619k.m17994e(context);
        if (m17994e == null) {
            return null;
        }
        try {
            if (C7619k.m17996c(m17994e, resources, i)) {
                return Typeface.createFromFile(m17994e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m17994e.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public C7642f.C7644b mo18007h(C7642f.C7644b[] c7644bArr, int i) {
        return (C7642f.C7644b) m18008g(c7644bArr, i, new C7616a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C1347c.C1349b m18006i(Typeface typeface) {
        long m18005j = m18005j(typeface);
        if (m18005j == 0) {
            return null;
        }
        return this.f18300a.get(Long.valueOf(m18005j));
    }
}
