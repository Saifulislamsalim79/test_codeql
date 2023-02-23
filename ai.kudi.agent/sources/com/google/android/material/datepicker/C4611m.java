package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthAdapter.java */
/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes2.dex */
public class C4611m extends BaseAdapter {

    /* renamed from: x */
    static final int f11482x = C4620s.m27013k().getMaximum(4);

    /* renamed from: c */
    final C4609l f11483c;

    /* renamed from: d */
    final InterfaceC4583d<?> f11484d;

    /* renamed from: e */
    private Collection<Long> f11485e;

    /* renamed from: f */
    C4582c f11486f;

    /* renamed from: w */
    final C4577a f11487w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4611m(C4609l c4609l, InterfaceC4583d<?> interfaceC4583d, C4577a c4577a) {
        this.f11483c = c4609l;
        this.f11484d = interfaceC4583d;
        this.f11487w = c4577a;
        this.f11485e = interfaceC4583d.m27125F0();
    }

    /* renamed from: e */
    private void m27047e(Context context) {
        if (this.f11486f == null) {
            this.f11486f = new C4582c(context);
        }
    }

    /* renamed from: h */
    private boolean m27044h(long j) {
        Iterator<Long> it = this.f11484d.m27125F0().iterator();
        while (it.hasNext()) {
            if (C4620s.m27023a(j) == C4620s.m27023a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m27041k(TextView textView, long j) {
        C4581b c4581b;
        if (textView == null) {
            return;
        }
        if (this.f11487w.m27141f().mo27113z0(j)) {
            textView.setEnabled(true);
            if (m27044h(j)) {
                c4581b = this.f11486f.f11401b;
            } else if (C4620s.m27015i().getTimeInMillis() == j) {
                c4581b = this.f11486f.f11402c;
            } else {
                c4581b = this.f11486f.f11400a;
            }
        } else {
            textView.setEnabled(false);
            c4581b = this.f11486f.f11406g;
        }
        c4581b.m27128d(textView);
    }

    /* renamed from: l */
    private void m27040l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (C4609l.m27062e(j).equals(this.f11483c)) {
            m27041k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().m27051a(this.f11483c.m27058j(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m27051a(int i) {
        return m27050b() + (i - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m27050b() {
        return this.f11483c.m27060h();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f11483c.m27060h() || i > m27043i()) {
            return null;
        }
        return Long.valueOf(this.f11483c.m27059i(m27042j(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m27047e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p272h.p286c.p287a.p323c.C9273h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.m27050b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.l r8 = r5.f11483c
            int r2 = r8.f11479w
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f11483c
            long r7 = r8.m27059i(r7)
            com.google.android.material.datepicker.l r3 = r5.f11483c
            int r3 = r3.f11477e
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.C4609l.m27061g()
            int r4 = r4.f11477e
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.C4584e.m27119a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.C4584e.m27116d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.m27041k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C4611m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m27046f(int i) {
        return i % this.f11483c.f11478f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m27045g(int i) {
        return (i + 1) % this.f11483c.f11478f == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f11483c.f11479w + m27050b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f11483c.f11478f;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m27043i() {
        return (this.f11483c.m27060h() + this.f11483c.f11479w) - 1;
    }

    /* renamed from: j */
    int m27042j(int i) {
        return (i - this.f11483c.m27060h()) + 1;
    }

    /* renamed from: m */
    public void m27039m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.f11485e) {
            m27040l(materialCalendarGridView, l.longValue());
        }
        InterfaceC4583d<?> interfaceC4583d = this.f11484d;
        if (interfaceC4583d != null) {
            for (Long l2 : interfaceC4583d.m27125F0()) {
                m27040l(materialCalendarGridView, l2.longValue());
            }
            this.f11485e = this.f11484d.m27125F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m27038n(int i) {
        return i >= m27050b() && i <= m27043i();
    }
}
