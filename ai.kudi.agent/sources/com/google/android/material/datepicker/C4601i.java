package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC1449b0;
import com.google.android.material.datepicker.C4577a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9270e;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p336t.View$OnTouchListenerC9311a;
import p272h.p286c.p287a.p323c.p342z.C9320b;
/* compiled from: MaterialDatePicker.java */
/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes2.dex */
public final class C4601i<S> extends androidx.fragment.app.h {

    /* renamed from: J */
    static final Object f11447J = "CONFIRM_BUTTON_TAG";

    /* renamed from: K */
    static final Object f11448K = "CANCEL_BUTTON_TAG";

    /* renamed from: L */
    static final Object f11449L = "TOGGLE_BUTTON_TAG";

    /* renamed from: A */
    private C4588h<S> f11450A;

    /* renamed from: B */
    private int f11451B;

    /* renamed from: C */
    private CharSequence f11452C;

    /* renamed from: D */
    private boolean f11453D;

    /* renamed from: E */
    private int f11454E;

    /* renamed from: F */
    private TextView f11455F;

    /* renamed from: G */
    private CheckableImageButton f11456G;

    /* renamed from: H */
    private C9243g f11457H;

    /* renamed from: I */
    private Button f11458I;

    /* renamed from: c */
    private final LinkedHashSet<InterfaceC4606j<? super S>> f11459c = new LinkedHashSet<>();

    /* renamed from: d */
    private final LinkedHashSet<View.OnClickListener> f11460d = new LinkedHashSet<>();

    /* renamed from: e */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f11461e = new LinkedHashSet<>();

    /* renamed from: f */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f11462f = new LinkedHashSet<>();

    /* renamed from: w */
    private int f11463w;

    /* renamed from: x */
    private InterfaceC4583d<S> f11464x;

    /* renamed from: y */
    private AbstractC4616p<S> f11465y;

    /* renamed from: z */
    private C4577a f11466z;

    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.i$a */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC4602a implements View.OnClickListener {
        View$OnClickListenerC4602a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C4601i.this.f11459c.iterator();
            while (it.hasNext()) {
                ((InterfaceC4606j) it.next()).m27066a(C4601i.this.m27074s());
            }
            C4601i.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.i$b */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC4603b implements View.OnClickListener {
        View$OnClickListenerC4603b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C4601i.this.f11460d.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C4601i.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.i$c */
    /* loaded from: classes2.dex */
    public class C4604c extends AbstractC4615o<S> {
        C4604c() {
        }

        @Override // com.google.android.material.datepicker.AbstractC4615o
        /* renamed from: a */
        public void mo27031a(S s) {
            C4601i.this.m27067z();
            C4601i.this.f11458I.setEnabled(C4601i.this.f11464x.m27127D0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.i$d */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4605d implements View.OnClickListener {
        View$OnClickListenerC4605d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4601i.this.f11458I.setEnabled(C4601i.this.f11464x.m27127D0());
            C4601i.this.f11456G.toggle();
            C4601i c4601i = C4601i.this;
            c4601i.m27087A(c4601i.f11456G);
            C4601i.this.m27068y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m27087A(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f11456G.isChecked()) {
            string = checkableImageButton.getContext().getString(C9275j.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(C9275j.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f11456G.setContentDescription(string);
    }

    /* renamed from: o */
    private static Drawable m27078o(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C7462a.m18690d(context, C9270e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C7462a.m18690d(context, C9270e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: p */
    private static int m27077p(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C9267d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C9267d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C9267d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C9267d.mtrl_calendar_days_of_week_height);
        return dimensionPixelSize + dimensionPixelSize2 + (C4611m.f11482x * resources.getDimensionPixelSize(C9267d.mtrl_calendar_day_height)) + ((C4611m.f11482x - 1) * resources.getDimensionPixelOffset(C9267d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C9267d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: r */
    private static int m27075r(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C9267d.mtrl_calendar_content_padding);
        int i = C4609l.m27061g().f11478f;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C9267d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C9267d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: t */
    private int m27073t(Context context) {
        int i = this.f11463w;
        return i != 0 ? i : this.f11464x.m27120x0(context);
    }

    /* renamed from: u */
    private void m27072u(Context context) {
        this.f11456G.setTag(f11449L);
        this.f11456G.setImageDrawable(m27078o(context));
        this.f11456G.setChecked(this.f11454E != 0);
        C7759x.m17498p0(this.f11456G, null);
        m27087A(this.f11456G);
        this.f11456G.setOnClickListener(new View$OnClickListenerC4605d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static boolean m27071v(Context context) {
        return m27069x(context, 16843277);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static boolean m27070w(Context context) {
        return m27069x(context, C9233b.nestedScrollable);
    }

    /* renamed from: x */
    static boolean m27069x(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C9320b.m15055c(context, C9233b.materialCalendarStyle, C4588h.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public void m27068y() {
        int m27073t = m27073t(requireContext());
        this.f11450A = C4588h.m27093w(this.f11464x, m27073t, this.f11466z);
        this.f11465y = this.f11456G.isChecked() ? C4607k.m27065h(this.f11464x, m27073t, this.f11466z) : this.f11450A;
        m27067z();
        AbstractC1449b0 m35924l = getChildFragmentManager().m35924l();
        m35924l.m35821r(C9271f.mtrl_calendar_frame, this.f11465y);
        m35924l.mo35803k();
        this.f11465y.mo27030e(new C4604c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public void m27067z() {
        String m27076q = m27076q();
        this.f11455F.setContentDescription(String.format(getString(C9275j.mtrl_picker_announce_current_selection), m27076q));
        this.f11455F.setText(m27076q);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f11461e.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11463w = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f11464x = (InterfaceC4583d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f11466z = (C4577a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f11451B = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f11452C = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f11454E = bundle.getInt("INPUT_MODE_KEY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m27073t(requireContext()));
        Context context = dialog.getContext();
        this.f11453D = m27071v(context);
        int m15055c = C9320b.m15055c(context, C9233b.colorSurface, C4601i.class.getCanonicalName());
        C9243g c9243g = new C9243g(context, null, C9233b.materialCalendarStyle, C9276k.Widget_MaterialComponents_MaterialCalendar);
        this.f11457H = c9243g;
        c9243g.m15420M(context);
        this.f11457H.m15409X(ColorStateList.valueOf(m15055c));
        this.f11457H.m15410W(C7759x.m17485w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f11453D ? C9273h.mtrl_picker_fullscreen : C9273h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f11453D) {
            inflate.findViewById(C9271f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m27075r(context), -2));
        } else {
            View findViewById = inflate.findViewById(C9271f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C9271f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m27075r(context), -1));
            findViewById2.setMinimumHeight(m27077p(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(C9271f.mtrl_picker_header_selection_text);
        this.f11455F = textView;
        C7759x.m17494r0(textView, 1);
        this.f11456G = (CheckableImageButton) inflate.findViewById(C9271f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C9271f.mtrl_picker_title_text);
        CharSequence charSequence = this.f11452C;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f11451B);
        }
        m27072u(context);
        this.f11458I = (Button) inflate.findViewById(C9271f.confirm_button);
        if (this.f11464x.m27127D0()) {
            this.f11458I.setEnabled(true);
        } else {
            this.f11458I.setEnabled(false);
        }
        this.f11458I.setTag(f11447J);
        this.f11458I.setOnClickListener(new View$OnClickListenerC4602a());
        Button button = (Button) inflate.findViewById(C9271f.cancel_button);
        button.setTag(f11448K);
        button.setOnClickListener(new View$OnClickListenerC4603b());
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f11462f.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f11463w);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f11464x);
        C4577a.C4579b c4579b = new C4577a.C4579b(this.f11466z);
        if (this.f11450A.m27096t() != null) {
            c4579b.m27132b(this.f11450A.m27096t().f11480x);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4579b.m27133a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f11451B);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f11452C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f11453D) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f11457H);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C9267d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f11457H, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC9311a(requireDialog(), rect));
        }
        m27068y();
    }

    public void onStop() {
        this.f11465y.m27029f();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public String m27076q() {
        return this.f11464x.m27126F(getContext());
    }

    /* renamed from: s */
    public final S m27074s() {
        return this.f11464x.m27123J0();
    }
}
