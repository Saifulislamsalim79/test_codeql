package p201g.p227h.p238l;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p201g.p227h.C7601c;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p227h.p238l.p239h0.C7720d;
/* compiled from: AccessibilityDelegateCompat.java */
/* renamed from: g.h.l.a */
/* loaded from: classes2.dex */
public class C7676a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f18398c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f18399a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f18400b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: g.h.l.a$a */
    /* loaded from: classes2.dex */
    public static final class C7677a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C7676a f18401a;

        C7677a(C7676a c7676a) {
            this.f18401a = c7676a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f18401a.mo17864a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C7720d mo17398b = this.f18401a.mo17398b(view);
            if (mo17398b != null) {
                return (AccessibilityNodeProvider) mo17398b.m17633e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f18401a.mo17397f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C7716c m17716E0 = C7716c.m17716E0(accessibilityNodeInfo);
            m17716E0.m17655t0(C7759x.m17532X(view));
            m17716E0.m17673k0(C7759x.m17537S(view));
            m17716E0.m17663p0(C7759x.m17499p(view));
            m17716E0.m17643z0(C7759x.m17545L(view));
            this.f18401a.mo17396g(view, m17716E0);
            m17716E0.m17684f(accessibilityNodeInfo.getText(), view);
            List<C7716c.C7717a> m17863c = C7676a.m17863c(view);
            for (int i = 0; i < m17863c.size(); i++) {
                m17716E0.m17692b(m17863c.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f18401a.mo17860h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f18401a.mo17859i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f18401a.mo17858j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f18401a.mo17856l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f18401a.mo17855m(view, accessibilityEvent);
        }
    }

    public C7676a() {
        this(f18398c);
    }

    /* renamed from: c */
    static List<C7716c.C7717a> m17863c(View view) {
        List<C7716c.C7717a> list = (List) view.getTag(C7601c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m17861e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m17662q = C7716c.m17662q(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; m17662q != null && i < m17662q.length; i++) {
                if (clickableSpan.equals(m17662q[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m17857k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C7601c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (m17861e(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo17864a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f18399a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C7720d mo17398b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f18399a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C7720d(accessibilityNodeProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate m17862d() {
        return this.f18400b;
    }

    /* renamed from: f */
    public void mo17397f(View view, AccessibilityEvent accessibilityEvent) {
        this.f18399a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo17396g(View view, C7716c c7716c) {
        this.f18399a.onInitializeAccessibilityNodeInfo(view, c7716c.m17718D0());
    }

    /* renamed from: h */
    public void mo17860h(View view, AccessibilityEvent accessibilityEvent) {
        this.f18399a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo17859i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f18399a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo17858j(View view, int i, Bundle bundle) {
        List<C7716c.C7717a> m17863c = m17863c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= m17863c.size()) {
                break;
            }
            C7716c.C7717a c7717a = m17863c.get(i2);
            if (c7717a.m17641b() == i) {
                z = c7717a.m17639d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f18399a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C7601c.accessibility_action_clickable_span) ? z : m17857k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo17856l(View view, int i) {
        this.f18399a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo17855m(View view, AccessibilityEvent accessibilityEvent) {
        this.f18399a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C7676a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f18399a = accessibilityDelegate;
        this.f18400b = new C7677a(this);
    }
}
