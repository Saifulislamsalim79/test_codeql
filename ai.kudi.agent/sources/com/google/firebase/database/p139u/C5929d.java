package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p134i0.C5783e;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.C5924c;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
/* compiled from: CompoundHash.java */
/* renamed from: com.google.firebase.database.u.d */
/* loaded from: classes2.dex */
public class C5929d {

    /* renamed from: a */
    private final List<C5830l> f14557a;

    /* renamed from: b */
    private final List<String> f14558b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompoundHash.java */
    /* renamed from: com.google.firebase.database.u.d$a */
    /* loaded from: classes2.dex */
    public class C5930a extends C5924c.AbstractC5927c {

        /* renamed from: a */
        final /* synthetic */ C5931b f14559a;

        C5930a(C5931b c5931b) {
            this.f14559a = c5931b;
        }

        @Override // com.google.firebase.database.p139u.C5924c.AbstractC5927c
        /* renamed from: b */
        public void mo23272b(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
            this.f14559a.m23255q(c5921b);
            C5929d.m23273f(interfaceC5945n, this.f14559a);
            this.f14559a.m23260l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompoundHash.java */
    /* renamed from: com.google.firebase.database.u.d$b */
    /* loaded from: classes2.dex */
    public static class C5931b {

        /* renamed from: d */
        private int f14563d;

        /* renamed from: h */
        private final InterfaceC5933d f14567h;

        /* renamed from: a */
        private StringBuilder f14560a = null;

        /* renamed from: b */
        private Stack<C5921b> f14561b = new Stack<>();

        /* renamed from: c */
        private int f14562c = -1;

        /* renamed from: e */
        private boolean f14564e = true;

        /* renamed from: f */
        private final List<C5830l> f14565f = new ArrayList();

        /* renamed from: g */
        private final List<String> f14566g = new ArrayList();

        public C5931b(InterfaceC5933d interfaceC5933d) {
            this.f14567h = interfaceC5933d;
        }

        /* renamed from: g */
        private void m23265g(StringBuilder sb, C5921b c5921b) {
            sb.append(C5795m.m23741j(c5921b.m23298b()));
        }

        /* renamed from: k */
        private C5830l m23261k(int i) {
            C5921b[] c5921bArr = new C5921b[i];
            for (int i2 = 0; i2 < i; i2++) {
                c5921bArr[i2] = this.f14561b.get(i2);
            }
            return new C5830l(c5921bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m23260l() {
            this.f14563d--;
            if (m23264h()) {
                this.f14560a.append(")");
            }
            this.f14564e = true;
        }

        /* renamed from: m */
        private void m23259m() {
            C5795m.m23744g(m23264h(), "Can't end range without starting a range!");
            for (int i = 0; i < this.f14563d; i++) {
                this.f14560a.append(")");
            }
            this.f14560a.append(")");
            C5830l m23261k = m23261k(this.f14562c);
            this.f14566g.add(C5795m.m23742i(this.f14560a.toString()));
            this.f14565f.add(m23261k);
            this.f14560a = null;
        }

        /* renamed from: n */
        private void m23258n() {
            if (m23264h()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            this.f14560a = sb;
            sb.append("(");
            Iterator<C5921b> it = m23261k(this.f14563d).iterator();
            while (it.hasNext()) {
                m23265g(this.f14560a, it.next());
                this.f14560a.append(":(");
            }
            this.f14564e = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public void m23257o() {
            C5795m.m23744g(this.f14563d == 0, "Can't finish hashing in the middle processing a child");
            if (m23264h()) {
                m23259m();
            }
            this.f14566g.add("");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public void m23256p(AbstractC5940k<?> abstractC5940k) {
            m23258n();
            this.f14562c = this.f14563d;
            this.f14560a.append(abstractC5940k.mo23193K(InterfaceC5945n.EnumC5947b.V2));
            this.f14564e = true;
            if (this.f14567h.mo23254a(this)) {
                m23259m();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public void m23255q(C5921b c5921b) {
            m23258n();
            if (this.f14564e) {
                this.f14560a.append(",");
            }
            m23265g(this.f14560a, c5921b);
            this.f14560a.append(":(");
            if (this.f14563d == this.f14561b.size()) {
                this.f14561b.add(c5921b);
            } else {
                this.f14561b.set(this.f14563d, c5921b);
            }
            this.f14563d++;
            this.f14564e = false;
        }

        /* renamed from: h */
        public boolean m23264h() {
            return this.f14560a != null;
        }

        /* renamed from: i */
        public int m23263i() {
            return this.f14560a.length();
        }

        /* renamed from: j */
        public C5830l m23262j() {
            return m23261k(this.f14563d);
        }
    }

    /* compiled from: CompoundHash.java */
    /* renamed from: com.google.firebase.database.u.d$c */
    /* loaded from: classes2.dex */
    private static class C5932c implements InterfaceC5933d {

        /* renamed from: a */
        private final long f14568a;

        public C5932c(InterfaceC5945n interfaceC5945n) {
            this.f14568a = Math.max(512L, (long) Math.sqrt(C5783e.m23774b(interfaceC5945n) * 100));
        }

        @Override // com.google.firebase.database.p139u.C5929d.InterfaceC5933d
        /* renamed from: a */
        public boolean mo23254a(C5931b c5931b) {
            return ((long) c5931b.m23263i()) > this.f14568a && (c5931b.m23262j().isEmpty() || !c5931b.m23262j().m23589V().equals(C5921b.m23293j()));
        }
    }

    /* compiled from: CompoundHash.java */
    /* renamed from: com.google.firebase.database.u.d$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC5933d {
        /* renamed from: a */
        boolean mo23254a(C5931b c5931b);
    }

    private C5929d(List<C5830l> list, List<String> list2) {
        if (list.size() == list2.size() - 1) {
            this.f14557a = list;
            this.f14558b = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    /* renamed from: b */
    public static C5929d m23277b(InterfaceC5945n interfaceC5945n) {
        return m23276c(interfaceC5945n, new C5932c(interfaceC5945n));
    }

    /* renamed from: c */
    public static C5929d m23276c(InterfaceC5945n interfaceC5945n, InterfaceC5933d interfaceC5933d) {
        if (interfaceC5945n.isEmpty()) {
            return new C5929d(Collections.emptyList(), Collections.singletonList(""));
        }
        C5931b c5931b = new C5931b(interfaceC5933d);
        m23273f(interfaceC5945n, c5931b);
        c5931b.m23257o();
        return new C5929d(c5931b.f14565f, c5931b.f14566g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static void m23273f(InterfaceC5945n interfaceC5945n, C5931b c5931b) {
        if (interfaceC5945n.mo23217N()) {
            c5931b.m23256p((AbstractC5940k) interfaceC5945n);
        } else if (!interfaceC5945n.isEmpty()) {
            if (interfaceC5945n instanceof C5924c) {
                ((C5924c) interfaceC5945n).m23289F(new C5930a(c5931b), true);
                return;
            }
            throw new IllegalStateException("Expected children node, but got: " + interfaceC5945n);
        } else {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        }
    }

    /* renamed from: d */
    public List<String> m23275d() {
        return Collections.unmodifiableList(this.f14558b);
    }

    /* renamed from: e */
    public List<C5830l> m23274e() {
        return Collections.unmodifiableList(this.f14557a);
    }
}
