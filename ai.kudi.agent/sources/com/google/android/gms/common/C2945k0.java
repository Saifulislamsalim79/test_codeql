package com.google.android.gms.common;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.k0 */
/* loaded from: classes2.dex */
final class C2945k0 extends C2947l0 {

    /* renamed from: e */
    private final Callable<String> f8116e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2945k0(Callable callable, C2943j0 c2943j0) {
        super(false, null, null);
        this.f8116e = callable;
    }

    @Override // com.google.android.gms.common.C2947l0
    /* renamed from: a */
    final String mo31575a() {
        try {
            return this.f8116e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
