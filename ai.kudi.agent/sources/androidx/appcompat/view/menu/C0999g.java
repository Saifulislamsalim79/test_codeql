package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C1335a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p201g.p227h.p231g.p232a.InterfaceMenuC7625a;
import p201g.p227h.p238l.AbstractC7681b;
import p201g.p227h.p238l.C7773y;
/* compiled from: MenuBuilder.java */
/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes2.dex */
public class C0999g implements InterfaceMenuC7625a {

    /* renamed from: A */
    private static final int[] f2862A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f2863a;

    /* renamed from: b */
    private final Resources f2864b;

    /* renamed from: c */
    private boolean f2865c;

    /* renamed from: d */
    private boolean f2866d;

    /* renamed from: e */
    private InterfaceC1000a f2867e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f2875m;

    /* renamed from: n */
    CharSequence f2876n;

    /* renamed from: o */
    Drawable f2877o;

    /* renamed from: p */
    View f2878p;

    /* renamed from: x */
    private C1003i f2886x;

    /* renamed from: z */
    private boolean f2888z;

    /* renamed from: l */
    private int f2874l = 0;

    /* renamed from: q */
    private boolean f2879q = false;

    /* renamed from: r */
    private boolean f2880r = false;

    /* renamed from: s */
    private boolean f2881s = false;

    /* renamed from: t */
    private boolean f2882t = false;

    /* renamed from: u */
    private boolean f2883u = false;

    /* renamed from: v */
    private ArrayList<C1003i> f2884v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC1014m>> f2885w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f2887y = false;

    /* renamed from: f */
    private ArrayList<C1003i> f2868f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C1003i> f2869g = new ArrayList<>();

    /* renamed from: h */
    private boolean f2870h = true;

    /* renamed from: i */
    private ArrayList<C1003i> f2871i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1003i> f2872j = new ArrayList<>();

    /* renamed from: k */
    private boolean f2873k = true;

    /* compiled from: MenuBuilder.java */
    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1000a {
        /* renamed from: a */
        boolean mo18592a(C0999g c0999g, MenuItem menuItem);

        /* renamed from: b */
        void mo18591b(C0999g c0999g);
    }

    /* compiled from: MenuBuilder.java */
    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1001b {
        /* renamed from: a */
        boolean mo37396a(C1003i c1003i);
    }

    public C0999g(Context context) {
        this.f2863a = context;
        this.f2864b = context.getResources();
        m37526f0(true);
    }

    /* renamed from: D */
    private static int m37552D(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f2862A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m37545P(int i, boolean z) {
        if (i < 0 || i >= this.f2868f.size()) {
            return;
        }
        this.f2868f.remove(i);
        if (z) {
            mo26725M(true);
        }
    }

    /* renamed from: a0 */
    private void m37535a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m37551E = m37551E();
        if (view != null) {
            this.f2878p = view;
            this.f2876n = null;
            this.f2877o = null;
        } else {
            if (i > 0) {
                this.f2876n = m37551E.getText(i);
            } else if (charSequence != null) {
                this.f2876n = charSequence;
            }
            if (i2 > 0) {
                this.f2877o = C1335a.m36322f(m37510w(), i2);
            } else if (drawable != null) {
                this.f2877o = drawable;
            }
            this.f2878p = null;
        }
        mo26725M(false);
    }

    /* renamed from: f0 */
    private void m37526f0(boolean z) {
        boolean z2 = true;
        this.f2866d = (z && this.f2864b.getConfiguration().keyboard != 1 && C7773y.m17436e(ViewConfiguration.get(this.f2863a), this.f2863a)) ? false : false;
    }

    /* renamed from: g */
    private C1003i m37525g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C1003i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m37522i(boolean z) {
        if (this.f2885w.isEmpty()) {
            return;
        }
        m37523h0();
        Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1014m> next = it.next();
            InterfaceC1014m interfaceC1014m = next.get();
            if (interfaceC1014m == null) {
                this.f2885w.remove(next);
            } else {
                interfaceC1014m.mo26758i(z);
            }
        }
        m37524g0();
    }

    /* renamed from: j */
    private void m37521j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f2885w.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1014m> next = it.next();
            InterfaceC1014m interfaceC1014m = next.get();
            if (interfaceC1014m == null) {
                this.f2885w.remove(next);
            } else {
                int mo26759h = interfaceC1014m.mo26759h();
                if (mo26759h > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(mo26759h)) != null) {
                    interfaceC1014m.mo26752o(parcelable);
                }
            }
        }
    }

    /* renamed from: k */
    private void m37520k(Bundle bundle) {
        Parcelable mo26749r;
        if (this.f2885w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1014m> next = it.next();
            InterfaceC1014m interfaceC1014m = next.get();
            if (interfaceC1014m == null) {
                this.f2885w.remove(next);
            } else {
                int mo26759h = interfaceC1014m.mo26759h();
                if (mo26759h > 0 && (mo26749r = interfaceC1014m.mo26749r()) != null) {
                    sparseArray.put(mo26759h, mo26749r);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: l */
    private boolean m37519l(SubMenuC1023r subMenuC1023r, InterfaceC1014m interfaceC1014m) {
        if (this.f2885w.isEmpty()) {
            return false;
        }
        boolean mo26750q = interfaceC1014m != null ? interfaceC1014m.mo26750q(subMenuC1023r) : false;
        Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1014m> next = it.next();
            InterfaceC1014m interfaceC1014m2 = next.get();
            if (interfaceC1014m2 == null) {
                this.f2885w.remove(next);
            } else if (!mo26750q) {
                mo26750q = interfaceC1014m2.mo26750q(subMenuC1023r);
            }
        }
        return mo26750q;
    }

    /* renamed from: p */
    private static int m37516p(ArrayList<C1003i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m37499f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View m37555A() {
        return this.f2878p;
    }

    /* renamed from: B */
    public ArrayList<C1003i> m37554B() {
        m37512t();
        return this.f2872j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m37553C() {
        return this.f2882t;
    }

    /* renamed from: E */
    Resources m37551E() {
        return this.f2864b;
    }

    /* renamed from: F */
    public C0999g mo37448F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C1003i> m37550G() {
        if (this.f2870h) {
            this.f2869g.clear();
            int size = this.f2868f.size();
            for (int i = 0; i < size; i++) {
                C1003i c1003i = this.f2868f.get(i);
                if (c1003i.isVisible()) {
                    this.f2869g.add(c1003i);
                }
            }
            this.f2870h = false;
            this.f2873k = true;
            return this.f2869g;
        }
        return this.f2869g;
    }

    /* renamed from: H */
    public boolean mo37447H() {
        return this.f2887y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo37446I() {
        return this.f2865c;
    }

    /* renamed from: J */
    public boolean mo37445J() {
        return this.f2866d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m37549K(C1003i c1003i) {
        this.f2873k = true;
        mo26725M(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m37548L(C1003i c1003i) {
        this.f2870h = true;
        mo26725M(true);
    }

    /* renamed from: M */
    public void mo26725M(boolean z) {
        if (!this.f2879q) {
            if (z) {
                this.f2870h = true;
                this.f2873k = true;
            }
            m37522i(z);
            return;
        }
        this.f2880r = true;
        if (z) {
            this.f2881s = true;
        }
    }

    /* renamed from: N */
    public boolean m37547N(MenuItem menuItem, int i) {
        return m37546O(menuItem, null, i);
    }

    /* renamed from: O */
    public boolean m37546O(MenuItem menuItem, InterfaceC1014m interfaceC1014m, int i) {
        C1003i c1003i = (C1003i) menuItem;
        if (c1003i == null || !c1003i.isEnabled()) {
            return false;
        }
        boolean m37494k = c1003i.m37494k();
        AbstractC7681b mo17973b = c1003i.mo17973b();
        boolean z = mo17973b != null && mo17973b.mo17850a();
        if (c1003i.m37495j()) {
            m37494k |= c1003i.expandActionView();
            if (m37494k) {
                m37528e(true);
            }
        } else if (c1003i.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m37528e(false);
            }
            if (!c1003i.hasSubMenu()) {
                c1003i.m37481x(new SubMenuC1023r(m37510w(), this, c1003i));
            }
            SubMenuC1023r subMenuC1023r = (SubMenuC1023r) c1003i.getSubMenu();
            if (z) {
                mo17973b.mo17845f(subMenuC1023r);
            }
            m37494k |= m37519l(subMenuC1023r, interfaceC1014m);
            if (!m37494k) {
                m37528e(true);
            }
        } else if ((i & 1) == 0) {
            m37528e(true);
        }
        return m37494k;
    }

    /* renamed from: Q */
    public void m37544Q(InterfaceC1014m interfaceC1014m) {
        Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1014m> next = it.next();
            InterfaceC1014m interfaceC1014m2 = next.get();
            if (interfaceC1014m2 == null || interfaceC1014m2 == interfaceC1014m) {
                this.f2885w.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void m37543R(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo37439v());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1023r) item.getSubMenu()).m37543R(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: S */
    public void m37542S(Bundle bundle) {
        m37521j(bundle);
    }

    /* renamed from: T */
    public void m37541T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1023r) item.getSubMenu()).m37541T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo37439v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void m37540U(Bundle bundle) {
        m37520k(bundle);
    }

    /* renamed from: V */
    public void mo37444V(InterfaceC1000a interfaceC1000a) {
        this.f2867e = interfaceC1000a;
    }

    /* renamed from: W */
    public C0999g m37539W(int i) {
        this.f2874l = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m37538X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2868f.size();
        m37523h0();
        for (int i = 0; i < size; i++) {
            C1003i c1003i = this.f2868f.get(i);
            if (c1003i.getGroupId() == groupId && c1003i.m37492m() && c1003i.isCheckable()) {
                c1003i.m37486s(c1003i == menuItem);
            }
        }
        m37524g0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public C0999g m37537Y(int i) {
        m37535a0(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C0999g m37536Z(Drawable drawable) {
        m37535a0(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo27501a(int i, int i2, int i3, CharSequence charSequence) {
        int m37552D = m37552D(i3);
        C1003i m37525g = m37525g(i, i2, i3, m37552D, charSequence, this.f2874l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2875m;
        if (contextMenuInfo != null) {
            m37525g.m37483v(contextMenuInfo);
        }
        ArrayList<C1003i> arrayList = this.f2868f;
        arrayList.add(m37516p(arrayList, m37552D), m37525g);
        mo26725M(true);
        return m37525g;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo27501a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2863a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m37534b(InterfaceC1014m interfaceC1014m) {
        m37532c(interfaceC1014m, this.f2863a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b0 */
    public C0999g m37533b0(int i) {
        m37535a0(i, null, 0, null, null);
        return this;
    }

    /* renamed from: c */
    public void m37532c(InterfaceC1014m interfaceC1014m, Context context) {
        this.f2885w.add(new WeakReference<>(interfaceC1014m));
        interfaceC1014m.mo26753n(context, this);
        this.f2873k = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c0 */
    public C0999g m37531c0(CharSequence charSequence) {
        m37535a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C1003i c1003i = this.f2886x;
        if (c1003i != null) {
            mo37443f(c1003i);
        }
        this.f2868f.clear();
        mo26725M(true);
    }

    public void clearHeader() {
        this.f2877o = null;
        this.f2876n = null;
        this.f2878p = null;
        mo26725M(false);
    }

    @Override // android.view.Menu
    public void close() {
        m37528e(true);
    }

    /* renamed from: d */
    public void m37530d() {
        InterfaceC1000a interfaceC1000a = this.f2867e;
        if (interfaceC1000a != null) {
            interfaceC1000a.mo18591b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0999g m37529d0(View view) {
        m37535a0(0, null, 0, null, view);
        return this;
    }

    /* renamed from: e */
    public final void m37528e(boolean z) {
        if (this.f2883u) {
            return;
        }
        this.f2883u = true;
        Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1014m> next = it.next();
            InterfaceC1014m interfaceC1014m = next.get();
            if (interfaceC1014m == null) {
                this.f2885w.remove(next);
            } else {
                interfaceC1014m.mo26766a(this, z);
            }
        }
        this.f2883u = false;
    }

    /* renamed from: e0 */
    public void m37527e0(boolean z) {
        this.f2888z = z;
    }

    /* renamed from: f */
    public boolean mo37443f(C1003i c1003i) {
        boolean z = false;
        if (!this.f2885w.isEmpty() && this.f2886x == c1003i) {
            m37523h0();
            Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC1014m> next = it.next();
                InterfaceC1014m interfaceC1014m = next.get();
                if (interfaceC1014m == null) {
                    this.f2885w.remove(next);
                } else {
                    z = interfaceC1014m.mo26756k(this, c1003i);
                    if (z) {
                        break;
                    }
                }
            }
            m37524g0();
            if (z) {
                this.f2886x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1003i c1003i = this.f2868f.get(i2);
            if (c1003i.getItemId() == i) {
                return c1003i;
            }
            if (c1003i.hasSubMenu() && (findItem = c1003i.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void m37524g0() {
        this.f2879q = false;
        if (this.f2880r) {
            this.f2880r = false;
            mo26725M(this.f2881s);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f2868f.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo37442h(C0999g c0999g, MenuItem menuItem) {
        InterfaceC1000a interfaceC1000a = this.f2867e;
        return interfaceC1000a != null && interfaceC1000a.mo18592a(c0999g, menuItem);
    }

    /* renamed from: h0 */
    public void m37523h0() {
        if (this.f2879q) {
            return;
        }
        this.f2879q = true;
        this.f2880r = false;
        this.f2881s = false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f2888z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2868f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m37514r(i, keyEvent) != null;
    }

    /* renamed from: m */
    public boolean mo37440m(C1003i c1003i) {
        boolean z = false;
        if (this.f2885w.isEmpty()) {
            return false;
        }
        m37523h0();
        Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1014m> next = it.next();
            InterfaceC1014m interfaceC1014m = next.get();
            if (interfaceC1014m == null) {
                this.f2885w.remove(next);
            } else {
                z = interfaceC1014m.mo26755l(this, c1003i);
                if (z) {
                    break;
                }
            }
        }
        m37524g0();
        if (z) {
            this.f2886x = c1003i;
        }
        return z;
    }

    /* renamed from: n */
    public int m37518n(int i) {
        return m37517o(i, 0);
    }

    /* renamed from: o */
    public int m37517o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f2868f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m37547N(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1003i m37514r = m37514r(i, keyEvent);
        boolean m37547N = m37514r != null ? m37547N(m37514r, i2) : false;
        if ((i2 & 2) != 0) {
            m37528e(true);
        }
        return m37547N;
    }

    /* renamed from: q */
    public int m37515q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2868f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    C1003i m37514r(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<C1003i> arrayList = this.f2884v;
        arrayList.clear();
        m37513s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo37446I = mo37446I();
        for (int i2 = 0; i2 < size; i2++) {
            C1003i c1003i = arrayList.get(i2);
            if (mo37446I) {
                numericShortcut = c1003i.getAlphabeticShortcut();
            } else {
                numericShortcut = c1003i.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (mo37446I && numericShortcut == '\b' && i == 67))) {
                return c1003i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m37518n = m37518n(i);
        if (m37518n >= 0) {
            int size = this.f2868f.size() - m37518n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f2868f.get(m37518n).getGroupId() != i) {
                    break;
                }
                m37545P(m37518n, false);
                i2 = i3;
            }
            mo26725M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m37545P(m37515q(i), true);
    }

    /* renamed from: s */
    void m37513s(List<C1003i> list, int i, KeyEvent keyEvent) {
        boolean mo37446I = mo37446I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2868f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1003i c1003i = this.f2868f.get(i2);
                if (c1003i.hasSubMenu()) {
                    ((C0999g) c1003i.getSubMenu()).m37513s(list, i, keyEvent);
                }
                char alphabeticShortcut = mo37446I ? c1003i.getAlphabeticShortcut() : c1003i.getNumericShortcut();
                if (((modifiers & 69647) == ((mo37446I ? c1003i.getAlphabeticModifiers() : c1003i.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo37446I && alphabeticShortcut == '\b' && i == 67)) && c1003i.isEnabled()) {
                        list.add(c1003i);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2868f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1003i c1003i = this.f2868f.get(i2);
            if (c1003i.getGroupId() == i) {
                c1003i.m37485t(z2);
                c1003i.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f2887y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2868f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1003i c1003i = this.f2868f.get(i2);
            if (c1003i.getGroupId() == i) {
                c1003i.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f2868f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1003i c1003i = this.f2868f.get(i2);
            if (c1003i.getGroupId() == i && c1003i.m37480y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo26725M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2865c = z;
        mo26725M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2868f.size();
    }

    /* renamed from: t */
    public void m37512t() {
        ArrayList<C1003i> m37550G = m37550G();
        if (this.f2873k) {
            Iterator<WeakReference<InterfaceC1014m>> it = this.f2885w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC1014m> next = it.next();
                InterfaceC1014m interfaceC1014m = next.get();
                if (interfaceC1014m == null) {
                    this.f2885w.remove(next);
                } else {
                    z |= interfaceC1014m.mo26757j();
                }
            }
            if (z) {
                this.f2871i.clear();
                this.f2872j.clear();
                int size = m37550G.size();
                for (int i = 0; i < size; i++) {
                    C1003i c1003i = m37550G.get(i);
                    if (c1003i.m37493l()) {
                        this.f2871i.add(c1003i);
                    } else {
                        this.f2872j.add(c1003i);
                    }
                }
            } else {
                this.f2871i.clear();
                this.f2872j.clear();
                this.f2872j.addAll(m37550G());
            }
            this.f2873k = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C1003i> m37511u() {
        m37512t();
        return this.f2871i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public String mo37439v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context m37510w() {
        return this.f2863a;
    }

    /* renamed from: x */
    public C1003i m37509x() {
        return this.f2886x;
    }

    /* renamed from: y */
    public Drawable m37508y() {
        return this.f2877o;
    }

    /* renamed from: z */
    public CharSequence m37507z() {
        return this.f2876n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo27501a(0, 0, 0, this.f2864b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2864b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo27501a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1003i c1003i = (C1003i) mo27501a(i, i2, i3, charSequence);
        SubMenuC1023r subMenuC1023r = new SubMenuC1023r(this.f2863a, this, c1003i);
        c1003i.m37481x(subMenuC1023r);
        return subMenuC1023r;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo27501a(i, i2, i3, this.f2864b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2864b.getString(i4));
    }
}
