package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
/* compiled from: NavigationMenu.java */
/* renamed from: com.google.android.material.internal.g */
/* loaded from: classes2.dex */
public class C4665g extends C0999g {
    public C4665g(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0999g, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1003i c1003i = (C1003i) mo27501a(i, i2, i3, charSequence);
        C4679i c4679i = new C4679i(m37510w(), this, c1003i);
        c1003i.m37481x(c4679i);
        return c4679i;
    }
}
