package p201g.p227h.p238l.p239h0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AccessibilityNodeProviderCompat.java */
/* renamed from: g.h.l.h0.d */
/* loaded from: classes2.dex */
public class C7720d {

    /* renamed from: a */
    private final Object f18490a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: g.h.l.h0.d$a */
    /* loaded from: classes2.dex */
    static class C7721a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C7720d f18491a;

        C7721a(C7720d c7720d) {
            this.f18491a = c7720d;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C7716c mo17379b = this.f18491a.mo17379b(i);
            if (mo17379b == null) {
                return null;
            }
            return mo17379b.m17718D0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C7716c> m17634c = this.f18491a.m17634c(str, i);
            if (m17634c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m17634c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(m17634c.get(i2).m17718D0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f18491a.mo17377f(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: g.h.l.h0.d$b */
    /* loaded from: classes2.dex */
    static class C7722b extends C7721a {
        C7722b(C7720d c7720d) {
            super(c7720d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C7716c mo17378d = this.f18491a.mo17378d(i);
            if (mo17378d == null) {
                return null;
            }
            return mo17378d.m17718D0();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: g.h.l.h0.d$c */
    /* loaded from: classes2.dex */
    static class C7723c extends C7722b {
        C7723c(C7720d c7720d) {
            super(c7720d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f18491a.m17635a(i, C7716c.m17716E0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C7720d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f18490a = new C7723c(this);
        } else if (i >= 19) {
            this.f18490a = new C7722b(this);
        } else if (i >= 16) {
            this.f18490a = new C7721a(this);
        } else {
            this.f18490a = null;
        }
    }

    /* renamed from: a */
    public void m17635a(int i, C7716c c7716c, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C7716c mo17379b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C7716c> m17634c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C7716c mo17378d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object m17633e() {
        return this.f18490a;
    }

    /* renamed from: f */
    public boolean mo17377f(int i, int i2, Bundle bundle) {
        return false;
    }

    public C7720d(Object obj) {
        this.f18490a = obj;
    }
}
