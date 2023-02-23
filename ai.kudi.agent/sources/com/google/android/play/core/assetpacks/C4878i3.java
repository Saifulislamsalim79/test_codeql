package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4987n;
import com.google.android.play.core.internal.InterfaceC4961b0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.google.android.play.core.assetpacks.i3 */
/* loaded from: classes2.dex */
public final class C4878i3 implements InterfaceC4961b0<Executor> {
    /* renamed from: b */
    public static Executor m26108b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ThreadFactoryC4945y2.f12600c);
        C4987n.m25911g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Executor mo15000a() {
        return m26108b();
    }
}
