package com.google.firebase.database.p131s;

import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.j;
import com.google.firebase.database.C5608b;
import com.google.firebase.database.C5611c;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.C5615f;
import com.google.firebase.database.C5617i;
import com.google.firebase.database.C5619l;
import com.google.firebase.database.C5623n;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.InterfaceC5627o;
import com.google.firebase.database.p129r.C5688l;
import com.google.firebase.database.p129r.C5709p;
import com.google.firebase.database.p129r.InterfaceC5689m;
import com.google.firebase.database.p129r.InterfaceC5690n;
import com.google.firebase.database.p129r.InterfaceC5710q;
import com.google.firebase.database.p131s.C5865t;
import com.google.firebase.database.p131s.C5870v;
import com.google.firebase.database.p131s.InterfaceC5892y;
import com.google.firebase.database.p131s.p133h0.C5757d;
import com.google.firebase.database.p131s.p133h0.InterfaceC5758e;
import com.google.firebase.database.p131s.p134i0.AbstractC5775c;
import com.google.firebase.database.p131s.p134i0.C5774b;
import com.google.firebase.database.p131s.p134i0.C5784f;
import com.google.firebase.database.p131s.p134i0.C5790k;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5809g;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5948o;
import com.google.firebase.database.p139u.C5952s;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: Repo.java */
/* renamed from: com.google.firebase.database.s.n */
/* loaded from: classes2.dex */
public class C5833n implements InterfaceC5690n.InterfaceC5691a {

    /* renamed from: a */
    private final C5859o f14317a;

    /* renamed from: c */
    private InterfaceC5690n f14319c;

    /* renamed from: d */
    private C5864s f14320d;

    /* renamed from: e */
    private C5865t f14321e;

    /* renamed from: f */
    private C5790k<List<C5857t>> f14322f;

    /* renamed from: h */
    private final C5809g f14324h;

    /* renamed from: i */
    private final C5743g f14325i;

    /* renamed from: j */
    private final C5899c f14326j;

    /* renamed from: k */
    private final C5899c f14327k;

    /* renamed from: l */
    private final C5899c f14328l;

    /* renamed from: o */
    private C5870v f14331o;

    /* renamed from: p */
    private C5870v f14332p;

    /* renamed from: b */
    private final C5784f f14318b = new C5784f(new C5774b(), 0);

    /* renamed from: g */
    private boolean f14323g = false;

    /* renamed from: m */
    public long f14329m = 0;

    /* renamed from: n */
    private long f14330n = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$a */
    /* loaded from: classes2.dex */
    public class C5834a implements C5865t.InterfaceC5868c {

        /* renamed from: a */
        final /* synthetic */ Map f14333a;

        /* renamed from: b */
        final /* synthetic */ List f14334b;

        C5834a(Map map, List list) {
            this.f14333a = map;
            this.f14334b = list;
        }

        @Override // com.google.firebase.database.p131s.C5865t.InterfaceC5868c
        /* renamed from: a */
        public void mo23474a(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
            this.f14334b.addAll(C5833n.this.f14332p.m23411z(c5830l, C5862r.m23482i(interfaceC5945n, C5833n.this.f14332p.m23453I(c5830l, new ArrayList()), this.f14333a)));
            C5833n.this.m23553S(C5833n.this.m23539e(c5830l, -9));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$b */
    /* loaded from: classes2.dex */
    public class C5835b implements C5790k.InterfaceC5793c<List<C5857t>> {
        C5835b() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5790k.InterfaceC5793c
        /* renamed from: a */
        public void mo23516a(C5790k<List<C5857t>> c5790k) {
            C5833n.this.m23548X(c5790k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$c */
    /* loaded from: classes2.dex */
    public class C5836c implements InterfaceC5710q {

        /* renamed from: a */
        final /* synthetic */ C5830l f14337a;

        /* renamed from: b */
        final /* synthetic */ List f14338b;

        /* renamed from: c */
        final /* synthetic */ C5833n f14339c;

        /* compiled from: Repo.java */
        /* renamed from: com.google.firebase.database.s.n$c$a */
        /* loaded from: classes2.dex */
        class RunnableC5837a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C5857t f14341c;

            /* renamed from: d */
            final /* synthetic */ C5608b f14342d;

            RunnableC5837a(C5836c c5836c, C5857t c5857t, C5608b c5608b) {
                this.f14341c = c5857t;
                this.f14342d = c5608b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14341c.f14385d.m24298a(null, true, this.f14342d);
            }
        }

        C5836c(C5830l c5830l, List list, C5833n c5833n) {
            this.f14337a = c5830l;
            this.f14338b = list;
            this.f14339c = c5833n;
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5710q
        /* renamed from: a */
        public void mo23515a(String str, String str2) {
            C5611c m23565G = C5833n.m23565G(str, str2);
            C5833n.this.m23542b0("Transaction", this.f14337a, m23565G);
            ArrayList arrayList = new ArrayList();
            if (m23565G == null) {
                ArrayList arrayList2 = new ArrayList();
                for (C5857t c5857t : this.f14338b) {
                    c5857t.f14387f = EnumC5858u.COMPLETED;
                    arrayList.addAll(C5833n.this.f14332p.m23418s(c5857t.f14380A, false, false, C5833n.this.f14318b));
                    arrayList2.add(new RunnableC5837a(this, c5857t, C5617i.m24313a(C5617i.m24311c(this.f14339c, c5857t.f14384c), C5938i.m23240e(c5857t.f14383D))));
                    C5833n c5833n = C5833n.this;
                    c5833n.m23555Q(new C5728b0(c5833n, c5857t.f14386e, C5814i.m23647a(c5857t.f14384c)));
                }
                C5833n c5833n2 = C5833n.this;
                c5833n2.m23556P(c5833n2.f14322f.m23755k(this.f14337a));
                C5833n.this.m23549W();
                this.f14339c.m23557O(arrayList);
                for (int i = 0; i < arrayList2.size(); i++) {
                    C5833n.this.m23558N((Runnable) arrayList2.get(i));
                }
                return;
            }
            if (m23565G.m24331f() == -1) {
                for (C5857t c5857t2 : this.f14338b) {
                    if (c5857t2.f14387f == EnumC5858u.SENT_NEEDS_ABORT) {
                        c5857t2.f14387f = EnumC5858u.NEEDS_ABORT;
                    } else {
                        c5857t2.f14387f = EnumC5858u.RUN;
                    }
                }
            } else {
                for (C5857t c5857t3 : this.f14338b) {
                    c5857t3.f14387f = EnumC5858u.NEEDS_ABORT;
                    c5857t3.f14391z = m23565G;
                }
            }
            C5833n.this.m23553S(this.f14337a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$d */
    /* loaded from: classes2.dex */
    public class C5838d implements C5790k.InterfaceC5793c<List<C5857t>> {
        C5838d() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5790k.InterfaceC5793c
        /* renamed from: a */
        public void mo23516a(C5790k<List<C5857t>> c5790k) {
            C5833n.this.m23556P(c5790k);
        }
    }

    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$e */
    /* loaded from: classes2.dex */
    class RunnableC5839e implements Runnable {
        RunnableC5839e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5833n.this.m23566F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$f */
    /* loaded from: classes2.dex */
    public class RunnableC5840f implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C5857t f14345c;

        RunnableC5840f(C5857t c5857t) {
            this.f14345c = c5857t;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5833n c5833n = C5833n.this;
            c5833n.m23555Q(new C5728b0(c5833n, this.f14345c.f14386e, C5814i.m23647a(this.f14345c.f14384c)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$g */
    /* loaded from: classes2.dex */
    public class RunnableC5841g implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C5857t f14347c;

        /* renamed from: d */
        final /* synthetic */ C5611c f14348d;

        /* renamed from: e */
        final /* synthetic */ C5608b f14349e;

        RunnableC5841g(C5833n c5833n, C5857t c5857t, C5611c c5611c, C5608b c5608b) {
            this.f14347c = c5857t;
            this.f14348d = c5611c;
            this.f14349e = c5608b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14347c.f14385d.m24298a(this.f14348d, false, this.f14349e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$h */
    /* loaded from: classes2.dex */
    public class C5842h implements C5790k.InterfaceC5793c<List<C5857t>> {

        /* renamed from: a */
        final /* synthetic */ List f14350a;

        C5842h(List list) {
            this.f14350a = list;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5790k.InterfaceC5793c
        /* renamed from: a */
        public void mo23516a(C5790k<List<C5857t>> c5790k) {
            C5833n.this.m23569C(this.f14350a, c5790k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$i */
    /* loaded from: classes2.dex */
    public class C5843i implements C5790k.InterfaceC5792b<List<C5857t>> {

        /* renamed from: a */
        final /* synthetic */ int f14352a;

        C5843i(int i) {
            this.f14352a = i;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5790k.InterfaceC5792b
        /* renamed from: a */
        public boolean mo23517a(C5790k<List<C5857t>> c5790k) {
            C5833n.this.m23538f(c5790k, this.f14352a);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$j */
    /* loaded from: classes2.dex */
    public class C5844j implements C5790k.InterfaceC5793c<List<C5857t>> {

        /* renamed from: a */
        final /* synthetic */ int f14354a;

        C5844j(int i) {
            this.f14354a = i;
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5790k.InterfaceC5793c
        /* renamed from: a */
        public void mo23516a(C5790k<List<C5857t>> c5790k) {
            C5833n.this.m23538f(c5790k, this.f14354a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$k */
    /* loaded from: classes2.dex */
    public class RunnableC5845k implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C5857t f14356c;

        /* renamed from: d */
        final /* synthetic */ C5611c f14357d;

        RunnableC5845k(C5833n c5833n, C5857t c5857t, C5611c c5611c) {
            this.f14356c = c5857t;
            this.f14357d = c5611c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14356c.f14385d.m24298a(this.f14357d, false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$l */
    /* loaded from: classes2.dex */
    public class C5846l implements InterfaceC5892y.InterfaceC5894b {
        C5846l() {
        }

        @Override // com.google.firebase.database.p131s.InterfaceC5892y.InterfaceC5894b
        /* renamed from: a */
        public void mo23380a(String str) {
            C5833n.this.f14326j.m23366b("Auth token changed, triggering auth token refresh", new Object[0]);
            C5833n.this.f14319c.mo24107k(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$m */
    /* loaded from: classes2.dex */
    public class C5847m implements InterfaceC5892y.InterfaceC5894b {
        C5847m() {
        }

        @Override // com.google.firebase.database.p131s.InterfaceC5892y.InterfaceC5894b
        /* renamed from: a */
        public void mo23380a(String str) {
            C5833n.this.f14326j.m23366b("App check token changed, triggering app check token refresh", new Object[0]);
            C5833n.this.f14319c.mo24103m(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$n */
    /* loaded from: classes2.dex */
    public class C5848n implements C5870v.InterfaceC5888r {

        /* compiled from: Repo.java */
        /* renamed from: com.google.firebase.database.s.n$n$a */
        /* loaded from: classes2.dex */
        class RunnableC5849a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C5814i f14361c;

            /* renamed from: d */
            final /* synthetic */ C5870v.InterfaceC5886p f14362d;

            RunnableC5849a(C5814i c5814i, C5870v.InterfaceC5886p interfaceC5886p) {
                this.f14361c = c5814i;
                this.f14362d = interfaceC5886p;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC5945n m23480a = C5833n.this.f14320d.m23480a(this.f14361c.m23643e());
                if (m23480a.isEmpty()) {
                    return;
                }
                C5833n.this.m23557O(C5833n.this.f14331o.m23411z(this.f14361c.m23643e(), m23480a));
                this.f14362d.mo23394a(null);
            }
        }

        C5848n() {
        }

        @Override // com.google.firebase.database.p131s.C5870v.InterfaceC5888r
        /* renamed from: a */
        public void mo23389a(C5814i c5814i, C5889w c5889w) {
        }

        @Override // com.google.firebase.database.p131s.C5870v.InterfaceC5888r
        /* renamed from: b */
        public void mo23388b(C5814i c5814i, C5889w c5889w, InterfaceC5689m interfaceC5689m, C5870v.InterfaceC5886p interfaceC5886p) {
            C5833n.this.m23550V(new RunnableC5849a(c5814i, interfaceC5886p));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$o */
    /* loaded from: classes2.dex */
    public class C5850o implements C5870v.InterfaceC5888r {

        /* compiled from: Repo.java */
        /* renamed from: com.google.firebase.database.s.n$o$a */
        /* loaded from: classes2.dex */
        class C5851a implements InterfaceC5710q {

            /* renamed from: a */
            final /* synthetic */ C5870v.InterfaceC5886p f14365a;

            C5851a(C5870v.InterfaceC5886p interfaceC5886p) {
                this.f14365a = interfaceC5886p;
            }

            @Override // com.google.firebase.database.p129r.InterfaceC5710q
            /* renamed from: a */
            public void mo23515a(String str, String str2) {
                C5833n.this.m23557O(this.f14365a.mo23394a(C5833n.m23565G(str, str2)));
            }
        }

        C5850o() {
        }

        @Override // com.google.firebase.database.p131s.C5870v.InterfaceC5888r
        /* renamed from: a */
        public void mo23389a(C5814i c5814i, C5889w c5889w) {
            C5833n.this.f14319c.mo24099o(c5814i.m23643e().m23594F(), c5814i.m23644d().m23656i());
        }

        @Override // com.google.firebase.database.p131s.C5870v.InterfaceC5888r
        /* renamed from: b */
        public void mo23388b(C5814i c5814i, C5889w c5889w, InterfaceC5689m interfaceC5689m, C5870v.InterfaceC5886p interfaceC5886p) {
            C5833n.this.f14319c.mo24105l(c5814i.m23643e().m23594F(), c5814i.m23644d().m23656i(), interfaceC5689m, c5889w != null ? Long.valueOf(c5889w.m23387a()) : null, new C5851a(interfaceC5886p));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$p */
    /* loaded from: classes2.dex */
    public class C5852p implements InterfaceC5710q {

        /* renamed from: a */
        final /* synthetic */ C5895z f14367a;

        C5852p(C5895z c5895z) {
            this.f14367a = c5895z;
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5710q
        /* renamed from: a */
        public void mo23515a(String str, String str2) {
            C5611c m23565G = C5833n.m23565G(str, str2);
            C5833n.this.m23542b0("Persisted write", this.f14367a.m23377c(), m23565G);
            C5833n.this.m23571A(this.f14367a.m23376d(), this.f14367a.m23377c(), m23565G);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$q */
    /* loaded from: classes2.dex */
    public class RunnableC5853q implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C5612d.InterfaceC5614b f14369c;

        /* renamed from: d */
        final /* synthetic */ C5611c f14370d;

        /* renamed from: e */
        final /* synthetic */ C5612d f14371e;

        RunnableC5853q(C5833n c5833n, C5612d.InterfaceC5614b interfaceC5614b, C5611c c5611c, C5612d c5612d) {
            this.f14369c = interfaceC5614b;
            this.f14370d = c5611c;
            this.f14371e = c5612d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14369c.mo23738a(this.f14370d, this.f14371e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$r */
    /* loaded from: classes2.dex */
    public class C5854r implements InterfaceC5710q {

        /* renamed from: a */
        final /* synthetic */ C5830l f14372a;

        /* renamed from: b */
        final /* synthetic */ long f14373b;

        /* renamed from: c */
        final /* synthetic */ C5612d.InterfaceC5614b f14374c;

        C5854r(C5830l c5830l, long j, C5612d.InterfaceC5614b interfaceC5614b) {
            this.f14372a = c5830l;
            this.f14373b = j;
            this.f14374c = interfaceC5614b;
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5710q
        /* renamed from: a */
        public void mo23515a(String str, String str2) {
            C5611c m23565G = C5833n.m23565G(str, str2);
            C5833n.this.m23542b0("setValue", this.f14372a, m23565G);
            C5833n.this.m23571A(this.f14373b, this.f14372a, m23565G);
            C5833n.this.m23567E(this.f14374c, m23565G, this.f14372a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$s */
    /* loaded from: classes2.dex */
    public class RunnableC5855s implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C5619l f14376c;

        /* renamed from: d */
        final /* synthetic */ C4465k f14377d;

        /* compiled from: Repo.java */
        /* renamed from: com.google.firebase.database.s.n$s$a */
        /* loaded from: classes2.dex */
        class C5856a implements InterfaceC4454e<Object> {
            C5856a() {
            }

            @Override // com.google.android.gms.tasks.InterfaceC4454e
            /* renamed from: a */
            public void mo21856a(j<Object> jVar) {
                if (!jVar.p()) {
                    C5899c c5899c = C5833n.this.f14326j;
                    c5899c.m23363e("get for query " + RunnableC5855s.this.f14376c.m24304e() + " falling back to disk cache after error: " + jVar.k().getMessage());
                    C5608b m23447O = C5833n.this.f14332p.m23447O(RunnableC5855s.this.f14376c);
                    if (!m23447O.m24344b()) {
                        RunnableC5855s.this.f14377d.m27776b(jVar.k());
                    } else {
                        RunnableC5855s.this.f14377d.m27775c(m23447O);
                    }
                } else {
                    InterfaceC5945n m23207a = C5948o.m23207a(jVar.l());
                    C5833n c5833n = C5833n.this;
                    c5833n.m23557O(c5833n.f14332p.m23411z(RunnableC5855s.this.f14376c.m24304e(), m23207a));
                    RunnableC5855s runnableC5855s = RunnableC5855s.this;
                    runnableC5855s.f14377d.m27775c(C5617i.m24313a(runnableC5855s.f14376c.m24303f(), C5938i.m23239f(m23207a, RunnableC5855s.this.f14376c.m24302g().m23645c())));
                }
                C5833n.this.f14332p.m23439W(RunnableC5855s.this.f14376c.m24302g());
            }
        }

        RunnableC5855s(C5619l c5619l, C4465k c4465k) {
            this.f14376c = c5619l;
            this.f14377d = c4465k;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC5945n m23449M = C5833n.this.f14332p.m23449M(this.f14376c.m24302g());
            if (m23449M == null) {
                C5833n.this.f14332p.m23440V(this.f14376c.m24302g());
                C5833n.this.f14319c.mo24125b(this.f14376c.m24304e().m23594F(), this.f14376c.m24302g().m23644d().m23656i()).c(((AbstractC5775c) C5833n.this.f14325i.m23919u()).m23800c(), new C5856a());
                return;
            }
            this.f14377d.m27775c(C5617i.m24313a(this.f14376c.m24303f(), C5938i.m23240e(m23449M)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$t */
    /* loaded from: classes2.dex */
    public static class C5857t implements Comparable<C5857t> {

        /* renamed from: A */
        private long f14380A;

        /* renamed from: B */
        private InterfaceC5945n f14381B;

        /* renamed from: C */
        private InterfaceC5945n f14382C;

        /* renamed from: D */
        private InterfaceC5945n f14383D;

        /* renamed from: c */
        private C5830l f14384c;

        /* renamed from: d */
        private C5623n.InterfaceC5625b f14385d;

        /* renamed from: e */
        private InterfaceC5627o f14386e;

        /* renamed from: f */
        private EnumC5858u f14387f;

        /* renamed from: w */
        private long f14388w;

        /* renamed from: x */
        private boolean f14389x;

        /* renamed from: y */
        private int f14390y;

        /* renamed from: z */
        private C5611c f14391z;

        /* renamed from: r */
        static /* synthetic */ int m23500r(C5857t c5857t) {
            int i = c5857t.f14390y;
            c5857t.f14390y = i + 1;
            return i;
        }

        @Override // java.lang.Comparable
        /* renamed from: F */
        public int compareTo(C5857t c5857t) {
            long j = this.f14388w;
            long j2 = c5857t.f14388w;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Repo.java */
    /* renamed from: com.google.firebase.database.s.n$u */
    /* loaded from: classes2.dex */
    public enum EnumC5858u {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5833n(C5859o c5859o, C5743g c5743g, C5615f c5615f) {
        this.f14317a = c5859o;
        this.f14325i = c5743g;
        this.f14326j = c5743g.m23924p("RepoOperation");
        this.f14327k = this.f14325i.m23924p("Transaction");
        this.f14328l = this.f14325i.m23924p("DataOperation");
        this.f14324h = new C5809g(this.f14325i);
        m23550V(new RunnableC5839e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m23571A(long j, C5830l c5830l, C5611c c5611c) {
        if (c5611c == null || c5611c.m24331f() != -25) {
            List<? extends InterfaceC5805e> m23418s = this.f14332p.m23418s(j, !(c5611c == null), true, this.f14318b);
            if (m23418s.size() > 0) {
                m23553S(c5830l);
            }
            m23557O(m23418s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m23569C(List<C5857t> list, C5790k<List<C5857t>> c5790k) {
        List<C5857t> m23759g = c5790k.m23759g();
        if (m23759g != null) {
            list.addAll(m23759g);
        }
        c5790k.m23763c(new C5842h(list));
    }

    /* renamed from: D */
    private List<C5857t> m23568D(C5790k<List<C5857t>> c5790k) {
        ArrayList arrayList = new ArrayList();
        m23569C(arrayList, c5790k);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m23566F() {
        C5859o c5859o = this.f14317a;
        this.f14319c = this.f14325i.m23943D(new C5688l(c5859o.f14399a, c5859o.f14401c, c5859o.f14400b), this);
        this.f14325i.m23928l().mo23382b(((AbstractC5775c) this.f14325i.m23919u()).m23800c(), new C5846l());
        this.f14325i.m23929k().mo23382b(((AbstractC5775c) this.f14325i.m23919u()).m23800c(), new C5847m());
        this.f14319c.mo24127a();
        InterfaceC5758e m23921s = this.f14325i.m23921s(this.f14317a.f14399a);
        this.f14320d = new C5864s();
        this.f14321e = new C5865t();
        this.f14322f = new C5790k<>();
        this.f14331o = new C5870v(this.f14325i, new C5757d(), new C5848n());
        this.f14332p = new C5870v(this.f14325i, m23921s, new C5850o());
        m23552T(m23921s);
        m23544a0(C5741f.f14130c, Boolean.FALSE);
        m23544a0(C5741f.f14131d, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static C5611c m23565G(String str, String str2) {
        if (str != null) {
            return C5611c.m24333d(str, str2);
        }
        return null;
    }

    /* renamed from: H */
    private C5790k<List<C5857t>> m23564H(C5830l c5830l) {
        C5790k<List<C5857t>> c5790k = this.f14322f;
        while (!c5830l.isEmpty() && c5790k.m23759g() == null) {
            c5790k = c5790k.m23755k(new C5830l(c5830l.m23587Z()));
            c5830l = c5830l.m23583e0();
        }
        return c5790k;
    }

    /* renamed from: I */
    private InterfaceC5945n m23563I(C5830l c5830l, List<Long> list) {
        InterfaceC5945n m23453I = this.f14332p.m23453I(c5830l, list);
        return m23453I == null ? C5936g.m23249P() : m23453I;
    }

    /* renamed from: J */
    private long m23562J() {
        long j = this.f14330n;
        this.f14330n = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public void m23557O(List<? extends InterfaceC5805e> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f14324h.m23665b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m23556P(C5790k<List<C5857t>> c5790k) {
        List<C5857t> m23759g = c5790k.m23759g();
        if (m23759g != null) {
            int i = 0;
            while (i < m23759g.size()) {
                if (m23759g.get(i).f14387f == EnumC5858u.COMPLETED) {
                    m23759g.remove(i);
                } else {
                    i++;
                }
            }
            if (m23759g.size() > 0) {
                c5790k.m23756j(m23759g);
            } else {
                c5790k.m23756j(null);
            }
        }
        c5790k.m23763c(new C5838d());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0033 A[SYNTHETIC] */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m23554R(java.util.List<com.google.firebase.database.p131s.C5833n.C5857t> r23, com.google.firebase.database.p131s.C5830l r24) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.p131s.C5833n.m23554R(java.util.List, com.google.firebase.database.s.l):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public C5830l m23553S(C5830l c5830l) {
        C5790k<List<C5857t>> m23564H = m23564H(c5830l);
        C5830l m23760f = m23564H.m23760f();
        m23554R(m23568D(m23564H), m23760f);
        return m23760f;
    }

    /* renamed from: T */
    private void m23552T(InterfaceC5758e interfaceC5758e) {
        List<C5895z> mo23885d = interfaceC5758e.mo23885d();
        Map<String, Object> m23488c = C5862r.m23488c(this.f14318b);
        long j = Long.MIN_VALUE;
        for (C5895z c5895z : mo23885d) {
            C5852p c5852p = new C5852p(c5895z);
            if (j < c5895z.m23376d()) {
                j = c5895z.m23376d();
                this.f14330n = c5895z.m23376d() + 1;
                if (c5895z.m23375e()) {
                    if (this.f14326j.m23362f()) {
                        C5899c c5899c = this.f14326j;
                        c5899c.m23366b("Restoring overwrite with id " + c5895z.m23376d(), new Object[0]);
                    }
                    this.f14319c.mo24113h(c5895z.m23377c().m23594F(), c5895z.m23378b().mo23215W(true), c5852p);
                    this.f14332p.m23454H(c5895z.m23377c(), c5895z.m23378b(), C5862r.m23484g(c5895z.m23378b(), this.f14332p, c5895z.m23377c(), m23488c), c5895z.m23376d(), true, false);
                } else {
                    if (this.f14326j.m23362f()) {
                        C5899c c5899c2 = this.f14326j;
                        c5899c2.m23366b("Restoring merge with id " + c5895z.m23376d(), new Object[0]);
                    }
                    this.f14319c.mo24123c(c5895z.m23377c().m23594F(), c5895z.m23379a().m23974J(true), c5852p);
                    this.f14332p.m23455G(c5895z.m23377c(), c5895z.m23379a(), C5862r.m23485f(c5895z.m23379a(), this.f14332p, c5895z.m23377c(), m23488c), c5895z.m23376d(), false);
                }
            } else {
                throw new IllegalStateException("Write ids were not in order.");
            }
        }
    }

    /* renamed from: U */
    private void m23551U() {
        Map<String, Object> m23488c = C5862r.m23488c(this.f14318b);
        ArrayList arrayList = new ArrayList();
        this.f14321e.m23476b(C5830l.m23588X(), new C5834a(m23488c, arrayList));
        this.f14321e = new C5865t();
        m23557O(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m23549W() {
        C5790k<List<C5857t>> c5790k = this.f14322f;
        m23556P(c5790k);
        m23548X(c5790k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m23548X(C5790k<List<C5857t>> c5790k) {
        if (c5790k.m23759g() != null) {
            List<C5857t> m23568D = m23568D(c5790k);
            C5795m.m23745f(m23568D.size() > 0);
            Boolean bool = Boolean.TRUE;
            Iterator<C5857t> it = m23568D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f14387f != EnumC5858u.RUN) {
                    bool = Boolean.FALSE;
                    break;
                }
            }
            if (bool.booleanValue()) {
                m23547Y(m23568D, c5790k.m23760f());
            }
        } else if (c5790k.m23758h()) {
            c5790k.m23763c(new C5835b());
        }
    }

    /* renamed from: Y */
    private void m23547Y(List<C5857t> list, C5830l c5830l) {
        ArrayList arrayList = new ArrayList();
        for (C5857t c5857t : list) {
            arrayList.add(Long.valueOf(c5857t.f14380A));
        }
        InterfaceC5945n m23563I = m23563I(c5830l, arrayList);
        String mo23212t = !this.f14323g ? m23563I.mo23212t() : "badhash";
        Iterator<C5857t> it = list.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                C5857t next = it.next();
                if (next.f14387f != EnumC5858u.RUN) {
                    z = false;
                }
                C5795m.m23745f(z);
                next.f14387f = EnumC5858u.SENT;
                C5857t.m23500r(next);
                m23563I = m23563I.mo23218H(C5830l.m23585d0(c5830l, next.f14384c), next.f14382C);
            } else {
                this.f14319c.mo24109j(c5830l.m23594F(), m23563I.mo23215W(true), mo23212t, new C5836c(c5830l, list, this));
                return;
            }
        }
    }

    /* renamed from: a0 */
    private void m23544a0(C5921b c5921b, Object obj) {
        if (c5921b.equals(C5741f.f14129b)) {
            this.f14318b.m23771b(((Long) obj).longValue());
        }
        C5830l c5830l = new C5830l(C5741f.f14128a, c5921b);
        try {
            InterfaceC5945n m23207a = C5948o.m23207a(obj);
            this.f14320d.m23478c(c5830l, m23207a);
            m23557O(this.f14331o.m23411z(c5830l, m23207a));
        } catch (DatabaseException e) {
            this.f14326j.m23365c("Failed to parse info update", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m23542b0(String str, C5830l c5830l, C5611c c5611c) {
        if (c5611c == null || c5611c.m24331f() == -1 || c5611c.m24331f() == -25) {
            return;
        }
        C5899c c5899c = this.f14326j;
        c5899c.m23359i(str + " at " + c5830l.toString() + " failed: " + c5611c.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public C5830l m23539e(C5830l c5830l, int i) {
        C5830l m23760f = m23564H(c5830l).m23760f();
        if (this.f14327k.m23362f()) {
            C5899c c5899c = this.f14326j;
            c5899c.m23366b("Aborting transactions for path: " + c5830l + ". Affected: " + m23760f, new Object[0]);
        }
        C5790k<List<C5857t>> m23755k = this.f14322f.m23755k(c5830l);
        m23755k.m23765a(new C5843i(i));
        m23538f(m23755k, i);
        m23755k.m23762d(new C5844j(i));
        return m23760f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m23538f(C5790k<List<C5857t>> c5790k, int i) {
        C5611c m24336a;
        List<C5857t> m23759g = c5790k.m23759g();
        ArrayList arrayList = new ArrayList();
        if (m23759g != null) {
            ArrayList<Runnable> arrayList2 = new ArrayList();
            if (i == -9) {
                m24336a = C5611c.m24334c("overriddenBySet");
            } else {
                boolean z = i == -25;
                C5795m.m23744g(z, "Unknown transaction abort reason: " + i);
                m24336a = C5611c.m24336a(-25);
            }
            int i2 = -1;
            for (int i3 = 0; i3 < m23759g.size(); i3++) {
                C5857t c5857t = m23759g.get(i3);
                if (c5857t.f14387f != EnumC5858u.SENT_NEEDS_ABORT) {
                    if (c5857t.f14387f == EnumC5858u.SENT) {
                        C5795m.m23745f(i2 == i3 + (-1));
                        c5857t.f14387f = EnumC5858u.SENT_NEEDS_ABORT;
                        c5857t.f14391z = m24336a;
                        i2 = i3;
                    } else {
                        C5795m.m23745f(c5857t.f14387f == EnumC5858u.RUN);
                        m23555Q(new C5728b0(this, c5857t.f14386e, C5814i.m23647a(c5857t.f14384c)));
                        if (i == -9) {
                            arrayList.addAll(this.f14332p.m23418s(c5857t.f14380A, true, false, this.f14318b));
                        } else {
                            boolean z2 = i == -25;
                            C5795m.m23744g(z2, "Unknown transaction abort reason: " + i);
                        }
                        arrayList2.add(new RunnableC5845k(this, c5857t, m24336a));
                    }
                }
            }
            if (i2 == -1) {
                c5790k.m23756j(null);
            } else {
                c5790k.m23756j(m23759g.subList(0, i2 + 1));
            }
            m23557O(arrayList);
            for (Runnable runnable : arrayList2) {
                m23558N(runnable);
            }
        }
    }

    /* renamed from: B */
    public void m23570B(AbstractC5772i abstractC5772i) {
        List<? extends InterfaceC5805e> m23417t;
        C5921b m23587Z = abstractC5772i.mo23808e().m23643e().m23587Z();
        if (m23587Z != null && m23587Z.equals(C5741f.f14128a)) {
            m23417t = this.f14331o.m23417t(abstractC5772i);
        } else {
            m23417t = this.f14332p.m23417t(abstractC5772i);
        }
        m23557O(m23417t);
    }

    /* renamed from: E */
    void m23567E(C5612d.InterfaceC5614b interfaceC5614b, C5611c c5611c, C5830l c5830l) {
        C5612d m24311c;
        if (interfaceC5614b != null) {
            C5921b m23589V = c5830l.m23589V();
            if (m23589V != null && m23589V.m23292p()) {
                m24311c = C5617i.m24311c(this, c5830l.m23586b0());
            } else {
                m24311c = C5617i.m24311c(this, c5830l);
            }
            m23558N(new RunnableC5853q(this, interfaceC5614b, c5611c, m24311c));
        }
    }

    /* renamed from: K */
    public long m23561K() {
        return this.f14318b.mo23772a();
    }

    /* renamed from: L */
    public j<C5608b> m23560L(C5619l c5619l) {
        C4465k c4465k = new C4465k();
        m23550V(new RunnableC5855s(c5619l, c4465k));
        return c4465k.m27777a();
    }

    /* renamed from: M */
    public void m23559M(C5921b c5921b, Object obj) {
        m23544a0(c5921b, obj);
    }

    /* renamed from: N */
    public void m23558N(Runnable runnable) {
        this.f14325i.m23942E();
        this.f14325i.m23926n().mo23595b(runnable);
    }

    /* renamed from: Q */
    public void m23555Q(AbstractC5772i abstractC5772i) {
        List<InterfaceC5805e> m23443S;
        if (C5741f.f14128a.equals(abstractC5772i.mo23808e().m23643e().m23587Z())) {
            m23443S = this.f14331o.m23443S(abstractC5772i);
        } else {
            m23443S = this.f14332p.m23443S(abstractC5772i);
        }
        m23557O(m23443S);
    }

    /* renamed from: V */
    public void m23550V(Runnable runnable) {
        this.f14325i.m23942E();
        this.f14325i.m23919u().mo23491b(runnable);
    }

    /* renamed from: Z */
    public void m23546Z(C5830l c5830l, InterfaceC5945n interfaceC5945n, C5612d.InterfaceC5614b interfaceC5614b) {
        if (this.f14326j.m23362f()) {
            C5899c c5899c = this.f14326j;
            c5899c.m23366b("set: " + c5830l, new Object[0]);
        }
        if (this.f14328l.m23362f()) {
            C5899c c5899c2 = this.f14328l;
            c5899c2.m23366b("set: " + c5830l + " " + interfaceC5945n, new Object[0]);
        }
        InterfaceC5945n m23482i = C5862r.m23482i(interfaceC5945n, this.f14332p.m23453I(c5830l, new ArrayList()), C5862r.m23488c(this.f14318b));
        long m23562J = m23562J();
        m23557O(this.f14332p.m23454H(c5830l, interfaceC5945n, m23482i, m23562J, true, true));
        this.f14319c.mo24113h(c5830l.m23594F(), interfaceC5945n.mo23215W(true), new C5854r(c5830l, m23562J, interfaceC5614b));
        m23553S(m23539e(c5830l, -9));
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n.InterfaceC5691a
    /* renamed from: a */
    public void mo23545a(List<String> list, Object obj, boolean z, Long l) {
        List<? extends InterfaceC5805e> m23411z;
        C5830l c5830l = new C5830l(list);
        if (this.f14326j.m23362f()) {
            this.f14326j.m23366b("onDataUpdate: " + c5830l, new Object[0]);
        }
        if (this.f14328l.m23362f()) {
            this.f14326j.m23366b("onDataUpdate: " + c5830l + " " + obj, new Object[0]);
        }
        this.f14329m++;
        try {
            if (l != null) {
                C5889w c5889w = new C5889w(l.longValue());
                if (z) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new C5830l((String) entry.getKey()), C5948o.m23207a(entry.getValue()));
                    }
                    m23411z = this.f14332p.m23458D(c5830l, hashMap, c5889w);
                } else {
                    m23411z = this.f14332p.m23457E(c5830l, C5948o.m23207a(obj), c5889w);
                }
            } else if (z) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    hashMap2.put(new C5830l((String) entry2.getKey()), C5948o.m23207a(entry2.getValue()));
                }
                m23411z = this.f14332p.m23412y(c5830l, hashMap2);
            } else {
                m23411z = this.f14332p.m23411z(c5830l, C5948o.m23207a(obj));
            }
            if (m23411z.size() > 0) {
                m23553S(c5830l);
            }
            m23557O(m23411z);
        } catch (DatabaseException e) {
            this.f14326j.m23365c("FIREBASE INTERNAL ERROR", e);
        }
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n.InterfaceC5691a
    /* renamed from: b */
    public void mo23543b(boolean z) {
        m23559M(C5741f.f14130c, Boolean.valueOf(z));
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n.InterfaceC5691a
    /* renamed from: c */
    public void mo23541c(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m23544a0(C5921b.m23296g(entry.getKey()), entry.getValue());
        }
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n.InterfaceC5691a
    /* renamed from: d */
    public void mo23540d(List<String> list, List<C5709p> list2, Long l) {
        List<? extends InterfaceC5805e> m23461A;
        C5830l c5830l = new C5830l(list);
        if (this.f14326j.m23362f()) {
            this.f14326j.m23366b("onRangeMergeUpdate: " + c5830l, new Object[0]);
        }
        if (this.f14328l.m23362f()) {
            this.f14326j.m23366b("onRangeMergeUpdate: " + c5830l + " " + list2, new Object[0]);
        }
        this.f14329m++;
        ArrayList arrayList = new ArrayList(list2.size());
        for (C5709p c5709p : list2) {
            arrayList.add(new C5952s(c5709p));
        }
        if (l != null) {
            m23461A = this.f14332p.m23456F(c5830l, arrayList, new C5889w(l.longValue()));
        } else {
            m23461A = this.f14332p.m23461A(c5830l, arrayList);
        }
        if (m23461A.size() > 0) {
            m23553S(c5830l);
        }
        m23557O(m23461A);
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n.InterfaceC5691a
    public void onConnect() {
        m23559M(C5741f.f14131d, Boolean.TRUE);
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n.InterfaceC5691a
    public void onDisconnect() {
        m23559M(C5741f.f14131d, Boolean.FALSE);
        m23551U();
    }

    public String toString() {
        return this.f14317a.toString();
    }
}
