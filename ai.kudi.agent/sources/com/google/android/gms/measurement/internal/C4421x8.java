package com.google.android.gms.measurement.internal;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p272h.p286c.p287a.p300b.p301a.p302a.C8383a;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* loaded from: classes2.dex */
public final class C4421x8 extends AbstractC4353r9 {

    /* renamed from: d */
    private String f10800d;

    /* renamed from: e */
    private boolean f10801e;

    /* renamed from: f */
    private long f10802f;

    /* renamed from: g */
    public final C4163b4 f10803g;

    /* renamed from: h */
    public final C4163b4 f10804h;

    /* renamed from: i */
    public final C4163b4 f10805i;

    /* renamed from: j */
    public final C4163b4 f10806j;

    /* renamed from: k */
    public final C4163b4 f10807k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4421x8(C4168ba c4168ba) {
        super(c4168ba);
        g4 F = ((v5) this).a.F();
        F.getClass();
        this.f10803g = new C4163b4(F, "last_delete_stale", 0L);
        g4 F2 = ((v5) this).a.F();
        F2.getClass();
        this.f10804h = new C4163b4(F2, "backoff", 0L);
        g4 F3 = ((v5) this).a.F();
        F3.getClass();
        this.f10805i = new C4163b4(F3, "last_upload", 0L);
        g4 F4 = ((v5) this).a.F();
        F4.getClass();
        this.f10806j = new C4163b4(F4, "last_upload_attempt", 0L);
        g4 F5 = ((v5) this).a.F();
        F5.getClass();
        this.f10807k = new C4163b4(F5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4353r9
    /* renamed from: l */
    protected final boolean mo27835l() {
        return false;
    }

    @Deprecated
    /* renamed from: m */
    final Pair<String, Boolean> m27838m(String str) {
        h();
        long mo31535a = ((v5) this).a.c().mo31535a();
        String str2 = this.f10800d;
        if (str2 != null && mo31535a < this.f10802f) {
            return new Pair<>(str2, Boolean.valueOf(this.f10801e));
        }
        this.f10802f = mo31535a + ((v5) this).a.z().r(str, C4173c3.f10117b);
        C8383a.m16155d(true);
        try {
            C8383a.C8384a m16157b = C8383a.m16157b(((v5) this).a.f());
            this.f10800d = "";
            String m16149a = m16157b.m16149a();
            if (m16149a != null) {
                this.f10800d = m16149a;
            }
            this.f10801e = m16157b.m16148b();
        } catch (Exception e) {
            ((v5) this).a.b().q().m28013b("Unable to get advertising id", e);
            this.f10800d = "";
        }
        C8383a.m16155d(false);
        return new Pair<>(this.f10800d, Boolean.valueOf(this.f10801e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final Pair<String, Boolean> m27837n(String str, C4226h c4226h) {
        if (c4226h.m28183j()) {
            return m27838m(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: o */
    public final String m27836o(String str) {
        h();
        String str2 = (String) m27838m(str).first;
        MessageDigest s = ia.s();
        if (s == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, s.digest(str2.getBytes())));
    }
}
