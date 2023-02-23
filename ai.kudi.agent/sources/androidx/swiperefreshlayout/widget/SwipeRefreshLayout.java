package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.C1335a;
import androidx.core.widget.C1396g;
import p201g.p227h.p238l.C7747l;
import p201g.p227h.p238l.C7751p;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7746k;
import p201g.p227h.p238l.InterfaceC7750o;
/* loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC7750o, InterfaceC7746k {

    /* renamed from: j0 */
    private static final String f5660j0 = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: k0 */
    private static final int[] f5661k0 = {16842766};

    /* renamed from: A */
    private final int[] f5662A;

    /* renamed from: B */
    private final int[] f5663B;

    /* renamed from: C */
    private boolean f5664C;

    /* renamed from: D */
    private int f5665D;

    /* renamed from: E */
    int f5666E;

    /* renamed from: F */
    private float f5667F;

    /* renamed from: G */
    private float f5668G;

    /* renamed from: H */
    private boolean f5669H;

    /* renamed from: I */
    private int f5670I;

    /* renamed from: J */
    boolean f5671J;

    /* renamed from: K */
    private boolean f5672K;

    /* renamed from: L */
    private final DecelerateInterpolator f5673L;

    /* renamed from: M */
    C1880a f5674M;

    /* renamed from: N */
    private int f5675N;

    /* renamed from: O */
    protected int f5676O;

    /* renamed from: P */
    float f5677P;

    /* renamed from: Q */
    protected int f5678Q;

    /* renamed from: R */
    int f5679R;

    /* renamed from: S */
    int f5680S;

    /* renamed from: T */
    C1882b f5681T;

    /* renamed from: U */
    private Animation f5682U;

    /* renamed from: V */
    private Animation f5683V;

    /* renamed from: W */
    private Animation f5684W;

    /* renamed from: a0 */
    private Animation f5685a0;

    /* renamed from: b0 */
    private Animation f5686b0;

    /* renamed from: c */
    private View f5687c;

    /* renamed from: c0 */
    boolean f5688c0;

    /* renamed from: d */
    InterfaceC1879j f5689d;

    /* renamed from: d0 */
    private int f5690d0;

    /* renamed from: e */
    boolean f5691e;

    /* renamed from: e0 */
    boolean f5692e0;

    /* renamed from: f */
    private int f5693f;

    /* renamed from: f0 */
    private InterfaceC1878i f5694f0;

    /* renamed from: g0 */
    private Animation.AnimationListener f5695g0;

    /* renamed from: h0 */
    private final Animation f5696h0;

    /* renamed from: i0 */
    private final Animation f5697i0;

    /* renamed from: w */
    private float f5698w;

    /* renamed from: x */
    private float f5699x;

    /* renamed from: y */
    private final C7751p f5700y;

    /* renamed from: z */
    private final C7747l f5701z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a  reason: invalid class name */
    /* loaded from: classes2.dex */
    class animationAnimation$AnimationListenerC1870a implements Animation.AnimationListener {
        animationAnimation$AnimationListenerC1870a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC1879j interfaceC1879j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f5691e) {
                swipeRefreshLayout.f5681T.setAlpha(255);
                SwipeRefreshLayout.this.f5681T.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f5688c0 && (interfaceC1879j = swipeRefreshLayout2.f5689d) != null) {
                    interfaceC1879j.onRefresh();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f5666E = swipeRefreshLayout3.f5674M.getTop();
                return;
            }
            swipeRefreshLayout.m34378k();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    /* loaded from: classes2.dex */
    public class C1871b extends Animation {
        C1871b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    /* loaded from: classes2.dex */
    public class C1872c extends Animation {
        C1872c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    /* loaded from: classes2.dex */
    public class C1873d extends Animation {

        /* renamed from: c */
        final /* synthetic */ int f5705c;

        /* renamed from: d */
        final /* synthetic */ int f5706d;

        C1873d(int i, int i2) {
            this.f5705c = i;
            this.f5706d = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C1882b c1882b = SwipeRefreshLayout.this.f5681T;
            int i = this.f5705c;
            c1882b.setAlpha((int) (i + ((this.f5706d - i) * f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class animationAnimation$AnimationListenerC1874e implements Animation.AnimationListener {
        animationAnimation$AnimationListenerC1874e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f5671J) {
                return;
            }
            swipeRefreshLayout.m34372q(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    /* loaded from: classes2.dex */
    class C1875f extends Animation {
        C1875f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f5692e0) {
                i = swipeRefreshLayout.f5679R - Math.abs(swipeRefreshLayout.f5678Q);
            } else {
                i = swipeRefreshLayout.f5679R;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f5676O;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) ((i - i2) * f))) - swipeRefreshLayout2.f5674M.getTop());
            SwipeRefreshLayout.this.f5681T.m34361e(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    /* loaded from: classes2.dex */
    class C1876g extends Animation {
        C1876g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m34380i(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    /* loaded from: classes2.dex */
    public class C1877h extends Animation {
        C1877h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f5677P;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.m34380i(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC1878i {
        /* renamed from: a */
        boolean m34369a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC1879j {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5691e = false;
        this.f5698w = -1.0f;
        this.f5662A = new int[2];
        this.f5663B = new int[2];
        this.f5670I = -1;
        this.f5675N = -1;
        this.f5695g0 = new animationAnimation$AnimationListenerC1870a();
        this.f5696h0 = new C1875f();
        this.f5697i0 = new C1876g();
        this.f5693f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5665D = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f5673L = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f5690d0 = (int) (displayMetrics.density * 40.0f);
        m34385d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f5679R = i;
        this.f5698w = i;
        this.f5700y = new C7751p(this);
        this.f5701z = new C7747l(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f5690d0;
        this.f5666E = i2;
        this.f5678Q = i2;
        m34380i(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5661k0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m34388a(int i, Animation.AnimationListener animationListener) {
        this.f5676O = i;
        this.f5696h0.reset();
        this.f5696h0.setDuration(200L);
        this.f5696h0.setInterpolator(this.f5673L);
        if (animationListener != null) {
            this.f5674M.m34367b(animationListener);
        }
        this.f5674M.clearAnimation();
        this.f5674M.startAnimation(this.f5696h0);
    }

    /* renamed from: b */
    private void m34387b(int i, Animation.AnimationListener animationListener) {
        if (this.f5671J) {
            m34371r(i, animationListener);
            return;
        }
        this.f5676O = i;
        this.f5697i0.reset();
        this.f5697i0.setDuration(200L);
        this.f5697i0.setInterpolator(this.f5673L);
        if (animationListener != null) {
            this.f5674M.m34367b(animationListener);
        }
        this.f5674M.clearAnimation();
        this.f5674M.startAnimation(this.f5697i0);
    }

    /* renamed from: d */
    private void m34385d() {
        this.f5674M = new C1880a(getContext(), -328966);
        C1882b c1882b = new C1882b(getContext());
        this.f5681T = c1882b;
        c1882b.m34354l(1);
        this.f5674M.setImageDrawable(this.f5681T);
        this.f5674M.setVisibility(8);
        addView(this.f5674M);
    }

    /* renamed from: e */
    private void m34384e() {
        if (this.f5687c == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f5674M)) {
                    this.f5687c = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m34383f(float f) {
        if (f > this.f5698w) {
            m34377l(true, true);
            return;
        }
        this.f5691e = false;
        this.f5681T.m34356j(0.0f, 0.0f);
        m34387b(this.f5666E, this.f5671J ? null : new animationAnimation$AnimationListenerC1874e());
        this.f5681T.m34362d(false);
    }

    /* renamed from: g */
    private boolean m34382g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: h */
    private void m34381h(float f) {
        this.f5681T.m34362d(true);
        float min = Math.min(1.0f, Math.abs(f / this.f5698w));
        double d = min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f5698w;
        int i = this.f5680S;
        if (i <= 0) {
            i = this.f5692e0 ? this.f5679R - this.f5678Q : this.f5679R;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f5678Q + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f5674M.getVisibility() != 0) {
            this.f5674M.setVisibility(0);
        }
        if (!this.f5671J) {
            this.f5674M.setScaleX(1.0f);
            this.f5674M.setScaleY(1.0f);
        }
        if (this.f5671J) {
            setAnimationProgress(Math.min(1.0f, f / this.f5698w));
        }
        if (f < this.f5698w) {
            if (this.f5681T.getAlpha() > 76 && !m34382g(this.f5684W)) {
                m34373p();
            }
        } else if (this.f5681T.getAlpha() < 255 && !m34382g(this.f5685a0)) {
            m34374o();
        }
        this.f5681T.m34356j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f5681T.m34361e(Math.min(1.0f, max));
        this.f5681T.m34359g((((max * 0.4f) - 0.25f) + (f3 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f5666E);
    }

    /* renamed from: j */
    private void m34379j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5670I) {
            this.f5670I = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: l */
    private void m34377l(boolean z, boolean z2) {
        if (this.f5691e != z) {
            this.f5688c0 = z2;
            m34384e();
            this.f5691e = z;
            if (z) {
                m34388a(this.f5666E, this.f5695g0);
            } else {
                m34372q(this.f5695g0);
            }
        }
    }

    /* renamed from: m */
    private Animation m34376m(int i, int i2) {
        C1873d c1873d = new C1873d(i, i2);
        c1873d.setDuration(300L);
        this.f5674M.m34367b(null);
        this.f5674M.clearAnimation();
        this.f5674M.startAnimation(c1873d);
        return c1873d;
    }

    /* renamed from: n */
    private void m34375n(float f) {
        float f2 = this.f5668G;
        int i = this.f5693f;
        if (f - f2 <= i || this.f5669H) {
            return;
        }
        this.f5667F = f2 + i;
        this.f5669H = true;
        this.f5681T.setAlpha(76);
    }

    /* renamed from: o */
    private void m34374o() {
        this.f5685a0 = m34376m(this.f5681T.getAlpha(), 255);
    }

    /* renamed from: p */
    private void m34373p() {
        this.f5684W = m34376m(this.f5681T.getAlpha(), 76);
    }

    /* renamed from: r */
    private void m34371r(int i, Animation.AnimationListener animationListener) {
        this.f5676O = i;
        this.f5677P = this.f5674M.getScaleX();
        C1877h c1877h = new C1877h();
        this.f5686b0 = c1877h;
        c1877h.setDuration(150L);
        if (animationListener != null) {
            this.f5674M.m34367b(animationListener);
        }
        this.f5674M.clearAnimation();
        this.f5674M.startAnimation(this.f5686b0);
    }

    /* renamed from: s */
    private void m34370s(Animation.AnimationListener animationListener) {
        this.f5674M.setVisibility(0);
        this.f5681T.setAlpha(255);
        C1871b c1871b = new C1871b();
        this.f5682U = c1871b;
        c1871b.setDuration(this.f5665D);
        if (animationListener != null) {
            this.f5674M.m34367b(animationListener);
        }
        this.f5674M.clearAnimation();
        this.f5674M.startAnimation(this.f5682U);
    }

    private void setColorViewAlpha(int i) {
        this.f5674M.getBackground().setAlpha(i);
        this.f5681T.setAlpha(i);
    }

    /* renamed from: c */
    public boolean m34386c() {
        InterfaceC1878i interfaceC1878i = this.f5694f0;
        if (interfaceC1878i != null) {
            return interfaceC1878i.m34369a(this, this.f5687c);
        }
        View view = this.f5687c;
        if (view instanceof ListView) {
            return C1396g.m36110a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f5701z.m17597a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f5701z.m17596b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f5701z.m17595c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f5701z.m17592f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f5675N;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5700y.m17578a();
    }

    public int getProgressCircleDiameter() {
        return this.f5690d0;
    }

    public int getProgressViewEndOffset() {
        return this.f5679R;
    }

    public int getProgressViewStartOffset() {
        return this.f5678Q;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f5701z.m17587k();
    }

    /* renamed from: i */
    void m34380i(float f) {
        int i = this.f5676O;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f5678Q - i) * f))) - this.f5674M.getTop());
    }

    @Override // android.view.View, p201g.p227h.p238l.InterfaceC7746k
    public boolean isNestedScrollingEnabled() {
        return this.f5701z.m17585m();
    }

    /* renamed from: k */
    void m34378k() {
        this.f5674M.clearAnimation();
        this.f5681T.stop();
        this.f5674M.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f5671J) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f5678Q - this.f5666E);
        }
        this.f5666E = this.f5674M.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m34378k();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m34384e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5672K && actionMasked == 0) {
            this.f5672K = false;
        }
        if (!isEnabled() || this.f5672K || m34386c() || this.f5691e || this.f5664C) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f5670I;
                    if (i == -1) {
                        Log.e(f5660j0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m34375n(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m34379j(motionEvent);
                    }
                }
            }
            this.f5669H = false;
            this.f5670I = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f5678Q - this.f5674M.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f5670I = pointerId;
            this.f5669H = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f5668G = motionEvent.getY(findPointerIndex2);
        }
        return this.f5669H;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f5687c == null) {
            m34384e();
        }
        View view = this.f5687c;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f5674M.getMeasuredWidth();
        int measuredHeight2 = this.f5674M.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f5666E;
        this.f5674M.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5687c == null) {
            m34384e();
        }
        View view = this.f5687c;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f5674M.measure(View.MeasureSpec.makeMeasureSpec(this.f5690d0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5690d0, 1073741824));
        this.f5675N = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f5674M) {
                this.f5675N = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f5699x;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f5699x = 0.0f;
                } else {
                    this.f5699x = f - f2;
                    iArr[1] = i2;
                }
                m34381h(this.f5699x);
            }
        }
        if (this.f5692e0 && i2 > 0 && this.f5699x == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f5674M.setVisibility(8);
        }
        int[] iArr2 = this.f5662A;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f5663B);
        int i5 = i4 + this.f5663B[1];
        if (i5 >= 0 || m34386c()) {
            return;
        }
        float abs = this.f5699x + Math.abs(i5);
        this.f5699x = abs;
        m34381h(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f5700y.m17577b(view, view2, i);
        startNestedScroll(i & 2);
        this.f5699x = 0.0f;
        this.f5664C = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f5672K || this.f5691e || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p201g.p227h.p238l.InterfaceC7750o
    public void onStopNestedScroll(View view) {
        this.f5700y.m17575d(view);
        this.f5664C = false;
        float f = this.f5699x;
        if (f > 0.0f) {
            m34383f(f);
            this.f5699x = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5672K && actionMasked == 0) {
            this.f5672K = false;
        }
        if (!isEnabled() || this.f5672K || m34386c() || this.f5691e || this.f5664C) {
            return false;
        }
        if (actionMasked == 0) {
            this.f5670I = motionEvent.getPointerId(0);
            this.f5669H = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5670I);
            if (findPointerIndex < 0) {
                Log.e(f5660j0, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f5669H) {
                this.f5669H = false;
                m34383f((motionEvent.getY(findPointerIndex) - this.f5667F) * 0.5f);
            }
            this.f5670I = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f5670I);
            if (findPointerIndex2 < 0) {
                Log.e(f5660j0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            m34375n(y);
            if (this.f5669H) {
                float f = (y - this.f5667F) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m34381h(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f5660j0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f5670I = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m34379j(motionEvent);
            }
        }
        return true;
    }

    /* renamed from: q */
    void m34372q(Animation.AnimationListener animationListener) {
        C1872c c1872c = new C1872c();
        this.f5683V = c1872c;
        c1872c.setDuration(150L);
        this.f5674M.m34367b(animationListener);
        this.f5674M.clearAnimation();
        this.f5674M.startAnimation(this.f5683V);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f5687c instanceof AbsListView)) {
            View view = this.f5687c;
            if (view == null || C7759x.m17534V(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    void setAnimationProgress(float f) {
        this.f5674M.setScaleX(f);
        this.f5674M.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m34384e();
        this.f5681T.m34360f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C1335a.m36324d(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f5698w = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m34378k();
    }

    @Override // android.view.View, p201g.p227h.p238l.InterfaceC7746k
    public void setNestedScrollingEnabled(boolean z) {
        this.f5701z.m17584n(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC1878i interfaceC1878i) {
        this.f5694f0 = interfaceC1878i;
    }

    public void setOnRefreshListener(InterfaceC1879j interfaceC1879j) {
        this.f5689d = interfaceC1879j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f5674M.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C1335a.m36324d(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.f5691e != z) {
            this.f5691e = z;
            if (!this.f5692e0) {
                i = this.f5679R + this.f5678Q;
            } else {
                i = this.f5679R;
            }
            setTargetOffsetTopAndBottom(i - this.f5666E);
            this.f5688c0 = false;
            m34370s(this.f5695g0);
            return;
        }
        m34377l(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f5690d0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f5690d0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f5674M.setImageDrawable(null);
            this.f5681T.m34354l(i);
            this.f5674M.setImageDrawable(this.f5681T);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f5680S = i;
    }

    void setTargetOffsetTopAndBottom(int i) {
        this.f5674M.bringToFront();
        C7759x.m17528a0(this.f5674M, i);
        this.f5666E = this.f5674M.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f5701z.m17582p(i);
    }

    @Override // android.view.View, p201g.p227h.p238l.InterfaceC7746k
    public void stopNestedScroll() {
        this.f5701z.m17580r();
    }
}
