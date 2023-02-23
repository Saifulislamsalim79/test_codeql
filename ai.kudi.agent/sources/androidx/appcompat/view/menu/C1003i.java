package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.core.graphics.drawable.C1365a;
import p201g.p202a.C7459h;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b;
import p201g.p227h.p238l.AbstractC7681b;
/* compiled from: MenuItemImpl.java */
/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes2.dex */
public final class C1003i implements InterfaceMenuItemC7626b {

    /* renamed from: A */
    private View f2893A;

    /* renamed from: B */
    private AbstractC7681b f2894B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f2895C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f2897E;

    /* renamed from: a */
    private final int f2898a;

    /* renamed from: b */
    private final int f2899b;

    /* renamed from: c */
    private final int f2900c;

    /* renamed from: d */
    private final int f2901d;

    /* renamed from: e */
    private CharSequence f2902e;

    /* renamed from: f */
    private CharSequence f2903f;

    /* renamed from: g */
    private Intent f2904g;

    /* renamed from: h */
    private char f2905h;

    /* renamed from: j */
    private char f2907j;

    /* renamed from: l */
    private Drawable f2909l;

    /* renamed from: n */
    C0999g f2911n;

    /* renamed from: o */
    private SubMenuC1023r f2912o;

    /* renamed from: p */
    private Runnable f2913p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f2914q;

    /* renamed from: r */
    private CharSequence f2915r;

    /* renamed from: s */
    private CharSequence f2916s;

    /* renamed from: z */
    private int f2923z;

    /* renamed from: i */
    private int f2906i = 4096;

    /* renamed from: k */
    private int f2908k = 4096;

    /* renamed from: m */
    private int f2910m = 0;

    /* renamed from: t */
    private ColorStateList f2917t = null;

    /* renamed from: u */
    private PorterDuff.Mode f2918u = null;

    /* renamed from: v */
    private boolean f2919v = false;

    /* renamed from: w */
    private boolean f2920w = false;

    /* renamed from: x */
    private boolean f2921x = false;

    /* renamed from: y */
    private int f2922y = 16;

    /* renamed from: D */
    private boolean f2896D = false;

    /* compiled from: MenuItemImpl.java */
    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes2.dex */
    class C1004a implements AbstractC7681b.InterfaceC7683b {
        C1004a() {
        }

        @Override // p201g.p227h.p238l.AbstractC7681b.InterfaceC7683b
        public void onActionProviderVisibilityChanged(boolean z) {
            C1003i c1003i = C1003i.this;
            c1003i.f2911n.m37548L(c1003i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1003i(C0999g c0999g, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2923z = 0;
        this.f2911n = c0999g;
        this.f2898a = i2;
        this.f2899b = i;
        this.f2900c = i3;
        this.f2901d = i4;
        this.f2902e = charSequence;
        this.f2923z = i5;
    }

    /* renamed from: d */
    private static void m37501d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m37500e(Drawable drawable) {
        if (drawable != null && this.f2921x && (this.f2919v || this.f2920w)) {
            drawable = C1365a.m36184r(drawable).mutate();
            if (this.f2919v) {
                C1365a.m36187o(drawable, this.f2917t);
            }
            if (this.f2920w) {
                C1365a.m36186p(drawable, this.f2918u);
            }
            this.f2921x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m37504A() {
        return this.f2911n.mo37445J() && m37498g() != 0;
    }

    /* renamed from: B */
    public boolean m37503B() {
        return (this.f2923z & 4) == 4;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b
    /* renamed from: a */
    public InterfaceMenuItemC7626b mo17974a(AbstractC7681b abstractC7681b) {
        AbstractC7681b abstractC7681b2 = this.f2894B;
        if (abstractC7681b2 != null) {
            abstractC7681b2.m17843h();
        }
        this.f2893A = null;
        this.f2894B = abstractC7681b;
        this.f2911n.mo26725M(true);
        AbstractC7681b abstractC7681b3 = this.f2894B;
        if (abstractC7681b3 != null) {
            abstractC7681b3.mo17841j(new C1004a());
        }
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b
    /* renamed from: b */
    public AbstractC7681b mo17973b() {
        return this.f2894B;
    }

    /* renamed from: c */
    public void m37502c() {
        this.f2911n.m37549K(this);
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f2923z & 8) == 0) {
            return false;
        }
        if (this.f2893A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2895C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2911n.mo37443f(this);
        }
        return false;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public boolean expandActionView() {
        if (m37495j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f2895C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f2911n.mo37440m(this);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public int m37499f() {
        return this.f2901d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public char m37498g() {
        return this.f2911n.mo37446I() ? this.f2907j : this.f2905h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public View getActionView() {
        View view = this.f2893A;
        if (view != null) {
            return view;
        }
        AbstractC7681b abstractC7681b = this.f2894B;
        if (abstractC7681b != null) {
            View mo17847d = abstractC7681b.mo17847d(this);
            this.f2893A = mo17847d;
            return mo17847d;
        }
        return null;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2908k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2907j;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2915r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2899b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f2909l;
        if (drawable != null) {
            return m37500e(drawable);
        }
        if (this.f2910m != 0) {
            Drawable m18690d = C7462a.m18690d(this.f2911n.m37510w(), this.f2910m);
            this.f2910m = 0;
            this.f2909l = m18690d;
            return m37500e(m18690d);
        }
        return null;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2917t;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2918u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2904g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f2898a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2897E;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2906i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2905h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2900c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f2912o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2902e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2903f;
        if (charSequence == null) {
            charSequence = this.f2902e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2916s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m37497h() {
        char m37498g = m37498g();
        if (m37498g == 0) {
            return "";
        }
        Resources resources = this.f2911n.m37510w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f2911n.m37510w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C7459h.abc_prepend_shortcut_label));
        }
        int i = this.f2911n.mo37446I() ? this.f2908k : this.f2906i;
        m37501d(sb, i, 65536, resources.getString(C7459h.abc_menu_meta_shortcut_label));
        m37501d(sb, i, 4096, resources.getString(C7459h.abc_menu_ctrl_shortcut_label));
        m37501d(sb, i, 2, resources.getString(C7459h.abc_menu_alt_shortcut_label));
        m37501d(sb, i, 1, resources.getString(C7459h.abc_menu_shift_shortcut_label));
        m37501d(sb, i, 4, resources.getString(C7459h.abc_menu_sym_shortcut_label));
        m37501d(sb, i, 8, resources.getString(C7459h.abc_menu_function_shortcut_label));
        if (m37498g == '\b') {
            sb.append(resources.getString(C7459h.abc_menu_delete_shortcut_label));
        } else if (m37498g == '\n') {
            sb.append(resources.getString(C7459h.abc_menu_enter_shortcut_label));
        } else if (m37498g != ' ') {
            sb.append(m37498g);
        } else {
            sb.append(resources.getString(C7459h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2912o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence m37496i(InterfaceC1016n.InterfaceC1017a interfaceC1017a) {
        if (interfaceC1017a != null && interfaceC1017a.mo26854d()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2896D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2922y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2922y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2922y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC7681b abstractC7681b = this.f2894B;
        return (abstractC7681b == null || !abstractC7681b.mo17844g()) ? (this.f2922y & 8) == 0 : (this.f2922y & 8) == 0 && this.f2894B.mo17849b();
    }

    /* renamed from: j */
    public boolean m37495j() {
        AbstractC7681b abstractC7681b;
        if ((this.f2923z & 8) != 0) {
            if (this.f2893A == null && (abstractC7681b = this.f2894B) != null) {
                this.f2893A = abstractC7681b.mo17847d(this);
            }
            return this.f2893A != null;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m37494k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2914q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C0999g c0999g = this.f2911n;
            if (c0999g.mo37442h(c0999g, this)) {
                return true;
            }
            Runnable runnable = this.f2913p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f2904g != null) {
                try {
                    this.f2911n.m37510w().startActivity(this.f2904g);
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            AbstractC7681b abstractC7681b = this.f2894B;
            return abstractC7681b != null && abstractC7681b.mo17846e();
        }
        return true;
    }

    /* renamed from: l */
    public boolean m37493l() {
        return (this.f2922y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m37492m() {
        return (this.f2922y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m37491n() {
        return (this.f2923z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m37490o() {
        return (this.f2923z & 2) == 2;
    }

    /* renamed from: p */
    public InterfaceMenuItemC7626b m37489p(int i) {
        Context m37510w = this.f2911n.m37510w();
        m37488q(LayoutInflater.from(m37510w).inflate(i, (ViewGroup) new LinearLayout(m37510w), false));
        return this;
    }

    /* renamed from: q */
    public InterfaceMenuItemC7626b m37488q(View view) {
        int i;
        this.f2893A = view;
        this.f2894B = null;
        if (view != null && view.getId() == -1 && (i = this.f2898a) > 0) {
            view.setId(i);
        }
        this.f2911n.m37549K(this);
        return this;
    }

    /* renamed from: r */
    public void m37487r(boolean z) {
        this.f2896D = z;
        this.f2911n.mo26725M(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m37486s(boolean z) {
        int i = this.f2922y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f2922y = i2;
        if (i != i2) {
            this.f2911n.mo26725M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        m37489p(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f2907j == c) {
            return this;
        }
        this.f2907j = Character.toLowerCase(c);
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f2922y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f2922y = i2;
        if (i != i2) {
            this.f2911n.mo26725M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f2922y & 4) != 0) {
            this.f2911n.m37538X(this);
        } else {
            m37486s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f2922y |= 16;
        } else {
            this.f2922y &= -17;
        }
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2910m = 0;
        this.f2909l = drawable;
        this.f2921x = true;
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2917t = colorStateList;
        this.f2919v = true;
        this.f2921x = true;
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2918u = mode;
        this.f2920w = true;
        this.f2921x = true;
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2904g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f2905h == c) {
            return this;
        }
        this.f2905h = c;
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2895C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2914q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f2905h = c;
        this.f2907j = Character.toLowerCase(c2);
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2923z = i;
        this.f2911n.m37549K(this);
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        m37482w(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2902e = charSequence;
        this.f2911n.mo26725M(false);
        SubMenuC1023r subMenuC1023r = this.f2912o;
        if (subMenuC1023r != null) {
            subMenuC1023r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2903f = charSequence;
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m37480y(z)) {
            this.f2911n.m37548L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m37485t(boolean z) {
        this.f2922y = (z ? 4 : 0) | (this.f2922y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f2902e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m37484u(boolean z) {
        if (z) {
            this.f2922y |= 32;
        } else {
            this.f2922y &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m37483v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2897E = contextMenuInfo;
    }

    /* renamed from: w */
    public InterfaceMenuItemC7626b m37482w(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void m37481x(SubMenuC1023r subMenuC1023r) {
        this.f2912o = subMenuC1023r;
        subMenuC1023r.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m37480y(boolean z) {
        int i = this.f2922y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f2922y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean m37479z() {
        return this.f2911n.m37553C();
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m37488q(view);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public InterfaceMenuItemC7626b setContentDescription(CharSequence charSequence) {
        this.f2915r = charSequence;
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public InterfaceMenuItemC7626b setTooltipText(CharSequence charSequence) {
        this.f2916s = charSequence;
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2907j == c && this.f2908k == i) {
            return this;
        }
        this.f2907j = Character.toLowerCase(c);
        this.f2908k = KeyEvent.normalizeMetaState(i);
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f2905h == c && this.f2906i == i) {
            return this;
        }
        this.f2905h = c;
        this.f2906i = KeyEvent.normalizeMetaState(i);
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // p201g.p227h.p231g.p232a.InterfaceMenuItemC7626b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2905h = c;
        this.f2906i = KeyEvent.normalizeMetaState(i);
        this.f2907j = Character.toLowerCase(c2);
        this.f2908k = KeyEvent.normalizeMetaState(i2);
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f2909l = null;
        this.f2910m = i;
        this.f2921x = true;
        this.f2911n.mo26725M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f2911n.m37510w().getString(i));
        return this;
    }
}
