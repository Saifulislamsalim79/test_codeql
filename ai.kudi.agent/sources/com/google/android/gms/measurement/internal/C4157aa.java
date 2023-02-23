package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3779f4;
import com.google.android.gms.internal.measurement.C3937p4;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.aa */
/* loaded from: classes2.dex */
public final class C4157aa {

    /* renamed from: a */
    C3937p4 f10011a;

    /* renamed from: b */
    List<Long> f10012b;

    /* renamed from: c */
    List<C3779f4> f10013c;

    /* renamed from: d */
    long f10014d;

    /* renamed from: e */
    final /* synthetic */ C4168ba f10015e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4157aa(C4168ba c4168ba, C4445z9 c4445z9) {
        this.f10015e = c4168ba;
    }

    /* renamed from: b */
    private static final long m28408b(C3779f4 c3779f4) {
        return ((c3779f4.m29613z() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m28409a(long j, C3779f4 c3779f4) {
        com.google.android.gms.common.internal.s.j(c3779f4);
        if (this.f10013c == null) {
            this.f10013c = new ArrayList();
        }
        if (this.f10012b == null) {
            this.f10012b = new ArrayList();
        }
        if (this.f10013c.size() <= 0 || m28408b(this.f10013c.get(0)) == m28408b(c3779f4)) {
            long mo29249b = this.f10014d + c3779f4.mo29249b();
            this.f10015e.m28381S();
            if (mo29249b >= Math.max(0, C4173c3.f10131i.m28406a(null).intValue())) {
                return false;
            }
            this.f10014d = mo29249b;
            this.f10013c.add(c3779f4);
            this.f10012b.add(Long.valueOf(j));
            int size = this.f10013c.size();
            this.f10015e.m28381S();
            return size < Math.max(1, C4173c3.f10133j.m28406a(null).intValue());
        }
        return false;
    }
}
