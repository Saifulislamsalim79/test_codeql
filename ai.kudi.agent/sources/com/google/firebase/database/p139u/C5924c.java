package com.google.firebase.database.p139u;

import com.google.firebase.database.p128q.AbstractC5653c;
import com.google.firebase.database.p128q.InterfaceC5661h;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ChildrenNode.java */
/* renamed from: com.google.firebase.database.u.c */
/* loaded from: classes2.dex */
public class C5924c implements InterfaceC5945n {

    /* renamed from: f */
    public static Comparator<C5921b> f14549f = new C5925a();

    /* renamed from: c */
    private final AbstractC5653c<C5921b, InterfaceC5945n> f14550c;

    /* renamed from: d */
    private final InterfaceC5945n f14551d;

    /* renamed from: e */
    private String f14552e;

    /* compiled from: ChildrenNode.java */
    /* renamed from: com.google.firebase.database.u.c$a */
    /* loaded from: classes2.dex */
    class C5925a implements Comparator<C5921b> {
        C5925a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C5921b c5921b, C5921b c5921b2) {
            return c5921b.compareTo(c5921b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildrenNode.java */
    /* renamed from: com.google.firebase.database.u.c$b */
    /* loaded from: classes2.dex */
    public class C5926b extends InterfaceC5661h.AbstractC5663b<C5921b, InterfaceC5945n> {

        /* renamed from: a */
        boolean f14553a = false;

        /* renamed from: b */
        final /* synthetic */ AbstractC5927c f14554b;

        C5926b(AbstractC5927c abstractC5927c) {
            this.f14554b = abstractC5927c;
        }

        @Override // com.google.firebase.database.p128q.InterfaceC5661h.AbstractC5663b
        /* renamed from: b */
        public void mo23281a(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
            if (!this.f14553a && c5921b.compareTo(C5921b.m23293j()) > 0) {
                this.f14553a = true;
                this.f14554b.mo23272b(C5921b.m23293j(), C5924c.this.mo23208x());
            }
            this.f14554b.mo23272b(c5921b, interfaceC5945n);
        }
    }

    /* compiled from: ChildrenNode.java */
    /* renamed from: com.google.firebase.database.u.c$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5927c extends InterfaceC5661h.AbstractC5663b<C5921b, InterfaceC5945n> {
        /* renamed from: b */
        public abstract void mo23272b(C5921b c5921b, InterfaceC5945n interfaceC5945n);

        @Override // com.google.firebase.database.p128q.InterfaceC5661h.AbstractC5663b
        /* renamed from: c */
        public void mo23281a(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
            mo23272b(c5921b, interfaceC5945n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChildrenNode.java */
    /* renamed from: com.google.firebase.database.u.c$d */
    /* loaded from: classes2.dex */
    public static class C5928d implements Iterator<C5944m> {

        /* renamed from: c */
        private final Iterator<Map.Entry<C5921b, InterfaceC5945n>> f14556c;

        public C5928d(Iterator<Map.Entry<C5921b, InterfaceC5945n>> it) {
            this.f14556c = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C5944m next() {
            Map.Entry<C5921b, InterfaceC5945n> next = this.f14556c.next();
            return new C5944m(next.getKey(), next.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14556c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f14556c.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C5924c() {
        this.f14552e = null;
        this.f14550c = AbstractC5653c.C5654a.m24246b(f14549f);
        this.f14551d = C5951r.m23201a();
    }

    /* renamed from: O */
    private void m23286O(StringBuilder sb, int i) {
        if (this.f14550c.isEmpty() && this.f14551d.isEmpty()) {
            sb.append("{ }");
            return;
        }
        sb.append("{\n");
        Iterator<Map.Entry<C5921b, InterfaceC5945n>> it = this.f14550c.iterator();
        while (it.hasNext()) {
            Map.Entry<C5921b, InterfaceC5945n> next = it.next();
            int i2 = i + 2;
            m23285e(sb, i2);
            sb.append(next.getKey().m23298b());
            sb.append("=");
            if (next.getValue() instanceof C5924c) {
                ((C5924c) next.getValue()).m23286O(sb, i2);
            } else {
                sb.append(next.getValue().toString());
            }
            sb.append("\n");
        }
        if (!this.f14551d.isEmpty()) {
            m23285e(sb, i + 2);
            sb.append(".priority=");
            sb.append(this.f14551d.toString());
            sb.append("\n");
        }
        m23285e(sb, i);
        sb.append("}");
    }

    /* renamed from: e */
    private static void m23285e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: B */
    public InterfaceC5945n mo23220B(C5830l c5830l) {
        C5921b m23587Z = c5830l.m23587Z();
        return m23587Z == null ? this : mo23211L(m23587Z).mo23220B(c5830l.m23583e0());
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: D */
    public InterfaceC5945n mo23195D(InterfaceC5945n interfaceC5945n) {
        if (this.f14550c.isEmpty()) {
            return C5936g.m23249P();
        }
        return new C5924c(this.f14550c, interfaceC5945n);
    }

    /* renamed from: F */
    public void m23289F(AbstractC5927c abstractC5927c, boolean z) {
        if (z && !mo23208x().isEmpty()) {
            this.f14550c.mo24202m(new C5926b(abstractC5927c));
        } else {
            this.f14550c.mo24202m(abstractC5927c);
        }
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: G */
    public C5921b mo23219G(C5921b c5921b) {
        return this.f14550c.mo24203l(c5921b);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: H */
    public InterfaceC5945n mo23218H(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        C5921b m23587Z = c5830l.m23587Z();
        if (m23587Z == null) {
            return interfaceC5945n;
        }
        if (m23587Z.m23292p()) {
            C5795m.m23745f(C5951r.m23200b(interfaceC5945n));
            return mo23195D(interfaceC5945n);
        }
        return mo23216T(m23587Z, mo23211L(m23587Z).mo23218H(c5830l.m23583e0(), interfaceC5945n));
    }

    /* renamed from: I */
    public C5921b m23288I() {
        return this.f14550c.mo24204k();
    }

    /* renamed from: J */
    public C5921b m23287J() {
        return this.f14550c.mo24205h();
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: K */
    public String mo23193K(InterfaceC5945n.EnumC5947b enumC5947b) {
        boolean z;
        if (enumC5947b == InterfaceC5945n.EnumC5947b.V1) {
            StringBuilder sb = new StringBuilder();
            if (!this.f14551d.isEmpty()) {
                sb.append("priority:");
                sb.append(this.f14551d.mo23193K(InterfaceC5945n.EnumC5947b.V1));
                sb.append(":");
            }
            ArrayList<C5944m> arrayList = new ArrayList();
            Iterator<C5944m> it = iterator();
            loop0: while (true) {
                while (it.hasNext()) {
                    C5944m next = it.next();
                    arrayList.add(next);
                    z = z || !next.m23221d().mo23208x().isEmpty();
                }
            }
            if (z) {
                Collections.sort(arrayList, C5950q.m23202j());
            }
            for (C5944m c5944m : arrayList) {
                String mo23212t = c5944m.m23221d().mo23212t();
                if (!mo23212t.equals("")) {
                    sb.append(":");
                    sb.append(c5944m.m23222c().m23298b());
                    sb.append(":");
                    sb.append(mo23212t);
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: L */
    public InterfaceC5945n mo23211L(C5921b c5921b) {
        if (c5921b.m23292p() && !this.f14551d.isEmpty()) {
            return this.f14551d;
        }
        if (this.f14550c.mo24208d(c5921b)) {
            return this.f14550c.mo24207e(c5921b);
        }
        return C5936g.m23249P();
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: N */
    public boolean mo23217N() {
        return false;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: R */
    public boolean mo23210R(C5921b c5921b) {
        return !mo23211L(c5921b).isEmpty();
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: T */
    public InterfaceC5945n mo23216T(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        if (c5921b.m23292p()) {
            return mo23195D(interfaceC5945n);
        }
        AbstractC5653c<C5921b, InterfaceC5945n> abstractC5653c = this.f14550c;
        if (abstractC5653c.mo24208d(c5921b)) {
            abstractC5653c = abstractC5653c.mo24200u(c5921b);
        }
        if (!interfaceC5945n.isEmpty()) {
            abstractC5653c = abstractC5653c.mo24201s(c5921b, interfaceC5945n);
        }
        if (abstractC5653c.isEmpty()) {
            return C5936g.m23249P();
        }
        return new C5924c(abstractC5653c, this.f14551d);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: W */
    public Object mo23215W(boolean z) {
        Integer m23740k;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<C5921b, InterfaceC5945n>> it = this.f14550c.iterator();
        int i = 0;
        boolean z2 = true;
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry<C5921b, InterfaceC5945n> next = it.next();
            String m23298b = next.getKey().m23298b();
            hashMap.put(m23298b, next.getValue().mo23215W(z));
            i++;
            if (z2) {
                if ((m23298b.length() > 1 && m23298b.charAt(0) == '0') || (m23740k = C5795m.m23740k(m23298b)) == null || m23740k.intValue() < 0) {
                    z2 = false;
                } else if (m23740k.intValue() > i2) {
                    i2 = m23740k.intValue();
                }
            }
        }
        if (!z && z2 && i2 < i * 2) {
            ArrayList arrayList = new ArrayList(i2 + 1);
            for (int i3 = 0; i3 <= i2; i3++) {
                arrayList.add(hashMap.get("" + i3));
            }
            return arrayList;
        }
        if (z && !this.f14551d.isEmpty()) {
            hashMap.put(".priority", this.f14551d.getValue());
        }
        return hashMap;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: a0 */
    public Iterator<C5944m> mo23214a0() {
        return new C5928d(this.f14550c.mo24209a0());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5924c) {
            C5924c c5924c = (C5924c) obj;
            if (mo23208x().equals(c5924c.mo23208x()) && this.f14550c.size() == c5924c.f14550c.size()) {
                Iterator<Map.Entry<C5921b, InterfaceC5945n>> it = this.f14550c.iterator();
                Iterator<Map.Entry<C5921b, InterfaceC5945n>> it2 = c5924c.f14550c.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry<C5921b, InterfaceC5945n> next = it.next();
                    Map.Entry<C5921b, InterfaceC5945n> next2 = it2.next();
                    if (next.getKey().equals(next2.getKey()) || !next.getValue().equals(next2.getValue())) {
                        return false;
                    }
                    while (it.hasNext()) {
                        Map.Entry<C5921b, InterfaceC5945n> next3 = it.next();
                        Map.Entry<C5921b, InterfaceC5945n> next22 = it2.next();
                        if (next3.getKey().equals(next22.getKey())) {
                        }
                        return false;
                    }
                }
                if (it.hasNext() || it2.hasNext()) {
                    throw new IllegalStateException("Something went wrong internally.");
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    public Object getValue() {
        return mo23215W(false);
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(InterfaceC5945n interfaceC5945n) {
        if (isEmpty()) {
            return interfaceC5945n.isEmpty() ? 0 : -1;
        } else if (interfaceC5945n.mo23217N() || interfaceC5945n.isEmpty()) {
            return 1;
        } else {
            return interfaceC5945n == InterfaceC5945n.f14590q ? -1 : 0;
        }
    }

    public int hashCode() {
        Iterator<C5944m> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            C5944m next = it.next();
            i = (((i * 31) + next.m23222c().hashCode()) * 17) + next.m23221d().hashCode();
        }
        return i;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    public boolean isEmpty() {
        return this.f14550c.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<C5944m> iterator() {
        return new C5928d(this.f14550c.iterator());
    }

    /* renamed from: m */
    public void m23284m(AbstractC5927c abstractC5927c) {
        m23289F(abstractC5927c, false);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: o */
    public int mo23213o() {
        return this.f14550c.size();
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: t */
    public String mo23212t() {
        if (this.f14552e == null) {
            String mo23193K = mo23193K(InterfaceC5945n.EnumC5947b.V1);
            this.f14552e = mo23193K.isEmpty() ? "" : C5795m.m23742i(mo23193K);
        }
        return this.f14552e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m23286O(sb, 0);
        return sb.toString();
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: x */
    public InterfaceC5945n mo23208x() {
        return this.f14551d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C5924c(AbstractC5653c<C5921b, InterfaceC5945n> abstractC5653c, InterfaceC5945n interfaceC5945n) {
        this.f14552e = null;
        if (abstractC5653c.isEmpty() && !interfaceC5945n.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f14551d = interfaceC5945n;
        this.f14550c = abstractC5653c;
    }
}
