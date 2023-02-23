package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1565i;
/* compiled from: ReportFragment.java */
/* renamed from: androidx.lifecycle.a0 */
/* loaded from: classes2.dex */
public class FragmentC1539a0 extends Fragment {

    /* renamed from: c */
    private InterfaceC1540a f4734c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReportFragment.java */
    /* renamed from: androidx.lifecycle.a0$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1540a {
        /* renamed from: a */
        void mo35470a();

        /* renamed from: b */
        void mo35469b();

        void onStart();
    }

    /* compiled from: ReportFragment.java */
    /* renamed from: androidx.lifecycle.a0$b */
    /* loaded from: classes2.dex */
    static class C1541b implements Application.ActivityLifecycleCallbacks {
        C1541b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C1541b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC1539a0.m35567a(activity, AbstractC1565i.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC1539a0.m35567a(activity, AbstractC1565i.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC1539a0.m35567a(activity, AbstractC1565i.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC1539a0.m35567a(activity, AbstractC1565i.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC1539a0.m35567a(activity, AbstractC1565i.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC1539a0.m35567a(activity, AbstractC1565i.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m35567a(Activity activity, AbstractC1565i.b bVar) {
        if (activity instanceof InterfaceC1580r) {
            ((InterfaceC1580r) activity).getLifecycle().m35499h(bVar);
        } else if (activity instanceof o) {
            AbstractC1565i lifecycle = ((o) activity).getLifecycle();
            if (lifecycle instanceof C1578q) {
                ((C1578q) lifecycle).m35499h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m35566b(AbstractC1565i.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m35567a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m35565c(InterfaceC1540a interfaceC1540a) {
        if (interfaceC1540a != null) {
            interfaceC1540a.mo35469b();
        }
    }

    /* renamed from: d */
    private void m35564d(InterfaceC1540a interfaceC1540a) {
        if (interfaceC1540a != null) {
            interfaceC1540a.mo35470a();
        }
    }

    /* renamed from: e */
    private void m35563e(InterfaceC1540a interfaceC1540a) {
        if (interfaceC1540a != null) {
            interfaceC1540a.onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static FragmentC1539a0 m35562f(Activity activity) {
        return (FragmentC1539a0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m35561g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1541b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC1539a0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m35560h(InterfaceC1540a interfaceC1540a) {
        this.f4734c = interfaceC1540a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m35565c(this.f4734c);
        m35566b(AbstractC1565i.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m35566b(AbstractC1565i.b.ON_DESTROY);
        this.f4734c = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m35566b(AbstractC1565i.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m35564d(this.f4734c);
        m35566b(AbstractC1565i.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m35563e(this.f4734c);
        m35566b(AbstractC1565i.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m35566b(AbstractC1565i.b.ON_STOP);
    }
}
