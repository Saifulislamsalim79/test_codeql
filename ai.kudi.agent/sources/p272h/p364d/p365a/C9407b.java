package p272h.p364d.p365a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import h.d.a.c.e;
import java.util.Map;
import java.util.UUID;
import p201g.p218e.C7521a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: PresenterManager.java */
/* renamed from: h.d.a.b */
/* loaded from: classes2.dex */
public final class C9407b {

    /* renamed from: a */
    public static boolean f22040a = false;

    /* renamed from: b */
    private static final Map<Activity, String> f22041b = new C7521a();

    /* renamed from: c */
    private static final Map<String, C9405a> f22042c = new C7521a();

    /* renamed from: d */
    static final Application.ActivityLifecycleCallbacks f22043d = new C9408a();

    /* compiled from: PresenterManager.java */
    /* renamed from: h.d.a.b$a */
    /* loaded from: classes2.dex */
    static class C9408a implements Application.ActivityLifecycleCallbacks {
        C9408a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString("com.hannesdorfmann.mosby3.MosbyPresenterManagerActivityId")) == null) {
                return;
            }
            C9407b.f22041b.put(activity, string);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            String str;
            if (!activity.isChangingConfigurations() && (str = (String) C9407b.f22041b.get(activity)) != null) {
                C9405a c9405a = (C9405a) C9407b.f22042c.get(str);
                if (c9405a != null) {
                    c9405a.m14822a();
                    C9407b.f22042c.remove(str);
                }
                if (C9407b.f22042c.isEmpty()) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(C9407b.f22043d);
                    if (C9407b.f22040a) {
                        Log.d("PresenterManager", "Unregistering ActivityLifecycleCallbacks");
                    }
                }
            }
            C9407b.f22041b.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            String str = (String) C9407b.f22041b.get(activity);
            if (str != null) {
                bundle.putString("com.hannesdorfmann.mosby3.MosbyPresenterManagerActivityId", str);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: c */
    static C9405a m14814c(Activity activity) {
        if (activity != null) {
            String str = f22041b.get(activity);
            if (str == null) {
                return null;
            }
            return f22042c.get(str);
        }
        throw new NullPointerException("Activity is null");
    }

    /* renamed from: d */
    static C9405a m14813d(Activity activity) {
        if (activity != null) {
            String str = f22041b.get(activity);
            if (str == null) {
                str = UUID.randomUUID().toString();
                f22041b.put(activity, str);
                if (f22041b.size() == 1) {
                    activity.getApplication().registerActivityLifecycleCallbacks(f22043d);
                    if (f22040a) {
                        Log.d("PresenterManager", "Registering ActivityLifecycleCallbacks");
                    }
                }
            }
            C9405a c9405a = f22042c.get(str);
            if (c9405a == null) {
                C9405a c9405a2 = new C9405a();
                f22042c.put(str, c9405a2);
                return c9405a2;
            }
            return c9405a;
        }
        throw new NullPointerException("Activity is null");
    }

    /* renamed from: e */
    public static <P> P m14812e(Activity activity, String str) {
        if (activity != null) {
            if (str != null) {
                C9405a m14814c = m14814c(activity);
                if (m14814c == null) {
                    return null;
                }
                return (P) m14814c.m14821b(str);
            }
            throw new NullPointerException("View id is null");
        }
        throw new NullPointerException("Activity is null");
    }

    /* renamed from: f */
    public static void m14811f(Activity activity, String str, InterfaceC9413d<? extends e> interfaceC9413d) {
        if (activity != null) {
            m14813d(activity).m14820c(str, interfaceC9413d);
            return;
        }
        throw new NullPointerException("Activity is null");
    }

    /* renamed from: g */
    public static void m14810g(Activity activity, String str) {
        if (activity != null) {
            C9405a m14814c = m14814c(activity);
            if (m14814c != null) {
                m14814c.m14819d(str);
                return;
            }
            return;
        }
        throw new NullPointerException("Activity is null");
    }
}
