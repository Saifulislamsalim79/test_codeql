package tcking.github.com.giraffeplayer2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PlayerManager.java */
/* renamed from: tcking.github.com.giraffeplayer2.j */
/* loaded from: classes3.dex */
public class C14894j {

    /* renamed from: i */
    private static final C14894j f33336i = new C14894j();

    /* renamed from: a */
    private volatile String f33337a;

    /* renamed from: b */
    private Application.ActivityLifecycleCallbacks f33338b;

    /* renamed from: c */
    private WeakReference<Activity> f33339c;

    /* renamed from: d */
    private final C14906p f33340d = new C14906p();

    /* renamed from: e */
    private InterfaceC14897c f33341e = new C14895a(this);

    /* renamed from: f */
    private WeakHashMap<String, VideoView> f33342f = new WeakHashMap<>();

    /* renamed from: g */
    private Map<String, C14863e> f33343g = new ConcurrentHashMap();

    /* renamed from: h */
    private WeakHashMap<Context, String> f33344h = new WeakHashMap<>();

    /* compiled from: PlayerManager.java */
    /* renamed from: tcking.github.com.giraffeplayer2.j$a */
    /* loaded from: classes3.dex */
    class C14895a implements InterfaceC14897c {
        C14895a(C14894j c14894j) {
        }

        @Override // tcking.github.com.giraffeplayer2.C14894j.InterfaceC14897c
        /* renamed from: a */
        public InterfaceC14891g mo77a(Context context, C14906p c14906p) {
            return new C14857c(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlayerManager.java */
    /* renamed from: tcking.github.com.giraffeplayer2.j$b */
    /* loaded from: classes3.dex */
    public class C14896b implements Application.ActivityLifecycleCallbacks {
        C14896b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C14894j c14894j = C14894j.this;
            C14863e m89j = c14894j.m89j((String) c14894j.f33344h.get(activity));
            if (m89j != null) {
                m89j.m154a0();
            }
            C14894j.this.f33344h.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C14894j c14894j = C14894j.this;
            C14863e m89j = c14894j.m89j((String) c14894j.f33344h.get(activity));
            if (m89j != null) {
                m89j.m152b0();
            }
            if (C14894j.this.f33339c == null || C14894j.this.f33339c.get() != activity) {
                return;
            }
            C14894j.this.f33339c.clear();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C14894j c14894j = C14894j.this;
            C14863e m89j = c14894j.m89j((String) c14894j.f33344h.get(activity));
            if (m89j != null) {
                m89j.m150c0();
            }
            C14894j.this.f33339c = new WeakReference(activity);
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

    /* compiled from: PlayerManager.java */
    /* renamed from: tcking.github.com.giraffeplayer2.j$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC14897c {
        /* renamed from: a */
        InterfaceC14891g mo77a(Context context, C14906p c14906p);
    }

    /* renamed from: d */
    private C14863e m95d(VideoView videoView) {
        C14906p videoInfo = videoView.getVideoInfo();
        m85n(videoInfo.m35d(), "createPlayer");
        this.f33342f.put(videoInfo.m35d(), videoView);
        m82q(((Activity) videoView.getContext()).getApplication());
        C14863e m177E = C14863e.m177E(videoView.getContext(), videoInfo);
        this.f33343g.put(videoInfo.m35d(), m177E);
        this.f33344h.put(videoView.getContext(), videoInfo.m35d());
        WeakReference<Activity> weakReference = this.f33339c;
        if (weakReference == null || weakReference.get() == null) {
            this.f33339c = new WeakReference<>((Activity) videoView.getContext());
        }
        return m177E;
    }

    /* renamed from: g */
    public static C14894j m92g() {
        return f33336i;
    }

    /* renamed from: n */
    private void m85n(String str, String str2) {
        if (C14863e.f33254P) {
            Log.d("GiraffePlayerManager", String.format("[setFingerprint:%s] %s", str, str2));
        }
    }

    /* renamed from: q */
    private synchronized void m82q(Application application) {
        if (this.f33338b != null) {
            return;
        }
        C14896b c14896b = new C14896b();
        this.f33338b = c14896b;
        application.registerActivityLifecycleCallbacks(c14896b);
    }

    /* renamed from: e */
    public C14863e m94e() {
        if (this.f33337a == null) {
            return null;
        }
        return this.f33343g.get(this.f33337a);
    }

    /* renamed from: f */
    public C14906p m93f() {
        return this.f33340d;
    }

    /* renamed from: h */
    public InterfaceC14897c m91h() {
        return this.f33341e;
    }

    /* renamed from: i */
    public C14863e m90i(VideoView videoView) {
        C14863e c14863e = this.f33343g.get(videoView.getVideoInfo().m35d());
        return c14863e == null ? m95d(videoView) : c14863e;
    }

    /* renamed from: j */
    public C14863e m89j(String str) {
        if (str == null) {
            return null;
        }
        return this.f33343g.get(str);
    }

    /* renamed from: k */
    public Activity m88k() {
        return this.f33339c.get();
    }

    /* renamed from: l */
    public VideoView m87l(C14906p c14906p) {
        return this.f33342f.get(c14906p.m35d());
    }

    /* renamed from: m */
    public boolean m86m(String str) {
        return str != null && str.equals(this.f33337a);
    }

    /* renamed from: o */
    public boolean m84o() {
        C14863e m94e = m94e();
        if (m94e != null) {
            return m94e.m148d0();
        }
        return false;
    }

    /* renamed from: p */
    public void m83p(Configuration configuration) {
        C14863e m94e = m94e();
        if (m94e != null) {
            m94e.m146e0(configuration);
        }
    }

    /* renamed from: r */
    public C14894j m81r(String str) {
        C14863e c14863e = this.f33343g.get(str);
        if (c14863e != null) {
            c14863e.m142g0();
        }
        return this;
    }

    /* renamed from: s */
    public void m80s() {
        m85n(this.f33337a, "releaseCurrent");
        C14863e m94e = m94e();
        if (m94e != null) {
            if (m94e.m167O() != null) {
                m94e.m167O().mo63o(m94e);
            }
            m94e.m142g0();
        }
        this.f33337a = null;
    }

    /* renamed from: t */
    public void m79t(String str) {
        this.f33343g.remove(str);
    }

    /* renamed from: u */
    public void m78u(C14863e c14863e) {
        C14906p m164R = c14863e.m164R();
        m85n(m164R.m35d(), "setCurrentPlayer");
        String m35d = m164R.m35d();
        if (!m86m(m35d)) {
            try {
                String m35d2 = m164R.m35d();
                m85n(m35d2, "not same release before one:" + this.f33337a);
                m80s();
                this.f33337a = m35d;
                return;
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        m85n(m164R.m35d(), "is currentPlayer");
    }
}
