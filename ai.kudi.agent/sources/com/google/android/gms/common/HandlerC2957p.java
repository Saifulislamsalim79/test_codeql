package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p272h.p286c.p287a.p300b.p307d.p310c.HandlerC8416f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.p */
/* loaded from: classes2.dex */
public final class HandlerC2957p extends HandlerC8416f {

    /* renamed from: a */
    private final Context f8134a;

    /* renamed from: b */
    final /* synthetic */ C2832e f8135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2957p(C2832e c2832e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f8135b = c2832e;
        this.f8134a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int mo31846g = this.f8135b.mo31846g(this.f8134a);
        if (this.f8135b.mo31843j(mo31846g)) {
            this.f8135b.m31862q(this.f8134a, mo31846g);
        }
    }
}
