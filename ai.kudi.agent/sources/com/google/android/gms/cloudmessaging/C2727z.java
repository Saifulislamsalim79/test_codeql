package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.InterfaceC4450c;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.z */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2727z implements InterfaceC4450c {

    /* renamed from: a */
    public static final /* synthetic */ C2727z f7681a = new C2727z();

    private /* synthetic */ C2727z() {
    }

    @Override // com.google.android.gms.tasks.InterfaceC4450c
    /* renamed from: a */
    public final Object mo20893a(com.google.android.gms.tasks.j jVar) {
        if (jVar.p()) {
            return (Bundle) jVar.l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(jVar.k());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", jVar.k());
    }
}
