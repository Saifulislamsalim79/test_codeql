package com.google.firebase.perf.metrics.p180d;

import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p179k.C6648c;
/* compiled from: FirebasePerfApplicationInfoValidator.java */
/* renamed from: com.google.firebase.perf.metrics.d.a */
/* loaded from: classes2.dex */
public class C6697a extends AbstractC6701e {

    /* renamed from: b */
    private static final C6609a f16105b = C6609a.m21475e();

    /* renamed from: a */
    private final C6648c f16106a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6697a(C6648c c6648c) {
        this.f16106a = c6648c;
    }

    /* renamed from: g */
    private boolean m21089g() {
        C6648c c6648c = this.f16106a;
        if (c6648c == null) {
            f16105b.m21471i("ApplicationInfo is null");
            return false;
        } else if (!c6648c.m21354d0()) {
            f16105b.m21471i("GoogleAppId is null");
            return false;
        } else if (!this.f16106a.m21356b0()) {
            f16105b.m21471i("AppInstanceId is null");
            return false;
        } else if (!this.f16106a.m21355c0()) {
            f16105b.m21471i("ApplicationProcessState is null");
            return false;
        } else if (this.f16106a.m21357a0()) {
            if (!this.f16106a.m21360X().m21383W()) {
                f16105b.m21471i("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.f16106a.m21360X().m21382X()) {
                return true;
            } else {
                f16105b.m21471i("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        } else {
            return true;
        }
    }

    @Override // com.google.firebase.perf.metrics.p180d.AbstractC6701e
    /* renamed from: c */
    public boolean mo21063c() {
        if (m21089g()) {
            return true;
        }
        f16105b.m21471i("ApplicationInfo is invalid");
        return false;
    }
}
