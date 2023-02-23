package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9275j;
/* compiled from: DaysOfWeekAdapter.java */
/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes2.dex */
class C4587g extends BaseAdapter {

    /* renamed from: f */
    private static final int f11409f;

    /* renamed from: c */
    private final Calendar f11410c;

    /* renamed from: d */
    private final int f11411d;

    /* renamed from: e */
    private final int f11412e;

    static {
        f11409f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C4587g() {
        Calendar m27013k = C4620s.m27013k();
        this.f11410c = m27013k;
        this.f11411d = m27013k.getMaximum(7);
        this.f11412e = this.f11410c.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m27109b(int i) {
        int i2 = i + this.f11412e;
        int i3 = this.f11411d;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f11411d) {
            return null;
        }
        return Integer.valueOf(m27109b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f11411d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C9273h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f11410c.set(7, m27109b(i));
        textView.setText(this.f11410c.getDisplayName(7, f11409f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C9275j.mtrl_picker_day_of_week_column_header), this.f11410c.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
