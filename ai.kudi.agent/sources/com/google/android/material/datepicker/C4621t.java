package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C4588h;
import java.util.Calendar;
import java.util.Locale;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9275j;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YearGridAdapter.java */
/* renamed from: com.google.android.material.datepicker.t */
/* loaded from: classes2.dex */
public class C4621t extends RecyclerView.AbstractC1623h<C4623b> {

    /* renamed from: a */
    private final C4588h<?> f11502a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearGridAdapter.java */
    /* renamed from: com.google.android.material.datepicker.t$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4622a implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ int f11503c;

        View$OnClickListenerC4622a(int i) {
            this.f11503c = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4621t.this.f11502a.m27091y(C4621t.this.f11502a.m27098r().m27142e(C4609l.m27063b(this.f11503c, C4621t.this.f11502a.m27096t().f11476d)));
            C4621t.this.f11502a.m27090z(C4588h.EnumC4599k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    /* renamed from: com.google.android.material.datepicker.t$b */
    /* loaded from: classes2.dex */
    public static class C4623b extends RecyclerView.AbstractC1620e0 {

        /* renamed from: a */
        final TextView f11505a;

        C4623b(TextView textView) {
            super(textView);
            this.f11505a = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4621t(C4588h<?> c4588h) {
        this.f11502a = c4588h;
    }

    /* renamed from: b */
    private View.OnClickListener m27009b(int i) {
        return new View$OnClickListenerC4622a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m27008c(int i) {
        return i - this.f11502a.m27098r().m27137j().f11477e;
    }

    /* renamed from: d */
    int m27007d(int i) {
        return this.f11502a.m27098r().m27137j().f11477e + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: e */
    public void onBindViewHolder(C4623b c4623b, int i) {
        int m27007d = m27007d(i);
        String string = c4623b.f11505a.getContext().getString(C9275j.mtrl_picker_navigate_to_year_description);
        c4623b.f11505a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m27007d)));
        c4623b.f11505a.setContentDescription(String.format(string, Integer.valueOf(m27007d)));
        C4582c m27097s = this.f11502a.m27097s();
        Calendar m27015i = C4620s.m27015i();
        C4581b c4581b = m27015i.get(1) == m27007d ? m27097s.f11405f : m27097s.f11403d;
        for (Long l : this.f11502a.m27095u().m27125F0()) {
            m27015i.setTimeInMillis(l.longValue());
            if (m27015i.get(1) == m27007d) {
                c4581b = m27097s.f11404e;
            }
        }
        c4581b.m27128d(c4623b.f11505a);
        c4623b.f11505a.setOnClickListener(m27009b(m27007d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: f */
    public C4623b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4623b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C9273h.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.f11502a.m27098r().m27136k();
    }
}
