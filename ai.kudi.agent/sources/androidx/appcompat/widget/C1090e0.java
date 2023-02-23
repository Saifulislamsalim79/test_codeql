package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC1019p;
import androidx.core.widget.C1397h;
import java.lang.reflect.Method;
import p201g.p202a.C7452a;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.e0 */
/* loaded from: classes2.dex */
public class C1090e0 implements InterfaceC1019p {

    /* renamed from: X */
    private static Method f3302X;

    /* renamed from: Y */
    private static Method f3303Y;

    /* renamed from: Z */
    private static Method f3304Z;

    /* renamed from: A */
    private boolean f3305A;

    /* renamed from: B */
    private boolean f3306B;

    /* renamed from: C */
    private boolean f3307C;

    /* renamed from: D */
    private int f3308D;

    /* renamed from: E */
    private boolean f3309E;

    /* renamed from: F */
    private boolean f3310F;

    /* renamed from: G */
    int f3311G;

    /* renamed from: H */
    private View f3312H;

    /* renamed from: I */
    private int f3313I;

    /* renamed from: J */
    private DataSetObserver f3314J;

    /* renamed from: K */
    private View f3315K;

    /* renamed from: L */
    private Drawable f3316L;

    /* renamed from: M */
    private AdapterView.OnItemClickListener f3317M;

    /* renamed from: N */
    private AdapterView.OnItemSelectedListener f3318N;

    /* renamed from: O */
    final RunnableC1096f f3319O;

    /* renamed from: P */
    private final View$OnTouchListenerC1095e f3320P;

    /* renamed from: Q */
    private final C1094d f3321Q;

    /* renamed from: R */
    private final RunnableC1092b f3322R;

    /* renamed from: S */
    final Handler f3323S;

    /* renamed from: T */
    private final Rect f3324T;

    /* renamed from: U */
    private Rect f3325U;

    /* renamed from: V */
    private boolean f3326V;

    /* renamed from: W */
    PopupWindow f3327W;

    /* renamed from: c */
    private Context f3328c;

    /* renamed from: d */
    private ListAdapter f3329d;

    /* renamed from: e */
    C1070b0 f3330e;

    /* renamed from: f */
    private int f3331f;

    /* renamed from: w */
    private int f3332w;

    /* renamed from: x */
    private int f3333x;

    /* renamed from: y */
    private int f3334y;

    /* renamed from: z */
    private int f3335z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.e0$a */
    /* loaded from: classes2.dex */
    public class C1091a implements AdapterView.OnItemSelectedListener {
        C1091a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C1070b0 c1070b0;
            if (i == -1 || (c1070b0 = C1090e0.this.f3330e) == null) {
                return;
            }
            c1070b0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.e0$b */
    /* loaded from: classes2.dex */
    public class RunnableC1092b implements Runnable {
        RunnableC1092b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1090e0.this.m37186r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.e0$c */
    /* loaded from: classes2.dex */
    public class C1093c extends DataSetObserver {
        C1093c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C1090e0.this.mo37195b()) {
                C1090e0.this.mo37194c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C1090e0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.e0$d */
    /* loaded from: classes2.dex */
    public class C1094d implements AbsListView.OnScrollListener {
        C1094d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C1090e0.this.m37213A() || C1090e0.this.f3327W.getContentView() == null) {
                return;
            }
            C1090e0 c1090e0 = C1090e0.this;
            c1090e0.f3323S.removeCallbacks(c1090e0.f3319O);
            C1090e0.this.f3319O.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.e0$e */
    /* loaded from: classes2.dex */
    public class View$OnTouchListenerC1095e implements View.OnTouchListener {
        View$OnTouchListenerC1095e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C1090e0.this.f3327W) != null && popupWindow.isShowing() && x >= 0 && x < C1090e0.this.f3327W.getWidth() && y >= 0 && y < C1090e0.this.f3327W.getHeight()) {
                C1090e0 c1090e0 = C1090e0.this;
                c1090e0.f3323S.postDelayed(c1090e0.f3319O, 250L);
                return false;
            } else if (action == 1) {
                C1090e0 c1090e02 = C1090e0.this;
                c1090e02.f3323S.removeCallbacks(c1090e02.f3319O);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.e0$f */
    /* loaded from: classes2.dex */
    public class RunnableC1096f implements Runnable {
        RunnableC1096f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1070b0 c1070b0 = C1090e0.this.f3330e;
            if (c1070b0 == null || !C7759x.m17536T(c1070b0) || C1090e0.this.f3330e.getCount() <= C1090e0.this.f3330e.getChildCount()) {
                return;
            }
            int childCount = C1090e0.this.f3330e.getChildCount();
            C1090e0 c1090e0 = C1090e0.this;
            if (childCount <= c1090e0.f3311G) {
                c1090e0.f3327W.setInputMethodMode(2);
                C1090e0.this.mo37194c();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3302X = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3304Z = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f3303Y = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C1090e0(Context context) {
        this(context, null, C7452a.listPopupWindowStyle);
    }

    /* renamed from: C */
    private void m37211C() {
        View view = this.f3312H;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3312H);
            }
        }
    }

    /* renamed from: N */
    private void m37200N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3302X;
            if (method != null) {
                try {
                    method.invoke(this.f3327W, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.f3327W.setIsClippedToScreen(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    private int m37187q() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        if (this.f3330e == null) {
            Context context = this.f3328c;
            C1070b0 mo37172s = mo37172s(context, !this.f3326V);
            this.f3330e = mo37172s;
            Drawable drawable = this.f3316L;
            if (drawable != null) {
                mo37172s.setSelector(drawable);
            }
            this.f3330e.setAdapter(this.f3329d);
            this.f3330e.setOnItemClickListener(this.f3317M);
            this.f3330e.setFocusable(true);
            this.f3330e.setFocusableInTouchMode(true);
            this.f3330e.setOnItemSelectedListener(new C1091a());
            this.f3330e.setOnScrollListener(this.f3321Q);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3318N;
            if (onItemSelectedListener != null) {
                this.f3330e.setOnItemSelectedListener(onItemSelectedListener);
            }
            C1070b0 c1070b0 = this.f3330e;
            View view = this.f3312H;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.f3313I;
                if (i4 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(c1070b0, layoutParams);
                } else if (i4 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f3313I);
                } else {
                    linearLayout.addView(c1070b0, layoutParams);
                    linearLayout.addView(view);
                }
                int i5 = this.f3332w;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                c1070b0 = linearLayout;
            } else {
                i = 0;
            }
            this.f3327W.setContentView(c1070b0);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f3327W.getContentView();
            View view2 = this.f3312H;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f3327W.getBackground();
        if (background != null) {
            background.getPadding(this.f3324T);
            Rect rect = this.f3324T;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f3305A) {
                this.f3334y = -i6;
            }
        } else {
            this.f3324T.setEmpty();
            i2 = 0;
        }
        int m37184u = m37184u(m37185t(), this.f3334y, this.f3327W.getInputMethodMode() == 2);
        if (this.f3309E || this.f3331f == -1) {
            return m37184u + i2;
        }
        int i7 = this.f3332w;
        if (i7 == -2) {
            int i8 = this.f3328c.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f3324T;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.f3328c.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f3324T;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int m37277d = this.f3330e.m37277d(makeMeasureSpec, 0, -1, m37184u - i, -1);
        if (m37277d > 0) {
            i += i2 + this.f3330e.getPaddingTop() + this.f3330e.getPaddingBottom();
        }
        return m37277d + i;
    }

    /* renamed from: u */
    private int m37184u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f3303Y;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.f3327W, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.f3327W.getMaxAvailableHeight(view, i);
        }
        return this.f3327W.getMaxAvailableHeight(view, i, z);
    }

    /* renamed from: A */
    public boolean m37213A() {
        return this.f3327W.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean m37212B() {
        return this.f3326V;
    }

    /* renamed from: D */
    public void m37210D(View view) {
        this.f3315K = view;
    }

    /* renamed from: E */
    public void m37209E(int i) {
        this.f3327W.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void m37208F(int i) {
        Drawable background = this.f3327W.getBackground();
        if (background != null) {
            background.getPadding(this.f3324T);
            Rect rect = this.f3324T;
            this.f3332w = rect.left + rect.right + i;
            return;
        }
        m37197Q(i);
    }

    /* renamed from: G */
    public void m37207G(int i) {
        this.f3308D = i;
    }

    /* renamed from: H */
    public void m37206H(Rect rect) {
        this.f3325U = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void m37205I(int i) {
        this.f3327W.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void m37204J(boolean z) {
        this.f3326V = z;
        this.f3327W.setFocusable(z);
    }

    /* renamed from: K */
    public void m37203K(PopupWindow.OnDismissListener onDismissListener) {
        this.f3327W.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void m37202L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f3317M = onItemClickListener;
    }

    /* renamed from: M */
    public void m37201M(boolean z) {
        this.f3307C = true;
        this.f3306B = z;
    }

    /* renamed from: O */
    public void m37199O(int i) {
        this.f3313I = i;
    }

    /* renamed from: P */
    public void m37198P(int i) {
        C1070b0 c1070b0 = this.f3330e;
        if (!mo37195b() || c1070b0 == null) {
            return;
        }
        c1070b0.setListSelectionHidden(false);
        c1070b0.setSelection(i);
        if (c1070b0.getChoiceMode() != 0) {
            c1070b0.setItemChecked(i, true);
        }
    }

    /* renamed from: Q */
    public void m37197Q(int i) {
        this.f3332w = i;
    }

    /* renamed from: a */
    public void m37196a(Drawable drawable) {
        this.f3327W.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    /* renamed from: b */
    public boolean mo37195b() {
        return this.f3327W.isShowing();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    /* renamed from: c */
    public void mo37194c() {
        int m37187q = m37187q();
        boolean m37213A = m37213A();
        C1397h.m36107b(this.f3327W, this.f3335z);
        boolean z = true;
        if (this.f3327W.isShowing()) {
            if (C7759x.m17536T(m37185t())) {
                int i = this.f3332w;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = m37185t().getWidth();
                }
                int i2 = this.f3331f;
                if (i2 == -1) {
                    if (!m37213A) {
                        m37187q = -1;
                    }
                    if (m37213A) {
                        this.f3327W.setWidth(this.f3332w == -1 ? -1 : 0);
                        this.f3327W.setHeight(0);
                    } else {
                        this.f3327W.setWidth(this.f3332w == -1 ? -1 : 0);
                        this.f3327W.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    m37187q = i2;
                }
                this.f3327W.setOutsideTouchable((this.f3310F || this.f3309E) ? false : false);
                this.f3327W.update(m37185t(), this.f3333x, this.f3334y, i < 0 ? -1 : i, m37187q < 0 ? -1 : m37187q);
                return;
            }
            return;
        }
        int i3 = this.f3332w;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = m37185t().getWidth();
        }
        int i4 = this.f3331f;
        if (i4 == -1) {
            m37187q = -1;
        } else if (i4 != -2) {
            m37187q = i4;
        }
        this.f3327W.setWidth(i3);
        this.f3327W.setHeight(m37187q);
        m37200N(true);
        this.f3327W.setOutsideTouchable((this.f3310F || this.f3309E) ? false : true);
        this.f3327W.setTouchInterceptor(this.f3320P);
        if (this.f3307C) {
            C1397h.m36108a(this.f3327W, this.f3306B);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3304Z;
            if (method != null) {
                try {
                    method.invoke(this.f3327W, this.f3325U);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.f3327W.setEpicenterBounds(this.f3325U);
        }
        C1397h.m36106c(this.f3327W, m37185t(), this.f3333x, this.f3334y, this.f3308D);
        this.f3330e.setSelection(-1);
        if (!this.f3326V || this.f3330e.isInTouchMode()) {
            m37186r();
        }
        if (this.f3326V) {
            return;
        }
        this.f3323S.post(this.f3322R);
    }

    /* renamed from: d */
    public int m37193d() {
        return this.f3333x;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    public void dismiss() {
        this.f3327W.dismiss();
        m37211C();
        this.f3327W.setContentView(null);
        this.f3330e = null;
        this.f3323S.removeCallbacks(this.f3319O);
    }

    /* renamed from: f */
    public void m37192f(int i) {
        this.f3333x = i;
    }

    /* renamed from: i */
    public Drawable m37191i() {
        return this.f3327W.getBackground();
    }

    /* renamed from: k */
    public void m37190k(int i) {
        this.f3334y = i;
        this.f3305A = true;
    }

    /* renamed from: n */
    public int m37189n() {
        if (this.f3305A) {
            return this.f3334y;
        }
        return 0;
    }

    /* renamed from: o */
    public void mo36987o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f3314J;
        if (dataSetObserver == null) {
            this.f3314J = new C1093c();
        } else {
            ListAdapter listAdapter2 = this.f3329d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3329d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3314J);
        }
        C1070b0 c1070b0 = this.f3330e;
        if (c1070b0 != null) {
            c1070b0.setAdapter(this.f3329d);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1019p
    /* renamed from: p */
    public ListView mo37188p() {
        return this.f3330e;
    }

    /* renamed from: r */
    public void m37186r() {
        C1070b0 c1070b0 = this.f3330e;
        if (c1070b0 != null) {
            c1070b0.setListSelectionHidden(true);
            c1070b0.requestLayout();
        }
    }

    /* renamed from: s */
    C1070b0 mo37172s(Context context, boolean z) {
        return new C1070b0(context, z);
    }

    /* renamed from: t */
    public View m37185t() {
        return this.f3315K;
    }

    /* renamed from: v */
    public Object m37183v() {
        if (mo37195b()) {
            return this.f3330e.getSelectedItem();
        }
        return null;
    }

    /* renamed from: w */
    public long m37182w() {
        if (mo37195b()) {
            return this.f3330e.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: x */
    public int m37181x() {
        if (mo37195b()) {
            return this.f3330e.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: y */
    public View m37180y() {
        if (mo37195b()) {
            return this.f3330e.getSelectedView();
        }
        return null;
    }

    /* renamed from: z */
    public int m37179z() {
        return this.f3332w;
    }

    public C1090e0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C1090e0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3331f = -2;
        this.f3332w = -2;
        this.f3335z = 1002;
        this.f3308D = 0;
        this.f3309E = false;
        this.f3310F = false;
        this.f3311G = Integer.MAX_VALUE;
        this.f3313I = 0;
        this.f3319O = new RunnableC1096f();
        this.f3320P = new View$OnTouchListenerC1095e();
        this.f3321Q = new C1094d();
        this.f3322R = new RunnableC1092b();
        this.f3324T = new Rect();
        this.f3328c = context;
        this.f3323S = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7461j.ListPopupWindow, i, i2);
        this.f3333x = obtainStyledAttributes.getDimensionPixelOffset(C7461j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C7461j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f3334y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3305A = true;
        }
        obtainStyledAttributes.recycle();
        C1125m c1125m = new C1125m(context, attributeSet, i, i2);
        this.f3327W = c1125m;
        c1125m.setInputMethodMode(1);
    }
}
