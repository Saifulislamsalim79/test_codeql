package com.google.android.play.core.assetpacks;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Bundle;
import com.google.android.play.core.internal.C4966c0;
/* renamed from: com.google.android.play.core.assetpacks.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4839b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC4839b m26169a(Bundle bundle, String str, C4939x0 c4939x0, InterfaceC4942y interfaceC4942y) {
        return m26168b(str, interfaceC4942y.mo25978b(bundle.getInt(C4966c0.m25949a(TransactionField.STATUS, str)), str), bundle.getInt(C4966c0.m25949a("error_code", str)), bundle.getLong(C4966c0.m25949a("bytes_downloaded", str)), bundle.getLong(C4966c0.m25949a("total_bytes_to_download", str)), c4939x0.m25984c(str));
    }

    /* renamed from: b */
    public static AbstractC4839b m26168b(String str, int i, int i2, long j, long j2, double d) {
        return new C4865g0(str, i, i2, j, j2, (int) Math.rint(100.0d * d));
    }

    /* renamed from: c */
    public abstract long mo26119c();

    /* renamed from: d */
    public abstract int mo26118d();

    /* renamed from: e */
    public abstract String mo26117e();

    /* renamed from: f */
    public abstract int mo26116f();

    /* renamed from: g */
    public abstract long mo26115g();

    /* renamed from: h */
    public abstract int mo26114h();
}
