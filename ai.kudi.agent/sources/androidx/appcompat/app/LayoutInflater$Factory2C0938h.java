package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.C0929b;
import androidx.appcompat.view.menu.C0996e;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1111i;
import androidx.appcompat.widget.C1138r0;
import androidx.appcompat.widget.C1168w0;
import androidx.appcompat.widget.C1170x0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC1083c0;
import androidx.appcompat.widget.InterfaceC1171y;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C1312i;
import androidx.core.content.C1335a;
import androidx.core.content.p057e.C1355f;
import androidx.lifecycle.AbstractC1565i;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p201g.p202a.C7452a;
import p201g.p202a.C7454c;
import p201g.p202a.C7457f;
import p201g.p202a.C7458g;
import p201g.p202a.C7460i;
import p201g.p202a.C7461j;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p202a.p209o.AbstractC7485b;
import p201g.p202a.p209o.C7488d;
import p201g.p202a.p209o.C7490f;
import p201g.p202a.p209o.C7492g;
import p201g.p202a.p209o.Window$CallbackC7497i;
import p201g.p218e.C7534g;
import p201g.p227h.p237k.C7670c;
import p201g.p227h.p238l.C7687c0;
import p201g.p227h.p238l.C7694e0;
import p201g.p227h.p238l.C7695f;
import p201g.p227h.p238l.C7697g;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7752q;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes2.dex */
public class LayoutInflater$Factory2C0938h extends g implements C0999g.InterfaceC1000a, LayoutInflater.Factory2 {

    /* renamed from: t0 */
    private static final C7534g<String, Integer> f2562t0 = new C7534g<>();

    /* renamed from: u0 */
    private static final boolean f2563u0;

    /* renamed from: v0 */
    private static final int[] f2564v0;

    /* renamed from: w0 */
    private static final boolean f2565w0;

    /* renamed from: x0 */
    private static final boolean f2566x0;

    /* renamed from: y0 */
    private static boolean f2567y0;

    /* renamed from: A */
    AbstractC0925a f2568A;

    /* renamed from: B */
    MenuInflater f2569B;

    /* renamed from: C */
    private CharSequence f2570C;

    /* renamed from: D */
    private InterfaceC1171y f2571D;

    /* renamed from: E */
    private C0948i f2572E;

    /* renamed from: F */
    private C0963v f2573F;

    /* renamed from: G */
    AbstractC7485b f2574G;

    /* renamed from: H */
    ActionBarContextView f2575H;

    /* renamed from: I */
    PopupWindow f2576I;

    /* renamed from: J */
    Runnable f2577J;

    /* renamed from: K */
    C7687c0 f2578K;

    /* renamed from: L */
    private boolean f2579L;

    /* renamed from: M */
    private boolean f2580M;

    /* renamed from: N */
    ViewGroup f2581N;

    /* renamed from: O */
    private TextView f2582O;

    /* renamed from: P */
    private View f2583P;

    /* renamed from: Q */
    private boolean f2584Q;

    /* renamed from: R */
    private boolean f2585R;

    /* renamed from: S */
    boolean f2586S;

    /* renamed from: T */
    boolean f2587T;

    /* renamed from: U */
    boolean f2588U;

    /* renamed from: V */
    boolean f2589V;

    /* renamed from: W */
    boolean f2590W;

    /* renamed from: X */
    private boolean f2591X;

    /* renamed from: Y */
    private C0962u[] f2592Y;

    /* renamed from: Z */
    private C0962u f2593Z;

    /* renamed from: a0 */
    private boolean f2594a0;

    /* renamed from: b0 */
    private boolean f2595b0;

    /* renamed from: c0 */
    private boolean f2596c0;

    /* renamed from: d0 */
    private boolean f2597d0;

    /* renamed from: e0 */
    boolean f2598e0;

    /* renamed from: f */
    final Object f2599f;

    /* renamed from: f0 */
    private int f2600f0;

    /* renamed from: g0 */
    private int f2601g0;

    /* renamed from: h0 */
    private boolean f2602h0;

    /* renamed from: i0 */
    private boolean f2603i0;

    /* renamed from: j0 */
    private AbstractC0957q f2604j0;

    /* renamed from: k0 */
    private AbstractC0957q f2605k0;

    /* renamed from: l0 */
    boolean f2606l0;

    /* renamed from: m0 */
    int f2607m0;

    /* renamed from: n0 */
    private final Runnable f2608n0;

    /* renamed from: o0 */
    private boolean f2609o0;

    /* renamed from: p0 */
    private Rect f2610p0;

    /* renamed from: q0 */
    private Rect f2611q0;

    /* renamed from: r0 */
    private C0967k f2612r0;

    /* renamed from: s0 */
    private C0969l f2613s0;

    /* renamed from: w */
    final Context f2614w;

    /* renamed from: x */
    Window f2615x;

    /* renamed from: y */
    private C0955o f2616y;

    /* renamed from: z */
    final f f2617z;

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$a */
    /* loaded from: classes2.dex */
    class C0939a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f2618a;

        C0939a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f2618a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m37699a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (m37699a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f2618a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f2618a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$b */
    /* loaded from: classes2.dex */
    class RunnableC0940b implements Runnable {
        RunnableC0940b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h = LayoutInflater$Factory2C0938h.this;
            if ((layoutInflater$Factory2C0938h.f2607m0 & 1) != 0) {
                layoutInflater$Factory2C0938h.m37744Y(0);
            }
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h2 = LayoutInflater$Factory2C0938h.this;
            if ((layoutInflater$Factory2C0938h2.f2607m0 & 4096) != 0) {
                layoutInflater$Factory2C0938h2.m37744Y(108);
            }
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h3 = LayoutInflater$Factory2C0938h.this;
            layoutInflater$Factory2C0938h3.f2606l0 = false;
            layoutInflater$Factory2C0938h3.f2607m0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$c */
    /* loaded from: classes2.dex */
    public class C0941c implements InterfaceC7752q {
        C0941c() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7752q
        /* renamed from: a */
        public C7698g0 mo17573a(View view, C7698g0 c7698g0) {
            int m17782l = c7698g0.m17782l();
            int m37755O0 = LayoutInflater$Factory2C0938h.this.m37755O0(c7698g0, null);
            if (m17782l != m37755O0) {
                c7698g0 = c7698g0.m17777q(c7698g0.m17784j(), m37755O0, c7698g0.m17783k(), c7698g0.m17785i());
            }
            return C7759x.m17526b0(view, c7698g0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$d */
    /* loaded from: classes2.dex */
    public class C0942d implements InterfaceC1083c0.InterfaceC1084a {
        C0942d() {
        }

        @Override // androidx.appcompat.widget.InterfaceC1083c0.InterfaceC1084a
        /* renamed from: a */
        public void mo37233a(Rect rect) {
            rect.top = LayoutInflater$Factory2C0938h.this.m37755O0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$e */
    /* loaded from: classes2.dex */
    public class C0943e implements ContentFrameLayout.InterfaceC1036a {
        C0943e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC1036a
        /* renamed from: a */
        public void mo37387a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC1036a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C0938h.this.m37746W();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$f */
    /* loaded from: classes2.dex */
    public class RunnableC0944f implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.h$f$a */
        /* loaded from: classes2.dex */
        class C0945a extends C7694e0 {
            C0945a() {
            }

            @Override // p201g.p227h.p238l.InterfaceC7692d0
            /* renamed from: b */
            public void mo17807b(View view) {
                LayoutInflater$Factory2C0938h.this.f2575H.setAlpha(1.0f);
                LayoutInflater$Factory2C0938h.this.f2578K.m17818f(null);
                LayoutInflater$Factory2C0938h.this.f2578K = null;
            }

            @Override // p201g.p227h.p238l.C7694e0, p201g.p227h.p238l.InterfaceC7692d0
            /* renamed from: c */
            public void mo17803c(View view) {
                LayoutInflater$Factory2C0938h.this.f2575H.setVisibility(0);
            }
        }

        RunnableC0944f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h = LayoutInflater$Factory2C0938h.this;
            layoutInflater$Factory2C0938h.f2576I.showAtLocation(layoutInflater$Factory2C0938h.f2575H, 55, 0, 0);
            LayoutInflater$Factory2C0938h.this.m37743Z();
            if (LayoutInflater$Factory2C0938h.this.m37769H0()) {
                LayoutInflater$Factory2C0938h.this.f2575H.setAlpha(0.0f);
                LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h2 = LayoutInflater$Factory2C0938h.this;
                C7687c0 m17523d = C7759x.m17523d(layoutInflater$Factory2C0938h2.f2575H);
                m17523d.m17823a(1.0f);
                layoutInflater$Factory2C0938h2.f2578K = m17523d;
                LayoutInflater$Factory2C0938h.this.f2578K.m17818f(new C0945a());
                return;
            }
            LayoutInflater$Factory2C0938h.this.f2575H.setAlpha(1.0f);
            LayoutInflater$Factory2C0938h.this.f2575H.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$g */
    /* loaded from: classes2.dex */
    public class C0946g extends C7694e0 {
        C0946g() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: b */
        public void mo17807b(View view) {
            LayoutInflater$Factory2C0938h.this.f2575H.setAlpha(1.0f);
            LayoutInflater$Factory2C0938h.this.f2578K.m17818f(null);
            LayoutInflater$Factory2C0938h.this.f2578K = null;
        }

        @Override // p201g.p227h.p238l.C7694e0, p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: c */
        public void mo17803c(View view) {
            LayoutInflater$Factory2C0938h.this.f2575H.setVisibility(0);
            LayoutInflater$Factory2C0938h.this.f2575H.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2C0938h.this.f2575H.getParent() instanceof View) {
                C7759x.m17504m0((View) LayoutInflater$Factory2C0938h.this.f2575H.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$h */
    /* loaded from: classes2.dex */
    private class C0947h implements C0929b.InterfaceC0931b {
        C0947h() {
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: a */
        public boolean mo37698a() {
            AbstractC0925a m37723n = LayoutInflater$Factory2C0938h.this.m37723n();
            return (m37723n == null || (m37723n.mo37609j() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: b */
        public Context mo37697b() {
            return LayoutInflater$Factory2C0938h.this.m37737e0();
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: c */
        public void mo37696c(Drawable drawable, int i) {
            AbstractC0925a m37723n = LayoutInflater$Factory2C0938h.this.m37723n();
            if (m37723n != null) {
                m37723n.mo37633A(drawable);
                m37723n.mo37598y(i);
            }
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: d */
        public Drawable mo37695d() {
            C1138r0 m37027u = C1138r0.m37027u(mo37697b(), null, new int[]{C7452a.homeAsUpIndicator});
            Drawable m37041g = m37027u.m37041g(0);
            m37027u.m37025w();
            return m37041g;
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: e */
        public void mo37694e(int i) {
            AbstractC0925a m37723n = LayoutInflater$Factory2C0938h.this.m37723n();
            if (m37723n != null) {
                m37723n.mo37598y(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$i */
    /* loaded from: classes2.dex */
    public final class C0948i implements InterfaceC1014m.InterfaceC1015a {
        C0948i() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: a */
        public void mo37237a(C0999g c0999g, boolean z) {
            LayoutInflater$Factory2C0938h.this.m37754P(c0999g);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: b */
        public boolean mo37236b(C0999g c0999g) {
            Window.Callback m37730j0 = LayoutInflater$Factory2C0938h.this.m37730j0();
            if (m37730j0 != null) {
                m37730j0.onMenuOpened(108, c0999g);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$j */
    /* loaded from: classes2.dex */
    public class C0949j implements AbstractC7485b.InterfaceC7486a {

        /* renamed from: a */
        private AbstractC7485b.InterfaceC7486a f2628a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.h$j$a */
        /* loaded from: classes2.dex */
        class C0950a extends C7694e0 {
            C0950a() {
            }

            @Override // p201g.p227h.p238l.InterfaceC7692d0
            /* renamed from: b */
            public void mo17807b(View view) {
                LayoutInflater$Factory2C0938h.this.f2575H.setVisibility(8);
                LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h = LayoutInflater$Factory2C0938h.this;
                PopupWindow popupWindow = layoutInflater$Factory2C0938h.f2576I;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C0938h.f2575H.getParent() instanceof View) {
                    C7759x.m17504m0((View) LayoutInflater$Factory2C0938h.this.f2575H.getParent());
                }
                LayoutInflater$Factory2C0938h.this.f2575H.m37432k();
                LayoutInflater$Factory2C0938h.this.f2578K.m17818f(null);
                LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h2 = LayoutInflater$Factory2C0938h.this;
                layoutInflater$Factory2C0938h2.f2578K = null;
                C7759x.m17504m0(layoutInflater$Factory2C0938h2.f2581N);
            }
        }

        public C0949j(AbstractC7485b.InterfaceC7486a interfaceC7486a) {
            this.f2628a = interfaceC7486a;
        }

        @Override // p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a
        /* renamed from: a */
        public void mo18576a(AbstractC7485b abstractC7485b) {
            this.f2628a.mo18576a(abstractC7485b);
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h = LayoutInflater$Factory2C0938h.this;
            if (layoutInflater$Factory2C0938h.f2576I != null) {
                layoutInflater$Factory2C0938h.f2615x.getDecorView().removeCallbacks(LayoutInflater$Factory2C0938h.this.f2577J);
            }
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h2 = LayoutInflater$Factory2C0938h.this;
            if (layoutInflater$Factory2C0938h2.f2575H != null) {
                layoutInflater$Factory2C0938h2.m37743Z();
                LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h3 = LayoutInflater$Factory2C0938h.this;
                C7687c0 m17523d = C7759x.m17523d(layoutInflater$Factory2C0938h3.f2575H);
                m17523d.m17823a(0.0f);
                layoutInflater$Factory2C0938h3.f2578K = m17523d;
                LayoutInflater$Factory2C0938h.this.f2578K.m17818f(new C0950a());
            }
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h4 = LayoutInflater$Factory2C0938h.this;
            f fVar = layoutInflater$Factory2C0938h4.f2617z;
            if (fVar != null) {
                fVar.onSupportActionModeFinished(layoutInflater$Factory2C0938h4.f2574G);
            }
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h5 = LayoutInflater$Factory2C0938h.this;
            layoutInflater$Factory2C0938h5.f2574G = null;
            C7759x.m17504m0(layoutInflater$Factory2C0938h5.f2581N);
        }

        @Override // p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a
        /* renamed from: b */
        public boolean mo18575b(AbstractC7485b abstractC7485b, Menu menu) {
            return this.f2628a.mo18575b(abstractC7485b, menu);
        }

        @Override // p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a
        /* renamed from: c */
        public boolean mo18574c(AbstractC7485b abstractC7485b, Menu menu) {
            C7759x.m17504m0(LayoutInflater$Factory2C0938h.this.f2581N);
            return this.f2628a.mo18574c(abstractC7485b, menu);
        }

        @Override // p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a
        /* renamed from: d */
        public boolean mo18573d(AbstractC7485b abstractC7485b, MenuItem menuItem) {
            return this.f2628a.mo18573d(abstractC7485b, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$k */
    /* loaded from: classes2.dex */
    public static class C0951k {
        /* renamed from: a */
        static Context m37693a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m37692b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$l */
    /* loaded from: classes2.dex */
    static class C0952l {
        /* renamed from: a */
        static boolean m37691a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$m */
    /* loaded from: classes2.dex */
    public static class C0953m {
        /* renamed from: a */
        static void m37690a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$n */
    /* loaded from: classes2.dex */
    public static class C0954n {
        /* renamed from: a */
        static void m37689a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$p */
    /* loaded from: classes2.dex */
    public class C0956p extends AbstractC0957q {

        /* renamed from: c */
        private final PowerManager f2632c;

        C0956p(Context context) {
            super();
            this.f2632c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0938h.AbstractC0957q
        /* renamed from: b */
        IntentFilter mo37685b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0938h.AbstractC0957q
        /* renamed from: c */
        public int mo37684c() {
            return (Build.VERSION.SDK_INT < 21 || !C0952l.m37691a(this.f2632c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0938h.AbstractC0957q
        /* renamed from: d */
        public void mo37683d() {
            LayoutInflater$Factory2C0938h.this.m37766J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$q */
    /* loaded from: classes2.dex */
    public abstract class AbstractC0957q {

        /* renamed from: a */
        private BroadcastReceiver f2634a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.h$q$a */
        /* loaded from: classes2.dex */
        public class C0958a extends BroadcastReceiver {
            C0958a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC0957q.this.mo37683d();
            }
        }

        AbstractC0957q() {
        }

        /* renamed from: a */
        void m37687a() {
            BroadcastReceiver broadcastReceiver = this.f2634a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C0938h.this.f2614w.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2634a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo37685b();

        /* renamed from: c */
        abstract int mo37684c();

        /* renamed from: d */
        abstract void mo37683d();

        /* renamed from: e */
        void m37686e() {
            m37687a();
            IntentFilter mo37685b = mo37685b();
            if (mo37685b == null || mo37685b.countActions() == 0) {
                return;
            }
            if (this.f2634a == null) {
                this.f2634a = new C0958a();
            }
            LayoutInflater$Factory2C0938h.this.f2614w.registerReceiver(this.f2634a, mo37685b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$r */
    /* loaded from: classes2.dex */
    public class C0959r extends AbstractC0957q {

        /* renamed from: c */
        private final C0978p f2637c;

        C0959r(C0978p c0978p) {
            super();
            this.f2637c = c0978p;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0938h.AbstractC0957q
        /* renamed from: b */
        IntentFilter mo37685b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0938h.AbstractC0957q
        /* renamed from: c */
        public int mo37684c() {
            return this.f2637c.m37636d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0938h.AbstractC0957q
        /* renamed from: d */
        public void mo37683d() {
            LayoutInflater$Factory2C0938h.this.m37766J();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$s */
    /* loaded from: classes2.dex */
    private static class C0960s {
        /* renamed from: a */
        static void m37682a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$t */
    /* loaded from: classes2.dex */
    public class C0961t extends ContentFrameLayout {
        public C0961t(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m37681c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0938h.this.m37745X(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m37681c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflater$Factory2C0938h.this.m37751R(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C7462a.m18690d(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$u */
    /* loaded from: classes2.dex */
    public static final class C0962u {

        /* renamed from: a */
        int f2640a;

        /* renamed from: b */
        int f2641b;

        /* renamed from: c */
        int f2642c;

        /* renamed from: d */
        int f2643d;

        /* renamed from: e */
        int f2644e;

        /* renamed from: f */
        int f2645f;

        /* renamed from: g */
        ViewGroup f2646g;

        /* renamed from: h */
        View f2647h;

        /* renamed from: i */
        View f2648i;

        /* renamed from: j */
        C0999g f2649j;

        /* renamed from: k */
        C0996e f2650k;

        /* renamed from: l */
        Context f2651l;

        /* renamed from: m */
        boolean f2652m;

        /* renamed from: n */
        boolean f2653n;

        /* renamed from: o */
        boolean f2654o;

        /* renamed from: p */
        public boolean f2655p;

        /* renamed from: q */
        boolean f2656q = false;

        /* renamed from: r */
        boolean f2657r;

        /* renamed from: s */
        Bundle f2658s;

        C0962u(int i) {
            this.f2640a = i;
        }

        /* renamed from: a */
        InterfaceC1016n m37680a(InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
            if (this.f2649j == null) {
                return null;
            }
            if (this.f2650k == null) {
                C0996e c0996e = new C0996e(this.f2651l, C7458g.abc_list_menu_item_layout);
                this.f2650k = c0996e;
                c0996e.mo26754m(interfaceC1015a);
                this.f2649j.m37534b(this.f2650k);
            }
            return this.f2650k.m37564c(this.f2646g);
        }

        /* renamed from: b */
        public boolean m37679b() {
            if (this.f2647h == null) {
                return false;
            }
            return this.f2648i != null || this.f2650k.m37565b().getCount() > 0;
        }

        /* renamed from: c */
        void m37678c(C0999g c0999g) {
            C0996e c0996e;
            C0999g c0999g2 = this.f2649j;
            if (c0999g == c0999g2) {
                return;
            }
            if (c0999g2 != null) {
                c0999g2.m37544Q(this.f2650k);
            }
            this.f2649j = c0999g;
            if (c0999g == null || (c0996e = this.f2650k) == null) {
                return;
            }
            c0999g.m37534b(c0996e);
        }

        /* renamed from: d */
        void m37677d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C7452a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C7452a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C7460i.Theme_AppCompat_CompactMenu, true);
            }
            C7488d c7488d = new C7488d(context, 0);
            c7488d.getTheme().setTo(newTheme);
            this.f2651l = c7488d;
            TypedArray obtainStyledAttributes = c7488d.obtainStyledAttributes(C7461j.AppCompatTheme);
            this.f2641b = obtainStyledAttributes.getResourceId(C7461j.AppCompatTheme_panelBackground, 0);
            this.f2645f = obtainStyledAttributes.getResourceId(C7461j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$v */
    /* loaded from: classes2.dex */
    public final class C0963v implements InterfaceC1014m.InterfaceC1015a {
        C0963v() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: a */
        public void mo37237a(C0999g c0999g, boolean z) {
            C0999g mo37448F = c0999g.mo37448F();
            boolean z2 = mo37448F != c0999g;
            LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h = LayoutInflater$Factory2C0938h.this;
            if (z2) {
                c0999g = mo37448F;
            }
            C0962u m37740c0 = layoutInflater$Factory2C0938h.m37740c0(c0999g);
            if (m37740c0 != null) {
                if (z2) {
                    LayoutInflater$Factory2C0938h.this.m37756O(m37740c0.f2640a, m37740c0, mo37448F);
                    LayoutInflater$Factory2C0938h.this.m37750S(m37740c0, true);
                    return;
                }
                LayoutInflater$Factory2C0938h.this.m37750S(m37740c0, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: b */
        public boolean mo37236b(C0999g c0999g) {
            Window.Callback m37730j0;
            if (c0999g == c0999g.mo37448F()) {
                LayoutInflater$Factory2C0938h layoutInflater$Factory2C0938h = LayoutInflater$Factory2C0938h.this;
                if (!layoutInflater$Factory2C0938h.f2586S || (m37730j0 = layoutInflater$Factory2C0938h.m37730j0()) == null || LayoutInflater$Factory2C0938h.this.f2598e0) {
                    return true;
                }
                m37730j0.onMenuOpened(108, c0999g);
                return true;
            }
            return true;
        }
    }

    static {
        f2563u0 = Build.VERSION.SDK_INT < 21;
        f2564v0 = new int[]{16842836};
        f2565w0 = !"robolectric".equals(Build.FINGERPRINT);
        f2566x0 = Build.VERSION.SDK_INT >= 17;
        if (!f2563u0 || f2567y0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0939a(Thread.getDefaultUncaughtExceptionHandler()));
        f2567y0 = true;
    }

    LayoutInflater$Factory2C0938h(Activity activity, f fVar) {
        this(activity, null, fVar, activity);
    }

    /* renamed from: B0 */
    private void m37781B0(C0962u c0962u, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0962u.f2654o || this.f2598e0) {
            return;
        }
        if (c0962u.f2640a == 0) {
            if ((this.f2614w.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m37730j0 = m37730j0();
        if (m37730j0 != null && !m37730j0.onMenuOpened(c0962u.f2640a, c0962u.f2649j)) {
            m37750S(c0962u, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2614w.getSystemService("window");
        if (windowManager != null && m37775E0(c0962u, keyEvent)) {
            if (c0962u.f2646g != null && !c0962u.f2656q) {
                View view = c0962u.f2648i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    c0962u.f2653n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, c0962u.f2643d, c0962u.f2644e, 1002, 8519680, -3);
                    layoutParams2.gravity = c0962u.f2642c;
                    layoutParams2.windowAnimations = c0962u.f2645f;
                    windowManager.addView(c0962u.f2646g, layoutParams2);
                    c0962u.f2654o = true;
                }
            } else {
                ViewGroup viewGroup = c0962u.f2646g;
                if (viewGroup == null) {
                    if (!m37724m0(c0962u) || c0962u.f2646g == null) {
                        return;
                    }
                } else if (c0962u.f2656q && viewGroup.getChildCount() > 0) {
                    c0962u.f2646g.removeAllViews();
                }
                if (m37726l0(c0962u) && c0962u.m37679b()) {
                    ViewGroup.LayoutParams layoutParams3 = c0962u.f2647h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    c0962u.f2646g.setBackgroundResource(c0962u.f2641b);
                    ViewParent parent = c0962u.f2647h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(c0962u.f2647h);
                    }
                    c0962u.f2646g.addView(c0962u.f2647h, layoutParams3);
                    if (!c0962u.f2647h.hasFocus()) {
                        c0962u.f2647h.requestFocus();
                    }
                } else {
                    c0962u.f2656q = true;
                    return;
                }
            }
            i = -2;
            c0962u.f2653n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, c0962u.f2643d, c0962u.f2644e, 1002, 8519680, -3);
            layoutParams22.gravity = c0962u.f2642c;
            layoutParams22.windowAnimations = c0962u.f2645f;
            windowManager.addView(c0962u.f2646g, layoutParams22);
            c0962u.f2654o = true;
        }
    }

    /* renamed from: D0 */
    private boolean m37777D0(C0962u c0962u, int i, KeyEvent keyEvent, int i2) {
        C0999g c0999g;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0962u.f2652m || m37775E0(c0962u, keyEvent)) && (c0999g = c0962u.f2649j) != null) {
            z = c0999g.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f2571D == null) {
            m37750S(c0962u, true);
        }
        return z;
    }

    /* renamed from: E0 */
    private boolean m37775E0(C0962u c0962u, KeyEvent keyEvent) {
        InterfaceC1171y interfaceC1171y;
        InterfaceC1171y interfaceC1171y2;
        InterfaceC1171y interfaceC1171y3;
        if (this.f2598e0) {
            return false;
        }
        if (c0962u.f2652m) {
            return true;
        }
        C0962u c0962u2 = this.f2593Z;
        if (c0962u2 != null && c0962u2 != c0962u) {
            m37750S(c0962u2, false);
        }
        Window.Callback m37730j0 = m37730j0();
        if (m37730j0 != null) {
            c0962u.f2648i = m37730j0.onCreatePanelView(c0962u.f2640a);
        }
        int i = c0962u.f2640a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC1171y3 = this.f2571D) != null) {
            interfaceC1171y3.mo36899d();
        }
        if (c0962u.f2648i == null && (!z || !(m37779C0() instanceof C0971n))) {
            if (c0962u.f2649j == null || c0962u.f2657r) {
                if (c0962u.f2649j == null && (!m37722n0(c0962u) || c0962u.f2649j == null)) {
                    return false;
                }
                if (z && this.f2571D != null) {
                    if (this.f2572E == null) {
                        this.f2572E = new C0948i();
                    }
                    this.f2571D.mo36901b(c0962u.f2649j, this.f2572E);
                }
                c0962u.f2649j.m37523h0();
                if (!m37730j0.onCreatePanelMenu(c0962u.f2640a, c0962u.f2649j)) {
                    c0962u.m37678c(null);
                    if (z && (interfaceC1171y = this.f2571D) != null) {
                        interfaceC1171y.mo36901b(null, this.f2572E);
                    }
                    return false;
                }
                c0962u.f2657r = false;
            }
            c0962u.f2649j.m37523h0();
            Bundle bundle = c0962u.f2658s;
            if (bundle != null) {
                c0962u.f2649j.m37543R(bundle);
                c0962u.f2658s = null;
            }
            if (!m37730j0.onPreparePanel(0, c0962u.f2648i, c0962u.f2649j)) {
                if (z && (interfaceC1171y2 = this.f2571D) != null) {
                    interfaceC1171y2.mo36901b(null, this.f2572E);
                }
                c0962u.f2649j.m37524g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c0962u.f2655p = z2;
            c0962u.f2649j.setQwertyMode(z2);
            c0962u.f2649j.m37524g0();
        }
        c0962u.f2652m = true;
        c0962u.f2653n = false;
        this.f2593Z = c0962u;
        return true;
    }

    /* renamed from: F0 */
    private void m37773F0(boolean z) {
        InterfaceC1171y interfaceC1171y = this.f2571D;
        if (interfaceC1171y != null && interfaceC1171y.mo36898e() && (!ViewConfiguration.get(this.f2614w).hasPermanentMenuKey() || this.f2571D.mo36897f())) {
            Window.Callback m37730j0 = m37730j0();
            if (this.f2571D.mo36900c() && z) {
                this.f2571D.mo36896g();
                if (this.f2598e0) {
                    return;
                }
                m37730j0.onPanelClosed(108, m37733h0(0, true).f2649j);
                return;
            } else if (m37730j0 == null || this.f2598e0) {
                return;
            } else {
                if (this.f2606l0 && (this.f2607m0 & 1) != 0) {
                    this.f2615x.getDecorView().removeCallbacks(this.f2608n0);
                    this.f2608n0.run();
                }
                C0962u m37733h0 = m37733h0(0, true);
                C0999g c0999g = m37733h0.f2649j;
                if (c0999g == null || m37733h0.f2657r || !m37730j0.onPreparePanel(0, m37733h0.f2648i, c0999g)) {
                    return;
                }
                m37730j0.onMenuOpened(108, m37733h0.f2649j);
                this.f2571D.mo36895h();
                return;
            }
        }
        C0962u m37733h02 = m37733h0(0, true);
        m37733h02.f2656q = true;
        m37750S(m37733h02, false);
        m37781B0(m37733h02, null);
    }

    /* renamed from: G0 */
    private int m37771G0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i;
        }
    }

    /* renamed from: I0 */
    private boolean m37767I0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2615x.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C7759x.m17536T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: K */
    private boolean m37764K(boolean z) {
        if (this.f2598e0) {
            return false;
        }
        int m37758N = m37758N();
        boolean m37759M0 = m37759M0(m37714r0(this.f2614w, m37758N), z);
        if (m37758N == 0) {
            m37734g0(this.f2614w).m37686e();
        } else {
            AbstractC0957q abstractC0957q = this.f2604j0;
            if (abstractC0957q != null) {
                abstractC0957q.m37687a();
            }
        }
        if (m37758N == 3) {
            m37735f0(this.f2614w).m37686e();
        } else {
            AbstractC0957q abstractC0957q2 = this.f2605k0;
            if (abstractC0957q2 != null) {
                abstractC0957q2.m37687a();
            }
        }
        return m37759M0;
    }

    /* renamed from: K0 */
    private void m37763K0() {
        if (this.f2580M) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: L */
    private void m37762L() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2581N.findViewById(16908290);
        View decorView = this.f2615x.getDecorView();
        contentFrameLayout.m37388b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f2614w.obtainStyledAttributes(C7461j.AppCompatTheme);
        obtainStyledAttributes.getValue(C7461j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C7461j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C7461j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C7461j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C7461j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C7461j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C7461j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C7461j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C7461j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C7461j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: L0 */
    private e m37761L0() {
        for (Context context = this.f2614w; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof e) {
                return (e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: M */
    private void m37760M(Window window) {
        if (this.f2615x == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0955o)) {
                C0955o c0955o = new C0955o(callback);
                this.f2616y = c0955o;
                window.setCallback(c0955o);
                C1138r0 m37027u = C1138r0.m37027u(this.f2614w, null, f2564v0);
                Drawable m37040h = m37027u.m37040h(0);
                if (m37040h != null) {
                    window.setBackgroundDrawable(m37040h);
                }
                m37027u.m37025w();
                this.f2615x = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m37759M0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f2614w
            r1 = 0
            android.content.res.Configuration r0 = r6.m37749T(r0, r7, r1)
            boolean r2 = r6.m37718p0()
            android.content.Context r3 = r6.f2614w
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.f2595b0
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.LayoutInflater$Factory2C0938h.f2565w0
            if (r8 != 0) goto L30
            boolean r8 = r6.f2596c0
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f2599f
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f2599f
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C1291a.m36467p(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.m37757N0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f2599f
            boolean r0 = r8 instanceof androidx.appcompat.app.e
            if (r0 == 0) goto L5e
            androidx.appcompat.app.e r8 = (androidx.appcompat.app.e) r8
            r8.onNightModeChanged(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0938h.m37759M0(int, boolean):boolean");
    }

    /* renamed from: N */
    private int m37758N() {
        int i = this.f2600f0;
        return i != -100 ? i : g.j();
    }

    /* renamed from: N0 */
    private void m37757N0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f2614w.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            C0970m.m37655a(resources);
        }
        int i2 = this.f2601g0;
        if (i2 != 0) {
            this.f2614w.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f2614w.getTheme().applyStyle(this.f2601g0, true);
            }
        }
        if (z) {
            Object obj = this.f2599f;
            if (obj instanceof Activity) {
                androidx.lifecycle.o oVar = (Activity) obj;
                if (oVar instanceof androidx.lifecycle.o) {
                    if (oVar.getLifecycle().mo35505b().a(AbstractC1565i.c.f)) {
                        oVar.onConfigurationChanged(configuration2);
                    }
                } else if (this.f2597d0) {
                    oVar.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: P0 */
    private void m37753P0(View view) {
        int m36324d;
        if ((C7759x.m17542N(view) & 8192) != 0) {
            m36324d = C1335a.m36324d(this.f2614w, C7454c.abc_decor_view_status_guard_light);
        } else {
            m36324d = C1335a.m36324d(this.f2614w, C7454c.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(m36324d);
    }

    /* renamed from: Q */
    private void m37752Q() {
        AbstractC0957q abstractC0957q = this.f2604j0;
        if (abstractC0957q != null) {
            abstractC0957q.m37687a();
        }
        AbstractC0957q abstractC0957q2 = this.f2605k0;
        if (abstractC0957q2 != null) {
            abstractC0957q2.m37687a();
        }
    }

    /* renamed from: T */
    private Configuration m37749T(Context context, int i, Configuration configuration) {
        int i2;
        if (i != 1) {
            i2 = i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: U */
    private ViewGroup m37748U() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f2614w.obtainStyledAttributes(C7461j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C7461j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C7461j.AppCompatTheme_windowNoTitle, false)) {
                m37783A(1);
            } else if (obtainStyledAttributes.getBoolean(C7461j.AppCompatTheme_windowActionBar, false)) {
                m37783A(108);
            }
            if (obtainStyledAttributes.getBoolean(C7461j.AppCompatTheme_windowActionBarOverlay, false)) {
                m37783A(109);
            }
            if (obtainStyledAttributes.getBoolean(C7461j.AppCompatTheme_windowActionModeOverlay, false)) {
                m37783A(10);
            }
            this.f2589V = obtainStyledAttributes.getBoolean(C7461j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m37741b0();
            this.f2615x.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f2614w);
            if (!this.f2590W) {
                if (this.f2589V) {
                    viewGroup = (ViewGroup) from.inflate(C7458g.abc_dialog_title_material, (ViewGroup) null);
                    this.f2587T = false;
                    this.f2586S = false;
                } else if (this.f2586S) {
                    TypedValue typedValue = new TypedValue();
                    this.f2614w.getTheme().resolveAttribute(C7452a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C7488d(this.f2614w, typedValue.resourceId);
                    } else {
                        context = this.f2614w;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C7458g.abc_screen_toolbar, (ViewGroup) null);
                    InterfaceC1171y interfaceC1171y = (InterfaceC1171y) viewGroup.findViewById(C7457f.decor_content_parent);
                    this.f2571D = interfaceC1171y;
                    interfaceC1171y.setWindowCallback(m37730j0());
                    if (this.f2587T) {
                        this.f2571D.mo36894i(109);
                    }
                    if (this.f2584Q) {
                        this.f2571D.mo36894i(2);
                    }
                    if (this.f2585R) {
                        this.f2571D.mo36894i(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f2588U ? (ViewGroup) from.inflate(C7458g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C7458g.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C7759x.m17562C0(viewGroup, new C0941c());
                } else if (viewGroup instanceof InterfaceC1083c0) {
                    ((InterfaceC1083c0) viewGroup).setOnFitSystemWindowsListener(new C0942d());
                }
                if (this.f2571D == null) {
                    this.f2582O = (TextView) viewGroup.findViewById(C7457f.title);
                }
                C1170x0.m36902c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C7457f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f2615x.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f2615x.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0943e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2586S + ", windowActionBarOverlay: " + this.f2587T + ", android:windowIsFloating: " + this.f2589V + ", windowActionModeOverlay: " + this.f2588U + ", windowNoTitle: " + this.f2590W + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: a0 */
    private void m37742a0() {
        if (this.f2580M) {
            return;
        }
        this.f2581N = m37748U();
        CharSequence m37731i0 = m37731i0();
        if (!TextUtils.isEmpty(m37731i0)) {
            InterfaceC1171y interfaceC1171y = this.f2571D;
            if (interfaceC1171y != null) {
                interfaceC1171y.setWindowTitle(m37731i0);
            } else if (m37779C0() != null) {
                m37779C0().mo37630D(m37731i0);
            } else {
                TextView textView = this.f2582O;
                if (textView != null) {
                    textView.setText(m37731i0);
                }
            }
        }
        m37762L();
        m37782A0(this.f2581N);
        this.f2580M = true;
        C0962u m37733h0 = m37733h0(0, false);
        if (this.f2598e0) {
            return;
        }
        if (m37733h0 == null || m37733h0.f2649j == null) {
            m37720o0(108);
        }
    }

    /* renamed from: b0 */
    private void m37741b0() {
        if (this.f2615x == null) {
            Object obj = this.f2599f;
            if (obj instanceof Activity) {
                m37760M(((Activity) obj).getWindow());
            }
        }
        if (this.f2615x == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: d0 */
    private static Configuration m37738d0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                C0953m.m37690a(configuration, configuration2, configuration3);
            } else if (!C7670c.m17875a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i5 = configuration.touchscreen;
            int i6 = configuration2.touchscreen;
            if (i5 != i6) {
                configuration3.touchscreen = i6;
            }
            int i7 = configuration.keyboard;
            int i8 = configuration2.keyboard;
            if (i7 != i8) {
                configuration3.keyboard = i8;
            }
            int i9 = configuration.keyboardHidden;
            int i10 = configuration2.keyboardHidden;
            if (i9 != i10) {
                configuration3.keyboardHidden = i10;
            }
            int i11 = configuration.navigation;
            int i12 = configuration2.navigation;
            if (i11 != i12) {
                configuration3.navigation = i12;
            }
            int i13 = configuration.navigationHidden;
            int i14 = configuration2.navigationHidden;
            if (i13 != i14) {
                configuration3.navigationHidden = i14;
            }
            int i15 = configuration.orientation;
            int i16 = configuration2.orientation;
            if (i15 != i16) {
                configuration3.orientation = i16;
            }
            int i17 = configuration.screenLayout & 15;
            int i18 = configuration2.screenLayout;
            if (i17 != (i18 & 15)) {
                configuration3.screenLayout |= i18 & 15;
            }
            int i19 = configuration.screenLayout & 192;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 192)) {
                configuration3.screenLayout |= i20 & 192;
            }
            int i21 = configuration.screenLayout & 48;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 48)) {
                configuration3.screenLayout |= i22 & 48;
            }
            int i23 = configuration.screenLayout & 768;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 768)) {
                configuration3.screenLayout |= i24 & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                C0954n.m37689a(configuration, configuration2, configuration3);
            }
            int i25 = configuration.uiMode & 15;
            int i26 = configuration2.uiMode;
            if (i25 != (i26 & 15)) {
                configuration3.uiMode |= i26 & 15;
            }
            int i27 = configuration.uiMode & 48;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 48)) {
                configuration3.uiMode |= i28 & 48;
            }
            int i29 = configuration.screenWidthDp;
            int i30 = configuration2.screenWidthDp;
            if (i29 != i30) {
                configuration3.screenWidthDp = i30;
            }
            int i31 = configuration.screenHeightDp;
            int i32 = configuration2.screenHeightDp;
            if (i31 != i32) {
                configuration3.screenHeightDp = i32;
            }
            int i33 = configuration.smallestScreenWidthDp;
            int i34 = configuration2.smallestScreenWidthDp;
            if (i33 != i34) {
                configuration3.smallestScreenWidthDp = i34;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                C0951k.m37692b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: f0 */
    private AbstractC0957q m37735f0(Context context) {
        if (this.f2605k0 == null) {
            this.f2605k0 = new C0956p(context);
        }
        return this.f2605k0;
    }

    /* renamed from: g0 */
    private AbstractC0957q m37734g0(Context context) {
        if (this.f2604j0 == null) {
            this.f2604j0 = new C0959r(C0978p.m37639a(context));
        }
        return this.f2604j0;
    }

    /* renamed from: k0 */
    private void m37728k0() {
        m37742a0();
        if (this.f2586S && this.f2568A == null) {
            Object obj = this.f2599f;
            if (obj instanceof Activity) {
                this.f2568A = new C0980q((Activity) this.f2599f, this.f2587T);
            } else if (obj instanceof Dialog) {
                this.f2568A = new C0980q((Dialog) this.f2599f);
            }
            AbstractC0925a abstractC0925a = this.f2568A;
            if (abstractC0925a != null) {
                abstractC0925a.mo37603t(this.f2609o0);
            }
        }
    }

    /* renamed from: l0 */
    private boolean m37726l0(C0962u c0962u) {
        View view = c0962u.f2648i;
        if (view != null) {
            c0962u.f2647h = view;
            return true;
        } else if (c0962u.f2649j == null) {
            return false;
        } else {
            if (this.f2573F == null) {
                this.f2573F = new C0963v();
            }
            View view2 = (View) c0962u.m37680a(this.f2573F);
            c0962u.f2647h = view2;
            return view2 != null;
        }
    }

    /* renamed from: m0 */
    private boolean m37724m0(C0962u c0962u) {
        c0962u.m37677d(m37737e0());
        c0962u.f2646g = new C0961t(c0962u.f2651l);
        c0962u.f2642c = 81;
        return true;
    }

    /* renamed from: n0 */
    private boolean m37722n0(C0962u c0962u) {
        Context context = this.f2614w;
        int i = c0962u.f2640a;
        if ((i == 0 || i == 108) && this.f2571D != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C7452a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C7452a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C7452a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C7488d c7488d = new C7488d(context, 0);
                c7488d.getTheme().setTo(theme2);
                context = c7488d;
            }
        }
        C0999g c0999g = new C0999g(context);
        c0999g.mo37444V(this);
        c0962u.m37678c(c0999g);
        return true;
    }

    /* renamed from: o0 */
    private void m37720o0(int i) {
        this.f2607m0 = (1 << i) | this.f2607m0;
        if (this.f2606l0) {
            return;
        }
        C7759x.m17514h0(this.f2615x.getDecorView(), this.f2608n0);
        this.f2606l0 = true;
    }

    /* renamed from: p0 */
    private boolean m37718p0() {
        int i;
        if (!this.f2603i0 && (this.f2599f instanceof Activity)) {
            PackageManager packageManager = this.f2614w.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 269221888;
                } else {
                    i = Build.VERSION.SDK_INT >= 24 ? 786432 : 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f2614w, this.f2599f.getClass()), i);
                this.f2602h0 = (activityInfo == null || (activityInfo.configChanges & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f2602h0 = false;
            }
        }
        this.f2603i0 = true;
        return this.f2602h0;
    }

    /* renamed from: u0 */
    private boolean m37708u0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0962u m37733h0 = m37733h0(i, true);
            if (m37733h0.f2654o) {
                return false;
            }
            return m37775E0(m37733h0, keyEvent);
        }
        return false;
    }

    /* renamed from: x0 */
    private boolean m37702x0(int i, KeyEvent keyEvent) {
        boolean z;
        InterfaceC1171y interfaceC1171y;
        if (this.f2574G != null) {
            return false;
        }
        boolean z2 = true;
        C0962u m37733h0 = m37733h0(i, true);
        if (i == 0 && (interfaceC1171y = this.f2571D) != null && interfaceC1171y.mo36898e() && !ViewConfiguration.get(this.f2614w).hasPermanentMenuKey()) {
            if (!this.f2571D.mo36900c()) {
                if (!this.f2598e0 && m37775E0(m37733h0, keyEvent)) {
                    z2 = this.f2571D.mo36895h();
                }
                z2 = false;
            } else {
                z2 = this.f2571D.mo36896g();
            }
        } else if (!m37733h0.f2654o && !m37733h0.f2653n) {
            if (m37733h0.f2652m) {
                if (m37733h0.f2657r) {
                    m37733h0.f2652m = false;
                    z = m37775E0(m37733h0, keyEvent);
                } else {
                    z = true;
                }
                if (z) {
                    m37781B0(m37733h0, keyEvent);
                }
            }
            z2 = false;
        } else {
            boolean z3 = m37733h0.f2654o;
            m37750S(m37733h0, true);
            z2 = z3;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f2614w.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* renamed from: A */
    public boolean m37783A(int i) {
        int m37771G0 = m37771G0(i);
        if (this.f2590W && m37771G0 == 108) {
            return false;
        }
        if (this.f2586S && m37771G0 == 1) {
            this.f2586S = false;
        }
        if (m37771G0 == 1) {
            m37763K0();
            this.f2590W = true;
            return true;
        } else if (m37771G0 == 2) {
            m37763K0();
            this.f2584Q = true;
            return true;
        } else if (m37771G0 == 5) {
            m37763K0();
            this.f2585R = true;
            return true;
        } else if (m37771G0 == 10) {
            m37763K0();
            this.f2588U = true;
            return true;
        } else if (m37771G0 == 108) {
            m37763K0();
            this.f2586S = true;
            return true;
        } else if (m37771G0 != 109) {
            return this.f2615x.requestFeature(m37771G0);
        } else {
            m37763K0();
            this.f2587T = true;
            return true;
        }
    }

    /* renamed from: A0 */
    void m37782A0(ViewGroup viewGroup) {
    }

    /* renamed from: C */
    public void m37780C(int i) {
        m37742a0();
        ViewGroup viewGroup = (ViewGroup) this.f2581N.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2614w).inflate(i, viewGroup);
        this.f2616y.m18549a().onContentChanged();
    }

    /* renamed from: C0 */
    final AbstractC0925a m37779C0() {
        return this.f2568A;
    }

    /* renamed from: D */
    public void m37778D(View view) {
        m37742a0();
        ViewGroup viewGroup = (ViewGroup) this.f2581N.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2616y.m18549a().onContentChanged();
    }

    /* renamed from: E */
    public void m37776E(View view, ViewGroup.LayoutParams layoutParams) {
        m37742a0();
        ViewGroup viewGroup = (ViewGroup) this.f2581N.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2616y.m18549a().onContentChanged();
    }

    /* renamed from: F */
    public void m37774F(Toolbar toolbar) {
        if (this.f2599f instanceof Activity) {
            AbstractC0925a m37723n = m37723n();
            if (!(m37723n instanceof C0980q)) {
                this.f2569B = null;
                if (m37723n != null) {
                    m37723n.mo37644o();
                }
                if (toolbar != null) {
                    C0971n c0971n = new C0971n(toolbar, m37731i0(), this.f2616y);
                    this.f2568A = c0971n;
                    this.f2615x.setCallback(c0971n.m37649H());
                } else {
                    this.f2568A = null;
                    this.f2615x.setCallback(this.f2616y);
                }
                m37719p();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: G */
    public void m37772G(int i) {
        this.f2601g0 = i;
    }

    /* renamed from: H */
    public final void m37770H(CharSequence charSequence) {
        this.f2570C = charSequence;
        InterfaceC1171y interfaceC1171y = this.f2571D;
        if (interfaceC1171y != null) {
            interfaceC1171y.setWindowTitle(charSequence);
        } else if (m37779C0() != null) {
            m37779C0().mo37630D(charSequence);
        } else {
            TextView textView = this.f2582O;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: H0 */
    final boolean m37769H0() {
        ViewGroup viewGroup;
        return this.f2580M && (viewGroup = this.f2581N) != null && C7759x.m17535U(viewGroup);
    }

    /* renamed from: I */
    public AbstractC7485b m37768I(AbstractC7485b.InterfaceC7486a interfaceC7486a) {
        f fVar;
        if (interfaceC7486a != null) {
            AbstractC7485b abstractC7485b = this.f2574G;
            if (abstractC7485b != null) {
                abstractC7485b.mo18590c();
            }
            C0949j c0949j = new C0949j(interfaceC7486a);
            AbstractC0925a m37723n = m37723n();
            if (m37723n != null) {
                AbstractC7485b mo37628F = m37723n.mo37628F(c0949j);
                this.f2574G = mo37628F;
                if (mo37628F != null && (fVar = this.f2617z) != null) {
                    fVar.onSupportActionModeStarted(mo37628F);
                }
            }
            if (this.f2574G == null) {
                this.f2574G = m37765J0(c0949j);
            }
            return this.f2574G;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: J */
    public boolean m37766J() {
        return m37764K(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    p201g.p202a.p209o.AbstractC7485b m37765J0(p201g.p202a.p209o.AbstractC7485b.InterfaceC7486a r8) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0938h.m37765J0(g.a.o.b$a):g.a.o.b");
    }

    /* renamed from: O */
    void m37756O(int i, C0962u c0962u, Menu menu) {
        if (menu == null) {
            if (c0962u == null && i >= 0) {
                C0962u[] c0962uArr = this.f2592Y;
                if (i < c0962uArr.length) {
                    c0962u = c0962uArr[i];
                }
            }
            if (c0962u != null) {
                menu = c0962u.f2649j;
            }
        }
        if ((c0962u == null || c0962u.f2654o) && !this.f2598e0) {
            this.f2616y.m18549a().onPanelClosed(i, menu);
        }
    }

    /* renamed from: O0 */
    final int m37755O0(C7698g0 c7698g0, Rect rect) {
        int i;
        boolean z;
        boolean z2;
        if (c7698g0 != null) {
            i = c7698g0.m17782l();
        } else {
            i = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f2575H;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2575H.getLayoutParams();
            if (this.f2575H.isShown()) {
                if (this.f2610p0 == null) {
                    this.f2610p0 = new Rect();
                    this.f2611q0 = new Rect();
                }
                Rect rect2 = this.f2610p0;
                Rect rect3 = this.f2611q0;
                if (c7698g0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c7698g0.m17784j(), c7698g0.m17782l(), c7698g0.m17783k(), c7698g0.m17785i());
                }
                C1170x0.m36904a(this.f2581N, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                C7698g0 m17547K = C7759x.m17547K(this.f2581N);
                int m17784j = m17547K == null ? 0 : m17547K.m17784j();
                int m17783k = m17547K == null ? 0 : m17547K.m17783k();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && this.f2583P == null) {
                    View view = new View(this.f2614w);
                    this.f2583P = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m17784j;
                    layoutParams.rightMargin = m17783k;
                    this.f2581N.addView(this.f2583P, -1, layoutParams);
                } else {
                    View view2 = this.f2583P;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != m17784j || marginLayoutParams2.rightMargin != m17783k) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = m17784j;
                            marginLayoutParams2.rightMargin = m17783k;
                            this.f2583P.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                r5 = this.f2583P != null;
                if (r5 && this.f2583P.getVisibility() != 0) {
                    m37753P0(this.f2583P);
                }
                if (!this.f2588U && r5) {
                    i = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.f2575H.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f2583P;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    /* renamed from: P */
    void m37754P(C0999g c0999g) {
        if (this.f2591X) {
            return;
        }
        this.f2591X = true;
        this.f2571D.mo36893j();
        Window.Callback m37730j0 = m37730j0();
        if (m37730j0 != null && !this.f2598e0) {
            m37730j0.onPanelClosed(108, c0999g);
        }
        this.f2591X = false;
    }

    /* renamed from: R */
    void m37751R(int i) {
        m37750S(m37733h0(i, true), true);
    }

    /* renamed from: S */
    void m37750S(C0962u c0962u, boolean z) {
        ViewGroup viewGroup;
        InterfaceC1171y interfaceC1171y;
        if (z && c0962u.f2640a == 0 && (interfaceC1171y = this.f2571D) != null && interfaceC1171y.mo36900c()) {
            m37754P(c0962u.f2649j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2614w.getSystemService("window");
        if (windowManager != null && c0962u.f2654o && (viewGroup = c0962u.f2646g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m37756O(c0962u.f2640a, c0962u, null);
            }
        }
        c0962u.f2652m = false;
        c0962u.f2653n = false;
        c0962u.f2654o = false;
        c0962u.f2647h = null;
        c0962u.f2656q = true;
        if (this.f2593Z == c0962u) {
            this.f2593Z = null;
        }
    }

    /* renamed from: V */
    public View m37747V(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f2612r0 == null) {
            String string = this.f2614w.obtainStyledAttributes(C7461j.AppCompatTheme).getString(C7461j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f2612r0 = new C0967k();
            } else {
                try {
                    this.f2612r0 = (C0967k) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2612r0 = new C0967k();
                }
            }
        }
        if (f2563u0) {
            if (this.f2613s0 == null) {
                this.f2613s0 = new C0969l();
            }
            if (this.f2613s0.m37659a(attributeSet)) {
                z = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z2 = true;
                    }
                } else {
                    z2 = m37767I0((ViewParent) view);
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.f2612r0.m37665q(view, str, context, attributeSet, z, f2563u0, true, C1168w0.m36906c());
    }

    /* renamed from: W */
    void m37746W() {
        C0999g c0999g;
        InterfaceC1171y interfaceC1171y = this.f2571D;
        if (interfaceC1171y != null) {
            interfaceC1171y.mo36893j();
        }
        if (this.f2576I != null) {
            this.f2615x.getDecorView().removeCallbacks(this.f2577J);
            if (this.f2576I.isShowing()) {
                try {
                    this.f2576I.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2576I = null;
        }
        m37743Z();
        C0962u m37733h0 = m37733h0(0, false);
        if (m37733h0 == null || (c0999g = m37733h0.f2649j) == null) {
            return;
        }
        c0999g.close();
    }

    /* renamed from: X */
    boolean m37745X(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f2599f;
        if (((obj instanceof C7695f.a) || (obj instanceof DialogC0964i)) && (decorView = this.f2615x.getDecorView()) != null && C7695f.m17799d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f2616y.m18549a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m37710t0(keyCode, keyEvent) : m37704w0(keyCode, keyEvent);
    }

    /* renamed from: Y */
    void m37744Y(int i) {
        C0962u m37733h0;
        C0962u m37733h02 = m37733h0(i, true);
        if (m37733h02.f2649j != null) {
            Bundle bundle = new Bundle();
            m37733h02.f2649j.m37541T(bundle);
            if (bundle.size() > 0) {
                m37733h02.f2658s = bundle;
            }
            m37733h02.f2649j.m37523h0();
            m37733h02.f2649j.clear();
        }
        m37733h02.f2657r = true;
        m37733h02.f2656q = true;
        if ((i != 108 && i != 0) || this.f2571D == null || (m37733h0 = m37733h0(0, false)) == null) {
            return;
        }
        m37733h0.f2652m = false;
        m37775E0(m37733h0, null);
    }

    /* renamed from: Z */
    void m37743Z() {
        C7687c0 c7687c0 = this.f2578K;
        if (c7687c0 != null) {
            c7687c0.m17822b();
        }
    }

    @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
    /* renamed from: a */
    public boolean mo18592a(C0999g c0999g, MenuItem menuItem) {
        C0962u m37740c0;
        Window.Callback m37730j0 = m37730j0();
        if (m37730j0 == null || this.f2598e0 || (m37740c0 = m37740c0(c0999g.mo37448F())) == null) {
            return false;
        }
        return m37730j0.onMenuItemSelected(m37740c0.f2640a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
    /* renamed from: b */
    public void mo18591b(C0999g c0999g) {
        m37773F0(true);
    }

    /* renamed from: c0 */
    C0962u m37740c0(Menu menu) {
        C0962u[] c0962uArr = this.f2592Y;
        int length = c0962uArr != null ? c0962uArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0962u c0962u = c0962uArr[i];
            if (c0962u != null && c0962u.f2649j == menu) {
                return c0962u;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m37739d(View view, ViewGroup.LayoutParams layoutParams) {
        m37742a0();
        ((ViewGroup) this.f2581N.findViewById(16908290)).addView(view, layoutParams);
        this.f2616y.m18549a().onContentChanged();
    }

    /* renamed from: e0 */
    final Context m37737e0() {
        AbstractC0925a m37723n = m37723n();
        Context mo37608k = m37723n != null ? m37723n.mo37608k() : null;
        return mo37608k == null ? this.f2614w : mo37608k;
    }

    /* renamed from: f */
    public Context m37736f(Context context) {
        this.f2595b0 = true;
        int m37714r0 = m37714r0(context, m37758N());
        Configuration configuration = null;
        if (f2566x0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0960s.m37682a((ContextThemeWrapper) context, m37749T(context, m37714r0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C7488d) {
            try {
                ((C7488d) context).m18597a(m37749T(context, m37714r0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f2565w0) {
            super.f(context);
            return context;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = C0951k.m37693a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = m37738d0(configuration3, configuration4);
            }
        }
        Configuration m37749T = m37749T(context, m37714r0, configuration);
        C7488d c7488d = new C7488d(context, C7460i.Theme_AppCompat_Empty);
        c7488d.m18597a(m37749T);
        boolean z = false;
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            C1355f.C1361d.m36234a(c7488d.getTheme());
        }
        super.f(c7488d);
        return c7488d;
    }

    /* renamed from: h0 */
    protected C0962u m37733h0(int i, boolean z) {
        C0962u[] c0962uArr = this.f2592Y;
        if (c0962uArr == null || c0962uArr.length <= i) {
            C0962u[] c0962uArr2 = new C0962u[i + 1];
            if (c0962uArr != null) {
                System.arraycopy(c0962uArr, 0, c0962uArr2, 0, c0962uArr.length);
            }
            this.f2592Y = c0962uArr2;
            c0962uArr = c0962uArr2;
        }
        C0962u c0962u = c0962uArr[i];
        if (c0962u == null) {
            C0962u c0962u2 = new C0962u(i);
            c0962uArr[i] = c0962u2;
            return c0962u2;
        }
        return c0962u;
    }

    /* renamed from: i */
    public <T extends View> T m37732i(int i) {
        m37742a0();
        return (T) this.f2615x.findViewById(i);
    }

    /* renamed from: i0 */
    final CharSequence m37731i0() {
        Object obj = this.f2599f;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f2570C;
    }

    /* renamed from: j0 */
    final Window.Callback m37730j0() {
        return this.f2615x.getCallback();
    }

    /* renamed from: k */
    public final C0929b.InterfaceC0931b m37729k() {
        return new C0947h();
    }

    /* renamed from: l */
    public int m37727l() {
        return this.f2600f0;
    }

    /* renamed from: m */
    public MenuInflater m37725m() {
        if (this.f2569B == null) {
            m37728k0();
            AbstractC0925a abstractC0925a = this.f2568A;
            this.f2569B = new C7492g(abstractC0925a != null ? abstractC0925a.mo37608k() : this.f2614w);
        }
        return this.f2569B;
    }

    /* renamed from: n */
    public AbstractC0925a m37723n() {
        m37728k0();
        return this.f2568A;
    }

    /* renamed from: o */
    public void m37721o() {
        LayoutInflater from = LayoutInflater.from(this.f2614w);
        if (from.getFactory() == null) {
            C7697g.m17794b(from, this);
        } else if (from.getFactory2() instanceof LayoutInflater$Factory2C0938h) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m37747V(view, str, context, attributeSet);
    }

    /* renamed from: p */
    public void m37719p() {
        AbstractC0925a m37723n = m37723n();
        if (m37723n == null || !m37723n.mo37645m()) {
            m37720o0(0);
        }
    }

    /* renamed from: q */
    public void m37717q(Configuration configuration) {
        AbstractC0925a m37723n;
        if (this.f2586S && this.f2580M && (m37723n = m37723n()) != null) {
            m37723n.mo37606n(configuration);
        }
        C1111i.m37134b().m37129g(this.f2614w);
        m37764K(false);
    }

    /* renamed from: q0 */
    public boolean m37716q0() {
        return this.f2579L;
    }

    /* renamed from: r */
    public void m37715r(Bundle bundle) {
        this.f2595b0 = true;
        m37764K(false);
        m37741b0();
        Object obj = this.f2599f;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C1312i.m36431c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0925a m37779C0 = m37779C0();
                if (m37779C0 == null) {
                    this.f2609o0 = true;
                } else {
                    m37779C0.mo37603t(true);
                }
            }
            g.c(this);
        }
        this.f2596c0 = true;
    }

    /* renamed from: r0 */
    int m37714r0(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return m37734g0(context).mo37684c();
                    }
                    return -1;
                } else if (i != 1 && i != 2) {
                    if (i == 3) {
                        return m37735f0(context).mo37684c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m37713s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2599f
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.y(r3)
        L9:
            boolean r0 = r3.f2606l0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f2615x
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f2608n0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f2597d0 = r0
            r0 = 1
            r3.f2598e0 = r0
            int r0 = r3.f2600f0
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f2599f
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            g.e.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0938h.f2562t0
            java.lang.Object r1 = r3.f2599f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f2600f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            g.e.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0938h.f2562t0
            java.lang.Object r1 = r3.f2599f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.f2568A
            if (r0 == 0) goto L5e
            r0.mo37644o()
        L5e:
            r3.m37752Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0938h.m37713s():void");
    }

    /* renamed from: s0 */
    boolean m37712s0() {
        AbstractC7485b abstractC7485b = this.f2574G;
        if (abstractC7485b != null) {
            abstractC7485b.mo18590c();
            return true;
        }
        AbstractC0925a m37723n = m37723n();
        return m37723n != null && m37723n.mo37611h();
    }

    /* renamed from: t */
    public void m37711t(Bundle bundle) {
        m37742a0();
    }

    /* renamed from: t0 */
    boolean m37710t0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f2594a0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m37708u0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public void m37709u() {
        AbstractC0925a m37723n = m37723n();
        if (m37723n != null) {
            m37723n.mo37632B(true);
        }
    }

    /* renamed from: v */
    public void m37707v(Bundle bundle) {
    }

    /* renamed from: v0 */
    boolean m37706v0(int i, KeyEvent keyEvent) {
        AbstractC0925a m37723n = m37723n();
        if (m37723n == null || !m37723n.mo37605p(i, keyEvent)) {
            C0962u c0962u = this.f2593Z;
            if (c0962u != null && m37777D0(c0962u, keyEvent.getKeyCode(), keyEvent, 1)) {
                C0962u c0962u2 = this.f2593Z;
                if (c0962u2 != null) {
                    c0962u2.f2653n = true;
                }
                return true;
            }
            if (this.f2593Z == null) {
                C0962u m37733h0 = m37733h0(0, true);
                m37775E0(m37733h0, keyEvent);
                boolean m37777D0 = m37777D0(m37733h0, keyEvent.getKeyCode(), keyEvent, 1);
                m37733h0.f2652m = false;
                if (m37777D0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public void m37705w() {
        this.f2597d0 = true;
        m37766J();
    }

    /* renamed from: w0 */
    boolean m37704w0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f2594a0;
            this.f2594a0 = false;
            C0962u m37733h0 = m37733h0(0, false);
            if (m37733h0 != null && m37733h0.f2654o) {
                if (!z) {
                    m37750S(m37733h0, true);
                }
                return true;
            } else if (m37712s0()) {
                return true;
            }
        } else if (i == 82) {
            m37702x0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void m37703x() {
        this.f2597d0 = false;
        AbstractC0925a m37723n = m37723n();
        if (m37723n != null) {
            m37723n.mo37632B(false);
        }
    }

    /* renamed from: y0 */
    void m37701y0(int i) {
        AbstractC0925a m37723n;
        if (i != 108 || (m37723n = m37723n()) == null) {
            return;
        }
        m37723n.mo37610i(true);
    }

    /* renamed from: z0 */
    void m37700z0(int i) {
        if (i == 108) {
            AbstractC0925a m37723n = m37723n();
            if (m37723n != null) {
                m37723n.mo37610i(false);
            }
        } else if (i == 0) {
            C0962u m37733h0 = m37733h0(i, true);
            if (m37733h0.f2654o) {
                m37750S(m37733h0, false);
            }
        }
    }

    LayoutInflater$Factory2C0938h(Dialog dialog, f fVar) {
        this(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflater$Factory2C0938h(Context context, Window window, f fVar, Object obj) {
        Integer num;
        e m37761L0;
        this.f2578K = null;
        this.f2579L = true;
        this.f2600f0 = -100;
        this.f2608n0 = new RunnableC0940b();
        this.f2614w = context;
        this.f2617z = fVar;
        this.f2599f = obj;
        if (this.f2600f0 == -100 && (obj instanceof Dialog) && (m37761L0 = m37761L0()) != null) {
            this.f2600f0 = m37761L0.getDelegate().l();
        }
        if (this.f2600f0 == -100 && (num = f2562t0.get(this.f2599f.getClass().getName())) != null) {
            this.f2600f0 = num.intValue();
            f2562t0.remove(this.f2599f.getClass().getName());
        }
        if (window != null) {
            m37760M(window);
        }
        C1111i.m37128h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$o */
    /* loaded from: classes2.dex */
    public class C0955o extends Window$CallbackC7497i {
        C0955o(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        final ActionMode m37688b(ActionMode.Callback callback) {
            C7490f.C7491a c7491a = new C7490f.C7491a(LayoutInflater$Factory2C0938h.this.f2614w, callback);
            AbstractC7485b m37768I = LayoutInflater$Factory2C0938h.this.m37768I(c7491a);
            if (m37768I != null) {
                return c7491a.m18572e(m37768I);
            }
            return null;
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0938h.this.m37745X(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C0938h.this.m37706v0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0999g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0938h.this.m37701y0(i);
            return true;
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0938h.this.m37700z0(i);
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0999g c0999g = menu instanceof C0999g ? (C0999g) menu : null;
            if (i == 0 && c0999g == null) {
                return false;
            }
            if (c0999g != null) {
                c0999g.m37527e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0999g != null) {
                c0999g.m37527e0(false);
            }
            return onPreparePanel;
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0999g c0999g;
            C0962u m37733h0 = LayoutInflater$Factory2C0938h.this.m37733h0(0, true);
            if (m37733h0 != null && (c0999g = m37733h0.f2649j) != null) {
                super.onProvideKeyboardShortcuts(list, c0999g, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflater$Factory2C0938h.this.m37716q0()) {
                return m37688b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (LayoutInflater$Factory2C0938h.this.m37716q0() && i == 0) {
                return m37688b(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }
}
