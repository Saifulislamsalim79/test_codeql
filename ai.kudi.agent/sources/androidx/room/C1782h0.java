package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C1775g0;
import androidx.room.InterfaceC1765d0;
import androidx.room.InterfaceC1769e0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.h0 */
/* loaded from: classes2.dex */
public class C1782h0 {

    /* renamed from: a */
    final Context f5437a;

    /* renamed from: b */
    final String f5438b;

    /* renamed from: c */
    int f5439c;

    /* renamed from: d */
    final C1775g0 f5440d;

    /* renamed from: e */
    final C1775g0.AbstractC1778c f5441e;

    /* renamed from: f */
    InterfaceC1769e0 f5442f;

    /* renamed from: g */
    final Executor f5443g;

    /* renamed from: h */
    final InterfaceC1765d0 f5444h = new BinderC1783a();

    /* renamed from: i */
    final AtomicBoolean f5445i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f5446j = new ServiceConnectionC1785b();

    /* renamed from: k */
    final Runnable f5447k = new RunnableC1786c();

    /* renamed from: l */
    final Runnable f5448l = new RunnableC1787d();

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h0$a */
    /* loaded from: classes2.dex */
    class BinderC1783a extends InterfaceC1765d0.AbstractBinderC1766a {

        /* compiled from: MultiInstanceInvalidationClient.java */
        /* renamed from: androidx.room.h0$a$a */
        /* loaded from: classes2.dex */
        class RunnableC1784a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ String[] f5450c;

            RunnableC1784a(String[] strArr) {
                this.f5450c = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1782h0.this.f5440d.m34530h(this.f5450c);
            }
        }

        BinderC1783a() {
        }

        @Override // androidx.room.InterfaceC1765d0
        /* renamed from: D */
        public void mo34508D(String[] strArr) {
            C1782h0.this.f5443g.execute(new RunnableC1784a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h0$b */
    /* loaded from: classes2.dex */
    class ServiceConnectionC1785b implements ServiceConnection {
        ServiceConnectionC1785b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1782h0.this.f5442f = InterfaceC1769e0.AbstractBinderC1770a.m34545m(iBinder);
            C1782h0 c1782h0 = C1782h0.this;
            c1782h0.f5443g.execute(c1782h0.f5447k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1782h0 c1782h0 = C1782h0.this;
            c1782h0.f5443g.execute(c1782h0.f5448l);
            C1782h0.this.f5442f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h0$c */
    /* loaded from: classes2.dex */
    class RunnableC1786c implements Runnable {
        RunnableC1786c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InterfaceC1769e0 interfaceC1769e0 = C1782h0.this.f5442f;
                if (interfaceC1769e0 != null) {
                    C1782h0.this.f5439c = interfaceC1769e0.mo34543N(C1782h0.this.f5444h, C1782h0.this.f5438b);
                    C1782h0.this.f5440d.m34537a(C1782h0.this.f5441e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h0$d */
    /* loaded from: classes2.dex */
    class RunnableC1787d implements Runnable {
        RunnableC1787d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1782h0 c1782h0 = C1782h0.this;
            c1782h0.f5440d.m34527k(c1782h0.f5441e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h0$e */
    /* loaded from: classes2.dex */
    class C1788e extends C1775g0.AbstractC1778c {
        C1788e(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C1775g0.AbstractC1778c
        /* renamed from: a */
        boolean mo34507a() {
            return true;
        }

        @Override // androidx.room.C1775g0.AbstractC1778c
        /* renamed from: b */
        public void mo34456b(Set<String> set) {
            if (C1782h0.this.f5445i.get()) {
                return;
            }
            try {
                InterfaceC1769e0 interfaceC1769e0 = C1782h0.this.f5442f;
                if (interfaceC1769e0 != null) {
                    interfaceC1769e0.mo34542j1(C1782h0.this.f5439c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1782h0(Context context, String str, C1775g0 c1775g0, Executor executor) {
        this.f5437a = context.getApplicationContext();
        this.f5438b = str;
        this.f5440d = c1775g0;
        this.f5443g = executor;
        this.f5441e = new C1788e((String[]) c1775g0.f5410a.keySet().toArray(new String[0]));
        this.f5437a.bindService(new Intent(this.f5437a, MultiInstanceInvalidationService.class), this.f5446j, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m34509a() {
        if (this.f5445i.compareAndSet(false, true)) {
            this.f5440d.m34527k(this.f5441e);
            try {
                InterfaceC1769e0 interfaceC1769e0 = this.f5442f;
                if (interfaceC1769e0 != null) {
                    interfaceC1769e0.mo34541l1(this.f5444h, this.f5439c);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            this.f5437a.unbindService(this.f5446j);
        }
    }
}
