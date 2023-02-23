package p201g.p227h.p238l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: ActionProvider.java */
/* renamed from: g.h.l.b */
/* loaded from: classes2.dex */
public abstract class AbstractC7681b {

    /* renamed from: a */
    private InterfaceC7683b f18405a;

    /* compiled from: ActionProvider.java */
    /* renamed from: g.h.l.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC7682a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: g.h.l.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7683b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC7681b(Context context) {
    }

    /* renamed from: a */
    public boolean mo17850a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo17849b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo17848c();

    /* renamed from: d */
    public View mo17847d(MenuItem menuItem) {
        return mo17848c();
    }

    /* renamed from: e */
    public boolean mo17846e() {
        return false;
    }

    /* renamed from: f */
    public void mo17845f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo17844g() {
        return false;
    }

    /* renamed from: h */
    public void m17843h() {
        this.f18405a = null;
    }

    /* renamed from: i */
    public void m17842i(InterfaceC7682a interfaceC7682a) {
    }

    /* renamed from: j */
    public void mo17841j(InterfaceC7683b interfaceC7683b) {
        if (this.f18405a != null && interfaceC7683b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f18405a = interfaceC7683b;
    }
}
