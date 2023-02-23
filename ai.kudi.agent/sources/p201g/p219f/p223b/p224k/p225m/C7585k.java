package p201g.p219f.p223b.p224k.p225m;

import p201g.p219f.p223b.p224k.C7555a;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.p225m.C7579f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelperReferences.java */
/* renamed from: g.f.b.k.m.k */
/* loaded from: classes2.dex */
public class C7585k extends AbstractC7593p {
    public C7585k(C7561e c7561e) {
        super(c7561e);
    }

    /* renamed from: q */
    private void m18107q(C7579f c7579f) {
        this.f18262h.f18227k.add(c7579f);
        c7579f.f18228l.add(this.f18262h);
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p, p201g.p219f.p223b.p224k.p225m.InterfaceC7577d
    /* renamed from: a */
    public void mo18089a(InterfaceC7577d interfaceC7577d) {
        C7555a c7555a = (C7555a) this.f18256b;
        int m18335e1 = c7555a.m18335e1();
        int i = 0;
        int i2 = -1;
        for (C7579f c7579f : this.f18262h.f18228l) {
            int i3 = c7579f.f18223g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (m18335e1 != 0 && m18335e1 != 2) {
            this.f18262h.mo18122d(i + c7555a.m18334f1());
        } else {
            this.f18262h.mo18122d(i2 + c7555a.m18334f1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: d */
    public void mo18086d() {
        C7561e c7561e = this.f18256b;
        if (c7561e instanceof C7555a) {
            this.f18262h.f18218b = true;
            C7555a c7555a = (C7555a) c7561e;
            int m18335e1 = c7555a.m18335e1();
            boolean m18336d1 = c7555a.m18336d1();
            int i = 0;
            if (m18335e1 == 0) {
                this.f18262h.f18221e = C7579f.EnumC7580a.LEFT;
                while (i < c7555a.f18187q0) {
                    C7561e c7561e2 = c7555a.f18186p0[i];
                    if (m18336d1 || c7561e2.m18272Q() != 8) {
                        C7579f c7579f = c7561e2.f18118d.f18262h;
                        c7579f.f18227k.add(this.f18262h);
                        this.f18262h.f18228l.add(c7579f);
                    }
                    i++;
                }
                m18107q(this.f18256b.f18118d.f18262h);
                m18107q(this.f18256b.f18118d.f18263i);
            } else if (m18335e1 == 1) {
                this.f18262h.f18221e = C7579f.EnumC7580a.RIGHT;
                while (i < c7555a.f18187q0) {
                    C7561e c7561e3 = c7555a.f18186p0[i];
                    if (m18336d1 || c7561e3.m18272Q() != 8) {
                        C7579f c7579f2 = c7561e3.f18118d.f18263i;
                        c7579f2.f18227k.add(this.f18262h);
                        this.f18262h.f18228l.add(c7579f2);
                    }
                    i++;
                }
                m18107q(this.f18256b.f18118d.f18262h);
                m18107q(this.f18256b.f18118d.f18263i);
            } else if (m18335e1 == 2) {
                this.f18262h.f18221e = C7579f.EnumC7580a.TOP;
                while (i < c7555a.f18187q0) {
                    C7561e c7561e4 = c7555a.f18186p0[i];
                    if (m18336d1 || c7561e4.m18272Q() != 8) {
                        C7579f c7579f3 = c7561e4.f18120e.f18262h;
                        c7579f3.f18227k.add(this.f18262h);
                        this.f18262h.f18228l.add(c7579f3);
                    }
                    i++;
                }
                m18107q(this.f18256b.f18120e.f18262h);
                m18107q(this.f18256b.f18120e.f18263i);
            } else if (m18335e1 != 3) {
            } else {
                this.f18262h.f18221e = C7579f.EnumC7580a.BOTTOM;
                while (i < c7555a.f18187q0) {
                    C7561e c7561e5 = c7555a.f18186p0[i];
                    if (m18336d1 || c7561e5.m18272Q() != 8) {
                        C7579f c7579f4 = c7561e5.f18120e.f18263i;
                        c7579f4.f18227k.add(this.f18262h);
                        this.f18262h.f18228l.add(c7579f4);
                    }
                    i++;
                }
                m18107q(this.f18256b.f18120e.f18262h);
                m18107q(this.f18256b.f18120e.f18263i);
            }
        }
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: e */
    public void mo18085e() {
        C7561e c7561e = this.f18256b;
        if (c7561e instanceof C7555a) {
            int m18335e1 = ((C7555a) c7561e).m18335e1();
            if (m18335e1 != 0 && m18335e1 != 1) {
                this.f18256b.m18259W0(this.f18262h.f18223g);
            } else {
                this.f18256b.m18261V0(this.f18262h.f18223g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: f */
    public void mo18084f() {
        this.f18257c = null;
        this.f18262h.m18123c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: m */
    public boolean mo18077m() {
        return false;
    }
}
