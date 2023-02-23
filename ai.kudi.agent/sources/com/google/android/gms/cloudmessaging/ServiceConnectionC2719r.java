package com.google.android.gms.cloudmessaging;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.p101n.C2951a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p287a.p300b.p307d.p311d.HandlerC8422f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.r */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2719r implements ServiceConnection {

    /* renamed from: c */
    C2720s f7661c;

    /* renamed from: f */
    final /* synthetic */ C2724w f7664f;

    /* renamed from: a */
    int f7659a = 0;

    /* renamed from: b */
    final Messenger f7660b = new Messenger(new HandlerC8422f(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.k
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC2719r serviceConnectionC2719r = ServiceConnectionC2719r.this;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (serviceConnectionC2719r) {
                AbstractC2722u<?> abstractC2722u = serviceConnectionC2719r.f7663e.get(i);
                if (abstractC2722u == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                serviceConnectionC2719r.f7663e.remove(i);
                serviceConnectionC2719r.m32123f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC2722u.m32120c(new zzq(4, "Not supported by GmsCore", null));
                    return true;
                }
                abstractC2722u.mo32118a(data);
                return true;
            }
        }
    }));

    /* renamed from: d */
    final Queue<AbstractC2722u<?>> f7662d = new ArrayDeque();

    /* renamed from: e */
    final SparseArray<AbstractC2722u<?>> f7663e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC2719r(C2724w c2724w, C2718q c2718q) {
        this.f7664f = c2724w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m32128a(int i, String str) {
        m32127b(i, str, null);
    }

    /* renamed from: b */
    final synchronized void m32127b(int i, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f7659a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            this.f7659a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f7659a = 4;
        C2951a.m31567b().m31566c(C2724w.m32116a(this.f7664f), this);
        zzq zzqVar = new zzq(i, str, th);
        for (AbstractC2722u<?> abstractC2722u : this.f7662d) {
            abstractC2722u.m32120c(zzqVar);
        }
        this.f7662d.clear();
        for (int i3 = 0; i3 < this.f7663e.size(); i3++) {
            this.f7663e.valueAt(i3).m32120c(zzqVar);
        }
        this.f7663e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m32126c() {
        C2724w.m32112e(this.f7664f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.m
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC2722u<?> poll;
                final ServiceConnectionC2719r serviceConnectionC2719r = ServiceConnectionC2719r.this;
                while (true) {
                    synchronized (serviceConnectionC2719r) {
                        if (serviceConnectionC2719r.f7659a != 2) {
                            return;
                        }
                        if (serviceConnectionC2719r.f7662d.isEmpty()) {
                            serviceConnectionC2719r.m32123f();
                            return;
                        }
                        poll = serviceConnectionC2719r.f7662d.poll();
                        serviceConnectionC2719r.f7663e.put(poll.f7667a, poll);
                        C2724w.m32112e(serviceConnectionC2719r.f7664f).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                ServiceConnectionC2719r.this.m32124e(poll.f7667a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context m32116a = C2724w.m32116a(serviceConnectionC2719r.f7664f);
                    Messenger messenger = serviceConnectionC2719r.f7660b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f7669c;
                    obtain.arg1 = poll.f7667a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo32117b());
                    bundle.putString("pkg", m32116a.getPackageName());
                    bundle.putBundle(TransactionBreakDownItemType.DATA, poll.f7670d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC2719r.f7661c.m32121a(obtain);
                    } catch (RemoteException e) {
                        serviceConnectionC2719r.m32128a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void m32125d() {
        if (this.f7659a == 1) {
            m32128a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void m32124e(int i) {
        AbstractC2722u<?> abstractC2722u = this.f7663e.get(i);
        if (abstractC2722u != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f7663e.remove(i);
            abstractC2722u.m32120c(new zzq(3, "Timed out waiting for response", null));
            m32123f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void m32123f() {
        if (this.f7659a == 2 && this.f7662d.isEmpty() && this.f7663e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f7659a = 3;
            C2951a.m31567b().m31566c(C2724w.m32116a(this.f7664f), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean m32122g(AbstractC2722u<?> abstractC2722u) {
        int i = this.f7659a;
        if (i != 0) {
            if (i == 1) {
                this.f7662d.add(abstractC2722u);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                this.f7662d.add(abstractC2722u);
                m32126c();
                return true;
            }
        }
        this.f7662d.add(abstractC2722u);
        com.google.android.gms.common.internal.s.m(this.f7659a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f7659a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!C2951a.m31567b().m31568a(C2724w.m32116a(this.f7664f), intent, this, 1)) {
                m32128a(0, "Unable to bind to service");
            } else {
                C2724w.m32112e(this.f7664f).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC2719r.this.m32125d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            m32127b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        C2724w.m32112e(this.f7664f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.o
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2719r serviceConnectionC2719r = ServiceConnectionC2719r.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC2719r) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC2719r.m32128a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC2719r.f7661c = new C2720s(iBinder2);
                            serviceConnectionC2719r.f7659a = 2;
                            serviceConnectionC2719r.m32126c();
                        } catch (RemoteException e) {
                            serviceConnectionC2719r.m32128a(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        C2724w.m32112e(this.f7664f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.l
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2719r.this.m32128a(2, "Service disconnected");
            }
        });
    }
}
