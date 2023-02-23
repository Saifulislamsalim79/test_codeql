package com.google.firebase.database.p131s;

import com.google.firebase.database.C5608b;
import com.google.firebase.database.C5611c;
import com.google.firebase.database.C5617i;
import com.google.firebase.database.C5619l;
import com.google.firebase.database.p128q.InterfaceC5661h;
import com.google.firebase.database.p129r.C5679g;
import com.google.firebase.database.p129r.InterfaceC5689m;
import com.google.firebase.database.p131s.p132g0.AbstractC5748d;
import com.google.firebase.database.p131s.p132g0.C5745a;
import com.google.firebase.database.p131s.p132g0.C5746b;
import com.google.firebase.database.p131s.p132g0.C5747c;
import com.google.firebase.database.p131s.p132g0.C5750e;
import com.google.firebase.database.p131s.p132g0.C5752f;
import com.google.firebase.database.p131s.p133h0.InterfaceC5758e;
import com.google.firebase.database.p131s.p134i0.C5779d;
import com.google.firebase.database.p131s.p134i0.C5783e;
import com.google.firebase.database.p131s.p134i0.C5785g;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p134i0.InterfaceC5773a;
import com.google.firebase.database.p131s.p136j0.C5801a;
import com.google.firebase.database.p131s.p136j0.C5804d;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p131s.p136j0.C5815j;
import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5929d;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.C5952s;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: SyncTree.java */
/* renamed from: com.google.firebase.database.s.v */
/* loaded from: classes2.dex */
public class C5870v {

    /* renamed from: e */
    private final InterfaceC5888r f14418e;

    /* renamed from: f */
    private final InterfaceC5758e f14419f;

    /* renamed from: g */
    private final C5899c f14420g;

    /* renamed from: h */
    private long f14421h = 1;

    /* renamed from: a */
    private C5779d<C5869u> f14414a = C5779d.m23785e();

    /* renamed from: b */
    private final C5734d0 f14415b = new C5734d0();

    /* renamed from: c */
    private final Map<C5889w, C5814i> f14416c = new HashMap();

    /* renamed from: d */
    private final Map<C5814i, C5889w> f14417d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$a */
    /* loaded from: classes2.dex */
    public class CallableC5871a implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ C5889w f14422c;

        /* renamed from: d */
        final /* synthetic */ C5830l f14423d;

        /* renamed from: e */
        final /* synthetic */ Map f14424e;

        CallableC5871a(C5889w c5889w, C5830l c5830l, Map map) {
            this.f14422c = c5889w;
            this.f14423d = c5830l;
            this.f14424e = map;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            C5814i m23445Q = C5870v.this.m23445Q(this.f14422c);
            if (m23445Q != null) {
                C5830l m23585d0 = C5830l.m23585d0(m23445Q.m23643e(), this.f14423d);
                C5737e m23962u = C5737e.m23962u(this.f14424e);
                C5870v.this.f14419f.mo23875n(this.f14423d, m23962u);
                return C5870v.this.m23459C(m23445Q, new C5747c(C5750e.m23905a(m23445Q.m23644d()), m23585d0, m23962u));
            }
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$b */
    /* loaded from: classes2.dex */
    public class CallableC5872b implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ C5814i f14426c;

        CallableC5872b(C5814i c5814i) {
            this.f14426c = c5814i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            C5870v.this.f14419f.mo23882g(this.f14426c);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$c */
    /* loaded from: classes2.dex */
    public class CallableC5873c implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ C5814i f14428c;

        CallableC5873c(C5814i c5814i) {
            this.f14428c = c5814i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            C5870v.this.f14419f.mo23881h(this.f14428c);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$d */
    /* loaded from: classes2.dex */
    public class CallableC5874d implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ AbstractC5772i f14430c;

        CallableC5874d(AbstractC5772i abstractC5772i) {
            this.f14430c = abstractC5772i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            C5801a mo23874o;
            InterfaceC5945n m23470d;
            C5814i mo23808e = this.f14430c.mo23808e();
            C5830l m23643e = mo23808e.m23643e();
            C5779d c5779d = C5870v.this.f14414a;
            InterfaceC5945n interfaceC5945n = null;
            C5830l c5830l = m23643e;
            boolean z = false;
            while (!c5779d.isEmpty()) {
                C5869u c5869u = (C5869u) c5779d.getValue();
                if (c5869u != null) {
                    if (interfaceC5945n == null) {
                        interfaceC5945n = c5869u.m23470d(c5830l);
                    }
                    z = z || c5869u.m23466h();
                }
                c5779d = c5779d.m23778u(c5830l.isEmpty() ? C5921b.m23296g("") : c5830l.m23587Z());
                c5830l = c5830l.m23583e0();
            }
            C5869u c5869u2 = (C5869u) C5870v.this.f14414a.m23779s(m23643e);
            if (c5869u2 == null) {
                c5869u2 = new C5869u(C5870v.this.f14419f);
                C5870v c5870v = C5870v.this;
                c5870v.f14414a = c5870v.f14414a.m23790P(m23643e, c5869u2);
            } else {
                z = z || c5869u2.m23466h();
                if (interfaceC5945n == null) {
                    interfaceC5945n = c5869u2.m23470d(C5830l.m23588X());
                }
            }
            C5870v.this.f14419f.mo23882g(mo23808e);
            if (interfaceC5945n == null) {
                mo23874o = C5870v.this.f14419f.mo23874o(mo23808e);
                if (!mo23874o.m23690f()) {
                    InterfaceC5945n m23249P = C5936g.m23249P();
                    Iterator it = C5870v.this.f14414a.m23788X(m23643e).m23795E().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        C5869u c5869u3 = (C5869u) ((C5779d) entry.getValue()).getValue();
                        if (c5869u3 != null && (m23470d = c5869u3.m23470d(C5830l.m23588X())) != null) {
                            m23249P = m23249P.mo23216T((C5921b) entry.getKey(), m23470d);
                        }
                    }
                    for (C5944m c5944m : mo23874o.m23694b()) {
                        if (!m23249P.mo23210R(c5944m.m23222c())) {
                            m23249P = m23249P.mo23216T(c5944m.m23222c(), c5944m.m23221d());
                        }
                    }
                    mo23874o = new C5801a(C5938i.m23239f(m23249P, mo23808e.m23645c()), false, false);
                }
            } else {
                mo23874o = new C5801a(C5938i.m23239f(interfaceC5945n, mo23808e.m23645c()), true, false);
            }
            boolean m23463k = c5869u2.m23463k(mo23808e);
            if (!m23463k && !mo23808e.m23641g()) {
                C5795m.m23744g(!C5870v.this.f14417d.containsKey(mo23808e), "View does not exist but we have a tag");
                C5889w m23450L = C5870v.this.m23450L();
                C5870v.this.f14417d.put(mo23808e, m23450L);
                C5870v.this.f14416c.put(m23450L, mo23808e);
            }
            List<C5804d> m23473a = c5869u2.m23473a(this.f14430c, C5870v.this.f14415b.m23986h(m23643e), mo23874o);
            if (!m23463k && !z) {
                C5870v.this.m23438X(mo23808e, c5869u2.m23462l(mo23808e));
            }
            return m23473a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$e */
    /* loaded from: classes2.dex */
    public class CallableC5875e implements Callable<List<InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ C5814i f14432c;

        /* renamed from: d */
        final /* synthetic */ AbstractC5772i f14433d;

        /* renamed from: e */
        final /* synthetic */ C5611c f14434e;

        CallableC5875e(C5814i c5814i, AbstractC5772i abstractC5772i, C5611c c5611c) {
            this.f14432c = c5814i;
            this.f14433d = abstractC5772i;
            this.f14434e = c5611c;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<InterfaceC5805e> call() {
            boolean z;
            C5830l m23643e = this.f14432c.m23643e();
            C5869u c5869u = (C5869u) C5870v.this.f14414a.m23779s(m23643e);
            List<InterfaceC5805e> arrayList = new ArrayList<>();
            if (c5869u != null && (this.f14432c.m23642f() || c5869u.m23463k(this.f14432c))) {
                C5785g<List<C5814i>, List<InterfaceC5805e>> m23464j = c5869u.m23464j(this.f14432c, this.f14433d, this.f14434e);
                if (c5869u.m23465i()) {
                    C5870v c5870v = C5870v.this;
                    c5870v.f14414a = c5870v.f14414a.m23792J(m23643e);
                }
                List<C5814i> m23770a = m23464j.m23770a();
                arrayList = m23464j.m23769b();
                loop0: while (true) {
                    for (C5814i c5814i : m23770a) {
                        C5870v.this.f14419f.mo23881h(this.f14432c);
                        z = z || c5814i.m23641g();
                    }
                }
                C5779d c5779d = C5870v.this.f14414a;
                boolean z2 = c5779d.getValue() != null && ((C5869u) c5779d.getValue()).m23466h();
                Iterator<C5921b> it = m23643e.iterator();
                while (it.hasNext()) {
                    c5779d = c5779d.m23778u(it.next());
                    z2 = z2 || (c5779d.getValue() != null && ((C5869u) c5779d.getValue()).m23466h());
                    if (z2) {
                        break;
                    } else if (c5779d.isEmpty()) {
                        break;
                    }
                }
                if (z && !z2) {
                    C5779d m23788X = C5870v.this.f14414a.m23788X(m23643e);
                    if (!m23788X.isEmpty()) {
                        for (C5815j c5815j : C5870v.this.m23452J(m23788X)) {
                            C5887q c5887q = new C5887q(c5815j);
                            C5870v.this.f14418e.mo23388b(C5870v.this.m23446P(c5815j.m23633h()), c5887q.f14475b, c5887q, c5887q);
                        }
                    }
                }
                if (!z2 && !m23770a.isEmpty() && this.f14434e == null) {
                    if (z) {
                        C5870v.this.f14418e.mo23389a(C5870v.this.m23446P(this.f14432c), null);
                    } else {
                        for (C5814i c5814i2 : m23770a) {
                            C5889w m23437Y = C5870v.this.m23437Y(c5814i2);
                            C5795m.m23745f(m23437Y != null);
                            C5870v.this.f14418e.mo23389a(C5870v.this.m23446P(c5814i2), m23437Y);
                        }
                    }
                }
                C5870v.this.m23441U(m23770a);
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$f */
    /* loaded from: classes2.dex */
    public class C5876f implements C5779d.InterfaceC5782c<C5869u, Void> {
        C5876f() {
        }

        @Override // com.google.firebase.database.p131s.p134i0.C5779d.InterfaceC5782c
        /* renamed from: b */
        public Void mo23405a(C5830l c5830l, C5869u c5869u, Void r5) {
            if (!c5830l.isEmpty() && c5869u.m23466h()) {
                C5814i m23633h = c5869u.m23469e().m23633h();
                C5870v.this.f14418e.mo23389a(C5870v.this.m23446P(m23633h), C5870v.this.m23437Y(m23633h));
                return null;
            }
            for (C5815j c5815j : c5869u.m23468f()) {
                C5814i m23633h2 = c5815j.m23633h();
                C5870v.this.f14418e.mo23389a(C5870v.this.m23446P(m23633h2), C5870v.this.m23437Y(m23633h2));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$g */
    /* loaded from: classes2.dex */
    public class C5877g extends InterfaceC5661h.AbstractC5663b<C5921b, C5779d<C5869u>> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5945n f14437a;

        /* renamed from: b */
        final /* synthetic */ C5740e0 f14438b;

        /* renamed from: c */
        final /* synthetic */ AbstractC5748d f14439c;

        /* renamed from: d */
        final /* synthetic */ List f14440d;

        C5877g(InterfaceC5945n interfaceC5945n, C5740e0 c5740e0, AbstractC5748d abstractC5748d, List list) {
            this.f14437a = interfaceC5945n;
            this.f14438b = c5740e0;
            this.f14439c = abstractC5748d;
            this.f14440d = list;
        }

        @Override // com.google.firebase.database.p128q.InterfaceC5661h.AbstractC5663b
        /* renamed from: b */
        public void mo23281a(C5921b c5921b, C5779d<C5869u> c5779d) {
            InterfaceC5945n interfaceC5945n = this.f14437a;
            InterfaceC5945n mo23211L = interfaceC5945n != null ? interfaceC5945n.mo23211L(c5921b) : null;
            C5740e0 m23952h = this.f14438b.m23952h(c5921b);
            AbstractC5748d mo23900d = this.f14439c.mo23900d(c5921b);
            if (mo23900d != null) {
                this.f14440d.addAll(C5870v.this.m23415v(mo23900d, c5779d, mo23211L, m23952h));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$h */
    /* loaded from: classes2.dex */
    public class CallableC5878h implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ boolean f14442c;

        /* renamed from: d */
        final /* synthetic */ C5830l f14443d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC5945n f14444e;

        /* renamed from: f */
        final /* synthetic */ long f14445f;

        /* renamed from: w */
        final /* synthetic */ InterfaceC5945n f14446w;

        /* renamed from: x */
        final /* synthetic */ boolean f14447x;

        CallableC5878h(boolean z, C5830l c5830l, InterfaceC5945n interfaceC5945n, long j, InterfaceC5945n interfaceC5945n2, boolean z2) {
            this.f14442c = z;
            this.f14443d = c5830l;
            this.f14444e = interfaceC5945n;
            this.f14445f = j;
            this.f14446w = interfaceC5945n2;
            this.f14447x = z2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            if (this.f14442c) {
                C5870v.this.f14419f.mo23887b(this.f14443d, this.f14444e, this.f14445f);
            }
            C5870v.this.f14415b.m23992b(this.f14443d, this.f14446w, Long.valueOf(this.f14445f), this.f14447x);
            if (this.f14447x) {
                return C5870v.this.m23413x(new C5752f(C5750e.f14163d, this.f14443d, this.f14446w));
            }
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$i */
    /* loaded from: classes2.dex */
    public class CallableC5879i implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ boolean f14449c;

        /* renamed from: d */
        final /* synthetic */ C5830l f14450d;

        /* renamed from: e */
        final /* synthetic */ C5737e f14451e;

        /* renamed from: f */
        final /* synthetic */ long f14452f;

        /* renamed from: w */
        final /* synthetic */ C5737e f14453w;

        CallableC5879i(boolean z, C5830l c5830l, C5737e c5737e, long j, C5737e c5737e2) {
            this.f14449c = z;
            this.f14450d = c5830l;
            this.f14451e = c5737e;
            this.f14452f = j;
            this.f14453w = c5737e2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() throws Exception {
            if (this.f14449c) {
                C5870v.this.f14419f.mo23886c(this.f14450d, this.f14451e, this.f14452f);
            }
            C5870v.this.f14415b.m23993a(this.f14450d, this.f14453w, Long.valueOf(this.f14452f));
            return C5870v.this.m23413x(new C5747c(C5750e.f14163d, this.f14450d, this.f14453w));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$j */
    /* loaded from: classes2.dex */
    public class CallableC5880j implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ boolean f14455c;

        /* renamed from: d */
        final /* synthetic */ long f14456d;

        /* renamed from: e */
        final /* synthetic */ boolean f14457e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC5773a f14458f;

        CallableC5880j(boolean z, long j, boolean z2, InterfaceC5773a interfaceC5773a) {
            this.f14455c = z;
            this.f14456d = j;
            this.f14457e = z2;
            this.f14458f = interfaceC5773a;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            if (this.f14455c) {
                C5870v.this.f14419f.mo23888a(this.f14456d);
            }
            C5895z m23985i = C5870v.this.f14415b.m23985i(this.f14456d);
            boolean m23982l = C5870v.this.f14415b.m23982l(this.f14456d);
            if (m23985i.m23374f() && !this.f14457e) {
                Map<String, Object> m23488c = C5862r.m23488c(this.f14458f);
                if (m23985i.m23375e()) {
                    C5870v.this.f14419f.mo23877l(m23985i.m23377c(), C5862r.m23484g(m23985i.m23378b(), C5870v.this, m23985i.m23377c(), m23488c));
                } else {
                    C5870v.this.f14419f.mo23876m(m23985i.m23377c(), C5862r.m23485f(m23985i.m23379a(), C5870v.this, m23985i.m23377c(), m23488c));
                }
            }
            if (!m23982l) {
                return Collections.emptyList();
            }
            C5779d m23785e = C5779d.m23785e();
            if (m23985i.m23375e()) {
                m23785e = m23785e.m23790P(C5830l.m23588X(), Boolean.TRUE);
            } else {
                Iterator<Map.Entry<C5830l, InterfaceC5945n>> it = m23985i.m23379a().iterator();
                while (it.hasNext()) {
                    m23785e = m23785e.m23790P(it.next().getKey(), Boolean.TRUE);
                }
            }
            return C5870v.this.m23413x(new C5745a(m23985i.m23377c(), m23785e, this.f14457e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$k */
    /* loaded from: classes2.dex */
    public class CallableC5881k implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ C5830l f14460c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC5945n f14461d;

        CallableC5881k(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
            this.f14460c = c5830l;
            this.f14461d = interfaceC5945n;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            C5870v.this.f14419f.mo23878k(C5814i.m23647a(this.f14460c), this.f14461d);
            return C5870v.this.m23413x(new C5752f(C5750e.f14164e, this.f14460c, this.f14461d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$l */
    /* loaded from: classes2.dex */
    public class CallableC5882l implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ Map f14463c;

        /* renamed from: d */
        final /* synthetic */ C5830l f14464d;

        CallableC5882l(Map map, C5830l c5830l) {
            this.f14463c = map;
            this.f14464d = c5830l;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            C5737e m23962u = C5737e.m23962u(this.f14463c);
            C5870v.this.f14419f.mo23875n(this.f14464d, m23962u);
            return C5870v.this.m23413x(new C5747c(C5750e.f14164e, this.f14464d, m23962u));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$m */
    /* loaded from: classes2.dex */
    public class CallableC5883m implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ C5830l f14466c;

        CallableC5883m(C5830l c5830l) {
            this.f14466c = c5830l;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            C5870v.this.f14419f.mo23880i(C5814i.m23647a(this.f14466c));
            return C5870v.this.m23413x(new C5746b(C5750e.f14164e, this.f14466c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$n */
    /* loaded from: classes2.dex */
    public class CallableC5884n implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ C5889w f14468c;

        CallableC5884n(C5889w c5889w) {
            this.f14468c = c5889w;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            C5814i m23445Q = C5870v.this.m23445Q(this.f14468c);
            if (m23445Q != null) {
                C5870v.this.f14419f.mo23880i(m23445Q);
                return C5870v.this.m23459C(m23445Q, new C5746b(C5750e.m23905a(m23445Q.m23644d()), C5830l.m23588X()));
            }
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$o */
    /* loaded from: classes2.dex */
    public class CallableC5885o implements Callable<List<? extends InterfaceC5805e>> {

        /* renamed from: c */
        final /* synthetic */ C5889w f14470c;

        /* renamed from: d */
        final /* synthetic */ C5830l f14471d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC5945n f14472e;

        CallableC5885o(C5889w c5889w, C5830l c5830l, InterfaceC5945n interfaceC5945n) {
            this.f14470c = c5889w;
            this.f14471d = c5830l;
            this.f14472e = interfaceC5945n;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC5805e> call() {
            C5814i m23445Q = C5870v.this.m23445Q(this.f14470c);
            if (m23445Q != null) {
                C5830l m23585d0 = C5830l.m23585d0(m23445Q.m23643e(), this.f14471d);
                C5870v.this.f14419f.mo23878k(m23585d0.isEmpty() ? m23445Q : C5814i.m23647a(this.f14471d), this.f14472e);
                return C5870v.this.m23459C(m23445Q, new C5752f(C5750e.m23905a(m23445Q.m23644d()), m23585d0, this.f14472e));
            }
            return Collections.emptyList();
        }
    }

    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$p */
    /* loaded from: classes2.dex */
    public interface InterfaceC5886p {
        /* renamed from: a */
        List<? extends InterfaceC5805e> mo23394a(C5611c c5611c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$q */
    /* loaded from: classes2.dex */
    public class C5887q implements InterfaceC5689m, InterfaceC5886p {

        /* renamed from: a */
        private final C5815j f14474a;

        /* renamed from: b */
        private final C5889w f14475b;

        public C5887q(C5815j c5815j) {
            this.f14474a = c5815j;
            this.f14475b = C5870v.this.m23437Y(c5815j.m23633h());
        }

        @Override // com.google.firebase.database.p131s.C5870v.InterfaceC5886p
        /* renamed from: a */
        public List<? extends InterfaceC5805e> mo23394a(C5611c c5611c) {
            if (c5611c == null) {
                C5814i m23633h = this.f14474a.m23633h();
                C5889w c5889w = this.f14475b;
                if (c5889w != null) {
                    return C5870v.this.m23460B(c5889w);
                }
                return C5870v.this.m23416u(m23633h.m23643e());
            }
            C5899c c5899c = C5870v.this.f14420g;
            c5899c.m23359i("Listen at " + this.f14474a.m23633h().m23643e() + " failed: " + c5611c.toString());
            return C5870v.this.m23444R(this.f14474a.m23633h(), c5611c);
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5689m
        /* renamed from: b */
        public C5679g mo23393b() {
            C5929d m23277b = C5929d.m23277b(this.f14474a.m23632i());
            List<C5830l> m23274e = m23277b.m23274e();
            ArrayList arrayList = new ArrayList(m23274e.size());
            for (C5830l c5830l : m23274e) {
                arrayList.add(c5830l.m23594F());
            }
            return new C5679g(arrayList, m23277b.m23275d());
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5689m
        /* renamed from: c */
        public boolean mo23392c() {
            return C5783e.m23774b(this.f14474a.m23632i()) > 1024;
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5689m
        /* renamed from: d */
        public String mo23391d() {
            return this.f14474a.m23632i().mo23212t();
        }
    }

    /* compiled from: SyncTree.java */
    /* renamed from: com.google.firebase.database.s.v$r */
    /* loaded from: classes2.dex */
    public interface InterfaceC5888r {
        /* renamed from: a */
        void mo23389a(C5814i c5814i, C5889w c5889w);

        /* renamed from: b */
        void mo23388b(C5814i c5814i, C5889w c5889w, InterfaceC5689m interfaceC5689m, InterfaceC5886p interfaceC5886p);
    }

    public C5870v(C5743g c5743g, InterfaceC5758e interfaceC5758e, InterfaceC5888r interfaceC5888r) {
        new HashSet();
        this.f14418e = interfaceC5888r;
        this.f14419f = interfaceC5758e;
        this.f14420g = c5743g.m23924p("SyncTree");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public List<? extends InterfaceC5805e> m23459C(C5814i c5814i, AbstractC5748d abstractC5748d) {
        C5830l m23643e = c5814i.m23643e();
        C5869u m23779s = this.f14414a.m23779s(m23643e);
        C5795m.m23744g(m23779s != null, "Missing sync point for query tag that we're tracking");
        return m23779s.m23472b(abstractC5748d, this.f14415b.m23986h(m23643e), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public List<C5815j> m23452J(C5779d<C5869u> c5779d) {
        ArrayList arrayList = new ArrayList();
        m23451K(c5779d, arrayList);
        return arrayList;
    }

    /* renamed from: K */
    private void m23451K(C5779d<C5869u> c5779d, List<C5815j> list) {
        C5869u value = c5779d.getValue();
        if (value != null && value.m23466h()) {
            list.add(value.m23469e());
            return;
        }
        if (value != null) {
            list.addAll(value.m23468f());
        }
        Iterator<Map.Entry<C5921b, C5779d<C5869u>>> it = c5779d.m23795E().iterator();
        while (it.hasNext()) {
            m23451K(it.next().getValue(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public C5889w m23450L() {
        long j = this.f14421h;
        this.f14421h = 1 + j;
        return new C5889w(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public C5814i m23446P(C5814i c5814i) {
        return (!c5814i.m23641g() || c5814i.m23642f()) ? c5814i : C5814i.m23647a(c5814i.m23643e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public C5814i m23445Q(C5889w c5889w) {
        return this.f14416c.get(c5889w);
    }

    /* renamed from: T */
    private List<InterfaceC5805e> m23442T(C5814i c5814i, AbstractC5772i abstractC5772i, C5611c c5611c) {
        return (List) this.f14419f.mo23879j(new CallableC5875e(c5814i, abstractC5772i, c5611c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m23441U(List<C5814i> list) {
        for (C5814i c5814i : list) {
            if (!c5814i.m23641g()) {
                C5889w m23437Y = m23437Y(c5814i);
                C5795m.m23745f(m23437Y != null);
                this.f14417d.remove(c5814i);
                this.f14416c.remove(m23437Y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m23438X(C5814i c5814i, C5815j c5815j) {
        C5830l m23643e = c5814i.m23643e();
        C5889w m23437Y = m23437Y(c5814i);
        C5887q c5887q = new C5887q(c5815j);
        this.f14418e.mo23388b(m23446P(c5814i), m23437Y, c5887q, c5887q);
        C5779d<C5869u> m23788X = this.f14414a.m23788X(m23643e);
        if (m23437Y != null) {
            C5795m.m23744g(!m23788X.getValue().m23466h(), "If we're adding a query, it shouldn't be shadowed");
        } else {
            m23788X.m23780m(new C5876f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public C5889w m23437Y(C5814i c5814i) {
        return this.f14417d.get(c5814i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public List<InterfaceC5805e> m23415v(AbstractC5748d abstractC5748d, C5779d<C5869u> c5779d, InterfaceC5945n interfaceC5945n, C5740e0 c5740e0) {
        C5869u value = c5779d.getValue();
        if (interfaceC5945n == null && value != null) {
            interfaceC5945n = value.m23470d(C5830l.m23588X());
        }
        ArrayList arrayList = new ArrayList();
        c5779d.m23795E().mo24202m(new C5877g(interfaceC5945n, c5740e0, abstractC5748d, arrayList));
        if (value != null) {
            arrayList.addAll(value.m23472b(abstractC5748d, c5740e0, interfaceC5945n));
        }
        return arrayList;
    }

    /* renamed from: w */
    private List<InterfaceC5805e> m23414w(AbstractC5748d abstractC5748d, C5779d<C5869u> c5779d, InterfaceC5945n interfaceC5945n, C5740e0 c5740e0) {
        if (abstractC5748d.m23908a().isEmpty()) {
            return m23415v(abstractC5748d, c5779d, interfaceC5945n, c5740e0);
        }
        C5869u value = c5779d.getValue();
        if (interfaceC5945n == null && value != null) {
            interfaceC5945n = value.m23470d(C5830l.m23588X());
        }
        ArrayList arrayList = new ArrayList();
        C5921b m23587Z = abstractC5748d.m23908a().m23587Z();
        AbstractC5748d mo23900d = abstractC5748d.mo23900d(m23587Z);
        C5779d<C5869u> mo24207e = c5779d.m23795E().mo24207e(m23587Z);
        if (mo24207e != null && mo23900d != null) {
            arrayList.addAll(m23414w(mo23900d, mo24207e, interfaceC5945n != null ? interfaceC5945n.mo23211L(m23587Z) : null, c5740e0.m23952h(m23587Z)));
        }
        if (value != null) {
            arrayList.addAll(value.m23472b(abstractC5748d, c5740e0, interfaceC5945n));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public List<InterfaceC5805e> m23413x(AbstractC5748d abstractC5748d) {
        return m23414w(abstractC5748d, this.f14414a, null, this.f14415b.m23986h(C5830l.m23588X()));
    }

    /* renamed from: A */
    public List<? extends InterfaceC5805e> m23461A(C5830l c5830l, List<C5952s> list) {
        C5869u m23779s = this.f14414a.m23779s(c5830l);
        if (m23779s == null) {
            return Collections.emptyList();
        }
        C5815j m23469e = m23779s.m23469e();
        if (m23469e != null) {
            InterfaceC5945n m23632i = m23469e.m23632i();
            for (C5952s c5952s : list) {
                m23632i = c5952s.m23197a(m23632i);
            }
            return m23411z(c5830l, m23632i);
        }
        return Collections.emptyList();
    }

    /* renamed from: B */
    public List<? extends InterfaceC5805e> m23460B(C5889w c5889w) {
        return (List) this.f14419f.mo23879j(new CallableC5884n(c5889w));
    }

    /* renamed from: D */
    public List<? extends InterfaceC5805e> m23458D(C5830l c5830l, Map<C5830l, InterfaceC5945n> map, C5889w c5889w) {
        return (List) this.f14419f.mo23879j(new CallableC5871a(c5889w, c5830l, map));
    }

    /* renamed from: E */
    public List<? extends InterfaceC5805e> m23457E(C5830l c5830l, InterfaceC5945n interfaceC5945n, C5889w c5889w) {
        return (List) this.f14419f.mo23879j(new CallableC5885o(c5889w, c5830l, interfaceC5945n));
    }

    /* renamed from: F */
    public List<? extends InterfaceC5805e> m23456F(C5830l c5830l, List<C5952s> list, C5889w c5889w) {
        C5814i m23445Q = m23445Q(c5889w);
        if (m23445Q != null) {
            C5795m.m23745f(c5830l.equals(m23445Q.m23643e()));
            C5869u m23779s = this.f14414a.m23779s(m23445Q.m23643e());
            C5795m.m23744g(m23779s != null, "Missing sync point for query tag that we're tracking");
            C5815j m23462l = m23779s.m23462l(m23445Q);
            C5795m.m23744g(m23462l != null, "Missing view for query tag that we're tracking");
            InterfaceC5945n m23632i = m23462l.m23632i();
            for (C5952s c5952s : list) {
                m23632i = c5952s.m23197a(m23632i);
            }
            return m23457E(c5830l, m23632i, c5889w);
        }
        return Collections.emptyList();
    }

    /* renamed from: G */
    public List<? extends InterfaceC5805e> m23455G(C5830l c5830l, C5737e c5737e, C5737e c5737e2, long j, boolean z) {
        return (List) this.f14419f.mo23879j(new CallableC5879i(z, c5830l, c5737e, j, c5737e2));
    }

    /* renamed from: H */
    public List<? extends InterfaceC5805e> m23454H(C5830l c5830l, InterfaceC5945n interfaceC5945n, InterfaceC5945n interfaceC5945n2, long j, boolean z, boolean z2) {
        C5795m.m23744g(z || !z2, "We shouldn't be persisting non-visible writes.");
        return (List) this.f14419f.mo23879j(new CallableC5878h(z2, c5830l, interfaceC5945n, j, interfaceC5945n2, z));
    }

    /* renamed from: I */
    public InterfaceC5945n m23453I(C5830l c5830l, List<Long> list) {
        C5779d<C5869u> c5779d = this.f14414a;
        c5779d.getValue();
        C5830l m23588X = C5830l.m23588X();
        InterfaceC5945n interfaceC5945n = null;
        C5830l c5830l2 = c5830l;
        do {
            C5921b m23587Z = c5830l2.m23587Z();
            c5830l2 = c5830l2.m23583e0();
            m23588X = m23588X.m23592J(m23587Z);
            C5830l m23585d0 = C5830l.m23585d0(m23588X, c5830l);
            c5779d = m23587Z != null ? c5779d.m23778u(m23587Z) : C5779d.m23785e();
            C5869u value = c5779d.getValue();
            if (value != null) {
                interfaceC5945n = value.m23470d(m23585d0);
            }
            if (c5830l2.isEmpty()) {
                break;
            }
        } while (interfaceC5945n == null);
        return this.f14415b.m23990d(c5830l, interfaceC5945n, list, true);
    }

    /* renamed from: M */
    public InterfaceC5945n m23449M(final C5814i c5814i) {
        return (InterfaceC5945n) this.f14419f.mo23879j(new Callable() { // from class: com.google.firebase.database.s.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5870v.this.m23448N(c5814i);
            }
        });
    }

    /* renamed from: N */
    public /* synthetic */ InterfaceC5945n m23448N(C5814i c5814i) throws Exception {
        C5830l m23643e = c5814i.m23643e();
        C5779d<C5869u> c5779d = this.f14414a;
        InterfaceC5945n interfaceC5945n = null;
        C5830l c5830l = m23643e;
        boolean z = false;
        while (true) {
            if (c5779d.isEmpty()) {
                break;
            }
            C5869u value = c5779d.getValue();
            if (value != null) {
                if (interfaceC5945n == null) {
                    interfaceC5945n = value.m23470d(c5830l);
                }
                z = z || value.m23466h();
            }
            c5779d = c5779d.m23778u(c5830l.isEmpty() ? C5921b.m23296g("") : c5830l.m23587Z());
            c5830l = c5830l.m23583e0();
        }
        C5869u m23779s = this.f14414a.m23779s(m23643e);
        if (m23779s == null) {
            m23779s = new C5869u(this.f14419f);
            this.f14414a = this.f14414a.m23790P(m23643e, m23779s);
        } else if (interfaceC5945n == null) {
            interfaceC5945n = m23779s.m23470d(C5830l.m23588X());
        }
        return m23779s.m23467g(c5814i, this.f14415b.m23986h(m23643e), new C5801a(C5938i.m23239f(interfaceC5945n != null ? interfaceC5945n : C5936g.m23249P(), c5814i.m23645c()), interfaceC5945n != null, false)).m23637d();
    }

    /* renamed from: O */
    public C5608b m23447O(C5619l c5619l) {
        return C5617i.m24313a(c5619l.m24303f(), this.f14419f.mo23874o(c5619l.m24302g()).m23695a());
    }

    /* renamed from: R */
    public List<InterfaceC5805e> m23444R(C5814i c5814i, C5611c c5611c) {
        return m23442T(c5814i, null, c5611c);
    }

    /* renamed from: S */
    public List<InterfaceC5805e> m23443S(AbstractC5772i abstractC5772i) {
        return m23442T(abstractC5772i.mo23808e(), abstractC5772i, null);
    }

    /* renamed from: V */
    public void m23440V(C5814i c5814i) {
        this.f14419f.mo23879j(new CallableC5872b(c5814i));
    }

    /* renamed from: W */
    public void m23439W(C5814i c5814i) {
        this.f14419f.mo23879j(new CallableC5873c(c5814i));
    }

    /* renamed from: s */
    public List<? extends InterfaceC5805e> m23418s(long j, boolean z, boolean z2, InterfaceC5773a interfaceC5773a) {
        return (List) this.f14419f.mo23879j(new CallableC5880j(z2, j, z, interfaceC5773a));
    }

    /* renamed from: t */
    public List<? extends InterfaceC5805e> m23417t(AbstractC5772i abstractC5772i) {
        return (List) this.f14419f.mo23879j(new CallableC5874d(abstractC5772i));
    }

    /* renamed from: u */
    public List<? extends InterfaceC5805e> m23416u(C5830l c5830l) {
        return (List) this.f14419f.mo23879j(new CallableC5883m(c5830l));
    }

    /* renamed from: y */
    public List<? extends InterfaceC5805e> m23412y(C5830l c5830l, Map<C5830l, InterfaceC5945n> map) {
        return (List) this.f14419f.mo23879j(new CallableC5882l(map, c5830l));
    }

    /* renamed from: z */
    public List<? extends InterfaceC5805e> m23411z(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        return (List) this.f14419f.mo23879j(new CallableC5881k(c5830l, interfaceC5945n));
    }
}
