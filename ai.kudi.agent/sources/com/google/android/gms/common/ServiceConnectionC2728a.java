package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.a */
/* loaded from: classes2.dex */
public class ServiceConnectionC2728a implements ServiceConnection {

    /* renamed from: a */
    boolean f7683a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f7684b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m32107a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.s.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f7683a) {
            this.f7683a = true;
            IBinder poll = this.f7684b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7684b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
