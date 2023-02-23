package com.bumptech.glide.p066l;

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
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.ComponentCallbacks2C1952h;
import com.bumptech.glide.p086q.C2381k;
import java.util.HashMap;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: RequestManagerRetriever.java */
/* renamed from: com.bumptech.glide.l.l */
/* loaded from: classes2.dex */
public class C1985l implements Handler.Callback {

    /* renamed from: f */
    private static final InterfaceC1987b f6053f = new C1986a();

    /* renamed from: a */
    private volatile ComponentCallbacks2C1952h f6054a;

    /* renamed from: b */
    final Map<FragmentManager, FragmentC1983k> f6055b = new HashMap();

    /* renamed from: c */
    final Map<androidx.fragment.app.FragmentManager, C1990o> f6056c = new HashMap();

    /* renamed from: d */
    private final Handler f6057d;

    /* renamed from: e */
    private final InterfaceC1987b f6058e;

    /* compiled from: RequestManagerRetriever.java */
    /* renamed from: com.bumptech.glide.l.l$a */
    /* loaded from: classes2.dex */
    class C1986a implements InterfaceC1987b {
        C1986a() {
        }

        @Override // com.bumptech.glide.p066l.C1985l.InterfaceC1987b
        /* renamed from: a */
        public ComponentCallbacks2C1952h mo33977a(ComponentCallbacks2C1943b componentCallbacks2C1943b, InterfaceC1980h interfaceC1980h, InterfaceC1988m interfaceC1988m, Context context) {
            return new ComponentCallbacks2C1952h(componentCallbacks2C1943b, interfaceC1980h, interfaceC1988m, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    /* renamed from: com.bumptech.glide.l.l$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1987b {
        /* renamed from: a */
        ComponentCallbacks2C1952h mo33977a(ComponentCallbacks2C1943b componentCallbacks2C1943b, InterfaceC1980h interfaceC1980h, InterfaceC1988m interfaceC1988m, Context context);
    }

    public C1985l(InterfaceC1987b interfaceC1987b) {
        new C7521a();
        new C7521a();
        new Bundle();
        this.f6058e = interfaceC1987b == null ? f6053f : interfaceC1987b;
        this.f6057d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    private static void m33990a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static Activity m33989b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m33989b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    /* renamed from: c */
    private ComponentCallbacks2C1952h m33988c(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        FragmentC1983k m33982i = m33982i(fragmentManager, fragment, z);
        ComponentCallbacks2C1952h m33998e = m33982i.m33998e();
        if (m33998e == null) {
            ComponentCallbacks2C1952h mo33977a = this.f6058e.mo33977a(ComponentCallbacks2C1943b.m34169c(context), m33982i.m34000c(), m33982i.m33997f(), context);
            m33982i.m33992k(mo33977a);
            return mo33977a;
        }
        return m33998e;
    }

    /* renamed from: g */
    private ComponentCallbacks2C1952h m33984g(Context context) {
        if (this.f6054a == null) {
            synchronized (this) {
                if (this.f6054a == null) {
                    this.f6054a = this.f6058e.mo33977a(ComponentCallbacks2C1943b.m34169c(context.getApplicationContext()), new C1972b(), new C1979g(), context.getApplicationContext());
                }
            }
        }
        return this.f6054a;
    }

    /* renamed from: i */
    private FragmentC1983k m33982i(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        FragmentC1983k fragmentC1983k = (FragmentC1983k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC1983k == null && (fragmentC1983k = this.f6055b.get(fragmentManager)) == null) {
            fragmentC1983k = new FragmentC1983k();
            fragmentC1983k.m33993j(fragment);
            if (z) {
                fragmentC1983k.m34000c().m34011d();
            }
            this.f6055b.put(fragmentManager, fragmentC1983k);
            fragmentManager.beginTransaction().add(fragmentC1983k, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f6057d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC1983k;
    }

    /* renamed from: k */
    private C1990o m33980k(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z) {
        C1990o c1990o = (C1990o) fragmentManager.m35938g0("com.bumptech.glide.manager");
        if (c1990o == null && (c1990o = this.f6056c.get(fragmentManager)) == null) {
            c1990o = new C1990o();
            c1990o.m33959q(fragment);
            if (z) {
                c1990o.m33967h().m34011d();
            }
            this.f6056c.put(fragmentManager, c1990o);
            AbstractC1449b0 m35924l = fragmentManager.m35924l();
            m35924l.m35826e(c1990o, "com.bumptech.glide.manager");
            m35924l.mo35804j();
            this.f6057d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return c1990o;
    }

    /* renamed from: l */
    private static boolean m33979l(Context context) {
        Activity m33989b = m33989b(context);
        return m33989b == null || !m33989b.isFinishing();
    }

    /* renamed from: m */
    private ComponentCallbacks2C1952h m33978m(Context context, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z) {
        C1990o m33980k = m33980k(fragmentManager, fragment, z);
        ComponentCallbacks2C1952h m33965j = m33980k.m33965j();
        if (m33965j == null) {
            ComponentCallbacks2C1952h mo33977a = this.f6058e.mo33977a(ComponentCallbacks2C1943b.m34169c(context), m33980k.m33967h(), m33980k.m33964k(), context);
            m33980k.m33958r(mo33977a);
            return mo33977a;
        }
        return m33965j;
    }

    /* renamed from: d */
    public ComponentCallbacks2C1952h m33987d(Activity activity) {
        if (C2381k.m33113o()) {
            return m33986e(activity.getApplicationContext());
        }
        m33990a(activity);
        return m33988c(activity, activity.getFragmentManager(), null, m33979l(activity));
    }

    /* renamed from: e */
    public ComponentCallbacks2C1952h m33986e(Context context) {
        if (context != null) {
            if (C2381k.m33112p() && !(context instanceof Application)) {
                if (context instanceof i) {
                    return m33985f((i) context);
                }
                if (context instanceof Activity) {
                    return m33987d((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return m33986e(contextWrapper.getBaseContext());
                    }
                }
            }
            return m33984g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: f */
    public ComponentCallbacks2C1952h m33985f(i iVar) {
        if (C2381k.m33113o()) {
            return m33986e(iVar.getApplicationContext());
        }
        m33990a(iVar);
        return m33978m(iVar, iVar.getSupportFragmentManager(), null, m33979l(iVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: h */
    public FragmentC1983k m33983h(Activity activity) {
        return m33982i(activity.getFragmentManager(), null, m33979l(activity));
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
            remove = this.f6055b.remove(obj);
        } else if (i == 2) {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.f6056c.remove(obj);
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
    /* renamed from: j */
    public C1990o m33981j(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return m33980k(fragmentManager, null, m33979l(context));
    }
}
