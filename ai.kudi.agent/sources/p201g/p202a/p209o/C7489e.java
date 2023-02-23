package p201g.p202a.p209o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p201g.p202a.p209o.AbstractC7485b;
/* compiled from: StandaloneActionMode.java */
/* renamed from: g.a.o.e */
/* loaded from: classes2.dex */
public class C7489e extends AbstractC7485b implements C0999g.InterfaceC1000a {

    /* renamed from: e */
    private Context f17767e;

    /* renamed from: f */
    private ActionBarContextView f17768f;

    /* renamed from: w */
    private AbstractC7485b.InterfaceC7486a f17769w;

    /* renamed from: x */
    private WeakReference<View> f17770x;

    /* renamed from: y */
    private boolean f17771y;

    /* renamed from: z */
    private C0999g f17772z;

    public C7489e(Context context, ActionBarContextView actionBarContextView, AbstractC7485b.InterfaceC7486a interfaceC7486a, boolean z) {
        this.f17767e = context;
        this.f17768f = actionBarContextView;
        this.f17769w = interfaceC7486a;
        C0999g c0999g = new C0999g(actionBarContextView.getContext());
        c0999g.m37539W(1);
        this.f17772z = c0999g;
        c0999g.mo37444V(this);
    }

    @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
    /* renamed from: a */
    public boolean mo18592a(C0999g c0999g, MenuItem menuItem) {
        return this.f17769w.mo18573d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
    /* renamed from: b */
    public void mo18591b(C0999g c0999g) {
        mo18584k();
        this.f17768f.m37431l();
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: c */
    public void mo18590c() {
        if (this.f17771y) {
            return;
        }
        this.f17771y = true;
        this.f17768f.sendAccessibilityEvent(32);
        this.f17769w.mo18576a(this);
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: d */
    public View mo18589d() {
        WeakReference<View> weakReference = this.f17770x;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: e */
    public Menu mo18588e() {
        return this.f17772z;
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: f */
    public MenuInflater mo18587f() {
        return new C7492g(this.f17768f.getContext());
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: g */
    public CharSequence mo18586g() {
        return this.f17768f.getSubtitle();
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: i */
    public CharSequence mo18585i() {
        return this.f17768f.getTitle();
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: k */
    public void mo18584k() {
        this.f17769w.mo18574c(this, this.f17772z);
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: l */
    public boolean mo18583l() {
        return this.f17768f.m37433j();
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: m */
    public void mo18582m(View view) {
        this.f17768f.setCustomView(view);
        this.f17770x = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: n */
    public void mo18581n(int i) {
        mo18580o(this.f17767e.getString(i));
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: o */
    public void mo18580o(CharSequence charSequence) {
        this.f17768f.setSubtitle(charSequence);
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: q */
    public void mo18579q(int i) {
        mo18578r(this.f17767e.getString(i));
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: r */
    public void mo18578r(CharSequence charSequence) {
        this.f17768f.setTitle(charSequence);
    }

    @Override // p201g.p202a.p209o.AbstractC7485b
    /* renamed from: s */
    public void mo18577s(boolean z) {
        super.mo18577s(z);
        this.f17768f.setTitleOptional(z);
    }
}
