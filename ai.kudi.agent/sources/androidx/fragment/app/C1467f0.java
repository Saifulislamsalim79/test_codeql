package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1548c0;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1566i0;
import androidx.lifecycle.C1578q;
import androidx.lifecycle.h;
import androidx.savedstate.C1868b;
import androidx.savedstate.SavedStateRegistry;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewLifecycleOwner.java */
/* renamed from: androidx.fragment.app.f0 */
/* loaded from: classes2.dex */
public class C1467f0 implements h, androidx.savedstate.c, androidx.lifecycle.j0 {

    /* renamed from: c */
    private final Fragment f4526c;

    /* renamed from: d */
    private final C1566i0 f4527d;

    /* renamed from: e */
    private C1556g0.InterfaceC1559b f4528e;

    /* renamed from: f */
    private C1578q f4529f = null;

    /* renamed from: w */
    private C1868b f4530w = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1467f0(Fragment fragment, C1566i0 c1566i0) {
        this.f4526c = fragment;
        this.f4527d = c1566i0;
    }

    /* renamed from: a */
    void m35775a(AbstractC1565i.b bVar) {
        this.f4529f.m35499h(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35774b() {
        if (this.f4529f == null) {
            this.f4529f = new C1578q(this);
            this.f4530w = C1868b.m34393a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m35773c() {
        return this.f4529f != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35772d(Bundle bundle) {
        this.f4530w.m34391c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35771e(Bundle bundle) {
        this.f4530w.m34390d(bundle);
    }

    /* renamed from: f */
    void m35770f(AbstractC1565i.c cVar) {
        this.f4529f.m35492o(cVar);
    }

    public C1556g0.InterfaceC1559b getDefaultViewModelProviderFactory() {
        C1556g0.InterfaceC1559b defaultViewModelProviderFactory = this.f4526c.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f4526c.mDefaultFactory)) {
            this.f4528e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4528e == null) {
            Application application = null;
            Context applicationContext = this.f4526c.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                } else if (applicationContext instanceof Application) {
                    application = applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f4528e = new C1548c0(application, this, this.f4526c.getArguments());
        }
        return this.f4528e;
    }

    public AbstractC1565i getLifecycle() {
        m35774b();
        return this.f4529f;
    }

    public SavedStateRegistry getSavedStateRegistry() {
        m35774b();
        return this.f4530w.m34392b();
    }

    public C1566i0 getViewModelStore() {
        m35774b();
        return this.f4527d;
    }
}
