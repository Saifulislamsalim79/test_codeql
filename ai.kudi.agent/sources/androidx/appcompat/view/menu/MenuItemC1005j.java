package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p201g.p202a.p209o.InterfaceC7487c;
import p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b;
import p201g.p227h.p238l.AbstractC7681b;
/* compiled from: MenuItemWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes2.dex */
public class MenuItemC1005j extends AbstractC0989c implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC7626b f2925d;

    /* renamed from: e */
    private Method f2926e;

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* loaded from: classes2.dex */
    private class C1006a extends AbstractC7681b {

        /* renamed from: b */
        final ActionProvider f2927b;

        C1006a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2927b = actionProvider;
        }

        @Override // p201g.p227h.p238l.AbstractC7681b
        /* renamed from: a */
        public boolean mo17850a() {
            return this.f2927b.hasSubMenu();
        }

        @Override // p201g.p227h.p238l.AbstractC7681b
        /* renamed from: c */
        public View mo17848c() {
            return this.f2927b.onCreateActionView();
        }

        @Override // p201g.p227h.p238l.AbstractC7681b
        /* renamed from: e */
        public boolean mo17846e() {
            return this.f2927b.onPerformDefaultAction();
        }

        @Override // p201g.p227h.p238l.AbstractC7681b
        /* renamed from: f */
        public void mo17845f(SubMenu subMenu) {
            this.f2927b.onPrepareSubMenu(MenuItemC1005j.this.m37577d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* loaded from: classes2.dex */
    private class ActionProvider$VisibilityListenerC1007b extends C1006a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private AbstractC7681b.InterfaceC7683b f2929d;

        ActionProvider$VisibilityListenerC1007b(MenuItemC1005j menuItemC1005j, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p201g.p227h.p238l.AbstractC7681b
        /* renamed from: b */
        public boolean mo17849b() {
            return this.f2927b.isVisible();
        }

        @Override // p201g.p227h.p238l.AbstractC7681b
        /* renamed from: d */
        public View mo17847d(MenuItem menuItem) {
            return this.f2927b.onCreateActionView(menuItem);
        }

        @Override // p201g.p227h.p238l.AbstractC7681b
        /* renamed from: g */
        public boolean mo17844g() {
            return this.f2927b.overridesItemVisibility();
        }

        @Override // p201g.p227h.p238l.AbstractC7681b
        /* renamed from: j */
        public void mo17841j(AbstractC7681b.InterfaceC7683b interfaceC7683b) {
            this.f2929d = interfaceC7683b;
            this.f2927b.setVisibilityListener(interfaceC7683b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC7681b.InterfaceC7683b interfaceC7683b = this.f2929d;
            if (interfaceC7683b != null) {
                interfaceC7683b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* loaded from: classes2.dex */
    static class C1008c extends FrameLayout implements InterfaceC7487c {

        /* renamed from: c */
        final CollapsibleActionView f2930c;

        C1008c(View view) {
            super(view.getContext());
            this.f2930c = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m37477a() {
            return (View) this.f2930c;
        }

        @Override // p201g.p202a.p209o.InterfaceC7487c
        /* renamed from: c */
        public void mo18599c() {
            this.f2930c.onActionViewExpanded();
        }

        @Override // p201g.p202a.p209o.InterfaceC7487c
        /* renamed from: f */
        public void mo18598f() {
            this.f2930c.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* loaded from: classes2.dex */
    private class MenuItem$OnActionExpandListenerC1009d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f2931a;

        MenuItem$OnActionExpandListenerC1009d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f2931a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f2931a.onMenuItemActionCollapse(MenuItemC1005j.this.m37578c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f2931a.onMenuItemActionExpand(MenuItemC1005j.this.m37578c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* loaded from: classes2.dex */
    private class MenuItem$OnMenuItemClickListenerC1010e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f2933a;

        MenuItem$OnMenuItemClickListenerC1010e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f2933a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f2933a.onMenuItemClick(MenuItemC1005j.this.m37578c(menuItem));
        }
    }

    public MenuItemC1005j(Context context, InterfaceMenuItemC7626b interfaceMenuItemC7626b) {
        super(context);
        if (interfaceMenuItemC7626b != null) {
            this.f2925d = interfaceMenuItemC7626b;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f2925d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f2925d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC7681b mo17973b = this.f2925d.mo17973b();
        if (mo17973b instanceof C1006a) {
            return ((C1006a) mo17973b).f2927b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f2925d.getActionView();
        return actionView instanceof C1008c ? ((C1008c) actionView).m37477a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2925d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2925d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2925d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2925d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2925d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2925d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2925d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2925d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2925d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2925d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2925d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2925d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2925d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m37577d(this.f2925d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2925d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f2925d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2925d.getTooltipText();
    }

    /* renamed from: h */
    public void m37478h(boolean z) {
        try {
            if (this.f2926e == null) {
                this.f2926e = this.f2925d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f2926e.invoke(this.f2925d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2925d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2925d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f2925d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f2925d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f2925d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f2925d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC7681b c1006a;
        if (Build.VERSION.SDK_INT >= 16) {
            c1006a = new ActionProvider$VisibilityListenerC1007b(this, this.f2804a, actionProvider);
        } else {
            c1006a = new C1006a(this.f2804a, actionProvider);
        }
        InterfaceMenuItemC7626b interfaceMenuItemC7626b = this.f2925d;
        if (actionProvider == null) {
            c1006a = null;
        }
        interfaceMenuItemC7626b.mo17974a(c1006a);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1008c(view);
        }
        this.f2925d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f2925d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f2925d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f2925d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f2925d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f2925d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2925d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2925d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2925d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2925d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f2925d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2925d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC1009d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2925d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC1010e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f2925d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f2925d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f2925d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2925d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2925d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f2925d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f2925d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2925d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f2925d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f2925d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2925d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f2925d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f2925d.setActionView(i);
        View actionView = this.f2925d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f2925d.setActionView(new C1008c(actionView));
        }
        return this;
    }
}
