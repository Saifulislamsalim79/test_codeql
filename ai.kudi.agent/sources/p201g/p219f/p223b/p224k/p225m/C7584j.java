package p201g.p219f.p223b.p224k.p225m;

import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.C7565g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuidelineReference.java */
/* renamed from: g.f.b.k.m.j */
/* loaded from: classes2.dex */
public class C7584j extends AbstractC7593p {
    public C7584j(C7561e c7561e) {
        super(c7561e);
        c7561e.f18118d.mo18084f();
        c7561e.f18120e.mo18084f();
        this.f18260f = ((C7565g) c7561e).m18178b1();
    }

    /* renamed from: q */
    private void m18108q(C7579f c7579f) {
        this.f18262h.f18227k.add(c7579f);
        c7579f.f18228l.add(this.f18262h);
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p, p201g.p219f.p223b.p224k.p225m.InterfaceC7577d
    /* renamed from: a */
    public void mo18089a(InterfaceC7577d interfaceC7577d) {
        C7579f c7579f = this.f18262h;
        if (c7579f.f18219c && !c7579f.f18226j) {
            this.f18262h.mo18122d((int) ((c7579f.f18228l.get(0).f18223g * ((C7565g) this.f18256b).m18174e1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: d */
    public void mo18086d() {
        C7565g c7565g = (C7565g) this.f18256b;
        int m18177c1 = c7565g.m18177c1();
        int m18176d1 = c7565g.m18176d1();
        c7565g.m18174e1();
        if (c7565g.m18178b1() == 1) {
            if (m18177c1 != -1) {
                this.f18262h.f18228l.add(this.f18256b.f18103R.f18118d.f18262h);
                this.f18256b.f18103R.f18118d.f18262h.f18227k.add(this.f18262h);
                this.f18262h.f18222f = m18177c1;
            } else if (m18176d1 != -1) {
                this.f18262h.f18228l.add(this.f18256b.f18103R.f18118d.f18263i);
                this.f18256b.f18103R.f18118d.f18263i.f18227k.add(this.f18262h);
                this.f18262h.f18222f = -m18176d1;
            } else {
                C7579f c7579f = this.f18262h;
                c7579f.f18218b = true;
                c7579f.f18228l.add(this.f18256b.f18103R.f18118d.f18263i);
                this.f18256b.f18103R.f18118d.f18263i.f18227k.add(this.f18262h);
            }
            m18108q(this.f18256b.f18118d.f18262h);
            m18108q(this.f18256b.f18118d.f18263i);
            return;
        }
        if (m18177c1 != -1) {
            this.f18262h.f18228l.add(this.f18256b.f18103R.f18120e.f18262h);
            this.f18256b.f18103R.f18120e.f18262h.f18227k.add(this.f18262h);
            this.f18262h.f18222f = m18177c1;
        } else if (m18176d1 != -1) {
            this.f18262h.f18228l.add(this.f18256b.f18103R.f18120e.f18263i);
            this.f18256b.f18103R.f18120e.f18263i.f18227k.add(this.f18262h);
            this.f18262h.f18222f = -m18176d1;
        } else {
            C7579f c7579f2 = this.f18262h;
            c7579f2.f18218b = true;
            c7579f2.f18228l.add(this.f18256b.f18103R.f18120e.f18263i);
            this.f18256b.f18103R.f18120e.f18263i.f18227k.add(this.f18262h);
        }
        m18108q(this.f18256b.f18120e.f18262h);
        m18108q(this.f18256b.f18120e.f18263i);
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: e */
    public void mo18085e() {
        if (((C7565g) this.f18256b).m18178b1() == 1) {
            this.f18256b.m18261V0(this.f18262h.f18223g);
        } else {
            this.f18256b.m18259W0(this.f18262h.f18223g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: f */
    public void mo18084f() {
        this.f18262h.m18123c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: m */
    public boolean mo18077m() {
        return false;
    }
}
