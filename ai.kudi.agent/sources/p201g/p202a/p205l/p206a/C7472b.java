package p201g.p202a.p205l.p206a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C1365a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableContainer.java */
/* renamed from: g.a.l.a.b */
/* loaded from: classes2.dex */
public class C7472b extends Drawable implements Drawable.Callback {

    /* renamed from: A */
    private Runnable f17692A;

    /* renamed from: B */
    private long f17693B;

    /* renamed from: C */
    private long f17694C;

    /* renamed from: D */
    private C7475c f17695D;

    /* renamed from: c */
    private AbstractC7476d f17696c;

    /* renamed from: d */
    private Rect f17697d;

    /* renamed from: e */
    private Drawable f17698e;

    /* renamed from: f */
    private Drawable f17699f;

    /* renamed from: x */
    private boolean f17701x;

    /* renamed from: z */
    private boolean f17703z;

    /* renamed from: w */
    private int f17700w = 255;

    /* renamed from: y */
    private int f17702y = -1;

    /* compiled from: DrawableContainer.java */
    /* renamed from: g.a.l.a.b$a */
    /* loaded from: classes2.dex */
    class RunnableC7473a implements Runnable {
        RunnableC7473a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7472b.this.m18663a(true);
            C7472b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: g.a.l.a.b$b */
    /* loaded from: classes2.dex */
    public static class C7474b {
        /* renamed from: a */
        public static boolean m18656a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m18655b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m18654c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: g.a.l.a.b$c */
    /* loaded from: classes2.dex */
    public static class C7475c implements Drawable.Callback {

        /* renamed from: c */
        private Drawable.Callback f17705c;

        C7475c() {
        }

        /* renamed from: a */
        public Drawable.Callback m18653a() {
            Drawable.Callback callback = this.f17705c;
            this.f17705c = null;
            return callback;
        }

        /* renamed from: b */
        public C7475c m18652b(Drawable.Callback callback) {
            this.f17705c = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f17705c;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f17705c;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableContainer.java */
    /* renamed from: g.a.l.a.b$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7476d extends Drawable.ConstantState {

        /* renamed from: A */
        int f17706A;

        /* renamed from: B */
        int f17707B;

        /* renamed from: C */
        boolean f17708C;

        /* renamed from: D */
        ColorFilter f17709D;

        /* renamed from: E */
        boolean f17710E;

        /* renamed from: F */
        ColorStateList f17711F;

        /* renamed from: G */
        PorterDuff.Mode f17712G;

        /* renamed from: H */
        boolean f17713H;

        /* renamed from: I */
        boolean f17714I;

        /* renamed from: a */
        final C7472b f17715a;

        /* renamed from: b */
        Resources f17716b;

        /* renamed from: c */
        int f17717c;

        /* renamed from: d */
        int f17718d;

        /* renamed from: e */
        int f17719e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f17720f;

        /* renamed from: g */
        Drawable[] f17721g;

        /* renamed from: h */
        int f17722h;

        /* renamed from: i */
        boolean f17723i;

        /* renamed from: j */
        boolean f17724j;

        /* renamed from: k */
        Rect f17725k;

        /* renamed from: l */
        boolean f17726l;

        /* renamed from: m */
        boolean f17727m;

        /* renamed from: n */
        int f17728n;

        /* renamed from: o */
        int f17729o;

        /* renamed from: p */
        int f17730p;

        /* renamed from: q */
        int f17731q;

        /* renamed from: r */
        boolean f17732r;

        /* renamed from: s */
        int f17733s;

        /* renamed from: t */
        boolean f17734t;

        /* renamed from: u */
        boolean f17735u;

        /* renamed from: v */
        boolean f17736v;

        /* renamed from: w */
        boolean f17737w;

        /* renamed from: x */
        boolean f17738x;

        /* renamed from: y */
        boolean f17739y;

        /* renamed from: z */
        int f17740z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC7476d(AbstractC7476d abstractC7476d, C7472b c7472b, Resources resources) {
            Resources resources2;
            this.f17723i = false;
            this.f17726l = false;
            this.f17738x = true;
            this.f17706A = 0;
            this.f17707B = 0;
            this.f17715a = c7472b;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = abstractC7476d != null ? abstractC7476d.f17716b : null;
            }
            this.f17716b = resources2;
            int m18659f = C7472b.m18659f(resources, abstractC7476d != null ? abstractC7476d.f17717c : 0);
            this.f17717c = m18659f;
            if (abstractC7476d != null) {
                this.f17718d = abstractC7476d.f17718d;
                this.f17719e = abstractC7476d.f17719e;
                this.f17736v = true;
                this.f17737w = true;
                this.f17723i = abstractC7476d.f17723i;
                this.f17726l = abstractC7476d.f17726l;
                this.f17738x = abstractC7476d.f17738x;
                this.f17739y = abstractC7476d.f17739y;
                this.f17740z = abstractC7476d.f17740z;
                this.f17706A = abstractC7476d.f17706A;
                this.f17707B = abstractC7476d.f17707B;
                this.f17708C = abstractC7476d.f17708C;
                this.f17709D = abstractC7476d.f17709D;
                this.f17710E = abstractC7476d.f17710E;
                this.f17711F = abstractC7476d.f17711F;
                this.f17712G = abstractC7476d.f17712G;
                this.f17713H = abstractC7476d.f17713H;
                this.f17714I = abstractC7476d.f17714I;
                if (abstractC7476d.f17717c == m18659f) {
                    if (abstractC7476d.f17724j) {
                        this.f17725k = abstractC7476d.f17725k != null ? new Rect(abstractC7476d.f17725k) : null;
                        this.f17724j = true;
                    }
                    if (abstractC7476d.f17727m) {
                        this.f17728n = abstractC7476d.f17728n;
                        this.f17729o = abstractC7476d.f17729o;
                        this.f17730p = abstractC7476d.f17730p;
                        this.f17731q = abstractC7476d.f17731q;
                        this.f17727m = true;
                    }
                }
                if (abstractC7476d.f17732r) {
                    this.f17733s = abstractC7476d.f17733s;
                    this.f17732r = true;
                }
                if (abstractC7476d.f17734t) {
                    this.f17735u = abstractC7476d.f17735u;
                    this.f17734t = true;
                }
                Drawable[] drawableArr = abstractC7476d.f17721g;
                this.f17721g = new Drawable[drawableArr.length];
                this.f17722h = abstractC7476d.f17722h;
                SparseArray<Drawable.ConstantState> sparseArray = abstractC7476d.f17720f;
                if (sparseArray != null) {
                    this.f17720f = sparseArray.clone();
                } else {
                    this.f17720f = new SparseArray<>(this.f17722h);
                }
                int i = this.f17722h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f17720f.put(i2, constantState);
                        } else {
                            this.f17721g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f17721g = new Drawable[10];
            this.f17722h = 0;
        }

        /* renamed from: e */
        private void m18647e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f17720f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f17721g[this.f17720f.keyAt(i)] = m18635s(this.f17720f.valueAt(i).newDrawable(this.f17716b));
                }
                this.f17720f = null;
            }
        }

        /* renamed from: s */
        private Drawable m18635s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C1365a.m36189m(drawable, this.f17740z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f17715a);
            return mutate;
        }

        /* renamed from: a */
        public final int m18651a(Drawable drawable) {
            int i = this.f17722h;
            if (i >= this.f17721g.length) {
                mo18613o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f17715a);
            this.f17721g[i] = drawable;
            this.f17722h++;
            this.f17719e = drawable.getChangingConfigurations() | this.f17719e;
            m18637p();
            this.f17725k = null;
            this.f17724j = false;
            this.f17727m = false;
            this.f17736v = false;
            return i;
        }

        /* renamed from: b */
        final void m18650b(Resources.Theme theme) {
            if (theme != null) {
                m18647e();
                int i = this.f17722h;
                Drawable[] drawableArr = this.f17721g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && C1365a.m36200b(drawableArr[i2])) {
                        C1365a.m36201a(drawableArr[i2], theme);
                        this.f17719e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m18629y(C7474b.m18654c(theme));
            }
        }

        /* renamed from: c */
        public boolean m18649c() {
            if (this.f17736v) {
                return this.f17737w;
            }
            m18647e();
            this.f17736v = true;
            int i = this.f17722h;
            Drawable[] drawableArr = this.f17721g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f17737w = false;
                    return false;
                }
            }
            this.f17737w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f17722h;
            Drawable[] drawableArr = this.f17721g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (C1365a.m36200b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f17720f.get(i2);
                    if (constantState != null && C7474b.m18656a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m18648d() {
            this.f17727m = true;
            m18647e();
            int i = this.f17722h;
            Drawable[] drawableArr = this.f17721g;
            this.f17729o = -1;
            this.f17728n = -1;
            this.f17731q = 0;
            this.f17730p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f17728n) {
                    this.f17728n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f17729o) {
                    this.f17729o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f17730p) {
                    this.f17730p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f17731q) {
                    this.f17731q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public final int m18646f() {
            return this.f17721g.length;
        }

        /* renamed from: g */
        public final Drawable m18645g(int i) {
            int indexOfKey;
            Drawable drawable = this.f17721g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f17720f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m18635s = m18635s(this.f17720f.valueAt(indexOfKey).newDrawable(this.f17716b));
            this.f17721g[i] = m18635s;
            this.f17720f.removeAt(indexOfKey);
            if (this.f17720f.size() == 0) {
                this.f17720f = null;
            }
            return m18635s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f17718d | this.f17719e;
        }

        /* renamed from: h */
        public final int m18644h() {
            return this.f17722h;
        }

        /* renamed from: i */
        public final int m18643i() {
            if (!this.f17727m) {
                m18648d();
            }
            return this.f17729o;
        }

        /* renamed from: j */
        public final int m18642j() {
            if (!this.f17727m) {
                m18648d();
            }
            return this.f17731q;
        }

        /* renamed from: k */
        public final int m18641k() {
            if (!this.f17727m) {
                m18648d();
            }
            return this.f17730p;
        }

        /* renamed from: l */
        public final Rect m18640l() {
            Rect rect = null;
            if (this.f17723i) {
                return null;
            }
            if (this.f17725k == null && !this.f17724j) {
                m18647e();
                Rect rect2 = new Rect();
                int i = this.f17722h;
                Drawable[] drawableArr = this.f17721g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect2)) {
                        if (rect == null) {
                            rect = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect2.left;
                        if (i3 > rect.left) {
                            rect.left = i3;
                        }
                        int i4 = rect2.top;
                        if (i4 > rect.top) {
                            rect.top = i4;
                        }
                        int i5 = rect2.right;
                        if (i5 > rect.right) {
                            rect.right = i5;
                        }
                        int i6 = rect2.bottom;
                        if (i6 > rect.bottom) {
                            rect.bottom = i6;
                        }
                    }
                }
                this.f17724j = true;
                this.f17725k = rect;
                return rect;
            }
            return this.f17725k;
        }

        /* renamed from: m */
        public final int m18639m() {
            if (!this.f17727m) {
                m18648d();
            }
            return this.f17728n;
        }

        /* renamed from: n */
        public final int m18638n() {
            if (this.f17732r) {
                return this.f17733s;
            }
            m18647e();
            int i = this.f17722h;
            Drawable[] drawableArr = this.f17721g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f17733s = opacity;
            this.f17732r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo18613o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f17721g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f17721g = drawableArr;
        }

        /* renamed from: p */
        void m18637p() {
            this.f17732r = false;
            this.f17734t = false;
        }

        /* renamed from: q */
        public final boolean m18636q() {
            return this.f17726l;
        }

        /* renamed from: r */
        abstract void mo18612r();

        /* renamed from: t */
        public final void m18634t(boolean z) {
            this.f17726l = z;
        }

        /* renamed from: u */
        public final void m18633u(int i) {
            this.f17706A = i;
        }

        /* renamed from: v */
        public final void m18632v(int i) {
            this.f17707B = i;
        }

        /* renamed from: w */
        final boolean m18631w(int i, int i2) {
            int i3 = this.f17722h;
            Drawable[] drawableArr = this.f17721g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m36189m = Build.VERSION.SDK_INT >= 23 ? C1365a.m36189m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m36189m;
                    }
                }
            }
            this.f17740z = i;
            return z;
        }

        /* renamed from: x */
        public final void m18630x(boolean z) {
            this.f17723i = z;
        }

        /* renamed from: y */
        final void m18629y(Resources resources) {
            if (resources != null) {
                this.f17716b = resources;
                int m18659f = C7472b.m18659f(resources, this.f17717c);
                int i = this.f17717c;
                this.f17717c = m18659f;
                if (i != m18659f) {
                    this.f17727m = false;
                    this.f17724j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m18661d(Drawable drawable) {
        if (this.f17695D == null) {
            this.f17695D = new C7475c();
        }
        C7475c c7475c = this.f17695D;
        c7475c.m18652b(drawable.getCallback());
        drawable.setCallback(c7475c);
        try {
            if (this.f17696c.f17706A <= 0 && this.f17701x) {
                drawable.setAlpha(this.f17700w);
            }
            if (this.f17696c.f17710E) {
                drawable.setColorFilter(this.f17696c.f17709D);
            } else {
                if (this.f17696c.f17713H) {
                    C1365a.m36187o(drawable, this.f17696c.f17711F);
                }
                if (this.f17696c.f17714I) {
                    C1365a.m36186p(drawable, this.f17696c.f17712G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f17696c.f17738x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C1365a.m36189m(drawable, C1365a.m36196f(this));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                C1365a.m36192j(drawable, this.f17696c.f17708C);
            }
            Rect rect = this.f17697d;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                C1365a.m36190l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f17695D.m18653a());
        }
    }

    /* renamed from: e */
    private boolean m18660e() {
        return isAutoMirrored() && C1365a.m36196f(this) == 1;
    }

    /* renamed from: f */
    static int m18659f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m18663a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f17701x = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f17698e
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f17693B
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f17700w
            r3.setAlpha(r9)
            r13.f17693B = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            g.a.l.a.b$d r9 = r13.f17696c
            int r9 = r9.f17706A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f17700w
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f17693B = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f17699f
            if (r9 == 0) goto L65
            long r10 = r13.f17694C
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f17699f = r0
            r13.f17694C = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.a.l.a.b$d r4 = r13.f17696c
            int r4 = r4.f17707B
            int r3 = r3 / r4
            int r4 = r13.f17700w
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f17694C = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f17692A
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p202a.p205l.p206a.C7472b.m18663a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f17696c.m18650b(theme);
    }

    /* renamed from: b */
    AbstractC7476d mo18618b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m18662c() {
        return this.f17702y;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f17696c.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f17699f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m18658g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f17702y
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.a.l.a.b$d r0 = r9.f17696c
            int r0 = r0.f17707B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f17699f
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f17698e
            if (r0 == 0) goto L29
            r9.f17699f = r0
            g.a.l.a.b$d r0 = r9.f17696c
            int r0 = r0.f17707B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f17694C = r0
            goto L35
        L29:
            r9.f17699f = r4
            r9.f17694C = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f17698e
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.a.l.a.b$d r0 = r9.f17696c
            int r1 = r0.f17722h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m18645g(r10)
            r9.f17698e = r0
            r9.f17702y = r10
            if (r0 == 0) goto L5a
            g.a.l.a.b$d r10 = r9.f17696c
            int r10 = r10.f17706A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f17693B = r2
        L51:
            r9.m18661d(r0)
            goto L5a
        L55:
            r9.f17698e = r4
            r10 = -1
            r9.f17702y = r10
        L5a:
            long r0 = r9.f17693B
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f17694C
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f17692A
            if (r0 != 0) goto L73
            g.a.l.a.b$a r0 = new g.a.l.a.b$a
            r0.<init>()
            r9.f17692A = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m18663a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p202a.p205l.p206a.C7472b.m18658g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17700w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f17696c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17696c.m18649c()) {
            this.f17696c.f17718d = getChangingConfigurations();
            return this.f17696c;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f17698e;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f17697d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f17696c.m18636q()) {
            return this.f17696c.m18643i();
        }
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f17696c.m18636q()) {
            return this.f17696c.m18639m();
        }
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f17696c.m18636q()) {
            return this.f17696c.m18642j();
        }
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f17696c.m18636q()) {
            return this.f17696c.m18641k();
        }
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f17698e;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f17696c.m18638n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            C7474b.m18655b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m18640l = this.f17696c.m18640l();
        if (m18640l != null) {
            rect.set(m18640l);
            padding = (m18640l.right | ((m18640l.left | m18640l.top) | m18640l.bottom)) != 0;
        } else {
            Drawable drawable = this.f17698e;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (m18660e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo18617h(AbstractC7476d abstractC7476d) {
        this.f17696c = abstractC7476d;
        int i = this.f17702y;
        if (i >= 0) {
            Drawable m18645g = abstractC7476d.m18645g(i);
            this.f17698e = m18645g;
            if (m18645g != null) {
                m18661d(m18645g);
            }
        }
        this.f17699f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m18657i(Resources resources) {
        this.f17696c.m18629y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC7476d abstractC7476d = this.f17696c;
        if (abstractC7476d != null) {
            abstractC7476d.m18637p();
        }
        if (drawable != this.f17698e || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f17696c.f17708C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f17699f;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f17699f = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f17698e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f17701x) {
                this.f17698e.setAlpha(this.f17700w);
            }
        }
        if (this.f17694C != 0) {
            this.f17694C = 0L;
            z = true;
        }
        if (this.f17693B != 0) {
            this.f17693B = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f17703z && super.mutate() == this) {
            AbstractC7476d mo18618b = mo18618b();
            mo18618b.mo18612r();
            mo18617h(mo18618b);
            this.f17703z = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17699f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f17698e;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f17696c.m18631w(i, m18662c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f17699f;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f17698e;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17699f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f17698e;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f17698e || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f17701x && this.f17700w == i) {
            return;
        }
        this.f17701x = true;
        this.f17700w = i;
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            if (this.f17693B == 0) {
                drawable.setAlpha(i);
            } else {
                m18663a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC7476d abstractC7476d = this.f17696c;
        if (abstractC7476d.f17708C != z) {
            abstractC7476d.f17708C = z;
            Drawable drawable = this.f17698e;
            if (drawable != null) {
                C1365a.m36192j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC7476d abstractC7476d = this.f17696c;
        abstractC7476d.f17710E = true;
        if (abstractC7476d.f17709D != colorFilter) {
            abstractC7476d.f17709D = colorFilter;
            Drawable drawable = this.f17698e;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC7476d abstractC7476d = this.f17696c;
        if (abstractC7476d.f17738x != z) {
            abstractC7476d.f17738x = z;
            Drawable drawable = this.f17698e;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            C1365a.m36191k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f17697d;
        if (rect == null) {
            this.f17697d = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f17698e;
        if (drawable != null) {
            C1365a.m36190l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC7476d abstractC7476d = this.f17696c;
        abstractC7476d.f17713H = true;
        if (abstractC7476d.f17711F != colorStateList) {
            abstractC7476d.f17711F = colorStateList;
            C1365a.m36187o(this.f17698e, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC7476d abstractC7476d = this.f17696c;
        abstractC7476d.f17714I = true;
        if (abstractC7476d.f17712G != mode) {
            abstractC7476d.f17712G = mode;
            C1365a.m36186p(this.f17698e, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f17699f;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f17698e;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f17698e || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
