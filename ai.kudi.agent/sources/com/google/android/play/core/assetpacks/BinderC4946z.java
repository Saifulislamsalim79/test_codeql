package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC4994q0;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4989o;
import com.google.android.play.core.internal.InterfaceC5000t0;
import java.util.Arrays;
/* renamed from: com.google.android.play.core.assetpacks.z */
/* loaded from: classes2.dex */
final class BinderC4946z extends AbstractBinderC4994q0 {

    /* renamed from: a */
    private final C4957a f12601a = new C4957a("AssetPackExtractionService");

    /* renamed from: b */
    private final Context f12602b;

    /* renamed from: c */
    private final AssetPackExtractionService f12603c;

    /* renamed from: d */
    private final C4840b0 f12604d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4946z(Context context, AssetPackExtractionService assetPackExtractionService, C4840b0 c4840b0) {
        this.f12602b = context;
        this.f12603c = assetPackExtractionService;
        this.f12604d = c4840b0;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4996r0
    /* renamed from: F */
    public final void mo25884F(Bundle bundle, InterfaceC5000t0 interfaceC5000t0) throws RemoteException {
        String[] packagesForUid;
        this.f12601a.m25957c("updateServiceState AIDL call", new Object[0]);
        if (C4989o.m25903a(this.f12602b) && (packagesForUid = this.f12602b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            interfaceC5000t0.mo25879k(this.f12603c.m26175a(bundle), new Bundle());
            return;
        }
        interfaceC5000t0.mo25881a(new Bundle());
        this.f12603c.m26174b();
    }

    @Override // com.google.android.play.core.internal.InterfaceC4996r0
    /* renamed from: X */
    public final void mo25883X(InterfaceC5000t0 interfaceC5000t0) throws RemoteException {
        this.f12604d.m26135z();
        interfaceC5000t0.mo25880b(new Bundle());
    }
}
