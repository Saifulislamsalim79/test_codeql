package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.InterfaceC1016n;
import com.google.android.material.internal.C4692o;
import java.util.HashSet;
import p201g.p202a.C7452a;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p237k.C7674g;
import p201g.p227h.p237k.InterfaceC7672e;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p249m.p250a.p251a.C7805b;
import p201g.p266v.C8116b;
import p201g.p266v.C8169o;
import p201g.p266v.C8173q;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.p329n.C9289a;
/* compiled from: BottomNavigationMenuView.java */
/* renamed from: com.google.android.material.bottomnavigation.c */
/* loaded from: classes2.dex */
public class C4533c extends ViewGroup implements InterfaceC1016n {

    /* renamed from: S */
    private static final int[] f11122S = {16842912};

    /* renamed from: T */
    private static final int[] f11123T = {-16842910};

    /* renamed from: A */
    private final SparseArray<View.OnTouchListener> f11124A;

    /* renamed from: B */
    private boolean f11125B;

    /* renamed from: C */
    private int f11126C;

    /* renamed from: D */
    private C4530a[] f11127D;

    /* renamed from: E */
    private int f11128E;

    /* renamed from: F */
    private int f11129F;

    /* renamed from: G */
    private ColorStateList f11130G;

    /* renamed from: H */
    private int f11131H;

    /* renamed from: I */
    private ColorStateList f11132I;

    /* renamed from: J */
    private final ColorStateList f11133J;

    /* renamed from: K */
    private int f11134K;

    /* renamed from: L */
    private int f11135L;

    /* renamed from: M */
    private Drawable f11136M;

    /* renamed from: N */
    private int f11137N;

    /* renamed from: O */
    private int[] f11138O;

    /* renamed from: P */
    private SparseArray<C9289a> f11139P;

    /* renamed from: Q */
    private C4535d f11140Q;

    /* renamed from: R */
    private C0999g f11141R;

    /* renamed from: c */
    private final C8173q f11142c;

    /* renamed from: d */
    private final int f11143d;

    /* renamed from: e */
    private final int f11144e;

    /* renamed from: f */
    private final int f11145f;

    /* renamed from: w */
    private final int f11146w;

    /* renamed from: x */
    private final int f11147x;

    /* renamed from: y */
    private final View.OnClickListener f11148y;

    /* renamed from: z */
    private final InterfaceC7672e<C4530a> f11149z;

    /* compiled from: BottomNavigationMenuView.java */
    /* renamed from: com.google.android.material.bottomnavigation.c$a */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC4534a implements View.OnClickListener {
        View$OnClickListenerC4534a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1003i itemData = ((C4530a) view).getItemData();
            if (C4533c.this.f11141R.m37546O(itemData, C4533c.this.f11140Q, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public C4533c(Context context) {
        this(context, null);
    }

    private C4530a getNewItem() {
        C4530a mo11982b = this.f11149z.mo11982b();
        return mo11982b == null ? new C4530a(getContext()) : mo11982b;
    }

    /* renamed from: j */
    private boolean m27492j(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m27491k(int i) {
        return i != -1;
    }

    /* renamed from: l */
    private void m27490l() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f11141R.size(); i++) {
            hashSet.add(Integer.valueOf(this.f11141R.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f11139P.size(); i2++) {
            int keyAt = this.f11139P.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f11139P.delete(keyAt);
            }
        }
    }

    /* renamed from: o */
    private void m27487o(int i) {
        if (m27491k(i)) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }

    private void setBadgeIfNeeded(C4530a c4530a) {
        C9289a c9289a;
        int id = c4530a.getId();
        if (m27491k(id) && (c9289a = this.f11139P.get(id)) != null) {
            c4530a.setBadge(c9289a);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n
    /* renamed from: b */
    public void mo26852b(C0999g c0999g) {
        this.f11141R = c0999g;
    }

    /* renamed from: d */
    public void m27498d() {
        removeAllViews();
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                if (c4530a != null) {
                    this.f11149z.mo11983a(c4530a);
                    c4530a.m27508h();
                }
            }
        }
        if (this.f11141R.size() == 0) {
            this.f11128E = 0;
            this.f11129F = 0;
            this.f11127D = null;
            return;
        }
        m27490l();
        this.f11127D = new C4530a[this.f11141R.size()];
        boolean m27492j = m27492j(this.f11126C, this.f11141R.m37550G().size());
        for (int i = 0; i < this.f11141R.size(); i++) {
            this.f11140Q.m27484d(true);
            this.f11141R.getItem(i).setCheckable(true);
            this.f11140Q.m27484d(false);
            C4530a newItem = getNewItem();
            this.f11127D[i] = newItem;
            newItem.setIconTintList(this.f11130G);
            newItem.setIconSize(this.f11131H);
            newItem.setTextColor(this.f11133J);
            newItem.setTextAppearanceInactive(this.f11134K);
            newItem.setTextAppearanceActive(this.f11135L);
            newItem.setTextColor(this.f11132I);
            Drawable drawable = this.f11136M;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f11137N);
            }
            newItem.setShifting(m27492j);
            newItem.setLabelVisibilityMode(this.f11126C);
            C1003i c1003i = (C1003i) this.f11141R.getItem(i);
            newItem.mo26853e(c1003i, 0);
            newItem.setItemPosition(i);
            int itemId = c1003i.getItemId();
            newItem.setOnTouchListener(this.f11124A.get(itemId));
            newItem.setOnClickListener(this.f11148y);
            int i2 = this.f11128E;
            if (i2 != 0 && itemId == i2) {
                this.f11129F = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f11141R.size() - 1, this.f11129F);
        this.f11129F = min;
        this.f11141R.getItem(min).setChecked(true);
    }

    /* renamed from: e */
    public ColorStateList m27497e(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList m18691c = C7462a.m18691c(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(C7452a.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = m18691c.getDefaultColor();
                return new ColorStateList(new int[][]{f11123T, f11122S, ViewGroup.EMPTY_STATE_SET}, new int[]{m18691c.getColorForState(f11123T, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    /* renamed from: f */
    C4530a m27496f(int i) {
        m27487o(i);
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                if (c4530a.getId() == i) {
                    return c4530a;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C9289a m27495g(int i) {
        return this.f11139P.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<C9289a> getBadgeDrawables() {
        return this.f11139P;
    }

    public ColorStateList getIconTintList() {
        return this.f11130G;
    }

    public Drawable getItemBackground() {
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null && c4530aArr.length > 0) {
            return c4530aArr[0].getBackground();
        }
        return this.f11136M;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f11137N;
    }

    public int getItemIconSize() {
        return this.f11131H;
    }

    public int getItemTextAppearanceActive() {
        return this.f11135L;
    }

    public int getItemTextAppearanceInactive() {
        return this.f11134K;
    }

    public ColorStateList getItemTextColor() {
        return this.f11132I;
    }

    public int getLabelVisibilityMode() {
        return this.f11126C;
    }

    public int getSelectedItemId() {
        return this.f11128E;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C9289a m27494h(int i) {
        m27487o(i);
        C9289a c9289a = this.f11139P.get(i);
        if (c9289a == null) {
            c9289a = C9289a.m15197d(getContext());
            this.f11139P.put(i, c9289a);
        }
        C4530a m27496f = m27496f(i);
        if (m27496f != null) {
            m27496f.setBadge(c9289a);
        }
        return c9289a;
    }

    /* renamed from: i */
    public boolean m27493i() {
        return this.f11125B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m27489m(int i) {
        int size = this.f11141R.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f11141R.getItem(i2);
            if (i == item.getItemId()) {
                this.f11128E = i;
                this.f11129F = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: n */
    public void m27488n() {
        C0999g c0999g = this.f11141R;
        if (c0999g == null || this.f11127D == null) {
            return;
        }
        int size = c0999g.size();
        if (size != this.f11127D.length) {
            m27498d();
            return;
        }
        int i = this.f11128E;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f11141R.getItem(i2);
            if (item.isChecked()) {
                this.f11128E = item.getItemId();
                this.f11129F = i2;
            }
        }
        if (i != this.f11128E) {
            C8169o.m16617a(this, this.f11142c);
        }
        boolean m27492j = m27492j(this.f11126C, this.f11141R.m37550G().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.f11140Q.m27484d(true);
            this.f11127D[i3].setLabelVisibilityMode(this.f11126C);
            this.f11127D[i3].setShifting(m27492j);
            this.f11127D[i3].mo26853e((C1003i) this.f11141R.getItem(i3), 0);
            this.f11140Q.m27484d(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C7716c.m17716E0(accessibilityNodeInfo).m17689c0(C7716c.C7718b.m17637b(1, this.f11141R.m37550G().size(), false, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C7759x.m17563C(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f11141R.m37550G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f11147x, 1073741824);
        if (m27492j(this.f11126C, size2) && this.f11125B) {
            View childAt = getChildAt(this.f11129F);
            int i3 = this.f11146w;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f11145f, Integer.MIN_VALUE), makeMeasureSpec);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f11144e * i4), Math.min(i3, this.f11145f));
            int i5 = size - min;
            int min2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.f11143d);
            int i6 = i5 - (i4 * min2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    this.f11138O[i7] = i7 == this.f11129F ? min : min2;
                    if (i6 > 0) {
                        int[] iArr = this.f11138O;
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.f11138O[i7] = 0;
                }
                i7++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f11145f);
            int i8 = size - (size2 * min3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.f11138O;
                    iArr2[i9] = min3;
                    if (i8 > 0) {
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f11138O[i9] = 0;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f11138O[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f11147x, makeMeasureSpec, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<C9289a> sparseArray) {
        this.f11139P = sparseArray;
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                c4530a.setBadge(sparseArray.get(c4530a.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f11130G = colorStateList;
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                c4530a.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f11136M = drawable;
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                c4530a.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f11137N = i;
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                c4530a.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f11125B = z;
    }

    public void setItemIconSize(int i) {
        this.f11131H = i;
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                c4530a.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f11135L = i;
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                c4530a.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f11132I;
                if (colorStateList != null) {
                    c4530a.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f11134K = i;
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                c4530a.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f11132I;
                if (colorStateList != null) {
                    c4530a.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f11132I = colorStateList;
        C4530a[] c4530aArr = this.f11127D;
        if (c4530aArr != null) {
            for (C4530a c4530a : c4530aArr) {
                c4530a.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f11126C = i;
    }

    public void setPresenter(C4535d c4535d) {
        this.f11140Q = c4535d;
    }

    public C4533c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11149z = new C7674g(5);
        this.f11124A = new SparseArray<>(5);
        this.f11128E = 0;
        this.f11129F = 0;
        this.f11139P = new SparseArray<>(5);
        Resources resources = getResources();
        this.f11143d = resources.getDimensionPixelSize(C9267d.design_bottom_navigation_item_max_width);
        this.f11144e = resources.getDimensionPixelSize(C9267d.design_bottom_navigation_item_min_width);
        this.f11145f = resources.getDimensionPixelSize(C9267d.design_bottom_navigation_active_item_max_width);
        this.f11146w = resources.getDimensionPixelSize(C9267d.design_bottom_navigation_active_item_min_width);
        this.f11147x = resources.getDimensionPixelSize(C9267d.design_bottom_navigation_height);
        this.f11133J = m27497e(16842808);
        C8116b c8116b = new C8116b();
        this.f11142c = c8116b;
        c8116b.m16580r0(0);
        this.f11142c.m16582p0(115L);
        this.f11142c.mo16602Y(new C7805b());
        this.f11142c.m16590i0(new C4692o());
        this.f11148y = new View$OnClickListenerC4534a();
        this.f11138O = new int[5];
        C7759x.m17478z0(this, 1);
    }
}
