package p201g.p219f.p223b.p224k;

import java.util.ArrayList;
import java.util.Arrays;
import p201g.p219f.p223b.p224k.p225m.C7583i;
import p201g.p219f.p223b.p224k.p225m.C7591o;
/* compiled from: HelperWidget.java */
/* renamed from: g.f.b.k.i */
/* loaded from: classes2.dex */
public class C7568i extends C7561e implements InterfaceC7567h {

    /* renamed from: p0 */
    public C7561e[] f18186p0 = new C7561e[4];

    /* renamed from: q0 */
    public int f18187q0 = 0;

    @Override // p201g.p219f.p223b.p224k.InterfaceC7567h
    /* renamed from: a */
    public void mo18164a(C7561e c7561e) {
        if (c7561e == this || c7561e == null) {
            return;
        }
        int i = this.f18187q0 + 1;
        C7561e[] c7561eArr = this.f18186p0;
        if (i > c7561eArr.length) {
            this.f18186p0 = (C7561e[]) Arrays.copyOf(c7561eArr, c7561eArr.length * 2);
        }
        C7561e[] c7561eArr2 = this.f18186p0;
        int i2 = this.f18187q0;
        c7561eArr2[i2] = c7561e;
        this.f18187q0 = i2 + 1;
    }

    /* renamed from: a1 */
    public void m18163a1(ArrayList<C7591o> arrayList, int i, C7591o c7591o) {
        for (int i2 = 0; i2 < this.f18187q0; i2++) {
            c7591o.m18099a(this.f18186p0[i2]);
        }
        for (int i3 = 0; i3 < this.f18187q0; i3++) {
            C7583i.m18112a(this.f18186p0[i3], i, arrayList, c7591o);
        }
    }

    @Override // p201g.p219f.p223b.p224k.InterfaceC7567h
    /* renamed from: b */
    public void mo18162b() {
        this.f18187q0 = 0;
        Arrays.fill(this.f18186p0, (Object) null);
    }

    /* renamed from: b1 */
    public int m18161b1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f18187q0; i4++) {
            C7561e c7561e = this.f18186p0[i4];
            if (i == 0 && (i3 = c7561e.f18137m0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = c7561e.f18139n0) != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p201g.p219f.p223b.p224k.InterfaceC7567h
    /* renamed from: c */
    public void mo18158c(C7564f c7564f) {
    }
}
