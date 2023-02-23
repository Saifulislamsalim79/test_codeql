package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardViewApi21Impl.java */
/* renamed from: androidx.cardview.widget.b */
/* loaded from: classes2.dex */
public class C1246b implements InterfaceC1250e {
    /* renamed from: o */
    private C1251f m36694o(InterfaceC1249d interfaceC1249d) {
        return (C1251f) interfaceC1249d.mo36684g();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: a */
    public void mo36682a(InterfaceC1249d interfaceC1249d, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC1249d.mo36687d(new C1251f(colorStateList, f));
        View mo36683h = interfaceC1249d.mo36683h();
        mo36683h.setClipToOutline(true);
        mo36683h.setElevation(f2);
        mo36669n(interfaceC1249d, f3);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: b */
    public void mo36681b(InterfaceC1249d interfaceC1249d, float f) {
        m36694o(interfaceC1249d).m36661h(f);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: c */
    public float mo36680c(InterfaceC1249d interfaceC1249d) {
        return interfaceC1249d.mo36683h().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: d */
    public float mo36679d(InterfaceC1249d interfaceC1249d) {
        return m36694o(interfaceC1249d).m36665d();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: e */
    public void mo36678e(InterfaceC1249d interfaceC1249d) {
        mo36669n(interfaceC1249d, mo36676g(interfaceC1249d));
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: f */
    public void mo36677f(InterfaceC1249d interfaceC1249d, float f) {
        interfaceC1249d.mo36683h().setElevation(f);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: g */
    public float mo36676g(InterfaceC1249d interfaceC1249d) {
        return m36694o(interfaceC1249d).m36666c();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: h */
    public ColorStateList mo36675h(InterfaceC1249d interfaceC1249d) {
        return m36694o(interfaceC1249d).m36667b();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: i */
    public void mo36674i() {
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: j */
    public float mo36673j(InterfaceC1249d interfaceC1249d) {
        return mo36679d(interfaceC1249d) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: k */
    public float mo36672k(InterfaceC1249d interfaceC1249d) {
        return mo36679d(interfaceC1249d) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: l */
    public void mo36671l(InterfaceC1249d interfaceC1249d) {
        mo36669n(interfaceC1249d, mo36676g(interfaceC1249d));
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: m */
    public void mo36670m(InterfaceC1249d interfaceC1249d, ColorStateList colorStateList) {
        m36694o(interfaceC1249d).m36663f(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: n */
    public void mo36669n(InterfaceC1249d interfaceC1249d, float f) {
        m36694o(interfaceC1249d).m36662g(f, interfaceC1249d.mo36685f(), interfaceC1249d.mo36686e());
        m36693p(interfaceC1249d);
    }

    /* renamed from: p */
    public void m36693p(InterfaceC1249d interfaceC1249d) {
        if (!interfaceC1249d.mo36685f()) {
            interfaceC1249d.mo36689b(0, 0, 0, 0);
            return;
        }
        float mo36676g = mo36676g(interfaceC1249d);
        float mo36679d = mo36679d(interfaceC1249d);
        int ceil = (int) Math.ceil(C1252g.m36657c(mo36676g, mo36679d, interfaceC1249d.mo36686e()));
        int ceil2 = (int) Math.ceil(C1252g.m36656d(mo36676g, mo36679d, interfaceC1249d.mo36686e()));
        interfaceC1249d.mo36689b(ceil, ceil2, ceil, ceil2);
    }
}
