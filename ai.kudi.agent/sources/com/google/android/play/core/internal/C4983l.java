package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C5021m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.play.core.internal.l */
/* loaded from: classes2.dex */
public final class C4983l<T extends IInterface> {

    /* renamed from: l */
    private static final Map<String, Handler> f12634l = new HashMap();

    /* renamed from: a */
    private final Context f12635a;

    /* renamed from: b */
    private final C4957a f12636b;

    /* renamed from: c */
    private final String f12637c;

    /* renamed from: e */
    private boolean f12639e;

    /* renamed from: f */
    private final Intent f12640f;

    /* renamed from: g */
    private final InterfaceC4975h<T> f12641g;

    /* renamed from: j */
    private ServiceConnection f12644j;

    /* renamed from: k */
    private T f12645k;

    /* renamed from: d */
    private final List<AbstractRunnableC4960b> f12638d = new ArrayList();

    /* renamed from: i */
    private final IBinder.DeathRecipient f12643i = new IBinder.DeathRecipient(this) { // from class: com.google.android.play.core.internal.c

        /* renamed from: a */
        private final C4983l f12624a;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.f12624a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f12624a.m25929k();
        }
    };

    /* renamed from: h */
    private final WeakReference<InterfaceC4973g> f12642h = new WeakReference<>(null);

    public C4983l(Context context, C4957a c4957a, String str, Intent intent, InterfaceC4975h<T> interfaceC4975h) {
        this.f12635a = context;
        this.f12636b = c4957a;
        this.f12637c = str;
        this.f12640f = intent;
        this.f12641g = interfaceC4975h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ void m25935e(C4983l c4983l, AbstractRunnableC4960b abstractRunnableC4960b) {
        if (c4983l.f12645k != null || c4983l.f12639e) {
            if (!c4983l.f12639e) {
                abstractRunnableC4960b.run();
                return;
            }
            c4983l.f12636b.m25954f("Waiting to bind to the service.", new Object[0]);
            c4983l.f12638d.add(abstractRunnableC4960b);
            return;
        }
        c4983l.f12636b.m25954f("Initiate binding to the service.", new Object[0]);
        c4983l.f12638d.add(abstractRunnableC4960b);
        ServiceConnectionC4981k serviceConnectionC4981k = new ServiceConnectionC4981k(c4983l);
        c4983l.f12644j = serviceConnectionC4981k;
        c4983l.f12639e = true;
        if (c4983l.f12635a.bindService(c4983l.f12640f, serviceConnectionC4981k, 1)) {
            return;
        }
        c4983l.f12636b.m25954f("Failed to bind to the service.", new Object[0]);
        c4983l.f12639e = false;
        List<AbstractRunnableC4960b> list = c4983l.f12638d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C5021m<?> m25950b = list.get(i).m25950b();
            if (m25950b != null) {
                m25950b.m25856d(new C4959aq());
            }
        }
        c4983l.f12638d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m25932h(AbstractRunnableC4960b abstractRunnableC4960b) {
        Handler handler;
        synchronized (f12634l) {
            if (!f12634l.containsKey(this.f12637c)) {
                HandlerThread handlerThread = new HandlerThread(this.f12637c, 10);
                handlerThread.start();
                f12634l.put(this.f12637c, new Handler(handlerThread.getLooper()));
            }
            handler = f12634l.get(this.f12637c);
        }
        handler.post(abstractRunnableC4960b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* synthetic */ void m25926n(C4983l c4983l) {
        c4983l.f12636b.m25954f("linkToDeath", new Object[0]);
        try {
            c4983l.f12645k.asBinder().linkToDeath(c4983l.f12643i, 0);
        } catch (RemoteException e) {
            c4983l.f12636b.m25956d(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static /* synthetic */ void m25924p(C4983l c4983l) {
        c4983l.f12636b.m25954f("unlinkToDeath", new Object[0]);
        c4983l.f12645k.asBinder().unlinkToDeath(c4983l.f12643i, 0);
    }

    /* renamed from: b */
    public final void m25938b() {
        m25932h(new C4971f(this));
    }

    /* renamed from: c */
    public final void m25937c(AbstractRunnableC4960b abstractRunnableC4960b) {
        m25932h(new C4967d(this, abstractRunnableC4960b.m25950b(), abstractRunnableC4960b));
    }

    /* renamed from: f */
    public final T m25934f() {
        return this.f12645k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void m25929k() {
        this.f12636b.m25954f("reportBinderDeath", new Object[0]);
        InterfaceC4973g interfaceC4973g = this.f12642h.get();
        if (interfaceC4973g != null) {
            this.f12636b.m25954f("calling onBinderDied", new Object[0]);
            interfaceC4973g.m25942a();
            return;
        }
        this.f12636b.m25954f("%s : Binder has died.", this.f12637c);
        List<AbstractRunnableC4960b> list = this.f12638d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C5021m<?> m25950b = list.get(i).m25950b();
            if (m25950b != null) {
                m25950b.m25856d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f12637c).concat(" : Binder has died.")));
            }
        }
        this.f12638d.clear();
    }
}
