package p577n.p578a.p579a;

import java.util.ArrayList;
import java.util.List;
import p577n.p578a.p579a.p581v.C14411d;
import p577n.p578a.p582b.AbstractC14412a;
import p577n.p578a.p582b.C14424m;
import p577n.p578a.p582b.C14431t;
import p577n.p578a.p583c.p584f.AbstractC14445a;
import p577n.p578a.p583c.p584f.AbstractC14446b;
import p577n.p578a.p583c.p584f.AbstractC14450f;
import p577n.p578a.p583c.p584f.C14447c;
import p577n.p578a.p583c.p584f.InterfaceC14451g;
import p577n.p578a.p583c.p584f.InterfaceC14452h;
/* compiled from: IndentedCodeBlockParser.java */
/* renamed from: n.a.a.l */
/* loaded from: classes3.dex */
public class C14386l extends AbstractC14445a {

    /* renamed from: a */
    private final C14424m f31722a = new C14424m();

    /* renamed from: b */
    private final List<CharSequence> f31723b = new ArrayList();

    /* compiled from: IndentedCodeBlockParser.java */
    /* renamed from: n.a.a.l$a */
    /* loaded from: classes3.dex */
    public static class C14387a extends AbstractC14446b {
        @Override // p577n.p578a.p583c.p584f.InterfaceC14449e
        /* renamed from: a */
        public AbstractC14450f mo1714a(InterfaceC14452h interfaceC14452h, InterfaceC14451g interfaceC14451g) {
            if (interfaceC14452h.mo1705b() < C14411d.f31790a || interfaceC14452h.mo1706a() || (interfaceC14452h.mo1702e().mo1716g() instanceof C14431t)) {
                return AbstractC14450f.m1711c();
            }
            AbstractC14450f m1710d = AbstractC14450f.m1710d(new C14386l());
            m1710d.mo1713a(interfaceC14452h.mo1701f() + C14411d.f31790a);
            return m1710d;
        }
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: c */
    public C14447c mo1720c(InterfaceC14452h interfaceC14452h) {
        if (interfaceC14452h.mo1705b() >= C14411d.f31790a) {
            return C14447c.m1726a(interfaceC14452h.mo1701f() + C14411d.f31790a);
        }
        if (interfaceC14452h.mo1706a()) {
            return C14447c.m1725b(interfaceC14452h.mo1703d());
        }
        return C14447c.m1723d();
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: e */
    public void mo1718e() {
        int size = this.f31723b.size() - 1;
        while (size >= 0 && C14411d.m1817f(this.f31723b.get(size))) {
            size--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size + 1; i++) {
            sb.append(this.f31723b.get(i));
            sb.append('\n');
        }
        this.f31722a.m1787o(sb.toString());
    }

    @Override // p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: g */
    public AbstractC14412a mo1716g() {
        return this.f31722a;
    }

    @Override // p577n.p578a.p583c.p584f.AbstractC14445a, p577n.p578a.p583c.p584f.InterfaceC14448d
    /* renamed from: h */
    public void mo1715h(CharSequence charSequence) {
        this.f31723b.add(charSequence);
    }
}
