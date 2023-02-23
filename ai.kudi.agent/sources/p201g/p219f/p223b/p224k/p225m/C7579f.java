package p201g.p219f.p223b.p224k.p225m;

import java.util.ArrayList;
import java.util.List;
/* compiled from: DependencyNode.java */
/* renamed from: g.f.b.k.m.f */
/* loaded from: classes2.dex */
public class C7579f implements InterfaceC7577d {

    /* renamed from: d */
    AbstractC7593p f18220d;

    /* renamed from: f */
    int f18222f;

    /* renamed from: g */
    public int f18223g;

    /* renamed from: a */
    public InterfaceC7577d f18217a = null;

    /* renamed from: b */
    public boolean f18218b = false;

    /* renamed from: c */
    public boolean f18219c = false;

    /* renamed from: e */
    EnumC7580a f18221e = EnumC7580a.UNKNOWN;

    /* renamed from: h */
    int f18224h = 1;

    /* renamed from: i */
    C7581g f18225i = null;

    /* renamed from: j */
    public boolean f18226j = false;

    /* renamed from: k */
    List<InterfaceC7577d> f18227k = new ArrayList();

    /* renamed from: l */
    List<C7579f> f18228l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* renamed from: g.f.b.k.m.f$a */
    /* loaded from: classes2.dex */
    enum EnumC7580a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C7579f(AbstractC7593p abstractC7593p) {
        this.f18220d = abstractC7593p;
    }

    @Override // p201g.p219f.p223b.p224k.p225m.InterfaceC7577d
    /* renamed from: a */
    public void mo18089a(InterfaceC7577d interfaceC7577d) {
        for (C7579f c7579f : this.f18228l) {
            if (!c7579f.f18226j) {
                return;
            }
        }
        this.f18219c = true;
        InterfaceC7577d interfaceC7577d2 = this.f18217a;
        if (interfaceC7577d2 != null) {
            interfaceC7577d2.mo18089a(this);
        }
        if (this.f18218b) {
            this.f18220d.mo18089a(this);
            return;
        }
        C7579f c7579f2 = null;
        int i = 0;
        for (C7579f c7579f3 : this.f18228l) {
            if (!(c7579f3 instanceof C7581g)) {
                i++;
                c7579f2 = c7579f3;
            }
        }
        if (c7579f2 != null && i == 1 && c7579f2.f18226j) {
            C7581g c7581g = this.f18225i;
            if (c7581g != null) {
                if (!c7581g.f18226j) {
                    return;
                }
                this.f18222f = this.f18224h * c7581g.f18223g;
            }
            mo18122d(c7579f2.f18223g + this.f18222f);
        }
        InterfaceC7577d interfaceC7577d3 = this.f18217a;
        if (interfaceC7577d3 != null) {
            interfaceC7577d3.mo18089a(this);
        }
    }

    /* renamed from: b */
    public void m18124b(InterfaceC7577d interfaceC7577d) {
        this.f18227k.add(interfaceC7577d);
        if (this.f18226j) {
            interfaceC7577d.mo18089a(interfaceC7577d);
        }
    }

    /* renamed from: c */
    public void m18123c() {
        this.f18228l.clear();
        this.f18227k.clear();
        this.f18226j = false;
        this.f18223g = 0;
        this.f18219c = false;
        this.f18218b = false;
    }

    /* renamed from: d */
    public void mo18122d(int i) {
        if (this.f18226j) {
            return;
        }
        this.f18226j = true;
        this.f18223g = i;
        for (InterfaceC7577d interfaceC7577d : this.f18227k) {
            interfaceC7577d.mo18089a(interfaceC7577d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18220d.f18256b.m18230r());
        sb.append(":");
        sb.append(this.f18221e);
        sb.append("(");
        sb.append(this.f18226j ? Integer.valueOf(this.f18223g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f18228l.size());
        sb.append(":d=");
        sb.append(this.f18227k.size());
        sb.append(">");
        return sb.toString();
    }
}
