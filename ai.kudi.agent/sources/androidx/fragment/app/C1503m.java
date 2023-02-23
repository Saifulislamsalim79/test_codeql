package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import p201g.p227h.p237k.C7675h;
/* compiled from: FragmentController.java */
/* renamed from: androidx.fragment.app.m */
/* loaded from: classes2.dex */
public class C1503m {

    /* renamed from: a */
    private final AbstractC1505o<?> f4620a;

    private C1503m(AbstractC1505o<?> abstractC1505o) {
        this.f4620a = abstractC1505o;
    }

    /* renamed from: b */
    public static C1503m m35705b(AbstractC1505o<?> abstractC1505o) {
        C7675h.m17865g(abstractC1505o, "callbacks == null");
        return new C1503m(abstractC1505o);
    }

    /* renamed from: a */
    public void m35706a(Fragment fragment) {
        AbstractC1505o<?> abstractC1505o = this.f4620a;
        abstractC1505o.f4625f.m35930j(abstractC1505o, abstractC1505o, fragment);
    }

    /* renamed from: c */
    public void m35704c() {
        this.f4620a.f4625f.m35894v();
    }

    /* renamed from: d */
    public void m35703d(Configuration configuration) {
        this.f4620a.f4625f.m35888x(configuration);
    }

    /* renamed from: e */
    public boolean m35702e(MenuItem menuItem) {
        return this.f4620a.f4625f.m35885y(menuItem);
    }

    /* renamed from: f */
    public void m35701f() {
        this.f4620a.f4625f.m35883z();
    }

    /* renamed from: g */
    public boolean m35700g(Menu menu, MenuInflater menuInflater) {
        return this.f4620a.f4625f.m36009A(menu, menuInflater);
    }

    /* renamed from: h */
    public void m35699h() {
        this.f4620a.f4625f.m36007B();
    }

    /* renamed from: i */
    public void m35698i() {
        this.f4620a.f4625f.m36003D();
    }

    /* renamed from: j */
    public void m35697j(boolean z) {
        this.f4620a.f4625f.m36001E(z);
    }

    /* renamed from: k */
    public boolean m35696k(MenuItem menuItem) {
        return this.f4620a.f4625f.m35995H(menuItem);
    }

    /* renamed from: l */
    public void m35695l(Menu menu) {
        this.f4620a.f4625f.m35993I(menu);
    }

    /* renamed from: m */
    public void m35694m() {
        this.f4620a.f4625f.m35989K();
    }

    /* renamed from: n */
    public void m35693n(boolean z) {
        this.f4620a.f4625f.m35987L(z);
    }

    /* renamed from: o */
    public boolean m35692o(Menu menu) {
        return this.f4620a.f4625f.m35985M(menu);
    }

    /* renamed from: p */
    public void m35691p() {
        this.f4620a.f4625f.m35981O();
    }

    /* renamed from: q */
    public void m35690q() {
        this.f4620a.f4625f.m35979P();
    }

    /* renamed from: r */
    public void m35689r() {
        this.f4620a.f4625f.m35975R();
    }

    /* renamed from: s */
    public boolean m35688s() {
        return this.f4620a.f4625f.m35961Y(true);
    }

    /* renamed from: t */
    public FragmentManager m35687t() {
        return this.f4620a.f4625f;
    }

    /* renamed from: u */
    public void m35686u() {
        this.f4620a.f4625f.m35972S0();
    }

    /* renamed from: v */
    public View m35685v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4620a.f4625f.m35896u0().onCreateView(view, str, context, attributeSet);
    }
}
