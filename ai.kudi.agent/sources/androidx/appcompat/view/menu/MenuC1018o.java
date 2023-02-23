package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p201g.p227h.p231g.p232a.InterfaceMenuC7625a;
/* compiled from: MenuWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes2.dex */
public class MenuC1018o extends AbstractC0989c implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC7625a f2949d;

    public MenuC1018o(Context context, InterfaceMenuC7625a interfaceMenuC7625a) {
        super(context);
        if (interfaceMenuC7625a != null) {
            this.f2949d = interfaceMenuC7625a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m37578c(this.f2949d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f2949d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m37578c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m37577d(this.f2949d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m37576e();
        this.f2949d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f2949d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m37578c(this.f2949d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m37578c(this.f2949d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f2949d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f2949d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f2949d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f2949d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m37575f(i);
        this.f2949d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m37574g(i);
        this.f2949d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f2949d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f2949d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f2949d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2949d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2949d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m37578c(this.f2949d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m37577d(this.f2949d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m37578c(this.f2949d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m37577d(this.f2949d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m37578c(this.f2949d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m37577d(this.f2949d.addSubMenu(i, i2, i3, i4));
    }
}
