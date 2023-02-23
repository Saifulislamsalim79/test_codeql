package p201g.p227h.p238l.p239h0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p058os.C1371a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p201g.p227h.C7601c;
import p201g.p227h.p238l.p239h0.InterfaceC7725f;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: AccessibilityNodeInfoCompat.java */
/* renamed from: g.h.l.h0.c */
/* loaded from: classes2.dex */
public class C7716c {

    /* renamed from: d */
    private static int f18470d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f18471a;

    /* renamed from: b */
    public int f18472b = -1;

    /* renamed from: c */
    private int f18473c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: g.h.l.h0.c$a */
    /* loaded from: classes2.dex */
    public static class C7717a {

        /* renamed from: e */
        public static final C7717a f18474e = new C7717a(1, null);

        /* renamed from: f */
        public static final C7717a f18475f = new C7717a(2, null);

        /* renamed from: g */
        public static final C7717a f18476g;

        /* renamed from: h */
        public static final C7717a f18477h;

        /* renamed from: i */
        public static final C7717a f18478i;

        /* renamed from: j */
        public static final C7717a f18479j;

        /* renamed from: k */
        public static final C7717a f18480k;

        /* renamed from: l */
        public static final C7717a f18481l;

        /* renamed from: m */
        public static final C7717a f18482m;

        /* renamed from: n */
        public static final C7717a f18483n;

        /* renamed from: a */
        final Object f18484a;

        /* renamed from: b */
        private final int f18485b;

        /* renamed from: c */
        private final Class<? extends InterfaceC7725f.AbstractC7726a> f18486c;

        /* renamed from: d */
        protected final InterfaceC7725f f18487d;

        static {
            new C7717a(4, null);
            new C7717a(8, null);
            f18476g = new C7717a(16, null);
            new C7717a(32, null);
            new C7717a(64, null);
            new C7717a(128, null);
            new C7717a(256, (CharSequence) null, InterfaceC7725f.C7727b.class);
            new C7717a((int) IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, (CharSequence) null, InterfaceC7725f.C7727b.class);
            new C7717a(1024, (CharSequence) null, InterfaceC7725f.C7728c.class);
            new C7717a((int) IjkMediaMeta.FF_PROFILE_H264_INTRA, (CharSequence) null, InterfaceC7725f.C7728c.class);
            f18477h = new C7717a(4096, null);
            f18478i = new C7717a(8192, null);
            new C7717a(16384, null);
            new C7717a(32768, null);
            new C7717a(65536, null);
            new C7717a(131072, (CharSequence) null, InterfaceC7725f.C7732g.class);
            f18479j = new C7717a(262144, null);
            f18480k = new C7717a(524288, null);
            f18481l = new C7717a(1048576, null);
            new C7717a(2097152, (CharSequence) null, InterfaceC7725f.C7733h.class);
            new C7717a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, InterfaceC7725f.C7730e.class);
            f18482m = new C7717a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f18483n = new C7717a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, InterfaceC7725f.C7731f.class);
            new C7717a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, InterfaceC7725f.C7729d.class);
            new C7717a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            new C7717a(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public C7717a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public C7717a m17642a(CharSequence charSequence, InterfaceC7725f interfaceC7725f) {
            return new C7717a(null, this.f18485b, charSequence, interfaceC7725f, this.f18486c);
        }

        /* renamed from: b */
        public int m17641b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f18484a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence m17640c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f18484a).getLabel();
            }
            return null;
        }

        /* renamed from: d */
        public boolean m17639d(View view, Bundle bundle) {
            InterfaceC7725f.AbstractC7726a newInstance;
            if (this.f18487d != null) {
                InterfaceC7725f.AbstractC7726a abstractC7726a = null;
                Class<? extends InterfaceC7725f.AbstractC7726a> cls = this.f18486c;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        newInstance.m17628a(bundle);
                        abstractC7726a = newInstance;
                    } catch (Exception e2) {
                        e = e2;
                        abstractC7726a = newInstance;
                        Class<? extends InterfaceC7725f.AbstractC7726a> cls2 = this.f18486c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                        return this.f18487d.mo17629a(view, abstractC7726a);
                    }
                }
                return this.f18487d.mo17629a(view, abstractC7726a);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof C7717a)) {
                C7717a c7717a = (C7717a) obj;
                Object obj2 = this.f18484a;
                return obj2 == null ? c7717a.f18484a == null : obj2.equals(c7717a.f18484a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f18484a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C7717a(int i, CharSequence charSequence, InterfaceC7725f interfaceC7725f) {
            this(null, i, charSequence, interfaceC7725f, null);
        }

        C7717a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private C7717a(int i, CharSequence charSequence, Class<? extends InterfaceC7725f.AbstractC7726a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C7717a(Object obj, int i, CharSequence charSequence, InterfaceC7725f interfaceC7725f, Class<? extends InterfaceC7725f.AbstractC7726a> cls) {
            this.f18485b = i;
            this.f18487d = interfaceC7725f;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f18484a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f18484a = obj;
            }
            this.f18486c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: g.h.l.h0.c$b */
    /* loaded from: classes2.dex */
    public static class C7718b {

        /* renamed from: a */
        final Object f18488a;

        C7718b(Object obj) {
            this.f18488a = obj;
        }

        /* renamed from: a */
        public static C7718b m17638a(int i, int i2, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C7718b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C7718b(null);
        }

        /* renamed from: b */
        public static C7718b m17637b(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C7718b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C7718b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C7718b(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: g.h.l.h0.c$c */
    /* loaded from: classes2.dex */
    public static class C7719c {

        /* renamed from: a */
        final Object f18489a;

        C7719c(Object obj) {
            this.f18489a = obj;
        }

        /* renamed from: a */
        public static C7719c m17636a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C7719c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C7719c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C7719c(null);
        }
    }

    private C7716c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f18471a = accessibilityNodeInfo;
    }

    /* renamed from: E0 */
    public static C7716c m17716E0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C7716c(accessibilityNodeInfo);
    }

    /* renamed from: N */
    public static C7716c m17707N() {
        return m17716E0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: O */
    public static C7716c m17706O(View view) {
        return m17716E0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: P */
    public static C7716c m17705P(C7716c c7716c) {
        return m17716E0(AccessibilityNodeInfo.obtain(c7716c.f18471a));
    }

    /* renamed from: T */
    private void m17701T(View view) {
        SparseArray<WeakReference<ClickableSpan>> m17652v = m17652v(view);
        if (m17652v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m17652v.size(); i++) {
                if (m17652v.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                m17652v.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: V */
    private void m17699V(int i, boolean z) {
        Bundle m17658s = m17658s();
        if (m17658s != null) {
            int i2 = m17658s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            m17658s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m17686e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m17682g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f18471a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f18471a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f18471a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f18471a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: h */
    private List<Integer> m17680h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f18471a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f18471a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: j */
    private static String m17676j(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /* 512 */:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case IjkMediaMeta.FF_PROFILE_H264_INTRA /* 2048 */:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* renamed from: l */
    private boolean m17672l(int i) {
        Bundle m17658s = m17658s();
        return m17658s != null && (m17658s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: q */
    public static ClickableSpan[] m17662q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: t */
    private SparseArray<WeakReference<ClickableSpan>> m17656t(View view) {
        SparseArray<WeakReference<ClickableSpan>> m17652v = m17652v(view);
        if (m17652v == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(C7601c.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return m17652v;
    }

    /* renamed from: v */
    private SparseArray<WeakReference<ClickableSpan>> m17652v(View view) {
        return (SparseArray) view.getTag(C7601c.tag_accessibility_clickable_spans);
    }

    /* renamed from: y */
    private boolean m17646y() {
        return !m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    private int m17644z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f18470d;
        f18470d = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean m17725A() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f18471a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: A0 */
    public void m17724A0(CharSequence charSequence) {
        this.f18471a.setText(charSequence);
    }

    /* renamed from: B */
    public boolean m17723B() {
        return this.f18471a.isCheckable();
    }

    /* renamed from: B0 */
    public void m17722B0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f18471a.setTraversalAfter(view);
        }
    }

    /* renamed from: C */
    public boolean m17721C() {
        return this.f18471a.isChecked();
    }

    /* renamed from: C0 */
    public void m17720C0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f18471a.setVisibleToUser(z);
        }
    }

    /* renamed from: D */
    public boolean m17719D() {
        return this.f18471a.isClickable();
    }

    /* renamed from: D0 */
    public AccessibilityNodeInfo m17718D0() {
        return this.f18471a;
    }

    /* renamed from: E */
    public boolean m17717E() {
        return this.f18471a.isEnabled();
    }

    /* renamed from: F */
    public boolean m17715F() {
        return this.f18471a.isFocusable();
    }

    /* renamed from: G */
    public boolean m17714G() {
        return this.f18471a.isFocused();
    }

    /* renamed from: H */
    public boolean m17713H() {
        return this.f18471a.isLongClickable();
    }

    /* renamed from: I */
    public boolean m17712I() {
        return this.f18471a.isPassword();
    }

    /* renamed from: J */
    public boolean m17711J() {
        return this.f18471a.isScrollable();
    }

    /* renamed from: K */
    public boolean m17710K() {
        return this.f18471a.isSelected();
    }

    /* renamed from: L */
    public boolean m17709L() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f18471a.isShowingHintText();
        }
        return m17672l(4);
    }

    /* renamed from: M */
    public boolean m17708M() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f18471a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: Q */
    public boolean m17704Q(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f18471a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: R */
    public void m17703R() {
        this.f18471a.recycle();
    }

    /* renamed from: S */
    public boolean m17702S(C7717a c7717a) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f18471a.removeAction((AccessibilityNodeInfo.AccessibilityAction) c7717a.f18484a);
        }
        return false;
    }

    /* renamed from: U */
    public void m17700U(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f18471a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: W */
    public void m17698W(Rect rect) {
        this.f18471a.setBoundsInParent(rect);
    }

    /* renamed from: X */
    public void m17697X(Rect rect) {
        this.f18471a.setBoundsInScreen(rect);
    }

    /* renamed from: Y */
    public void m17696Y(boolean z) {
        this.f18471a.setCheckable(z);
    }

    /* renamed from: Z */
    public void m17695Z(boolean z) {
        this.f18471a.setChecked(z);
    }

    /* renamed from: a */
    public void m17694a(int i) {
        this.f18471a.addAction(i);
    }

    /* renamed from: a0 */
    public void m17693a0(CharSequence charSequence) {
        this.f18471a.setClassName(charSequence);
    }

    /* renamed from: b */
    public void m17692b(C7717a c7717a) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f18471a.addAction((AccessibilityNodeInfo.AccessibilityAction) c7717a.f18484a);
        }
    }

    /* renamed from: b0 */
    public void m17691b0(boolean z) {
        this.f18471a.setClickable(z);
    }

    /* renamed from: c */
    public void m17690c(View view) {
        this.f18471a.addChild(view);
    }

    /* renamed from: c0 */
    public void m17689c0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f18471a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C7718b) obj).f18488a);
        }
    }

    /* renamed from: d */
    public void m17688d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f18471a.addChild(view, i);
        }
    }

    /* renamed from: d0 */
    public void m17687d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f18471a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C7719c) obj).f18489a);
        }
    }

    /* renamed from: e0 */
    public void m17685e0(CharSequence charSequence) {
        this.f18471a.setContentDescription(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C7716c)) {
            C7716c c7716c = (C7716c) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f18471a;
            if (accessibilityNodeInfo == null) {
                if (c7716c.f18471a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(c7716c.f18471a)) {
                return false;
            }
            return this.f18473c == c7716c.f18473c && this.f18472b == c7716c.f18472b;
        }
        return false;
    }

    /* renamed from: f */
    public void m17684f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        m17682g();
        m17701T(view);
        ClickableSpan[] m17662q = m17662q(charSequence);
        if (m17662q == null || m17662q.length <= 0) {
            return;
        }
        m17658s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C7601c.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> m17656t = m17656t(view);
        for (int i2 = 0; m17662q != null && i2 < m17662q.length; i2++) {
            int m17644z = m17644z(m17662q[i2], m17656t);
            m17656t.put(m17644z, new WeakReference<>(m17662q[i2]));
            m17686e(m17662q[i2], (Spanned) charSequence, m17644z);
        }
    }

    /* renamed from: f0 */
    public void m17683f0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f18471a.setDismissable(z);
        }
    }

    /* renamed from: g0 */
    public void m17681g0(boolean z) {
        this.f18471a.setEnabled(z);
    }

    /* renamed from: h0 */
    public void m17679h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f18471a.setError(charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f18471a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C7717a> m17678i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f18471a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C7717a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: i0 */
    public void m17677i0(boolean z) {
        this.f18471a.setFocusable(z);
    }

    /* renamed from: j0 */
    public void m17675j0(boolean z) {
        this.f18471a.setFocused(z);
    }

    /* renamed from: k */
    public int m17674k() {
        return this.f18471a.getActions();
    }

    /* renamed from: k0 */
    public void m17673k0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f18471a.setHeading(z);
        } else {
            m17699V(2, z);
        }
    }

    /* renamed from: l0 */
    public void m17671l0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f18471a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f18471a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Deprecated
    /* renamed from: m */
    public void m17670m(Rect rect) {
        this.f18471a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void m17669m0(boolean z) {
        this.f18471a.setLongClickable(z);
    }

    /* renamed from: n */
    public void m17668n(Rect rect) {
        this.f18471a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void m17667n0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f18471a.setMaxTextLength(i);
        }
    }

    /* renamed from: o */
    public int m17666o() {
        return this.f18471a.getChildCount();
    }

    /* renamed from: o0 */
    public void m17665o0(CharSequence charSequence) {
        this.f18471a.setPackageName(charSequence);
    }

    /* renamed from: p */
    public CharSequence m17664p() {
        return this.f18471a.getClassName();
    }

    /* renamed from: p0 */
    public void m17663p0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f18471a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f18471a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: q0 */
    public void m17661q0(View view) {
        this.f18472b = -1;
        this.f18471a.setParent(view);
    }

    /* renamed from: r */
    public CharSequence m17660r() {
        return this.f18471a.getContentDescription();
    }

    /* renamed from: r0 */
    public void m17659r0(View view, int i) {
        this.f18472b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f18471a.setParent(view, i);
        }
    }

    /* renamed from: s */
    public Bundle m17658s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f18471a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: s0 */
    public void m17657s0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f18471a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: t0 */
    public void m17655t0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f18471a.setScreenReaderFocusable(z);
        } else {
            m17699V(1, z);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m17670m(rect);
        sb.append("; boundsInParent: " + rect);
        m17668n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m17654u());
        sb.append("; className: ");
        sb.append(m17664p());
        sb.append("; text: ");
        sb.append(m17650w());
        sb.append("; contentDescription: ");
        sb.append(m17660r());
        sb.append("; viewId: ");
        sb.append(m17648x());
        sb.append("; checkable: ");
        sb.append(m17723B());
        sb.append("; checked: ");
        sb.append(m17721C());
        sb.append("; focusable: ");
        sb.append(m17715F());
        sb.append("; focused: ");
        sb.append(m17714G());
        sb.append("; selected: ");
        sb.append(m17710K());
        sb.append("; clickable: ");
        sb.append(m17719D());
        sb.append("; longClickable: ");
        sb.append(m17713H());
        sb.append("; enabled: ");
        sb.append(m17717E());
        sb.append("; password: ");
        sb.append(m17712I());
        sb.append("; scrollable: " + m17711J());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C7717a> m17678i = m17678i();
            for (int i = 0; i < m17678i.size(); i++) {
                C7717a c7717a = m17678i.get(i);
                String m17676j = m17676j(c7717a.m17641b());
                if (m17676j.equals("ACTION_UNKNOWN") && c7717a.m17640c() != null) {
                    m17676j = c7717a.m17640c().toString();
                }
                sb.append(m17676j);
                if (i != m17678i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int m17674k = m17674k();
            while (m17674k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m17674k);
                m17674k &= numberOfTrailingZeros ^ (-1);
                sb.append(m17676j(numberOfTrailingZeros));
                if (m17674k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence m17654u() {
        return this.f18471a.getPackageName();
    }

    /* renamed from: u0 */
    public void m17653u0(boolean z) {
        this.f18471a.setScrollable(z);
    }

    /* renamed from: v0 */
    public void m17651v0(boolean z) {
        this.f18471a.setSelected(z);
    }

    /* renamed from: w */
    public CharSequence m17650w() {
        if (m17646y()) {
            List<Integer> m17680h = m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> m17680h2 = m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> m17680h3 = m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> m17680h4 = m17680h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f18471a.getText(), 0, this.f18471a.getText().length()));
            for (int i = 0; i < m17680h.size(); i++) {
                spannableString.setSpan(new C7714a(m17680h4.get(i).intValue(), this, m17658s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m17680h.get(i).intValue(), m17680h2.get(i).intValue(), m17680h3.get(i).intValue());
            }
            return spannableString;
        }
        return this.f18471a.getText();
    }

    /* renamed from: w0 */
    public void m17649w0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f18471a.setShowingHintText(z);
        } else {
            m17699V(4, z);
        }
    }

    /* renamed from: x */
    public String m17648x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f18471a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: x0 */
    public void m17647x0(View view) {
        this.f18473c = -1;
        this.f18471a.setSource(view);
    }

    /* renamed from: y0 */
    public void m17645y0(View view, int i) {
        this.f18473c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f18471a.setSource(view, i);
        }
    }

    /* renamed from: z0 */
    public void m17643z0(CharSequence charSequence) {
        if (C1371a.m36175a()) {
            this.f18471a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f18471a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }
}
