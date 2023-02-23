package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
/* compiled from: BottomNavigationMenu.java */
/* renamed from: com.google.android.material.bottomnavigation.b */
/* loaded from: classes2.dex */
public final class C4532b extends C0999g {
    public C4532b(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.C0999g
    /* renamed from: a */
    public MenuItem mo27501a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            m37523h0();
            MenuItem mo27501a = super.mo27501a(i, i2, i3, charSequence);
            if (mo27501a instanceof C1003i) {
                ((C1003i) mo27501a).m37485t(true);
            }
            m37524g0();
            return mo27501a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.C0999g, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
