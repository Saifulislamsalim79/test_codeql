package p201g.p202a.p209o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* compiled from: ActionMode.java */
/* renamed from: g.a.o.b */
/* loaded from: classes2.dex */
public abstract class AbstractC7485b {

    /* renamed from: c */
    private Object f17760c;

    /* renamed from: d */
    private boolean f17761d;

    /* compiled from: ActionMode.java */
    /* renamed from: g.a.o.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC7486a {
        /* renamed from: a */
        void mo18576a(AbstractC7485b abstractC7485b);

        /* renamed from: b */
        boolean mo18575b(AbstractC7485b abstractC7485b, Menu menu);

        /* renamed from: c */
        boolean mo18574c(AbstractC7485b abstractC7485b, Menu menu);

        /* renamed from: d */
        boolean mo18573d(AbstractC7485b abstractC7485b, MenuItem menuItem);
    }

    /* renamed from: c */
    public abstract void mo18590c();

    /* renamed from: d */
    public abstract View mo18589d();

    /* renamed from: e */
    public abstract Menu mo18588e();

    /* renamed from: f */
    public abstract MenuInflater mo18587f();

    /* renamed from: g */
    public abstract CharSequence mo18586g();

    /* renamed from: h */
    public Object m18602h() {
        return this.f17760c;
    }

    /* renamed from: i */
    public abstract CharSequence mo18585i();

    /* renamed from: j */
    public boolean m18601j() {
        return this.f17761d;
    }

    /* renamed from: k */
    public abstract void mo18584k();

    /* renamed from: l */
    public abstract boolean mo18583l();

    /* renamed from: m */
    public abstract void mo18582m(View view);

    /* renamed from: n */
    public abstract void mo18581n(int i);

    /* renamed from: o */
    public abstract void mo18580o(CharSequence charSequence);

    /* renamed from: p */
    public void m18600p(Object obj) {
        this.f17760c = obj;
    }

    /* renamed from: q */
    public abstract void mo18579q(int i);

    /* renamed from: r */
    public abstract void mo18578r(CharSequence charSequence);

    /* renamed from: s */
    public void mo18577s(boolean z) {
        this.f17761d = z;
    }
}
