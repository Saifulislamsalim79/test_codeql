package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C4588h;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
/* compiled from: MonthsPagerAdapter.java */
/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes2.dex */
class C4612n extends RecyclerView.AbstractC1623h<C4614b> {

    /* renamed from: a */
    private final Context f11488a;

    /* renamed from: b */
    private final C4577a f11489b;

    /* renamed from: c */
    private final InterfaceC4583d<?> f11490c;

    /* renamed from: d */
    private final C4588h.InterfaceC4600l f11491d;

    /* renamed from: e */
    private final int f11492e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonthsPagerAdapter.java */
    /* renamed from: com.google.android.material.datepicker.n$a */
    /* loaded from: classes2.dex */
    public class C4613a implements AdapterView.OnItemClickListener {

        /* renamed from: c */
        final /* synthetic */ MaterialCalendarGridView f11493c;

        C4613a(MaterialCalendarGridView materialCalendarGridView) {
            this.f11493c = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f11493c.getAdapter2().m27038n(i)) {
                C4612n.this.f11491d.mo27088a(this.f11493c.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    /* renamed from: com.google.android.material.datepicker.n$b */
    /* loaded from: classes2.dex */
    public static class C4614b extends RecyclerView.AbstractC1620e0 {

        /* renamed from: a */
        final TextView f11495a;

        /* renamed from: b */
        final MaterialCalendarGridView f11496b;

        C4614b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C9271f.month_title);
            this.f11495a = textView;
            C7759x.m17496q0(textView, true);
            this.f11496b = (MaterialCalendarGridView) linearLayout.findViewById(C9271f.month_grid);
            if (z) {
                return;
            }
            this.f11495a.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4612n(Context context, InterfaceC4583d<?> interfaceC4583d, C4577a c4577a, C4588h.InterfaceC4600l interfaceC4600l) {
        C4609l m27137j = c4577a.m27137j();
        C4609l m27140g = c4577a.m27140g();
        C4609l m27138i = c4577a.m27138i();
        if (m27137j.compareTo(m27138i) <= 0) {
            if (m27138i.compareTo(m27140g) <= 0) {
                int m27094v = C4611m.f11482x * C4588h.m27094v(context);
                int m27094v2 = C4601i.m27071v(context) ? C4588h.m27094v(context) : 0;
                this.f11488a = context;
                this.f11492e = m27094v + m27094v2;
                this.f11489b = c4577a;
                this.f11490c = interfaceC4583d;
                this.f11491d = interfaceC4600l;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C4609l m27036b(int i) {
        return this.f11489b.m27137j().m27055p(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public CharSequence m27035c(int i) {
        return m27036b(i).m27057m(this.f11488a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m27034d(C4609l c4609l) {
        return this.f11489b.m27137j().m27054q(c4609l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: e */
    public void onBindViewHolder(C4614b c4614b, int i) {
        C4609l m27055p = this.f11489b.m27137j().m27055p(i);
        c4614b.f11495a.setText(m27055p.m27057m(c4614b.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c4614b.f11496b.findViewById(C9271f.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && m27055p.equals(materialCalendarGridView.getAdapter2().f11483c)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m27039m(materialCalendarGridView);
        } else {
            C4611m c4611m = new C4611m(m27055p, this.f11490c, this.f11489b);
            materialCalendarGridView.setNumColumns(m27055p.f11478f);
            materialCalendarGridView.setAdapter((ListAdapter) c4611m);
        }
        materialCalendarGridView.setOnItemClickListener(new C4613a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: f */
    public C4614b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C9273h.mtrl_calendar_month_labeled, viewGroup, false);
        if (C4601i.m27071v(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.C1640q(-1, this.f11492e));
            return new C4614b(linearLayout, true);
        }
        return new C4614b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.f11489b.m27139h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public long getItemId(int i) {
        return this.f11489b.m27137j().m27055p(i).m27056n();
    }
}
