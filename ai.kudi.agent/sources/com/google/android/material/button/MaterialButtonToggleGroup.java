package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import com.google.android.material.theme.p106a.C4804a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7713h;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9237a;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.InterfaceC9239c;
/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: C */
    private static final String f11239C = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: D */
    private static final int f11240D = C9276k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: A */
    private boolean f11241A;

    /* renamed from: B */
    private int f11242B;

    /* renamed from: c */
    private final List<C4562d> f11243c;

    /* renamed from: d */
    private final C4561c f11244d;

    /* renamed from: e */
    private final C4564f f11245e;

    /* renamed from: f */
    private final LinkedHashSet<InterfaceC4563e> f11246f;

    /* renamed from: w */
    private final Comparator<MaterialButton> f11247w;

    /* renamed from: x */
    private Integer[] f11248x;

    /* renamed from: y */
    private boolean f11249y;

    /* renamed from: z */
    private boolean f11250z;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes2.dex */
    class C4559a implements Comparator<MaterialButton> {
        C4559a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes2.dex */
    class C4560b extends C7676a {
        C4560b() {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            c7716c.m17687d0(C7716c.C7719c.m17636a(0, 1, MaterialButtonToggleGroup.this.m27388n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes2.dex */
    public class C4561c implements MaterialButton.InterfaceC4555a {
        private C4561c() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC4555a
        /* renamed from: a */
        public void mo27377a(MaterialButton materialButton, boolean z) {
            if (MaterialButtonToggleGroup.this.f11249y) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f11250z) {
                MaterialButtonToggleGroup.this.f11242B = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.m27381u(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.m27390l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C4561c(MaterialButtonToggleGroup materialButtonToggleGroup, C4559a c4559a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes2.dex */
    public static class C4562d {

        /* renamed from: e */
        private static final InterfaceC9239c f11254e = new C9237a(0.0f);

        /* renamed from: a */
        InterfaceC9239c f11255a;

        /* renamed from: b */
        InterfaceC9239c f11256b;

        /* renamed from: c */
        InterfaceC9239c f11257c;

        /* renamed from: d */
        InterfaceC9239c f11258d;

        C4562d(InterfaceC9239c interfaceC9239c, InterfaceC9239c interfaceC9239c2, InterfaceC9239c interfaceC9239c3, InterfaceC9239c interfaceC9239c4) {
            this.f11255a = interfaceC9239c;
            this.f11256b = interfaceC9239c3;
            this.f11257c = interfaceC9239c4;
            this.f11258d = interfaceC9239c2;
        }

        /* renamed from: a */
        public static C4562d m27376a(C4562d c4562d) {
            InterfaceC9239c interfaceC9239c = f11254e;
            return new C4562d(interfaceC9239c, c4562d.f11258d, interfaceC9239c, c4562d.f11257c);
        }

        /* renamed from: b */
        public static C4562d m27375b(C4562d c4562d, View view) {
            return C4696r.m26685d(view) ? m27374c(c4562d) : m27373d(c4562d);
        }

        /* renamed from: c */
        public static C4562d m27374c(C4562d c4562d) {
            InterfaceC9239c interfaceC9239c = c4562d.f11255a;
            InterfaceC9239c interfaceC9239c2 = c4562d.f11258d;
            InterfaceC9239c interfaceC9239c3 = f11254e;
            return new C4562d(interfaceC9239c, interfaceC9239c2, interfaceC9239c3, interfaceC9239c3);
        }

        /* renamed from: d */
        public static C4562d m27373d(C4562d c4562d) {
            InterfaceC9239c interfaceC9239c = f11254e;
            return new C4562d(interfaceC9239c, interfaceC9239c, c4562d.f11256b, c4562d.f11257c);
        }

        /* renamed from: e */
        public static C4562d m27372e(C4562d c4562d, View view) {
            return C4696r.m26685d(view) ? m27373d(c4562d) : m27374c(c4562d);
        }

        /* renamed from: f */
        public static C4562d m27371f(C4562d c4562d) {
            InterfaceC9239c interfaceC9239c = c4562d.f11255a;
            InterfaceC9239c interfaceC9239c2 = f11254e;
            return new C4562d(interfaceC9239c, interfaceC9239c2, c4562d.f11256b, interfaceC9239c2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC4563e {
        /* renamed from: a */
        void mo26225a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    /* loaded from: classes2.dex */
    public class C4564f implements MaterialButton.InterfaceC4556b {
        private C4564f() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC4556b
        /* renamed from: a */
        public void mo27370a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C4564f(MaterialButtonToggleGroup materialButtonToggleGroup, C4559a c4559a) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m27386p(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m27386p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m27386p(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private void m27394h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m27389m = m27389m(i);
            int min = Math.min(m27389m.getStrokeWidth(), m27389m(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams m27393i = m27393i(m27389m);
            if (getOrientation() == 0) {
                C7713h.m17729c(m27393i, 0);
                C7713h.m17728d(m27393i, -min);
                m27393i.topMargin = 0;
            } else {
                m27393i.bottomMargin = 0;
                m27393i.topMargin = -min;
                C7713h.m17728d(m27393i, 0);
            }
            m27389m.setLayoutParams(m27393i);
        }
        m27384r(firstVisibleChildIndex);
    }

    /* renamed from: i */
    private LinearLayout.LayoutParams m27393i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: j */
    private void m27392j(int i) {
        m27383s(i, true);
        m27381u(i, true);
        setCheckedId(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m27390l(int i, boolean z) {
        Iterator<InterfaceC4563e> it = this.f11246f.iterator();
        while (it.hasNext()) {
            it.next().mo26225a(this, i, z);
        }
    }

    /* renamed from: m */
    private MaterialButton m27389m(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public int m27388n(View view) {
        if (view instanceof MaterialButton) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) == view) {
                    return i;
                }
                if ((getChildAt(i2) instanceof MaterialButton) && m27386p(i2)) {
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: o */
    private C4562d m27387o(int i, int i2, int i3) {
        C4562d c4562d = this.f11243c.get(i);
        if (i2 == i3) {
            return c4562d;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? C4562d.m27372e(c4562d, this) : C4562d.m27371f(c4562d);
        } else if (i == i3) {
            return z ? C4562d.m27375b(c4562d, this) : C4562d.m27376a(c4562d);
        } else {
            return null;
        }
    }

    /* renamed from: p */
    private boolean m27386p(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: r */
    private void m27384r(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m27389m(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        C7713h.m17729c(layoutParams, 0);
        C7713h.m17728d(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    /* renamed from: s */
    private void m27383s(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f11249y = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f11249y = false;
        }
    }

    private void setCheckedId(int i) {
        this.f11242B = i;
        m27390l(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C7759x.m17509k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.m27416a(this.f11244d);
        materialButton.setOnPressedChangeListenerInternal(this.f11245e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: t */
    private static void m27382t(C9250k.C9252b c9252b, C4562d c4562d) {
        if (c4562d == null) {
            c9252b.m15318o(0.0f);
            return;
        }
        c9252b.m15337B(c4562d.f11255a);
        c9252b.m15313t(c4562d.f11258d);
        c9252b.m15333F(c4562d.f11256b);
        c9252b.m15309x(c4562d.f11257c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public boolean m27381u(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f11241A && checkedButtonIds.isEmpty()) {
            m27383s(i, true);
            this.f11242B = i;
            return false;
        }
        if (z && this.f11250z) {
            checkedButtonIds.remove(Integer.valueOf(i));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                m27383s(intValue, false);
                m27390l(intValue, false);
            }
        }
        return true;
    }

    /* renamed from: v */
    private void m27380v() {
        TreeMap treeMap = new TreeMap(this.f11247w);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m27389m(i), Integer.valueOf(i));
        }
        this.f11248x = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f11239C, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m27381u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C9250k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f11243c.add(new C4562d(shapeAppearanceModel.m15346r(), shapeAppearanceModel.m15354j(), shapeAppearanceModel.m15344t(), shapeAppearanceModel.m15352l()));
        C7759x.m17498p0(materialButton, new C4560b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m27380v();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void m27395g(InterfaceC4563e interfaceC4563e) {
        this.f11246f.add(interfaceC4563e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f11250z) {
            return this.f11242B;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m27389m = m27389m(i);
            if (m27389m.isChecked()) {
                arrayList.add(Integer.valueOf(m27389m.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f11248x;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f11239C, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: k */
    public void m27391k() {
        this.f11249y = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m27389m = m27389m(i);
            m27389m.setChecked(false);
            m27390l(m27389m.getId(), false);
        }
        this.f11249y = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f11242B;
        if (i != -1) {
            m27392j(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C7716c.m17716E0(accessibilityNodeInfo).m17689c0(C7716c.C7718b.m17637b(1, getVisibleButtonCount(), false, m27385q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m27379w();
        m27394h();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.m27409h(this.f11244d);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f11243c.remove(indexOfChild);
        }
        m27379w();
        m27394h();
    }

    /* renamed from: q */
    public boolean m27385q() {
        return this.f11250z;
    }

    public void setSelectionRequired(boolean z) {
        this.f11241A = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f11250z != z) {
            this.f11250z = z;
            m27391k();
        }
    }

    /* renamed from: w */
    void m27379w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m27389m = m27389m(i);
            if (m27389m.getVisibility() != 8) {
                C9250k.C9252b m15342v = m27389m.getShapeAppearanceModel().m15342v();
                m27382t(m15342v, m27387o(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m27389m.setShapeAppearanceModel(m15342v.m15320m());
            }
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11240D), attributeSet, i);
        this.f11243c = new ArrayList();
        this.f11244d = new C4561c(this, null);
        this.f11245e = new C4564f(this, null);
        this.f11246f = new LinkedHashSet<>();
        this.f11247w = new C4559a();
        this.f11249y = false;
        TypedArray m26690h = C4695q.m26690h(getContext(), attributeSet, C9277l.MaterialButtonToggleGroup, i, f11240D, new int[0]);
        setSingleSelection(m26690h.getBoolean(C9277l.MaterialButtonToggleGroup_singleSelection, false));
        this.f11242B = m26690h.getResourceId(C9277l.MaterialButtonToggleGroup_checkedButton, -1);
        this.f11241A = m26690h.getBoolean(C9277l.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        m26690h.recycle();
        C7759x.m17478z0(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
