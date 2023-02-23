package retrofit2;

import java.io.IOException;
import p565l.AbstractC14120b0;
import p565l.C14116a0;
import p565l.C14226q;
import p565l.C14229s;
import p565l.C14231t;
import p565l.C14235v;
import p565l.C14236w;
import p576m.C14342c;
import p576m.InterfaceC14345d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RequestBuilder.java */
/* renamed from: retrofit2.k */
/* loaded from: classes3.dex */
public final class C14838k {

    /* renamed from: k */
    private static final char[] f33133k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f33134a;

    /* renamed from: b */
    private final C14231t f33135b;

    /* renamed from: c */
    private String f33136c;

    /* renamed from: d */
    private C14231t.C14232a f33137d;

    /* renamed from: e */
    private final C14116a0.C14117a f33138e;

    /* renamed from: f */
    private C14235v f33139f;

    /* renamed from: g */
    private final boolean f33140g;

    /* renamed from: h */
    private C14236w.C14237a f33141h;

    /* renamed from: i */
    private C14226q.C14227a f33142i;

    /* renamed from: j */
    private AbstractC14120b0 f33143j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RequestBuilder.java */
    /* renamed from: retrofit2.k$a */
    /* loaded from: classes3.dex */
    public static class C14839a extends AbstractC14120b0 {

        /* renamed from: a */
        private final AbstractC14120b0 f33144a;

        /* renamed from: b */
        private final C14235v f33145b;

        C14839a(AbstractC14120b0 abstractC14120b0, C14235v c14235v) {
            this.f33144a = abstractC14120b0;
            this.f33145b = c14235v;
        }

        @Override // p565l.AbstractC14120b0
        public long contentLength() throws IOException {
            return this.f33144a.contentLength();
        }

        @Override // p565l.AbstractC14120b0
        public C14235v contentType() {
            return this.f33145b;
        }

        @Override // p565l.AbstractC14120b0
        public void writeTo(InterfaceC14345d interfaceC14345d) throws IOException {
            this.f33144a.writeTo(interfaceC14345d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14838k(String str, C14231t c14231t, String str2, C14229s c14229s, C14235v c14235v, boolean z, boolean z2, boolean z3) {
        this.f33134a = str;
        this.f33135b = c14231t;
        this.f33136c = str2;
        C14116a0.C14117a c14117a = new C14116a0.C14117a();
        this.f33138e = c14117a;
        this.f33139f = c14235v;
        this.f33140g = z;
        if (c14229s != null) {
            c14117a.m2908e(c14229s);
        }
        if (z2) {
            this.f33142i = new C14226q.C14227a();
        } else if (z3) {
            C14236w.C14237a c14237a = new C14236w.C14237a();
            this.f33141h = c14237a;
            c14237a.m2467d(C14236w.f31176f);
        }
    }

    /* renamed from: h */
    private static String m287h(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                C14342c c14342c = new C14342c();
                c14342c.m2048i1(str, 0, i);
                m286i(c14342c, str, i, length, z);
                return c14342c.m2044x0();
            }
        }
        return str;
    }

    /* renamed from: i */
    private static void m286i(C14342c c14342c, String str, int i, int i2, boolean z) {
        C14342c c14342c2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                    c14342c.m2047j1(codePointAt);
                } else {
                    if (c14342c2 == null) {
                        c14342c2 = new C14342c();
                    }
                    c14342c2.m2047j1(codePointAt);
                    while (!c14342c2.mo1987l()) {
                        int readByte = c14342c2.readByte() & 255;
                        c14342c.m2061Z0(37);
                        c14342c.m2061Z0(f33133k[(readByte >> 4) & 15]);
                        c14342c.m2061Z0(f33133k[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m294a(String str, String str2, boolean z) {
        if (z) {
            this.f33142i.m2560b(str, str2);
        } else {
            this.f33142i.m2561a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m293b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            C14235v m2474d = C14235v.m2474d(str2);
            if (m2474d != null) {
                this.f33139f = m2474d;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: " + str2);
        }
        this.f33138e.m2912a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m292c(C14229s c14229s, AbstractC14120b0 abstractC14120b0) {
        this.f33141h.m2470a(c14229s, abstractC14120b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m291d(C14236w.C14238b c14238b) {
        this.f33141h.m2469b(c14238b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m290e(String str, String str2, boolean z) {
        String str3 = this.f33136c;
        if (str3 != null) {
            this.f33136c = str3.replace("{" + str + "}", m287h(str2, z));
            return;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m289f(String str, String str2, boolean z) {
        String str3 = this.f33136c;
        if (str3 != null) {
            C14231t.C14232a m2512q = this.f33135b.m2512q(str3);
            this.f33137d = m2512q;
            if (m2512q != null) {
                this.f33136c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f33135b + ", Relative: " + this.f33136c);
            }
        }
        if (z) {
            this.f33137d.m2502a(str, str2);
        } else {
            this.f33137d.m2501b(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C14116a0 m288g() {
        C14231t m2532D;
        C14231t.C14232a c14232a = this.f33137d;
        if (c14232a != null) {
            m2532D = c14232a.m2500c();
        } else {
            m2532D = this.f33135b.m2532D(this.f33136c);
            if (m2532D == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f33135b + ", Relative: " + this.f33136c);
            }
        }
        C14839a c14839a = this.f33143j;
        if (c14839a == null) {
            C14226q.C14227a c14227a = this.f33142i;
            if (c14227a != null) {
                c14839a = c14227a.m2559c();
            } else {
                C14236w.C14237a c14237a = this.f33141h;
                if (c14237a != null) {
                    c14839a = c14237a.m2468c();
                } else if (this.f33140g) {
                    c14839a = AbstractC14120b0.create((C14235v) null, new byte[0]);
                }
            }
        }
        C14235v c14235v = this.f33139f;
        if (c14235v != null) {
            if (c14839a != null) {
                c14839a = new C14839a(c14839a, c14235v);
            } else {
                this.f33138e.m2912a("Content-Type", c14235v.toString());
            }
        }
        C14116a0.C14117a c14117a = this.f33138e;
        c14117a.m2904i(m2532D);
        c14117a.m2907f(this.f33134a, c14839a);
        return c14117a.m2911b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m285j(AbstractC14120b0 abstractC14120b0) {
        this.f33143j = abstractC14120b0;
    }
}
