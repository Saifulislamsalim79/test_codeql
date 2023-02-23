package p201g.p243j.p245b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p201g.p227h.p238l.C7759x;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* compiled from: ViewDragHelper.java */
/* renamed from: g.j.b.c */
/* loaded from: classes2.dex */
public class C7792c {

    /* renamed from: w */
    private static final Interpolator f18571w = new animationInterpolatorC7793a();

    /* renamed from: a */
    private int f18572a;

    /* renamed from: b */
    private int f18573b;

    /* renamed from: d */
    private float[] f18575d;

    /* renamed from: e */
    private float[] f18576e;

    /* renamed from: f */
    private float[] f18577f;

    /* renamed from: g */
    private float[] f18578g;

    /* renamed from: h */
    private int[] f18579h;

    /* renamed from: i */
    private int[] f18580i;

    /* renamed from: j */
    private int[] f18581j;

    /* renamed from: k */
    private int f18582k;

    /* renamed from: l */
    private VelocityTracker f18583l;

    /* renamed from: m */
    private float f18584m;

    /* renamed from: n */
    private float f18585n;

    /* renamed from: o */
    private int f18586o;

    /* renamed from: p */
    private int f18587p;

    /* renamed from: q */
    private OverScroller f18588q;

    /* renamed from: r */
    private final AbstractC7795c f18589r;

    /* renamed from: s */
    private View f18590s;

    /* renamed from: t */
    private boolean f18591t;

    /* renamed from: u */
    private final ViewGroup f18592u;

    /* renamed from: c */
    private int f18574c = -1;

    /* renamed from: v */
    private final Runnable f18593v = new RunnableC7794b();

    /* compiled from: ViewDragHelper.java */
    /* renamed from: g.j.b.c$a  reason: invalid class name */
    /* loaded from: classes2.dex */
    static class animationInterpolatorC7793a implements Interpolator {
        animationInterpolatorC7793a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: g.j.b.c$b */
    /* loaded from: classes2.dex */
    class RunnableC7794b implements Runnable {
        RunnableC7794b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7792c.this.m17349J(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: g.j.b.c$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7795c {
        /* renamed from: a */
        public abstract int mo17316a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo17315b(View view, int i, int i2);

        /* renamed from: c */
        public int m17314c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo17313d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo17312e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo17311f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo17310g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo17309h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo17308i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo17307j(int i);

        /* renamed from: k */
        public abstract void mo17306k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo17305l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo17304m(View view, int i);
    }

    private C7792c(Context context, ViewGroup viewGroup, AbstractC7795c abstractC7795c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC7795c != null) {
            this.f18592u = viewGroup;
            this.f18589r = abstractC7795c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f18586o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f18573b = viewConfiguration.getScaledTouchSlop();
            this.f18584m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f18585n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f18588q = new OverScroller(context, f18571w);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    /* renamed from: C */
    private boolean m17356C(int i) {
        if (m17357B(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: F */
    private void m17353F() {
        this.f18583l.computeCurrentVelocity(1000, this.f18584m);
        m17327p(m17336g(this.f18583l.getXVelocity(this.f18574c), this.f18585n, this.f18584m), m17336g(this.f18583l.getYVelocity(this.f18574c), this.f18585n, this.f18584m));
    }

    /* renamed from: G */
    private void m17352G(float f, float f2, int i) {
        int i2 = m17340c(f, f2, i, 1) ? 1 : 0;
        if (m17340c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m17340c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m17340c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f18580i;
            iArr[i] = iArr[i] | i2;
            this.f18589r.mo17311f(i2, i);
        }
    }

    /* renamed from: H */
    private void m17351H(float f, float f2, int i) {
        m17324s(i);
        float[] fArr = this.f18575d;
        this.f18577f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f18576e;
        this.f18578g[i] = f2;
        fArr2[i] = f2;
        this.f18579h[i] = m17319x((int) f, (int) f2);
        this.f18582k |= 1 << i;
    }

    /* renamed from: I */
    private void m17350I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m17356C(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f18577f[pointerId] = x;
                this.f18578g[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m17340c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f18579h[i] & i2) != i2 || (this.f18587p & i2) == 0 || (this.f18581j[i] & i2) == i2 || (this.f18580i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f18573b;
        if (abs > i3 || abs2 > i3) {
            if (abs >= abs2 * 0.5f || !this.f18589r.mo17310g(i2)) {
                return (this.f18580i[i] & i2) == 0 && abs > ((float) this.f18573b);
            }
            int[] iArr = this.f18581j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m17337f(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f18589r.mo17313d(view) > 0;
        boolean z2 = this.f18589r.mo17312e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f18573b) : z2 && Math.abs(f2) > ((float) this.f18573b);
        }
        int i = this.f18573b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: g */
    private float m17336g(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: h */
    private int m17335h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: i */
    private void m17334i() {
        float[] fArr = this.f18575d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f18576e, 0.0f);
        Arrays.fill(this.f18577f, 0.0f);
        Arrays.fill(this.f18578g, 0.0f);
        Arrays.fill(this.f18579h, 0);
        Arrays.fill(this.f18580i, 0);
        Arrays.fill(this.f18581j, 0);
        this.f18582k = 0;
    }

    /* renamed from: j */
    private void m17333j(int i) {
        if (this.f18575d == null || !m17357B(i)) {
            return;
        }
        this.f18575d[i] = 0.0f;
        this.f18576e[i] = 0.0f;
        this.f18577f[i] = 0.0f;
        this.f18578g[i] = 0.0f;
        this.f18579h[i] = 0;
        this.f18580i[i] = 0;
        this.f18581j[i] = 0;
        this.f18582k = ((1 << i) ^ (-1)) & this.f18582k;
    }

    /* renamed from: k */
    private int m17332k(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f18592u.getWidth();
        float f = width / 2;
        float m17326q = f + (m17326q(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m17326q / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, (int) IjkMediaCodecInfo.RANK_LAST_CHANCE);
    }

    /* renamed from: l */
    private int m17331l(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m17335h = m17335h(i3, (int) this.f18585n, (int) this.f18584m);
        int m17335h2 = m17335h(i4, (int) this.f18585n, (int) this.f18584m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m17335h);
        int abs4 = Math.abs(m17335h2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m17335h != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m17335h2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m17332k(i, m17335h, this.f18589r.mo17313d(view)) * f5) + (m17332k(i2, m17335h2, this.f18589r.mo17312e(view)) * (f3 / f4)));
    }

    /* renamed from: n */
    public static C7792c m17329n(ViewGroup viewGroup, float f, AbstractC7795c abstractC7795c) {
        C7792c m17328o = m17328o(viewGroup, abstractC7795c);
        m17328o.f18573b = (int) (m17328o.f18573b * (1.0f / f));
        return m17328o;
    }

    /* renamed from: o */
    public static C7792c m17328o(ViewGroup viewGroup, AbstractC7795c abstractC7795c) {
        return new C7792c(viewGroup.getContext(), viewGroup, abstractC7795c);
    }

    /* renamed from: p */
    private void m17327p(float f, float f2) {
        this.f18591t = true;
        this.f18589r.mo17305l(this.f18590s, f, f2);
        this.f18591t = false;
        if (this.f18572a == 1) {
            m17349J(0);
        }
    }

    /* renamed from: q */
    private float m17326q(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: r */
    private void m17325r(int i, int i2, int i3, int i4) {
        int left = this.f18590s.getLeft();
        int top = this.f18590s.getTop();
        if (i3 != 0) {
            i = this.f18589r.mo17316a(this.f18590s, i, i3);
            C7759x.m17530Z(this.f18590s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f18589r.mo17315b(this.f18590s, i2, i4);
            C7759x.m17528a0(this.f18590s, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f18589r.mo17306k(this.f18590s, i5, i6, i5 - left, i6 - top);
    }

    /* renamed from: s */
    private void m17324s(int i) {
        float[] fArr = this.f18575d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f18575d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f18576e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f18577f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f18578g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f18579h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f18580i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f18581j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f18575d = fArr2;
            this.f18576e = fArr3;
            this.f18577f = fArr4;
            this.f18578g = fArr5;
            this.f18579h = iArr;
            this.f18580i = iArr2;
            this.f18581j = iArr3;
        }
    }

    /* renamed from: u */
    private boolean m17322u(int i, int i2, int i3, int i4) {
        int left = this.f18590s.getLeft();
        int top = this.f18590s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f18588q.abortAnimation();
            m17349J(0);
            return false;
        }
        this.f18588q.startScroll(left, top, i5, i6, m17331l(this.f18590s, i5, i6, i3, i4));
        m17349J(2);
        return true;
    }

    /* renamed from: x */
    private int m17319x(int i, int i2) {
        int i3 = i < this.f18592u.getLeft() + this.f18586o ? 1 : 0;
        if (i2 < this.f18592u.getTop() + this.f18586o) {
            i3 |= 4;
        }
        if (i > this.f18592u.getRight() - this.f18586o) {
            i3 |= 2;
        }
        return i2 > this.f18592u.getBottom() - this.f18586o ? i3 | 8 : i3;
    }

    /* renamed from: A */
    public boolean m17358A(int i, int i2) {
        return m17355D(this.f18590s, i, i2);
    }

    /* renamed from: B */
    public boolean m17357B(int i) {
        return ((1 << i) & this.f18582k) != 0;
    }

    /* renamed from: D */
    public boolean m17355D(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: E */
    public void m17354E(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m17342a();
        }
        if (this.f18583l == null) {
            this.f18583l = VelocityTracker.obtain();
        }
        this.f18583l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m17323t = m17323t((int) x, (int) y);
            m17351H(x, y, pointerId);
            m17343P(m17323t, pointerId);
            int i3 = this.f18579h[pointerId];
            int i4 = this.f18587p;
            if ((i3 & i4) != 0) {
                this.f18589r.mo17309h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f18572a == 1) {
                m17353F();
            }
            m17342a();
        } else if (actionMasked == 2) {
            if (this.f18572a == 1) {
                if (m17356C(this.f18574c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f18574c);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f18577f;
                    int i5 = this.f18574c;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.f18578g[i5]);
                    m17325r(this.f18590s.getLeft() + i6, this.f18590s.getTop() + i7, i6, i7);
                    m17350I(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (m17356C(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f18575d[pointerId2];
                    float f2 = y3 - this.f18576e[pointerId2];
                    m17352G(f, f2, pointerId2);
                    if (this.f18572a != 1) {
                        View m17323t2 = m17323t((int) x3, (int) y3);
                        if (m17337f(m17323t2, f, f2) && m17343P(m17323t2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m17350I(motionEvent);
        } else if (actionMasked == 3) {
            if (this.f18572a == 1) {
                m17327p(0.0f, 0.0f);
            }
            m17342a();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m17351H(x4, y4, pointerId3);
            if (this.f18572a == 0) {
                m17343P(m17323t((int) x4, (int) y4), pointerId3);
                int i8 = this.f18579h[pointerId3];
                int i9 = this.f18587p;
                if ((i8 & i9) != 0) {
                    this.f18589r.mo17309h(i8 & i9, pointerId3);
                }
            } else if (m17358A((int) x4, (int) y4)) {
                m17343P(this.f18590s, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.f18572a == 1 && pointerId4 == this.f18574c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i2);
                    if (pointerId5 != this.f18574c) {
                        View m17323t3 = m17323t((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.f18590s;
                        if (m17323t3 == view && m17343P(view, pointerId5)) {
                            i = this.f18574c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m17353F();
                }
            }
            m17333j(pointerId4);
        }
    }

    /* renamed from: J */
    void m17349J(int i) {
        this.f18592u.removeCallbacks(this.f18593v);
        if (this.f18572a != i) {
            this.f18572a = i;
            this.f18589r.mo17307j(i);
            if (this.f18572a == 0) {
                this.f18590s = null;
            }
        }
    }

    /* renamed from: K */
    public void m17348K(int i) {
        this.f18587p = i;
    }

    /* renamed from: L */
    public void m17347L(float f) {
        this.f18585n = f;
    }

    /* renamed from: M */
    public boolean m17346M(int i, int i2) {
        if (this.f18591t) {
            return m17322u(i, i2, (int) this.f18583l.getXVelocity(this.f18574c), (int) this.f18583l.getYVelocity(this.f18574c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m17345N(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p243j.p245b.C7792c.m17345N(android.view.MotionEvent):boolean");
    }

    /* renamed from: O */
    public boolean m17344O(View view, int i, int i2) {
        this.f18590s = view;
        this.f18574c = -1;
        boolean m17322u = m17322u(i, i2, 0, 0);
        if (!m17322u && this.f18572a == 0 && this.f18590s != null) {
            this.f18590s = null;
        }
        return m17322u;
    }

    /* renamed from: P */
    boolean m17343P(View view, int i) {
        if (view == this.f18590s && this.f18574c == i) {
            return true;
        }
        if (view == null || !this.f18589r.mo17304m(view, i)) {
            return false;
        }
        this.f18574c = i;
        m17341b(view, i);
        return true;
    }

    /* renamed from: a */
    public void m17342a() {
        this.f18574c = -1;
        m17334i();
        VelocityTracker velocityTracker = this.f18583l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18583l = null;
        }
    }

    /* renamed from: b */
    public void m17341b(View view, int i) {
        if (view.getParent() == this.f18592u) {
            this.f18590s = view;
            this.f18574c = i;
            this.f18589r.mo17308i(view, i);
            m17349J(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f18592u + ")");
    }

    /* renamed from: d */
    public boolean m17339d(int i) {
        int length = this.f18575d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m17338e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean m17338e(int i, int i2) {
        if (m17357B(i2)) {
            boolean z = (i & 1) == 1;
            boolean z2 = (i & 2) == 2;
            float f = this.f18577f[i2] - this.f18575d[i2];
            float f2 = this.f18578g[i2] - this.f18576e[i2];
            if (!z || !z2) {
                return z ? Math.abs(f) > ((float) this.f18573b) : z2 && Math.abs(f2) > ((float) this.f18573b);
            }
            int i3 = this.f18573b;
            return (f * f) + (f2 * f2) > ((float) (i3 * i3));
        }
        return false;
    }

    /* renamed from: m */
    public boolean m17330m(boolean z) {
        if (this.f18572a == 2) {
            boolean computeScrollOffset = this.f18588q.computeScrollOffset();
            int currX = this.f18588q.getCurrX();
            int currY = this.f18588q.getCurrY();
            int left = currX - this.f18590s.getLeft();
            int top = currY - this.f18590s.getTop();
            if (left != 0) {
                C7759x.m17530Z(this.f18590s, left);
            }
            if (top != 0) {
                C7759x.m17528a0(this.f18590s, top);
            }
            if (left != 0 || top != 0) {
                this.f18589r.mo17306k(this.f18590s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f18588q.getFinalX() && currY == this.f18588q.getFinalY()) {
                this.f18588q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f18592u.post(this.f18593v);
                } else {
                    m17349J(0);
                }
            }
        }
        return this.f18572a == 2;
    }

    /* renamed from: t */
    public View m17323t(int i, int i2) {
        for (int childCount = this.f18592u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f18592u;
            this.f18589r.m17314c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public View m17321v() {
        return this.f18590s;
    }

    /* renamed from: w */
    public int m17320w() {
        return this.f18586o;
    }

    /* renamed from: y */
    public int m17318y() {
        return this.f18573b;
    }

    /* renamed from: z */
    public int m17317z() {
        return this.f18572a;
    }
}
