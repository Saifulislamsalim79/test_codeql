package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.android.gms.common.internal.s;
import com.google.firebase.encoders.p142h.C5973d;
import java.io.UnsupportedEncodingException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.oc */
/* loaded from: classes2.dex */
public final class C9044oc {

    /* renamed from: a */
    private final C9011m9 f21426a;

    /* renamed from: b */
    private C8863cb f21427b = new C8863cb();

    /* renamed from: c */
    private final int f21428c;

    private C9044oc(C9011m9 c9011m9, int i) {
        this.f21426a = c9011m9;
        C9175xc.m15514a();
        this.f21428c = i;
    }

    /* renamed from: d */
    public static C9044oc m15586d(C9011m9 c9011m9) {
        return new C9044oc(c9011m9, 0);
    }

    /* renamed from: e */
    public static C9044oc m15585e(C9011m9 c9011m9, int i) {
        return new C9044oc(c9011m9, 1);
    }

    /* renamed from: a */
    public final int m15589a() {
        return this.f21428c;
    }

    /* renamed from: b */
    public final String m15588b() {
        C8893eb m15590f = this.f21426a.m15627j().m15590f();
        if (m15590f == null || C8866d.m15768b(m15590f.m15751k())) {
            return "NA";
        }
        String m15751k = m15590f.m15751k();
        s.j(m15751k);
        return m15751k;
    }

    /* renamed from: c */
    public final byte[] m15587c(int i, boolean z) {
        this.f21427b.m15791f(Boolean.valueOf(1 == (i ^ 1)));
        this.f21427b.m15792e(Boolean.FALSE);
        this.f21426a.m15628i(this.f21427b.m15784m());
        try {
            C9175xc.m15514a();
            if (i == 0) {
                C9041o9 m15627j = this.f21426a.m15627j();
                C5973d c5973d = new C5973d();
                c5973d.m23160g(C9024n7.f21326a);
                c5973d.m23159h(true);
                return c5973d.m23161f().mo23152b(m15627j).getBytes("utf-8");
            }
            C9041o9 m15627j2 = this.f21426a.m15627j();
            C8824a2 c8824a2 = new C8824a2();
            C9024n7.f21326a.mo15620a(c8824a2);
            return c8824a2.m15832b().m15810a(m15627j2);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: f */
    public final C9044oc m15584f(EnumC8996l9 enumC8996l9) {
        this.f21426a.m15631f(enumC8996l9);
        return this;
    }

    /* renamed from: g */
    public final C9044oc m15583g(C8863cb c8863cb) {
        this.f21427b = c8863cb;
        return this;
    }
}
