package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes2.dex */
public class C1508q {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C1509a> f4629a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final FragmentManager f4630b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: classes2.dex */
    public static final class C1509a {

        /* renamed from: a */
        final FragmentManager.AbstractC1439j f4631a;

        /* renamed from: b */
        final boolean f4632b;

        C1509a(FragmentManager.AbstractC1439j abstractC1439j, boolean z) {
            this.f4631a = abstractC1439j;
            this.f4632b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1508q(FragmentManager fragmentManager) {
        this.f4630b = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35667a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35667a(fragment, bundle, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35873a(this.f4630b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35666b(Fragment fragment, boolean z) {
        Context m35677f = this.f4630b.m35899t0().m35677f();
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35666b(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35872b(this.f4630b, fragment, m35677f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35665c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35665c(fragment, bundle, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35871c(this.f4630b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35664d(Fragment fragment, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35664d(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35870d(this.f4630b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35663e(Fragment fragment, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35663e(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35869e(this.f4630b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m35662f(Fragment fragment, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35662f(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.mo974f(this.f4630b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m35661g(Fragment fragment, boolean z) {
        Context m35677f = this.f4630b.m35899t0().m35677f();
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35661g(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35868g(this.f4630b, fragment, m35677f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m35660h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35660h(fragment, bundle, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35867h(this.f4630b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m35659i(Fragment fragment, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35659i(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.mo973i(this.f4630b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35658j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35658j(fragment, bundle, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35866j(this.f4630b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m35657k(Fragment fragment, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35657k(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.mo972k(this.f4630b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m35656l(Fragment fragment, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35656l(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35865l(this.f4630b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m35655m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35655m(fragment, view, bundle, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.mo34270m(this.f4630b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m35654n(Fragment fragment, boolean z) {
        Fragment m35890w0 = this.f4630b.m35890w0();
        if (m35890w0 != null) {
            m35890w0.getParentFragmentManager().m35893v0().m35654n(fragment, true);
        }
        Iterator<C1509a> it = this.f4629a.iterator();
        while (it.hasNext()) {
            C1509a next = it.next();
            if (!z || next.f4632b) {
                next.f4631a.m35864n(this.f4630b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void m35653o(FragmentManager.AbstractC1439j abstractC1439j, boolean z) {
        this.f4629a.add(new C1509a(abstractC1439j, z));
    }

    /* renamed from: p */
    public void m35652p(FragmentManager.AbstractC1439j abstractC1439j) {
        synchronized (this.f4629a) {
            int i = 0;
            int size = this.f4629a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f4629a.get(i).f4631a == abstractC1439j) {
                    this.f4629a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
