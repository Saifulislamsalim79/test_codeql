package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.firebase.messaging.BinderC6488d1;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.g */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC6496g extends Service {
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = C6520n.m21726b();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.g$a */
    /* loaded from: classes2.dex */
    class C6497a implements BinderC6488d1.InterfaceC6489a {
        C6497a() {
        }

        @Override // com.google.firebase.messaging.BinderC6488d1.InterfaceC6489a
        /* renamed from: a */
        public com.google.android.gms.tasks.j<Void> mo21825a(Intent intent) {
            return AbstractServiceC6496g.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            C6478a1.m21884b(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.gms.tasks.j<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C4469m.m27765f(null);
        }
        final C4465k c4465k = new C4465k();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC6496g.this.m21826x624ce8b2(intent, c4465k);
            }
        });
        return c4465k.m27777a();
    }

    protected abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onStartCommand$1$com-google-firebase-messaging-EnhancedIntentService */
    public /* synthetic */ void m21827x83fa35aa(Intent intent, com.google.android.gms.tasks.j jVar) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$processIntent$0$com-google-firebase-messaging-EnhancedIntentService */
    public /* synthetic */ void m21826x624ce8b2(Intent intent, C4465k c4465k) {
        try {
            handleIntent(intent);
        } finally {
            c4465k.m27775c(null);
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new BinderC6488d1(new C6497a());
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        com.google.android.gms.tasks.j<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.o()) {
            finishTask(intent);
            return 2;
        }
        processIntent.c(ExecutorC6493f.f15663c, new InterfaceC4454e() { // from class: com.google.firebase.messaging.d
            @Override // com.google.android.gms.tasks.InterfaceC4454e
            /* renamed from: a */
            public final void mo21856a(com.google.android.gms.tasks.j jVar) {
                AbstractServiceC6496g.this.m21827x83fa35aa(intent, jVar);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
