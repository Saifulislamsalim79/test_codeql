package p577n.p578a.p579a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import p577n.p578a.p582b.C14434w;
import p577n.p578a.p583c.p585g.InterfaceC14453a;
import p577n.p578a.p583c.p585g.InterfaceC14454b;
/* compiled from: StaggeredDelimiterProcessor.java */
/* renamed from: n.a.a.s */
/* loaded from: classes3.dex */
class C14400s implements InterfaceC14453a {

    /* renamed from: a */
    private final char f31778a;

    /* renamed from: b */
    private int f31779b = 0;

    /* renamed from: c */
    private LinkedList<InterfaceC14453a> f31780c = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14400s(char c) {
        this.f31778a = c;
    }

    /* renamed from: g */
    private InterfaceC14453a m1837g(int i) {
        Iterator<InterfaceC14453a> it = this.f31780c.iterator();
        while (it.hasNext()) {
            InterfaceC14453a next = it.next();
            if (next.mo1696d() <= i) {
                return next;
            }
        }
        return this.f31780c.getFirst();
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: a */
    public void mo1699a(C14434w c14434w, C14434w c14434w2, int i) {
        m1837g(i).mo1699a(c14434w, c14434w2, i);
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: b */
    public char mo1698b() {
        return this.f31778a;
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: c */
    public int mo1697c(InterfaceC14454b interfaceC14454b, InterfaceC14454b interfaceC14454b2) {
        return m1837g(interfaceC14454b.length()).mo1697c(interfaceC14454b, interfaceC14454b2);
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: d */
    public int mo1696d() {
        return this.f31779b;
    }

    @Override // p577n.p578a.p583c.p585g.InterfaceC14453a
    /* renamed from: e */
    public char mo1695e() {
        return this.f31778a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1838f(InterfaceC14453a interfaceC14453a) {
        boolean z;
        int mo1696d;
        int mo1696d2 = interfaceC14453a.mo1696d();
        ListIterator<InterfaceC14453a> listIterator = this.f31780c.listIterator();
        do {
            if (listIterator.hasNext()) {
                mo1696d = listIterator.next().mo1696d();
                if (mo1696d2 > mo1696d) {
                    listIterator.previous();
                    listIterator.add(interfaceC14453a);
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            this.f31780c.add(interfaceC14453a);
            this.f31779b = mo1696d2;
            return;
        } while (mo1696d2 != mo1696d);
        throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f31778a + "' and minimum length " + mo1696d2);
    }
}
