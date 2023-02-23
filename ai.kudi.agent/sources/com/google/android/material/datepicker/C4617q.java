package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1734o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SmoothCalendarLayoutManager.java */
/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes2.dex */
class C4617q extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* renamed from: com.google.android.material.datepicker.q$a */
    /* loaded from: classes2.dex */
    class C4618a extends C1734o {
        C4618a(C4617q c4617q, Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1734o
        /* renamed from: v */
        protected float mo27027v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4617q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: R1 */
    public void mo27028R1(RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0, int i) {
        C4618a c4618a = new C4618a(this, recyclerView.getContext());
        c4618a.m35226p(i);
        m35143S1(c4618a);
    }
}
