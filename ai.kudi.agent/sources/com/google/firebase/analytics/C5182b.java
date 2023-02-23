package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4046w2;
import com.google.android.gms.measurement.internal.InterfaceC4256j7;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* renamed from: com.google.firebase.analytics.b */
/* loaded from: classes2.dex */
final class C5182b implements InterfaceC4256j7 {

    /* renamed from: a */
    final /* synthetic */ C4046w2 f12916a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5182b(C4046w2 c4046w2) {
        this.f12916a = c4046w2;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: a */
    public final List<Bundle> mo25443a(String str, String str2) {
        return this.f12916a.m28699z(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: b */
    public final String mo25442b() {
        return this.f12916a.m28703v();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: c */
    public final Map<String, Object> mo25441c(String str, String str2, boolean z) {
        return this.f12916a.m28733A(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: d */
    public final void mo25440d(Bundle bundle) {
        this.f12916a.m28722c(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: e */
    public final int mo25439e(String str) {
        return this.f12916a.m28710o(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: f */
    public final void mo25438f(String str, String str2, Bundle bundle) {
        this.f12916a.m28725I(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: g */
    public final void mo25437g(String str) {
        this.f12916a.m28729E(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: h */
    public final String mo25436h() {
        return this.f12916a.m28702w();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: i */
    public final void mo25435i(String str, String str2, Bundle bundle) {
        this.f12916a.m28728F(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: j */
    public final void mo25434j(String str) {
        this.f12916a.m28727G(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: n */
    public final String mo25433n() {
        return this.f12916a.m28701x();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    /* renamed from: o */
    public final String mo25432o() {
        return this.f12916a.m28700y();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4256j7
    public final long zzb() {
        return this.f12916a.m28709p();
    }
}
