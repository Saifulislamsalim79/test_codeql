package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b;
import p201g.p227h.p238l.AbstractC7681b;
/* compiled from: ActionMenuItem.java */
/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes2.dex */
public class C0987a implements InterfaceMenuItemC7626b {

    /* renamed from: a */
    private final int f2776a;

    /* renamed from: b */
    private final int f2777b;

    /* renamed from: c */
    private final int f2778c;

    /* renamed from: d */
    private CharSequence f2779d;

    /* renamed from: e */
    private CharSequence f2780e;

    /* renamed from: f */
    private Intent f2781f;

    /* renamed from: g */
    private char f2782g;

    /* renamed from: i */
    private char f2784i;

    /* renamed from: k */
    private Drawable f2786k;

    /* renamed from: l */
    private Context f2787l;

    /* renamed from: m */
    private CharSequence f2788m;

    /* renamed from: n */
    private CharSequence f2789n;

    /* renamed from: h */
    private int f2783h = 4096;

    /* renamed from: j */
    private int f2785j = 4096;

    /* renamed from: o */
    private ColorStateList f2790o = null;

    /* renamed from: p */
    private PorterDuff.Mode f2791p = null;

    /* renamed from: q */
    private boolean f2792q = false;

    /* renamed from: r */
    private boolean f2793r = false;

    /* renamed from: s */
    private int f2794s = 16;

    public C0987a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2787l = context;
        this.f2776a = i2;
        this.f2777b = i;
        this.f2778c = i4;
        this.f2779d = charSequence;
    }

    /* renamed from: c */
    private void m37586c() {
        if (this.f2786k != null) {
            if (this.f2792q || this.f2793r) {
                Drawable m36184r = C1365a.m36184r(this.f2786k);
                this.f2786k = m36184r;
                Drawable mutate = m36184r.mutate();
                this.f2786k = mutate;
                if (this.f2792q) {
                    C1365a.m36187o(mutate, this.f2790o);
                }
                if (this.f2793r) {
                    C1365a.m36186p(this.f2786k, this.f2791p);
                }
            }
        }
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b
    /* renamed from: a */
    public InterfaceMenuItemC7626b mo17974a(AbstractC7681b abstractC7681b) {
        throw new UnsupportedOperationException();
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b
    /* renamed from: b */
    public AbstractC7681b mo17973b() {
        return null;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public InterfaceMenuItemC7626b m37585d(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public InterfaceMenuItemC7626b m37584e(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public InterfaceMenuItemC7626b m37583f(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2785j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2784i;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2788m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2777b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2786k;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2790o;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2791p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2781f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2776a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2783h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2782g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2778c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2779d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2780e;
        return charSequence != null ? charSequence : this.f2779d;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2789n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2794s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2794s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2794s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2794s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        m37585d(i);
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f2784i = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f2794s = (z ? 1 : 0) | (this.f2794s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f2794s = (z ? 2 : 0) | (this.f2794s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f2794s = (z ? 16 : 0) | (this.f2794s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2786k = drawable;
        m37586c();
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2790o = colorStateList;
        this.f2792q = true;
        m37586c();
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2791p = mode;
        this.f2793r = true;
        m37586c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2781f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f2782g = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f2782g = c;
        this.f2784i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        m37583f(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2779d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2780e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f2794s = (this.f2794s & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m37584e(view);
        throw null;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2784i = Character.toLowerCase(c);
        this.f2785j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public InterfaceMenuItemC7626b setContentDescription(CharSequence charSequence) {
        this.f2788m = charSequence;
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f2782g = c;
        this.f2783h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f2779d = this.f2787l.getResources().getString(i);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public InterfaceMenuItemC7626b setTooltipText(CharSequence charSequence) {
        this.f2789n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f2786k = C1335a.m36322f(this.f2787l, i);
        m37586c();
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2782g = c;
        this.f2783h = KeyEvent.normalizeMetaState(i);
        this.f2784i = Character.toLowerCase(c2);
        this.f2785j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
