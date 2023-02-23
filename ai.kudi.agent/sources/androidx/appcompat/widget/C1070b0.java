package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.C1395f;
import java.lang.reflect.Field;
import p201g.p202a.C7452a;
import p201g.p202a.p205l.p206a.C7477c;
import p201g.p227h.p238l.C7687c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownListView.java */
/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes2.dex */
public class C1070b0 extends ListView {

    /* renamed from: A */
    private boolean f3237A;

    /* renamed from: B */
    private boolean f3238B;

    /* renamed from: C */
    private boolean f3239C;

    /* renamed from: D */
    private C7687c0 f3240D;

    /* renamed from: E */
    private C1395f f3241E;

    /* renamed from: F */
    RunnableC1072b f3242F;

    /* renamed from: c */
    private final Rect f3243c;

    /* renamed from: d */
    private int f3244d;

    /* renamed from: e */
    private int f3245e;

    /* renamed from: f */
    private int f3246f;

    /* renamed from: w */
    private int f3247w;

    /* renamed from: x */
    private int f3248x;

    /* renamed from: y */
    private Field f3249y;

    /* renamed from: z */
    private C1071a f3250z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* renamed from: androidx.appcompat.widget.b0$a */
    /* loaded from: classes2.dex */
    public static class C1071a extends C7477c {

        /* renamed from: d */
        private boolean f3251d;

        C1071a(Drawable drawable) {
            super(drawable);
            this.f3251d = true;
        }

        /* renamed from: c */
        void m37269c(boolean z) {
            this.f3251d = z;
        }

        @Override // p201g.p202a.p205l.p206a.C7477c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f3251d) {
                super.draw(canvas);
            }
        }

        @Override // p201g.p202a.p205l.p206a.C7477c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f3251d) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p201g.p202a.p205l.p206a.C7477c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3251d) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p201g.p202a.p205l.p206a.C7477c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f3251d) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p201g.p202a.p205l.p206a.C7477c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3251d) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* renamed from: androidx.appcompat.widget.b0$b */
    /* loaded from: classes2.dex */
    public class RunnableC1072b implements Runnable {
        RunnableC1072b() {
        }

        /* renamed from: a */
        public void m37268a() {
            C1070b0 c1070b0 = C1070b0.this;
            c1070b0.f3242F = null;
            c1070b0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m37267b() {
            C1070b0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C1070b0 c1070b0 = C1070b0.this;
            c1070b0.f3242F = null;
            c1070b0.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1070b0(Context context, boolean z) {
        super(context, null, C7452a.dropDownListViewStyle);
        this.f3243c = new Rect();
        this.f3244d = 0;
        this.f3245e = 0;
        this.f3246f = 0;
        this.f3247w = 0;
        this.f3238B = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3249y = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m37280a() {
        this.f3239C = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3248x - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C7687c0 c7687c0 = this.f3240D;
        if (c7687c0 != null) {
            c7687c0.m17822b();
            this.f3240D = null;
        }
    }

    /* renamed from: b */
    private void m37279b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m37278c(Canvas canvas) {
        Drawable selector;
        if (this.f3243c.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f3243c);
        selector.draw(canvas);
    }

    /* renamed from: f */
    private void m37275f(int i, View view) {
        Rect rect = this.f3243c;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3244d;
        rect.top -= this.f3245e;
        rect.right += this.f3246f;
        rect.bottom += this.f3247w;
        try {
            boolean z = this.f3249y.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f3249y.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m37274g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m37275f(i, view);
        if (z) {
            Rect rect = this.f3243c;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C1365a.m36191k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m37273h(int i, View view, float f, float f2) {
        m37274g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C1365a.m36191k(selector, f, f2);
    }

    /* renamed from: i */
    private void m37272i(View view, int i, float f, float f2) {
        View childAt;
        this.f3239C = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f3248x;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f3248x = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m37273h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m37271j() {
        return this.f3239C;
    }

    /* renamed from: k */
    private void m37270k() {
        Drawable selector = getSelector();
        if (selector != null && m37271j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C1071a c1071a = this.f3250z;
        if (c1071a != null) {
            c1071a.m37269c(z);
        }
    }

    /* renamed from: d */
    public int m37277d(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            if (i10 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m37278c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f3242F != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m37270k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m37276e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m37272i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m37279b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m37280a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f3241E
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f3241E = r9
        L5a:
            androidx.core.widget.f r9 = r7.f3241E
            r9.m36145m(r2)
            androidx.core.widget.f r9 = r7.f3241E
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.f3241E
            if (r8 == 0) goto L6c
            r8.m36145m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1070b0.m37276e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f3238B || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f3238B || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f3238B || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f3238B && this.f3237A) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f3242F = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3242F == null) {
            RunnableC1072b runnableC1072b = new RunnableC1072b();
            this.f3242F = runnableC1072b;
            runnableC1072b.m37267b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m37270k();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3248x = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1072b runnableC1072b = this.f3242F;
        if (runnableC1072b != null) {
            runnableC1072b.m37268a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f3237A = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1071a c1071a = drawable != null ? new C1071a(drawable) : null;
        this.f3250z = c1071a;
        super.setSelector(c1071a);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3244d = rect.left;
        this.f3245e = rect.top;
        this.f3246f = rect.right;
        this.f3247w = rect.bottom;
    }
}
