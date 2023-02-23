package p201g.p227h.p228e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p057e.C1347c;
import androidx.core.content.p057e.C1355f;
import p201g.p218e.C7527e;
import p201g.p227h.p234i.C7642f;
/* compiled from: TypefaceCompat.java */
/* renamed from: g.h.e.d */
/* loaded from: classes2.dex */
public class C7608d {

    /* renamed from: a */
    private static final C7615j f18281a;

    /* renamed from: b */
    private static final C7527e<String, Typeface> f18282b;

    /* compiled from: TypefaceCompat.java */
    /* renamed from: g.h.e.d$a */
    /* loaded from: classes2.dex */
    public static class C7609a extends C7642f.C7645c {

        /* renamed from: a */
        private C1355f.AbstractC1358c f18283a;

        public C7609a(C1355f.AbstractC1358c abstractC1358c) {
            this.f18283a = abstractC1358c;
        }

        @Override // p201g.p227h.p234i.C7642f.C7645c
        /* renamed from: a */
        public void mo17932a(int i) {
            C1355f.AbstractC1358c abstractC1358c = this.f18283a;
            if (abstractC1358c != null) {
                abstractC1358c.mo15033d(i);
            }
        }

        @Override // p201g.p227h.p234i.C7642f.C7645c
        /* renamed from: b */
        public void mo17931b(Typeface typeface) {
            C1355f.AbstractC1358c abstractC1358c = this.f18283a;
            if (abstractC1358c != null) {
                abstractC1358c.mo15032e(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f18281a = new C7614i();
        } else if (i >= 28) {
            f18281a = new C7613h();
        } else if (i >= 26) {
            f18281a = new C7612g();
        } else if (i >= 24 && C7611f.m18030m()) {
            f18281a = new C7611f();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f18281a = new C7610e();
        } else {
            f18281a = new C7615j();
        }
        f18282b = new C7527e<>(16);
    }

    /* renamed from: a */
    public static Typeface m18045a(Context context, Typeface typeface, int i) {
        Typeface m18039g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (m18039g = m18039g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : m18039g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m18044b(Context context, CancellationSignal cancellationSignal, C7642f.C7644b[] c7644bArr, int i) {
        return f18281a.mo18012c(context, cancellationSignal, c7644bArr, i);
    }

    /* renamed from: c */
    public static Typeface m18043c(Context context, C1347c.InterfaceC1348a interfaceC1348a, Resources resources, int i, int i2, C1355f.AbstractC1358c abstractC1358c, Handler handler, boolean z) {
        Typeface mo18013b;
        if (interfaceC1348a instanceof C1347c.C1351d) {
            C1347c.C1351d c1351d = (C1347c.C1351d) interfaceC1348a;
            Typeface m18038h = m18038h(c1351d.m36258c());
            if (m18038h != null) {
                if (abstractC1358c != null) {
                    abstractC1358c.m36236b(m18038h, handler);
                }
                return m18038h;
            }
            mo18013b = C7642f.m17942a(context, c1351d.m36259b(), i2, !z ? abstractC1358c != null : c1351d.m36260a() != 0, z ? c1351d.m36257d() : -1, C1355f.AbstractC1358c.m36235c(handler), new C7609a(abstractC1358c));
        } else {
            mo18013b = f18281a.mo18013b(context, (C1347c.C1349b) interfaceC1348a, resources, i2);
            if (abstractC1358c != null) {
                if (mo18013b != null) {
                    abstractC1358c.m36236b(mo18013b, handler);
                } else {
                    abstractC1358c.m36237a(-3, handler);
                }
            }
        }
        if (mo18013b != null) {
            f18282b.m18486d(m18041e(resources, i, i2), mo18013b);
        }
        return mo18013b;
    }

    /* renamed from: d */
    public static Typeface m18042d(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo18010e = f18281a.mo18010e(context, resources, i, str, i2);
        if (mo18010e != null) {
            f18282b.m18486d(m18041e(resources, i, i2), mo18010e);
        }
        return mo18010e;
    }

    /* renamed from: e */
    private static String m18041e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: f */
    public static Typeface m18040f(Resources resources, int i, int i2) {
        return f18282b.m18487c(m18041e(resources, i, i2));
    }

    /* renamed from: g */
    private static Typeface m18039g(Context context, Typeface typeface, int i) {
        C1347c.C1349b m18006i = f18281a.m18006i(typeface);
        if (m18006i == null) {
            return null;
        }
        return f18281a.mo18013b(context, m18006i, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m18038h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
