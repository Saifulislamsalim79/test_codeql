package p201g.p202a.p209o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuC1018o;
import androidx.appcompat.view.menu.MenuItemC1005j;
import java.util.ArrayList;
import p201g.p202a.p209o.AbstractC7485b;
import p201g.p218e.C7534g;
import p201g.p227h.p231g.p232a.InterfaceMenuC7625a;
import p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b;
/* compiled from: SupportActionModeWrapper.java */
/* renamed from: g.a.o.f */
/* loaded from: classes2.dex */
public class C7490f extends ActionMode {

    /* renamed from: a */
    final Context f17773a;

    /* renamed from: b */
    final AbstractC7485b f17774b;

    /* compiled from: SupportActionModeWrapper.java */
    /* renamed from: g.a.o.f$a */
    /* loaded from: classes2.dex */
    public static class C7491a implements AbstractC7485b.InterfaceC7486a {

        /* renamed from: a */
        final ActionMode.Callback f17775a;

        /* renamed from: b */
        final Context f17776b;

        /* renamed from: c */
        final ArrayList<C7490f> f17777c = new ArrayList<>();

        /* renamed from: d */
        final C7534g<Menu, Menu> f17778d = new C7534g<>();

        public C7491a(Context context, ActionMode.Callback callback) {
            this.f17776b = context;
            this.f17775a = callback;
        }

        /* renamed from: f */
        private Menu m18571f(Menu menu) {
            Menu menu2 = this.f17778d.get(menu);
            if (menu2 == null) {
                MenuC1018o menuC1018o = new MenuC1018o(this.f17776b, (InterfaceMenuC7625a) menu);
                this.f17778d.put(menu, menuC1018o);
                return menuC1018o;
            }
            return menu2;
        }

        @Override // p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a
        /* renamed from: a */
        public void mo18576a(AbstractC7485b abstractC7485b) {
            this.f17775a.onDestroyActionMode(m18572e(abstractC7485b));
        }

        @Override // p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a
        /* renamed from: b */
        public boolean mo18575b(AbstractC7485b abstractC7485b, Menu menu) {
            return this.f17775a.onCreateActionMode(m18572e(abstractC7485b), m18571f(menu));
        }

        @Override // p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a
        /* renamed from: c */
        public boolean mo18574c(AbstractC7485b abstractC7485b, Menu menu) {
            return this.f17775a.onPrepareActionMode(m18572e(abstractC7485b), m18571f(menu));
        }

        @Override // p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a
        /* renamed from: d */
        public boolean mo18573d(AbstractC7485b abstractC7485b, MenuItem menuItem) {
            return this.f17775a.onActionItemClicked(m18572e(abstractC7485b), new MenuItemC1005j(this.f17776b, (InterfaceMenuItemC7626b) menuItem));
        }

        /* renamed from: e */
        public ActionMode m18572e(AbstractC7485b abstractC7485b) {
            int size = this.f17777c.size();
            for (int i = 0; i < size; i++) {
                C7490f c7490f = this.f17777c.get(i);
                if (c7490f != null && c7490f.f17774b == abstractC7485b) {
                    return c7490f;
                }
            }
            C7490f c7490f2 = new C7490f(this.f17776b, abstractC7485b);
            this.f17777c.add(c7490f2);
            return c7490f2;
        }
    }

    public C7490f(Context context, AbstractC7485b abstractC7485b) {
        this.f17773a = context;
        this.f17774b = abstractC7485b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f17774b.mo18590c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f17774b.mo18589d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC1018o(this.f17773a, (InterfaceMenuC7625a) this.f17774b.mo18588e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f17774b.mo18587f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f17774b.mo18586g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f17774b.m18602h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f17774b.mo18585i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f17774b.m18601j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f17774b.mo18584k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f17774b.mo18583l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f17774b.mo18582m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f17774b.mo18580o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f17774b.m18600p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f17774b.mo18578r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f17774b.mo18577s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f17774b.mo18581n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f17774b.mo18579q(i);
    }
}
