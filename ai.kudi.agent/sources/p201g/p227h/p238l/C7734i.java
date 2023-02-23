package p201g.p227h.p238l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b;
/* compiled from: MenuItemCompat.java */
/* renamed from: g.h.l.i */
/* loaded from: classes2.dex */
public final class C7734i {
    /* renamed from: a */
    public static MenuItem m17627a(MenuItem menuItem, AbstractC7681b abstractC7681b) {
        if (menuItem instanceof InterfaceMenuItemC7626b) {
            return ((InterfaceMenuItemC7626b) menuItem).mo17974a(abstractC7681b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m17626b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC7626b) {
            ((InterfaceMenuItemC7626b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: c */
    public static void m17625c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC7626b) {
            ((InterfaceMenuItemC7626b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m17624d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC7626b) {
            ((InterfaceMenuItemC7626b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m17623e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC7626b) {
            ((InterfaceMenuItemC7626b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m17622f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC7626b) {
            ((InterfaceMenuItemC7626b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: g */
    public static void m17621g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC7626b) {
            ((InterfaceMenuItemC7626b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
