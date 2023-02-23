package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.internal.C4245i7;
import com.google.android.gms.measurement.internal.b5;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.b */
/* loaded from: classes2.dex */
final class C4142b extends AbstractC4145e {

    /* renamed from: a */
    private final b5 f9935a;

    /* renamed from: b */
    private final C4245i7 f9936b;

    public C4142b(b5 b5Var) {
        super(null);
        s.j(b5Var);
        this.f9935a = b5Var;
        this.f9936b = b5Var.I();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: a */
    public final List<Bundle> mo25443a(String str, String str2) {
        return this.f9936b.m28138b0(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: b */
    public final String mo25442b() {
        return this.f9936b.m28142X();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: c */
    public final Map<String, Object> mo25441c(String str, String str2, boolean z) {
        return this.f9936b.m28137c0(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: d */
    public final void mo25440d(Bundle bundle) {
        this.f9936b.m28162D(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: e */
    public final int mo25439e(String str) {
        this.f9936b.m28147S(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: f */
    public final void mo25438f(String str, String str2, Bundle bundle) {
        this.f9936b.m28127r(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: g */
    public final void mo25437g(String str) {
        this.f9935a.y().m28313l(str, this.f9935a.c().mo31535a());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: h */
    public final String mo25436h() {
        return this.f9936b.m28141Y();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: i */
    public final void mo25435i(String str, String str2, Bundle bundle) {
        this.f9935a.I().m28132h0(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: j */
    public final void mo25434j(String str) {
        this.f9935a.y().m28312m(str, this.f9935a.c().mo31535a());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: n */
    public final String mo25433n() {
        return this.f9936b.m28140Z();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: o */
    public final String mo25432o() {
        return this.f9936b.m28142X();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    public final long zzb() {
        return this.f9935a.N().r0();
    }
}
