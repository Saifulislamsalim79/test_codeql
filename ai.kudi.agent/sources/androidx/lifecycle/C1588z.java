package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.FragmentC1539a0;
/* compiled from: ProcessLifecycleOwner.java */
/* renamed from: androidx.lifecycle.z */
/* loaded from: classes2.dex */
public class C1588z implements o {

    /* renamed from: A */
    private static final C1588z f4798A = new C1588z();

    /* renamed from: w */
    private Handler f4803w;

    /* renamed from: c */
    private int f4799c = 0;

    /* renamed from: d */
    private int f4800d = 0;

    /* renamed from: e */
    private boolean f4801e = true;

    /* renamed from: f */
    private boolean f4802f = true;

    /* renamed from: x */
    private final C1578q f4804x = new C1578q(this);

    /* renamed from: y */
    private Runnable f4805y = new RunnableC1589a();

    /* renamed from: z */
    FragmentC1539a0.InterfaceC1540a f4806z = new C1590b();

    /* compiled from: ProcessLifecycleOwner.java */
    /* renamed from: androidx.lifecycle.z$a */
    /* loaded from: classes2.dex */
    class RunnableC1589a implements Runnable {
        RunnableC1589a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1588z.this.m35473f();
            C1588z.this.m35472g();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* renamed from: androidx.lifecycle.z$b */
    /* loaded from: classes2.dex */
    class C1590b implements FragmentC1539a0.InterfaceC1540a {
        C1590b() {
        }

        @Override // androidx.lifecycle.FragmentC1539a0.InterfaceC1540a
        /* renamed from: a */
        public void mo35470a() {
            C1588z.this.m35477b();
        }

        @Override // androidx.lifecycle.FragmentC1539a0.InterfaceC1540a
        /* renamed from: b */
        public void mo35469b() {
        }

        @Override // androidx.lifecycle.FragmentC1539a0.InterfaceC1540a
        public void onStart() {
            C1588z.this.m35476c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProcessLifecycleOwner.java */
    /* renamed from: androidx.lifecycle.z$c */
    /* loaded from: classes2.dex */
    public class C1591c extends C1551e {

        /* compiled from: ProcessLifecycleOwner.java */
        /* renamed from: androidx.lifecycle.z$c$a */
        /* loaded from: classes2.dex */
        class C1592a extends C1551e {
            C1592a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C1588z.this.m35477b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C1588z.this.m35476c();
            }
        }

        C1591c() {
        }

        @Override // androidx.lifecycle.C1551e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC1539a0.m35562f(activity).m35560h(C1588z.this.f4806z);
            }
        }

        @Override // androidx.lifecycle.C1551e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C1588z.this.m35478a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C1592a());
        }

        @Override // androidx.lifecycle.C1551e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C1588z.this.m35475d();
        }
    }

    private C1588z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m35471h(Context context) {
        f4798A.m35474e(context);
    }

    /* renamed from: a */
    void m35478a() {
        int i = this.f4800d - 1;
        this.f4800d = i;
        if (i == 0) {
            this.f4803w.postDelayed(this.f4805y, 700L);
        }
    }

    /* renamed from: b */
    void m35477b() {
        int i = this.f4800d + 1;
        this.f4800d = i;
        if (i == 1) {
            if (this.f4801e) {
                this.f4804x.m35499h(AbstractC1565i.b.ON_RESUME);
                this.f4801e = false;
                return;
            }
            this.f4803w.removeCallbacks(this.f4805y);
        }
    }

    /* renamed from: c */
    void m35476c() {
        int i = this.f4799c + 1;
        this.f4799c = i;
        if (i == 1 && this.f4802f) {
            this.f4804x.m35499h(AbstractC1565i.b.ON_START);
            this.f4802f = false;
        }
    }

    /* renamed from: d */
    void m35475d() {
        this.f4799c--;
        m35472g();
    }

    /* renamed from: e */
    void m35474e(Context context) {
        this.f4803w = new Handler();
        this.f4804x.m35499h(AbstractC1565i.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1591c());
    }

    /* renamed from: f */
    void m35473f() {
        if (this.f4800d == 0) {
            this.f4801e = true;
            this.f4804x.m35499h(AbstractC1565i.b.ON_PAUSE);
        }
    }

    /* renamed from: g */
    void m35472g() {
        if (this.f4799c == 0 && this.f4801e) {
            this.f4804x.m35499h(AbstractC1565i.b.ON_STOP);
            this.f4802f = true;
        }
    }

    public AbstractC1565i getLifecycle() {
        return this.f4804x;
    }
}
