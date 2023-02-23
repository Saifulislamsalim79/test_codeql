package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.p102o.C2955b;
import com.google.android.gms.common.p102o.C2956c;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* loaded from: classes2.dex */
public final class C4253j4 {

    /* renamed from: a */
    final b5 f10394a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4253j4(C4168ba c4168ba) {
        this.f10394a = c4168ba.m28372a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m28107a() {
        try {
            C2955b m31548a = C2956c.m31548a(this.f10394a.f());
            if (m31548a != null) {
                return m31548a.m31551e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f10394a.b().v().m28014a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f10394a.b().v().m28013b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
