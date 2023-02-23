package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.internal.InterfaceC4256j7;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.c */
/* loaded from: classes2.dex */
final class C4143c extends AbstractC4145e {

    /* renamed from: a */
    private final InterfaceC4256j7 f9937a;

    public C4143c(InterfaceC4256j7 interfaceC4256j7) {
        super(null);
        s.j(interfaceC4256j7);
        this.f9937a = interfaceC4256j7;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: a */
    public final List<Bundle> mo25443a(String str, String str2) {
        return this.f9937a.mo25443a(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: b */
    public final String mo25442b() {
        return this.f9937a.mo25442b();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: c */
    public final Map<String, Object> mo25441c(String str, String str2, boolean z) {
        return this.f9937a.mo25441c(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: d */
    public final void mo25440d(Bundle bundle) {
        this.f9937a.mo25440d(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: e */
    public final int mo25439e(String str) {
        return this.f9937a.mo25439e(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: f */
    public final void mo25438f(String str, String str2, Bundle bundle) {
        this.f9937a.mo25438f(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: g */
    public final void mo25437g(String str) {
        this.f9937a.mo25437g(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: h */
    public final String mo25436h() {
        return this.f9937a.mo25436h();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: i */
    public final void mo25435i(String str, String str2, Bundle bundle) {
        this.f9937a.mo25435i(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: j */
    public final void mo25434j(String str) {
        this.f9937a.mo25434j(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: n */
    public final String mo25433n() {
        return this.f9937a.mo25433n();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: o */
    public final String mo25432o() {
        return this.f9937a.mo25432o();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    public final long zzb() {
        return this.f9937a.zzb();
    }
}
