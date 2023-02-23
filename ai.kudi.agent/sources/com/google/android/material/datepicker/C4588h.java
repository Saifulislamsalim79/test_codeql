package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C1747v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p201g.p227h.p237k.C7671d;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9272g;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9275j;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes2.dex */
public final class C4588h<S> extends AbstractC4616p<S> {

    /* renamed from: D */
    static final Object f11413D = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: E */
    static final Object f11414E = "NAVIGATION_PREV_TAG";

    /* renamed from: F */
    static final Object f11415F = "NAVIGATION_NEXT_TAG";

    /* renamed from: G */
    static final Object f11416G = "SELECTOR_TOGGLE_TAG";

    /* renamed from: A */
    private RecyclerView f11417A;

    /* renamed from: B */
    private View f11418B;

    /* renamed from: C */
    private View f11419C;

    /* renamed from: d */
    private int f11420d;

    /* renamed from: e */
    private InterfaceC4583d<S> f11421e;

    /* renamed from: f */
    private C4577a f11422f;

    /* renamed from: w */
    private C4609l f11423w;

    /* renamed from: x */
    private EnumC4599k f11424x;

    /* renamed from: y */
    private C4582c f11425y;

    /* renamed from: z */
    private RecyclerView f11426z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$a */
    /* loaded from: classes2.dex */
    public class RunnableC4589a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f11427c;

        RunnableC4589a(int i) {
            this.f11427c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4588h.this.f11417A.m35253u1(this.f11427c);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$b */
    /* loaded from: classes2.dex */
    class C4590b extends C7676a {
        C4590b(C4588h c4588h) {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            c7716c.m17689c0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$c */
    /* loaded from: classes2.dex */
    class C4591c extends C4617q {

        /* renamed from: a0 */
        final /* synthetic */ int f11429a0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4591c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f11429a0 = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: V1 */
        public void mo27089V1(RecyclerView.C1614b0 c1614b0, int[] iArr) {
            if (this.f11429a0 == 0) {
                iArr[0] = C4588h.this.f11417A.getWidth();
                iArr[1] = C4588h.this.f11417A.getWidth();
                return;
            }
            iArr[0] = C4588h.this.f11417A.getHeight();
            iArr[1] = C4588h.this.f11417A.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$d */
    /* loaded from: classes2.dex */
    class C4592d implements InterfaceC4600l {
        C4592d() {
        }

        @Override // com.google.android.material.datepicker.C4588h.InterfaceC4600l
        /* renamed from: a */
        public void mo27088a(long j) {
            if (C4588h.this.f11422f.m27141f().mo27113z0(j)) {
                C4588h.this.f11421e.m27122X0(j);
                Iterator<AbstractC4615o<S>> it = C4588h.this.f11497c.iterator();
                while (it.hasNext()) {
                    it.next().mo27031a((S) C4588h.this.f11421e.m27123J0());
                }
                C4588h.this.f11417A.getAdapter().notifyDataSetChanged();
                if (C4588h.this.f11426z != null) {
                    C4588h.this.f11426z.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$e */
    /* loaded from: classes2.dex */
    public class C4593e extends RecyclerView.AbstractC1634o {

        /* renamed from: a */
        private final Calendar f11432a = C4620s.m27013k();

        /* renamed from: b */
        private final Calendar f11433b = C4620s.m27013k();

        C4593e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
            int width;
            if ((recyclerView.getAdapter() instanceof C4621t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C4621t c4621t = (C4621t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C7671d<Long, Long> c7671d : C4588h.this.f11421e.m27124I()) {
                    Long l = c7671d.f18393a;
                    if (l != null && c7671d.f18394b != null) {
                        this.f11432a.setTimeInMillis(l.longValue());
                        this.f11433b.setTimeInMillis(c7671d.f18394b.longValue());
                        int m27008c = c4621t.m27008c(this.f11432a.get(1));
                        int m27008c2 = c4621t.m27008c(this.f11433b.get(1));
                        View mo35155M = gridLayoutManager.mo35155M(m27008c);
                        View mo35155M2 = gridLayoutManager.mo35155M(m27008c2);
                        int m35445d3 = m27008c / gridLayoutManager.m35445d3();
                        int m35445d32 = m27008c2 / gridLayoutManager.m35445d3();
                        int i = m35445d3;
                        while (i <= m35445d32) {
                            View mo35155M3 = gridLayoutManager.mo35155M(gridLayoutManager.m35445d3() * i);
                            if (mo35155M3 != null) {
                                int top = mo35155M3.getTop() + C4588h.this.f11425y.f11403d.m27129c();
                                int bottom = mo35155M3.getBottom() - C4588h.this.f11425y.f11403d.m27130b();
                                int left = i == m35445d3 ? mo35155M.getLeft() + (mo35155M.getWidth() / 2) : 0;
                                if (i == m35445d32) {
                                    width = mo35155M2.getLeft() + (mo35155M2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, C4588h.this.f11425y.f11407h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$f */
    /* loaded from: classes2.dex */
    public class C4594f extends C7676a {
        C4594f() {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            String string;
            super.mo17396g(view, c7716c);
            if (C4588h.this.f11419C.getVisibility() == 0) {
                string = C4588h.this.getString(C9275j.mtrl_picker_toggle_to_year_selection);
            } else {
                string = C4588h.this.getString(C9275j.mtrl_picker_toggle_to_day_selection);
            }
            c7716c.m17671l0(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$g */
    /* loaded from: classes2.dex */
    public class C4595g extends RecyclerView.AbstractC1644u {

        /* renamed from: a */
        final /* synthetic */ C4612n f11436a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f11437b;

        C4595g(C4612n c4612n, MaterialButton materialButton) {
            this.f11436a = c4612n;
            this.f11437b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f11437b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(IjkMediaMeta.FF_PROFILE_H264_INTRA);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int m35400k2;
            if (i < 0) {
                m35400k2 = C4588h.this.getLayoutManager().m35402i2();
            } else {
                m35400k2 = C4588h.this.getLayoutManager().m35400k2();
            }
            C4588h.this.f11423w = this.f11436a.m27036b(m35400k2);
            this.f11437b.setText(this.f11436a.m27035c(m35400k2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$h */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4596h implements View.OnClickListener {
        View$OnClickListenerC4596h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4588h.this.m27108A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$i */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4597i implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C4612n f11440c;

        View$OnClickListenerC4597i(C4612n c4612n) {
            this.f11440c = c4612n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m35402i2 = C4588h.this.getLayoutManager().m35402i2() + 1;
            if (m35402i2 < C4588h.this.f11417A.getAdapter().getItemCount()) {
                C4588h.this.m27091y(this.f11440c.m27036b(m35402i2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$j */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4598j implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C4612n f11442c;

        View$OnClickListenerC4598j(C4612n c4612n) {
            this.f11442c = c4612n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m35400k2 = C4588h.this.getLayoutManager().m35400k2() - 1;
            if (m35400k2 >= 0) {
                C4588h.this.m27091y(this.f11442c.m27036b(m35400k2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$k */
    /* loaded from: classes2.dex */
    public enum EnumC4599k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.h$l */
    /* loaded from: classes2.dex */
    public interface InterfaceC4600l {
        /* renamed from: a */
        void mo27088a(long j);
    }

    /* renamed from: p */
    private void m27100p(View view, C4612n c4612n) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C9271f.month_navigation_fragment_toggle);
        materialButton.setTag(f11416G);
        C7759x.m17498p0(materialButton, new C4594f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C9271f.month_navigation_previous);
        materialButton2.setTag(f11414E);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C9271f.month_navigation_next);
        materialButton3.setTag(f11415F);
        this.f11418B = view.findViewById(C9271f.mtrl_calendar_year_selector_frame);
        this.f11419C = view.findViewById(C9271f.mtrl_calendar_day_selector_frame);
        m27090z(EnumC4599k.DAY);
        materialButton.setText(this.f11423w.m27057m(view.getContext()));
        this.f11417A.m35282l(new C4595g(c4612n, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC4596h());
        materialButton3.setOnClickListener(new View$OnClickListenerC4597i(c4612n));
        materialButton2.setOnClickListener(new View$OnClickListenerC4598j(c4612n));
    }

    /* renamed from: q */
    private RecyclerView.AbstractC1634o m27099q() {
        return new C4593e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static int m27094v(Context context) {
        return context.getResources().getDimensionPixelSize(C9267d.mtrl_calendar_day_height);
    }

    /* renamed from: w */
    public static <T> C4588h<T> m27093w(InterfaceC4583d<T> interfaceC4583d, int i, C4577a c4577a) {
        C4588h<T> c4588h = new C4588h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC4583d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4577a);
        bundle.putParcelable("CURRENT_MONTH_KEY", c4577a.m27138i());
        c4588h.setArguments(bundle);
        return c4588h;
    }

    /* renamed from: x */
    private void m27092x(int i) {
        this.f11417A.post(new RunnableC4589a(i));
    }

    /* renamed from: A */
    void m27108A() {
        EnumC4599k enumC4599k = this.f11424x;
        if (enumC4599k == EnumC4599k.YEAR) {
            m27090z(EnumC4599k.DAY);
        } else if (enumC4599k == EnumC4599k.DAY) {
            m27090z(EnumC4599k.YEAR);
        }
    }

    @Override // com.google.android.material.datepicker.AbstractC4616p
    /* renamed from: e */
    public boolean mo27030e(AbstractC4615o<S> abstractC4615o) {
        return super.mo27030e(abstractC4615o);
    }

    LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.f11417A.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11420d = bundle.getInt("THEME_RES_ID_KEY");
        this.f11421e = (InterfaceC4583d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f11422f = (C4577a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f11423w = (C4609l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f11420d);
        this.f11425y = new C4582c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C4609l m27137j = this.f11422f.m27137j();
        if (C4601i.m27071v(contextThemeWrapper)) {
            i = C9273h.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C9273h.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C9271f.mtrl_calendar_days_of_week);
        C7759x.m17498p0(gridView, new C4590b(this));
        gridView.setAdapter((ListAdapter) new C4587g());
        gridView.setNumColumns(m27137j.f11478f);
        gridView.setEnabled(false);
        this.f11417A = (RecyclerView) inflate.findViewById(C9271f.mtrl_calendar_months);
        this.f11417A.setLayoutManager(new C4591c(getContext(), i2, false, i2));
        this.f11417A.setTag(f11413D);
        C4612n c4612n = new C4612n(contextThemeWrapper, this.f11421e, this.f11422f, new C4592d());
        this.f11417A.setAdapter(c4612n);
        int integer = contextThemeWrapper.getResources().getInteger(C9272g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C9271f.mtrl_calendar_year_selector_frame);
        this.f11426z = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f11426z.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f11426z.setAdapter(new C4621t(this));
            this.f11426z.m35294h(m27099q());
        }
        if (inflate.findViewById(C9271f.month_navigation_fragment_toggle) != null) {
            m27100p(inflate, c4612n);
        }
        if (!C4601i.m27071v(contextThemeWrapper)) {
            new C1747v().mo34559b(this.f11417A);
        }
        this.f11417A.m35277m1(c4612n.m27034d(this.f11423w));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f11420d);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f11421e);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11422f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f11423w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C4577a m27098r() {
        return this.f11422f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C4582c m27097s() {
        return this.f11425y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C4609l m27096t() {
        return this.f11423w;
    }

    /* renamed from: u */
    public InterfaceC4583d<S> m27095u() {
        return this.f11421e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m27091y(C4609l c4609l) {
        C4612n c4612n = (C4612n) this.f11417A.getAdapter();
        int m27034d = c4612n.m27034d(c4609l);
        int m27034d2 = m27034d - c4612n.m27034d(this.f11423w);
        boolean z = Math.abs(m27034d2) > 3;
        boolean z2 = m27034d2 > 0;
        this.f11423w = c4609l;
        if (z && z2) {
            this.f11417A.m35277m1(m27034d - 3);
            m27092x(m27034d);
        } else if (z) {
            this.f11417A.m35277m1(m27034d + 3);
            m27092x(m27034d);
        } else {
            m27092x(m27034d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m27090z(EnumC4599k enumC4599k) {
        this.f11424x = enumC4599k;
        if (enumC4599k == EnumC4599k.YEAR) {
            this.f11426z.getLayoutManager().mo32365F1(((C4621t) this.f11426z.getAdapter()).m27008c(this.f11423w.f11477e));
            this.f11418B.setVisibility(0);
            this.f11419C.setVisibility(8);
        } else if (enumC4599k == EnumC4599k.DAY) {
            this.f11418B.setVisibility(8);
            this.f11419C.setVisibility(0);
            m27091y(this.f11423w);
        }
    }
}
