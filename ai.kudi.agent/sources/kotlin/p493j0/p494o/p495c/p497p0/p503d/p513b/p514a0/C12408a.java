package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12494e;
import kotlin.p557z.C13712m;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
/* compiled from: KotlinClassHeader.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.a0.a */
/* loaded from: classes3.dex */
public final class C12408a {

    /* renamed from: a */
    private final EnumC12409a f27543a;

    /* renamed from: b */
    private final C12494e f27544b;

    /* renamed from: c */
    private final String[] f27545c;

    /* renamed from: d */
    private final String[] f27546d;

    /* renamed from: e */
    private final String[] f27547e;

    /* renamed from: f */
    private final String f27548f;

    /* renamed from: g */
    private final int f27549g;

    /* compiled from: KotlinClassHeader.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a0.a$a */
    /* loaded from: classes3.dex */
    public enum EnumC12409a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: d */
        public static final C12410a f27552d = new C12410a(null);

        /* renamed from: e */
        private static final Map<Integer, EnumC12409a> f27553e;

        /* renamed from: c */
        private final int f27559c;

        /* compiled from: KotlinClassHeader.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.b.a0.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C12410a {
            private C12410a() {
            }

            public /* synthetic */ C12410a(g gVar) {
                this();
            }

            /* renamed from: a */
            public final EnumC12409a m8984a(int i) {
                EnumC12409a enumC12409a = (EnumC12409a) EnumC12409a.f27553e.get(Integer.valueOf(i));
                return enumC12409a == null ? EnumC12409a.UNKNOWN : enumC12409a;
            }
        }

        static {
            int m3898f;
            int m10271a;
            EnumC12409a[] values = values();
            m3898f = C13725q0.m3898f(values.length);
            m10271a = C11841h.m10271a(m3898f, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m10271a);
            for (EnumC12409a enumC12409a : values) {
                linkedHashMap.put(Integer.valueOf(enumC12409a.m8985g()), enumC12409a);
            }
            f27553e = linkedHashMap;
        }

        EnumC12409a(int i) {
            this.f27559c = i;
        }

        /* renamed from: e */
        public static final EnumC12409a m8986e(int i) {
            return f27552d.m8984a(i);
        }

        /* renamed from: g */
        public final int m8985g() {
            return this.f27559c;
        }
    }

    public C12408a(EnumC12409a enumC12409a, C12494e c12494e, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        l.f(enumC12409a, "kind");
        l.f(c12494e, "metadataVersion");
        this.f27543a = enumC12409a;
        this.f27544b = c12494e;
        this.f27545c = strArr;
        this.f27546d = strArr2;
        this.f27547e = strArr3;
        this.f27548f = str;
        this.f27549g = i;
    }

    /* renamed from: h */
    private final boolean m8992h(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public final String[] m8999a() {
        return this.f27545c;
    }

    /* renamed from: b */
    public final String[] m8998b() {
        return this.f27546d;
    }

    /* renamed from: c */
    public final EnumC12409a m8997c() {
        return this.f27543a;
    }

    /* renamed from: d */
    public final C12494e m8996d() {
        return this.f27544b;
    }

    /* renamed from: e */
    public final String m8995e() {
        String str = this.f27548f;
        if (m8997c() == EnumC12409a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final List<String> m8994f() {
        List<String> m3891e;
        String[] strArr = this.f27545c;
        if (!(m8997c() == EnumC12409a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        List<String> m4067d = strArr != null ? C13712m.m4067d(strArr) : null;
        if (m4067d != null) {
            return m4067d;
        }
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    /* renamed from: g */
    public final String[] m8993g() {
        return this.f27547e;
    }

    /* renamed from: i */
    public final boolean m8991i() {
        return m8992h(this.f27549g, 2);
    }

    /* renamed from: j */
    public final boolean m8990j() {
        return m8992h(this.f27549g, 64) && !m8992h(this.f27549g, 32);
    }

    /* renamed from: k */
    public final boolean m8989k() {
        return m8992h(this.f27549g, 16) && !m8992h(this.f27549g, 32);
    }

    public String toString() {
        return this.f27543a + " version=" + this.f27544b;
    }
}
