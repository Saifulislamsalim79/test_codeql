package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.l1 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2892l1 implements ServiceConnection {

    /* renamed from: a */
    private final int f8028a;

    /* renamed from: b */
    final /* synthetic */ AbstractC2854c f8029b;

    public ServiceConnectionC2892l1(AbstractC2854c abstractC2854c, int i) {
        this.f8029b = abstractC2854c;
        this.f8028a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC2896n c2940z0;
        AbstractC2854c abstractC2854c = this.f8029b;
        if (iBinder == null) {
            AbstractC2854c.m31789c0(abstractC2854c, 16);
            return;
        }
        obj = abstractC2854c.f7947h;
        synchronized (obj) {
            AbstractC2854c abstractC2854c2 = this.f8029b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2896n)) {
                c2940z0 = (InterfaceC2896n) queryLocalInterface;
            } else {
                c2940z0 = new C2940z0(iBinder);
            }
            abstractC2854c2.f7948i = c2940z0;
        }
        this.f8029b.m31787d0(0, null, this.f8028a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f8029b.f7947h;
        synchronized (obj) {
            this.f8029b.f7948i = null;
        }
        Handler handler = this.f8029b.f7945f;
        handler.sendMessage(handler.obtainMessage(6, this.f8028a, 1));
    }
}
