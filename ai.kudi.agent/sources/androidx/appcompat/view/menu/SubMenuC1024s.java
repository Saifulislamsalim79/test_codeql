package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p201g.p227h.p231g.p232a.InterfaceSubMenuC7627c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubMenuWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes2.dex */
public class SubMenuC1024s extends MenuC1018o implements SubMenu {

    /* renamed from: e */
    private final InterfaceSubMenuC7627c f2975e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC1024s(Context context, InterfaceSubMenuC7627c interfaceSubMenuC7627c) {
        super(context, interfaceSubMenuC7627c);
        this.f2975e = interfaceSubMenuC7627c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f2975e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m37578c(this.f2975e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f2975e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f2975e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f2975e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f2975e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f2975e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f2975e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f2975e.setIcon(drawable);
        return this;
    }
}
