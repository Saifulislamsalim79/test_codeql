package p201g.p219f.p223b.p224k.p225m;

import java.util.ArrayList;
import java.util.Iterator;
import p201g.p219f.p223b.p224k.C7558d;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.C7564f;
/* compiled from: ChainRun.java */
/* renamed from: g.f.b.k.m.c */
/* loaded from: classes2.dex */
public class C7576c extends AbstractC7593p {

    /* renamed from: k */
    ArrayList<AbstractC7593p> f18207k;

    /* renamed from: l */
    private int f18208l;

    public C7576c(C7561e c7561e, int i) {
        super(c7561e);
        this.f18207k = new ArrayList<>();
        this.f18260f = i;
        m18141q();
    }

    /* renamed from: q */
    private void m18141q() {
        C7561e c7561e;
        C7561e c7561e2 = this.f18256b;
        C7561e m18286J = c7561e2.m18286J(this.f18260f);
        while (true) {
            C7561e c7561e3 = m18286J;
            c7561e = c7561e2;
            c7561e2 = c7561e3;
            if (c7561e2 == null) {
                break;
            }
            m18286J = c7561e2.m18286J(this.f18260f);
        }
        this.f18256b = c7561e;
        this.f18207k.add(c7561e.m18282L(this.f18260f));
        C7561e m18290H = c7561e.m18290H(this.f18260f);
        while (m18290H != null) {
            this.f18207k.add(m18290H.m18282L(this.f18260f));
            m18290H = m18290H.m18290H(this.f18260f);
        }
        Iterator<AbstractC7593p> it = this.f18207k.iterator();
        while (it.hasNext()) {
            AbstractC7593p next = it.next();
            int i = this.f18260f;
            if (i == 0) {
                next.f18256b.f18114b = this;
            } else if (i == 1) {
                next.f18256b.f18116c = this;
            }
        }
        if ((this.f18260f == 0 && ((C7564f) this.f18256b.m18288I()).m18182y1()) && this.f18207k.size() > 1) {
            ArrayList<AbstractC7593p> arrayList = this.f18207k;
            this.f18256b = arrayList.get(arrayList.size() - 1).f18256b;
        }
        this.f18208l = this.f18260f == 0 ? this.f18256b.m18218x() : this.f18256b.m18278N();
    }

    /* renamed from: r */
    private C7561e m18140r() {
        for (int i = 0; i < this.f18207k.size(); i++) {
            AbstractC7593p abstractC7593p = this.f18207k.get(i);
            if (abstractC7593p.f18256b.m18272Q() != 8) {
                return abstractC7593p.f18256b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C7561e m18139s() {
        for (int size = this.f18207k.size() - 1; size >= 0; size--) {
            AbstractC7593p abstractC7593p = this.f18207k.get(size);
            if (abstractC7593p.f18256b.m18272Q() != 8) {
                return abstractC7593p.f18256b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x019e, code lost:
        if (r7 != r9) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c6, code lost:
        if (r7 != r9) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c8, code lost:
        r16 = r16 + 1;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01cb, code lost:
        r12.f18259e.mo18122d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0403, code lost:
        r3 = r3 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
        if (r2.f18259e.f18226j != false) goto L68;
     */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p, p201g.p219f.p223b.p224k.p225m.InterfaceC7577d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo18089a(p201g.p219f.p223b.p224k.p225m.InterfaceC7577d r23) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p219f.p223b.p224k.p225m.C7576c.mo18089a(g.f.b.k.m.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: d */
    public void mo18086d() {
        Iterator<AbstractC7593p> it = this.f18207k.iterator();
        while (it.hasNext()) {
            it.next().mo18086d();
        }
        int size = this.f18207k.size();
        if (size < 1) {
            return;
        }
        C7561e c7561e = this.f18207k.get(0).f18256b;
        C7561e c7561e2 = this.f18207k.get(size - 1).f18256b;
        if (this.f18260f == 0) {
            C7558d c7558d = c7561e.f18091F;
            C7558d c7558d2 = c7561e2.f18093H;
            C7579f m18081i = m18081i(c7558d, 0);
            int m18319e = c7558d.m18319e();
            C7561e m18140r = m18140r();
            if (m18140r != null) {
                m18319e = m18140r.f18091F.m18319e();
            }
            if (m18081i != null) {
                m18088b(this.f18262h, m18081i, m18319e);
            }
            C7579f m18081i2 = m18081i(c7558d2, 0);
            int m18319e2 = c7558d2.m18319e();
            C7561e m18139s = m18139s();
            if (m18139s != null) {
                m18319e2 = m18139s.f18093H.m18319e();
            }
            if (m18081i2 != null) {
                m18088b(this.f18263i, m18081i2, -m18319e2);
            }
        } else {
            C7558d c7558d3 = c7561e.f18092G;
            C7558d c7558d4 = c7561e2.f18094I;
            C7579f m18081i3 = m18081i(c7558d3, 1);
            int m18319e3 = c7558d3.m18319e();
            C7561e m18140r2 = m18140r();
            if (m18140r2 != null) {
                m18319e3 = m18140r2.f18092G.m18319e();
            }
            if (m18081i3 != null) {
                m18088b(this.f18262h, m18081i3, m18319e3);
            }
            C7579f m18081i4 = m18081i(c7558d4, 1);
            int m18319e4 = c7558d4.m18319e();
            C7561e m18139s2 = m18139s();
            if (m18139s2 != null) {
                m18319e4 = m18139s2.f18094I.m18319e();
            }
            if (m18081i4 != null) {
                m18088b(this.f18263i, m18081i4, -m18319e4);
            }
        }
        this.f18262h.f18217a = this;
        this.f18263i.f18217a = this;
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: e */
    public void mo18085e() {
        for (int i = 0; i < this.f18207k.size(); i++) {
            this.f18207k.get(i).mo18085e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: f */
    public void mo18084f() {
        this.f18257c = null;
        Iterator<AbstractC7593p> it = this.f18207k.iterator();
        while (it.hasNext()) {
            it.next().mo18084f();
        }
    }

    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: j */
    public long mo18080j() {
        int size = this.f18207k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC7593p abstractC7593p = this.f18207k.get(i);
            j = j + abstractC7593p.f18262h.f18222f + abstractC7593p.mo18080j() + abstractC7593p.f18263i.f18222f;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p219f.p223b.p224k.p225m.AbstractC7593p
    /* renamed from: m */
    public boolean mo18077m() {
        int size = this.f18207k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f18207k.get(i).mo18077m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        Iterator<AbstractC7593p> it;
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f18260f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        while (this.f18207k.iterator().hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
