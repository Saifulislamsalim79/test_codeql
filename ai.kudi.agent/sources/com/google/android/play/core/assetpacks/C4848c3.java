package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4987n;
import com.google.android.play.core.internal.InterfaceC4961b0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.google.android.play.core.assetpacks.c3 */
/* loaded from: classes2.dex */
public final class C4848c3 implements InterfaceC4961b0<Executor> {
    /* renamed from: b */
    public static Executor m26128b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ThreadFactoryC4941x2.f12595c);
        C4987n.m25911g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Executor mo15000a() {
        return m26128b();
    }
}
