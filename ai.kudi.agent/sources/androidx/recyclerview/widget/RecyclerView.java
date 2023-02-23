package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p058os.C1382j;
import androidx.recyclerview.widget.C1661a;
import androidx.recyclerview.widget.C1673b0;
import androidx.recyclerview.widget.C1678c0;
import androidx.recyclerview.widget.C1694f;
import androidx.recyclerview.widget.C1749w;
import androidx.recyclerview.widget.RunnableC1729m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p201g.p227h.p237k.C7675h;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7745j;
import p201g.p227h.p238l.C7747l;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.C7773y;
import p201g.p227h.p238l.InterfaceC7746k;
import p201g.p227h.p238l.InterfaceC7757v;
import p201g.p227h.p238l.p239h0.C7715b;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p243j.p244a.AbstractC7781a;
import p201g.p261s.C8084a;
import p201g.p261s.C8085b;
import p201g.p261s.C8086c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements InterfaceC7757v, InterfaceC7746k {

    /* renamed from: U0 */
    private static final int[] f4874U0 = {16843830};

    /* renamed from: V0 */
    static final boolean f4875V0;

    /* renamed from: W0 */
    static final boolean f4876W0;

    /* renamed from: X0 */
    static final boolean f4877X0;

    /* renamed from: Y0 */
    static final boolean f4878Y0;

    /* renamed from: Z0 */
    private static final boolean f4879Z0;

    /* renamed from: a1 */
    private static final boolean f4880a1;

    /* renamed from: b1 */
    private static final Class<?>[] f4881b1;

    /* renamed from: c1 */
    static final Interpolator f4882c1;

    /* renamed from: A */
    final Rect f4883A;

    /* renamed from: A0 */
    final C1614b0 f4884A0;

    /* renamed from: B */
    private final Rect f4885B;

    /* renamed from: B0 */
    private AbstractC1644u f4886B0;

    /* renamed from: C */
    final RectF f4887C;

    /* renamed from: C0 */
    private List<AbstractC1644u> f4888C0;

    /* renamed from: D */
    AbstractC1623h f4889D;

    /* renamed from: D0 */
    boolean f4890D0;

    /* renamed from: E */
    AbstractC1635p f4891E;

    /* renamed from: E0 */
    boolean f4892E0;

    /* renamed from: F */
    InterfaceC1648x f4893F;

    /* renamed from: F0 */
    private AbstractC1629m.InterfaceC1631b f4894F0;

    /* renamed from: G */
    final List<InterfaceC1648x> f4895G;

    /* renamed from: G0 */
    boolean f4896G0;

    /* renamed from: H */
    final ArrayList<AbstractC1634o> f4897H;

    /* renamed from: H0 */
    C1749w f4898H0;

    /* renamed from: I */
    private final ArrayList<InterfaceC1643t> f4899I;

    /* renamed from: I0 */
    private InterfaceC1627k f4900I0;

    /* renamed from: J */
    private InterfaceC1643t f4901J;

    /* renamed from: J0 */
    private final int[] f4902J0;

    /* renamed from: K */
    boolean f4903K;

    /* renamed from: K0 */
    private C7747l f4904K0;

    /* renamed from: L */
    boolean f4905L;

    /* renamed from: L0 */
    private final int[] f4906L0;

    /* renamed from: M */
    boolean f4907M;

    /* renamed from: M0 */
    private final int[] f4908M0;

    /* renamed from: N */
    boolean f4909N;

    /* renamed from: N0 */
    final int[] f4910N0;

    /* renamed from: O */
    private int f4911O;

    /* renamed from: O0 */
    final List<AbstractC1620e0> f4912O0;

    /* renamed from: P */
    boolean f4913P;

    /* renamed from: P0 */
    private Runnable f4914P0;

    /* renamed from: Q */
    boolean f4915Q;

    /* renamed from: Q0 */
    private boolean f4916Q0;

    /* renamed from: R */
    private boolean f4917R;

    /* renamed from: R0 */
    private int f4918R0;

    /* renamed from: S */
    private int f4919S;

    /* renamed from: S0 */
    private int f4920S0;

    /* renamed from: T */
    boolean f4921T;

    /* renamed from: T0 */
    private final C1678c0.InterfaceC1680b f4922T0;

    /* renamed from: U */
    private final AccessibilityManager f4923U;

    /* renamed from: V */
    private List<InterfaceC1641r> f4924V;

    /* renamed from: W */
    boolean f4925W;

    /* renamed from: a0 */
    boolean f4926a0;

    /* renamed from: b0 */
    private int f4927b0;

    /* renamed from: c */
    private final C1649y f4928c;

    /* renamed from: c0 */
    private int f4929c0;

    /* renamed from: d */
    final C1647w f4930d;

    /* renamed from: d0 */
    private C1628l f4931d0;

    /* renamed from: e */
    C1650z f4932e;

    /* renamed from: e0 */
    private EdgeEffect f4933e0;

    /* renamed from: f */
    C1661a f4934f;

    /* renamed from: f0 */
    private EdgeEffect f4935f0;

    /* renamed from: g0 */
    private EdgeEffect f4936g0;

    /* renamed from: h0 */
    private EdgeEffect f4937h0;

    /* renamed from: i0 */
    AbstractC1629m f4938i0;

    /* renamed from: j0 */
    private int f4939j0;

    /* renamed from: k0 */
    private int f4940k0;

    /* renamed from: l0 */
    private VelocityTracker f4941l0;

    /* renamed from: m0 */
    private int f4942m0;

    /* renamed from: n0 */
    private int f4943n0;

    /* renamed from: o0 */
    private int f4944o0;

    /* renamed from: p0 */
    private int f4945p0;

    /* renamed from: q0 */
    private int f4946q0;

    /* renamed from: r0 */
    private AbstractC1642s f4947r0;

    /* renamed from: s0 */
    private final int f4948s0;

    /* renamed from: t0 */
    private final int f4949t0;

    /* renamed from: u0 */
    private float f4950u0;

    /* renamed from: v0 */
    private float f4951v0;

    /* renamed from: w */
    C1694f f4952w;

    /* renamed from: w0 */
    private boolean f4953w0;

    /* renamed from: x */
    final C1678c0 f4954x;

    /* renamed from: x0 */
    final RunnableC1618d0 f4955x0;

    /* renamed from: y */
    boolean f4956y;

    /* renamed from: y0 */
    RunnableC1729m f4957y0;

    /* renamed from: z */
    final Runnable f4958z;

    /* renamed from: z0 */
    RunnableC1729m.C1731b f4959z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes2.dex */
    class RunnableC1609a implements Runnable {
        RunnableC1609a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f4909N || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f4903K) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f4915Q) {
                recyclerView2.f4913P = true;
            } else {
                recyclerView2.m35252v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1610a0 {

        /* renamed from: b */
        private RecyclerView f4962b;

        /* renamed from: c */
        private AbstractC1635p f4963c;

        /* renamed from: d */
        private boolean f4964d;

        /* renamed from: e */
        private boolean f4965e;

        /* renamed from: f */
        private View f4966f;

        /* renamed from: h */
        private boolean f4968h;

        /* renamed from: a */
        private int f4961a = -1;

        /* renamed from: g */
        private final C1611a f4967g = new C1611a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$a */
        /* loaded from: classes2.dex */
        public static class C1611a {

            /* renamed from: a */
            private int f4969a;

            /* renamed from: b */
            private int f4970b;

            /* renamed from: c */
            private int f4971c;

            /* renamed from: d */
            private int f4972d;

            /* renamed from: e */
            private Interpolator f4973e;

            /* renamed from: f */
            private boolean f4974f;

            /* renamed from: g */
            private int f4975g;

            public C1611a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m35219e() {
                if (this.f4973e != null && this.f4971c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4971c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m35223a() {
                return this.f4972d >= 0;
            }

            /* renamed from: b */
            public void m35222b(int i) {
                this.f4972d = i;
            }

            /* renamed from: c */
            void m35221c(RecyclerView recyclerView) {
                int i = this.f4972d;
                if (i >= 0) {
                    this.f4972d = -1;
                    recyclerView.m35239z0(i);
                    this.f4974f = false;
                } else if (this.f4974f) {
                    m35219e();
                    recyclerView.f4955x0.m35206e(this.f4969a, this.f4970b, this.f4971c, this.f4973e);
                    int i2 = this.f4975g + 1;
                    this.f4975g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4974f = false;
                } else {
                    this.f4975g = 0;
                }
            }

            /* renamed from: d */
            public void m35220d(int i, int i2, int i3, Interpolator interpolator) {
                this.f4969a = i;
                this.f4970b = i2;
                this.f4971c = i3;
                this.f4973e = interpolator;
                this.f4974f = true;
            }

            public C1611a(int i, int i2, int i3, Interpolator interpolator) {
                this.f4972d = -1;
                this.f4974f = false;
                this.f4975g = 0;
                this.f4969a = i;
                this.f4970b = i2;
                this.f4971c = i3;
                this.f4973e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$b */
        /* loaded from: classes2.dex */
        public interface InterfaceC1612b {
            /* renamed from: a */
            PointF mo32334a(int i);
        }

        /* renamed from: a */
        public PointF m35237a(int i) {
            AbstractC1635p m35233e = m35233e();
            if (m35233e instanceof InterfaceC1612b) {
                return ((InterfaceC1612b) m35233e).mo32334a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1612b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View m35236b(int i) {
            return this.f4962b.f4891E.mo35155M(i);
        }

        /* renamed from: c */
        public int m35235c() {
            return this.f4962b.f4891E.m35142T();
        }

        /* renamed from: d */
        public int m35234d(View view) {
            return this.f4962b.m35299f0(view);
        }

        /* renamed from: e */
        public AbstractC1635p m35233e() {
            return this.f4963c;
        }

        /* renamed from: f */
        public int m35232f() {
            return this.f4961a;
        }

        /* renamed from: g */
        public boolean m35231g() {
            return this.f4964d;
        }

        /* renamed from: h */
        public boolean m35230h() {
            return this.f4965e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: i */
        public void m35229i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: j */
        void m35228j(int i, int i2) {
            PointF m35237a;
            RecyclerView recyclerView = this.f4962b;
            if (this.f4961a == -1 || recyclerView == null) {
                m35224r();
            }
            if (this.f4964d && this.f4966f == null && this.f4963c != null && (m35237a = m35237a(this.f4961a)) != null && (m35237a.x != 0.0f || m35237a.y != 0.0f)) {
                recyclerView.m35280l1((int) Math.signum(m35237a.x), (int) Math.signum(m35237a.y), null);
            }
            this.f4964d = false;
            View view = this.f4966f;
            if (view != null) {
                if (m35234d(view) == this.f4961a) {
                    mo34549o(this.f4966f, recyclerView.f4884A0, this.f4967g);
                    this.f4967g.m35221c(recyclerView);
                    m35224r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4966f = null;
                }
            }
            if (this.f4965e) {
                mo34656l(i, i2, recyclerView.f4884A0, this.f4967g);
                boolean m35223a = this.f4967g.m35223a();
                this.f4967g.m35221c(recyclerView);
                if (m35223a && this.f4965e) {
                    this.f4964d = true;
                    recyclerView.f4955x0.m35207d();
                }
            }
        }

        /* renamed from: k */
        protected void m35227k(View view) {
            if (m35234d(view) == m35232f()) {
                this.f4966f = view;
            }
        }

        /* renamed from: l */
        protected abstract void mo34656l(int i, int i2, C1614b0 c1614b0, C1611a c1611a);

        /* renamed from: m */
        protected abstract void mo34655m();

        /* renamed from: n */
        protected abstract void mo34654n();

        /* renamed from: o */
        protected abstract void mo34549o(View view, C1614b0 c1614b0, C1611a c1611a);

        /* renamed from: p */
        public void m35226p(int i) {
            this.f4961a = i;
        }

        /* renamed from: q */
        void m35225q(RecyclerView recyclerView, AbstractC1635p abstractC1635p) {
            recyclerView.f4955x0.m35205f();
            if (this.f4968h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4962b = recyclerView;
            this.f4963c = abstractC1635p;
            int i = this.f4961a;
            if (i != -1) {
                recyclerView.f4884A0.f4977a = i;
                this.f4965e = true;
                this.f4964d = true;
                this.f4966f = m35236b(m35232f());
                mo34655m();
                this.f4962b.f4955x0.m35207d();
                this.f4968h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: r */
        public final void m35224r() {
            if (this.f4965e) {
                this.f4965e = false;
                mo34654n();
                this.f4962b.f4884A0.f4977a = -1;
                this.f4966f = null;
                this.f4961a = -1;
                this.f4964d = false;
                this.f4963c.m35112m1(this);
                this.f4963c = null;
                this.f4962b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes2.dex */
    class RunnableC1613b implements Runnable {
        RunnableC1613b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1629m abstractC1629m = RecyclerView.this.f4938i0;
            if (abstractC1629m != null) {
                abstractC1629m.mo34731u();
            }
            RecyclerView.this.f4896G0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: classes2.dex */
    public static class C1614b0 {

        /* renamed from: b */
        private SparseArray<Object> f4978b;

        /* renamed from: m */
        int f4989m;

        /* renamed from: n */
        long f4990n;

        /* renamed from: o */
        int f4991o;

        /* renamed from: p */
        int f4992p;

        /* renamed from: q */
        int f4993q;

        /* renamed from: a */
        int f4977a = -1;

        /* renamed from: c */
        int f4979c = 0;

        /* renamed from: d */
        int f4980d = 0;

        /* renamed from: e */
        int f4981e = 1;

        /* renamed from: f */
        int f4982f = 0;

        /* renamed from: g */
        boolean f4983g = false;

        /* renamed from: h */
        boolean f4984h = false;

        /* renamed from: i */
        boolean f4985i = false;

        /* renamed from: j */
        boolean f4986j = false;

        /* renamed from: k */
        boolean f4987k = false;

        /* renamed from: l */
        boolean f4988l = false;

        /* renamed from: a */
        void m35218a(int i) {
            if ((this.f4981e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4981e));
        }

        /* renamed from: b */
        public int m35217b() {
            if (this.f4984h) {
                return this.f4979c - this.f4980d;
            }
            return this.f4982f;
        }

        /* renamed from: c */
        public int m35216c() {
            return this.f4977a;
        }

        /* renamed from: d */
        public boolean m35215d() {
            return this.f4977a != -1;
        }

        /* renamed from: e */
        public boolean m35214e() {
            return this.f4984h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public void m35213f(AbstractC1623h abstractC1623h) {
            this.f4981e = 1;
            this.f4982f = abstractC1623h.getItemCount();
            this.f4984h = false;
            this.f4985i = false;
            this.f4986j = false;
        }

        /* renamed from: g */
        public boolean m35212g() {
            return this.f4988l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4977a + ", mData=" + this.f4978b + ", mItemCount=" + this.f4982f + ", mIsMeasuring=" + this.f4986j + ", mPreviousLayoutItemCount=" + this.f4979c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4980d + ", mStructureChanged=" + this.f4983g + ", mInPreLayout=" + this.f4984h + ", mRunSimpleAnimations=" + this.f4987k + ", mRunPredictiveAnimations=" + this.f4988l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name */
    /* loaded from: classes2.dex */
    class animationInterpolatorC1615c implements Interpolator {
        animationInterpolatorC1615c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1616c0 {
        /* renamed from: a */
        public abstract View m35211a(C1647w c1647w, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes2.dex */
    class C1617d implements C1678c0.InterfaceC1680b {
        C1617d() {
        }

        @Override // androidx.recyclerview.widget.C1678c0.InterfaceC1680b
        /* renamed from: a */
        public void mo34826a(AbstractC1620e0 abstractC1620e0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4891E.m35091u1(abstractC1620e0.itemView, recyclerView.f4930d);
        }

        @Override // androidx.recyclerview.widget.C1678c0.InterfaceC1680b
        /* renamed from: b */
        public void mo34825b(AbstractC1620e0 abstractC1620e0, AbstractC1629m.C1632c c1632c, AbstractC1629m.C1632c c1632c2) {
            RecyclerView.this.m35279m(abstractC1620e0, c1632c, c1632c2);
        }

        @Override // androidx.recyclerview.widget.C1678c0.InterfaceC1680b
        /* renamed from: c */
        public void mo34824c(AbstractC1620e0 abstractC1620e0, AbstractC1629m.C1632c c1632c, AbstractC1629m.C1632c c1632c2) {
            RecyclerView.this.f4930d.m35053J(abstractC1620e0);
            RecyclerView.this.m35273o(abstractC1620e0, c1632c, c1632c2);
        }

        @Override // androidx.recyclerview.widget.C1678c0.InterfaceC1680b
        /* renamed from: d */
        public void mo34823d(AbstractC1620e0 abstractC1620e0, AbstractC1629m.C1632c c1632c, AbstractC1629m.C1632c c1632c2) {
            abstractC1620e0.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4925W) {
                if (recyclerView.f4938i0.mo34568b(abstractC1620e0, abstractC1620e0, c1632c, c1632c2)) {
                    RecyclerView.this.m35333Q0();
                }
            } else if (recyclerView.f4938i0.mo34566d(abstractC1620e0, c1632c, c1632c2)) {
                RecyclerView.this.m35333Q0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    /* loaded from: classes2.dex */
    public class RunnableC1618d0 implements Runnable {

        /* renamed from: c */
        private int f4995c;

        /* renamed from: d */
        private int f4996d;

        /* renamed from: e */
        OverScroller f4997e;

        /* renamed from: f */
        Interpolator f4998f = RecyclerView.f4882c1;

        /* renamed from: w */
        private boolean f4999w = false;

        /* renamed from: x */
        private boolean f5000x = false;

        RunnableC1618d0() {
            this.f4997e = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f4882c1);
        }

        /* renamed from: a */
        private int m35210a(int i, int i2) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: c */
        private void m35208c() {
            RecyclerView.this.removeCallbacks(this);
            C7759x.m17514h0(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void m35209b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4996d = 0;
            this.f4995c = 0;
            Interpolator interpolator = this.f4998f;
            Interpolator interpolator2 = RecyclerView.f4882c1;
            if (interpolator != interpolator2) {
                this.f4998f = interpolator2;
                this.f4997e = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f4882c1);
            }
            this.f4997e.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m35207d();
        }

        /* renamed from: d */
        void m35207d() {
            if (this.f4999w) {
                this.f5000x = true;
            } else {
                m35208c();
            }
        }

        /* renamed from: e */
        public void m35206e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m35210a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f4882c1;
            }
            if (this.f4998f != interpolator) {
                this.f4998f = interpolator;
                this.f4997e = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4996d = 0;
            this.f4995c = 0;
            RecyclerView.this.setScrollState(2);
            this.f4997e.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4997e.computeScrollOffset();
            }
            m35207d();
        }

        /* renamed from: f */
        public void m35205f() {
            RecyclerView.this.removeCallbacks(this);
            this.f4997e.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4891E == null) {
                m35205f();
                return;
            }
            this.f5000x = false;
            this.f4999w = true;
            recyclerView.m35252v();
            OverScroller overScroller = this.f4997e;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f4995c;
                int i4 = currY - this.f4996d;
                this.f4995c = currX;
                this.f4996d = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4910N0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m35354G(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4910N0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m35255u(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4889D != null) {
                    int[] iArr3 = recyclerView3.f4910N0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m35280l1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4910N0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    AbstractC1610a0 abstractC1610a0 = recyclerView4.f4891E.f5034y;
                    if (abstractC1610a0 != null && !abstractC1610a0.m35231g() && abstractC1610a0.m35230h()) {
                        int m35217b = RecyclerView.this.f4884A0.m35217b();
                        if (m35217b == 0) {
                            abstractC1610a0.m35224r();
                        } else if (abstractC1610a0.m35232f() >= m35217b) {
                            abstractC1610a0.m35226p(m35217b - 1);
                            abstractC1610a0.m35228j(i2, i);
                        } else {
                            abstractC1610a0.m35228j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f4897H.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4910N0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m35352H(i2, i, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.f4910N0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    RecyclerView.this.m35348J(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                AbstractC1610a0 abstractC1610a02 = RecyclerView.this.f4891E.f5034y;
                if (!(abstractC1610a02 != null && abstractC1610a02.m35231g()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m35314a(i7, currVelocity);
                    }
                    if (RecyclerView.f4878Y0) {
                        RecyclerView.this.f4959z0.m34666b();
                    }
                } else {
                    m35207d();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    RunnableC1729m runnableC1729m = recyclerView6.f4957y0;
                    if (runnableC1729m != null) {
                        runnableC1729m.m34673f(recyclerView6, i2, i);
                    }
                }
            }
            AbstractC1610a0 abstractC1610a03 = RecyclerView.this.f4891E.f5034y;
            if (abstractC1610a03 != null && abstractC1610a03.m35231g()) {
                abstractC1610a03.m35228j(0, 0);
            }
            this.f4999w = false;
            if (this.f5000x) {
                m35208c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.m35241y1(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes2.dex */
    public class C1619e implements C1694f.InterfaceC1696b {
        C1619e() {
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: o */
        public int mo34782o() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: p */
        public View mo34781p(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: q */
        public void mo34780q(View view) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (m35293h0 != null) {
                m35293h0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: r */
        public void mo34779r() {
            int mo34782o = mo34782o();
            for (int i = 0; i < mo34782o; i++) {
                View mo34781p = mo34781p(i);
                RecyclerView.this.m35368A(mo34781p);
                mo34781p.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: s */
        public int mo34778s(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: t */
        public AbstractC1620e0 mo34777t(View view) {
            return RecyclerView.m35293h0(view);
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: u */
        public void mo34776u(int i) {
            AbstractC1620e0 m35293h0;
            View mo34781p = mo34781p(i);
            if (mo34781p != null && (m35293h0 = RecyclerView.m35293h0(mo34781p)) != null) {
                if (m35293h0.isTmpDetached() && !m35293h0.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m35293h0 + RecyclerView.this.m35334Q());
                }
                m35293h0.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: v */
        public void mo34775v(View view) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (m35293h0 != null) {
                m35293h0.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: w */
        public void mo34774w(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.m35240z(view);
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: x */
        public void mo34773x(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.m35368A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C1694f.InterfaceC1696b
        /* renamed from: y */
        public void mo34772y(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (m35293h0 != null) {
                if (!m35293h0.isTmpDetached() && !m35293h0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m35293h0 + RecyclerView.this.m35334Q());
                }
                m35293h0.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1620e0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        AbstractC1623h<? extends AbstractC1620e0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC1620e0 mShadowedHolder = null;
        AbstractC1620e0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C1647w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public AbstractC1620e0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C7759x.m17538R(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m35308c0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final AbstractC1623h<? extends AbstractC1620e0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC1623h adapter;
            int m35308c0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (m35308c0 = this.mOwnerRecyclerView.m35308c0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, m35308c0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C7759x.m17538R(this.itemView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C1640q) this.itemView.getLayoutParams()).f5044e = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C7759x.m17567A(this.itemView);
            }
            recyclerView.m35271o1(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.m35271o1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m35261s(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (i2 ^ (-1)));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(C1647w c1647w, boolean z) {
            this.mScrapContainer = c1647w;
            this.mInChangeScrap = z;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.m35053J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes2.dex */
    public class C1621f implements C1661a.InterfaceC1662a {
        C1621f() {
        }

        @Override // androidx.recyclerview.widget.C1661a.InterfaceC1662a
        /* renamed from: a */
        public void mo34874a(int i, int i2) {
            RecyclerView.this.m35353G0(i, i2);
            RecyclerView.this.f4890D0 = true;
        }

        @Override // androidx.recyclerview.widget.C1661a.InterfaceC1662a
        /* renamed from: b */
        public void mo34873b(C1661a.C1663b c1663b) {
            m35204i(c1663b);
        }

        @Override // androidx.recyclerview.widget.C1661a.InterfaceC1662a
        /* renamed from: c */
        public void mo34872c(int i, int i2, Object obj) {
            RecyclerView.this.m35363B1(i, i2, obj);
            RecyclerView.this.f4892E0 = true;
        }

        @Override // androidx.recyclerview.widget.C1661a.InterfaceC1662a
        /* renamed from: d */
        public void mo34871d(C1661a.C1663b c1663b) {
            m35204i(c1663b);
        }

        @Override // androidx.recyclerview.widget.C1661a.InterfaceC1662a
        /* renamed from: e */
        public AbstractC1620e0 mo34870e(int i) {
            AbstractC1620e0 m35313a0 = RecyclerView.this.m35313a0(i, true);
            if (m35313a0 == null || RecyclerView.this.f4952w.m34797n(m35313a0.itemView)) {
                return null;
            }
            return m35313a0;
        }

        @Override // androidx.recyclerview.widget.C1661a.InterfaceC1662a
        /* renamed from: f */
        public void mo34869f(int i, int i2) {
            RecyclerView.this.m35351H0(i, i2, false);
            RecyclerView.this.f4890D0 = true;
        }

        @Override // androidx.recyclerview.widget.C1661a.InterfaceC1662a
        /* renamed from: g */
        public void mo34868g(int i, int i2) {
            RecyclerView.this.m35355F0(i, i2);
            RecyclerView.this.f4890D0 = true;
        }

        @Override // androidx.recyclerview.widget.C1661a.InterfaceC1662a
        /* renamed from: h */
        public void mo34867h(int i, int i2) {
            RecyclerView.this.m35351H0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4890D0 = true;
            recyclerView.f4884A0.f4980d += i2;
        }

        /* renamed from: i */
        void m35204i(C1661a.C1663b c1663b) {
            int i = c1663b.f5127a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4891E.mo32337Y0(recyclerView, c1663b.f5128b, c1663b.f5130d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4891E.mo32331b1(recyclerView2, c1663b.f5128b, c1663b.f5130d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4891E.mo32327d1(recyclerView3, c1663b.f5128b, c1663b.f5130d, c1663b.f5129c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4891E.mo32333a1(recyclerView4, c1663b.f5128b, c1663b.f5130d, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1622g {

        /* renamed from: a */
        static final /* synthetic */ int[] f5004a;

        static {
            int[] iArr = new int[AbstractC1623h.EnumC1624a.values().length];
            f5004a = iArr;
            try {
                iArr[AbstractC1623h.EnumC1624a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5004a[AbstractC1623h.EnumC1624a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1623h<VH extends AbstractC1620e0> {
        private final C1625i mObservable = new C1625i();
        private boolean mHasStableIds = false;
        private EnumC1624a mStateRestorationPolicy = EnumC1624a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        /* loaded from: classes2.dex */
        public enum EnumC1624a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                C1382j.m36160a("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof C1640q) {
                    ((C1640q) layoutParams).f5044e = true;
                }
                C1382j.m36159b();
            }
        }

        boolean canRestoreState() {
            int i = C1622g.f5004a[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C1382j.m36160a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C1382j.m36159b();
            }
        }

        public int findRelativeAdapterPositionIn(AbstractC1623h<? extends AbstractC1620e0> abstractC1623h, AbstractC1620e0 abstractC1620e0, int i) {
            if (abstractC1623h == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final EnumC1624a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m35203a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m35202b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m35200d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m35198f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m35201c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m35200d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m35198f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m35197g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m35197g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(AbstractC1626j abstractC1626j) {
            this.mObservable.registerObserver(abstractC1626j);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(EnumC1624a enumC1624a) {
            this.mStateRestorationPolicy = enumC1624a;
            this.mObservable.m35196h();
        }

        public void unregisterAdapterDataObserver(AbstractC1626j abstractC1626j) {
            this.mObservable.unregisterObserver(abstractC1626j);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.m35199e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.m35199e(i, i2, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes2.dex */
    public static class C1625i extends Observable<AbstractC1626j> {
        C1625i() {
        }

        /* renamed from: a */
        public boolean m35203a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m35202b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1626j) ((Observable) this).mObservers.get(size)).mo26471a();
            }
        }

        /* renamed from: c */
        public void m35201c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1626j) ((Observable) this).mObservers.get(size)).mo26468e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void m35200d(int i, int i2) {
            m35199e(i, i2, null);
        }

        /* renamed from: e */
        public void m35199e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1626j) ((Observable) this).mObservers.get(size)).mo26469c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void m35198f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1626j) ((Observable) this).mObservers.get(size)).mo16890d(i, i2);
            }
        }

        /* renamed from: g */
        public void m35197g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1626j) ((Observable) this).mObservers.get(size)).mo26467f(i, i2);
            }
        }

        /* renamed from: h */
        public void m35196h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1626j) ((Observable) this).mObservers.get(size)).mo34635g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1626j {
        /* renamed from: a */
        public void mo26471a() {
        }

        /* renamed from: b */
        public void mo26470b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo26469c(int i, int i2, Object obj) {
            mo26470b(i, i2);
        }

        /* renamed from: d */
        public void mo16890d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo26468e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo26467f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo34635g() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes2.dex */
    public interface InterfaceC1627k {
        /* renamed from: a */
        int m35195a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes2.dex */
    public static class C1628l {
        /* renamed from: a */
        protected EdgeEffect m35194a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1629m {

        /* renamed from: a */
        private InterfaceC1631b f5009a = null;

        /* renamed from: b */
        private ArrayList<InterfaceC1630a> f5010b = new ArrayList<>();

        /* renamed from: c */
        private long f5011c = 120;

        /* renamed from: d */
        private long f5012d = 120;

        /* renamed from: e */
        private long f5013e = 250;

        /* renamed from: f */
        private long f5014f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC1630a {
            /* renamed from: a */
            void m35181a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        /* loaded from: classes2.dex */
        public interface InterfaceC1631b {
            /* renamed from: a */
            void mo35178a(AbstractC1620e0 abstractC1620e0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        /* loaded from: classes2.dex */
        public static class C1632c {

            /* renamed from: a */
            public int f5015a;

            /* renamed from: b */
            public int f5016b;

            /* renamed from: a */
            public C1632c m35180a(AbstractC1620e0 abstractC1620e0) {
                m35179b(abstractC1620e0, 0);
                return this;
            }

            /* renamed from: b */
            public C1632c m35179b(AbstractC1620e0 abstractC1620e0, int i) {
                View view = abstractC1620e0.itemView;
                this.f5015a = view.getLeft();
                this.f5016b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m35193e(AbstractC1620e0 abstractC1620e0) {
            int i = abstractC1620e0.mFlags & 14;
            if (abstractC1620e0.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = abstractC1620e0.getOldPosition();
                int absoluteAdapterPosition = abstractC1620e0.getAbsoluteAdapterPosition();
                return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i : i | IjkMediaMeta.FF_PROFILE_H264_INTRA;
            }
            return i;
        }

        /* renamed from: a */
        public abstract boolean mo34569a(AbstractC1620e0 abstractC1620e0, C1632c c1632c, C1632c c1632c2);

        /* renamed from: b */
        public abstract boolean mo34568b(AbstractC1620e0 abstractC1620e0, AbstractC1620e0 abstractC1620e02, C1632c c1632c, C1632c c1632c2);

        /* renamed from: c */
        public abstract boolean mo34567c(AbstractC1620e0 abstractC1620e0, C1632c c1632c, C1632c c1632c2);

        /* renamed from: d */
        public abstract boolean mo34566d(AbstractC1620e0 abstractC1620e0, C1632c c1632c, C1632c c1632c2);

        /* renamed from: f */
        public abstract boolean mo34565f(AbstractC1620e0 abstractC1620e0);

        /* renamed from: g */
        public boolean mo34735g(AbstractC1620e0 abstractC1620e0, List<Object> list) {
            return mo34565f(abstractC1620e0);
        }

        /* renamed from: h */
        public final void m35192h(AbstractC1620e0 abstractC1620e0) {
            m35185r(abstractC1620e0);
            InterfaceC1631b interfaceC1631b = this.f5009a;
            if (interfaceC1631b != null) {
                interfaceC1631b.mo35178a(abstractC1620e0);
            }
        }

        /* renamed from: i */
        public final void m35191i() {
            int size = this.f5010b.size();
            for (int i = 0; i < size; i++) {
                this.f5010b.get(i).m35181a();
            }
            this.f5010b.clear();
        }

        /* renamed from: j */
        public abstract void mo34734j(AbstractC1620e0 abstractC1620e0);

        /* renamed from: k */
        public abstract void mo34733k();

        /* renamed from: l */
        public long m35190l() {
            return this.f5011c;
        }

        /* renamed from: m */
        public long m35189m() {
            return this.f5014f;
        }

        /* renamed from: n */
        public long m35188n() {
            return this.f5013e;
        }

        /* renamed from: o */
        public long m35187o() {
            return this.f5012d;
        }

        /* renamed from: p */
        public abstract boolean mo34732p();

        /* renamed from: q */
        public C1632c m35186q() {
            return new C1632c();
        }

        /* renamed from: r */
        public void m35185r(AbstractC1620e0 abstractC1620e0) {
        }

        /* renamed from: s */
        public C1632c m35184s(C1614b0 c1614b0, AbstractC1620e0 abstractC1620e0) {
            C1632c m35186q = m35186q();
            m35186q.m35180a(abstractC1620e0);
            return m35186q;
        }

        /* renamed from: t */
        public C1632c m35183t(C1614b0 c1614b0, AbstractC1620e0 abstractC1620e0, int i, List<Object> list) {
            C1632c m35186q = m35186q();
            m35186q.m35180a(abstractC1620e0);
            return m35186q;
        }

        /* renamed from: u */
        public abstract void mo34731u();

        /* renamed from: v */
        void m35182v(InterfaceC1631b interfaceC1631b) {
            this.f5009a = interfaceC1631b;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes2.dex */
    private class C1633n implements AbstractC1629m.InterfaceC1631b {
        C1633n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m.InterfaceC1631b
        /* renamed from: a */
        public void mo35178a(AbstractC1620e0 abstractC1620e0) {
            abstractC1620e0.setIsRecyclable(true);
            if (abstractC1620e0.mShadowedHolder != null && abstractC1620e0.mShadowingHolder == null) {
                abstractC1620e0.mShadowedHolder = null;
            }
            abstractC1620e0.mShadowingHolder = null;
            if (abstractC1620e0.shouldBeKeptAsChild() || RecyclerView.this.m35315Z0(abstractC1620e0.itemView) || !abstractC1620e0.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC1620e0.itemView, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1634o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C1614b0 c1614b0) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1614b0 c1614b0) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1614b0 c1614b0) {
            getItemOffsets(rect, ((C1640q) view.getLayoutParams()).m35079a(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1635p {

        /* renamed from: E */
        int f5022E;

        /* renamed from: F */
        boolean f5023F;

        /* renamed from: G */
        private int f5024G;

        /* renamed from: H */
        private int f5025H;

        /* renamed from: I */
        private int f5026I;

        /* renamed from: J */
        private int f5027J;

        /* renamed from: c */
        C1694f f5028c;

        /* renamed from: d */
        RecyclerView f5029d;

        /* renamed from: y */
        AbstractC1610a0 f5034y;

        /* renamed from: e */
        private final C1673b0.InterfaceC1675b f5030e = new C1636a();

        /* renamed from: f */
        private final C1673b0.InterfaceC1675b f5031f = new C1637b();

        /* renamed from: w */
        C1673b0 f5032w = new C1673b0(this.f5030e);

        /* renamed from: x */
        C1673b0 f5033x = new C1673b0(this.f5031f);

        /* renamed from: z */
        boolean f5035z = false;

        /* renamed from: A */
        boolean f5018A = false;

        /* renamed from: B */
        boolean f5019B = false;

        /* renamed from: C */
        private boolean f5020C = true;

        /* renamed from: D */
        private boolean f5021D = true;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        /* loaded from: classes2.dex */
        class C1636a implements C1673b0.InterfaceC1675b {
            C1636a() {
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: a */
            public int mo34855a(View view) {
                return AbstractC1635p.this.m35130a0(view) - ((ViewGroup.MarginLayoutParams) ((C1640q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: b */
            public int mo34854b() {
                return AbstractC1635p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: c */
            public int mo34853c() {
                return AbstractC1635p.this.m35092u0() - AbstractC1635p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: d */
            public int mo34852d(View view) {
                return AbstractC1635p.this.m35127d0(view) + ((ViewGroup.MarginLayoutParams) ((C1640q) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: p */
            public View mo34851p(int i) {
                return AbstractC1635p.this.m35145S(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        /* loaded from: classes2.dex */
        class C1637b implements C1673b0.InterfaceC1675b {
            C1637b() {
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: a */
            public int mo34855a(View view) {
                return AbstractC1635p.this.m35126e0(view) - ((ViewGroup.MarginLayoutParams) ((C1640q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: b */
            public int mo34854b() {
                return AbstractC1635p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: c */
            public int mo34853c() {
                return AbstractC1635p.this.m35124g0() - AbstractC1635p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: d */
            public int mo34852d(View view) {
                return AbstractC1635p.this.m35132Y(view) + ((ViewGroup.MarginLayoutParams) ((C1640q) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.C1673b0.InterfaceC1675b
            /* renamed from: p */
            public View mo34851p(int i) {
                return AbstractC1635p.this.m35145S(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        /* loaded from: classes2.dex */
        public interface InterfaceC1638c {
            /* renamed from: a */
            void mo34667a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        /* loaded from: classes2.dex */
        public static class C1639d {

            /* renamed from: a */
            public int f5038a;

            /* renamed from: b */
            public int f5039b;

            /* renamed from: c */
            public boolean f5040c;

            /* renamed from: d */
            public boolean f5041d;
        }

        /* renamed from: D0 */
        private static boolean m35172D0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: D1 */
        private void m35171D1(C1647w c1647w, int i, View view) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (m35293h0.shouldIgnore()) {
                return;
            }
            if (m35293h0.isInvalid() && !m35293h0.isRemoved() && !this.f5029d.f4889D.hasStableIds()) {
                m35083y1(i);
                c1647w.m35060C(m35293h0);
                return;
            }
            m35166H(i);
            c1647w.m35059D(view);
            this.f5029d.f4954x.m34836k(m35293h0);
        }

        /* renamed from: I */
        private void m35163I(int i, View view) {
            this.f5028c.m34807d(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /* renamed from: U */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m35139U(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC1635p.m35139U(int, int, int, int, boolean):int");
        }

        /* renamed from: V */
        private int[] m35138V(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int m35092u0 = m35092u0() - getPaddingRight();
            int m35124g0 = m35124g0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - m35092u0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - m35124g0);
            if (m35118j0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: o0 */
        public static C1639d m35107o0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1639d c1639d = new C1639d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8086c.RecyclerView, i, i2);
            c1639d.f5038a = obtainStyledAttributes.getInt(C8086c.RecyclerView_android_orientation, 1);
            c1639d.f5039b = obtainStyledAttributes.getInt(C8086c.RecyclerView_spanCount, 1);
            c1639d.f5040c = obtainStyledAttributes.getBoolean(C8086c.RecyclerView_reverseLayout, false);
            c1639d.f5041d = obtainStyledAttributes.getBoolean(C8086c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return c1639d;
        }

        /* renamed from: p */
        private void m35106p(View view, int i, boolean z) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (!z && !m35293h0.isRemoved()) {
                this.f5029d.f4954x.m34831p(m35293h0);
            } else {
                this.f5029d.f4954x.m34845b(m35293h0);
            }
            C1640q c1640q = (C1640q) view.getLayoutParams();
            if (!m35293h0.wasReturnedFromScrap() && !m35293h0.isScrap()) {
                if (view.getParent() == this.f5029d) {
                    int m34798m = this.f5028c.m34798m(view);
                    if (i == -1) {
                        i = this.f5028c.m34804g();
                    }
                    if (m34798m == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5029d.indexOfChild(view) + this.f5029d.m35334Q());
                    } else if (m34798m != i) {
                        this.f5029d.f4891E.m35162I0(m34798m, i);
                    }
                } else {
                    this.f5028c.m34810a(view, i, false);
                    c1640q.f5044e = true;
                    AbstractC1610a0 abstractC1610a0 = this.f5034y;
                    if (abstractC1610a0 != null && abstractC1610a0.m35230h()) {
                        this.f5034y.m35227k(view);
                    }
                }
            } else {
                if (m35293h0.isScrap()) {
                    m35293h0.unScrap();
                } else {
                    m35293h0.clearReturnedFromScrapFlag();
                }
                this.f5028c.m34808c(view, i, view.getLayoutParams(), false);
            }
            if (c1640q.f5045f) {
                m35293h0.itemView.invalidate();
                c1640q.f5045f = false;
            }
        }

        /* renamed from: x */
        public static int m35086x(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: z0 */
        private boolean m35081z0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int m35092u0 = m35092u0() - getPaddingRight();
            int m35124g0 = m35124g0() - getPaddingBottom();
            Rect rect = this.f5029d.f4883A;
            m35131Z(focusedChild, rect);
            return rect.left - i < m35092u0 && rect.right - i > paddingLeft && rect.top - i2 < m35124g0 && rect.bottom - i2 > paddingTop;
        }

        /* renamed from: A */
        public int mo32378A(C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: A0 */
        public final boolean m35177A0() {
            return this.f5021D;
        }

        /* renamed from: A1 */
        public boolean mo34245A1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] m35138V = m35138V(view, rect);
            int i = m35138V[0];
            int i2 = m35138V[1];
            if ((!z2 || m35081z0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.m35265q1(i, i2);
                }
                return true;
            }
            return false;
        }

        /* renamed from: B */
        public int mo32376B(C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: B0 */
        public boolean m35176B0(C1647w c1647w, C1614b0 c1614b0) {
            return false;
        }

        /* renamed from: B1 */
        public void m35175B1() {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: C */
        public int mo32374C(C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: C0 */
        public boolean m35174C0() {
            return this.f5020C;
        }

        /* renamed from: C1 */
        public void m35173C1() {
            this.f5035z = true;
        }

        /* renamed from: D */
        public int mo32372D(C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: E */
        public int mo32369E(C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: E0 */
        public boolean m35170E0() {
            AbstractC1610a0 abstractC1610a0 = this.f5034y;
            return abstractC1610a0 != null && abstractC1610a0.m35230h();
        }

        /* renamed from: E1 */
        public int mo32368E1(int i, C1647w c1647w, C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: F */
        public int mo32366F(C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: F0 */
        public boolean m35169F0(View view, boolean z, boolean z2) {
            boolean z3 = this.f5032w.m34861b(view, 24579) && this.f5033x.m34861b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: F1 */
        public void mo32365F1(int i) {
        }

        /* renamed from: G */
        public void m35168G(C1647w c1647w) {
            for (int m35142T = m35142T() - 1; m35142T >= 0; m35142T--) {
                m35171D1(c1647w, m35142T, m35145S(m35142T));
            }
        }

        /* renamed from: G0 */
        public void m35167G0(View view, int i, int i2, int i3, int i4) {
            C1640q c1640q = (C1640q) view.getLayoutParams();
            Rect rect = c1640q.f5043d;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c1640q).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c1640q).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c1640q).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1640q).bottomMargin);
        }

        /* renamed from: G1 */
        public int mo32363G1(int i, C1647w c1647w, C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: H */
        public void m35166H(int i) {
            m35163I(i, m35145S(i));
        }

        /* renamed from: H0 */
        public void m35165H0(View view, int i, int i2) {
            C1640q c1640q = (C1640q) view.getLayoutParams();
            Rect m35278m0 = this.f5029d.m35278m0(view);
            int i3 = i + m35278m0.left + m35278m0.right;
            int i4 = i2 + m35278m0.top + m35278m0.bottom;
            int m35139U = m35139U(m35092u0(), m35090v0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1640q).leftMargin + ((ViewGroup.MarginLayoutParams) c1640q).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c1640q).width, mo32305u());
            int m35139U2 = m35139U(m35124g0(), m35122h0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c1640q).topMargin + ((ViewGroup.MarginLayoutParams) c1640q).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c1640q).height, mo32303v());
            if (m35150O1(view, m35139U, m35139U2, c1640q)) {
                view.measure(m35139U, m35139U2);
            }
        }

        @Deprecated
        /* renamed from: H1 */
        public void m35164H1(boolean z) {
            this.f5019B = z;
        }

        /* renamed from: I0 */
        public void m35162I0(int i, int i2) {
            View m35145S = m35145S(i);
            if (m35145S != null) {
                m35166H(i);
                m35101r(m35145S, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f5029d.toString());
        }

        /* renamed from: I1 */
        void m35161I1(RecyclerView recyclerView) {
            m35159J1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: J */
        void m35160J(RecyclerView recyclerView) {
            this.f5018A = true;
            mo32353N0(recyclerView);
        }

        /* renamed from: J0 */
        public void mo35008J0(int i) {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                recyclerView.m35359D0(i);
            }
        }

        /* renamed from: J1 */
        void m35159J1(int i, int i2) {
            this.f5026I = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f5024G = mode;
            if (mode == 0 && !RecyclerView.f4876W0) {
                this.f5026I = 0;
            }
            this.f5027J = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f5025H = mode2;
            if (mode2 != 0 || RecyclerView.f4876W0) {
                return;
            }
            this.f5027J = 0;
        }

        /* renamed from: K */
        void m35158K(RecyclerView recyclerView, C1647w c1647w) {
            this.f5018A = false;
            mo32348P0(recyclerView, c1647w);
        }

        /* renamed from: K0 */
        public void mo35006K0(int i) {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                recyclerView.m35357E0(i);
            }
        }

        /* renamed from: K1 */
        public void m35157K1(int i, int i2) {
            this.f5029d.setMeasuredDimension(i, i2);
        }

        /* renamed from: L */
        public View m35156L(View view) {
            View m35330S;
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView == null || (m35330S = recyclerView.m35330S(view)) == null || this.f5028c.m34797n(m35330S)) {
                return null;
            }
            return m35330S;
        }

        /* renamed from: L0 */
        public void mo32357L0(AbstractC1623h abstractC1623h, AbstractC1623h abstractC1623h2) {
        }

        /* renamed from: L1 */
        public void mo35004L1(Rect rect, int i, int i2) {
            m35157K1(m35086x(i, rect.width() + getPaddingLeft() + getPaddingRight(), m35113m0()), m35086x(i2, rect.height() + getPaddingTop() + getPaddingBottom(), m35115l0()));
        }

        /* renamed from: M */
        public View mo35155M(int i) {
            int m35142T = m35142T();
            for (int i2 = 0; i2 < m35142T; i2++) {
                View m35145S = m35145S(i2);
                AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(m35145S);
                if (m35293h0 != null && m35293h0.getLayoutPosition() == i && !m35293h0.shouldIgnore() && (this.f5029d.f4884A0.m35214e() || !m35293h0.isRemoved())) {
                    return m35145S;
                }
            }
            return null;
        }

        /* renamed from: M0 */
        public boolean m35154M0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: M1 */
        void m35153M1(int i, int i2) {
            int m35142T = m35142T();
            if (m35142T == 0) {
                this.f5029d.m35246x(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < m35142T; i7++) {
                View m35145S = m35145S(i7);
                Rect rect = this.f5029d.f4883A;
                m35131Z(m35145S, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f5029d.f4883A.set(i5, i6, i3, i4);
            mo35004L1(this.f5029d.f4883A, i, i2);
        }

        /* renamed from: N */
        public abstract C1640q mo32354N();

        /* renamed from: N0 */
        public void mo32353N0(RecyclerView recyclerView) {
        }

        /* renamed from: N1 */
        void m35152N1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f5029d = null;
                this.f5028c = null;
                this.f5026I = 0;
                this.f5027J = 0;
            } else {
                this.f5029d = recyclerView;
                this.f5028c = recyclerView.f4952w;
                this.f5026I = recyclerView.getWidth();
                this.f5027J = recyclerView.getHeight();
            }
            this.f5024G = 1073741824;
            this.f5025H = 1073741824;
        }

        /* renamed from: O */
        public C1640q mo32351O(Context context, AttributeSet attributeSet) {
            return new C1640q(context, attributeSet);
        }

        @Deprecated
        /* renamed from: O0 */
        public void m35151O0(RecyclerView recyclerView) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O1 */
        public boolean m35150O1(View view, int i, int i2, C1640q c1640q) {
            return (!view.isLayoutRequested() && this.f5020C && m35172D0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1640q).width) && m35172D0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1640q).height)) ? false : true;
        }

        /* renamed from: P */
        public C1640q mo34999P(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C1640q) {
                return new C1640q((C1640q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C1640q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C1640q(layoutParams);
        }

        /* renamed from: P0 */
        public void mo32348P0(RecyclerView recyclerView, C1647w c1647w) {
            m35151O0(recyclerView);
        }

        /* renamed from: P1 */
        boolean mo35149P1() {
            return false;
        }

        /* renamed from: Q */
        public int m35148Q() {
            return -1;
        }

        /* renamed from: Q0 */
        public View mo34997Q0(View view, int i, C1647w c1647w, C1614b0 c1614b0) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q1 */
        public boolean m35147Q1(View view, int i, int i2, C1640q c1640q) {
            return (this.f5020C && m35172D0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c1640q).width) && m35172D0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c1640q).height)) ? false : true;
        }

        /* renamed from: R */
        public int m35146R(View view) {
            return ((C1640q) view.getLayoutParams()).f5043d.bottom;
        }

        /* renamed from: R0 */
        public void mo34995R0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5029d;
            m35144S0(recyclerView.f4930d, recyclerView.f4884A0, accessibilityEvent);
        }

        /* renamed from: R1 */
        public void mo27028R1(RecyclerView recyclerView, C1614b0 c1614b0, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: S */
        public View m35145S(int i) {
            C1694f c1694f = this.f5028c;
            if (c1694f != null) {
                return c1694f.m34805f(i);
            }
            return null;
        }

        /* renamed from: S0 */
        public void m35144S0(C1647w c1647w, C1614b0 c1614b0, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f5029d.canScrollVertically(-1) && !this.f5029d.canScrollHorizontally(-1) && !this.f5029d.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC1623h abstractC1623h = this.f5029d.f4889D;
            if (abstractC1623h != null) {
                accessibilityEvent.setItemCount(abstractC1623h.getItemCount());
            }
        }

        /* renamed from: S1 */
        public void m35143S1(AbstractC1610a0 abstractC1610a0) {
            AbstractC1610a0 abstractC1610a02 = this.f5034y;
            if (abstractC1610a02 != null && abstractC1610a0 != abstractC1610a02 && abstractC1610a02.m35230h()) {
                this.f5034y.m35224r();
            }
            this.f5034y = abstractC1610a0;
            abstractC1610a0.m35225q(this.f5029d, this);
        }

        /* renamed from: T */
        public int m35142T() {
            C1694f c1694f = this.f5028c;
            if (c1694f != null) {
                return c1694f.m34804g();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: T0 */
        public void m35141T0(C7716c c7716c) {
            RecyclerView recyclerView = this.f5029d;
            mo34244U0(recyclerView.f4930d, recyclerView.f4884A0, c7716c);
        }

        /* renamed from: T1 */
        void m35140T1() {
            AbstractC1610a0 abstractC1610a0 = this.f5034y;
            if (abstractC1610a0 != null) {
                abstractC1610a0.m35224r();
            }
        }

        /* renamed from: U0 */
        public void mo34244U0(C1647w c1647w, C1614b0 c1614b0, C7716c c7716c) {
            if (this.f5029d.canScrollVertically(-1) || this.f5029d.canScrollHorizontally(-1)) {
                c7716c.m17694a(8192);
                c7716c.m17653u0(true);
            }
            if (this.f5029d.canScrollVertically(1) || this.f5029d.canScrollHorizontally(1)) {
                c7716c.m17694a(4096);
                c7716c.m17653u0(true);
            }
            c7716c.m17689c0(C7716c.C7718b.m17637b(mo35103q0(c1647w, c1614b0), mo35134X(c1647w, c1614b0), m35176B0(c1647w, c1614b0), m35100r0(c1647w, c1614b0)));
        }

        /* renamed from: U1 */
        public boolean mo34991U1() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V0 */
        public void m35137V0(View view, C7716c c7716c) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (m35293h0 == null || m35293h0.isRemoved() || this.f5028c.m34797n(m35293h0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f5029d;
            mo35135W0(recyclerView.f4930d, recyclerView.f4884A0, view, c7716c);
        }

        /* renamed from: W */
        public boolean m35136W() {
            RecyclerView recyclerView = this.f5029d;
            return recyclerView != null && recyclerView.f4956y;
        }

        /* renamed from: W0 */
        public void mo35135W0(C1647w c1647w, C1614b0 c1614b0, View view, C7716c c7716c) {
        }

        /* renamed from: X */
        public int mo35134X(C1647w c1647w, C1614b0 c1614b0) {
            return -1;
        }

        /* renamed from: X0 */
        public View m35133X0(View view, int i) {
            return null;
        }

        /* renamed from: Y */
        public int m35132Y(View view) {
            return view.getBottom() + m35146R(view);
        }

        /* renamed from: Y0 */
        public void mo32337Y0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: Z */
        public void m35131Z(View view, Rect rect) {
            RecyclerView.m35287j0(view, rect);
        }

        /* renamed from: Z0 */
        public void mo34981Z0(RecyclerView recyclerView) {
        }

        /* renamed from: a0 */
        public int m35130a0(View view) {
            return view.getLeft() - m35117k0(view);
        }

        /* renamed from: a1 */
        public void mo32333a1(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: b0 */
        public int m35129b0(View view) {
            Rect rect = ((C1640q) view.getLayoutParams()).f5043d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: b1 */
        public void mo32331b1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: c0 */
        public int m35128c0(View view) {
            Rect rect = ((C1640q) view.getLayoutParams()).f5043d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: c1 */
        public void mo32329c1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d0 */
        public int m35127d0(View view) {
            return view.getRight() + m35105p0(view);
        }

        /* renamed from: d1 */
        public void mo32327d1(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo32329c1(recyclerView, i, i2);
        }

        /* renamed from: e0 */
        public int m35126e0(View view) {
            return view.getTop() - m35097s0(view);
        }

        /* renamed from: e1 */
        public void mo32325e1(C1647w c1647w, C1614b0 c1614b0) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: f0 */
        public View m35125f0() {
            View focusedChild;
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f5028c.m34797n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: f1 */
        public void mo32323f1(C1614b0 c1614b0) {
        }

        /* renamed from: g0 */
        public int m35124g0() {
            return this.f5027J;
        }

        /* renamed from: g1 */
        public void m35123g1(C1647w c1647w, C1614b0 c1614b0, int i, int i2) {
            this.f5029d.m35246x(i, i2);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                return C7759x.m17553H(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                return C7759x.m17551I(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: h0 */
        public int m35122h0() {
            return this.f5025H;
        }

        @Deprecated
        /* renamed from: h1 */
        public boolean m35121h1(RecyclerView recyclerView, View view, View view2) {
            return m35170E0() || recyclerView.m35245x0();
        }

        /* renamed from: i0 */
        public int m35120i0() {
            RecyclerView recyclerView = this.f5029d;
            AbstractC1623h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: i1 */
        public boolean m35119i1(RecyclerView recyclerView, C1614b0 c1614b0, View view, View view2) {
            return m35121h1(recyclerView, view, view2);
        }

        /* renamed from: j0 */
        public int m35118j0() {
            return C7759x.m17563C(this.f5029d);
        }

        /* renamed from: j1 */
        public void mo32318j1(Parcelable parcelable) {
        }

        /* renamed from: k0 */
        public int m35117k0(View view) {
            return ((C1640q) view.getLayoutParams()).f5043d.left;
        }

        /* renamed from: k1 */
        public Parcelable mo32316k1() {
            return null;
        }

        /* renamed from: l */
        public void m35116l(View view) {
            m35114m(view, -1);
        }

        /* renamed from: l0 */
        public int m35115l0() {
            return C7759x.m17561D(this.f5029d);
        }

        /* renamed from: l1 */
        public void mo34966l1(int i) {
        }

        /* renamed from: m */
        public void m35114m(View view, int i) {
            m35106p(view, i, true);
        }

        /* renamed from: m0 */
        public int m35113m0() {
            return C7759x.m17559E(this.f5029d);
        }

        /* renamed from: m1 */
        void m35112m1(AbstractC1610a0 abstractC1610a0) {
            if (this.f5034y == abstractC1610a0) {
                this.f5034y = null;
            }
        }

        /* renamed from: n */
        public void m35111n(View view) {
            m35108o(view, -1);
        }

        /* renamed from: n0 */
        public int m35110n0(View view) {
            return ((C1640q) view.getLayoutParams()).m35079a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n1 */
        public boolean m35109n1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f5029d;
            return mo34243o1(recyclerView.f4930d, recyclerView.f4884A0, i, bundle);
        }

        /* renamed from: o */
        public void m35108o(View view, int i) {
            m35106p(view, i, false);
        }

        /* renamed from: o1 */
        public boolean mo34243o1(C1647w c1647w, C1614b0 c1614b0, int i, Bundle bundle) {
            int m35124g0;
            int m35092u0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                m35124g0 = recyclerView.canScrollVertically(1) ? (m35124g0() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f5029d.canScrollHorizontally(1)) {
                    m35092u0 = (m35092u0() - getPaddingLeft()) - getPaddingRight();
                    i2 = m35124g0;
                    i3 = m35092u0;
                }
                i2 = m35124g0;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                m35124g0 = recyclerView.canScrollVertically(-1) ? -((m35124g0() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f5029d.canScrollHorizontally(-1)) {
                    m35092u0 = -((m35092u0() - getPaddingLeft()) - getPaddingRight());
                    i2 = m35124g0;
                    i3 = m35092u0;
                }
                i2 = m35124g0;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f5029d.m35256t1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: p0 */
        public int m35105p0(View view) {
            return ((C1640q) view.getLayoutParams()).f5043d.right;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p1 */
        public boolean m35104p1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f5029d;
            return m35102q1(recyclerView.f4930d, recyclerView.f4884A0, view, i, bundle);
        }

        /* renamed from: q */
        public void mo34960q(String str) {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                recyclerView.m35270p(str);
            }
        }

        /* renamed from: q0 */
        public int mo35103q0(C1647w c1647w, C1614b0 c1614b0) {
            return -1;
        }

        /* renamed from: q1 */
        public boolean m35102q1(C1647w c1647w, C1614b0 c1614b0, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: r */
        public void m35101r(View view, int i) {
            m35098s(view, i, (C1640q) view.getLayoutParams());
        }

        /* renamed from: r0 */
        public int m35100r0(C1647w c1647w, C1614b0 c1614b0) {
            return 0;
        }

        /* renamed from: r1 */
        public void m35099r1() {
            for (int m35142T = m35142T() - 1; m35142T >= 0; m35142T--) {
                this.f5028c.m34794q(m35142T);
            }
        }

        /* renamed from: s */
        public void m35098s(View view, int i, C1640q c1640q) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (m35293h0.isRemoved()) {
                this.f5029d.f4954x.m34845b(m35293h0);
            } else {
                this.f5029d.f4954x.m34831p(m35293h0);
            }
            this.f5028c.m34808c(view, i, c1640q, m35293h0.isRemoved());
        }

        /* renamed from: s0 */
        public int m35097s0(View view) {
            return ((C1640q) view.getLayoutParams()).f5043d.top;
        }

        /* renamed from: s1 */
        public void m35096s1(C1647w c1647w) {
            for (int m35142T = m35142T() - 1; m35142T >= 0; m35142T--) {
                if (!RecyclerView.m35293h0(m35145S(m35142T)).shouldIgnore()) {
                    m35089v1(m35142T, c1647w);
                }
            }
        }

        /* renamed from: t */
        public void m35095t(View view, Rect rect) {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m35278m0(view));
            }
        }

        /* renamed from: t0 */
        public void m35094t0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C1640q) view.getLayoutParams()).f5043d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f5029d != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f5029d.f4887C;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: t1 */
        void m35093t1(C1647w c1647w) {
            int m35040j = c1647w.m35040j();
            for (int i = m35040j - 1; i >= 0; i--) {
                View m35036n = c1647w.m35036n(i);
                AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(m35036n);
                if (!m35293h0.shouldIgnore()) {
                    m35293h0.setIsRecyclable(false);
                    if (m35293h0.isTmpDetached()) {
                        this.f5029d.removeDetachedView(m35036n, false);
                    }
                    AbstractC1629m abstractC1629m = this.f5029d.f4938i0;
                    if (abstractC1629m != null) {
                        abstractC1629m.mo34734j(m35293h0);
                    }
                    m35293h0.setIsRecyclable(true);
                    c1647w.m35025y(m35036n);
                }
            }
            c1647w.m35045e();
            if (m35040j > 0) {
                this.f5029d.invalidate();
            }
        }

        /* renamed from: u */
        public boolean mo32305u() {
            return false;
        }

        /* renamed from: u0 */
        public int m35092u0() {
            return this.f5026I;
        }

        /* renamed from: u1 */
        public void m35091u1(View view, C1647w c1647w) {
            m35084x1(view);
            c1647w.m35061B(view);
        }

        /* renamed from: v */
        public boolean mo32303v() {
            return false;
        }

        /* renamed from: v0 */
        public int m35090v0() {
            return this.f5024G;
        }

        /* renamed from: v1 */
        public void m35089v1(int i, C1647w c1647w) {
            View m35145S = m35145S(i);
            m35083y1(i);
            c1647w.m35061B(m35145S);
        }

        /* renamed from: w */
        public boolean mo32301w(C1640q c1640q) {
            return c1640q != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w0 */
        public boolean m35088w0() {
            int m35142T = m35142T();
            for (int i = 0; i < m35142T; i++) {
                ViewGroup.LayoutParams layoutParams = m35145S(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: w1 */
        public boolean m35087w1(Runnable runnable) {
            RecyclerView recyclerView = this.f5029d;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: x0 */
        public boolean m35085x0() {
            return this.f5018A;
        }

        /* renamed from: x1 */
        public void m35084x1(View view) {
            this.f5028c.m34795p(view);
        }

        /* renamed from: y */
        public void mo34951y(int i, int i2, C1614b0 c1614b0, InterfaceC1638c interfaceC1638c) {
        }

        /* renamed from: y0 */
        public boolean mo34950y0() {
            return this.f5019B;
        }

        /* renamed from: y1 */
        public void m35083y1(int i) {
            if (m35145S(i) != null) {
                this.f5028c.m34794q(i);
            }
        }

        /* renamed from: z */
        public void mo35082z(int i, InterfaceC1638c interfaceC1638c) {
        }

        /* renamed from: z1 */
        public boolean m35080z1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo34245A1(recyclerView, view, rect, z, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes2.dex */
    public interface InterfaceC1641r {
        /* renamed from: a */
        void mo34252a(View view);

        /* renamed from: b */
        void mo34251b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1642s {
        /* renamed from: a */
        public abstract boolean mo34560a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes2.dex */
    public interface InterfaceC1643t {
        /* renamed from: a */
        void mo34701a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo34700b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo34699c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1644u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes2.dex */
    public static class C1645v {

        /* renamed from: a */
        SparseArray<C1646a> f5046a = new SparseArray<>();

        /* renamed from: b */
        private int f5047b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        /* loaded from: classes2.dex */
        public static class C1646a {

            /* renamed from: a */
            final ArrayList<AbstractC1620e0> f5048a = new ArrayList<>();

            /* renamed from: b */
            int f5049b = 5;

            /* renamed from: c */
            long f5050c = 0;

            /* renamed from: d */
            long f5051d = 0;

            C1646a() {
            }
        }

        /* renamed from: g */
        private C1646a m35069g(int i) {
            C1646a c1646a = this.f5046a.get(i);
            if (c1646a == null) {
                C1646a c1646a2 = new C1646a();
                this.f5046a.put(i, c1646a2);
                return c1646a2;
            }
            return c1646a;
        }

        /* renamed from: a */
        void m35075a() {
            this.f5047b++;
        }

        /* renamed from: b */
        public void m35074b() {
            for (int i = 0; i < this.f5046a.size(); i++) {
                this.f5046a.valueAt(i).f5048a.clear();
            }
        }

        /* renamed from: c */
        void m35073c() {
            this.f5047b--;
        }

        /* renamed from: d */
        void m35072d(int i, long j) {
            C1646a m35069g = m35069g(i);
            m35069g.f5051d = m35066j(m35069g.f5051d, j);
        }

        /* renamed from: e */
        void m35071e(int i, long j) {
            C1646a m35069g = m35069g(i);
            m35069g.f5050c = m35066j(m35069g.f5050c, j);
        }

        /* renamed from: f */
        public AbstractC1620e0 m35070f(int i) {
            C1646a c1646a = this.f5046a.get(i);
            if (c1646a == null || c1646a.f5048a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC1620e0> arrayList = c1646a.f5048a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: h */
        void m35068h(AbstractC1623h abstractC1623h, AbstractC1623h abstractC1623h2, boolean z) {
            if (abstractC1623h != null) {
                m35073c();
            }
            if (!z && this.f5047b == 0) {
                m35074b();
            }
            if (abstractC1623h2 != null) {
                m35075a();
            }
        }

        /* renamed from: i */
        public void m35067i(AbstractC1620e0 abstractC1620e0) {
            int itemViewType = abstractC1620e0.getItemViewType();
            ArrayList<AbstractC1620e0> arrayList = m35069g(itemViewType).f5048a;
            if (this.f5046a.get(itemViewType).f5049b <= arrayList.size()) {
                return;
            }
            abstractC1620e0.resetInternal();
            arrayList.add(abstractC1620e0);
        }

        /* renamed from: j */
        long m35066j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: k */
        public void m35065k(int i, int i2) {
            C1646a m35069g = m35069g(i);
            m35069g.f5049b = i2;
            ArrayList<AbstractC1620e0> arrayList = m35069g.f5048a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: l */
        boolean m35064l(int i, long j, long j2) {
            long j3 = m35069g(i).f5051d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: m */
        boolean m35063m(int i, long j, long j2) {
            long j3 = m35069g(i).f5050c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes2.dex */
    public final class C1647w {

        /* renamed from: a */
        final ArrayList<AbstractC1620e0> f5052a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<AbstractC1620e0> f5053b = null;

        /* renamed from: c */
        final ArrayList<AbstractC1620e0> f5054c = new ArrayList<>();

        /* renamed from: d */
        private final List<AbstractC1620e0> f5055d = Collections.unmodifiableList(this.f5052a);

        /* renamed from: e */
        private int f5056e = 2;

        /* renamed from: f */
        int f5057f = 2;

        /* renamed from: g */
        C1645v f5058g;

        /* renamed from: h */
        private AbstractC1616c0 f5059h;

        public C1647w() {
        }

        /* renamed from: H */
        private boolean m35055H(AbstractC1620e0 abstractC1620e0, int i, int i2, long j) {
            abstractC1620e0.mBindingAdapter = null;
            abstractC1620e0.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = abstractC1620e0.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == Long.MAX_VALUE || this.f5058g.m35064l(itemViewType, nanoTime, j)) {
                RecyclerView.this.f4889D.bindViewHolder(abstractC1620e0, i);
                this.f5058g.m35072d(abstractC1620e0.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
                m35048b(abstractC1620e0);
                if (RecyclerView.this.f4884A0.m35214e()) {
                    abstractC1620e0.mPreLayoutPosition = i2;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m35048b(AbstractC1620e0 abstractC1620e0) {
            if (RecyclerView.this.m35248w0()) {
                View view = abstractC1620e0.itemView;
                if (C7759x.m17567A(view) == 0) {
                    C7759x.m17478z0(view, 1);
                }
                C1749w c1749w = RecyclerView.this.f4898H0;
                if (c1749w == null) {
                    return;
                }
                C7676a m34593n = c1749w.m34593n();
                if (m34593n instanceof C1749w.C1750a) {
                    ((C1749w.C1750a) m34593n).m34590o(view);
                }
                C7759x.m17498p0(view, m34593n);
            }
        }

        /* renamed from: q */
        private void m35033q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m35033q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m35032r(AbstractC1620e0 abstractC1620e0) {
            View view = abstractC1620e0.itemView;
            if (view instanceof ViewGroup) {
                m35033q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m35062A(int i) {
            m35049a(this.f5054c.get(i), true);
            this.f5054c.remove(i);
        }

        /* renamed from: B */
        public void m35061B(View view) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (m35293h0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m35293h0.isScrap()) {
                m35293h0.unScrap();
            } else if (m35293h0.wasReturnedFromScrap()) {
                m35293h0.clearReturnedFromScrapFlag();
            }
            m35060C(m35293h0);
            if (RecyclerView.this.f4938i0 == null || m35293h0.isRecyclable()) {
                return;
            }
            RecyclerView.this.f4938i0.mo34734j(m35293h0);
        }

        /* renamed from: C */
        void m35060C(AbstractC1620e0 abstractC1620e0) {
            boolean z;
            boolean z2 = true;
            if (!abstractC1620e0.isScrap() && abstractC1620e0.itemView.getParent() == null) {
                if (!abstractC1620e0.isTmpDetached()) {
                    if (!abstractC1620e0.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = abstractC1620e0.doesTransientStatePreventRecycling();
                        AbstractC1623h abstractC1623h = RecyclerView.this.f4889D;
                        if ((abstractC1623h != null && doesTransientStatePreventRecycling && abstractC1623h.onFailedToRecycleView(abstractC1620e0)) || abstractC1620e0.isRecyclable()) {
                            if (this.f5057f <= 0 || abstractC1620e0.hasAnyOfTheFlags(526)) {
                                z = false;
                            } else {
                                int size = this.f5054c.size();
                                if (size >= this.f5057f && size > 0) {
                                    m35062A(0);
                                    size--;
                                }
                                if (RecyclerView.f4878Y0 && size > 0 && !RecyclerView.this.f4959z0.m34664d(abstractC1620e0.mPosition)) {
                                    int i = size - 1;
                                    while (i >= 0) {
                                        if (!RecyclerView.this.f4959z0.m34664d(this.f5054c.get(i).mPosition)) {
                                            break;
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                }
                                this.f5054c.add(size, abstractC1620e0);
                                z = true;
                            }
                            if (!z) {
                                m35049a(abstractC1620e0, true);
                                r1 = z;
                                RecyclerView.this.f4954x.m34830q(abstractC1620e0);
                                if (r1 && !z2 && doesTransientStatePreventRecycling) {
                                    abstractC1620e0.mBindingAdapter = null;
                                    abstractC1620e0.mOwnerRecyclerView = null;
                                    return;
                                }
                                return;
                            }
                            r1 = z;
                        }
                        z2 = false;
                        RecyclerView.this.f4954x.m34830q(abstractC1620e0);
                        if (r1) {
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m35334Q());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC1620e0 + RecyclerView.this.m35334Q());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC1620e0.isScrap());
            sb.append(" isAttached:");
            sb.append(abstractC1620e0.itemView.getParent() != null);
            sb.append(RecyclerView.this.m35334Q());
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: D */
        void m35059D(View view) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            if (!m35293h0.hasAnyOfTheFlags(12) && m35293h0.isUpdated() && !RecyclerView.this.m35267q(m35293h0)) {
                if (this.f5053b == null) {
                    this.f5053b = new ArrayList<>();
                }
                m35293h0.setScrapContainer(this, true);
                this.f5053b.add(m35293h0);
            } else if (m35293h0.isInvalid() && !m35293h0.isRemoved() && !RecyclerView.this.f4889D.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m35334Q());
            } else {
                m35293h0.setScrapContainer(this, false);
                this.f5052a.add(m35293h0);
            }
        }

        /* renamed from: E */
        void m35058E(C1645v c1645v) {
            C1645v c1645v2 = this.f5058g;
            if (c1645v2 != null) {
                c1645v2.m35073c();
            }
            this.f5058g = c1645v;
            if (c1645v == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f5058g.m35075a();
        }

        /* renamed from: F */
        void m35057F(AbstractC1616c0 abstractC1616c0) {
            this.f5059h = abstractC1616c0;
        }

        /* renamed from: G */
        public void m35056G(int i) {
            this.f5056e = i;
            m35052K();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:100:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC1620e0 m35054I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 615
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1647w.m35054I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        /* renamed from: J */
        void m35053J(AbstractC1620e0 abstractC1620e0) {
            if (abstractC1620e0.mInChangeScrap) {
                this.f5053b.remove(abstractC1620e0);
            } else {
                this.f5052a.remove(abstractC1620e0);
            }
            abstractC1620e0.mScrapContainer = null;
            abstractC1620e0.mInChangeScrap = false;
            abstractC1620e0.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K */
        public void m35052K() {
            AbstractC1635p abstractC1635p = RecyclerView.this.f4891E;
            this.f5057f = this.f5056e + (abstractC1635p != null ? abstractC1635p.f5022E : 0);
            for (int size = this.f5054c.size() - 1; size >= 0 && this.f5054c.size() > this.f5057f; size--) {
                m35062A(size);
            }
        }

        /* renamed from: L */
        boolean m35051L(AbstractC1620e0 abstractC1620e0) {
            if (abstractC1620e0.isRemoved()) {
                return RecyclerView.this.f4884A0.m35214e();
            }
            int i = abstractC1620e0.mPosition;
            if (i >= 0 && i < RecyclerView.this.f4889D.getItemCount()) {
                if (RecyclerView.this.f4884A0.m35214e() || RecyclerView.this.f4889D.getItemViewType(abstractC1620e0.mPosition) == abstractC1620e0.getItemViewType()) {
                    return !RecyclerView.this.f4889D.hasStableIds() || abstractC1620e0.getItemId() == RecyclerView.this.f4889D.getItemId(abstractC1620e0.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1620e0 + RecyclerView.this.m35334Q());
        }

        /* renamed from: M */
        void m35050M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f5054c.size() - 1; size >= 0; size--) {
                AbstractC1620e0 abstractC1620e0 = this.f5054c.get(size);
                if (abstractC1620e0 != null && (i3 = abstractC1620e0.mPosition) >= i && i3 < i4) {
                    abstractC1620e0.addFlags(2);
                    m35062A(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m35049a(AbstractC1620e0 abstractC1620e0, boolean z) {
            RecyclerView.m35261s(abstractC1620e0);
            View view = abstractC1620e0.itemView;
            C1749w c1749w = RecyclerView.this.f4898H0;
            if (c1749w != null) {
                C7676a m34593n = c1749w.m34593n();
                C7759x.m17498p0(view, m34593n instanceof C1749w.C1750a ? ((C1749w.C1750a) m34593n).m34591n(view) : null);
            }
            if (z) {
                m35043g(abstractC1620e0);
            }
            abstractC1620e0.mBindingAdapter = null;
            abstractC1620e0.mOwnerRecyclerView = null;
            m35041i().m35067i(abstractC1620e0);
        }

        /* renamed from: c */
        public void m35047c() {
            this.f5052a.clear();
            m35024z();
        }

        /* renamed from: d */
        void m35046d() {
            int size = this.f5054c.size();
            for (int i = 0; i < size; i++) {
                this.f5054c.get(i).clearOldPosition();
            }
            int size2 = this.f5052a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f5052a.get(i2).clearOldPosition();
            }
            ArrayList<AbstractC1620e0> arrayList = this.f5053b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f5053b.get(i3).clearOldPosition();
                }
            }
        }

        /* renamed from: e */
        void m35045e() {
            this.f5052a.clear();
            ArrayList<AbstractC1620e0> arrayList = this.f5053b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m35044f(int i) {
            if (i >= 0 && i < RecyclerView.this.f4884A0.m35217b()) {
                return !RecyclerView.this.f4884A0.m35214e() ? i : RecyclerView.this.f4934f.m34888m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f4884A0.m35217b() + RecyclerView.this.m35334Q());
        }

        /* renamed from: g */
        void m35043g(AbstractC1620e0 abstractC1620e0) {
            InterfaceC1648x interfaceC1648x = RecyclerView.this.f4893F;
            if (interfaceC1648x != null) {
                interfaceC1648x.m35023a(abstractC1620e0);
            }
            int size = RecyclerView.this.f4895G.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.f4895G.get(i).m35023a(abstractC1620e0);
            }
            AbstractC1623h abstractC1623h = RecyclerView.this.f4889D;
            if (abstractC1623h != null) {
                abstractC1623h.onViewRecycled(abstractC1620e0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4884A0 != null) {
                recyclerView.f4954x.m34830q(abstractC1620e0);
            }
        }

        /* renamed from: h */
        AbstractC1620e0 m35042h(int i) {
            int size;
            int m34888m;
            ArrayList<AbstractC1620e0> arrayList = this.f5053b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC1620e0 abstractC1620e0 = this.f5053b.get(i2);
                    if (!abstractC1620e0.wasReturnedFromScrap() && abstractC1620e0.getLayoutPosition() == i) {
                        abstractC1620e0.addFlags(32);
                        return abstractC1620e0;
                    }
                }
                if (RecyclerView.this.f4889D.hasStableIds() && (m34888m = RecyclerView.this.f4934f.m34888m(i)) > 0 && m34888m < RecyclerView.this.f4889D.getItemCount()) {
                    long itemId = RecyclerView.this.f4889D.getItemId(m34888m);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC1620e0 abstractC1620e02 = this.f5053b.get(i3);
                        if (!abstractC1620e02.wasReturnedFromScrap() && abstractC1620e02.getItemId() == itemId) {
                            abstractC1620e02.addFlags(32);
                            return abstractC1620e02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        C1645v m35041i() {
            if (this.f5058g == null) {
                this.f5058g = new C1645v();
            }
            return this.f5058g;
        }

        /* renamed from: j */
        int m35040j() {
            return this.f5052a.size();
        }

        /* renamed from: k */
        public List<AbstractC1620e0> m35039k() {
            return this.f5055d;
        }

        /* renamed from: l */
        AbstractC1620e0 m35038l(long j, int i, boolean z) {
            for (int size = this.f5052a.size() - 1; size >= 0; size--) {
                AbstractC1620e0 abstractC1620e0 = this.f5052a.get(size);
                if (abstractC1620e0.getItemId() == j && !abstractC1620e0.wasReturnedFromScrap()) {
                    if (i == abstractC1620e0.getItemViewType()) {
                        abstractC1620e0.addFlags(32);
                        if (abstractC1620e0.isRemoved() && !RecyclerView.this.f4884A0.m35214e()) {
                            abstractC1620e0.setFlags(2, 14);
                        }
                        return abstractC1620e0;
                    } else if (!z) {
                        this.f5052a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC1620e0.itemView, false);
                        m35025y(abstractC1620e0.itemView);
                    }
                }
            }
            int size2 = this.f5054c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC1620e0 abstractC1620e02 = this.f5054c.get(size2);
                if (abstractC1620e02.getItemId() == j && !abstractC1620e02.isAttachedToTransitionOverlay()) {
                    if (i == abstractC1620e02.getItemViewType()) {
                        if (!z) {
                            this.f5054c.remove(size2);
                        }
                        return abstractC1620e02;
                    } else if (!z) {
                        m35062A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        AbstractC1620e0 m35037m(int i, boolean z) {
            View m34806e;
            int size = this.f5052a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1620e0 abstractC1620e0 = this.f5052a.get(i2);
                if (!abstractC1620e0.wasReturnedFromScrap() && abstractC1620e0.getLayoutPosition() == i && !abstractC1620e0.isInvalid() && (RecyclerView.this.f4884A0.f4984h || !abstractC1620e0.isRemoved())) {
                    abstractC1620e0.addFlags(32);
                    return abstractC1620e0;
                }
            }
            if (!z && (m34806e = RecyclerView.this.f4952w.m34806e(i)) != null) {
                AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(m34806e);
                RecyclerView.this.f4952w.m34792s(m34806e);
                int m34798m = RecyclerView.this.f4952w.m34798m(m34806e);
                if (m34798m != -1) {
                    RecyclerView.this.f4952w.m34807d(m34798m);
                    m35059D(m34806e);
                    m35293h0.addFlags(8224);
                    return m35293h0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m35293h0 + RecyclerView.this.m35334Q());
            }
            int size2 = this.f5054c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC1620e0 abstractC1620e02 = this.f5054c.get(i3);
                if (!abstractC1620e02.isInvalid() && abstractC1620e02.getLayoutPosition() == i && !abstractC1620e02.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.f5054c.remove(i3);
                    }
                    return abstractC1620e02;
                }
            }
            return null;
        }

        /* renamed from: n */
        View m35036n(int i) {
            return this.f5052a.get(i).itemView;
        }

        /* renamed from: o */
        public View m35035o(int i) {
            return m35034p(i, false);
        }

        /* renamed from: p */
        View m35034p(int i, boolean z) {
            return m35054I(i, z, Long.MAX_VALUE).itemView;
        }

        /* renamed from: s */
        void m35031s() {
            int size = this.f5054c.size();
            for (int i = 0; i < size; i++) {
                C1640q c1640q = (C1640q) this.f5054c.get(i).itemView.getLayoutParams();
                if (c1640q != null) {
                    c1640q.f5044e = true;
                }
            }
        }

        /* renamed from: t */
        void m35030t() {
            int size = this.f5054c.size();
            for (int i = 0; i < size; i++) {
                AbstractC1620e0 abstractC1620e0 = this.f5054c.get(i);
                if (abstractC1620e0 != null) {
                    abstractC1620e0.addFlags(6);
                    abstractC1620e0.addChangePayload(null);
                }
            }
            AbstractC1623h abstractC1623h = RecyclerView.this.f4889D;
            if (abstractC1623h == null || !abstractC1623h.hasStableIds()) {
                m35024z();
            }
        }

        /* renamed from: u */
        void m35029u(int i, int i2) {
            int size = this.f5054c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC1620e0 abstractC1620e0 = this.f5054c.get(i3);
                if (abstractC1620e0 != null && abstractC1620e0.mPosition >= i) {
                    abstractC1620e0.offsetPosition(i2, false);
                }
            }
        }

        /* renamed from: v */
        void m35028v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f5054c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC1620e0 abstractC1620e0 = this.f5054c.get(i7);
                if (abstractC1620e0 != null && (i6 = abstractC1620e0.mPosition) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        abstractC1620e0.offsetPosition(i2 - i, false);
                    } else {
                        abstractC1620e0.offsetPosition(i3, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m35027w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f5054c.size() - 1; size >= 0; size--) {
                AbstractC1620e0 abstractC1620e0 = this.f5054c.get(size);
                if (abstractC1620e0 != null) {
                    int i4 = abstractC1620e0.mPosition;
                    if (i4 >= i3) {
                        abstractC1620e0.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        abstractC1620e0.addFlags(8);
                        m35062A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m35026x(AbstractC1623h abstractC1623h, AbstractC1623h abstractC1623h2, boolean z) {
            m35047c();
            m35041i().m35068h(abstractC1623h, abstractC1623h2, z);
        }

        /* renamed from: y */
        void m35025y(View view) {
            AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(view);
            m35293h0.mScrapContainer = null;
            m35293h0.mInChangeScrap = false;
            m35293h0.clearReturnedFromScrapFlag();
            m35060C(m35293h0);
        }

        /* renamed from: z */
        void m35024z() {
            for (int size = this.f5054c.size() - 1; size >= 0; size--) {
                m35062A(size);
            }
            this.f5054c.clear();
            if (RecyclerView.f4878Y0) {
                RecyclerView.this.f4959z0.m34666b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes2.dex */
    public interface InterfaceC1648x {
        /* renamed from: a */
        void m35023a(AbstractC1620e0 abstractC1620e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes2.dex */
    public class C1649y extends AbstractC1626j {
        C1649y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: a */
        public void mo26471a() {
            RecyclerView.this.m35270p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4884A0.f4983g = true;
            recyclerView.m35327T0(true);
            if (RecyclerView.this.f4934f.m34885p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: c */
        public void mo26469c(int i, int i2, Object obj) {
            RecyclerView.this.m35270p(null);
            if (RecyclerView.this.f4934f.m34883r(i, i2, obj)) {
                m35022h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: d */
        public void mo16890d(int i, int i2) {
            RecyclerView.this.m35270p(null);
            if (RecyclerView.this.f4934f.m34882s(i, i2)) {
                m35022h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: e */
        public void mo26468e(int i, int i2, int i3) {
            RecyclerView.this.m35270p(null);
            if (RecyclerView.this.f4934f.m34881t(i, i2, i3)) {
                m35022h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: f */
        public void mo26467f(int i, int i2) {
            RecyclerView.this.m35270p(null);
            if (RecyclerView.this.f4934f.m34880u(i, i2)) {
                m35022h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: g */
        public void mo34635g() {
            AbstractC1623h abstractC1623h;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4932e == null || (abstractC1623h = recyclerView.f4889D) == null || !abstractC1623h.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        /* renamed from: h */
        void m35022h() {
            if (RecyclerView.f4877X0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f4905L && recyclerView.f4903K) {
                    C7759x.m17514h0(recyclerView, recyclerView.f4958z);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f4921T = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f4875V0 = i == 18 || i == 19 || i == 20;
        f4876W0 = Build.VERSION.SDK_INT >= 23;
        f4877X0 = Build.VERSION.SDK_INT >= 16;
        f4878Y0 = Build.VERSION.SDK_INT >= 21;
        f4879Z0 = Build.VERSION.SDK_INT <= 15;
        f4880a1 = Build.VERSION.SDK_INT <= 15;
        Class<?> cls = Integer.TYPE;
        f4881b1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4882c1 = new animationInterpolatorC1615c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: A1 */
    private void m35366A1() {
        this.f4955x0.m35205f();
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            abstractC1635p.m35140T1();
        }
    }

    /* renamed from: B */
    private void m35365B() {
        int i = this.f4919S;
        this.f4919S = 0;
        if (i == 0 || !m35248w0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(IjkMediaMeta.FF_PROFILE_H264_INTRA);
        C7715b.m17726b(obtain, i);
        sendAccessibilityEventUnchecked(obtain);
    }

    /* renamed from: C0 */
    private void m35361C0(int i, int i2, MotionEvent motionEvent, int i3) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f4915Q) {
        } else {
            int[] iArr = this.f4910N0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean mo32305u = abstractC1635p.mo32305u();
            boolean mo32303v = this.f4891E.mo32303v();
            int i4 = mo32305u ? 1 : 0;
            if (mo32303v) {
                i4 |= 2;
            }
            m35247w1(i4, i3);
            if (m35354G(mo32305u ? i : 0, mo32303v ? i2 : 0, this.f4910N0, this.f4906L0, i3)) {
                int[] iArr2 = this.f4910N0;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            m35283k1(mo32305u ? i : 0, mo32303v ? i2 : 0, motionEvent, i3);
            if (this.f4957y0 != null && (i != 0 || i2 != 0)) {
                this.f4957y0.m34673f(this, i, i2);
            }
            m35241y1(i3);
        }
    }

    /* renamed from: D */
    private void m35360D() {
        boolean z = true;
        this.f4884A0.m35218a(1);
        m35332R(this.f4884A0);
        this.f4884A0.f4986j = false;
        m35250v1();
        this.f4954x.m34841f();
        m35345K0();
        m35329S0();
        m35289i1();
        C1614b0 c1614b0 = this.f4884A0;
        c1614b0.f4985i = (c1614b0.f4987k && this.f4892E0) ? false : false;
        this.f4892E0 = false;
        this.f4890D0 = false;
        C1614b0 c1614b02 = this.f4884A0;
        c1614b02.f4984h = c1614b02.f4988l;
        c1614b02.f4982f = this.f4889D.getItemCount();
        m35324V(this.f4902J0);
        if (this.f4884A0.f4987k) {
            int m34804g = this.f4952w.m34804g();
            for (int i = 0; i < m34804g; i++) {
                AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34805f(i));
                if (!m35293h0.shouldIgnore() && (!m35293h0.isInvalid() || this.f4889D.hasStableIds())) {
                    this.f4954x.m34842e(m35293h0, this.f4938i0.m35183t(this.f4884A0, m35293h0, AbstractC1629m.m35193e(m35293h0), m35293h0.getUnmodifiedPayloads()));
                    if (this.f4884A0.f4985i && m35293h0.isUpdated() && !m35293h0.isRemoved() && !m35293h0.shouldIgnore() && !m35293h0.isInvalid()) {
                        this.f4954x.m34844c(m35305d0(m35293h0), m35293h0);
                    }
                }
            }
        }
        if (this.f4884A0.f4988l) {
            m35286j1();
            C1614b0 c1614b03 = this.f4884A0;
            boolean z2 = c1614b03.f4983g;
            c1614b03.f4983g = false;
            this.f4891E.mo32325e1(this.f4930d, c1614b03);
            this.f4884A0.f4983g = z2;
            for (int i2 = 0; i2 < this.f4952w.m34804g(); i2++) {
                AbstractC1620e0 m35293h02 = m35293h0(this.f4952w.m34805f(i2));
                if (!m35293h02.shouldIgnore() && !this.f4954x.m34838i(m35293h02)) {
                    int m35193e = AbstractC1629m.m35193e(m35293h02);
                    boolean hasAnyOfTheFlags = m35293h02.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        m35193e |= 4096;
                    }
                    AbstractC1629m.C1632c m35183t = this.f4938i0.m35183t(this.f4884A0, m35293h02, m35193e, m35293h02.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        m35323V0(m35293h02, m35183t);
                    } else {
                        this.f4954x.m34846a(m35293h02, m35183t);
                    }
                }
            }
            m35258t();
        } else {
            m35258t();
        }
        m35343L0();
        m35244x1(false);
        this.f4884A0.f4981e = 2;
    }

    /* renamed from: E */
    private void m35358E() {
        m35250v1();
        m35345K0();
        this.f4884A0.m35218a(6);
        this.f4934f.m34891j();
        this.f4884A0.f4982f = this.f4889D.getItemCount();
        this.f4884A0.f4980d = 0;
        if (this.f4932e != null && this.f4889D.canRestoreState()) {
            Parcelable parcelable = this.f4932e.f5062e;
            if (parcelable != null) {
                this.f4891E.mo32318j1(parcelable);
            }
            this.f4932e = null;
        }
        C1614b0 c1614b0 = this.f4884A0;
        c1614b0.f4984h = false;
        this.f4891E.mo32325e1(this.f4930d, c1614b0);
        C1614b0 c1614b02 = this.f4884A0;
        c1614b02.f4983g = false;
        c1614b02.f4987k = c1614b02.f4987k && this.f4938i0 != null;
        this.f4884A0.f4981e = 4;
        m35343L0();
        m35244x1(false);
    }

    /* renamed from: F */
    private void m35356F() {
        this.f4884A0.m35218a(4);
        m35250v1();
        m35345K0();
        C1614b0 c1614b0 = this.f4884A0;
        c1614b0.f4981e = 1;
        if (c1614b0.f4987k) {
            for (int m34804g = this.f4952w.m34804g() - 1; m34804g >= 0; m34804g--) {
                AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34805f(m34804g));
                if (!m35293h0.shouldIgnore()) {
                    long m35305d0 = m35305d0(m35293h0);
                    AbstractC1629m.C1632c m35184s = this.f4938i0.m35184s(this.f4884A0, m35293h0);
                    AbstractC1620e0 m34840g = this.f4954x.m34840g(m35305d0);
                    if (m34840g != null && !m34840g.shouldIgnore()) {
                        boolean m34839h = this.f4954x.m34839h(m34840g);
                        boolean m34839h2 = this.f4954x.m34839h(m35293h0);
                        if (m34839h && m34840g == m35293h0) {
                            this.f4954x.m34843d(m35293h0, m35184s);
                        } else {
                            AbstractC1629m.C1632c m34833n = this.f4954x.m34833n(m34840g);
                            this.f4954x.m34843d(m35293h0, m35184s);
                            AbstractC1629m.C1632c m34834m = this.f4954x.m34834m(m35293h0);
                            if (m34833n == null) {
                                m35272o0(m35305d0, m35293h0, m34840g);
                            } else {
                                m35276n(m34840g, m35293h0, m34833n, m34834m, m34839h, m34839h2);
                            }
                        }
                    } else {
                        this.f4954x.m34843d(m35293h0, m35184s);
                    }
                }
            }
            this.f4954x.m34832o(this.f4922T0);
        }
        this.f4891E.m35093t1(this.f4930d);
        C1614b0 c1614b02 = this.f4884A0;
        c1614b02.f4979c = c1614b02.f4982f;
        this.f4925W = false;
        this.f4926a0 = false;
        c1614b02.f4987k = false;
        c1614b02.f4988l = false;
        this.f4891E.f5035z = false;
        ArrayList<AbstractC1620e0> arrayList = this.f4930d.f5053b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p.f5023F) {
            abstractC1635p.f5022E = 0;
            abstractC1635p.f5023F = false;
            this.f4930d.m35052K();
        }
        this.f4891E.mo32323f1(this.f4884A0);
        m35343L0();
        m35244x1(false);
        this.f4954x.m34841f();
        int[] iArr = this.f4902J0;
        if (m35243y(iArr[0], iArr[1])) {
            m35348J(0, 0);
        }
        m35321W0();
        m35295g1();
    }

    /* renamed from: L */
    private boolean m35344L(MotionEvent motionEvent) {
        InterfaceC1643t interfaceC1643t = this.f4901J;
        if (interfaceC1643t == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m35326U(motionEvent);
        }
        interfaceC1643t.mo34701a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f4901J = null;
        }
        return true;
    }

    /* renamed from: N0 */
    private void m35339N0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4940k0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4940k0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4944o0 = x;
            this.f4942m0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4945p0 = y;
            this.f4943n0 = y;
        }
    }

    /* renamed from: R0 */
    private boolean m35331R0() {
        return this.f4938i0 != null && this.f4891E.mo34991U1();
    }

    /* renamed from: S0 */
    private void m35329S0() {
        if (this.f4925W) {
            this.f4934f.m34876y();
            if (this.f4926a0) {
                this.f4891E.mo34981Z0(this);
            }
        }
        if (m35331R0()) {
            this.f4934f.m34878w();
        } else {
            this.f4934f.m34891j();
        }
        boolean z = false;
        boolean z2 = this.f4890D0 || this.f4892E0;
        this.f4884A0.f4987k = this.f4909N && this.f4938i0 != null && (this.f4925W || z2 || this.f4891E.f5035z) && (!this.f4925W || this.f4889D.hasStableIds());
        C1614b0 c1614b0 = this.f4884A0;
        if (c1614b0.f4987k && z2 && !this.f4925W && m35331R0()) {
            z = true;
        }
        c1614b0.f4988l = z;
    }

    /* renamed from: U */
    private boolean m35326U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4899I.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1643t interfaceC1643t = this.f4899I.get(i);
            if (interfaceC1643t.mo34700b(this, motionEvent) && action != 3) {
                this.f4901J = interfaceC1643t;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m35325U0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.m35340N()
            android.widget.EdgeEffect r3 = r6.f4933e0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C1393d.m36118a(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.m35338O()
            android.widget.EdgeEffect r3 = r6.f4936g0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C1393d.m36118a(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.m35336P()
            android.widget.EdgeEffect r9 = r6.f4935f0
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C1393d.m36118a(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.m35342M()
            android.widget.EdgeEffect r9 = r6.f4937h0
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C1393d.m36118a(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            p201g.p227h.p238l.C7759x.m17516g0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m35325U0(float, float, float, float):void");
    }

    /* renamed from: V */
    private void m35324V(int[] iArr) {
        int m34804g = this.f4952w.m34804g();
        if (m34804g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m34804g; i3++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34805f(i3));
            if (!m35293h0.shouldIgnore()) {
                int layoutPosition = m35293h0.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: W */
    static RecyclerView m35322W(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView m35322W = m35322W(viewGroup.getChildAt(i));
                if (m35322W != null) {
                    return m35322W;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: W0 */
    private void m35321W0() {
        View findViewById;
        if (!this.f4953w0 || this.f4889D == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (f4880a1 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.f4952w.m34804g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.f4952w.m34797n(focusedChild)) {
                return;
            }
        }
        View view = null;
        AbstractC1620e0 m35316Z = (this.f4884A0.f4990n == -1 || !this.f4889D.hasStableIds()) ? null : m35316Z(this.f4884A0.f4990n);
        if (m35316Z != null && !this.f4952w.m34797n(m35316Z.itemView) && m35316Z.itemView.hasFocusable()) {
            view = m35316Z.itemView;
        } else if (this.f4952w.m34804g() > 0) {
            view = m35320X();
        }
        if (view != null) {
            int i = this.f4884A0.f4991o;
            if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    /* renamed from: X */
    private View m35320X() {
        AbstractC1620e0 m35318Y;
        int i = this.f4884A0.f4989m;
        if (i == -1) {
            i = 0;
        }
        int m35217b = this.f4884A0.m35217b();
        for (int i2 = i; i2 < m35217b; i2++) {
            AbstractC1620e0 m35318Y2 = m35318Y(i2);
            if (m35318Y2 == null) {
                break;
            } else if (m35318Y2.itemView.hasFocusable()) {
                return m35318Y2.itemView;
            }
        }
        int min = Math.min(m35217b, i);
        while (true) {
            min--;
            if (min < 0 || (m35318Y = m35318Y(min)) == null) {
                return null;
            }
            if (m35318Y.itemView.hasFocusable()) {
                return m35318Y.itemView;
            }
        }
    }

    /* renamed from: X0 */
    private void m35319X0() {
        boolean z;
        EdgeEffect edgeEffect = this.f4933e0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f4933e0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f4935f0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f4935f0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4936g0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f4936g0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4937h0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f4937h0.isFinished();
        }
        if (z) {
            C7759x.m17516g0(this);
        }
    }

    /* renamed from: f1 */
    private void m35298f1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4883A.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1640q) {
            C1640q c1640q = (C1640q) layoutParams;
            if (!c1640q.f5044e) {
                Rect rect = c1640q.f5043d;
                Rect rect2 = this.f4883A;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4883A);
            offsetRectIntoDescendantCoords(view, this.f4883A);
        }
        this.f4891E.mo34245A1(this, view, this.f4883A, !this.f4909N, view2 == null);
    }

    /* renamed from: g */
    private void m35297g(AbstractC1620e0 abstractC1620e0) {
        View view = abstractC1620e0.itemView;
        boolean z = view.getParent() == this;
        this.f4930d.m35053J(m35296g0(view));
        if (abstractC1620e0.isTmpDetached()) {
            this.f4952w.m34808c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f4952w.m34809b(view, true);
        } else {
            this.f4952w.m34800k(view);
        }
    }

    /* renamed from: g1 */
    private void m35295g1() {
        C1614b0 c1614b0 = this.f4884A0;
        c1614b0.f4990n = -1L;
        c1614b0.f4989m = -1;
        c1614b0.f4991o = -1;
    }

    private C7747l getScrollingChildHelper() {
        if (this.f4904K0 == null) {
            this.f4904K0 = new C7747l(this);
        }
        return this.f4904K0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public static AbstractC1620e0 m35293h0(View view) {
        if (view == null) {
            return null;
        }
        return ((C1640q) view.getLayoutParams()).f5042c;
    }

    /* renamed from: h1 */
    private void m35292h1() {
        VelocityTracker velocityTracker = this.f4941l0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m35241y1(0);
        m35319X0();
    }

    /* renamed from: i1 */
    private void m35289i1() {
        int absoluteAdapterPosition;
        View focusedChild = (this.f4953w0 && hasFocus() && this.f4889D != null) ? getFocusedChild() : null;
        AbstractC1620e0 m35328T = focusedChild != null ? m35328T(focusedChild) : null;
        if (m35328T == null) {
            m35295g1();
            return;
        }
        this.f4884A0.f4990n = this.f4889D.hasStableIds() ? m35328T.getItemId() : -1L;
        C1614b0 c1614b0 = this.f4884A0;
        if (this.f4925W) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = m35328T.isRemoved() ? m35328T.mOldPosition : m35328T.getAbsoluteAdapterPosition();
        }
        c1614b0.f4989m = absoluteAdapterPosition;
        this.f4884A0.f4991o = m35284k0(m35328T.itemView);
    }

    /* renamed from: j0 */
    static void m35287j0(View view, Rect rect) {
        C1640q c1640q = (C1640q) view.getLayoutParams();
        Rect rect2 = c1640q.f5043d;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1640q).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1640q).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1640q).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1640q).bottomMargin);
    }

    /* renamed from: k0 */
    private int m35284k0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: l0 */
    private String m35281l0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: n */
    private void m35276n(AbstractC1620e0 abstractC1620e0, AbstractC1620e0 abstractC1620e02, AbstractC1629m.C1632c c1632c, AbstractC1629m.C1632c c1632c2, boolean z, boolean z2) {
        abstractC1620e0.setIsRecyclable(false);
        if (z) {
            m35297g(abstractC1620e0);
        }
        if (abstractC1620e0 != abstractC1620e02) {
            if (z2) {
                m35297g(abstractC1620e02);
            }
            abstractC1620e0.mShadowedHolder = abstractC1620e02;
            m35297g(abstractC1620e0);
            this.f4930d.m35053J(abstractC1620e0);
            abstractC1620e02.setIsRecyclable(false);
            abstractC1620e02.mShadowingHolder = abstractC1620e0;
        }
        if (this.f4938i0.mo34568b(abstractC1620e0, abstractC1620e02, c1632c, c1632c2)) {
            m35333Q0();
        }
    }

    /* renamed from: n1 */
    private void m35274n1(AbstractC1623h abstractC1623h, boolean z, boolean z2) {
        AbstractC1623h abstractC1623h2 = this.f4889D;
        if (abstractC1623h2 != null) {
            abstractC1623h2.unregisterAdapterDataObserver(this.f4928c);
            this.f4889D.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            m35317Y0();
        }
        this.f4934f.m34876y();
        AbstractC1623h abstractC1623h3 = this.f4889D;
        this.f4889D = abstractC1623h;
        if (abstractC1623h != null) {
            abstractC1623h.registerAdapterDataObserver(this.f4928c);
            abstractC1623h.onAttachedToRecyclerView(this);
        }
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            abstractC1635p.mo32357L0(abstractC1623h3, this.f4889D);
        }
        this.f4930d.m35026x(abstractC1623h3, this.f4889D, z);
        this.f4884A0.f4983g = true;
    }

    /* renamed from: o0 */
    private void m35272o0(long j, AbstractC1620e0 abstractC1620e0, AbstractC1620e0 abstractC1620e02) {
        int m34804g = this.f4952w.m34804g();
        for (int i = 0; i < m34804g; i++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34805f(i));
            if (m35293h0 != abstractC1620e0 && m35305d0(m35293h0) == j) {
                AbstractC1623h abstractC1623h = this.f4889D;
                if (abstractC1623h != null && abstractC1623h.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m35293h0 + " \n View Holder 2:" + abstractC1620e0 + m35334Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m35293h0 + " \n View Holder 2:" + abstractC1620e0 + m35334Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1620e02 + " cannot be found but it is necessary for " + abstractC1620e0 + m35334Q());
    }

    /* renamed from: q0 */
    private boolean m35266q0() {
        int m34804g = this.f4952w.m34804g();
        for (int i = 0; i < m34804g; i++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34805f(i));
            if (m35293h0 != null && !m35293h0.shouldIgnore() && m35293h0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private void m35264r() {
        m35292h1();
        setScrollState(0);
    }

    /* renamed from: s */
    static void m35261s(AbstractC1620e0 abstractC1620e0) {
        WeakReference<RecyclerView> weakReference = abstractC1620e0.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC1620e0.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC1620e0.mNestedRecyclerView = null;
        }
    }

    /* renamed from: s0 */
    private void m35260s0() {
        if (C7759x.m17565B(this) == 0) {
            C7759x.m17566A0(this, 8);
        }
    }

    /* renamed from: t0 */
    private void m35257t0() {
        this.f4952w = new C1694f(new C1619e());
    }

    /* renamed from: w */
    private void m35249w(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m35281l0 = m35281l0(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(m35281l0, false, classLoader).asSubclass(AbstractC1635p.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(f4881b1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m35281l0, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC1635p) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m35281l0, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m35281l0, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m35281l0, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m35281l0, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m35281l0, e7);
            }
        }
    }

    /* renamed from: y */
    private boolean m35243y(int i, int i2) {
        m35324V(this.f4902J0);
        int[] iArr = this.f4902J0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: y0 */
    private boolean m35242y0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || m35330S(view2) == null) {
            return false;
        }
        if (view == null || m35330S(view) == null) {
            return true;
        }
        this.f4883A.set(0, 0, view.getWidth(), view.getHeight());
        this.f4885B.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4883A);
        offsetDescendantRectToMyCoords(view2, this.f4885B);
        char c = 65535;
        int i3 = this.f4891E.m35118j0() == 1 ? -1 : 1;
        Rect rect = this.f4883A;
        int i4 = rect.left;
        int i5 = this.f4885B.left;
        if ((i4 < i5 || rect.right <= i5) && this.f4883A.right < this.f4885B.right) {
            i2 = 1;
        } else {
            Rect rect2 = this.f4883A;
            int i6 = rect2.right;
            int i7 = this.f4885B.right;
            i2 = ((i6 > i7 || rect2.left >= i7) && this.f4883A.left > this.f4885B.left) ? -1 : 0;
        }
        Rect rect3 = this.f4883A;
        int i8 = rect3.top;
        int i9 = this.f4885B.top;
        if ((i8 < i9 || rect3.bottom <= i9) && this.f4883A.bottom < this.f4885B.bottom) {
            c = 1;
        } else {
            Rect rect4 = this.f4883A;
            int i10 = rect4.bottom;
            int i11 = this.f4885B.bottom;
            if ((i10 <= i11 && rect4.top < i11) || this.f4883A.top <= this.f4885B.top) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        } else if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        } else if (i == 17) {
            return i2 < 0;
        } else if (i == 33) {
            return c < 0;
        } else if (i == 66) {
            return i2 > 0;
        } else if (i == 130) {
            return c > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i + m35334Q());
        }
    }

    /* renamed from: A */
    void m35368A(View view) {
        AbstractC1620e0 m35293h0 = m35293h0(view);
        m35347J0(view);
        AbstractC1623h abstractC1623h = this.f4889D;
        if (abstractC1623h != null && m35293h0 != null) {
            abstractC1623h.onViewDetachedFromWindow(m35293h0);
        }
        List<InterfaceC1641r> list = this.f4924V;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4924V.get(size).mo34252a(view);
            }
        }
    }

    /* renamed from: A0 */
    void m35367A0() {
        int m34801j = this.f4952w.m34801j();
        for (int i = 0; i < m34801j; i++) {
            ((C1640q) this.f4952w.m34802i(i).getLayoutParams()).f5044e = true;
        }
        this.f4930d.m35031s();
    }

    /* renamed from: B0 */
    void m35364B0() {
        int m34801j = this.f4952w.m34801j();
        for (int i = 0; i < m34801j; i++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34802i(i));
            if (m35293h0 != null && !m35293h0.shouldIgnore()) {
                m35293h0.addFlags(6);
            }
        }
        m35367A0();
        this.f4930d.m35030t();
    }

    /* renamed from: B1 */
    void m35363B1(int i, int i2, Object obj) {
        int i3;
        int m34801j = this.f4952w.m34801j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < m34801j; i5++) {
            View m34802i = this.f4952w.m34802i(i5);
            AbstractC1620e0 m35293h0 = m35293h0(m34802i);
            if (m35293h0 != null && !m35293h0.shouldIgnore() && (i3 = m35293h0.mPosition) >= i && i3 < i4) {
                m35293h0.addFlags(2);
                m35293h0.addChangePayload(obj);
                ((C1640q) m34802i.getLayoutParams()).f5044e = true;
            }
        }
        this.f4930d.m35050M(i, i2);
    }

    /* renamed from: C */
    void m35362C() {
        if (this.f4889D == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f4891E == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f4884A0.f4986j = false;
            boolean z = this.f4916Q0 && !(this.f4918R0 == getWidth() && this.f4920S0 == getHeight());
            this.f4918R0 = 0;
            this.f4920S0 = 0;
            this.f4916Q0 = false;
            if (this.f4884A0.f4981e == 1) {
                m35360D();
                this.f4891E.m35161I1(this);
                m35358E();
            } else if (!this.f4934f.m34884q() && !z && this.f4891E.m35092u0() == getWidth() && this.f4891E.m35124g0() == getHeight()) {
                this.f4891E.m35161I1(this);
            } else {
                this.f4891E.m35161I1(this);
                m35358E();
            }
            m35356F();
        }
    }

    /* renamed from: D0 */
    public void m35359D0(int i) {
        int m34804g = this.f4952w.m34804g();
        for (int i2 = 0; i2 < m34804g; i2++) {
            this.f4952w.m34805f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: E0 */
    public void m35357E0(int i) {
        int m34804g = this.f4952w.m34804g();
        for (int i2 = 0; i2 < m34804g; i2++) {
            this.f4952w.m34805f(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: F0 */
    void m35355F0(int i, int i2) {
        int m34801j = this.f4952w.m34801j();
        for (int i3 = 0; i3 < m34801j; i3++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34802i(i3));
            if (m35293h0 != null && !m35293h0.shouldIgnore() && m35293h0.mPosition >= i) {
                m35293h0.offsetPosition(i2, false);
                this.f4884A0.f4983g = true;
            }
        }
        this.f4930d.m35029u(i, i2);
        requestLayout();
    }

    /* renamed from: G */
    public boolean m35354G(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m17594d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: G0 */
    void m35353G0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int m34801j = this.f4952w.m34801j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < m34801j; i7++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34802i(i7));
            if (m35293h0 != null && (i6 = m35293h0.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    m35293h0.offsetPosition(i2 - i, false);
                } else {
                    m35293h0.offsetPosition(i5, false);
                }
                this.f4884A0.f4983g = true;
            }
        }
        this.f4930d.m35028v(i, i2);
        requestLayout();
    }

    /* renamed from: H */
    public final void m35352H(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m17593e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: H0 */
    void m35351H0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m34801j = this.f4952w.m34801j();
        for (int i4 = 0; i4 < m34801j; i4++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34802i(i4));
            if (m35293h0 != null && !m35293h0.shouldIgnore()) {
                int i5 = m35293h0.mPosition;
                if (i5 >= i3) {
                    m35293h0.offsetPosition(-i2, z);
                    this.f4884A0.f4983g = true;
                } else if (i5 >= i) {
                    m35293h0.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f4884A0.f4983g = true;
                }
            }
        }
        this.f4930d.m35027w(i, i2, z);
        requestLayout();
    }

    /* renamed from: I */
    void m35350I(int i) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            abstractC1635p.mo34966l1(i);
        }
        m35337O0(i);
        AbstractC1644u abstractC1644u = this.f4886B0;
        if (abstractC1644u != null) {
            abstractC1644u.onScrollStateChanged(this, i);
        }
        List<AbstractC1644u> list = this.f4888C0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4888C0.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    /* renamed from: I0 */
    public void m35349I0(View view) {
    }

    /* renamed from: J */
    void m35348J(int i, int i2) {
        this.f4929c0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m35335P0(i, i2);
        AbstractC1644u abstractC1644u = this.f4886B0;
        if (abstractC1644u != null) {
            abstractC1644u.onScrolled(this, i, i2);
        }
        List<AbstractC1644u> list = this.f4888C0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4888C0.get(size).onScrolled(this, i, i2);
            }
        }
        this.f4929c0--;
    }

    /* renamed from: J0 */
    public void m35347J0(View view) {
    }

    /* renamed from: K */
    void m35346K() {
        int i;
        for (int size = this.f4912O0.size() - 1; size >= 0; size--) {
            AbstractC1620e0 abstractC1620e0 = this.f4912O0.get(size);
            if (abstractC1620e0.itemView.getParent() == this && !abstractC1620e0.shouldIgnore() && (i = abstractC1620e0.mPendingAccessibilityState) != -1) {
                C7759x.m17478z0(abstractC1620e0.itemView, i);
                abstractC1620e0.mPendingAccessibilityState = -1;
            }
        }
        this.f4912O0.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void m35345K0() {
        this.f4927b0++;
    }

    /* renamed from: L0 */
    void m35343L0() {
        m35341M0(true);
    }

    /* renamed from: M */
    void m35342M() {
        if (this.f4937h0 != null) {
            return;
        }
        EdgeEffect m35194a = this.f4931d0.m35194a(this, 3);
        this.f4937h0 = m35194a;
        if (this.f4956y) {
            m35194a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m35194a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void m35341M0(boolean z) {
        int i = this.f4927b0 - 1;
        this.f4927b0 = i;
        if (i < 1) {
            this.f4927b0 = 0;
            if (z) {
                m35365B();
                m35346K();
            }
        }
    }

    /* renamed from: N */
    void m35340N() {
        if (this.f4933e0 != null) {
            return;
        }
        EdgeEffect m35194a = this.f4931d0.m35194a(this, 0);
        this.f4933e0 = m35194a;
        if (this.f4956y) {
            m35194a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m35194a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: O */
    void m35338O() {
        if (this.f4936g0 != null) {
            return;
        }
        EdgeEffect m35194a = this.f4931d0.m35194a(this, 2);
        this.f4936g0 = m35194a;
        if (this.f4956y) {
            m35194a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m35194a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: O0 */
    public void m35337O0(int i) {
    }

    /* renamed from: P */
    void m35336P() {
        if (this.f4935f0 != null) {
            return;
        }
        EdgeEffect m35194a = this.f4931d0.m35194a(this, 1);
        this.f4935f0 = m35194a;
        if (this.f4956y) {
            m35194a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m35194a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: P0 */
    public void m35335P0(int i, int i2) {
    }

    /* renamed from: Q */
    String m35334Q() {
        return " " + super.toString() + ", adapter:" + this.f4889D + ", layout:" + this.f4891E + ", context:" + getContext();
    }

    /* renamed from: Q0 */
    void m35333Q0() {
        if (this.f4896G0 || !this.f4903K) {
            return;
        }
        C7759x.m17514h0(this, this.f4914P0);
        this.f4896G0 = true;
    }

    /* renamed from: R */
    final void m35332R(C1614b0 c1614b0) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4955x0.f4997e;
            c1614b0.f4992p = overScroller.getFinalX() - overScroller.getCurrX();
            c1614b0.f4993q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        c1614b0.f4992p = 0;
        c1614b0.f4993q = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m35330S(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m35330S(android.view.View):android.view.View");
    }

    /* renamed from: T */
    public AbstractC1620e0 m35328T(View view) {
        View m35330S = m35330S(view);
        if (m35330S == null) {
            return null;
        }
        return m35296g0(m35330S);
    }

    /* renamed from: T0 */
    void m35327T0(boolean z) {
        this.f4926a0 = z | this.f4926a0;
        this.f4925W = true;
        m35364B0();
    }

    /* renamed from: V0 */
    void m35323V0(AbstractC1620e0 abstractC1620e0, AbstractC1629m.C1632c c1632c) {
        abstractC1620e0.setFlags(0, 8192);
        if (this.f4884A0.f4985i && abstractC1620e0.isUpdated() && !abstractC1620e0.isRemoved() && !abstractC1620e0.shouldIgnore()) {
            this.f4954x.m34844c(m35305d0(abstractC1620e0), abstractC1620e0);
        }
        this.f4954x.m34842e(abstractC1620e0, c1632c);
    }

    /* renamed from: Y */
    public AbstractC1620e0 m35318Y(int i) {
        AbstractC1620e0 abstractC1620e0 = null;
        if (this.f4925W) {
            return null;
        }
        int m34801j = this.f4952w.m34801j();
        for (int i2 = 0; i2 < m34801j; i2++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34802i(i2));
            if (m35293h0 != null && !m35293h0.isRemoved() && m35308c0(m35293h0) == i) {
                if (!this.f4952w.m34797n(m35293h0.itemView)) {
                    return m35293h0;
                }
                abstractC1620e0 = m35293h0;
            }
        }
        return abstractC1620e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void m35317Y0() {
        AbstractC1629m abstractC1629m = this.f4938i0;
        if (abstractC1629m != null) {
            abstractC1629m.mo34733k();
        }
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            abstractC1635p.m35096s1(this.f4930d);
            this.f4891E.m35093t1(this.f4930d);
        }
        this.f4930d.m35047c();
    }

    /* renamed from: Z */
    public AbstractC1620e0 m35316Z(long j) {
        AbstractC1623h abstractC1623h = this.f4889D;
        AbstractC1620e0 abstractC1620e0 = null;
        if (abstractC1623h != null && abstractC1623h.hasStableIds()) {
            int m34801j = this.f4952w.m34801j();
            for (int i = 0; i < m34801j; i++) {
                AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34802i(i));
                if (m35293h0 != null && !m35293h0.isRemoved() && m35293h0.getItemId() == j) {
                    if (!this.f4952w.m34797n(m35293h0.itemView)) {
                        return m35293h0;
                    }
                    abstractC1620e0 = m35293h0;
                }
            }
        }
        return abstractC1620e0;
    }

    /* renamed from: Z0 */
    boolean m35315Z0(View view) {
        m35250v1();
        boolean m34793r = this.f4952w.m34793r(view);
        if (m34793r) {
            AbstractC1620e0 m35293h0 = m35293h0(view);
            this.f4930d.m35053J(m35293h0);
            this.f4930d.m35060C(m35293h0);
        }
        m35244x1(!m34793r);
        return m34793r;
    }

    /* renamed from: a */
    void m35314a(int i, int i2) {
        if (i < 0) {
            m35340N();
            if (this.f4933e0.isFinished()) {
                this.f4933e0.onAbsorb(-i);
            }
        } else if (i > 0) {
            m35338O();
            if (this.f4936g0.isFinished()) {
                this.f4936g0.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            m35336P();
            if (this.f4935f0.isFinished()) {
                this.f4935f0.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            m35342M();
            if (this.f4937h0.isFinished()) {
                this.f4937h0.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        C7759x.m17516g0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC1620e0 m35313a0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.f r0 = r5.f4952w
            int r0 = r0.m34801j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.f r3 = r5.f4952w
            android.view.View r3 = r3.m34802i(r2)
            androidx.recyclerview.widget.RecyclerView$e0 r3 = m35293h0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.f r1 = r5.f4952w
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m34797n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m35313a0(int, boolean):androidx.recyclerview.widget.RecyclerView$e0");
    }

    /* renamed from: a1 */
    public void m35312a1(AbstractC1634o abstractC1634o) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            abstractC1635p.mo34960q("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4897H.remove(abstractC1634o);
        if (this.f4897H.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m35367A0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null || !abstractC1635p.m35154M0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public boolean m35311b0(int i, int i2) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f4915Q) {
            return false;
        } else {
            boolean mo32305u = abstractC1635p.mo32305u();
            boolean mo32303v = this.f4891E.mo32303v();
            i = (!mo32305u || Math.abs(i) < this.f4948s0) ? 0 : 0;
            i2 = (!mo32303v || Math.abs(i2) < this.f4948s0) ? 0 : 0;
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = i;
            float f2 = i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = mo32305u || mo32303v;
                dispatchNestedFling(f, f2, z);
                AbstractC1642s abstractC1642s = this.f4947r0;
                if (abstractC1642s != null && abstractC1642s.mo34560a(i, i2)) {
                    return true;
                }
                if (z) {
                    int i3 = mo32305u ? 1 : 0;
                    if (mo32303v) {
                        i3 |= 2;
                    }
                    m35247w1(i3, 1);
                    int i4 = this.f4949t0;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f4949t0;
                    this.f4955x0.m35209b(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b1 */
    public void m35310b1(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            m35312a1(m35275n0(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: c0 */
    int m35308c0(AbstractC1620e0 abstractC1620e0) {
        if (abstractC1620e0.hasAnyOfTheFlags(524) || !abstractC1620e0.isBound()) {
            return -1;
        }
        return this.f4934f.m34896e(abstractC1620e0.mPosition);
    }

    /* renamed from: c1 */
    public void m35307c1(InterfaceC1643t interfaceC1643t) {
        this.f4899I.remove(interfaceC1643t);
        if (this.f4901J == interfaceC1643t) {
            this.f4901J = null;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1640q) && this.f4891E.mo32301w((C1640q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null && abstractC1635p.mo32305u()) {
            return this.f4891E.mo32378A(this.f4884A0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null && abstractC1635p.mo32305u()) {
            return this.f4891E.mo32376B(this.f4884A0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null && abstractC1635p.mo32305u()) {
            return this.f4891E.mo32374C(this.f4884A0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null && abstractC1635p.mo32303v()) {
            return this.f4891E.mo32372D(this.f4884A0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null && abstractC1635p.mo32303v()) {
            return this.f4891E.mo32369E(this.f4884A0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null && abstractC1635p.mo32303v()) {
            return this.f4891E.mo32366F(this.f4884A0);
        }
        return 0;
    }

    /* renamed from: d0 */
    long m35305d0(AbstractC1620e0 abstractC1620e0) {
        return this.f4889D.hasStableIds() ? abstractC1620e0.getItemId() : abstractC1620e0.mPosition;
    }

    /* renamed from: d1 */
    public void m35304d1(AbstractC1644u abstractC1644u) {
        List<AbstractC1644u> list = this.f4888C0;
        if (list != null) {
            list.remove(abstractC1644u);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m17597a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m17596b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m17595c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m17592f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f4897H.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f4897H.get(i).onDrawOver(canvas, this, this.f4884A0);
        }
        EdgeEffect edgeEffect = this.f4933e0;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4956y ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4933e0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4935f0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4956y) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4935f0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4936g0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4956y ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4936g0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4937h0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4956y) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4937h0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f4938i0 == null || this.f4897H.size() <= 0 || !this.f4938i0.mo34732p()) {
            z3 = z;
        }
        if (z3) {
            C7759x.m17516g0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public int m35302e0(View view) {
        AbstractC1620e0 m35293h0 = m35293h0(view);
        if (m35293h0 != null) {
            return m35293h0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* renamed from: e1 */
    void m35301e1() {
        AbstractC1620e0 abstractC1620e0;
        int m34804g = this.f4952w.m34804g();
        for (int i = 0; i < m34804g; i++) {
            View m34805f = this.f4952w.m34805f(i);
            AbstractC1620e0 m35296g0 = m35296g0(m34805f);
            if (m35296g0 != null && (abstractC1620e0 = m35296g0.mShadowingHolder) != null) {
                View view = abstractC1620e0.itemView;
                int left = m34805f.getLeft();
                int top = m34805f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: f0 */
    public int m35299f0(View view) {
        AbstractC1620e0 m35293h0 = m35293h0(view);
        if (m35293h0 != null) {
            return m35293h0.getLayoutPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View m35133X0 = this.f4891E.m35133X0(view, i);
        if (m35133X0 != null) {
            return m35133X0;
        }
        boolean z2 = (this.f4889D == null || this.f4891E == null || m35245x0() || this.f4915Q) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.f4891E.mo32303v()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (f4879Z0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f4891E.mo32305u()) {
                int i3 = (this.f4891E.m35118j0() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (f4879Z0) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                m35252v();
                if (m35330S(view) == null) {
                    return null;
                }
                m35250v1();
                this.f4891E.mo34997Q0(view, i, this.f4930d, this.f4884A0);
                m35244x1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                m35252v();
                if (m35330S(view) == null) {
                    return null;
                }
                m35250v1();
                view2 = this.f4891E.mo34997Q0(view, i, this.f4930d, this.f4884A0);
                m35244x1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return m35242y0(view, view2, i) ? view2 : super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m35298f1(view2, null);
            return view;
        }
    }

    /* renamed from: g0 */
    public AbstractC1620e0 m35296g0(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m35293h0(view);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            return abstractC1635p.mo32354N();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m35334Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            return abstractC1635p.mo32351O(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m35334Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1623h getAdapter() {
        return this.f4889D;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            return abstractC1635p.m35148Q();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        InterfaceC1627k interfaceC1627k = this.f4900I0;
        if (interfaceC1627k == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return interfaceC1627k.m35195a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4956y;
    }

    public C1749w getCompatAccessibilityDelegate() {
        return this.f4898H0;
    }

    public C1628l getEdgeEffectFactory() {
        return this.f4931d0;
    }

    public AbstractC1629m getItemAnimator() {
        return this.f4938i0;
    }

    public int getItemDecorationCount() {
        return this.f4897H.size();
    }

    public AbstractC1635p getLayoutManager() {
        return this.f4891E;
    }

    public int getMaxFlingVelocity() {
        return this.f4949t0;
    }

    public int getMinFlingVelocity() {
        return this.f4948s0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f4878Y0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1642s getOnFlingListener() {
        return this.f4947r0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4953w0;
    }

    public C1645v getRecycledViewPool() {
        return this.f4930d.m35041i();
    }

    public int getScrollState() {
        return this.f4939j0;
    }

    /* renamed from: h */
    public void m35294h(AbstractC1634o abstractC1634o) {
        m35291i(abstractC1634o, -1);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m17587k();
    }

    /* renamed from: i */
    public void m35291i(AbstractC1634o abstractC1634o, int i) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            abstractC1635p.mo34960q("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4897H.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f4897H.add(abstractC1634o);
        } else {
            this.f4897H.add(i, abstractC1634o);
        }
        m35367A0();
        requestLayout();
    }

    /* renamed from: i0 */
    public void m35290i0(View view, Rect rect) {
        m35287j0(view, rect);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f4903K;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4915Q;
    }

    @Override // android.view.View, p201g.p227h.p238l.InterfaceC7746k
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m17585m();
    }

    /* renamed from: j */
    public void m35288j(InterfaceC1641r interfaceC1641r) {
        if (this.f4924V == null) {
            this.f4924V = new ArrayList();
        }
        this.f4924V.add(interfaceC1641r);
    }

    /* renamed from: j1 */
    void m35286j1() {
        int m34801j = this.f4952w.m34801j();
        for (int i = 0; i < m34801j; i++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34802i(i));
            if (!m35293h0.shouldIgnore()) {
                m35293h0.saveOldPosition();
            }
        }
    }

    /* renamed from: k */
    public void m35285k(InterfaceC1643t interfaceC1643t) {
        this.f4899I.add(interfaceC1643t);
    }

    /* renamed from: k1 */
    boolean m35283k1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        m35252v();
        if (this.f4889D != null) {
            int[] iArr = this.f4910N0;
            iArr[0] = 0;
            iArr[1] = 0;
            m35280l1(i, i2, iArr);
            int[] iArr2 = this.f4910N0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f4897H.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4910N0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m35352H(i5, i4, i6, i7, this.f4906L0, i3, iArr3);
        int[] iArr4 = this.f4910N0;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.f4944o0;
        int[] iArr5 = this.f4906L0;
        this.f4944o0 = i12 - iArr5[0];
        this.f4945p0 -= iArr5[1];
        int[] iArr6 = this.f4908M0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C7745j.m17598a(motionEvent, 8194)) {
                m35325U0(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            m35255u(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            m35348J(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: l */
    public void m35282l(AbstractC1644u abstractC1644u) {
        if (this.f4888C0 == null) {
            this.f4888C0 = new ArrayList();
        }
        this.f4888C0.add(abstractC1644u);
    }

    /* renamed from: l1 */
    void m35280l1(int i, int i2, int[] iArr) {
        m35250v1();
        m35345K0();
        C1382j.m36160a("RV Scroll");
        m35332R(this.f4884A0);
        int mo32368E1 = i != 0 ? this.f4891E.mo32368E1(i, this.f4930d, this.f4884A0) : 0;
        int mo32363G1 = i2 != 0 ? this.f4891E.mo32363G1(i2, this.f4930d, this.f4884A0) : 0;
        C1382j.m36159b();
        m35301e1();
        m35343L0();
        m35244x1(false);
        if (iArr != null) {
            iArr[0] = mo32368E1;
            iArr[1] = mo32363G1;
        }
    }

    /* renamed from: m */
    void m35279m(AbstractC1620e0 abstractC1620e0, AbstractC1629m.C1632c c1632c, AbstractC1629m.C1632c c1632c2) {
        abstractC1620e0.setIsRecyclable(false);
        if (this.f4938i0.mo34569a(abstractC1620e0, c1632c, c1632c2)) {
            m35333Q0();
        }
    }

    /* renamed from: m0 */
    Rect m35278m0(View view) {
        C1640q c1640q = (C1640q) view.getLayoutParams();
        if (!c1640q.f5044e) {
            return c1640q.f5043d;
        }
        if (this.f4884A0.m35214e() && (c1640q.m35078b() || c1640q.m35076d())) {
            return c1640q.f5043d;
        }
        Rect rect = c1640q.f5043d;
        rect.set(0, 0, 0, 0);
        int size = this.f4897H.size();
        for (int i = 0; i < size; i++) {
            this.f4883A.set(0, 0, 0, 0);
            this.f4897H.get(i).getItemOffsets(this.f4883A, view, this, this.f4884A0);
            int i2 = rect.left;
            Rect rect2 = this.f4883A;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1640q.f5044e = false;
        return rect;
    }

    /* renamed from: m1 */
    public void m35277m1(int i) {
        if (this.f4915Q) {
            return;
        }
        m35238z1();
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        abstractC1635p.mo32365F1(i);
        awakenScrollBars();
    }

    /* renamed from: n0 */
    public AbstractC1634o m35275n0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.f4897H.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: o */
    void m35273o(AbstractC1620e0 abstractC1620e0, AbstractC1629m.C1632c c1632c, AbstractC1629m.C1632c c1632c2) {
        m35297g(abstractC1620e0);
        abstractC1620e0.setIsRecyclable(false);
        if (this.f4938i0.mo34567c(abstractC1620e0, c1632c, c1632c2)) {
            m35333Q0();
        }
    }

    /* renamed from: o1 */
    boolean m35271o1(AbstractC1620e0 abstractC1620e0, int i) {
        if (m35245x0()) {
            abstractC1620e0.mPendingAccessibilityState = i;
            this.f4912O0.add(abstractC1620e0);
            return false;
        }
        C7759x.m17478z0(abstractC1620e0.itemView, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4927b0 = 0;
        boolean z = true;
        this.f4903K = true;
        this.f4909N = (!this.f4909N || isLayoutRequested()) ? false : false;
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            abstractC1635p.m35160J(this);
        }
        this.f4896G0 = false;
        if (f4878Y0) {
            RunnableC1729m runnableC1729m = RunnableC1729m.f5329w.get();
            this.f4957y0 = runnableC1729m;
            if (runnableC1729m == null) {
                this.f4957y0 = new RunnableC1729m();
                Display m17487v = C7759x.m17487v(this);
                float f = 60.0f;
                if (!isInEditMode() && m17487v != null) {
                    float refreshRate = m17487v.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC1729m runnableC1729m2 = this.f4957y0;
                runnableC1729m2.f5333e = 1.0E9f / f;
                RunnableC1729m.f5329w.set(runnableC1729m2);
            }
            this.f4957y0.m34678a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC1729m runnableC1729m;
        super.onDetachedFromWindow();
        AbstractC1629m abstractC1629m = this.f4938i0;
        if (abstractC1629m != null) {
            abstractC1629m.mo34733k();
        }
        m35238z1();
        this.f4903K = false;
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            abstractC1635p.m35158K(this, this.f4930d);
        }
        this.f4912O0.clear();
        removeCallbacks(this.f4914P0);
        this.f4954x.m34837j();
        if (!f4878Y0 || (runnableC1729m = this.f4957y0) == null) {
            return;
        }
        runnableC1729m.m34669j(this);
        this.f4957y0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4897H.size();
        for (int i = 0; i < size; i++) {
            this.f4897H.get(i).onDraw(canvas, this, this.f4884A0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f4891E
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4915Q
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f4891E
            boolean r0 = r0.mo32303v()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f4891E
            boolean r3 = r3.mo32305u()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f4891E
            boolean r3 = r3.mo32303v()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f4891E
            boolean r3 = r3.mo32305u()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6a:
            float r2 = r5.f4950u0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4951v0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.m35361C0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f4915Q) {
            return false;
        }
        this.f4901J = null;
        if (m35326U(motionEvent)) {
            m35264r();
            return true;
        }
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null) {
            return false;
        }
        boolean mo32305u = abstractC1635p.mo32305u();
        boolean mo32303v = this.f4891E.mo32303v();
        if (this.f4941l0 == null) {
            this.f4941l0 = VelocityTracker.obtain();
        }
        this.f4941l0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4917R) {
                this.f4917R = false;
            }
            this.f4940k0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f4944o0 = x;
            this.f4942m0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f4945p0 = y;
            this.f4943n0 = y;
            if (this.f4939j0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m35241y1(1);
            }
            int[] iArr = this.f4908M0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = mo32305u ? 1 : 0;
            if (mo32303v) {
                i |= 2;
            }
            m35247w1(i, 0);
        } else if (actionMasked == 1) {
            this.f4941l0.clear();
            m35241y1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4940k0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4940k0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4939j0 != 1) {
                int i2 = x2 - this.f4942m0;
                int i3 = y2 - this.f4943n0;
                if (!mo32305u || Math.abs(i2) <= this.f4946q0) {
                    z = false;
                } else {
                    this.f4944o0 = x2;
                    z = true;
                }
                if (mo32303v && Math.abs(i3) > this.f4946q0) {
                    this.f4945p0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m35264r();
        } else if (actionMasked == 5) {
            this.f4940k0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4944o0 = x3;
            this.f4942m0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4945p0 = y3;
            this.f4943n0 = y3;
        } else if (actionMasked == 6) {
            m35339N0(motionEvent);
        }
        return this.f4939j0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1382j.m36160a("RV OnLayout");
        m35362C();
        C1382j.m36159b();
        this.f4909N = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null) {
            m35246x(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC1635p.mo34950y0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4891E.m35123g1(this.f4930d, this.f4884A0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f4916Q0 = z;
            if (z || this.f4889D == null) {
                return;
            }
            if (this.f4884A0.f4981e == 1) {
                m35360D();
            }
            this.f4891E.m35159J1(i, i2);
            this.f4884A0.f4986j = true;
            m35358E();
            this.f4891E.m35153M1(i, i2);
            if (this.f4891E.mo35149P1()) {
                this.f4891E.m35159J1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f4884A0.f4986j = true;
                m35358E();
                this.f4891E.m35153M1(i, i2);
            }
            this.f4918R0 = getMeasuredWidth();
            this.f4920S0 = getMeasuredHeight();
        } else if (this.f4905L) {
            this.f4891E.m35123g1(this.f4930d, this.f4884A0, i, i2);
        } else {
            if (this.f4921T) {
                m35250v1();
                m35345K0();
                m35329S0();
                m35343L0();
                C1614b0 c1614b0 = this.f4884A0;
                if (c1614b0.f4988l) {
                    c1614b0.f4984h = true;
                } else {
                    this.f4934f.m34891j();
                    this.f4884A0.f4984h = false;
                }
                this.f4921T = false;
                m35244x1(false);
            } else if (this.f4884A0.f4988l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC1623h abstractC1623h = this.f4889D;
            if (abstractC1623h != null) {
                this.f4884A0.f4982f = abstractC1623h.getItemCount();
            } else {
                this.f4884A0.f4982f = 0;
            }
            m35250v1();
            this.f4891E.m35123g1(this.f4930d, this.f4884A0, i, i2);
            m35244x1(false);
            this.f4884A0.f4984h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m35245x0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1650z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1650z c1650z = (C1650z) parcelable;
        this.f4932e = c1650z;
        super.onRestoreInstanceState(c1650z.m17424a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1650z c1650z = new C1650z(super.onSaveInstanceState());
        C1650z c1650z2 = this.f4932e;
        if (c1650z2 != null) {
            c1650z.m35021b(c1650z2);
        } else {
            AbstractC1635p abstractC1635p = this.f4891E;
            if (abstractC1635p != null) {
                c1650z.f5062e = abstractC1635p.mo32316k1();
            } else {
                c1650z.f5062e = null;
            }
        }
        return c1650z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m35251v0();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    void m35270p(String str) {
        if (m35245x0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m35334Q());
            }
            throw new IllegalStateException(str);
        } else if (this.f4929c0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m35334Q()));
        }
    }

    /* renamed from: p0 */
    public boolean m35269p0() {
        return !this.f4909N || this.f4925W || this.f4934f.m34885p();
    }

    /* renamed from: p1 */
    boolean m35268p1(AccessibilityEvent accessibilityEvent) {
        if (m35245x0()) {
            int m17727a = accessibilityEvent != null ? C7715b.m17727a(accessibilityEvent) : 0;
            this.f4919S |= m17727a != 0 ? m17727a : 0;
            return true;
        }
        return false;
    }

    /* renamed from: q */
    boolean m35267q(AbstractC1620e0 abstractC1620e0) {
        AbstractC1629m abstractC1629m = this.f4938i0;
        return abstractC1629m == null || abstractC1629m.mo34735g(abstractC1620e0, abstractC1620e0.getUnmodifiedPayloads());
    }

    /* renamed from: q1 */
    public void m35265q1(int i, int i2) {
        m35262r1(i, i2, null);
    }

    /* renamed from: r0 */
    void m35263r0() {
        this.f4934f = new C1661a(new C1621f());
    }

    /* renamed from: r1 */
    public void m35262r1(int i, int i2, Interpolator interpolator) {
        m35259s1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        AbstractC1620e0 m35293h0 = m35293h0(view);
        if (m35293h0 != null) {
            if (m35293h0.isTmpDetached()) {
                m35293h0.clearTmpDetachFlag();
            } else if (!m35293h0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m35293h0 + m35334Q());
            }
        }
        view.clearAnimation();
        m35368A(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4891E.m35119i1(this, this.f4884A0, view, view2) && view2 != null) {
            m35298f1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4891E.m35080z1(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4899I.size();
        for (int i = 0; i < size; i++) {
            this.f4899I.get(i).mo34699c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4911O == 0 && !this.f4915Q) {
            super.requestLayout();
        } else {
            this.f4913P = true;
        }
    }

    /* renamed from: s1 */
    public void m35259s1(int i, int i2, Interpolator interpolator, int i3) {
        m35256t1(i, i2, interpolator, i3, false);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f4915Q) {
        } else {
            boolean mo32305u = abstractC1635p.mo32305u();
            boolean mo32303v = this.f4891E.mo32303v();
            if (mo32305u || mo32303v) {
                if (!mo32305u) {
                    i = 0;
                }
                if (!mo32303v) {
                    i2 = 0;
                }
                m35283k1(i, i2, null, 0);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m35268p1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1749w c1749w) {
        this.f4898H0 = c1749w;
        C7759x.m17498p0(this, c1749w);
    }

    public void setAdapter(AbstractC1623h abstractC1623h) {
        setLayoutFrozen(false);
        m35274n1(abstractC1623h, false, true);
        m35327T0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1627k interfaceC1627k) {
        if (interfaceC1627k == this.f4900I0) {
            return;
        }
        this.f4900I0 = interfaceC1627k;
        setChildrenDrawingOrderEnabled(interfaceC1627k != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f4956y) {
            m35251v0();
        }
        this.f4956y = z;
        super.setClipToPadding(z);
        if (this.f4909N) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1628l c1628l) {
        C7675h.m17866f(c1628l);
        this.f4931d0 = c1628l;
        m35251v0();
    }

    public void setHasFixedSize(boolean z) {
        this.f4905L = z;
    }

    public void setItemAnimator(AbstractC1629m abstractC1629m) {
        AbstractC1629m abstractC1629m2 = this.f4938i0;
        if (abstractC1629m2 != null) {
            abstractC1629m2.mo34733k();
            this.f4938i0.m35182v(null);
        }
        this.f4938i0 = abstractC1629m;
        if (abstractC1629m != null) {
            abstractC1629m.m35182v(this.f4894F0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f4930d.m35056G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC1635p abstractC1635p) {
        if (abstractC1635p == this.f4891E) {
            return;
        }
        m35238z1();
        if (this.f4891E != null) {
            AbstractC1629m abstractC1629m = this.f4938i0;
            if (abstractC1629m != null) {
                abstractC1629m.mo34733k();
            }
            this.f4891E.m35096s1(this.f4930d);
            this.f4891E.m35093t1(this.f4930d);
            this.f4930d.m35047c();
            if (this.f4903K) {
                this.f4891E.m35158K(this, this.f4930d);
            }
            this.f4891E.m35152N1(null);
            this.f4891E = null;
        } else {
            this.f4930d.m35047c();
        }
        this.f4952w.m34796o();
        this.f4891E = abstractC1635p;
        if (abstractC1635p != null) {
            if (abstractC1635p.f5029d == null) {
                abstractC1635p.m35152N1(this);
                if (this.f4903K) {
                    this.f4891E.m35160J(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + abstractC1635p + " is already attached to a RecyclerView:" + abstractC1635p.f5029d.m35334Q());
            }
        }
        this.f4930d.m35052K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, p201g.p227h.p238l.InterfaceC7746k
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m17584n(z);
    }

    public void setOnFlingListener(AbstractC1642s abstractC1642s) {
        this.f4947r0 = abstractC1642s;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1644u abstractC1644u) {
        this.f4886B0 = abstractC1644u;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4953w0 = z;
    }

    public void setRecycledViewPool(C1645v c1645v) {
        this.f4930d.m35058E(c1645v);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC1648x interfaceC1648x) {
        this.f4893F = interfaceC1648x;
    }

    void setScrollState(int i) {
        if (i == this.f4939j0) {
            return;
        }
        this.f4939j0 = i;
        if (i != 2) {
            m35366A1();
        }
        m35350I(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.f4946q0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f4946q0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1616c0 abstractC1616c0) {
        this.f4930d.m35057F(abstractC1616c0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m17582p(i);
    }

    @Override // android.view.View, p201g.p227h.p238l.InterfaceC7746k
    public void stopNestedScroll() {
        getScrollingChildHelper().m17580r();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f4915Q) {
            m35270p("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f4915Q = false;
                if (this.f4913P && this.f4891E != null && this.f4889D != null) {
                    requestLayout();
                }
                this.f4913P = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4915Q = true;
            this.f4917R = true;
            m35238z1();
        }
    }

    /* renamed from: t */
    void m35258t() {
        int m34801j = this.f4952w.m34801j();
        for (int i = 0; i < m34801j; i++) {
            AbstractC1620e0 m35293h0 = m35293h0(this.f4952w.m34802i(i));
            if (!m35293h0.shouldIgnore()) {
                m35293h0.clearOldPosition();
            }
        }
        this.f4930d.m35046d();
    }

    /* renamed from: t1 */
    void m35256t1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f4915Q) {
        } else {
            if (!abstractC1635p.mo32305u()) {
                i = 0;
            }
            if (!this.f4891E.mo32303v()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            if (i3 == Integer.MIN_VALUE || i3 > 0) {
                if (z) {
                    int i4 = i != 0 ? 1 : 0;
                    if (i2 != 0) {
                        i4 |= 2;
                    }
                    m35247w1(i4, 1);
                }
                this.f4955x0.m35206e(i, i2, i3, interpolator);
                return;
            }
            scrollBy(i, i2);
        }
    }

    /* renamed from: u */
    void m35255u(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f4933e0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f4933e0.onRelease();
            z = this.f4933e0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4936g0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f4936g0.onRelease();
            z |= this.f4936g0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4935f0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f4935f0.onRelease();
            z |= this.f4935f0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4937h0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f4937h0.onRelease();
            z |= this.f4937h0.isFinished();
        }
        if (z) {
            C7759x.m17516g0(this);
        }
    }

    /* renamed from: u0 */
    void m35254u0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C1724l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C8085b.fastscroll_default_thickness), resources.getDimensionPixelSize(C8085b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C8085b.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m35334Q());
    }

    /* renamed from: u1 */
    public void m35253u1(int i) {
        if (this.f4915Q) {
            return;
        }
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1635p.mo27028R1(this, this.f4884A0, i);
        }
    }

    /* renamed from: v */
    void m35252v() {
        if (this.f4909N && !this.f4925W) {
            if (this.f4934f.m34885p()) {
                if (this.f4934f.m34886o(4) && !this.f4934f.m34886o(11)) {
                    C1382j.m36160a("RV PartialInvalidate");
                    m35250v1();
                    m35345K0();
                    this.f4934f.m34878w();
                    if (!this.f4913P) {
                        if (m35266q0()) {
                            m35362C();
                        } else {
                            this.f4934f.m34892i();
                        }
                    }
                    m35244x1(true);
                    m35343L0();
                    C1382j.m36159b();
                    return;
                } else if (this.f4934f.m34885p()) {
                    C1382j.m36160a("RV FullInvalidate");
                    m35362C();
                    C1382j.m36159b();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        C1382j.m36160a("RV FullInvalidate");
        m35362C();
        C1382j.m36159b();
    }

    /* renamed from: v0 */
    void m35251v0() {
        this.f4937h0 = null;
        this.f4935f0 = null;
        this.f4936g0 = null;
        this.f4933e0 = null;
    }

    /* renamed from: v1 */
    void m35250v1() {
        int i = this.f4911O + 1;
        this.f4911O = i;
        if (i != 1 || this.f4915Q) {
            return;
        }
        this.f4913P = false;
    }

    /* renamed from: w0 */
    boolean m35248w0() {
        AccessibilityManager accessibilityManager = this.f4923U;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: w1 */
    public boolean m35247w1(int i, int i2) {
        return getScrollingChildHelper().m17581q(i, i2);
    }

    /* renamed from: x */
    void m35246x(int i, int i2) {
        setMeasuredDimension(AbstractC1635p.m35086x(i, getPaddingLeft() + getPaddingRight(), C7759x.m17559E(this)), AbstractC1635p.m35086x(i2, getPaddingTop() + getPaddingBottom(), C7759x.m17561D(this)));
    }

    /* renamed from: x0 */
    public boolean m35245x0() {
        return this.f4927b0 > 0;
    }

    /* renamed from: x1 */
    void m35244x1(boolean z) {
        if (this.f4911O < 1) {
            this.f4911O = 1;
        }
        if (!z && !this.f4915Q) {
            this.f4913P = false;
        }
        if (this.f4911O == 1) {
            if (z && this.f4913P && !this.f4915Q && this.f4891E != null && this.f4889D != null) {
                m35362C();
            }
            if (!this.f4915Q) {
                this.f4913P = false;
            }
        }
        this.f4911O--;
    }

    /* renamed from: y1 */
    public void m35241y1(int i) {
        getScrollingChildHelper().m17579s(i);
    }

    /* renamed from: z */
    void m35240z(View view) {
        AbstractC1620e0 m35293h0 = m35293h0(view);
        m35349I0(view);
        AbstractC1623h abstractC1623h = this.f4889D;
        if (abstractC1623h != null && m35293h0 != null) {
            abstractC1623h.onViewAttachedToWindow(m35293h0);
        }
        List<InterfaceC1641r> list = this.f4924V;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4924V.get(size).mo34251b(view);
            }
        }
    }

    /* renamed from: z0 */
    void m35239z0(int i) {
        if (this.f4891E == null) {
            return;
        }
        setScrollState(2);
        this.f4891E.mo32365F1(i);
        awakenScrollBars();
    }

    /* renamed from: z1 */
    public void m35238z1() {
        setScrollState(0);
        m35366A1();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8084a.recyclerViewStyle);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes2.dex */
    public static class C1650z extends AbstractC7781a {
        public static final Parcelable.Creator<C1650z> CREATOR = new C1651a();

        /* renamed from: e */
        Parcelable f5062e;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        /* loaded from: classes2.dex */
        class C1651a implements Parcelable.ClassLoaderCreator<C1650z> {
            C1651a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1650z createFromParcel(Parcel parcel) {
                return new C1650z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1650z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1650z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1650z[] newArray(int i) {
                return new C1650z[i];
            }
        }

        C1650z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5062e = parcel.readParcelable(classLoader == null ? AbstractC1635p.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        void m35021b(C1650z c1650z) {
            this.f5062e = c1650z.f5062e;
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f5062e, 0);
        }

        C1650z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4928c = new C1649y();
        this.f4930d = new C1647w();
        this.f4954x = new C1678c0();
        this.f4958z = new RunnableC1609a();
        this.f4883A = new Rect();
        this.f4885B = new Rect();
        this.f4887C = new RectF();
        this.f4895G = new ArrayList();
        this.f4897H = new ArrayList<>();
        this.f4899I = new ArrayList<>();
        this.f4911O = 0;
        this.f4925W = false;
        this.f4926a0 = false;
        this.f4927b0 = 0;
        this.f4929c0 = 0;
        this.f4931d0 = new C1628l();
        this.f4938i0 = new C1702i();
        this.f4939j0 = 0;
        this.f4940k0 = -1;
        this.f4950u0 = Float.MIN_VALUE;
        this.f4951v0 = Float.MIN_VALUE;
        boolean z = true;
        this.f4953w0 = true;
        this.f4955x0 = new RunnableC1618d0();
        this.f4959z0 = f4878Y0 ? new RunnableC1729m.C1731b() : null;
        this.f4884A0 = new C1614b0();
        this.f4890D0 = false;
        this.f4892E0 = false;
        this.f4894F0 = new C1633n();
        this.f4896G0 = false;
        this.f4902J0 = new int[2];
        this.f4906L0 = new int[2];
        this.f4908M0 = new int[2];
        this.f4910N0 = new int[2];
        this.f4912O0 = new ArrayList();
        this.f4914P0 = new RunnableC1613b();
        this.f4918R0 = 0;
        this.f4920S0 = 0;
        this.f4922T0 = new C1617d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4946q0 = viewConfiguration.getScaledTouchSlop();
        this.f4950u0 = C7773y.m17439b(viewConfiguration, context);
        this.f4951v0 = C7773y.m17437d(viewConfiguration, context);
        this.f4948s0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4949t0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4938i0.m35182v(this.f4894F0);
        m35263r0();
        m35257t0();
        m35260s0();
        if (C7759x.m17567A(this) == 0) {
            C7759x.m17478z0(this, 1);
        }
        this.f4923U = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1749w(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8086c.RecyclerView, i, 0);
        C7759x.m17502n0(this, context, C8086c.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C8086c.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C8086c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4956y = obtainStyledAttributes.getBoolean(C8086c.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C8086c.RecyclerView_fastScrollEnabled, false);
        this.f4907M = z2;
        if (z2) {
            m35254u0((StateListDrawable) obtainStyledAttributes.getDrawable(C8086c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C8086c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C8086c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C8086c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        m35249w(context, string, attributeSet, i, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4874U0, i, 0);
            C7759x.m17502n0(this, context, f4874U0, attributeSet, obtainStyledAttributes2, i, 0);
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes2.dex */
    public static class C1640q extends ViewGroup.MarginLayoutParams {

        /* renamed from: c */
        AbstractC1620e0 f5042c;

        /* renamed from: d */
        final Rect f5043d;

        /* renamed from: e */
        boolean f5044e;

        /* renamed from: f */
        boolean f5045f;

        public C1640q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5043d = new Rect();
            this.f5044e = true;
            this.f5045f = false;
        }

        /* renamed from: a */
        public int m35079a() {
            return this.f5042c.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean m35078b() {
            return this.f5042c.isUpdated();
        }

        /* renamed from: c */
        public boolean m35077c() {
            return this.f5042c.isRemoved();
        }

        /* renamed from: d */
        public boolean m35076d() {
            return this.f5042c.isInvalid();
        }

        public C1640q(int i, int i2) {
            super(i, i2);
            this.f5043d = new Rect();
            this.f5044e = true;
            this.f5045f = false;
        }

        public C1640q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5043d = new Rect();
            this.f5044e = true;
            this.f5045f = false;
        }

        public C1640q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5043d = new Rect();
            this.f5044e = true;
            this.f5045f = false;
        }

        public C1640q(C1640q c1640q) {
            super((ViewGroup.LayoutParams) c1640q);
            this.f5043d = new Rect();
            this.f5044e = true;
            this.f5045f = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1635p abstractC1635p = this.f4891E;
        if (abstractC1635p != null) {
            return abstractC1635p.mo34999P(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m35334Q());
    }
}
