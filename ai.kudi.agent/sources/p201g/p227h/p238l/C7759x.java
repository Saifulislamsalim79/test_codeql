package p201g.p227h.p238l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p201g.p227h.C7601c;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p227h.p238l.p239h0.InterfaceC7725f;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ViewCompat.java */
/* renamed from: g.h.l.x */
/* loaded from: classes2.dex */
public class C7759x {

    /* renamed from: b */
    private static Field f18513b;

    /* renamed from: c */
    private static boolean f18514c;

    /* renamed from: d */
    private static Field f18515d;

    /* renamed from: e */
    private static boolean f18516e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f18517f;

    /* renamed from: h */
    private static Field f18519h;

    /* renamed from: j */
    private static ThreadLocal<Rect> f18521j;

    /* renamed from: a */
    private static final AtomicInteger f18512a = new AtomicInteger(1);

    /* renamed from: g */
    private static WeakHashMap<View, C7687c0> f18518g = null;

    /* renamed from: i */
    private static boolean f18520i = false;

    /* renamed from: k */
    private static final int[] f18522k = {C7601c.accessibility_custom_action_0, C7601c.accessibility_custom_action_1, C7601c.accessibility_custom_action_2, C7601c.accessibility_custom_action_3, C7601c.accessibility_custom_action_4, C7601c.accessibility_custom_action_5, C7601c.accessibility_custom_action_6, C7601c.accessibility_custom_action_7, C7601c.accessibility_custom_action_8, C7601c.accessibility_custom_action_9, C7601c.accessibility_custom_action_10, C7601c.accessibility_custom_action_11, C7601c.accessibility_custom_action_12, C7601c.accessibility_custom_action_13, C7601c.accessibility_custom_action_14, C7601c.accessibility_custom_action_15, C7601c.accessibility_custom_action_16, C7601c.accessibility_custom_action_17, C7601c.accessibility_custom_action_18, C7601c.accessibility_custom_action_19, C7601c.accessibility_custom_action_20, C7601c.accessibility_custom_action_21, C7601c.accessibility_custom_action_22, C7601c.accessibility_custom_action_23, C7601c.accessibility_custom_action_24, C7601c.accessibility_custom_action_25, C7601c.accessibility_custom_action_26, C7601c.accessibility_custom_action_27, C7601c.accessibility_custom_action_28, C7601c.accessibility_custom_action_29, C7601c.accessibility_custom_action_30, C7601c.accessibility_custom_action_31};

    /* renamed from: l */
    private static final InterfaceC7754s f18523l = new C7760a();

    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$a */
    /* loaded from: classes2.dex */
    class C7760a implements InterfaceC7754s {
        C7760a() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7754s
        /* renamed from: a */
        public C7685c mo17477a(C7685c c7685c) {
            return c7685c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$b */
    /* loaded from: classes2.dex */
    public class C7761b extends AbstractC7766g<Boolean> {
        C7761b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: i */
        public Boolean mo17459d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: j */
        public void mo17458e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: k */
        public boolean mo17455h(Boolean bool, Boolean bool2) {
            return !m17462a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$c */
    /* loaded from: classes2.dex */
    public class C7762c extends AbstractC7766g<CharSequence> {
        C7762c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: i */
        public CharSequence mo17459d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: j */
        public void mo17458e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: k */
        public boolean mo17455h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$d */
    /* loaded from: classes2.dex */
    public class C7763d extends AbstractC7766g<CharSequence> {
        C7763d(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: i */
        public CharSequence mo17459d(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: j */
        public void mo17458e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: k */
        public boolean mo17455h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$e */
    /* loaded from: classes2.dex */
    public class C7764e extends AbstractC7766g<Boolean> {
        C7764e(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: i */
        public Boolean mo17459d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: j */
        public void mo17458e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p201g.p227h.p238l.C7759x.AbstractC7766g
        /* renamed from: k */
        public boolean mo17455h(Boolean bool, Boolean bool2) {
            return !m17462a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$f */
    /* loaded from: classes2.dex */
    static class ViewTreeObserver$OnGlobalLayoutListenerC7765f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: c */
        private WeakHashMap<View, Boolean> f18524c = new WeakHashMap<>();

        ViewTreeObserver$OnGlobalLayoutListenerC7765f() {
        }

        /* renamed from: a */
        private void m17464a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                C7759x.m17531Y(view, z2 ? 16 : 32);
                this.f18524c.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m17463b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f18524c.entrySet()) {
                    m17464a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m17463b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7766g<T> {

        /* renamed from: a */
        private final int f18525a;

        /* renamed from: b */
        private final Class<T> f18526b;

        /* renamed from: c */
        private final int f18527c;

        /* renamed from: d */
        private final int f18528d;

        AbstractC7766g(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m17461b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m17460c() {
            return Build.VERSION.SDK_INT >= this.f18527c;
        }

        /* renamed from: a */
        boolean m17462a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* renamed from: d */
        abstract T mo17459d(View view);

        /* renamed from: e */
        abstract void mo17458e(View view, T t);

        /* renamed from: f */
        T m17457f(View view) {
            if (m17460c()) {
                return mo17459d(view);
            }
            if (m17461b()) {
                T t = (T) view.getTag(this.f18525a);
                if (this.f18526b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        /* renamed from: g */
        void m17456g(View view, T t) {
            if (m17460c()) {
                mo17458e(view, t);
            } else if (m17461b() && mo17455h(m17457f(view), t)) {
                C7759x.m17555G(view);
                view.setTag(this.f18525a, t);
                C7759x.m17531Y(view, this.f18528d);
            }
        }

        /* renamed from: h */
        abstract boolean mo17455h(T t, T t2);

        AbstractC7766g(int i, Class<T> cls, int i2, int i3) {
            this.f18525a = i;
            this.f18526b = cls;
            this.f18528d = i2;
            this.f18527c = i3;
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$h */
    /* loaded from: classes2.dex */
    private static class C7767h {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewCompat.java */
        /* renamed from: g.h.l.x$h$a */
        /* loaded from: classes2.dex */
        public class View$OnApplyWindowInsetsListenerC7768a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C7698g0 f18529a = null;

            /* renamed from: b */
            final /* synthetic */ View f18530b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC7752q f18531c;

            View$OnApplyWindowInsetsListenerC7768a(View view, InterfaceC7752q interfaceC7752q) {
                this.f18530b = view;
                this.f18531c = interfaceC7752q;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C7698g0 m17770x = C7698g0.m17770x(windowInsets, view);
                if (Build.VERSION.SDK_INT < 30) {
                    C7767h.m17454a(windowInsets, this.f18530b);
                    if (m17770x.equals(this.f18529a)) {
                        return this.f18531c.mo17573a(view, m17770x).m17772v();
                    }
                }
                this.f18529a = m17770x;
                C7698g0 mo17573a = this.f18531c.mo17573a(view, m17770x);
                if (Build.VERSION.SDK_INT >= 30) {
                    return mo17573a.m17772v();
                }
                C7759x.m17504m0(view);
                return mo17573a.m17772v();
            }
        }

        /* renamed from: a */
        static void m17454a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C7601c.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C7698g0 m17453b(View view, C7698g0 c7698g0, Rect rect) {
            WindowInsets m17772v = c7698g0.m17772v();
            if (m17772v != null) {
                return C7698g0.m17770x(view.computeSystemWindowInsets(m17772v, rect), view);
            }
            rect.setEmpty();
            return c7698g0;
        }

        /* renamed from: c */
        public static C7698g0 m17452c(View view) {
            return C7698g0.C7699a.m17769a(view);
        }

        /* renamed from: d */
        static void m17451d(View view, InterfaceC7752q interfaceC7752q) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C7601c.tag_on_apply_window_listener, interfaceC7752q);
            }
            if (interfaceC7752q == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C7601c.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC7768a(view, interfaceC7752q));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$i */
    /* loaded from: classes2.dex */
    private static class C7769i {
        /* renamed from: a */
        public static C7698g0 m17450a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C7698g0 m17771w = C7698g0.m17771w(rootWindowInsets);
            m17771w.m17774t(m17771w);
            m17771w.m17790d(view.getRootView());
            return m17771w;
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$j */
    /* loaded from: classes2.dex */
    private static class C7770j {
        /* renamed from: a */
        static void m17449a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$k */
    /* loaded from: classes2.dex */
    public interface InterfaceC7771k {
        /* renamed from: a */
        boolean m17448a(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: g.h.l.x$l */
    /* loaded from: classes2.dex */
    static class C7772l {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f18532d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f18533a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f18534b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f18535c = null;

        C7772l() {
        }

        /* renamed from: a */
        static C7772l m17447a(View view) {
            C7772l c7772l = (C7772l) view.getTag(C7601c.tag_unhandled_key_event_manager);
            if (c7772l == null) {
                C7772l c7772l2 = new C7772l();
                view.setTag(C7601c.tag_unhandled_key_event_manager, c7772l2);
                return c7772l2;
            }
            return c7772l;
        }

        /* renamed from: c */
        private View m17445c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f18533a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m17445c = m17445c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m17445c != null) {
                            return m17445c;
                        }
                    }
                }
                if (m17443e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m17444d() {
            if (this.f18534b == null) {
                this.f18534b = new SparseArray<>();
            }
            return this.f18534b;
        }

        /* renamed from: e */
        private boolean m17443e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C7601c.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((InterfaceC7771k) arrayList.get(size)).m17448a(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: g */
        private void m17441g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f18533a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (f18532d.isEmpty()) {
                return;
            }
            synchronized (f18532d) {
                if (this.f18533a == null) {
                    this.f18533a = new WeakHashMap<>();
                }
                for (int size = f18532d.size() - 1; size >= 0; size--) {
                    View view = f18532d.get(size).get();
                    if (view == null) {
                        f18532d.remove(size);
                    } else {
                        this.f18533a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f18533a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        boolean m17446b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m17441g();
            }
            View m17445c = m17445c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m17445c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m17444d().put(keyCode, new WeakReference<>(m17445c));
                }
            }
            return m17445c != null;
        }

        /* renamed from: f */
        boolean m17442f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f18535c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f18535c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> m17444d = m17444d();
                if (keyEvent.getAction() == 1 && (indexOfKey = m17444d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = m17444d.valueAt(indexOfKey);
                    m17444d.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = m17444d.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && C7759x.m17536T(view)) {
                        m17443e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    static {
        new ViewTreeObserver$OnGlobalLayoutListenerC7765f();
    }

    /* renamed from: A */
    public static int m17567A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m17566A0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: B */
    public static int m17565B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: B0 */
    public static void m17564B0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof InterfaceC7746k) {
            ((InterfaceC7746k) view).setNestedScrollingEnabled(z);
        }
    }

    /* renamed from: C */
    public static int m17563C(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: C0 */
    public static void m17562C0(View view, InterfaceC7752q interfaceC7752q) {
        if (Build.VERSION.SDK_INT >= 21) {
            C7767h.m17451d(view, interfaceC7752q);
        }
    }

    /* renamed from: D */
    public static int m17561D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f18516e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f18515d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f18516e = true;
        }
        Field field = f18515d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: D0 */
    public static void m17560D0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: E */
    public static int m17559E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f18514c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f18513b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f18514c = true;
        }
        Field field = f18513b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: E0 */
    public static void m17558E0(View view, C7756u c7756u) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (c7756u != null ? c7756u.m17569a() : null));
        }
    }

    /* renamed from: F */
    public static String[] m17557F(View view) {
        return (String[]) view.getTag(C7601c.tag_on_receive_content_mime_types);
    }

    /* renamed from: F0 */
    public static void m17556F0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: G */
    static C7676a m17555G(View view) {
        C7676a m17507l = m17507l(view);
        if (m17507l == null) {
            m17507l = new C7676a();
        }
        m17498p0(view, m17507l);
        return m17507l;
    }

    /* renamed from: G0 */
    public static void m17554G0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            m17548J0().m17456g(view, charSequence);
        }
    }

    /* renamed from: H */
    public static int m17553H(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: H0 */
    public static void m17552H0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f18517f == null) {
            f18517f = new WeakHashMap<>();
        }
        f18517f.put(view, str);
    }

    /* renamed from: I */
    public static int m17551I(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: I0 */
    private static void m17550I0(View view) {
        if (m17567A(view) == 0) {
            m17478z0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m17567A((View) parent) == 4) {
                m17478z0(view, 2);
                return;
            }
        }
    }

    /* renamed from: J */
    public static ViewParent m17549J(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: J0 */
    private static AbstractC7766g<CharSequence> m17548J0() {
        return new C7763d(C7601c.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: K */
    public static C7698g0 m17547K(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C7769i.m17450a(view);
        }
        if (i >= 21) {
            return C7767h.m17452c(view);
        }
        return null;
    }

    /* renamed from: K0 */
    public static void m17546K0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof InterfaceC7746k) {
            ((InterfaceC7746k) view).stopNestedScroll();
        }
    }

    /* renamed from: L */
    public static final CharSequence m17545L(View view) {
        return m17548J0().m17457f(view);
    }

    /* renamed from: L0 */
    private static void m17544L0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: M */
    public static String m17543M(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f18517f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: N */
    public static int m17542N(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: O */
    public static float m17541O(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: P */
    public static boolean m17540P(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m17539Q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: R */
    public static boolean m17538R(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: S */
    public static boolean m17537S(View view) {
        Boolean m17457f = m17529a().m17457f(view);
        if (m17457f == null) {
            return false;
        }
        return m17457f.booleanValue();
    }

    /* renamed from: T */
    public static boolean m17536T(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: U */
    public static boolean m17535U(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: V */
    public static boolean m17534V(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC7746k) {
            return ((InterfaceC7746k) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m17533W(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: X */
    public static boolean m17532X(View view) {
        Boolean m17457f = m17500o0().m17457f(view);
        if (m17457f == null) {
            return false;
        }
        return m17457f.booleanValue();
    }

    /* renamed from: Y */
    static void m17531Y(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m17499p(view) != null && view.getVisibility() == 0;
            if (m17501o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : IjkMediaMeta.FF_PROFILE_H264_INTRA);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m17499p(view));
                    m17550I0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m17499p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: Z */
    public static void m17530Z(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect m17483x = m17483x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m17483x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m17483x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m17521e(view, i);
            if (z && m17483x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m17483x);
            }
        } else {
            m17521e(view, i);
        }
    }

    /* renamed from: a */
    private static AbstractC7766g<Boolean> m17529a() {
        return new C7764e(C7601c.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static void m17528a0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect m17483x = m17483x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m17483x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m17483x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m17519f(view, i);
            if (z && m17483x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m17483x);
            }
        } else {
            m17519f(view, i);
        }
    }

    /* renamed from: b */
    public static int m17527b(View view, CharSequence charSequence, InterfaceC7725f interfaceC7725f) {
        int m17495r = m17495r(view, charSequence);
        if (m17495r != -1) {
            m17525c(view, new C7716c.C7717a(m17495r, charSequence, interfaceC7725f));
        }
        return m17495r;
    }

    /* renamed from: b0 */
    public static C7698g0 m17526b0(View view, C7698g0 c7698g0) {
        WindowInsets m17772v;
        if (Build.VERSION.SDK_INT >= 21 && (m17772v = c7698g0.m17772v()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(m17772v);
            if (!onApplyWindowInsets.equals(m17772v)) {
                return C7698g0.m17770x(onApplyWindowInsets, view);
            }
        }
        return c7698g0;
    }

    /* renamed from: c */
    private static void m17525c(View view, C7716c.C7717a c7717a) {
        if (Build.VERSION.SDK_INT >= 21) {
            m17555G(view);
            m17508k0(c7717a.m17641b(), view);
            m17497q(view).add(c7717a);
            m17531Y(view, 0);
        }
    }

    /* renamed from: c0 */
    public static void m17524c0(View view, C7716c c7716c) {
        view.onInitializeAccessibilityNodeInfo(c7716c.m17718D0());
    }

    /* renamed from: d */
    public static C7687c0 m17523d(View view) {
        if (f18518g == null) {
            f18518g = new WeakHashMap<>();
        }
        C7687c0 c7687c0 = f18518g.get(view);
        if (c7687c0 == null) {
            C7687c0 c7687c02 = new C7687c0(view);
            f18518g.put(view, c7687c02);
            return c7687c02;
        }
        return c7687c0;
    }

    /* renamed from: d0 */
    private static AbstractC7766g<CharSequence> m17522d0() {
        return new C7762c(C7601c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: e */
    private static void m17521e(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m17544L0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m17544L0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static boolean m17520e0(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: f */
    private static void m17519f(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m17544L0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m17544L0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static C7685c m17518f0(View view, C7685c c7685c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c7685c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        InterfaceC7753r interfaceC7753r = (InterfaceC7753r) view.getTag(C7601c.tag_on_receive_content_listener);
        if (interfaceC7753r != null) {
            C7685c mo17572a = interfaceC7753r.mo17572a(view, c7685c);
            if (mo17572a == null) {
                return null;
            }
            return m17481y(view).mo17477a(mo17572a);
        }
        return m17481y(view).mo17477a(c7685c);
    }

    /* renamed from: g */
    public static C7698g0 m17517g(View view, C7698g0 c7698g0, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C7767h.m17453b(view, c7698g0, rect) : c7698g0;
    }

    /* renamed from: g0 */
    public static void m17516g0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: h */
    public static C7698g0 m17515h(View view, C7698g0 c7698g0) {
        WindowInsets m17772v;
        if (Build.VERSION.SDK_INT >= 21 && (m17772v = c7698g0.m17772v()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(m17772v);
            if (!dispatchApplyWindowInsets.equals(m17772v)) {
                return C7698g0.m17770x(dispatchApplyWindowInsets, view);
            }
        }
        return c7698g0;
    }

    /* renamed from: h0 */
    public static void m17514h0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m17513i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C7772l.m17447a(view).m17446b(view, keyEvent);
    }

    /* renamed from: i0 */
    public static void m17512i0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m17511j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C7772l.m17447a(view).m17442f(keyEvent);
    }

    /* renamed from: j0 */
    public static void m17510j0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m17508k0(i, view);
            m17531Y(view, 0);
        }
    }

    /* renamed from: k */
    public static int m17509k() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f18512a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f18512a.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: k0 */
    private static void m17508k0(int i, View view) {
        List<C7716c.C7717a> m17497q = m17497q(view);
        for (int i2 = 0; i2 < m17497q.size(); i2++) {
            if (m17497q.get(i2).m17641b() == i) {
                m17497q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: l */
    public static C7676a m17507l(View view) {
        View.AccessibilityDelegate m17505m = m17505m(view);
        if (m17505m == null) {
            return null;
        }
        if (m17505m instanceof C7676a.C7677a) {
            return ((C7676a.C7677a) m17505m).f18401a;
        }
        return new C7676a(m17505m);
    }

    /* renamed from: l0 */
    public static void m17506l0(View view, C7716c.C7717a c7717a, CharSequence charSequence, InterfaceC7725f interfaceC7725f) {
        if (interfaceC7725f == null && charSequence == null) {
            m17510j0(view, c7717a.m17641b());
        } else {
            m17525c(view, c7717a.m17642a(charSequence, interfaceC7725f));
        }
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m17505m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return m17503n(view);
    }

    /* renamed from: m0 */
    public static void m17504m0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: n */
    private static View.AccessibilityDelegate m17503n(View view) {
        if (f18520i) {
            return null;
        }
        if (f18519h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f18519h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f18520i = true;
                return null;
            }
        }
        try {
            Object obj = f18519h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f18520i = true;
            return null;
        }
    }

    /* renamed from: n0 */
    public static void m17502n0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C7770j.m17449a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: o */
    public static int m17501o(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: o0 */
    private static AbstractC7766g<Boolean> m17500o0() {
        return new C7761b(C7601c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: p */
    public static CharSequence m17499p(View view) {
        return m17522d0().m17457f(view);
    }

    /* renamed from: p0 */
    public static void m17498p0(View view, C7676a c7676a) {
        if (c7676a == null && (m17505m(view) instanceof C7676a.C7677a)) {
            c7676a = new C7676a();
        }
        view.setAccessibilityDelegate(c7676a == null ? null : c7676a.m17862d());
    }

    /* renamed from: q */
    private static List<C7716c.C7717a> m17497q(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C7601c.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(C7601c.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: q0 */
    public static void m17496q0(View view, boolean z) {
        m17529a().m17456g(view, Boolean.valueOf(z));
    }

    /* renamed from: r */
    private static int m17495r(View view, CharSequence charSequence) {
        List<C7716c.C7717a> m17497q = m17497q(view);
        for (int i = 0; i < m17497q.size(); i++) {
            if (TextUtils.equals(charSequence, m17497q.get(i).m17640c())) {
                return m17497q.get(i).m17641b();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = f18522k;
            if (i2 >= iArr.length || i3 != -1) {
                break;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < m17497q.size(); i5++) {
                z &= m17497q.get(i5).m17641b() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: r0 */
    public static void m17494r0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: s */
    public static ColorStateList m17493s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC7758w) {
            return ((InterfaceC7758w) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m17492s0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: t */
    public static PorterDuff.Mode m17491t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof InterfaceC7758w) {
            return ((InterfaceC7758w) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: t0 */
    public static void m17490t0(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        } else if (view instanceof InterfaceC7758w) {
            ((InterfaceC7758w) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: u */
    public static Rect m17489u(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: u0 */
    public static void m17488u0(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        } else if (view instanceof InterfaceC7758w) {
            ((InterfaceC7758w) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: v */
    public static Display m17487v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m17536T(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: v0 */
    public static void m17486v0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: w */
    public static float m17485w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: w0 */
    public static void m17484w0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: x */
    private static Rect m17483x() {
        if (f18521j == null) {
            f18521j = new ThreadLocal<>();
        }
        Rect rect = f18521j.get();
        if (rect == null) {
            rect = new Rect();
            f18521j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    @Deprecated
    /* renamed from: x0 */
    public static void m17482x0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: y */
    private static InterfaceC7754s m17481y(View view) {
        if (view instanceof InterfaceC7754s) {
            return (InterfaceC7754s) view;
        }
        return f18523l;
    }

    /* renamed from: y0 */
    public static void m17480y0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: z */
    public static boolean m17479z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: z0 */
    public static void m17478z0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }
}
