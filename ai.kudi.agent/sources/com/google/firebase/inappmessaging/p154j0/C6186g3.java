package com.google.firebase.inappmessaging.p154j0;

import android.app.Application;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import p272h.p286c.p287a.p300b.p319e.C9205a;
/* compiled from: ProviderInstaller.java */
/* renamed from: com.google.firebase.inappmessaging.j0.g3 */
/* loaded from: classes2.dex */
public class C6186g3 {

    /* renamed from: a */
    private final Application f15047a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6186g3(Application application) {
        this.f15047a = application;
    }

    /* renamed from: a */
    public void m22595a() {
        try {
            C9205a.m15474a(this.f15047a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
            e.printStackTrace();
        }
    }
}
