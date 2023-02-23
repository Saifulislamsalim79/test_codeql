package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p201g.p219f.p223b.C7546e;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.C7564f;
import p201g.p219f.p223b.p224k.C7565g;
import p201g.p219f.p223b.p224k.C7569j;
import p201g.p219f.p223b.p224k.C7570k;
import p201g.p219f.p223b.p224k.p225m.C7573b;
/* loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    SparseArray<View> mChildrenByIds;
    private ArrayList<AbstractC1261b> mConstraintHelpers;
    protected C1262c mConstraintLayoutSpec;
    private C1265d mConstraintSet;
    private int mConstraintSetId;
    private AbstractC1273f mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected C7564f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    C1257c mMeasurer;
    private C7546e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<C7561e> mTempMapIdToWidget;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C1254a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3758a;

        static {
            int[] iArr = new int[C7561e.EnumC7563b.values().length];
            f3758a = iArr;
            try {
                iArr[C7561e.EnumC7563b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3758a[C7561e.EnumC7563b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3758a[C7561e.EnumC7563b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3758a[C7561e.EnumC7563b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    /* loaded from: classes2.dex */
    public class C1257c implements C7573b.InterfaceC7575b {

        /* renamed from: a */
        ConstraintLayout f3826a;

        /* renamed from: b */
        int f3827b;

        /* renamed from: c */
        int f3828c;

        /* renamed from: d */
        int f3829d;

        /* renamed from: e */
        int f3830e;

        /* renamed from: f */
        int f3831f;

        /* renamed from: g */
        int f3832g;

        public C1257c(ConstraintLayout constraintLayout) {
            this.f3826a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m36634d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // p201g.p219f.p223b.p224k.p225m.C7573b.InterfaceC7575b
        /* renamed from: a */
        public final void mo18143a() {
            int childCount = this.f3826a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f3826a.getChildAt(i);
                if (childAt instanceof C1274g) {
                    ((C1274g) childAt).m36570a(this.f3826a);
                }
            }
            int size = this.f3826a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC1261b) this.f3826a.mConstraintHelpers.get(i2)).m36620k(this.f3826a);
                }
            }
        }

        @Override // p201g.p219f.p223b.p224k.p225m.C7573b.InterfaceC7575b
        /* renamed from: b */
        public final void mo18142b(C7561e c7561e, C7573b.C7574a c7574a) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i;
            int i2;
            int i3;
            if (c7561e == null) {
                return;
            }
            if (c7561e.m18272Q() == 8 && !c7561e.m18254a0()) {
                c7574a.f18201e = 0;
                c7574a.f18202f = 0;
                c7574a.f18203g = 0;
            } else if (c7561e.m18288I() == null) {
            } else {
                C7561e.EnumC7563b enumC7563b = c7574a.f18197a;
                C7561e.EnumC7563b enumC7563b2 = c7574a.f18198b;
                int i4 = c7574a.f18199c;
                int i5 = c7574a.f18200d;
                int i6 = this.f3827b + this.f3828c;
                int i7 = this.f3829d;
                View view = (View) c7561e.m18232q();
                int i8 = C1254a.f3758a[enumC7563b.ordinal()];
                if (i8 == 1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else if (i8 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3831f, i7, -2);
                } else if (i8 == 3) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3831f, i7 + c7561e.m18214z(), -1);
                } else if (i8 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3831f, i7, -2);
                    boolean z = c7561e.f18138n == 1;
                    int i9 = c7574a.f18206j;
                    if (i9 == C7573b.C7574a.f18195l || i9 == C7573b.C7574a.f18196m) {
                        if (c7574a.f18206j == C7573b.C7574a.f18196m || !z || (z && (view.getMeasuredHeight() == c7561e.m18222v())) || (view instanceof C1274g) || c7561e.mo18175e0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c7561e.m18270R(), 1073741824);
                        }
                    }
                }
                int i10 = C1254a.f3758a[enumC7563b2.ordinal()];
                if (i10 == 1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                } else if (i10 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3832g, i6, -2);
                } else if (i10 == 3) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3832g, i6 + c7561e.m18274P(), -1);
                } else if (i10 != 4) {
                    makeMeasureSpec2 = 0;
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3832g, i6, -2);
                    boolean z2 = c7561e.f18140o == 1;
                    int i11 = c7574a.f18206j;
                    if (i11 == C7573b.C7574a.f18195l || i11 == C7573b.C7574a.f18196m) {
                        if (c7574a.f18206j == C7573b.C7574a.f18196m || !z2 || (z2 && (view.getMeasuredWidth() == c7561e.m18270R())) || (view instanceof C1274g) || c7561e.mo18173f0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c7561e.m18222v(), 1073741824);
                        }
                    }
                }
                C7564f c7564f = (C7564f) c7561e.m18288I();
                if (c7564f != null && C7569j.m18159b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == c7561e.m18270R() && view.getMeasuredWidth() < c7564f.m18270R() && view.getMeasuredHeight() == c7561e.m18222v() && view.getMeasuredHeight() < c7564f.m18222v() && view.getBaseline() == c7561e.m18238n() && !c7561e.m18250d0()) {
                    if (m36634d(c7561e.m18304A(), makeMeasureSpec, c7561e.m18270R()) && m36634d(c7561e.m18302B(), makeMeasureSpec2, c7561e.m18222v())) {
                        c7574a.f18201e = c7561e.m18270R();
                        c7574a.f18202f = c7561e.m18222v();
                        c7574a.f18203g = c7561e.m18238n();
                        return;
                    }
                }
                boolean z3 = enumC7563b == C7561e.EnumC7563b.MATCH_CONSTRAINT;
                boolean z4 = enumC7563b2 == C7561e.EnumC7563b.MATCH_CONSTRAINT;
                boolean z5 = enumC7563b2 == C7561e.EnumC7563b.MATCH_PARENT || enumC7563b2 == C7561e.EnumC7563b.FIXED;
                boolean z6 = enumC7563b == C7561e.EnumC7563b.MATCH_PARENT || enumC7563b == C7561e.EnumC7563b.FIXED;
                boolean z7 = z3 && c7561e.f18106U > 0.0f;
                boolean z8 = z4 && c7561e.f18106U > 0.0f;
                if (view == null) {
                    return;
                }
                C1255b c1255b = (C1255b) view.getLayoutParams();
                int i12 = c7574a.f18206j;
                if (i12 != C7573b.C7574a.f18195l && i12 != C7573b.C7574a.f18196m && z3 && c7561e.f18138n == 0 && z4 && c7561e.f18140o == 0) {
                    i3 = -1;
                    baseline = 0;
                    max = 0;
                    i2 = 0;
                } else {
                    if ((view instanceof AbstractC1277j) && (c7561e instanceof C7570k)) {
                        ((AbstractC1277j) view).m36567o((C7570k) c7561e, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    c7561e.m18293F0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i13 = c7561e.f18142q;
                    max = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                    int i14 = c7561e.f18143r;
                    if (i14 > 0) {
                        max = Math.min(i14, max);
                    }
                    int i15 = c7561e.f18145t;
                    if (i15 > 0) {
                        i2 = Math.max(i15, measuredHeight);
                        i = makeMeasureSpec2;
                    } else {
                        i = makeMeasureSpec2;
                        i2 = measuredHeight;
                    }
                    int i16 = c7561e.f18146u;
                    if (i16 > 0) {
                        i2 = Math.min(i16, i2);
                    }
                    if (!C7569j.m18159b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                        if (z7 && z5) {
                            max = (int) ((i2 * c7561e.f18106U) + 0.5f);
                        } else if (z8 && z6) {
                            i2 = (int) ((max / c7561e.f18106U) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i2) {
                        if (measuredWidth != max) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        int makeMeasureSpec3 = measuredHeight != i2 ? View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : i;
                        view.measure(makeMeasureSpec, makeMeasureSpec3);
                        c7561e.m18293F0(makeMeasureSpec, makeMeasureSpec3);
                        max = view.getMeasuredWidth();
                        i2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i3 = -1;
                }
                boolean z9 = baseline != i3;
                c7574a.f18205i = (max == c7574a.f18199c && i2 == c7574a.f18200d) ? false : true;
                if (c1255b.f3782X) {
                    z9 = true;
                }
                if (z9 && baseline != -1 && c7561e.m18238n() != baseline) {
                    c7574a.f18205i = true;
                }
                c7574a.f18201e = max;
                c7574a.f18202f = i2;
                c7574a.f18204h = z9;
                c7574a.f18203g = baseline;
            }
        }

        /* renamed from: c */
        public void m36635c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f3827b = i3;
            this.f3828c = i4;
            this.f3829d = i5;
            this.f3830e = i6;
            this.f3831f = i;
            this.f3832g = i2;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C7564f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1257c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    private final C7561e getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C1255b) view.getLayoutParams()).f3810m0;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m18240l0(this);
        this.mLayoutWidget.m18208E1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1276i.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C1276i.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C1276i.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C1276i.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C1276i.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C1276i.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C1276i.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C1276i.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1265d c1265d = new C1265d();
                        this.mConstraintSet = c1265d;
                        c1265d.m36595o(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m18207F1(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C7561e viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo18150h0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).m18239m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C1271e)) {
                    this.mConstraintSet = ((C1271e) childAt2).getConstraintSet();
                }
            }
        }
        C1265d c1265d = this.mConstraintSet;
        if (c1265d != null) {
            c1265d.m36606d(this, true);
        }
        this.mLayoutWidget.m18151d1();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).m36618m(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C1274g) {
                ((C1274g) childAt3).m36569b(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C7561e viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C1255b c1255b = (C1255b) childAt5.getLayoutParams();
                this.mLayoutWidget.m18155a(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, c1255b, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyConstraintsFromLayoutParams(boolean r20, android.view.View r21, p201g.p219f.p223b.p224k.C7561e r22, androidx.constraintlayout.widget.ConstraintLayout.C1255b r23, android.util.SparseArray<p201g.p219f.p223b.p224k.C7561e> r24) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, g.f.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1255b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC1261b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).m36619l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C7546e c7546e) {
        this.mMetrics = c7546e;
        this.mLayoutWidget.m18189r1(c7546e);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.mDesignIds.get(str);
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m18187t1();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final C7561e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C1255b) view.getLayoutParams()).f3810m0;
    }

    protected boolean isRtl() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C1262c(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1255b c1255b = (C1255b) childAt.getLayoutParams();
            C7561e c7561e = c1255b.f3810m0;
            if ((childAt.getVisibility() != 8 || c1255b.f3783Y || c1255b.f3784Z || c1255b.f3788b0 || isInEditMode) && !c1255b.f3786a0) {
                int m18268S = c7561e.m18268S();
                int m18266T = c7561e.m18266T();
                int m18270R = c7561e.m18270R() + m18268S;
                int m18222v = c7561e.m18222v() + m18266T;
                childAt.layout(m18268S, m18266T, m18270R, m18222v);
                if ((childAt instanceof C1274g) && (content = ((C1274g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m18268S, m18266T, m18270R, m18222v);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo36621j(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.mDirtyHierarchy) {
            if (this.mOnMeasureWidthMeasureSpec == i && this.mOnMeasureHeightMeasureSpec == i2) {
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m18270R(), this.mLayoutWidget.m18222v(), this.mLayoutWidget.m18181z1(), this.mLayoutWidget.m18183x1());
                return;
            } else if (this.mOnMeasureWidthMeasureSpec == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.m18222v()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m18270R(), this.mLayoutWidget.m18222v(), this.mLayoutWidget.m18181z1(), this.mLayoutWidget.m18183x1());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m18206G1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.m18204I1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m18270R(), this.mLayoutWidget.m18222v(), this.mLayoutWidget.m18181z1(), this.mLayoutWidget.m18183x1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C7561e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C7565g)) {
            C1255b c1255b = (C1255b) view.getLayoutParams();
            C7565g c7565g = new C7565g();
            c1255b.f3810m0 = c7565g;
            c1255b.f3783Y = true;
            c7565g.m18166j1(c1255b.f3776R);
        }
        if (view instanceof AbstractC1261b) {
            AbstractC1261b abstractC1261b = (AbstractC1261b) view;
            abstractC1261b.m36617n();
            ((C1255b) view.getLayoutParams()).f3784Z = true;
            if (!this.mConstraintHelpers.contains(abstractC1261b)) {
                this.mConstraintHelpers.add(abstractC1261b);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.m18152c1(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C1262c(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C1257c c1257c = this.mMeasurer;
        int i5 = c1257c.f3830e;
        int i6 = i3 + c1257c.f3829d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i, 0);
            int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.mMaxHeight, ViewGroup.resolveSizeAndState(i7, i2, 0) & 16777215);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.mLastMeasureWidth = min;
            this.mLastMeasureHeight = min2;
            return;
        }
        setMeasuredDimension(i6, i7);
        this.mLastMeasureWidth = i6;
        this.mLastMeasureHeight = i7;
    }

    protected void resolveSystem(C7564f c7564f, int i, int i2, int i3) {
        int max;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i4 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.m36635c(i2, i3, max2, max3, paddingWidth, i4);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 <= 0 && max5 <= 0) {
                max4 = Math.max(0, getPaddingLeft());
            } else if (isRtl()) {
                max4 = max5;
            }
            max = max4;
        } else {
            max = Math.max(0, getPaddingLeft());
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(c7564f, mode, i5, mode2, i6);
        c7564f.m18212A1(i, mode, i5, mode2, i6, this.mLastMeasureWidth, this.mLastMeasureHeight, max, max2);
    }

    public void setConstraintSet(C1265d c1265d) {
        this.mConstraintSet = c1265d;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1273f abstractC1273f) {
        this.mConstraintsChangedListener = abstractC1273f;
        C1262c c1262c = this.mConstraintLayoutSpec;
        if (c1262c != null) {
            c1262c.m36614c(abstractC1273f);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m18207F1(i);
    }

    protected void setSelfDimensionBehaviour(C7564f c7564f, int i, int i2, int i3, int i4) {
        C7561e.EnumC7563b enumC7563b;
        C1257c c1257c = this.mMeasurer;
        int i5 = c1257c.f3830e;
        int i6 = c1257c.f3829d;
        C7561e.EnumC7563b enumC7563b2 = C7561e.EnumC7563b.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC7563b = C7561e.EnumC7563b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            enumC7563b = C7561e.EnumC7563b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
            i2 = 0;
        } else if (i != 1073741824) {
            enumC7563b = enumC7563b2;
            i2 = 0;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            enumC7563b = enumC7563b2;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC7563b2 = C7561e.EnumC7563b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            enumC7563b2 = C7561e.EnumC7563b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
            i4 = 0;
        }
        if (i2 != c7564f.m18270R() || i4 != c7564f.m18222v()) {
            c7564f.m18184w1();
        }
        c7564f.m18261V0(0);
        c7564f.m18259W0(0);
        c7564f.m18289H0(this.mMaxWidth - i6);
        c7564f.m18291G0(this.mMaxHeight - i5);
        c7564f.m18283K0(0);
        c7564f.m18285J0(0);
        c7564f.m18213z0(enumC7563b);
        c7564f.m18263U0(i2);
        c7564f.m18271Q0(enumC7563b2);
        c7564f.m18221v0(i4);
        c7564f.m18283K0(this.mMinWidth - i6);
        c7564f.m18285J0(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C1262c c1262c = this.mConstraintLayoutSpec;
        if (c1262c != null) {
            c1262c.m36613d(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C1255b generateDefaultLayoutParams() {
        return new C1255b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C1255b generateLayoutParams(AttributeSet attributeSet) {
        return new C1255b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1255b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C7564f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1257c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C7564f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1257c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C7564f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1257c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    /* loaded from: classes2.dex */
    public static class C1255b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f3759A;

        /* renamed from: B */
        public String f3760B;

        /* renamed from: C */
        int f3761C;

        /* renamed from: D */
        public float f3762D;

        /* renamed from: E */
        public float f3763E;

        /* renamed from: F */
        public int f3764F;

        /* renamed from: G */
        public int f3765G;

        /* renamed from: H */
        public int f3766H;

        /* renamed from: I */
        public int f3767I;

        /* renamed from: J */
        public int f3768J;

        /* renamed from: K */
        public int f3769K;

        /* renamed from: L */
        public int f3770L;

        /* renamed from: M */
        public int f3771M;

        /* renamed from: N */
        public float f3772N;

        /* renamed from: O */
        public float f3773O;

        /* renamed from: P */
        public int f3774P;

        /* renamed from: Q */
        public int f3775Q;

        /* renamed from: R */
        public int f3776R;

        /* renamed from: S */
        public boolean f3777S;

        /* renamed from: T */
        public boolean f3778T;

        /* renamed from: U */
        public String f3779U;

        /* renamed from: V */
        boolean f3780V;

        /* renamed from: W */
        boolean f3781W;

        /* renamed from: X */
        boolean f3782X;

        /* renamed from: Y */
        boolean f3783Y;

        /* renamed from: Z */
        boolean f3784Z;

        /* renamed from: a */
        public int f3785a;

        /* renamed from: a0 */
        boolean f3786a0;

        /* renamed from: b */
        public int f3787b;

        /* renamed from: b0 */
        boolean f3788b0;

        /* renamed from: c */
        public float f3789c;

        /* renamed from: c0 */
        int f3790c0;

        /* renamed from: d */
        public int f3791d;

        /* renamed from: d0 */
        int f3792d0;

        /* renamed from: e */
        public int f3793e;

        /* renamed from: e0 */
        int f3794e0;

        /* renamed from: f */
        public int f3795f;

        /* renamed from: f0 */
        int f3796f0;

        /* renamed from: g */
        public int f3797g;

        /* renamed from: g0 */
        int f3798g0;

        /* renamed from: h */
        public int f3799h;

        /* renamed from: h0 */
        int f3800h0;

        /* renamed from: i */
        public int f3801i;

        /* renamed from: i0 */
        float f3802i0;

        /* renamed from: j */
        public int f3803j;

        /* renamed from: j0 */
        int f3804j0;

        /* renamed from: k */
        public int f3805k;

        /* renamed from: k0 */
        int f3806k0;

        /* renamed from: l */
        public int f3807l;

        /* renamed from: l0 */
        float f3808l0;

        /* renamed from: m */
        public int f3809m;

        /* renamed from: m0 */
        C7561e f3810m0;

        /* renamed from: n */
        public int f3811n;

        /* renamed from: n0 */
        public boolean f3812n0;

        /* renamed from: o */
        public float f3813o;

        /* renamed from: p */
        public int f3814p;

        /* renamed from: q */
        public int f3815q;

        /* renamed from: r */
        public int f3816r;

        /* renamed from: s */
        public int f3817s;

        /* renamed from: t */
        public int f3818t;

        /* renamed from: u */
        public int f3819u;

        /* renamed from: v */
        public int f3820v;

        /* renamed from: w */
        public int f3821w;

        /* renamed from: x */
        public int f3822x;

        /* renamed from: y */
        public int f3823y;

        /* renamed from: z */
        public float f3824z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        /* loaded from: classes2.dex */
        private static class C1256a {

            /* renamed from: a */
            public static final SparseIntArray f3825a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3825a = sparseIntArray;
                sparseIntArray.append(C1276i.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f3825a.append(C1276i.ConstraintLayout_Layout_android_orientation, 1);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f3825a.append(C1276i.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public C1255b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.f3785a = -1;
            this.f3787b = -1;
            this.f3789c = -1.0f;
            this.f3791d = -1;
            this.f3793e = -1;
            this.f3795f = -1;
            this.f3797g = -1;
            this.f3799h = -1;
            this.f3801i = -1;
            this.f3803j = -1;
            this.f3805k = -1;
            this.f3807l = -1;
            this.f3809m = -1;
            this.f3811n = 0;
            this.f3813o = 0.0f;
            this.f3814p = -1;
            this.f3815q = -1;
            this.f3816r = -1;
            this.f3817s = -1;
            this.f3818t = -1;
            this.f3819u = -1;
            this.f3820v = -1;
            this.f3821w = -1;
            this.f3822x = -1;
            this.f3823y = -1;
            this.f3824z = 0.5f;
            this.f3759A = 0.5f;
            this.f3760B = null;
            this.f3761C = 1;
            this.f3762D = -1.0f;
            this.f3763E = -1.0f;
            this.f3764F = 0;
            this.f3765G = 0;
            this.f3766H = 0;
            this.f3767I = 0;
            this.f3768J = 0;
            this.f3769K = 0;
            this.f3770L = 0;
            this.f3771M = 0;
            this.f3772N = 1.0f;
            this.f3773O = 1.0f;
            this.f3774P = -1;
            this.f3775Q = -1;
            this.f3776R = -1;
            this.f3777S = false;
            this.f3778T = false;
            this.f3779U = null;
            this.f3780V = true;
            this.f3781W = true;
            this.f3782X = false;
            this.f3783Y = false;
            this.f3784Z = false;
            this.f3786a0 = false;
            this.f3788b0 = false;
            this.f3790c0 = -1;
            this.f3792d0 = -1;
            this.f3794e0 = -1;
            this.f3796f0 = -1;
            this.f3798g0 = -1;
            this.f3800h0 = -1;
            this.f3802i0 = 0.5f;
            this.f3810m0 = new C7561e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1276i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C1256a.f3825a.get(index);
                switch (i3) {
                    case 1:
                        this.f3776R = obtainStyledAttributes.getInt(index, this.f3776R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f3809m);
                        this.f3809m = resourceId;
                        if (resourceId == -1) {
                            this.f3809m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f3811n = obtainStyledAttributes.getDimensionPixelSize(index, this.f3811n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f3813o) % 360.0f;
                        this.f3813o = f;
                        if (f < 0.0f) {
                            this.f3813o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f3785a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3785a);
                        break;
                    case 6:
                        this.f3787b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3787b);
                        break;
                    case 7:
                        this.f3789c = obtainStyledAttributes.getFloat(index, this.f3789c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f3791d);
                        this.f3791d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f3791d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f3793e);
                        this.f3793e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f3793e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f3795f);
                        this.f3795f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f3795f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f3797g);
                        this.f3797g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f3797g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f3799h);
                        this.f3799h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f3799h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f3801i);
                        this.f3801i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f3801i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f3803j);
                        this.f3803j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f3803j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f3805k);
                        this.f3805k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f3805k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f3807l);
                        this.f3807l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f3807l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f3814p);
                        this.f3814p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f3814p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f3815q);
                        this.f3815q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f3815q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f3816r);
                        this.f3816r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f3816r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f3817s);
                        this.f3817s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f3817s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f3818t = obtainStyledAttributes.getDimensionPixelSize(index, this.f3818t);
                        break;
                    case 22:
                        this.f3819u = obtainStyledAttributes.getDimensionPixelSize(index, this.f3819u);
                        break;
                    case 23:
                        this.f3820v = obtainStyledAttributes.getDimensionPixelSize(index, this.f3820v);
                        break;
                    case 24:
                        this.f3821w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3821w);
                        break;
                    case 25:
                        this.f3822x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3822x);
                        break;
                    case 26:
                        this.f3823y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3823y);
                        break;
                    case 27:
                        this.f3777S = obtainStyledAttributes.getBoolean(index, this.f3777S);
                        break;
                    case 28:
                        this.f3778T = obtainStyledAttributes.getBoolean(index, this.f3778T);
                        break;
                    case 29:
                        this.f3824z = obtainStyledAttributes.getFloat(index, this.f3824z);
                        break;
                    case 30:
                        this.f3759A = obtainStyledAttributes.getFloat(index, this.f3759A);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f3766H = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f3767I = i5;
                        if (i5 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f3768J = obtainStyledAttributes.getDimensionPixelSize(index, this.f3768J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f3768J) == -2) {
                                this.f3768J = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f3770L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3770L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f3770L) == -2) {
                                this.f3770L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f3772N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f3772N));
                        this.f3766H = 2;
                        break;
                    case 36:
                        try {
                            this.f3769K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3769K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f3769K) == -2) {
                                this.f3769K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f3771M = obtainStyledAttributes.getDimensionPixelSize(index, this.f3771M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f3771M) == -2) {
                                this.f3771M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f3773O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f3773O));
                        this.f3767I = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f3760B = string;
                                this.f3761C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f3760B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f3760B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f3761C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f3761C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f3760B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f3760B.substring(i, indexOf2);
                                        String substring3 = this.f3760B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f3761C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f3760B.substring(i);
                                        if (substring4.length() > 0) {
                                            Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f3762D = obtainStyledAttributes.getFloat(index, this.f3762D);
                                continue;
                            case 46:
                                this.f3763E = obtainStyledAttributes.getFloat(index, this.f3763E);
                                continue;
                            case 47:
                                this.f3764F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f3765G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f3774P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3774P);
                                continue;
                            case 50:
                                this.f3775Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3775Q);
                                continue;
                            case 51:
                                this.f3779U = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m36636a();
        }

        /* renamed from: a */
        public void m36636a() {
            this.f3783Y = false;
            this.f3780V = true;
            this.f3781W = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.f3777S) {
                this.f3780V = false;
                if (this.f3766H == 0) {
                    this.f3766H = 1;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.f3778T) {
                this.f3781W = false;
                if (this.f3767I == 0) {
                    this.f3767I = 1;
                }
            }
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == 0 || i == -1) {
                this.f3780V = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.f3766H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f3777S = true;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == 0 || i2 == -1) {
                this.f3781W = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.f3767I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f3778T = true;
                }
            }
            if (this.f3789c == -1.0f && this.f3785a == -1 && this.f3787b == -1) {
                return;
            }
            this.f3783Y = true;
            this.f3780V = true;
            this.f3781W = true;
            if (!(this.f3810m0 instanceof C7565g)) {
                this.f3810m0 = new C7565g();
            }
            ((C7565g) this.f3810m0).m18166j1(this.f3776R);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C1255b.resolveLayoutDirection(int):void");
        }

        public C1255b(int i, int i2) {
            super(i, i2);
            this.f3785a = -1;
            this.f3787b = -1;
            this.f3789c = -1.0f;
            this.f3791d = -1;
            this.f3793e = -1;
            this.f3795f = -1;
            this.f3797g = -1;
            this.f3799h = -1;
            this.f3801i = -1;
            this.f3803j = -1;
            this.f3805k = -1;
            this.f3807l = -1;
            this.f3809m = -1;
            this.f3811n = 0;
            this.f3813o = 0.0f;
            this.f3814p = -1;
            this.f3815q = -1;
            this.f3816r = -1;
            this.f3817s = -1;
            this.f3818t = -1;
            this.f3819u = -1;
            this.f3820v = -1;
            this.f3821w = -1;
            this.f3822x = -1;
            this.f3823y = -1;
            this.f3824z = 0.5f;
            this.f3759A = 0.5f;
            this.f3760B = null;
            this.f3761C = 1;
            this.f3762D = -1.0f;
            this.f3763E = -1.0f;
            this.f3764F = 0;
            this.f3765G = 0;
            this.f3766H = 0;
            this.f3767I = 0;
            this.f3768J = 0;
            this.f3769K = 0;
            this.f3770L = 0;
            this.f3771M = 0;
            this.f3772N = 1.0f;
            this.f3773O = 1.0f;
            this.f3774P = -1;
            this.f3775Q = -1;
            this.f3776R = -1;
            this.f3777S = false;
            this.f3778T = false;
            this.f3779U = null;
            this.f3780V = true;
            this.f3781W = true;
            this.f3782X = false;
            this.f3783Y = false;
            this.f3784Z = false;
            this.f3786a0 = false;
            this.f3788b0 = false;
            this.f3790c0 = -1;
            this.f3792d0 = -1;
            this.f3794e0 = -1;
            this.f3796f0 = -1;
            this.f3798g0 = -1;
            this.f3800h0 = -1;
            this.f3802i0 = 0.5f;
            this.f3810m0 = new C7561e();
        }

        public C1255b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3785a = -1;
            this.f3787b = -1;
            this.f3789c = -1.0f;
            this.f3791d = -1;
            this.f3793e = -1;
            this.f3795f = -1;
            this.f3797g = -1;
            this.f3799h = -1;
            this.f3801i = -1;
            this.f3803j = -1;
            this.f3805k = -1;
            this.f3807l = -1;
            this.f3809m = -1;
            this.f3811n = 0;
            this.f3813o = 0.0f;
            this.f3814p = -1;
            this.f3815q = -1;
            this.f3816r = -1;
            this.f3817s = -1;
            this.f3818t = -1;
            this.f3819u = -1;
            this.f3820v = -1;
            this.f3821w = -1;
            this.f3822x = -1;
            this.f3823y = -1;
            this.f3824z = 0.5f;
            this.f3759A = 0.5f;
            this.f3760B = null;
            this.f3761C = 1;
            this.f3762D = -1.0f;
            this.f3763E = -1.0f;
            this.f3764F = 0;
            this.f3765G = 0;
            this.f3766H = 0;
            this.f3767I = 0;
            this.f3768J = 0;
            this.f3769K = 0;
            this.f3770L = 0;
            this.f3771M = 0;
            this.f3772N = 1.0f;
            this.f3773O = 1.0f;
            this.f3774P = -1;
            this.f3775Q = -1;
            this.f3776R = -1;
            this.f3777S = false;
            this.f3778T = false;
            this.f3779U = null;
            this.f3780V = true;
            this.f3781W = true;
            this.f3782X = false;
            this.f3783Y = false;
            this.f3784Z = false;
            this.f3786a0 = false;
            this.f3788b0 = false;
            this.f3790c0 = -1;
            this.f3792d0 = -1;
            this.f3794e0 = -1;
            this.f3796f0 = -1;
            this.f3798g0 = -1;
            this.f3800h0 = -1;
            this.f3802i0 = 0.5f;
            this.f3810m0 = new C7561e();
        }
    }
}
