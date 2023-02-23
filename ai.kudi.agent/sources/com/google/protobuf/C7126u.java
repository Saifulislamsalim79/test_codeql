package com.google.protobuf;

import com.google.protobuf.C6997a0;
import com.google.protobuf.C7015d0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.C7126u.InterfaceC7128b;
import com.google.protobuf.InterfaceC7100r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FieldSet.java */
/* renamed from: com.google.protobuf.u */
/* loaded from: classes2.dex */
public final class C7126u<T extends InterfaceC7128b<T>> {

    /* renamed from: d */
    private static final C7126u f16981d = new C7126u(true);

    /* renamed from: a */
    private final C7066k1<T, Object> f16982a;

    /* renamed from: b */
    private boolean f16983b;

    /* renamed from: c */
    private boolean f16984c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FieldSet.java */
    /* renamed from: com.google.protobuf.u$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7127a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16985a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16986b;

        static {
            int[] iArr = new int[C7118t1.EnumC7120b.values().length];
            f16986b = iArr;
            try {
                iArr[C7118t1.EnumC7120b.f16962e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16963f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16964w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16965x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16966y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16967z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16949A.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16950B.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16952D.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16953E.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16951C.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16954F.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16955G.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16957I.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16958J.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16959K.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16960L.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16986b[C7118t1.EnumC7120b.f16956H.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C7118t1.EnumC7125c.values().length];
            f16985a = iArr2;
            try {
                iArr2[C7118t1.EnumC7125c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16985a[C7118t1.EnumC7125c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f16985a[C7118t1.EnumC7125c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f16985a[C7118t1.EnumC7125c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f16985a[C7118t1.EnumC7125c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f16985a[C7118t1.EnumC7125c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f16985a[C7118t1.EnumC7125c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f16985a[C7118t1.EnumC7125c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f16985a[C7118t1.EnumC7125c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.protobuf.u$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7128b<T extends InterfaceC7128b<T>> extends Comparable<T> {
        /* renamed from: E */
        InterfaceC7100r0.InterfaceC7101a mo19351E(InterfaceC7100r0.InterfaceC7101a interfaceC7101a, InterfaceC7100r0 interfaceC7100r0);

        /* renamed from: d */
        int mo19348d();

        /* renamed from: f */
        boolean mo19347f();

        /* renamed from: k */
        C7118t1.EnumC7120b mo19346k();

        /* renamed from: l */
        C7118t1.EnumC7125c mo19345l();

        /* renamed from: s */
        boolean mo19344s();
    }

    private C7126u() {
        this.f16982a = C7066k1.m19853q(16);
    }

    /* renamed from: c */
    private static Object m19557c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m19556d(C7118t1.EnumC7120b enumC7120b, int i, Object obj) {
        int m20341W = CodedOutputStream.m20341W(i);
        if (enumC7120b == C7118t1.EnumC7120b.f16952D) {
            m20341W *= 2;
        }
        return m20341W + m19555e(enumC7120b, obj);
    }

    /* renamed from: e */
    static int m19555e(C7118t1.EnumC7120b enumC7120b, Object obj) {
        switch (C7127a.f16986b[enumC7120b.ordinal()]) {
            case 1:
                return CodedOutputStream.m20321k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m20310s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m20300z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m20337a0(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m20302x(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m20313q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m20315o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m20330f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m20306u((InterfaceC7100r0) obj);
            case 10:
                if (obj instanceof C7015d0) {
                    return CodedOutputStream.m20374C((C7015d0) obj);
                }
                return CodedOutputStream.m20366H((InterfaceC7100r0) obj);
            case 11:
                if (obj instanceof AbstractC7039i) {
                    return CodedOutputStream.m20324i((AbstractC7039i) obj);
                }
                return CodedOutputStream.m20342V((String) obj);
            case 12:
                if (obj instanceof AbstractC7039i) {
                    return CodedOutputStream.m20324i((AbstractC7039i) obj);
                }
                return CodedOutputStream.m20328g((byte[]) obj);
            case 13:
                return CodedOutputStream.m20339Y(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m20358N(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m20354P(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m20350R(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m20346T(((Long) obj).longValue());
            case 18:
                if (obj instanceof C6997a0.InterfaceC7000c) {
                    return CodedOutputStream.m20319m(((C6997a0.InterfaceC7000c) obj).mo20225d());
                }
                return CodedOutputStream.m20319m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m19554f(InterfaceC7128b<?> interfaceC7128b, Object obj) {
        C7118t1.EnumC7120b mo19346k = interfaceC7128b.mo19346k();
        int mo19348d = interfaceC7128b.mo19348d();
        if (interfaceC7128b.mo19347f()) {
            int i = 0;
            if (interfaceC7128b.mo19344s()) {
                for (Object obj2 : (List) obj) {
                    i += m19555e(mo19346k, obj2);
                }
                return CodedOutputStream.m20341W(mo19348d) + i + CodedOutputStream.m20360L(i);
            }
            for (Object obj3 : (List) obj) {
                i += m19556d(mo19346k, mo19348d, obj3);
            }
            return i;
        }
        return m19556d(mo19346k, mo19348d, obj);
    }

    /* renamed from: g */
    public static <T extends InterfaceC7128b<T>> C7126u<T> m19553g() {
        return f16981d;
    }

    /* renamed from: j */
    private int m19550j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo19345l() == C7118t1.EnumC7125c.MESSAGE && !key.mo19347f() && !key.mo19344s()) {
            if (value instanceof C7015d0) {
                return CodedOutputStream.m20378A(entry.getKey().mo19348d(), (C7015d0) value);
            }
            return CodedOutputStream.m20370E(entry.getKey().mo19348d(), (InterfaceC7100r0) value);
        }
        return m19554f(key, value);
    }

    /* renamed from: l */
    static int m19548l(C7118t1.EnumC7120b enumC7120b, boolean z) {
        if (z) {
            return 2;
        }
        return enumC7120b.m19560b();
    }

    /* renamed from: p */
    private static <T extends InterfaceC7128b<T>> boolean m19544p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo19345l() == C7118t1.EnumC7125c.MESSAGE) {
            if (key.mo19347f()) {
                for (InterfaceC7100r0 interfaceC7100r0 : (List) entry.getValue()) {
                    if (!interfaceC7100r0.mo19363h()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC7100r0) {
                    if (!((InterfaceC7100r0) value).mo19363h()) {
                        return false;
                    }
                } else if (value instanceof C7015d0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    private static boolean m19543q(C7118t1.EnumC7120b enumC7120b, Object obj) {
        C6997a0.m20235a(obj);
        switch (C7127a.f16985a[enumC7120b.m19561a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC7039i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C6997a0.InterfaceC7000c);
            case 9:
                return (obj instanceof InterfaceC7100r0) || (obj instanceof C7015d0);
            default:
                return false;
        }
    }

    /* renamed from: u */
    private void m19539u(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C7015d0) {
            value = ((C7015d0) value).m20215f();
        }
        if (key.mo19347f()) {
            Object m19552h = m19552h(key);
            if (m19552h == null) {
                m19552h = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m19552h).add(m19557c(obj));
            }
            this.f16982a.put(key, m19552h);
        } else if (key.mo19345l() == C7118t1.EnumC7125c.MESSAGE) {
            Object m19552h2 = m19552h(key);
            if (m19552h2 == null) {
                this.f16982a.put(key, m19557c(value));
                return;
            }
            this.f16982a.put(key, key.mo19351E(((InterfaceC7100r0) m19552h2).mo19353b(), (InterfaceC7100r0) value).build());
        } else {
            this.f16982a.put(key, m19557c(value));
        }
    }

    /* renamed from: v */
    public static <T extends InterfaceC7128b<T>> C7126u<T> m19538v() {
        return new C7126u<>();
    }

    /* renamed from: x */
    private void m19536x(T t, Object obj) {
        if (!m19543q(t.mo19346k(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.mo19348d()), t.mo19346k().m19561a(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static void m19535y(CodedOutputStream codedOutputStream, C7118t1.EnumC7120b enumC7120b, int i, Object obj) throws IOException {
        if (enumC7120b == C7118t1.EnumC7120b.f16952D) {
            codedOutputStream.m20375B0(i, (InterfaceC7100r0) obj);
            return;
        }
        codedOutputStream.mo20279X0(i, m19548l(enumC7120b, false));
        m19534z(codedOutputStream, enumC7120b, obj);
    }

    /* renamed from: z */
    static void m19534z(CodedOutputStream codedOutputStream, C7118t1.EnumC7120b enumC7120b, Object obj) throws IOException {
        switch (C7127a.f16986b[enumC7120b.ordinal()]) {
            case 1:
                codedOutputStream.m20309s0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.m20377A0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.m20363I0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo20275b1(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo20286G0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo20259y0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo20261w0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.m20318m0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.m20371D0((InterfaceC7100r0) obj);
                return;
            case 10:
                codedOutputStream.mo20284K0((InterfaceC7100r0) obj);
                return;
            case 11:
                if (obj instanceof AbstractC7039i) {
                    codedOutputStream.mo20263q0((AbstractC7039i) obj);
                    return;
                } else {
                    codedOutputStream.mo20280W0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof AbstractC7039i) {
                    codedOutputStream.mo20263q0((AbstractC7039i) obj);
                    return;
                } else {
                    codedOutputStream.m20316n0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo20277Z0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.m20355O0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.m20351Q0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.m20347S0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.m20343U0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C6997a0.InterfaceC7000c) {
                    codedOutputStream.m20305u0(((C6997a0.InterfaceC7000c) obj).mo20225d());
                    return;
                } else {
                    codedOutputStream.m20305u0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m19559a(T t, Object obj) {
        List list;
        if (t.mo19347f()) {
            m19536x(t, obj);
            Object m19552h = m19552h(t);
            if (m19552h == null) {
                list = new ArrayList();
                this.f16982a.put(t, list);
            } else {
                list = (List) m19552h;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C7126u<T> clone() {
        C7126u<T> m19538v = m19538v();
        for (int i = 0; i < this.f16982a.m19858k(); i++) {
            Map.Entry<T, Object> m19859j = this.f16982a.m19859j(i);
            m19538v.m19537w(m19859j.getKey(), m19859j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f16982a.m19856m()) {
            m19538v.m19537w(entry.getKey(), entry.getValue());
        }
        m19538v.f16984c = this.f16984c;
        return m19538v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7126u) {
            return this.f16982a.equals(((C7126u) obj).f16982a);
        }
        return false;
    }

    /* renamed from: h */
    public Object m19552h(T t) {
        Object obj = this.f16982a.get(t);
        return obj instanceof C7015d0 ? ((C7015d0) obj).m20215f() : obj;
    }

    public int hashCode() {
        return this.f16982a.hashCode();
    }

    /* renamed from: i */
    public int m19551i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f16982a.m19858k(); i2++) {
            i += m19550j(this.f16982a.m19859j(i2));
        }
        for (Map.Entry<T, Object> entry : this.f16982a.m19856m()) {
            i += m19550j(entry);
        }
        return i;
    }

    /* renamed from: k */
    public int m19549k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f16982a.m19858k(); i2++) {
            Map.Entry<T, Object> m19859j = this.f16982a.m19859j(i2);
            i += m19554f(m19859j.getKey(), m19859j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f16982a.m19856m()) {
            i += m19554f(entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m19547m() {
        return this.f16982a.isEmpty();
    }

    /* renamed from: n */
    public boolean m19546n() {
        return this.f16983b;
    }

    /* renamed from: o */
    public boolean m19545o() {
        for (int i = 0; i < this.f16982a.m19858k(); i++) {
            if (!m19544p(this.f16982a.m19859j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f16982a.m19856m()) {
            if (!m19544p(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public Iterator<Map.Entry<T, Object>> m19542r() {
        if (this.f16984c) {
            return new C7015d0.C7018c(this.f16982a.entrySet().iterator());
        }
        return this.f16982a.entrySet().iterator();
    }

    /* renamed from: s */
    public void m19541s() {
        if (this.f16983b) {
            return;
        }
        this.f16982a.mo19850p();
        this.f16983b = true;
    }

    /* renamed from: t */
    public void m19540t(C7126u<T> c7126u) {
        for (int i = 0; i < c7126u.f16982a.m19858k(); i++) {
            m19539u(c7126u.f16982a.m19859j(i));
        }
        for (Map.Entry<T, Object> entry : c7126u.f16982a.m19856m()) {
            m19539u(entry);
        }
    }

    /* renamed from: w */
    public void m19537w(T t, Object obj) {
        if (t.mo19347f()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    m19536x(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m19536x(t, obj);
        }
        if (obj instanceof C7015d0) {
            this.f16984c = true;
        }
        this.f16982a.put(t, obj);
    }

    private C7126u(boolean z) {
        this(C7066k1.m19853q(0));
        m19541s();
    }

    private C7126u(C7066k1<T, Object> c7066k1) {
        this.f16982a = c7066k1;
        m19541s();
    }
}
