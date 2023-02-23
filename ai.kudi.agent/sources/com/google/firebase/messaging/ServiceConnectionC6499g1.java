package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.p101n.C2951a;
import com.google.android.gms.common.util.p103q.ThreadFactoryC2978a;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.firebase.messaging.ServiceConnectionC6499g1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.g1 */
/* loaded from: classes2.dex */
class ServiceConnectionC6499g1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f15671a;

    /* renamed from: b */
    private final Intent f15672b;

    /* renamed from: c */
    private final ScheduledExecutorService f15673c;

    /* renamed from: d */
    private final Queue<C6500a> f15674d;

    /* renamed from: e */
    private BinderC6488d1 f15675e;

    /* renamed from: f */
    private boolean f15676f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.g1$a */
    /* loaded from: classes2.dex */
    public static class C6500a {

        /* renamed from: a */
        final Intent f15677a;

        /* renamed from: b */
        private final C4465k<Void> f15678b = new C4465k<>();

        C6500a(Intent intent) {
            this.f15677a = intent;
        }

        /* renamed from: a */
        void m21812a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.f1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC6499g1.C6500a.this.m21809d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            m21810c().c(scheduledExecutorService, new InterfaceC4454e() { // from class: com.google.firebase.messaging.e1
                @Override // com.google.android.gms.tasks.InterfaceC4454e
                /* renamed from: a */
                public final void mo21856a(com.google.android.gms.tasks.j jVar) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m21811b() {
            this.f15678b.m27773e(null);
        }

        /* renamed from: c */
        com.google.android.gms.tasks.j<Void> m21810c() {
            return this.f15678b.m27777a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public /* synthetic */ void m21809d() {
            String action = this.f15677a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseMessaging", sb.toString());
            m21811b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC6499g1(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new ThreadFactoryC2978a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m21816a() {
        while (!this.f15674d.isEmpty()) {
            this.f15674d.poll().m21811b();
        }
    }

    /* renamed from: b */
    private synchronized void m21815b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f15674d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC6488d1 binderC6488d1 = this.f15675e;
            if (binderC6488d1 != null && binderC6488d1.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f15675e.m21857b(this.f15674d.poll());
            } else {
                m21813d();
                return;
            }
        }
    }

    /* renamed from: d */
    private void m21813d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z = this.f15676f;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f15676f) {
            return;
        }
        this.f15676f = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (C2951a.m31567b().m31568a(this.f15671a, this.f15672b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f15676f = false;
        m21816a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized com.google.android.gms.tasks.j<Void> m21814c(Intent intent) {
        C6500a c6500a;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        c6500a = new C6500a(intent);
        c6500a.m21812a(this.f15673c);
        this.f15674d.add(c6500a);
        m21815b();
        return c6500a.m21810c();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            String.valueOf(valueOf).length();
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(valueOf)));
        }
        this.f15676f = false;
        if (!(iBinder instanceof BinderC6488d1)) {
            String valueOf2 = String.valueOf(iBinder);
            String.valueOf(valueOf2).length();
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(valueOf2)));
            m21816a();
            return;
        }
        this.f15675e = (BinderC6488d1) iBinder;
        m21815b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(componentName);
            String.valueOf(valueOf).length();
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(valueOf)));
        }
        m21815b();
    }

    ServiceConnectionC6499g1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f15674d = new ArrayDeque();
        this.f15676f = false;
        this.f15671a = context.getApplicationContext();
        this.f15672b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(this.f15671a.getPackageName());
        this.f15673c = scheduledExecutorService;
    }
}
