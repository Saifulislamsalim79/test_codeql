package com.google.firebase.perf.p178j;

import android.os.Bundle;
import com.google.firebase.perf.p176h.C6609a;
/* compiled from: ImmutableBundle.java */
/* renamed from: com.google.firebase.perf.j.d */
/* loaded from: classes2.dex */
public final class C6627d {

    /* renamed from: b */
    private static final C6609a f15999b = C6609a.m21475e();

    /* renamed from: a */
    private final Bundle f16000a;

    public C6627d() {
        this(new Bundle());
    }

    /* renamed from: d */
    private C6628e<Integer> m21411d(String str) {
        if (!m21414a(str)) {
            return C6628e.m21409a();
        }
        try {
            return C6628e.m21408b((Integer) this.f16000a.get(str));
        } catch (ClassCastException e) {
            f15999b.m21478b("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return C6628e.m21409a();
        }
    }

    /* renamed from: a */
    public boolean m21414a(String str) {
        return str != null && this.f16000a.containsKey(str);
    }

    /* renamed from: b */
    public C6628e<Boolean> m21413b(String str) {
        if (!m21414a(str)) {
            return C6628e.m21409a();
        }
        try {
            return C6628e.m21408b((Boolean) this.f16000a.get(str));
        } catch (ClassCastException e) {
            f15999b.m21478b("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return C6628e.m21409a();
        }
    }

    /* renamed from: c */
    public C6628e<Float> m21412c(String str) {
        if (!m21414a(str)) {
            return C6628e.m21409a();
        }
        try {
            return C6628e.m21408b((Float) this.f16000a.get(str));
        } catch (ClassCastException e) {
            f15999b.m21478b("Metadata key %s contains type other than float: %s", str, e.getMessage());
            return C6628e.m21409a();
        }
    }

    /* renamed from: e */
    public C6628e<Long> m21410e(String str) {
        C6628e<Integer> m21411d = m21411d(str);
        if (m21411d.m21406d()) {
            return C6628e.m21405e(Long.valueOf(m21411d.m21407c().intValue()));
        }
        return C6628e.m21409a();
    }

    public C6627d(Bundle bundle) {
        this.f16000a = (Bundle) bundle.clone();
    }
}
