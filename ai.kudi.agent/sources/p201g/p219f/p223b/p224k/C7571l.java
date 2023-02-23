package p201g.p219f.p223b.p224k;

import java.util.ArrayList;
import p201g.p219f.p223b.C7542c;
/* compiled from: WidgetContainer.java */
/* renamed from: g.f.b.k.l */
/* loaded from: classes2.dex */
public class C7571l extends C7561e {

    /* renamed from: p0 */
    public ArrayList<C7561e> f18190p0 = new ArrayList<>();

    /* renamed from: a */
    public void m18155a(C7561e c7561e) {
        this.f18190p0.add(c7561e);
        if (c7561e.m18288I() != null) {
            ((C7571l) c7561e.m18288I()).m18152c1(c7561e);
        }
        c7561e.m18279M0(this);
    }

    /* renamed from: a1 */
    public ArrayList<C7561e> m18154a1() {
        return this.f18190p0;
    }

    /* renamed from: b1 */
    public void mo18153b1() {
        ArrayList<C7561e> arrayList = this.f18190p0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7561e c7561e = this.f18190p0.get(i);
            if (c7561e instanceof C7571l) {
                ((C7571l) c7561e).mo18153b1();
            }
        }
    }

    /* renamed from: c1 */
    public void m18152c1(C7561e c7561e) {
        this.f18190p0.remove(c7561e);
        c7561e.mo18150h0();
    }

    /* renamed from: d1 */
    public void m18151d1() {
        this.f18190p0.clear();
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: h0 */
    public void mo18150h0() {
        this.f18190p0.clear();
        super.mo18150h0();
    }

    @Override // p201g.p219f.p223b.p224k.C7561e
    /* renamed from: j0 */
    public void mo18149j0(C7542c c7542c) {
        super.mo18149j0(c7542c);
        int size = this.f18190p0.size();
        for (int i = 0; i < size; i++) {
            this.f18190p0.get(i).mo18149j0(c7542c);
        }
    }
}
