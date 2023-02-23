package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p201g.p218e.C7534g;
import p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b;
import p201g.p227h.p231g.p232a.InterfaceSubMenuC7627c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMenuWrapper.java */
/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes2.dex */
public abstract class AbstractC0989c {

    /* renamed from: a */
    final Context f2804a;

    /* renamed from: b */
    private C7534g<InterfaceMenuItemC7626b, MenuItem> f2805b;

    /* renamed from: c */
    private C7534g<InterfaceSubMenuC7627c, SubMenu> f2806c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0989c(Context context) {
        this.f2804a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m37578c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC7626b) {
            InterfaceMenuItemC7626b interfaceMenuItemC7626b = (InterfaceMenuItemC7626b) menuItem;
            if (this.f2805b == null) {
                this.f2805b = new C7534g<>();
            }
            MenuItem menuItem2 = this.f2805b.get(menuItem);
            if (menuItem2 == null) {
                MenuItemC1005j menuItemC1005j = new MenuItemC1005j(this.f2804a, interfaceMenuItemC7626b);
                this.f2805b.put(interfaceMenuItemC7626b, menuItemC1005j);
                return menuItemC1005j;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m37577d(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC7627c) {
            InterfaceSubMenuC7627c interfaceSubMenuC7627c = (InterfaceSubMenuC7627c) subMenu;
            if (this.f2806c == null) {
                this.f2806c = new C7534g<>();
            }
            SubMenu subMenu2 = this.f2806c.get(interfaceSubMenuC7627c);
            if (subMenu2 == null) {
                SubMenuC1024s subMenuC1024s = new SubMenuC1024s(this.f2804a, interfaceSubMenuC7627c);
                this.f2806c.put(interfaceSubMenuC7627c, subMenuC1024s);
                return subMenuC1024s;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m37576e() {
        C7534g<InterfaceMenuItemC7626b, MenuItem> c7534g = this.f2805b;
        if (c7534g != null) {
            c7534g.clear();
        }
        C7534g<InterfaceSubMenuC7627c, SubMenu> c7534g2 = this.f2806c;
        if (c7534g2 != null) {
            c7534g2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m37575f(int i) {
        if (this.f2805b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f2805b.size()) {
            if (this.f2805b.m18452k(i2).getGroupId() == i) {
                this.f2805b.mo18450m(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m37574g(int i) {
        if (this.f2805b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f2805b.size(); i2++) {
            if (this.f2805b.m18452k(i2).getItemId() == i) {
                this.f2805b.mo18450m(i2);
                return;
            }
        }
    }
}
