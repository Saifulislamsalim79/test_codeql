package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollbarHelper.java */
/* renamed from: androidx.recyclerview.widget.x */
/* loaded from: classes2.dex */
public class C1751x {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m34589a(RecyclerView.C1614b0 c1614b0, AbstractC1744u abstractC1744u, View view, View view2, RecyclerView.AbstractC1635p abstractC1635p, boolean z) {
        if (abstractC1635p.m35142T() == 0 || c1614b0.m35217b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC1635p.m35110n0(view) - abstractC1635p.m35110n0(view2)) + 1;
        }
        return Math.min(abstractC1744u.mo34605n(), abstractC1744u.mo34615d(view2) - abstractC1744u.mo34612g(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m34588b(RecyclerView.C1614b0 c1614b0, AbstractC1744u abstractC1744u, View view, View view2, RecyclerView.AbstractC1635p abstractC1635p, boolean z, boolean z2) {
        int max;
        if (abstractC1635p.m35142T() == 0 || c1614b0.m35217b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(abstractC1635p.m35110n0(view), abstractC1635p.m35110n0(view2));
        int max2 = Math.max(abstractC1635p.m35110n0(view), abstractC1635p.m35110n0(view2));
        if (z2) {
            max = Math.max(0, (c1614b0.m35217b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z) {
            return Math.round((max * (Math.abs(abstractC1744u.mo34615d(view2) - abstractC1744u.mo34612g(view)) / (Math.abs(abstractC1635p.m35110n0(view) - abstractC1635p.m35110n0(view2)) + 1))) + (abstractC1744u.mo34606m() - abstractC1744u.mo34612g(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m34587c(RecyclerView.C1614b0 c1614b0, AbstractC1744u abstractC1744u, View view, View view2, RecyclerView.AbstractC1635p abstractC1635p, boolean z) {
        if (abstractC1635p.m35142T() == 0 || c1614b0.m35217b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c1614b0.m35217b();
        }
        return (int) (((abstractC1744u.mo34615d(view2) - abstractC1744u.mo34612g(view)) / (Math.abs(abstractC1635p.m35110n0(view) - abstractC1635p.m35110n0(view2)) + 1)) * c1614b0.m35217b());
    }
}
