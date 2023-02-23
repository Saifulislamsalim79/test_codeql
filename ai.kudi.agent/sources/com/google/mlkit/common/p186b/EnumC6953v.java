package com.google.mlkit.common.p186b;

import android.os.Handler;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.v */
/* loaded from: classes2.dex */
public enum EnumC6953v implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = C6935g.m20453a().f16629a;
        handler.post(runnable);
    }
}
