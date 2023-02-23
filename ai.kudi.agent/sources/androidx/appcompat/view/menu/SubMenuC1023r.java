package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0999g;
/* compiled from: SubMenuBuilder.java */
/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes2.dex */
public class SubMenuC1023r extends C0999g implements SubMenu {

    /* renamed from: B */
    private C0999g f2973B;

    /* renamed from: C */
    private C1003i f2974C;

    public SubMenuC1023r(Context context, C0999g c0999g, C1003i c1003i) {
        super(context);
        this.f2973B = c0999g;
        this.f2974C = c1003i;
    }

    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: F */
    public C0999g mo37448F() {
        return this.f2973B.mo37448F();
    }

    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: H */
    public boolean mo37447H() {
        return this.f2973B.mo37447H();
    }

    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: I */
    public boolean mo37446I() {
        return this.f2973B.mo37446I();
    }

    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: J */
    public boolean mo37445J() {
        return this.f2973B.mo37445J();
    }

    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: V */
    public void mo37444V(C0999g.InterfaceC1000a interfaceC1000a) {
        this.f2973B.mo37444V(interfaceC1000a);
    }

    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: f */
    public boolean mo37443f(C1003i c1003i) {
        return this.f2973B.mo37443f(c1003i);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f2974C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: h */
    public boolean mo37442h(C0999g c0999g, MenuItem menuItem) {
        return super.mo37442h(c0999g, menuItem) || this.f2973B.mo37442h(c0999g, menuItem);
    }

    /* renamed from: i0 */
    public Menu m37441i0() {
        return this.f2973B;
    }

    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: m */
    public boolean mo37440m(C1003i c1003i) {
        return this.f2973B.mo37440m(c1003i);
    }

    @Override // androidx.appcompat.view.menu.C0999g, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f2973B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m37536Z(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m37531c0(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.m37529d0(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f2974C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0999g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2973B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: v */
    public String mo37439v() {
        C1003i c1003i = this.f2974C;
        int itemId = c1003i != null ? c1003i.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo37439v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.m37537Y(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.m37533b0(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f2974C.setIcon(i);
        return this;
    }
}
