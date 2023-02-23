package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.C4662d;
import com.google.android.material.internal.C4695q;
import com.google.android.material.theme.p106a.C4804a;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
/* loaded from: classes2.dex */
public class ChipGroup extends C4662d {

    /* renamed from: F */
    private static final int f11303F = C9276k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: A */
    private InterfaceC4572d f11304A;

    /* renamed from: B */
    private final C4570b f11305B;

    /* renamed from: C */
    private ViewGroup$OnHierarchyChangeListenerC4573e f11306C;

    /* renamed from: D */
    private int f11307D;

    /* renamed from: E */
    private boolean f11308E;

    /* renamed from: w */
    private int f11309w;

    /* renamed from: x */
    private int f11310x;

    /* renamed from: y */
    private boolean f11311y;

    /* renamed from: z */
    private boolean f11312z;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes2.dex */
    private class C4570b implements CompoundButton.OnCheckedChangeListener {
        private C4570b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.f11308E) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f11312z) {
                ChipGroup.this.m27292r(compoundButton.getId(), true);
                ChipGroup.this.m27293q(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (z) {
                if (ChipGroup.this.f11307D != -1 && ChipGroup.this.f11307D != id && ChipGroup.this.f11311y) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.m27292r(chipGroup.f11307D, false);
                }
                ChipGroup.this.setCheckedId(id);
            } else if (ChipGroup.this.f11307D == id) {
                ChipGroup.this.setCheckedId(-1);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes2.dex */
    public static class C4571c extends ViewGroup.MarginLayoutParams {
        public C4571c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C4571c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C4571c(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4572d {
        /* renamed from: a */
        void m27291a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: classes2.dex */
    private class ViewGroup$OnHierarchyChangeListenerC4573e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: c */
        private ViewGroup.OnHierarchyChangeListener f11314c;

        private ViewGroup$OnHierarchyChangeListenerC4573e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C7759x.m17509k());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m27297m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f11305B);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f11314c;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f11314c;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.chipGroupStyle);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m27293q(int i, boolean z) {
        this.f11307D = i;
        InterfaceC4572d interfaceC4572d = this.f11304A;
        if (interfaceC4572d != null && this.f11311y && z) {
            interfaceC4572d.m27291a(this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m27292r(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f11308E = true;
            ((Chip) findViewById).setChecked(z);
            this.f11308E = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        m27293q(i, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f11307D;
                if (i2 != -1 && this.f11311y) {
                    m27292r(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.material.internal.C4662d
    /* renamed from: c */
    public boolean mo26781c() {
        return super.mo26781c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C4571c);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4571c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4571c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f11311y) {
            return this.f11307D;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f11311y) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f11309w;
    }

    public int getChipSpacingVertical() {
        return this.f11310x;
    }

    /* renamed from: m */
    public void m27297m(int i) {
        int i2 = this.f11307D;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.f11311y) {
            m27292r(i2, false);
        }
        if (i != -1) {
            m27292r(i, true);
        }
        setCheckedId(i);
    }

    /* renamed from: n */
    public void m27296n() {
        this.f11308E = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f11308E = false;
        setCheckedId(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m27295o(View view) {
        if (view instanceof Chip) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) instanceof Chip) {
                    if (((Chip) getChildAt(i2)) == view) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f11307D;
        if (i != -1) {
            m27292r(i, true);
            setCheckedId(this.f11307D);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C7716c.m17716E0(accessibilityNodeInfo).m17689c0(C7716c.C7718b.m17637b(getRowCount(), mo26781c() ? getChipCount() : -1, false, m27294p() ? 1 : 2));
    }

    /* renamed from: p */
    public boolean m27294p() {
        return this.f11311y;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f11309w != i) {
            this.f11309w = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f11310x != i) {
            this.f11310x = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC4572d interfaceC4572d) {
        this.f11304A = interfaceC4572d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f11306C.f11314c = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f11312z = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.C4662d
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f11311y != z) {
            this.f11311y = z;
            m27296n();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11303F), attributeSet, i);
        this.f11305B = new C4570b();
        this.f11306C = new ViewGroup$OnHierarchyChangeListenerC4573e();
        this.f11307D = -1;
        this.f11308E = false;
        TypedArray m26690h = C4695q.m26690h(getContext(), attributeSet, C9277l.ChipGroup, i, f11303F, new int[0]);
        int dimensionPixelOffset = m26690h.getDimensionPixelOffset(C9277l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(m26690h.getDimensionPixelOffset(C9277l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(m26690h.getDimensionPixelOffset(C9277l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(m26690h.getBoolean(C9277l.ChipGroup_singleLine, false));
        setSingleSelection(m26690h.getBoolean(C9277l.ChipGroup_singleSelection, false));
        setSelectionRequired(m26690h.getBoolean(C9277l.ChipGroup_selectionRequired, false));
        int resourceId = m26690h.getResourceId(C9277l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f11307D = resourceId;
        }
        m26690h.recycle();
        super.setOnHierarchyChangeListener(this.f11306C);
        C7759x.m17478z0(this, 1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4571c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
