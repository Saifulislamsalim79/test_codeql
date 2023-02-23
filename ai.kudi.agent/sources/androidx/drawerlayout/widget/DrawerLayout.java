package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7693e;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p243j.p244a.AbstractC7781a;
import p201g.p243j.p245b.C7792c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: f0 */
    private static final int[] f4302f0 = {16843828};

    /* renamed from: g0 */
    static final int[] f4303g0 = {16842931};

    /* renamed from: h0 */
    static final boolean f4304h0;

    /* renamed from: i0 */
    private static final boolean f4305i0;

    /* renamed from: A */
    private final C1413g f4306A;

    /* renamed from: B */
    private final C1413g f4307B;

    /* renamed from: C */
    private int f4308C;

    /* renamed from: D */
    private boolean f4309D;

    /* renamed from: E */
    private boolean f4310E;

    /* renamed from: F */
    private int f4311F;

    /* renamed from: G */
    private int f4312G;

    /* renamed from: H */
    private int f4313H;

    /* renamed from: I */
    private int f4314I;

    /* renamed from: J */
    private boolean f4315J;

    /* renamed from: K */
    private InterfaceC1409d f4316K;

    /* renamed from: L */
    private List<InterfaceC1409d> f4317L;

    /* renamed from: M */
    private float f4318M;

    /* renamed from: N */
    private float f4319N;

    /* renamed from: O */
    private Drawable f4320O;

    /* renamed from: P */
    private Drawable f4321P;

    /* renamed from: Q */
    private Drawable f4322Q;

    /* renamed from: R */
    private CharSequence f4323R;

    /* renamed from: S */
    private CharSequence f4324S;

    /* renamed from: T */
    private Object f4325T;

    /* renamed from: U */
    private boolean f4326U;

    /* renamed from: V */
    private Drawable f4327V;

    /* renamed from: W */
    private Drawable f4328W;

    /* renamed from: a0 */
    private Drawable f4329a0;

    /* renamed from: b0 */
    private Drawable f4330b0;

    /* renamed from: c */
    private final C1408c f4331c;

    /* renamed from: c0 */
    private final ArrayList<View> f4332c0;

    /* renamed from: d */
    private float f4333d;

    /* renamed from: d0 */
    private Rect f4334d0;

    /* renamed from: e */
    private int f4335e;

    /* renamed from: e0 */
    private Matrix f4336e0;

    /* renamed from: f */
    private int f4337f;

    /* renamed from: w */
    private float f4338w;

    /* renamed from: x */
    private Paint f4339x;

    /* renamed from: y */
    private final C7792c f4340y;

    /* renamed from: z */
    private final C7792c f4341z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    /* loaded from: classes2.dex */
    class View$OnApplyWindowInsetsListenerC1406a implements View.OnApplyWindowInsetsListener {
        View$OnApplyWindowInsetsListenerC1406a(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).m36058S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    /* loaded from: classes2.dex */
    class C1407b extends C7676a {

        /* renamed from: d */
        private final Rect f4342d = new Rect();

        C1407b() {
        }

        /* renamed from: n */
        private void m36027n(C7716c c7716c, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m36076A(childAt)) {
                    c7716c.m17690c(childAt);
                }
            }
        }

        /* renamed from: o */
        private void m36026o(C7716c c7716c, C7716c c7716c2) {
            Rect rect = this.f4342d;
            c7716c2.m17670m(rect);
            c7716c.m17698W(rect);
            c7716c2.m17668n(rect);
            c7716c.m17697X(rect);
            c7716c.m17720C0(c7716c2.m17708M());
            c7716c.m17665o0(c7716c2.m17654u());
            c7716c.m17693a0(c7716c2.m17664p());
            c7716c.m17685e0(c7716c2.m17660r());
            c7716c.m17681g0(c7716c2.m17717E());
            c7716c.m17691b0(c7716c2.m17719D());
            c7716c.m17677i0(c7716c2.m17715F());
            c7716c.m17675j0(c7716c2.m17714G());
            c7716c.m17700U(c7716c2.m17725A());
            c7716c.m17651v0(c7716c2.m17710K());
            c7716c.m17669m0(c7716c2.m17713H());
            c7716c.m17694a(c7716c2.m17674k());
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: a */
        public boolean mo17864a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View m36038p = DrawerLayout.this.m36038p();
                if (m36038p != null) {
                    CharSequence m36035s = DrawerLayout.this.m36035s(DrawerLayout.this.m36034t(m36038p));
                    if (m36035s != null) {
                        text.add(m36035s);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.mo17864a(view, accessibilityEvent);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: f */
        public void mo17397f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo17397f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            if (DrawerLayout.f4304h0) {
                super.mo17396g(view, c7716c);
            } else {
                C7716c m17705P = C7716c.m17705P(c7716c);
                super.mo17396g(view, m17705P);
                c7716c.m17647x0(view);
                ViewParent m17549J = C7759x.m17549J(view);
                if (m17549J instanceof View) {
                    c7716c.m17661q0((View) m17549J);
                }
                m36026o(c7716c, m17705P);
                m17705P.m17703R();
                m36027n(c7716c, (ViewGroup) view);
            }
            c7716c.m17693a0(DrawerLayout.class.getName());
            c7716c.m17677i0(false);
            c7716c.m17675j0(false);
            c7716c.m17702S(C7716c.C7717a.f18474e);
            c7716c.m17702S(C7716c.C7717a.f18475f);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: i */
        public boolean mo17859i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f4304h0 || DrawerLayout.m36076A(view)) {
                return super.mo17859i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    /* loaded from: classes2.dex */
    static final class C1408c extends C7676a {
        C1408c() {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            if (DrawerLayout.m36076A(view)) {
                return;
            }
            c7716c.m17661q0(null);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC1409d {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    /* loaded from: classes2.dex */
    public class C1413g extends C7792c.AbstractC7795c {

        /* renamed from: a */
        private final int f4353a;

        /* renamed from: b */
        private C7792c f4354b;

        /* renamed from: c */
        private final Runnable f4355c = new RunnableC1414a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g$a */
        /* loaded from: classes2.dex */
        class RunnableC1414a implements Runnable {
            RunnableC1414a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1413g.this.m36021o();
            }
        }

        C1413g(int i) {
            this.f4353a = i;
        }

        /* renamed from: n */
        private void m36022n() {
            View m36040n = DrawerLayout.this.m36040n(this.f4353a == 3 ? 5 : 3);
            if (m36040n != null) {
                DrawerLayout.this.m36048f(m36040n);
            }
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: a */
        public int mo17316a(View view, int i, int i2) {
            if (DrawerLayout.this.m36051c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: b */
        public int mo17315b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: d */
        public int mo17313d(View view) {
            if (DrawerLayout.this.m36072E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: f */
        public void mo17311f(int i, int i2) {
            View m36040n;
            if ((i & 1) == 1) {
                m36040n = DrawerLayout.this.m36040n(3);
            } else {
                m36040n = DrawerLayout.this.m36040n(5);
            }
            if (m36040n == null || DrawerLayout.this.m36036r(m36040n) != 0) {
                return;
            }
            this.f4354b.m17341b(m36040n, i2);
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: g */
        public boolean mo17310g(int i) {
            return false;
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: h */
        public void mo17309h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f4355c, 160L);
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: i */
        public void mo17308i(View view, int i) {
            ((C1410e) view.getLayoutParams()).f4346c = false;
            m36022n();
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: j */
        public void mo17307j(int i) {
            DrawerLayout.this.m36054W(this.f4353a, i, this.f4354b.m17321v());
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: k */
        public void mo17306k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.m36051c(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.m36056U(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: l */
        public void mo17305l(View view, float f, float f2) {
            int i;
            float m36033u = DrawerLayout.this.m36033u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m36051c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && m36033u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && m36033u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f4354b.m17346M(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: m */
        public boolean mo17304m(View view, int i) {
            return DrawerLayout.this.m36072E(view) && DrawerLayout.this.m36051c(view, this.f4353a) && DrawerLayout.this.m36036r(view) == 0;
        }

        /* renamed from: o */
        void m36021o() {
            View m36040n;
            int width;
            int m17320w = this.f4354b.m17320w();
            boolean z = this.f4353a == 3;
            if (z) {
                m36040n = DrawerLayout.this.m36040n(3);
                width = (m36040n != null ? -m36040n.getWidth() : 0) + m17320w;
            } else {
                m36040n = DrawerLayout.this.m36040n(5);
                width = DrawerLayout.this.getWidth() - m17320w;
            }
            if (m36040n != null) {
                if (((!z || m36040n.getLeft() >= width) && (z || m36040n.getLeft() <= width)) || DrawerLayout.this.m36036r(m36040n) != 0) {
                    return;
                }
                this.f4354b.m17344O(m36040n, width, m36040n.getTop());
                ((C1410e) m36040n.getLayoutParams()).f4346c = true;
                DrawerLayout.this.invalidate();
                m36022n();
                DrawerLayout.this.m36052b();
            }
        }

        /* renamed from: p */
        public void m36020p() {
            DrawerLayout.this.removeCallbacks(this.f4355c);
        }

        /* renamed from: q */
        public void m36019q(C7792c c7792c) {
            this.f4354b = c7792c;
        }
    }

    static {
        f4304h0 = Build.VERSION.SDK_INT >= 19;
        f4305i0 = Build.VERSION.SDK_INT >= 21;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    static boolean m36076A(View view) {
        return (C7759x.m17567A(view) == 4 || C7759x.m17567A(view) == 2) ? false : true;
    }

    /* renamed from: H */
    private boolean m36069H(float f, float f2, View view) {
        if (this.f4334d0 == null) {
            this.f4334d0 = new Rect();
        }
        view.getHitRect(this.f4334d0);
        return this.f4334d0.contains((int) f, (int) f2);
    }

    /* renamed from: I */
    private boolean m36068I(Drawable drawable, int i) {
        if (drawable == null || !C1365a.m36194h(drawable)) {
            return false;
        }
        C1365a.m36189m(drawable, i);
        return true;
    }

    /* renamed from: P */
    private Drawable m36061P() {
        int m17563C = C7759x.m17563C(this);
        if (m17563C == 0) {
            Drawable drawable = this.f4327V;
            if (drawable != null) {
                m36068I(drawable, m17563C);
                return this.f4327V;
            }
        } else {
            Drawable drawable2 = this.f4328W;
            if (drawable2 != null) {
                m36068I(drawable2, m17563C);
                return this.f4328W;
            }
        }
        return this.f4329a0;
    }

    /* renamed from: Q */
    private Drawable m36060Q() {
        int m17563C = C7759x.m17563C(this);
        if (m17563C == 0) {
            Drawable drawable = this.f4328W;
            if (drawable != null) {
                m36068I(drawable, m17563C);
                return this.f4328W;
            }
        } else {
            Drawable drawable2 = this.f4327V;
            if (drawable2 != null) {
                m36068I(drawable2, m17563C);
                return this.f4327V;
            }
        }
        return this.f4330b0;
    }

    /* renamed from: R */
    private void m36059R() {
        if (f4305i0) {
            return;
        }
        this.f4321P = m36061P();
        this.f4322Q = m36060Q();
    }

    /* renamed from: V */
    private void m36055V(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !m36072E(childAt)) || (z && childAt == view)) {
                C7759x.m17478z0(childAt, 1);
            } else {
                C7759x.m17478z0(childAt, 4);
            }
        }
    }

    /* renamed from: m */
    private boolean m36041m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent m36032v = m36032v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(m36032v);
            m36032v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: v */
    private MotionEvent m36032v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f4336e0 == null) {
                this.f4336e0 = new Matrix();
            }
            matrix.invert(this.f4336e0);
            obtain.transform(this.f4336e0);
        }
        return obtain;
    }

    /* renamed from: w */
    static String m36031w(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: x */
    private static boolean m36030x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: y */
    private boolean m36029y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1410e) getChildAt(i).getLayoutParams()).f4346c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private boolean m36028z() {
        return m36038p() != null;
    }

    /* renamed from: B */
    boolean m36075B(View view) {
        return ((C1410e) view.getLayoutParams()).f4344a == 0;
    }

    /* renamed from: C */
    public boolean m36074C(int i) {
        View m36040n = m36040n(i);
        if (m36040n != null) {
            return m36073D(m36040n);
        }
        return false;
    }

    /* renamed from: D */
    public boolean m36073D(View view) {
        if (m36072E(view)) {
            return (((C1410e) view.getLayoutParams()).f4347d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: E */
    boolean m36072E(View view) {
        int m17805b = C7693e.m17805b(((C1410e) view.getLayoutParams()).f4344a, C7759x.m17563C(view));
        return ((m17805b & 3) == 0 && (m17805b & 5) == 0) ? false : true;
    }

    /* renamed from: F */
    public boolean m36071F(int i) {
        View m36040n = m36040n(i);
        if (m36040n != null) {
            return m36070G(m36040n);
        }
        return false;
    }

    /* renamed from: G */
    public boolean m36070G(View view) {
        if (m36072E(view)) {
            return ((C1410e) view.getLayoutParams()).f4345b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: J */
    void m36067J(View view, float f) {
        float m36033u = m36033u(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (m36033u * width));
        if (!m36051c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m36056U(view, f);
    }

    /* renamed from: K */
    public void m36066K(int i) {
        m36065L(i, true);
    }

    /* renamed from: L */
    public void m36065L(int i, boolean z) {
        View m36040n = m36040n(i);
        if (m36040n != null) {
            m36063N(m36040n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m36031w(i));
    }

    /* renamed from: M */
    public void m36064M(View view) {
        m36063N(view, true);
    }

    /* renamed from: N */
    public void m36063N(View view, boolean z) {
        if (m36072E(view)) {
            C1410e c1410e = (C1410e) view.getLayoutParams();
            if (this.f4310E) {
                c1410e.f4345b = 1.0f;
                c1410e.f4347d = 1;
                m36055V(view, true);
            } else if (z) {
                c1410e.f4347d |= 2;
                if (m36051c(view, 3)) {
                    this.f4340y.m17344O(view, 0, view.getTop());
                } else {
                    this.f4341z.m17344O(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m36067J(view, 1.0f);
                m36054W(c1410e.f4344a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: O */
    public void m36062O(InterfaceC1409d interfaceC1409d) {
        List<InterfaceC1409d> list;
        if (interfaceC1409d == null || (list = this.f4317L) == null) {
            return;
        }
        list.remove(interfaceC1409d);
    }

    /* renamed from: S */
    public void m36058S(Object obj, boolean z) {
        this.f4325T = obj;
        this.f4326U = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: T */
    public void m36057T(int i, int i2) {
        View m36040n;
        int m17805b = C7693e.m17805b(i2, C7759x.m17563C(this));
        if (i2 == 3) {
            this.f4311F = i;
        } else if (i2 == 5) {
            this.f4312G = i;
        } else if (i2 == 8388611) {
            this.f4313H = i;
        } else if (i2 == 8388613) {
            this.f4314I = i;
        }
        if (i != 0) {
            (m17805b == 3 ? this.f4340y : this.f4341z).m17342a();
        }
        if (i != 1) {
            if (i == 2 && (m36040n = m36040n(m17805b)) != null) {
                m36064M(m36040n);
                return;
            }
            return;
        }
        View m36040n2 = m36040n(m17805b);
        if (m36040n2 != null) {
            m36048f(m36040n2);
        }
    }

    /* renamed from: U */
    void m36056U(View view, float f) {
        C1410e c1410e = (C1410e) view.getLayoutParams();
        if (f == c1410e.f4345b) {
            return;
        }
        c1410e.f4345b = f;
        m36042l(view, f);
    }

    /* renamed from: W */
    void m36054W(int i, int i2, View view) {
        int m17317z = this.f4340y.m17317z();
        int m17317z2 = this.f4341z.m17317z();
        int i3 = 2;
        if (m17317z == 1 || m17317z2 == 1) {
            i3 = 1;
        } else if (m17317z != 2 && m17317z2 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C1410e) view.getLayoutParams()).f4345b;
            if (f == 0.0f) {
                m36044j(view);
            } else if (f == 1.0f) {
                m36043k(view);
            }
        }
        if (i3 != this.f4308C) {
            this.f4308C = i3;
            List<InterfaceC1409d> list = this.f4317L;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4317L.get(size).onDrawerStateChanged(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void m36053a(InterfaceC1409d interfaceC1409d) {
        if (interfaceC1409d == null) {
            return;
        }
        if (this.f4317L == null) {
            this.f4317L = new ArrayList();
        }
        this.f4317L.add(interfaceC1409d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (m36072E(childAt)) {
                if (m36073D(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.f4332c0.add(childAt);
            }
        }
        if (!z) {
            int size = this.f4332c0.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f4332c0.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f4332c0.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m36039o() == null && !m36072E(view)) {
            C7759x.m17478z0(view, 1);
        } else {
            C7759x.m17478z0(view, 4);
        }
        if (f4304h0) {
            return;
        }
        C7759x.m17498p0(view, this.f4331c);
    }

    /* renamed from: b */
    void m36052b() {
        if (this.f4315J) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f4315J = true;
    }

    /* renamed from: c */
    boolean m36051c(View view, int i) {
        return (m36034t(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1410e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C1410e) getChildAt(i).getLayoutParams()).f4345b);
        }
        this.f4338w = f;
        boolean m17330m = this.f4340y.m17330m(true);
        boolean m17330m2 = this.f4341z.m17330m(true);
        if (m17330m || m17330m2) {
            C7759x.m17516g0(this);
        }
    }

    /* renamed from: d */
    public void m36050d(int i) {
        m36049e(i, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f4338w > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; i >= 0; i--) {
                    View childAt = getChildAt(i);
                    if (m36069H(x, y, childAt) && !m36075B(childAt) && m36041m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean m36075B = m36075B(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (m36075B) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m36030x(childAt) && m36072E(childAt) && childAt.getHeight() >= height) {
                    if (m36051c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f4338w;
        if (f > 0.0f && m36075B) {
            int i4 = this.f4337f;
            this.f4339x.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f4339x);
        } else if (this.f4321P != null && m36051c(view, 3)) {
            int intrinsicWidth = this.f4321P.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f4340y.m17320w(), 1.0f));
            this.f4321P.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f4321P.setAlpha((int) (max * 255.0f));
            this.f4321P.draw(canvas);
        } else if (this.f4322Q != null && m36051c(view, 5)) {
            int intrinsicWidth2 = this.f4322Q.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f4341z.m17320w(), 1.0f));
            this.f4322Q.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f4322Q.setAlpha((int) (max2 * 255.0f));
            this.f4322Q.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void m36049e(int i, boolean z) {
        View m36040n = m36040n(i);
        if (m36040n != null) {
            m36047g(m36040n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m36031w(i));
    }

    /* renamed from: f */
    public void m36048f(View view) {
        m36047g(view, true);
    }

    /* renamed from: g */
    public void m36047g(View view, boolean z) {
        if (m36072E(view)) {
            C1410e c1410e = (C1410e) view.getLayoutParams();
            if (this.f4310E) {
                c1410e.f4345b = 0.0f;
                c1410e.f4347d = 0;
            } else if (z) {
                c1410e.f4347d |= 4;
                if (m36051c(view, 3)) {
                    this.f4340y.m17344O(view, -view.getWidth(), view.getTop());
                } else {
                    this.f4341z.m17344O(view, getWidth(), view.getTop());
                }
            } else {
                m36067J(view, 0.0f);
                m36054W(c1410e.f4344a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1410e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1410e ? new C1410e((C1410e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1410e((ViewGroup.MarginLayoutParams) layoutParams) : new C1410e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f4305i0) {
            return this.f4333d;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4320O;
    }

    /* renamed from: h */
    public void m36046h() {
        m36045i(false);
    }

    /* renamed from: i */
    void m36045i(boolean z) {
        boolean m17344O;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1410e c1410e = (C1410e) childAt.getLayoutParams();
            if (m36072E(childAt) && (!z || c1410e.f4346c)) {
                int width = childAt.getWidth();
                if (m36051c(childAt, 3)) {
                    m17344O = this.f4340y.m17344O(childAt, -width, childAt.getTop());
                } else {
                    m17344O = this.f4341z.m17344O(childAt, getWidth(), childAt.getTop());
                }
                z2 |= m17344O;
                c1410e.f4346c = false;
            }
        }
        this.f4306A.m36020p();
        this.f4307B.m36020p();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: j */
    void m36044j(View view) {
        View rootView;
        C1410e c1410e = (C1410e) view.getLayoutParams();
        if ((c1410e.f4347d & 1) == 1) {
            c1410e.f4347d = 0;
            List<InterfaceC1409d> list = this.f4317L;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4317L.get(size).onDrawerClosed(view);
                }
            }
            m36055V(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: k */
    void m36043k(View view) {
        C1410e c1410e = (C1410e) view.getLayoutParams();
        if ((c1410e.f4347d & 1) == 0) {
            c1410e.f4347d = 1;
            List<InterfaceC1409d> list = this.f4317L;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4317L.get(size).onDrawerOpened(view);
                }
            }
            m36055V(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: l */
    void m36042l(View view, float f) {
        List<InterfaceC1409d> list = this.f4317L;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4317L.get(size).onDrawerSlide(view, f);
            }
        }
    }

    /* renamed from: n */
    View m36040n(int i) {
        int m17805b = C7693e.m17805b(i, C7759x.m17563C(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m36034t(childAt) & 7) == m17805b) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    View m36039o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C1410e) childAt.getLayoutParams()).f4347d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4310E = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4310E = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.f4326U || this.f4320O == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.f4325T) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f4320O.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f4320O.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            g.j.b.c r1 = r6.f4340y
            boolean r1 = r1.m17345N(r7)
            g.j.b.c r2 = r6.f4341z
            boolean r2 = r2.m17345N(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            g.j.b.c r7 = r6.f4340y
            boolean r7 = r7.m17339d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f4306A
            r7.m36020p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f4307B
            r7.m36020p()
            goto L36
        L31:
            r6.m36045i(r2)
            r6.f4315J = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f4318M = r0
            r6.f4319N = r7
            float r4 = r6.f4338w
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            g.j.b.c r4 = r6.f4340y
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.m17323t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.m36075B(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.f4315J = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.m36029y()
            if (r7 != 0) goto L70
            boolean r7 = r6.f4315J
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m36028z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m36038p = m36038p();
            if (m36038p != null && m36036r(m36038p) == 0) {
                m36046h();
            }
            return m36038p != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int i6;
        this.f4309D = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C1410e c1410e = (C1410e) childAt.getLayoutParams();
                if (m36075B(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) c1410e).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) c1410e).topMargin, childAt.getMeasuredWidth() + i9, ((ViewGroup.MarginLayoutParams) c1410e).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m36051c(childAt, 3)) {
                        float f2 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (c1410e.f4345b * f2));
                        f = (measuredWidth + i6) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i7 - i5) / f3;
                        i6 = i7 - ((int) (c1410e.f4345b * f3));
                    }
                    boolean z2 = f != c1410e.f4345b;
                    int i10 = c1410e.f4344a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c1410e).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) c1410e).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c1410e).topMargin;
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i6, (i17 - ((ViewGroup.MarginLayoutParams) c1410e).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i17 - ((ViewGroup.MarginLayoutParams) c1410e).bottomMargin);
                    }
                    if (z2) {
                        m36056U(childAt, f);
                    }
                    int i18 = c1410e.f4345b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        this.f4309D = false;
        this.f4310E = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = IjkMediaCodecInfo.RANK_SECURE;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = IjkMediaCodecInfo.RANK_SECURE;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f4325T != null && C7759x.m17479z(this);
        int m17563C = C7759x.m17563C(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1410e c1410e = (C1410e) childAt.getLayoutParams();
                if (z) {
                    int m17805b = C7693e.m17805b(c1410e.f4344a, m17563C);
                    if (C7759x.m17479z(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f4325T;
                            if (m17805b == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (m17805b == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f4325T;
                        if (m17805b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (m17805b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c1410e).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c1410e).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c1410e).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c1410e).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m36075B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c1410e).leftMargin) - ((ViewGroup.MarginLayoutParams) c1410e).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c1410e).topMargin) - ((ViewGroup.MarginLayoutParams) c1410e).bottomMargin, 1073741824));
                } else if (m36072E(childAt)) {
                    if (f4305i0) {
                        float m17485w = C7759x.m17485w(childAt);
                        float f = this.f4333d;
                        if (m17485w != f) {
                            C7759x.m17484w0(childAt, f);
                        }
                    }
                    int m36034t = m36034t(childAt) & 7;
                    boolean z4 = m36034t == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m36031w(m36034t) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f4335e + ((ViewGroup.MarginLayoutParams) c1410e).leftMargin + ((ViewGroup.MarginLayoutParams) c1410e).rightMargin, ((ViewGroup.MarginLayoutParams) c1410e).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c1410e).topMargin + ((ViewGroup.MarginLayoutParams) c1410e).bottomMargin, ((ViewGroup.MarginLayoutParams) c1410e).height));
                    i4++;
                    i3 = 0;
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View m36040n;
        if (!(parcelable instanceof C1411f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1411f c1411f = (C1411f) parcelable;
        super.onRestoreInstanceState(c1411f.m17424a());
        int i = c1411f.f4348e;
        if (i != 0 && (m36040n = m36040n(i)) != null) {
            m36064M(m36040n);
        }
        int i2 = c1411f.f4349f;
        if (i2 != 3) {
            m36057T(i2, 3);
        }
        int i3 = c1411f.f4350w;
        if (i3 != 3) {
            m36057T(i3, 5);
        }
        int i4 = c1411f.f4351x;
        if (i4 != 3) {
            m36057T(i4, 8388611);
        }
        int i5 = c1411f.f4352y;
        if (i5 != 3) {
            m36057T(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m36059R();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1411f c1411f = new C1411f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1410e c1410e = (C1410e) getChildAt(i).getLayoutParams();
            boolean z = c1410e.f4347d == 1;
            boolean z2 = c1410e.f4347d == 2;
            if (z || z2) {
                c1411f.f4348e = c1410e.f4344a;
                break;
            }
        }
        c1411f.f4349f = this.f4311F;
        c1411f.f4350w = this.f4312G;
        c1411f.f4351x = this.f4313H;
        c1411f.f4352y = this.f4314I;
        return c1411f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (m36036r(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            g.j.b.c r0 = r6.f4340y
            r0.m17354E(r7)
            g.j.b.c r0 = r6.f4341z
            r0.m17354E(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.m36045i(r2)
            r6.f4315J = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            g.j.b.c r3 = r6.f4340y
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m17323t(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.m36075B(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.f4318M
            float r0 = r0 - r3
            float r3 = r6.f4319N
            float r7 = r7 - r3
            g.j.b.c r3 = r6.f4340y
            int r3 = r3.m17318y()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.m36039o()
            if (r7 == 0) goto L5d
            int r7 = r6.m36036r(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.m36045i(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f4318M = r0
            r6.f4319N = r7
            r6.f4315J = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    View m36038p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m36072E(childAt) && m36070G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public int m36037q(int i) {
        int m17563C = C7759x.m17563C(this);
        if (i == 3) {
            int i2 = this.f4311F;
            if (i2 != 3) {
                return i2;
            }
            int i3 = m17563C == 0 ? this.f4313H : this.f4314I;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f4312G;
            if (i4 != 3) {
                return i4;
            }
            int i5 = m17563C == 0 ? this.f4314I : this.f4313H;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f4313H;
            if (i6 != 3) {
                return i6;
            }
            int i7 = m17563C == 0 ? this.f4311F : this.f4312G;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f4314I;
            if (i8 != 3) {
                return i8;
            }
            int i9 = m17563C == 0 ? this.f4312G : this.f4311F;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    /* renamed from: r */
    public int m36036r(View view) {
        if (m36072E(view)) {
            return m36037q(((C1410e) view.getLayoutParams()).f4344a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m36045i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4309D) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public CharSequence m36035s(int i) {
        int m17805b = C7693e.m17805b(i, C7759x.m17563C(this));
        if (m17805b == 3) {
            return this.f4323R;
        }
        if (m17805b == 5) {
            return this.f4324S;
        }
        return null;
    }

    public void setDrawerElevation(float f) {
        this.f4333d = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m36072E(childAt)) {
                C7759x.m17484w0(childAt, this.f4333d);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC1409d interfaceC1409d) {
        InterfaceC1409d interfaceC1409d2 = this.f4316K;
        if (interfaceC1409d2 != null) {
            m36062O(interfaceC1409d2);
        }
        if (interfaceC1409d != null) {
            m36053a(interfaceC1409d);
        }
        this.f4316K = interfaceC1409d;
    }

    public void setDrawerLockMode(int i) {
        m36057T(i, 3);
        m36057T(i, 5);
    }

    public void setScrimColor(int i) {
        this.f4337f = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f4320O = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f4320O = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: t */
    int m36034t(View view) {
        return C7693e.m17805b(((C1410e) view.getLayoutParams()).f4344a, C7759x.m17563C(this));
    }

    /* renamed from: u */
    float m36033u(View view) {
        return ((C1410e) view.getLayoutParams()).f4345b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4331c = new C1408c();
        this.f4337f = -1728053248;
        this.f4339x = new Paint();
        this.f4310E = true;
        this.f4311F = 3;
        this.f4312G = 3;
        this.f4313H = 3;
        this.f4314I = 3;
        this.f4327V = null;
        this.f4328W = null;
        this.f4329a0 = null;
        this.f4330b0 = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f4335e = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f4306A = new C1413g(3);
        this.f4307B = new C1413g(5);
        C7792c m17329n = C7792c.m17329n(this, 1.0f, this.f4306A);
        this.f4340y = m17329n;
        m17329n.m17348K(1);
        this.f4340y.m17347L(f2);
        this.f4306A.m36019q(this.f4340y);
        C7792c m17329n2 = C7792c.m17329n(this, 1.0f, this.f4307B);
        this.f4341z = m17329n2;
        m17329n2.m17348K(2);
        this.f4341z.m17347L(f2);
        this.f4307B.m36019q(this.f4341z);
        setFocusableInTouchMode(true);
        C7759x.m17478z0(this, 1);
        C7759x.m17498p0(this, new C1407b());
        setMotionEventSplittingEnabled(false);
        if (C7759x.m17479z(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC1406a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4302f0);
                try {
                    this.f4320O = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f4320O = null;
            }
        }
        this.f4333d = f * 10.0f;
        this.f4332c0 = new ArrayList<>();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1410e(getContext(), attributeSet);
    }

    public void setStatusBarBackground(int i) {
        this.f4320O = i != 0 ? C1335a.m36322f(getContext(), i) : null;
        invalidate();
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    /* loaded from: classes2.dex */
    public static class C1410e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f4344a;

        /* renamed from: b */
        float f4345b;

        /* renamed from: c */
        boolean f4346c;

        /* renamed from: d */
        int f4347d;

        public C1410e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4344a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f4303g0);
            this.f4344a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C1410e(int i, int i2) {
            super(i, i2);
            this.f4344a = 0;
        }

        public C1410e(C1410e c1410e) {
            super((ViewGroup.MarginLayoutParams) c1410e);
            this.f4344a = 0;
            this.f4344a = c1410e.f4344a;
        }

        public C1410e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4344a = 0;
        }

        public C1410e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4344a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    /* loaded from: classes2.dex */
    public static class C1411f extends AbstractC7781a {
        public static final Parcelable.Creator<C1411f> CREATOR = new C1412a();

        /* renamed from: e */
        int f4348e;

        /* renamed from: f */
        int f4349f;

        /* renamed from: w */
        int f4350w;

        /* renamed from: x */
        int f4351x;

        /* renamed from: y */
        int f4352y;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        /* loaded from: classes2.dex */
        static class C1412a implements Parcelable.ClassLoaderCreator<C1411f> {
            C1412a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1411f createFromParcel(Parcel parcel) {
                return new C1411f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1411f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1411f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1411f[] newArray(int i) {
                return new C1411f[i];
            }
        }

        public C1411f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4348e = 0;
            this.f4348e = parcel.readInt();
            this.f4349f = parcel.readInt();
            this.f4350w = parcel.readInt();
            this.f4351x = parcel.readInt();
            this.f4352y = parcel.readInt();
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4348e);
            parcel.writeInt(this.f4349f);
            parcel.writeInt(this.f4350w);
            parcel.writeInt(this.f4351x);
            parcel.writeInt(this.f4352y);
        }

        public C1411f(Parcelable parcelable) {
            super(parcelable);
            this.f4348e = 0;
        }
    }
}
