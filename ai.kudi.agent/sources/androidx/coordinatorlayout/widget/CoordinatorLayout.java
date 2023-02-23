package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p201g.p226g.C7596a;
import p201g.p226g.C7597b;
import p201g.p226g.C7598c;
import p201g.p227h.p237k.C7670c;
import p201g.p227h.p237k.C7674g;
import p201g.p227h.p237k.InterfaceC7672e;
import p201g.p227h.p238l.C7693e;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7751p;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7748m;
import p201g.p227h.p238l.InterfaceC7749n;
import p201g.p227h.p238l.InterfaceC7752q;
import p201g.p243j.p244a.AbstractC7781a;
/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC7748m, InterfaceC7749n {

    /* renamed from: M */
    static final String f3997M;

    /* renamed from: N */
    static final Class<?>[] f3998N;

    /* renamed from: O */
    static final ThreadLocal<Map<String, Constructor<AbstractC1280c>>> f3999O;

    /* renamed from: P */
    static final Comparator<View> f4000P;

    /* renamed from: Q */
    private static final InterfaceC7672e<Rect> f4001Q;

    /* renamed from: A */
    private boolean f4002A;

    /* renamed from: B */
    private int[] f4003B;

    /* renamed from: C */
    private View f4004C;

    /* renamed from: D */
    private View f4005D;

    /* renamed from: E */
    private ViewTreeObserver$OnPreDrawListenerC1284g f4006E;

    /* renamed from: F */
    private boolean f4007F;

    /* renamed from: G */
    private C7698g0 f4008G;

    /* renamed from: H */
    private boolean f4009H;

    /* renamed from: I */
    private Drawable f4010I;

    /* renamed from: J */
    ViewGroup.OnHierarchyChangeListener f4011J;

    /* renamed from: K */
    private InterfaceC7752q f4012K;

    /* renamed from: L */
    private final C7751p f4013L;

    /* renamed from: c */
    private final List<View> f4014c;

    /* renamed from: d */
    private final C1288a<View> f4015d;

    /* renamed from: e */
    private final List<View> f4016e;

    /* renamed from: f */
    private final List<View> f4017f;

    /* renamed from: w */
    private Paint f4018w;

    /* renamed from: x */
    private final int[] f4019x;

    /* renamed from: y */
    private final int[] f4020y;

    /* renamed from: z */
    private boolean f4021z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes2.dex */
    public class C1278a implements InterfaceC7752q {
        C1278a() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7752q
        /* renamed from: a */
        public C7698g0 mo17573a(View view, C7698g0 c7698g0) {
            CoordinatorLayout.this.m36550Q(c7698g0);
            return c7698g0;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1279b {
        AbstractC1280c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1280c<V extends View> {
        public AbstractC1280c() {
        }

        /* renamed from: A */
        public boolean mo27481A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return m36511z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m36522B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo27479C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m36522B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo26182D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m36521a(CoordinatorLayout coordinatorLayout, V v) {
            return m36519d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo26949b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m36520c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float m36519d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo26179e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C7698g0 m36518f(CoordinatorLayout coordinatorLayout, V v, C7698g0 c7698g0) {
            return c7698g0;
        }

        /* renamed from: g */
        public void mo26183g(C1283f c1283f) {
        }

        /* renamed from: h */
        public boolean mo26207h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo27656i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo27447j() {
        }

        /* renamed from: k */
        public boolean mo26620k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo26206l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo27612m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean m36517n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo27441o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m36516p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo27438q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m36516p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void m36515r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void m36514s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m36515r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo27434t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            m36514s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void m36513u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void m36512v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m36513u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo27655w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo27429x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo27427y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean m36511z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public AbstractC1280c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface InterfaceC1281d {
        Class value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes2.dex */
    private class ViewGroup$OnHierarchyChangeListenerC1282e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC1282e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4011J;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m36565B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4011J;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnPreDrawListenerC1284g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC1284g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m36565B(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    /* loaded from: classes2.dex */
    static class C1287i implements Comparator<View> {
        C1287i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float m17541O = C7759x.m17541O(view);
            float m17541O2 = C7759x.m17541O(view2);
            if (m17541O > m17541O2) {
                return -1;
            }
            return m17541O < m17541O2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f3997M = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f4000P = new C1287i();
        } else {
            f4000P = null;
        }
        f3998N = new Class[]{Context.class, AttributeSet.class};
        f3999O = new ThreadLocal<>();
        f4001Q = new C7674g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7596a.coordinatorLayoutStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    static AbstractC1280c m36562E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f3997M)) {
            str = f3997M + '.' + str;
        }
        try {
            Map<String, Constructor<AbstractC1280c>> map = f3999O.get();
            if (map == null) {
                map = new HashMap<>();
                f3999O.set(map);
            }
            Constructor<AbstractC1280c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3998N);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: F */
    private boolean m36561F(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f4016e;
        m36529t(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C1283f c1283f = (C1283f) view.getLayoutParams();
            AbstractC1280c m36505f = c1283f.m36505f();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && m36505f != null) {
                    if (i == 0) {
                        z = m36505f.mo26620k(this, view, motionEvent);
                    } else if (i == 1) {
                        z = m36505f.mo26182D(this, view, motionEvent);
                    }
                    if (z) {
                        this.f4004C = view;
                    }
                }
                boolean m36508c = c1283f.m36508c();
                boolean m36502i = c1283f.m36502i(this, view);
                z2 = m36502i && !m36508c;
                if (m36502i && !z2) {
                    break;
                }
            } else if (m36505f != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    m36505f.mo26620k(this, view, motionEvent2);
                } else if (i == 1) {
                    m36505f.mo26182D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: G */
    private void m36560G() {
        this.f4014c.clear();
        this.f4015d.m36484c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1283f m36530s = m36530s(childAt);
            m36530s.m36507d(this, childAt);
            this.f4015d.m36485b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (m36530s.m36509b(this, childAt, childAt2)) {
                        if (!this.f4015d.m36483d(childAt2)) {
                            this.f4015d.m36485b(childAt2);
                        }
                        this.f4015d.m36486a(childAt2, childAt);
                    }
                }
            }
        }
        this.f4014c.addAll(this.f4015d.m36478i());
        Collections.reverse(this.f4014c);
    }

    /* renamed from: I */
    private static void m36558I(Rect rect) {
        rect.setEmpty();
        f4001Q.mo11983a(rect);
    }

    /* renamed from: K */
    private void m36556K(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC1280c m36505f = ((C1283f) childAt.getLayoutParams()).m36505f();
            if (m36505f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    m36505f.mo26620k(this, childAt, obtain);
                } else {
                    m36505f.mo26182D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C1283f) getChildAt(i2).getLayoutParams()).m36498m();
        }
        this.f4004C = null;
        this.f4021z = false;
    }

    /* renamed from: L */
    private static int m36555L(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: M */
    private static int m36554M(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: N */
    private static int m36553N(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: O */
    private void m36552O(View view, int i) {
        C1283f c1283f = (C1283f) view.getLayoutParams();
        int i2 = c1283f.f4032i;
        if (i2 != i) {
            C7759x.m17530Z(view, i - i2);
            c1283f.f4032i = i;
        }
    }

    /* renamed from: P */
    private void m36551P(View view, int i) {
        C1283f c1283f = (C1283f) view.getLayoutParams();
        int i2 = c1283f.f4033j;
        if (i2 != i) {
            C7759x.m17528a0(view, i - i2);
            c1283f.f4033j = i;
        }
    }

    /* renamed from: R */
    private void m36549R() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (C7759x.m17479z(this)) {
            if (this.f4012K == null) {
                this.f4012K = new C1278a();
            }
            C7759x.m17562C0(this, this.f4012K);
            setSystemUiVisibility(1280);
            return;
        }
        C7759x.m17562C0(this, null);
    }

    /* renamed from: a */
    private static Rect m36548a() {
        Rect mo11982b = f4001Q.mo11982b();
        return mo11982b == null ? new Rect() : mo11982b;
    }

    /* renamed from: c */
    private static int m36546c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: d */
    private void m36545d(C1283f c1283f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1283f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c1283f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1283f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c1283f).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: e */
    private C7698g0 m36544e(C7698g0 c7698g0) {
        AbstractC1280c m36505f;
        if (c7698g0.m17778p()) {
            return c7698g0;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C7759x.m17479z(childAt) && (m36505f = ((C1283f) childAt.getLayoutParams()).m36505f()) != null) {
                m36505f.m36518f(this, childAt, c7698g0);
                if (c7698g0.m17778p()) {
                    break;
                }
            }
        }
        return c7698g0;
    }

    /* renamed from: p */
    private void m36533p(View view, int i, Rect rect, Rect rect2, C1283f c1283f, int i2, int i3) {
        int width;
        int height;
        int m17805b = C7693e.m17805b(m36555L(c1283f.f4026c), i);
        int m17805b2 = C7693e.m17805b(m36554M(c1283f.f4027d), i);
        int i4 = m17805b & 7;
        int i5 = m17805b & 112;
        int i6 = m17805b2 & 7;
        int i7 = m17805b2 & 112;
        if (i6 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i7 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: q */
    private int m36532q(int i) {
        int[] iArr = this.f4003B;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: t */
    private void m36529t(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f4000P;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: u */
    private boolean m36528u(View view) {
        return this.f4015d.m36477j(view);
    }

    /* renamed from: w */
    private void m36526w(View view, int i) {
        C1283f c1283f = (C1283f) view.getLayoutParams();
        Rect m36548a = m36548a();
        m36548a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1283f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1283f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1283f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1283f).bottomMargin);
        if (this.f4008G != null && C7759x.m17479z(this) && !C7759x.m17479z(view)) {
            m36548a.left += this.f4008G.m17784j();
            m36548a.top += this.f4008G.m17782l();
            m36548a.right -= this.f4008G.m17783k();
            m36548a.bottom -= this.f4008G.m17785i();
        }
        Rect m36548a2 = m36548a();
        C7693e.m17806a(m36554M(c1283f.f4026c), view.getMeasuredWidth(), view.getMeasuredHeight(), m36548a, m36548a2, i);
        view.layout(m36548a2.left, m36548a2.top, m36548a2.right, m36548a2.bottom);
        m36558I(m36548a);
        m36558I(m36548a2);
    }

    /* renamed from: x */
    private void m36525x(View view, View view2, int i) {
        Rect m36548a = m36548a();
        Rect m36548a2 = m36548a();
        try {
            m36535n(view2, m36548a);
            m36534o(view, i, m36548a, m36548a2);
            view.layout(m36548a2.left, m36548a2.top, m36548a2.right, m36548a2.bottom);
        } finally {
            m36558I(m36548a);
            m36558I(m36548a2);
        }
    }

    /* renamed from: y */
    private void m36524y(View view, int i, int i2) {
        C1283f c1283f = (C1283f) view.getLayoutParams();
        int m17805b = C7693e.m17805b(m36553N(c1283f.f4026c), i2);
        int i3 = m17805b & 7;
        int i4 = m17805b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int m36532q = m36532q(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            m36532q += measuredWidth / 2;
        } else if (i3 == 5) {
            m36532q += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1283f).leftMargin, Math.min(m36532q, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c1283f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1283f).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1283f).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: z */
    private void m36523z(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C7759x.m17535U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C1283f c1283f = (C1283f) view.getLayoutParams();
            AbstractC1280c m36505f = c1283f.m36505f();
            Rect m36548a = m36548a();
            Rect m36548a2 = m36548a();
            m36548a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m36505f != null && m36505f.mo26949b(this, view, m36548a)) {
                if (!m36548a2.contains(m36548a)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m36548a.toShortString() + " | Bounds:" + m36548a2.toShortString());
                }
            } else {
                m36548a.set(m36548a2);
            }
            m36558I(m36548a2);
            if (m36548a.isEmpty()) {
                m36558I(m36548a);
                return;
            }
            int m17805b = C7693e.m17805b(c1283f.f4031h, i);
            boolean z3 = true;
            if ((m17805b & 48) != 48 || (i6 = (m36548a.top - ((ViewGroup.MarginLayoutParams) c1283f).topMargin) - c1283f.f4033j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m36551P(view, i7 - i6);
                z = true;
            }
            if ((m17805b & 80) == 80 && (height = ((getHeight() - m36548a.bottom) - ((ViewGroup.MarginLayoutParams) c1283f).bottomMargin) + c1283f.f4033j) < (i5 = rect.bottom)) {
                m36551P(view, height - i5);
                z = true;
            }
            if (!z) {
                m36551P(view, 0);
            }
            if ((m17805b & 3) != 3 || (i3 = (m36548a.left - ((ViewGroup.MarginLayoutParams) c1283f).leftMargin) - c1283f.f4032i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m36552O(view, i4 - i3);
                z2 = true;
            }
            if ((m17805b & 5) != 5 || (width = ((getWidth() - m36548a.right) - ((ViewGroup.MarginLayoutParams) c1283f).rightMargin) + c1283f.f4032i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m36552O(view, width - i2);
            }
            if (!z3) {
                m36552O(view, 0);
            }
            m36558I(m36548a);
        }
    }

    /* renamed from: A */
    void m36566A(View view, int i) {
        AbstractC1280c m36505f;
        C1283f c1283f = (C1283f) view.getLayoutParams();
        if (c1283f.f4034k != null) {
            Rect m36548a = m36548a();
            Rect m36548a2 = m36548a();
            Rect m36548a3 = m36548a();
            m36535n(c1283f.f4034k, m36548a);
            boolean z = false;
            m36538k(view, false, m36548a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m36533p(view, i, m36548a, m36548a3, c1283f, measuredWidth, measuredHeight);
            z = (m36548a3.left == m36548a2.left && m36548a3.top == m36548a2.top) ? true : true;
            m36545d(c1283f, m36548a3, measuredWidth, measuredHeight);
            int i2 = m36548a3.left - m36548a2.left;
            int i3 = m36548a3.top - m36548a2.top;
            if (i2 != 0) {
                C7759x.m17530Z(view, i2);
            }
            if (i3 != 0) {
                C7759x.m17528a0(view, i3);
            }
            if (z && (m36505f = c1283f.m36505f()) != null) {
                m36505f.mo26207h(this, view, c1283f.f4034k);
            }
            m36558I(m36548a);
            m36558I(m36548a2);
            m36558I(m36548a3);
        }
    }

    /* renamed from: B */
    final void m36565B(int i) {
        boolean z;
        int m17563C = C7759x.m17563C(this);
        int size = this.f4014c.size();
        Rect m36548a = m36548a();
        Rect m36548a2 = m36548a();
        Rect m36548a3 = m36548a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f4014c.get(i2);
            C1283f c1283f = (C1283f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c1283f.f4035l == this.f4014c.get(i3)) {
                        m36566A(view, m17563C);
                    }
                }
                m36538k(view, true, m36548a2);
                if (c1283f.f4030g != 0 && !m36548a2.isEmpty()) {
                    int m17805b = C7693e.m17805b(c1283f.f4030g, m17563C);
                    int i4 = m17805b & 112;
                    if (i4 == 48) {
                        m36548a.top = Math.max(m36548a.top, m36548a2.bottom);
                    } else if (i4 == 80) {
                        m36548a.bottom = Math.max(m36548a.bottom, getHeight() - m36548a2.top);
                    }
                    int i5 = m17805b & 7;
                    if (i5 == 3) {
                        m36548a.left = Math.max(m36548a.left, m36548a2.right);
                    } else if (i5 == 5) {
                        m36548a.right = Math.max(m36548a.right, getWidth() - m36548a2.left);
                    }
                }
                if (c1283f.f4031h != 0 && view.getVisibility() == 0) {
                    m36523z(view, m36548a, m17563C);
                }
                if (i != 2) {
                    m36531r(view, m36548a3);
                    if (!m36548a3.equals(m36548a2)) {
                        m36559H(view, m36548a2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f4014c.get(i6);
                    C1283f c1283f2 = (C1283f) view2.getLayoutParams();
                    AbstractC1280c m36505f = c1283f2.m36505f();
                    if (m36505f != null && m36505f.mo26179e(this, view2, view)) {
                        if (i == 0 && c1283f2.m36504g()) {
                            c1283f2.m36500k();
                        } else {
                            if (i != 2) {
                                z = m36505f.mo26207h(this, view2, view);
                            } else {
                                m36505f.mo27656i(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c1283f2.m36495p(z);
                            }
                        }
                    }
                }
            }
        }
        m36558I(m36548a);
        m36558I(m36548a2);
        m36558I(m36548a3);
    }

    /* renamed from: C */
    public void m36564C(View view, int i) {
        C1283f c1283f = (C1283f) view.getLayoutParams();
        if (!c1283f.m36510a()) {
            View view2 = c1283f.f4034k;
            if (view2 != null) {
                m36525x(view, view2, i);
                return;
            }
            int i2 = c1283f.f4028e;
            if (i2 >= 0) {
                m36524y(view, i2, i);
                return;
            } else {
                m36526w(view, i);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* renamed from: D */
    public void m36563D(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: H */
    void m36559H(View view, Rect rect) {
        ((C1283f) view.getLayoutParams()).m36494q(rect);
    }

    /* renamed from: J */
    void m36557J() {
        if (this.f4002A && this.f4006E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4006E);
        }
        this.f4007F = false;
    }

    /* renamed from: Q */
    final C7698g0 m36550Q(C7698g0 c7698g0) {
        if (!C7670c.m17875a(this.f4008G, c7698g0)) {
            this.f4008G = c7698g0;
            boolean z = true;
            boolean z2 = c7698g0 != null && c7698g0.m17782l() > 0;
            this.f4009H = z2;
            setWillNotDraw((z2 || getBackground() != null) ? false : false);
            m36544e(c7698g0);
            requestLayout();
        }
        return c7698g0;
    }

    /* renamed from: b */
    void m36547b() {
        if (this.f4002A) {
            if (this.f4006E == null) {
                this.f4006E = new ViewTreeObserver$OnPreDrawListenerC1284g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4006E);
        }
        this.f4007F = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1283f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C1283f c1283f = (C1283f) view.getLayoutParams();
        AbstractC1280c abstractC1280c = c1283f.f4024a;
        if (abstractC1280c != null) {
            float m36519d = abstractC1280c.m36519d(this, view);
            if (m36519d > 0.0f) {
                if (this.f4018w == null) {
                    this.f4018w = new Paint();
                }
                this.f4018w.setColor(c1283f.f4024a.m36520c(this, view));
                this.f4018w.setAlpha(m36546c(Math.round(m36519d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f4018w);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4010I;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void m36543f(View view) {
        List m36480g = this.f4015d.m36480g(view);
        if (m36480g == null || m36480g.isEmpty()) {
            return;
        }
        for (int i = 0; i < m36480g.size(); i++) {
            View view2 = (View) m36480g.get(i);
            AbstractC1280c m36505f = ((C1283f) view2.getLayoutParams()).m36505f();
            if (m36505f != null) {
                m36505f.mo26207h(this, view2, view);
            }
        }
    }

    /* renamed from: g */
    void m36542g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m36528u(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.f4007F) {
            if (z) {
                m36547b();
            } else {
                m36557J();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        m36560G();
        return Collections.unmodifiableList(this.f4014c);
    }

    public final C7698g0 getLastWindowInsets() {
        return this.f4008G;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4013L.m17578a();
    }

    public Drawable getStatusBarBackground() {
        return this.f4010I;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public C1283f generateDefaultLayoutParams() {
        return new C1283f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public C1283f generateLayoutParams(AttributeSet attributeSet) {
        return new C1283f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j */
    public C1283f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1283f) {
            return new C1283f((C1283f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1283f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1283f(layoutParams);
    }

    /* renamed from: k */
    void m36538k(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m36535n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: l */
    public List<View> m36537l(View view) {
        List<View> m36479h = this.f4015d.m36479h(view);
        this.f4017f.clear();
        if (m36479h != null) {
            this.f4017f.addAll(m36479h);
        }
        return this.f4017f;
    }

    /* renamed from: m */
    public List<View> m36536m(View view) {
        List m36480g = this.f4015d.m36480g(view);
        this.f4017f.clear();
        if (m36480g != null) {
            this.f4017f.addAll(m36480g);
        }
        return this.f4017f;
    }

    /* renamed from: n */
    void m36535n(View view, Rect rect) {
        C1289b.m36475a(this, view, rect);
    }

    /* renamed from: o */
    void m36534o(View view, int i, Rect rect, Rect rect2) {
        C1283f c1283f = (C1283f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m36533p(view, i, rect, rect2, c1283f, measuredWidth, measuredHeight);
        m36545d(c1283f, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m36556K(false);
        if (this.f4007F) {
            if (this.f4006E == null) {
                this.f4006E = new ViewTreeObserver$OnPreDrawListenerC1284g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4006E);
        }
        if (this.f4008G == null && C7759x.m17479z(this)) {
            C7759x.m17504m0(this);
        }
        this.f4002A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m36556K(false);
        if (this.f4007F && this.f4006E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4006E);
        }
        View view = this.f4005D;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f4002A = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4009H || this.f4010I == null) {
            return;
        }
        C7698g0 c7698g0 = this.f4008G;
        int m17782l = c7698g0 != null ? c7698g0.m17782l() : 0;
        if (m17782l > 0) {
            this.f4010I.setBounds(0, 0, getWidth(), m17782l);
            this.f4010I.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m36556K(true);
        }
        boolean m36561F = m36561F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m36556K(true);
        }
        return m36561F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC1280c m36505f;
        int m17563C = C7759x.m17563C(this);
        int size = this.f4014c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f4014c.get(i5);
            if (view.getVisibility() != 8 && ((m36505f = ((C1283f) view.getLayoutParams()).m36505f()) == null || !m36505f.mo26206l(this, view, m17563C))) {
                m36564C(view, m17563C);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.mo27612m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC1280c m36505f;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1283f c1283f = (C1283f) childAt.getLayoutParams();
                if (c1283f.m36501j(0) && (m36505f = c1283f.m36505f()) != null) {
                    z2 |= m36505f.m36517n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m36565B(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC1280c m36505f;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1283f c1283f = (C1283f) childAt.getLayoutParams();
                if (c1283f.m36501j(0) && (m36505f = c1283f.m36505f()) != null) {
                    z |= m36505f.mo27441o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1285h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1285h c1285h = (C1285h) parcelable;
        super.onRestoreInstanceState(c1285h.m17424a());
        SparseArray<Parcelable> sparseArray = c1285h.f4042e;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1280c m36505f = m36530s(childAt).m36505f();
            if (id != -1 && m36505f != null && (parcelable2 = sparseArray.get(id)) != null) {
                m36505f.mo27429x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo27427y;
        C1285h c1285h = new C1285h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1280c m36505f = ((C1283f) childAt.getLayoutParams()).m36505f();
            if (id != -1 && m36505f != null && (mo27427y = m36505f.mo27427y(this, childAt)) != null) {
                sparseArray.append(id, mo27427y);
            }
        }
        c1285h.f4042e = sparseArray;
        return c1285h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f4004C
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m36561F(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f4004C
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C1283f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m36505f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f4004C
            boolean r6 = r6.mo26182D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.f4004C
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m36556K(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    void m36531r(View view, Rect rect) {
        rect.set(((C1283f) view.getLayoutParams()).m36503h());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC1280c m36505f = ((C1283f) view.getLayoutParams()).m36505f();
        if (m36505f == null || !m36505f.mo27655w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f4021z) {
            return;
        }
        m36556K(false);
        this.f4021z = true;
    }

    /* renamed from: s */
    C1283f m36530s(View view) {
        C1283f c1283f = (C1283f) view.getLayoutParams();
        if (!c1283f.f4025b) {
            if (view instanceof InterfaceC1279b) {
                AbstractC1280c behavior = ((InterfaceC1279b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c1283f.m36496o(behavior);
                c1283f.f4025b = true;
            } else {
                InterfaceC1281d interfaceC1281d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC1281d = (InterfaceC1281d) cls.getAnnotation(InterfaceC1281d.class);
                    if (interfaceC1281d != null) {
                        break;
                    }
                }
                if (interfaceC1281d != null) {
                    try {
                        c1283f.m36496o((AbstractC1280c) interfaceC1281d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC1281d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                c1283f.f4025b = true;
            }
        }
        return c1283f;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m36549R();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4011J = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4010I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f4010I = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f4010I.setState(getDrawableState());
                }
                C1365a.m36189m(this.f4010I, C7759x.m17563C(this));
                this.f4010I.setVisible(getVisibility() == 0, false);
                this.f4010I.setCallback(this);
            }
            C7759x.m17516g0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C1335a.m36322f(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f4010I;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f4010I.setVisible(z, false);
    }

    /* renamed from: v */
    public boolean m36527v(View view, int i, int i2) {
        Rect m36548a = m36548a();
        m36535n(view, m36548a);
        try {
            return m36548a.contains(i, i2);
        } finally {
            m36558I(m36548a);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4010I;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.f4014c = new ArrayList();
        this.f4015d = new C1288a<>();
        this.f4016e = new ArrayList();
        this.f4017f = new ArrayList();
        this.f4019x = new int[2];
        this.f4020y = new int[2];
        this.f4013L = new C7751p(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7598c.CoordinatorLayout, 0, C7597b.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7598c.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C7598c.CoordinatorLayout, attributeSet, obtainStyledAttributes, 0, C7597b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C7598c.CoordinatorLayout, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C7598c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f4003B = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f4003B.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f4003B;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f4010I = obtainStyledAttributes.getDrawable(C7598c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m36549R();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC1282e());
        if (C7759x.m17567A(this) == 0) {
            C7759x.m17478z0(this, 1);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC1280c m36505f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1283f c1283f = (C1283f) childAt.getLayoutParams();
                if (c1283f.m36501j(i3) && (m36505f = c1283f.m36505f()) != null) {
                    int[] iArr2 = this.f4019x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m36505f.mo27438q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f4019x;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f4019x;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m36565B(1);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f4020y);
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC1280c m36505f;
        this.f4013L.m17576c(view, view2, i, i2);
        this.f4005D = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C1283f c1283f = (C1283f) childAt.getLayoutParams();
            if (c1283f.m36501j(i2) && (m36505f = c1283f.m36505f()) != null) {
                m36505f.m36512v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1283f c1283f = (C1283f) childAt.getLayoutParams();
                AbstractC1280c m36505f = c1283f.m36505f();
                if (m36505f != null) {
                    boolean mo27481A = m36505f.mo27481A(this, childAt, view, view2, i, i2);
                    z |= mo27481A;
                    c1283f.m36493r(i2, mo27481A);
                } else {
                    c1283f.m36493r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // p201g.p227h.p238l.InterfaceC7748m
    public void onStopNestedScroll(View view, int i) {
        this.f4013L.m17574e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1283f c1283f = (C1283f) childAt.getLayoutParams();
            if (c1283f.m36501j(i)) {
                AbstractC1280c m36505f = c1283f.m36505f();
                if (m36505f != null) {
                    m36505f.mo27479C(this, childAt, view, i);
                }
                c1283f.m36499l(i);
                c1283f.m36500k();
            }
        }
        this.f4005D = null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7749n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC1280c m36505f;
        int min;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C1283f c1283f = (C1283f) childAt.getLayoutParams();
                if (c1283f.m36501j(i5) && (m36505f = c1283f.m36505f()) != null) {
                    int[] iArr2 = this.f4019x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m36505f.mo27434t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f4019x;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    if (i4 > 0) {
                        min = Math.max(i7, this.f4019x[1]);
                    } else {
                        min = Math.min(i7, this.f4019x[1]);
                    }
                    i7 = min;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m36565B(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes2.dex */
    public static class C1285h extends AbstractC7781a {
        public static final Parcelable.Creator<C1285h> CREATOR = new C1286a();

        /* renamed from: e */
        SparseArray<Parcelable> f4042e;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        /* loaded from: classes2.dex */
        static class C1286a implements Parcelable.ClassLoaderCreator<C1285h> {
            C1286a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1285h createFromParcel(Parcel parcel) {
                return new C1285h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1285h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1285h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1285h[] newArray(int i) {
                return new C1285h[i];
            }
        }

        public C1285h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f4042e = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f4042e.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f4042e;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f4042e.keyAt(i2);
                parcelableArr[i2] = this.f4042e.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public C1285h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes2.dex */
    public static class C1283f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC1280c f4024a;

        /* renamed from: b */
        boolean f4025b;

        /* renamed from: c */
        public int f4026c;

        /* renamed from: d */
        public int f4027d;

        /* renamed from: e */
        public int f4028e;

        /* renamed from: f */
        int f4029f;

        /* renamed from: g */
        public int f4030g;

        /* renamed from: h */
        public int f4031h;

        /* renamed from: i */
        int f4032i;

        /* renamed from: j */
        int f4033j;

        /* renamed from: k */
        View f4034k;

        /* renamed from: l */
        View f4035l;

        /* renamed from: m */
        private boolean f4036m;

        /* renamed from: n */
        private boolean f4037n;

        /* renamed from: o */
        private boolean f4038o;

        /* renamed from: p */
        private boolean f4039p;

        /* renamed from: q */
        final Rect f4040q;

        public C1283f(int i, int i2) {
            super(i, i2);
            this.f4025b = false;
            this.f4026c = 0;
            this.f4027d = 0;
            this.f4028e = -1;
            this.f4029f = -1;
            this.f4030g = 0;
            this.f4031h = 0;
            this.f4040q = new Rect();
        }

        /* renamed from: n */
        private void m36497n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f4029f);
            this.f4034k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f4035l = null;
                    this.f4034k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f4029f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f4035l = null;
                    this.f4034k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f4035l = null;
                            this.f4034k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f4035l = findViewById;
            }
        }

        /* renamed from: s */
        private boolean m36492s(View view, int i) {
            int m17805b = C7693e.m17805b(((C1283f) view.getLayoutParams()).f4030g, i);
            return m17805b != 0 && (C7693e.m17805b(this.f4031h, i) & m17805b) == m17805b;
        }

        /* renamed from: t */
        private boolean m36491t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f4034k.getId() != this.f4029f) {
                return false;
            }
            View view2 = this.f4034k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f4035l = null;
                    this.f4034k = null;
                    return false;
                }
            }
            this.f4035l = view2;
            return true;
        }

        /* renamed from: a */
        boolean m36510a() {
            return this.f4034k == null && this.f4029f != -1;
        }

        /* renamed from: b */
        boolean m36509b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC1280c abstractC1280c;
            return view2 == this.f4035l || m36492s(view2, C7759x.m17563C(coordinatorLayout)) || ((abstractC1280c = this.f4024a) != null && abstractC1280c.mo26179e(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        boolean m36508c() {
            if (this.f4024a == null) {
                this.f4036m = false;
            }
            return this.f4036m;
        }

        /* renamed from: d */
        View m36507d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f4029f == -1) {
                this.f4035l = null;
                this.f4034k = null;
                return null;
            }
            if (this.f4034k == null || !m36491t(view, coordinatorLayout)) {
                m36497n(view, coordinatorLayout);
            }
            return this.f4034k;
        }

        /* renamed from: e */
        public int m36506e() {
            return this.f4029f;
        }

        /* renamed from: f */
        public AbstractC1280c m36505f() {
            return this.f4024a;
        }

        /* renamed from: g */
        boolean m36504g() {
            return this.f4039p;
        }

        /* renamed from: h */
        Rect m36503h() {
            return this.f4040q;
        }

        /* renamed from: i */
        boolean m36502i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f4036m;
            if (z) {
                return true;
            }
            AbstractC1280c abstractC1280c = this.f4024a;
            boolean m36521a = (abstractC1280c != null ? abstractC1280c.m36521a(coordinatorLayout, view) : false) | z;
            this.f4036m = m36521a;
            return m36521a;
        }

        /* renamed from: j */
        boolean m36501j(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f4038o;
            }
            return this.f4037n;
        }

        /* renamed from: k */
        void m36500k() {
            this.f4039p = false;
        }

        /* renamed from: l */
        void m36499l(int i) {
            m36493r(i, false);
        }

        /* renamed from: m */
        void m36498m() {
            this.f4036m = false;
        }

        /* renamed from: o */
        public void m36496o(AbstractC1280c abstractC1280c) {
            AbstractC1280c abstractC1280c2 = this.f4024a;
            if (abstractC1280c2 != abstractC1280c) {
                if (abstractC1280c2 != null) {
                    abstractC1280c2.mo27447j();
                }
                this.f4024a = abstractC1280c;
                this.f4025b = true;
                if (abstractC1280c != null) {
                    abstractC1280c.mo26183g(this);
                }
            }
        }

        /* renamed from: p */
        void m36495p(boolean z) {
            this.f4039p = z;
        }

        /* renamed from: q */
        void m36494q(Rect rect) {
            this.f4040q.set(rect);
        }

        /* renamed from: r */
        void m36493r(int i, boolean z) {
            if (i == 0) {
                this.f4037n = z;
            } else if (i != 1) {
            } else {
                this.f4038o = z;
            }
        }

        C1283f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4025b = false;
            this.f4026c = 0;
            this.f4027d = 0;
            this.f4028e = -1;
            this.f4029f = -1;
            this.f4030g = 0;
            this.f4031h = 0;
            this.f4040q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7598c.CoordinatorLayout_Layout);
            this.f4026c = obtainStyledAttributes.getInteger(C7598c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f4029f = obtainStyledAttributes.getResourceId(C7598c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f4027d = obtainStyledAttributes.getInteger(C7598c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f4028e = obtainStyledAttributes.getInteger(C7598c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f4030g = obtainStyledAttributes.getInt(C7598c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f4031h = obtainStyledAttributes.getInt(C7598c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C7598c.CoordinatorLayout_Layout_layout_behavior);
            this.f4025b = hasValue;
            if (hasValue) {
                this.f4024a = CoordinatorLayout.m36562E(context, attributeSet, obtainStyledAttributes.getString(C7598c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            AbstractC1280c abstractC1280c = this.f4024a;
            if (abstractC1280c != null) {
                abstractC1280c.mo26183g(this);
            }
        }

        public C1283f(C1283f c1283f) {
            super((ViewGroup.MarginLayoutParams) c1283f);
            this.f4025b = false;
            this.f4026c = 0;
            this.f4027d = 0;
            this.f4028e = -1;
            this.f4029f = -1;
            this.f4030g = 0;
            this.f4031h = 0;
            this.f4040q = new Rect();
        }

        public C1283f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4025b = false;
            this.f4026c = 0;
            this.f4027d = 0;
            this.f4028e = -1;
            this.f4029f = -1;
            this.f4030g = 0;
            this.f4031h = 0;
            this.f4040q = new Rect();
        }

        public C1283f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4025b = false;
            this.f4026c = 0;
            this.f4027d = 0;
            this.f4028e = -1;
            this.f4029f = -1;
            this.f4030g = 0;
            this.f4031h = 0;
            this.f4040q = new Rect();
        }
    }
}
