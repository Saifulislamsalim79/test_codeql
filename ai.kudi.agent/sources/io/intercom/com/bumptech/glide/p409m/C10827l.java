package io.intercom.com.bumptech.glide.p409m;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.i;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.util.HashMap;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: RequestManagerRetriever.java */
/* renamed from: io.intercom.com.bumptech.glide.m.l */
/* loaded from: classes3.dex */
public class C10827l implements Handler.Callback {

    /* renamed from: f */
    private static final InterfaceC10829b f24704f = new C10828a();

    /* renamed from: a */
    private volatile C10486i f24705a;

    /* renamed from: b */
    final Map<FragmentManager, FragmentC10825k> f24706b = new HashMap();

    /* renamed from: c */
    final Map<androidx.fragment.app.FragmentManager, C10832o> f24707c = new HashMap();

    /* renamed from: d */
    private final Handler f24708d;

    /* renamed from: e */
    private final InterfaceC10829b f24709e;

    /* compiled from: RequestManagerRetriever.java */
    /* renamed from: io.intercom.com.bumptech.glide.m.l$a */
    /* loaded from: classes3.dex */
    static class C10828a implements InterfaceC10829b {
        C10828a() {
        }

        @Override // io.intercom.com.bumptech.glide.p409m.C10827l.InterfaceC10829b
        /* renamed from: a */
        public C10486i mo12235a(ComponentCallbacks2C10478c componentCallbacks2C10478c, InterfaceC10822h interfaceC10822h, InterfaceC10830m interfaceC10830m, Context context) {
            return new C10486i(componentCallbacks2C10478c, interfaceC10822h, interfaceC10830m, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    /* renamed from: io.intercom.com.bumptech.glide.m.l$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10829b {
        /* renamed from: a */
        C10486i mo12235a(ComponentCallbacks2C10478c componentCallbacks2C10478c, InterfaceC10822h interfaceC10822h, InterfaceC10830m interfaceC10830m, Context context);
    }

    public C10827l(InterfaceC10829b interfaceC10829b) {
        new C7521a();
        new C7521a();
        new Bundle();
        this.f24709e = interfaceC10829b == null ? f24704f : interfaceC10829b;
        this.f24708d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    private static void m12245a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private C10486i m12244b(Context context, FragmentManager fragmentManager, Fragment fragment) {
        FragmentC10825k m12238h = m12238h(fragmentManager, fragment);
        C10486i m12252d = m12238h.m12252d();
        if (m12252d == null) {
            C10486i mo12235a = this.f24709e.mo12235a(ComponentCallbacks2C10478c.m13034c(context), m12238h.m12254b(), m12238h.m12251e(), context);
            m12238h.m12247i(mo12235a);
            return mo12235a;
        }
        return m12252d;
    }

    /* renamed from: g */
    private C10486i m12239g(Context context) {
        if (this.f24705a == null) {
            synchronized (this) {
                if (this.f24705a == null) {
                    this.f24705a = this.f24709e.mo12235a(ComponentCallbacks2C10478c.m13034c(context.getApplicationContext()), new C10814b(), new C10821g(), context.getApplicationContext());
                }
            }
        }
        return this.f24705a;
    }

    /* renamed from: j */
    private C10486i m12236j(Context context, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        C10832o m12237i = m12237i(fragmentManager, fragment);
        C10486i m12224i = m12237i.m12224i();
        if (m12224i == null) {
            C10486i mo12235a = this.f24709e.mo12235a(ComponentCallbacks2C10478c.m13034c(context), m12237i.m12226f(), m12237i.m12223j(), context);
            m12237i.m12219o(mo12235a);
            return mo12235a;
        }
        return m12224i;
    }

    /* renamed from: c */
    public C10486i m12243c(Activity activity) {
        if (C10893i.m11997p()) {
            return m12242d(activity.getApplicationContext());
        }
        m12245a(activity);
        return m12244b(activity, activity.getFragmentManager(), null);
    }

    /* renamed from: d */
    public C10486i m12242d(Context context) {
        if (context != null) {
            if (C10893i.m11996q() && !(context instanceof Application)) {
                if (context instanceof i) {
                    return m12240f((i) context);
                }
                if (context instanceof Activity) {
                    return m12243c((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return m12242d(((ContextWrapper) context).getBaseContext());
                }
            }
            return m12239g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: e */
    public C10486i m12241e(androidx.fragment.app.Fragment fragment) {
        C10892h.m12013e(fragment.getActivity(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C10893i.m11997p()) {
            return m12242d(fragment.getActivity().getApplicationContext());
        }
        return m12236j(fragment.getActivity(), fragment.getChildFragmentManager(), fragment);
    }

    /* renamed from: f */
    public C10486i m12240f(i iVar) {
        if (C10893i.m11997p()) {
            return m12242d(iVar.getApplicationContext());
        }
        m12245a(iVar);
        return m12236j(iVar, iVar.getSupportFragmentManager(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public FragmentC10825k m12238h(FragmentManager fragmentManager, Fragment fragment) {
        FragmentC10825k fragmentC10825k = (FragmentC10825k) fragmentManager.findFragmentByTag("io.intercom.com.bumptech.glide.manager");
        if (fragmentC10825k == null) {
            FragmentC10825k fragmentC10825k2 = this.f24706b.get(fragmentManager);
            if (fragmentC10825k2 == null) {
                FragmentC10825k fragmentC10825k3 = new FragmentC10825k();
                fragmentC10825k3.m12248h(fragment);
                this.f24706b.put(fragmentManager, fragmentC10825k3);
                fragmentManager.beginTransaction().add(fragmentC10825k3, "io.intercom.com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f24708d.obtainMessage(1, fragmentManager).sendToTarget();
                return fragmentC10825k3;
            }
            return fragmentC10825k2;
        }
        return fragmentC10825k;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.f24706b.remove(obj);
        } else if (i == 2) {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.f24707c.remove(obj);
        } else {
            z = false;
            obj2 = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        }
        Object obj4 = obj;
        obj3 = remove;
        obj2 = obj4;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C10832o m12237i(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        C10832o c10832o = (C10832o) fragmentManager.m35938g0("io.intercom.com.bumptech.glide.manager");
        if (c10832o == null) {
            C10832o c10832o2 = this.f24707c.get(fragmentManager);
            if (c10832o2 == null) {
                C10832o c10832o3 = new C10832o();
                c10832o3.m12220n(fragment);
                this.f24707c.put(fragmentManager, c10832o3);
                AbstractC1449b0 m35924l = fragmentManager.m35924l();
                m35924l.m35826e(c10832o3, "io.intercom.com.bumptech.glide.manager");
                m35924l.mo35804j();
                this.f24708d.obtainMessage(2, fragmentManager).sendToTarget();
                return c10832o3;
            }
            return c10832o2;
        }
        return c10832o;
    }
}
