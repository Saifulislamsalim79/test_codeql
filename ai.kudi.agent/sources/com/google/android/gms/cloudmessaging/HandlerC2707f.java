package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;
import p272h.p286c.p287a.p300b.p307d.p311d.HandlerC8422f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.f */
/* loaded from: classes2.dex */
public final class HandlerC2707f extends HandlerC8422f {

    /* renamed from: a */
    final /* synthetic */ C2704d f7643a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2707f(C2704d c2704d, Looper looper) {
        super(looper);
        this.f7643a = c2704d;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2704d.m32137d(this.f7643a, message);
    }
}
