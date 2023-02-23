package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.p131s.p136j0.p137m.C5824b;
import com.google.firebase.database.p131s.p136j0.p137m.C5825c;
import com.google.firebase.database.p131s.p136j0.p137m.C5828e;
import com.google.firebase.database.p131s.p136j0.p137m.InterfaceC5826d;
import com.google.firebase.database.p139u.AbstractC5937h;
import com.google.firebase.database.p139u.C5920a;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5935f;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5943l;
import com.google.firebase.database.p139u.C5948o;
import com.google.firebase.database.p139u.C5950q;
import com.google.firebase.database.p139u.C5951r;
import com.google.firebase.database.p139u.C5953t;
import com.google.firebase.database.p139u.InterfaceC5945n;
import com.google.firebase.database.p140v.C5957b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: QueryParams.java */
/* renamed from: com.google.firebase.database.s.j0.h */
/* loaded from: classes2.dex */
public final class C5811h {

    /* renamed from: i */
    public static final C5811h f14269i = new C5811h();

    /* renamed from: a */
    private Integer f14270a;

    /* renamed from: b */
    private EnumC5813b f14271b;

    /* renamed from: c */
    private InterfaceC5945n f14272c = null;

    /* renamed from: d */
    private C5921b f14273d = null;

    /* renamed from: e */
    private InterfaceC5945n f14274e = null;

    /* renamed from: f */
    private C5921b f14275f = null;

    /* renamed from: g */
    private AbstractC5937h f14276g = C5950q.m23202j();

    /* renamed from: h */
    private String f14277h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueryParams.java */
    /* renamed from: com.google.firebase.database.s.j0.h$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5812a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14278a;

        static {
            int[] iArr = new int[EnumC5813b.values().length];
            f14278a = iArr;
            try {
                iArr[EnumC5813b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14278a[EnumC5813b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueryParams.java */
    /* renamed from: com.google.firebase.database.s.j0.h$b */
    /* loaded from: classes2.dex */
    public enum EnumC5813b {
        LEFT,
        RIGHT
    }

    /* renamed from: a */
    public static C5811h m23664a(Map<String, Object> map) {
        C5811h c5811h = new C5811h();
        c5811h.f14270a = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            c5811h.f14272c = m23649p(C5948o.m23207a(map.get("sp")));
            String str = (String) map.get("sn");
            if (str != null) {
                c5811h.f14273d = C5921b.m23296g(str);
            }
        }
        if (map.containsKey("ep")) {
            c5811h.f14274e = m23649p(C5948o.m23207a(map.get("ep")));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                c5811h.f14275f = C5921b.m23296g(str2);
            }
        }
        String str3 = (String) map.get("vf");
        if (str3 != null) {
            c5811h.f14271b = str3.equals("l") ? EnumC5813b.LEFT : EnumC5813b.RIGHT;
        }
        String str4 = (String) map.get("i");
        if (str4 != null) {
            c5811h.f14276g = AbstractC5937h.m23246b(str4);
        }
        return c5811h;
    }

    /* renamed from: p */
    private static InterfaceC5945n m23649p(InterfaceC5945n interfaceC5945n) {
        if ((interfaceC5945n instanceof C5953t) || (interfaceC5945n instanceof C5920a) || (interfaceC5945n instanceof C5935f) || (interfaceC5945n instanceof C5936g)) {
            return interfaceC5945n;
        }
        if (interfaceC5945n instanceof C5943l) {
            return new C5935f(Double.valueOf(((Long) interfaceC5945n.getValue()).doubleValue()), C5951r.m23201a());
        }
        throw new IllegalStateException("Unexpected value passed to normalizeValue: " + interfaceC5945n.getValue());
    }

    /* renamed from: b */
    public AbstractC5937h m23663b() {
        return this.f14276g;
    }

    /* renamed from: c */
    public C5921b m23662c() {
        if (m23655j()) {
            C5921b c5921b = this.f14275f;
            return c5921b != null ? c5921b : C5921b.m23295h();
        }
        throw new IllegalArgumentException("Cannot get index end name if start has not been set");
    }

    /* renamed from: d */
    public InterfaceC5945n m23661d() {
        if (m23655j()) {
            return this.f14274e;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    /* renamed from: e */
    public C5921b m23660e() {
        if (m23653l()) {
            C5921b c5921b = this.f14273d;
            return c5921b != null ? c5921b : C5921b.m23294i();
        }
        throw new IllegalArgumentException("Cannot get index start name if start has not been set");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5811h.class != obj.getClass()) {
            return false;
        }
        C5811h c5811h = (C5811h) obj;
        Integer num = this.f14270a;
        if (num == null ? c5811h.f14270a == null : num.equals(c5811h.f14270a)) {
            AbstractC5937h abstractC5937h = this.f14276g;
            if (abstractC5937h == null ? c5811h.f14276g == null : abstractC5937h.equals(c5811h.f14276g)) {
                C5921b c5921b = this.f14275f;
                if (c5921b == null ? c5811h.f14275f == null : c5921b.equals(c5811h.f14275f)) {
                    InterfaceC5945n interfaceC5945n = this.f14274e;
                    if (interfaceC5945n == null ? c5811h.f14274e == null : interfaceC5945n.equals(c5811h.f14274e)) {
                        C5921b c5921b2 = this.f14273d;
                        if (c5921b2 == null ? c5811h.f14273d == null : c5921b2.equals(c5811h.f14273d)) {
                            InterfaceC5945n interfaceC5945n2 = this.f14272c;
                            if (interfaceC5945n2 == null ? c5811h.f14272c == null : interfaceC5945n2.equals(c5811h.f14272c)) {
                                return m23651n() == c5811h.m23651n();
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public InterfaceC5945n m23659f() {
        if (m23653l()) {
            return this.f14272c;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    /* renamed from: g */
    public int m23658g() {
        if (m23654k()) {
            return this.f14270a.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    /* renamed from: h */
    public InterfaceC5826d m23657h() {
        if (m23650o()) {
            return new C5824b(m23663b());
        }
        if (m23654k()) {
            return new C5825c(this);
        }
        return new C5828e(this);
    }

    public int hashCode() {
        Integer num = this.f14270a;
        int intValue = (((num != null ? num.intValue() : 0) * 31) + (m23651n() ? 1231 : 1237)) * 31;
        InterfaceC5945n interfaceC5945n = this.f14272c;
        int hashCode = (intValue + (interfaceC5945n != null ? interfaceC5945n.hashCode() : 0)) * 31;
        C5921b c5921b = this.f14273d;
        int hashCode2 = (hashCode + (c5921b != null ? c5921b.hashCode() : 0)) * 31;
        InterfaceC5945n interfaceC5945n2 = this.f14274e;
        int hashCode3 = (hashCode2 + (interfaceC5945n2 != null ? interfaceC5945n2.hashCode() : 0)) * 31;
        C5921b c5921b2 = this.f14275f;
        int hashCode4 = (hashCode3 + (c5921b2 != null ? c5921b2.hashCode() : 0)) * 31;
        AbstractC5937h abstractC5937h = this.f14276g;
        return hashCode4 + (abstractC5937h != null ? abstractC5937h.hashCode() : 0);
    }

    /* renamed from: i */
    public Map<String, Object> m23656i() {
        HashMap hashMap = new HashMap();
        if (m23653l()) {
            hashMap.put("sp", this.f14272c.getValue());
            C5921b c5921b = this.f14273d;
            if (c5921b != null) {
                hashMap.put("sn", c5921b.m23298b());
            }
        }
        if (m23655j()) {
            hashMap.put("ep", this.f14274e.getValue());
            C5921b c5921b2 = this.f14275f;
            if (c5921b2 != null) {
                hashMap.put("en", c5921b2.m23298b());
            }
        }
        Integer num = this.f14270a;
        if (num != null) {
            hashMap.put("l", num);
            EnumC5813b enumC5813b = this.f14271b;
            if (enumC5813b == null) {
                if (m23653l()) {
                    enumC5813b = EnumC5813b.LEFT;
                } else {
                    enumC5813b = EnumC5813b.RIGHT;
                }
            }
            int i = C5812a.f14278a[enumC5813b.ordinal()];
            if (i == 1) {
                hashMap.put("vf", "l");
            } else if (i == 2) {
                hashMap.put("vf", "r");
            }
        }
        if (!this.f14276g.equals(C5950q.m23202j())) {
            hashMap.put("i", this.f14276g.mo23189c());
        }
        return hashMap;
    }

    /* renamed from: j */
    public boolean m23655j() {
        return this.f14274e != null;
    }

    /* renamed from: k */
    public boolean m23654k() {
        return this.f14270a != null;
    }

    /* renamed from: l */
    public boolean m23653l() {
        return this.f14272c != null;
    }

    /* renamed from: m */
    public boolean m23652m() {
        return m23650o() && this.f14276g.equals(C5950q.m23202j());
    }

    /* renamed from: n */
    public boolean m23651n() {
        EnumC5813b enumC5813b = this.f14271b;
        return enumC5813b != null ? enumC5813b == EnumC5813b.LEFT : m23653l();
    }

    /* renamed from: o */
    public boolean m23650o() {
        return (m23653l() || m23655j() || m23654k()) ? false : true;
    }

    /* renamed from: q */
    public String m23648q() {
        if (this.f14277h == null) {
            try {
                this.f14277h = C5957b.m23178c(m23656i());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.f14277h;
    }

    public String toString() {
        return m23656i().toString();
    }
}
