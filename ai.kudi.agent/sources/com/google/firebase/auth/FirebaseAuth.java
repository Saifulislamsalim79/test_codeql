package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p104firebaseauthapi.C3137ej;
import com.google.android.gms.internal.p104firebaseauthapi.C3140em;
import com.google.android.gms.internal.p104firebaseauthapi.C3586vj;
import com.google.android.gms.internal.p104firebaseauthapi.C3638xj;
import com.google.android.gms.internal.p104firebaseauthapi.C3663yi;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.C5988g;
import com.google.firebase.auth.internal.C5212a0;
import com.google.firebase.auth.internal.C5214b0;
import com.google.firebase.auth.internal.C5239o;
import com.google.firebase.auth.internal.C5248u;
import com.google.firebase.auth.internal.C5250w;
import com.google.firebase.auth.internal.ExecutorC5251x;
import com.google.firebase.auth.internal.InterfaceC5211a;
import com.google.firebase.auth.internal.InterfaceC5213b;
import com.google.firebase.p171p.C6562b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* loaded from: classes2.dex */
public abstract class FirebaseAuth implements InterfaceC5213b {

    /* renamed from: a */
    private C5988g f12933a;

    /* renamed from: b */
    private final List<InterfaceC5191b> f12934b;

    /* renamed from: c */
    private final List<InterfaceC5211a> f12935c;

    /* renamed from: d */
    private List<InterfaceC5190a> f12936d;

    /* renamed from: e */
    private C3663yi f12937e;

    /* renamed from: f */
    private AbstractC5203f f12938f;

    /* renamed from: g */
    private final Object f12939g;

    /* renamed from: h */
    private String f12940h;

    /* renamed from: i */
    private final Object f12941i;

    /* renamed from: j */
    private String f12942j;

    /* renamed from: k */
    private final C5248u f12943k;

    /* renamed from: l */
    private final C5212a0 f12944l;

    /* renamed from: m */
    private C5250w f12945m;

    /* renamed from: n */
    private ExecutorC5251x f12946n;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5190a {
        /* renamed from: a */
        void m25393a(FirebaseAuth firebaseAuth);
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5191b {
        /* renamed from: a */
        void m25392a(FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(C5988g c5988g) {
        C3140em m25276b;
        String m23069b = c5988g.m23089m().m23069b();
        com.google.android.gms.common.internal.s.f(m23069b);
        C3663yi m30022a = C3638xj.m30022a(c5988g.m23093i(), C3586vj.m30123a(m23069b));
        C5248u c5248u = new C5248u(c5988g.m23093i(), c5988g.m23088n());
        C5212a0 m25347a = C5212a0.m25347a();
        C5214b0 m25341a = C5214b0.m25341a();
        this.f12934b = new CopyOnWriteArrayList();
        this.f12935c = new CopyOnWriteArrayList();
        this.f12936d = new CopyOnWriteArrayList();
        this.f12939g = new Object();
        this.f12941i = new Object();
        this.f12946n = ExecutorC5251x.m25264a();
        com.google.android.gms.common.internal.s.j(c5988g);
        this.f12933a = c5988g;
        com.google.android.gms.common.internal.s.j(m30022a);
        this.f12937e = m30022a;
        com.google.android.gms.common.internal.s.j(c5248u);
        this.f12943k = c5248u;
        com.google.android.gms.common.internal.s.j(m25347a);
        this.f12944l = m25347a;
        com.google.android.gms.common.internal.s.j(m25341a);
        AbstractC5203f m25277a = this.f12943k.m25277a();
        this.f12938f = m25277a;
        if (m25277a != null && (m25276b = this.f12943k.m25276b(m25277a)) != null) {
            m25401p(this, this.f12938f, m25276b, false, false);
        }
        this.f12944l.m25345c(this);
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C5988g.m23092j().m23095g(FirebaseAuth.class);
    }

    /* renamed from: n */
    public static void m25403n(FirebaseAuth firebaseAuth, AbstractC5203f abstractC5203f) {
        if (abstractC5203f != null) {
            String mo25302l = abstractC5203f.mo25302l();
            StringBuilder sb = new StringBuilder(String.valueOf(mo25302l).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(mo25302l);
            sb.append(" ).");
            Log.d("FirebaseAuth", sb.toString());
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f12946n.execute(new RunnableC5259l0(firebaseAuth));
    }

    /* renamed from: o */
    public static void m25402o(FirebaseAuth firebaseAuth, AbstractC5203f abstractC5203f) {
        if (abstractC5203f != null) {
            String mo25302l = abstractC5203f.mo25302l();
            StringBuilder sb = new StringBuilder(String.valueOf(mo25302l).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(mo25302l);
            sb.append(" ).");
            Log.d("FirebaseAuth", sb.toString());
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f12946n.execute(new RunnableC5257k0(firebaseAuth, new C6562b(abstractC5203f != null ? abstractC5203f.mo25308e0() : null)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static void m25401p(FirebaseAuth firebaseAuth, AbstractC5203f abstractC5203f, C3140em c3140em, boolean z, boolean z2) {
        boolean z3;
        com.google.android.gms.common.internal.s.j(abstractC5203f);
        com.google.android.gms.common.internal.s.j(c3140em);
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = firebaseAuth.f12938f != null && abstractC5203f.mo25302l().equals(firebaseAuth.f12938f.mo25302l());
        if (z6 || !z2) {
            AbstractC5203f abstractC5203f2 = firebaseAuth.f12938f;
            if (abstractC5203f2 == null) {
                z3 = true;
            } else {
                z4 = (!z6 || (abstractC5203f2.mo25309d0().m31173l().equals(c3140em.m31173l()) ^ true)) ? true : true;
                z3 = true ^ z6;
                z5 = z4;
            }
            com.google.android.gms.common.internal.s.j(abstractC5203f);
            AbstractC5203f abstractC5203f3 = firebaseAuth.f12938f;
            if (abstractC5203f3 == null) {
                firebaseAuth.f12938f = abstractC5203f;
            } else {
                abstractC5203f3.mo25312E(abstractC5203f.mo25306h());
                if (!abstractC5203f.mo25295s()) {
                    firebaseAuth.f12938f.mo25292u();
                }
                firebaseAuth.f12938f.mo25300m0(abstractC5203f.mo25307f().mo25260a());
            }
            if (z) {
                firebaseAuth.f12943k.m25274d(firebaseAuth.f12938f);
            }
            if (z5) {
                AbstractC5203f abstractC5203f4 = firebaseAuth.f12938f;
                if (abstractC5203f4 != null) {
                    abstractC5203f4.mo25301l0(c3140em);
                }
                m25402o(firebaseAuth, firebaseAuth.f12938f);
            }
            if (z3) {
                m25403n(firebaseAuth, firebaseAuth.f12938f);
            }
            if (z) {
                firebaseAuth.f12943k.m25273e(abstractC5203f, c3140em);
            }
            AbstractC5203f abstractC5203f5 = firebaseAuth.f12938f;
            if (abstractC5203f5 != null) {
                m25395v(firebaseAuth).m25268d(abstractC5203f5.mo25309d0());
            }
        }
    }

    /* renamed from: q */
    private final boolean m25400q(String str) {
        C5195b m25376b = C5195b.m25376b(str);
        return (m25376b == null || TextUtils.equals(this.f12942j, m25376b.m25375c())) ? false : true;
    }

    /* renamed from: v */
    public static C5250w m25395v(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f12945m == null) {
            C5988g c5988g = firebaseAuth.f12933a;
            com.google.android.gms.common.internal.s.j(c5988g);
            firebaseAuth.f12945m = new C5250w(c5988g);
        }
        return firebaseAuth.f12945m;
    }

    @Override // com.google.firebase.auth.internal.InterfaceC5213b
    /* renamed from: a */
    public void mo25343a(InterfaceC5211a interfaceC5211a) {
        com.google.android.gms.common.internal.s.j(interfaceC5211a);
        this.f12935c.add(interfaceC5211a);
        m25396u().m25269c(this.f12935c.size());
    }

    @Override // com.google.firebase.auth.internal.InterfaceC5213b
    /* renamed from: b */
    public final com.google.android.gms.tasks.j<C5207h> mo25342b(boolean z) {
        return m25399r(this.f12938f, z);
    }

    /* renamed from: c */
    public C5988g m25414c() {
        return this.f12933a;
    }

    /* renamed from: d */
    public AbstractC5203f m25413d() {
        return this.f12938f;
    }

    /* renamed from: e */
    public String m25412e() {
        String str;
        synchronized (this.f12939g) {
            str = this.f12940h;
        }
        return str;
    }

    /* renamed from: f */
    public void m25411f(String str) {
        com.google.android.gms.common.internal.s.f(str);
        synchronized (this.f12941i) {
            this.f12942j = str;
        }
    }

    /* renamed from: g */
    public com.google.android.gms.tasks.j<Object> m25410g(AbstractC5197c abstractC5197c) {
        com.google.android.gms.common.internal.s.j(abstractC5197c);
        AbstractC5197c mo25236h = abstractC5197c.mo25236h();
        if (mo25236h instanceof C5199d) {
            C5199d c5199d = (C5199d) mo25236h;
            if (!c5199d.m25371e0()) {
                C3663yi c3663yi = this.f12937e;
                C5988g c5988g = this.f12933a;
                String m25366u = c5199d.m25366u();
                String m25373E = c5199d.m25373E();
                com.google.android.gms.common.internal.s.f(m25373E);
                return c3663yi.m29952g(c5988g, m25366u, m25373E, this.f12942j, new C5263n0(this));
            }
            String m25372d0 = c5199d.m25372d0();
            com.google.android.gms.common.internal.s.f(m25372d0);
            if (m25400q(m25372d0)) {
                return C4469m.m27766e(C3137ej.m31187a(new Status(17072)));
            }
            return this.f12937e.m29951h(this.f12933a, c5199d, new C5263n0(this));
        } else if (mo25236h instanceof C5266p) {
            return this.f12937e.m29950i(this.f12933a, (C5266p) mo25236h, this.f12942j, new C5263n0(this));
        } else {
            return this.f12937e.m29954e(this.f12933a, mo25236h, this.f12942j, new C5263n0(this));
        }
    }

    /* renamed from: h */
    public com.google.android.gms.tasks.j<Object> m25409h(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return this.f12937e.m29953f(this.f12933a, str, this.f12942j, new C5263n0(this));
    }

    /* renamed from: i */
    public void m25408i() {
        m25405l();
        C5250w c5250w = this.f12945m;
        if (c5250w != null) {
            c5250w.m25270b();
        }
    }

    /* renamed from: l */
    public final void m25405l() {
        com.google.android.gms.common.internal.s.j(this.f12943k);
        AbstractC5203f abstractC5203f = this.f12938f;
        if (abstractC5203f != null) {
            C5248u c5248u = this.f12943k;
            com.google.android.gms.common.internal.s.j(abstractC5203f);
            c5248u.m25275c(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC5203f.mo25302l()));
            this.f12938f = null;
        }
        this.f12943k.m25275c("com.google.firebase.auth.FIREBASE_USER");
        m25402o(this, null);
        m25403n(this, null);
    }

    /* renamed from: m */
    public final void m25404m(AbstractC5203f abstractC5203f, C3140em c3140em, boolean z) {
        m25401p(this, abstractC5203f, c3140em, true, false);
    }

    /* renamed from: r */
    public final com.google.android.gms.tasks.j<C5207h> m25399r(AbstractC5203f abstractC5203f, boolean z) {
        if (abstractC5203f == null) {
            return C4469m.m27766e(C3137ej.m31187a(new Status(17495)));
        }
        C3140em mo25309d0 = abstractC5203f.mo25309d0();
        if (mo25309d0.m31177e0() && !z) {
            return C4469m.m27765f(C5239o.m25314a(mo25309d0.m31173l()));
        }
        return this.f12937e.m29948k(this.f12933a, abstractC5203f, mo25309d0.m31172s(), new C5261m0(this));
    }

    /* renamed from: s */
    public final com.google.android.gms.tasks.j<Object> m25398s(AbstractC5203f abstractC5203f, AbstractC5197c abstractC5197c) {
        com.google.android.gms.common.internal.s.j(abstractC5197c);
        com.google.android.gms.common.internal.s.j(abstractC5203f);
        return this.f12937e.m29947l(this.f12933a, abstractC5203f, abstractC5197c.mo25236h(), new C5265o0(this));
    }

    /* renamed from: t */
    public final com.google.android.gms.tasks.j<Object> m25397t(AbstractC5203f abstractC5203f, AbstractC5197c abstractC5197c) {
        com.google.android.gms.common.internal.s.j(abstractC5203f);
        com.google.android.gms.common.internal.s.j(abstractC5197c);
        AbstractC5197c mo25236h = abstractC5197c.mo25236h();
        if (mo25236h instanceof C5199d) {
            C5199d c5199d = (C5199d) mo25236h;
            if ("password".equals(c5199d.m25369k())) {
                C3663yi c3663yi = this.f12937e;
                C5988g c5988g = this.f12933a;
                String m25366u = c5199d.m25366u();
                String m25373E = c5199d.m25373E();
                com.google.android.gms.common.internal.s.f(m25373E);
                return c3663yi.m29944o(c5988g, abstractC5203f, m25366u, m25373E, abstractC5203f.mo25303k(), new C5265o0(this));
            }
            String m25372d0 = c5199d.m25372d0();
            com.google.android.gms.common.internal.s.f(m25372d0);
            if (m25400q(m25372d0)) {
                return C4469m.m27766e(C3137ej.m31187a(new Status(17072)));
            }
            return this.f12937e.m29945n(this.f12933a, abstractC5203f, c5199d, new C5265o0(this));
        } else if (mo25236h instanceof C5266p) {
            return this.f12937e.m29943p(this.f12933a, abstractC5203f, (C5266p) mo25236h, this.f12942j, new C5265o0(this));
        } else {
            return this.f12937e.m29946m(this.f12933a, abstractC5203f, mo25236h, abstractC5203f.mo25303k(), new C5265o0(this));
        }
    }

    /* renamed from: u */
    public final synchronized C5250w m25396u() {
        return m25395v(this);
    }

    @Keep
    public static FirebaseAuth getInstance(C5988g c5988g) {
        return (FirebaseAuth) c5988g.m23095g(FirebaseAuth.class);
    }
}
