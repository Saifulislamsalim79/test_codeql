package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* loaded from: classes2.dex */
public final class C4406w3 extends AbstractC4353r9 {
    public C4406w3(C4168ba c4168ba) {
        super(c4168ba);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4353r9
    /* renamed from: l */
    protected final boolean mo27835l() {
        return false;
    }

    /* renamed from: m */
    public final boolean m27905m() {
        m27986i();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((v5) this).a.f().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
