package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.internal.C4696r;
import java.util.Calendar;
import p201g.p227h.p237k.C7671d;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9271f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: c */
    private final Calendar f11380c;

    /* renamed from: d */
    private final boolean f11381d;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes2.dex */
    class C4576a extends C7676a {
        C4576a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            c7716c.m17689c0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m27150a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().m27043i());
        } else if (i == 130) {
            setSelection(getAdapter2().m27050b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private static int m27148c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m27147d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public C4611m getAdapter2() {
        return (C4611m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int m27051a;
        int m27148c;
        int m27051a2;
        int m27148c2;
        int width;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C4611m adapter2 = getAdapter2();
        InterfaceC4583d<?> interfaceC4583d = adapter2.f11484d;
        C4582c c4582c = adapter2.f11486f;
        Long item = adapter2.getItem(adapter2.m27050b());
        Long item2 = adapter2.getItem(adapter2.m27043i());
        for (C7671d<Long, Long> c7671d : interfaceC4583d.m27124I()) {
            Long l = c7671d.f18393a;
            if (l != null) {
                if (c7671d.f18394b != null) {
                    long longValue = l.longValue();
                    long longValue2 = c7671d.f18394b.longValue();
                    if (!m27147d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean m26685d = C4696r.m26685d(this);
                        if (longValue < item.longValue()) {
                            m27051a = adapter2.m27050b();
                            if (adapter2.m27046f(m27051a)) {
                                m27148c = 0;
                            } else if (!m26685d) {
                                m27148c = materialCalendarGridView.getChildAt(m27051a - 1).getRight();
                            } else {
                                m27148c = materialCalendarGridView.getChildAt(m27051a - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f11380c.setTimeInMillis(longValue);
                            m27051a = adapter2.m27051a(materialCalendarGridView.f11380c.get(5));
                            m27148c = m27148c(materialCalendarGridView.getChildAt(m27051a));
                        }
                        if (longValue2 > item2.longValue()) {
                            m27051a2 = Math.min(adapter2.m27043i(), getChildCount() - 1);
                            if (adapter2.m27045g(m27051a2)) {
                                m27148c2 = getWidth();
                            } else if (!m26685d) {
                                m27148c2 = materialCalendarGridView.getChildAt(m27051a2).getRight();
                            } else {
                                m27148c2 = materialCalendarGridView.getChildAt(m27051a2).getLeft();
                            }
                        } else {
                            materialCalendarGridView.f11380c.setTimeInMillis(longValue2);
                            m27051a2 = adapter2.m27051a(materialCalendarGridView.f11380c.get(5));
                            m27148c2 = m27148c(materialCalendarGridView.getChildAt(m27051a2));
                        }
                        int itemId = (int) adapter2.getItemId(m27051a);
                        int itemId2 = (int) adapter2.getItemId(m27051a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + c4582c.f11400a.m27129c();
                            int bottom = childAt.getBottom() - c4582c.f11400a.m27130b();
                            if (!m26685d) {
                                i = numColumns > m27051a ? 0 : m27148c;
                                width = m27051a2 > numColumns2 ? getWidth() : m27148c2;
                            } else {
                                int i2 = m27051a2 > numColumns2 ? 0 : m27148c2;
                                width = numColumns > m27051a ? getWidth() : m27148c;
                                i = i2;
                            }
                            canvas.drawRect(i, top, width, bottom, c4582c.f11407h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter2 = adapter2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m27150a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m27050b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().m27050b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f11381d) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m27050b()) {
            super.setSelection(getAdapter2().m27050b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11380c = C4620s.m27013k();
        if (C4601i.m27071v(getContext())) {
            setNextFocusLeftId(C9271f.cancel_button);
            setNextFocusRightId(C9271f.confirm_button);
        }
        this.f11381d = C4601i.m27070w(getContext());
        C7759x.m17498p0(this, new C4576a(this));
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C4611m) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C4611m.class.getCanonicalName()));
    }
}
