package p272h.p286c.p287a.p300b.p307d.p316i;

import com.google.android.gms.common.internal.s;
import com.google.firebase.encoders.p142h.C5973d;
import java.io.UnsupportedEncodingException;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.c9 */
/* loaded from: classes2.dex */
public final class C8567c9 {

    /* renamed from: a */
    private final C8610g6 f20270a;

    /* renamed from: b */
    private C8741s7 f20271b = new C8741s7();

    private C8567c9(C8610g6 c8610g6, int i) {
        this.f20270a = c8610g6;
        C8710p9.m15931a();
    }

    /* renamed from: c */
    public static C8567c9 m15984c(C8610g6 c8610g6) {
        return new C8567c9(c8610g6, 0);
    }

    /* renamed from: a */
    public final String m15986a() {
        C8763u7 m15957c = this.f20270a.m15965f().m15957c();
        if (m15957c == null || C8586e5.m15973b(m15957c.m15885k())) {
            return "NA";
        }
        String m15885k = m15957c.m15885k();
        s.j(m15885k);
        return m15885k;
    }

    /* renamed from: b */
    public final byte[] m15985b(int i, boolean z) {
        this.f20271b.m15914f(Boolean.valueOf(1 == (i ^ 1)));
        this.f20271b.m15915e(Boolean.FALSE);
        this.f20270a.m15966e(this.f20271b.m15907m());
        try {
            C8710p9.m15931a();
            if (i == 0) {
                C8630i6 m15965f = this.f20270a.m15965f();
                C5973d c5973d = new C5973d();
                c5973d.m23160g(C8738s4.f20601a);
                c5973d.m23159h(true);
                return c5973d.m23161f().mo23152b(m15965f).getBytes("utf-8");
            }
            C8630i6 m15965f2 = this.f20270a.m15965f();
            C8667m c8667m = new C8667m();
            C8738s4.f20601a.mo15620a(c8667m);
            return c8667m.m15939b().m15938a(m15965f2);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: d */
    public final C8567c9 m15983d(EnumC8587e6 enumC8587e6) {
        this.f20270a.m15968c(enumC8587e6);
        return this;
    }

    /* renamed from: e */
    public final C8567c9 m15982e(C8741s7 c8741s7) {
        this.f20271b = c8741s7;
        return this;
    }
}
