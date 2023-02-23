package okhttp3.internal.http2;

import io.intercom.okhttp3.internal.http2.Header;
import p565l.C14229s;
import p565l.p566g0.C14148c;
import p576m.C14347f;
/* compiled from: Header.java */
/* renamed from: okhttp3.internal.http2.b */
/* loaded from: classes3.dex */
public final class C14482b {

    /* renamed from: d */
    public static final C14347f f31904d = C14347f.m2035m(":");

    /* renamed from: e */
    public static final C14347f f31905e = C14347f.m2035m(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: f */
    public static final C14347f f31906f = C14347f.m2035m(Header.TARGET_METHOD_UTF8);

    /* renamed from: g */
    public static final C14347f f31907g = C14347f.m2035m(Header.TARGET_PATH_UTF8);

    /* renamed from: h */
    public static final C14347f f31908h = C14347f.m2035m(Header.TARGET_SCHEME_UTF8);

    /* renamed from: i */
    public static final C14347f f31909i = C14347f.m2035m(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a */
    public final C14347f f31910a;

    /* renamed from: b */
    public final C14347f f31911b;

    /* renamed from: c */
    final int f31912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Header.java */
    /* renamed from: okhttp3.internal.http2.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14483a {
        /* renamed from: a */
        void m1559a(C14229s c14229s);
    }

    public C14482b(String str, String str2) {
        this(C14347f.m2035m(str), C14347f.m2035m(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14482b) {
            C14482b c14482b = (C14482b) obj;
            return this.f31910a.equals(c14482b.f31910a) && this.f31911b.equals(c14482b.f31911b);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f31910a.hashCode()) * 31) + this.f31911b.hashCode();
    }

    public String toString() {
        return C14148c.m2790r("%s: %s", this.f31910a.mo1965M(), this.f31911b.mo1965M());
    }

    public C14482b(C14347f c14347f, String str) {
        this(c14347f, C14347f.m2035m(str));
    }

    public C14482b(C14347f c14347f, C14347f c14347f2) {
        this.f31910a = c14347f;
        this.f31911b = c14347f2;
        this.f31912c = c14347f.mo1969A() + 32 + c14347f2.mo1969A();
    }
}
