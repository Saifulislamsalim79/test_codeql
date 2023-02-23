package ai.kudi.dip.library.p045i;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CustomListFilterViewBinding.java */
/* renamed from: ai.kudi.dip.library.i.b */
/* loaded from: classes2.dex */
public final class C0823b implements InterfaceC8209a {

    /* renamed from: a */
    private final CardView f2315a;

    /* renamed from: b */
    public final AppCompatTextView f2316b;

    /* renamed from: c */
    public final AppCompatTextView f2317c;

    private C0823b(CardView cardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearLayout linearLayout) {
        this.f2315a = cardView;
        this.f2316b = appCompatTextView;
        this.f2317c = appCompatTextView2;
    }

    /* renamed from: a */
    public static C0823b m37933a(View view) {
        int i = C0785d.dateTextView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
        if (appCompatTextView != null) {
            i = C0785d.filterAction;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(i);
            if (appCompatTextView2 != null) {
                i = C0785d.layoutZero;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                if (linearLayout != null) {
                    return new C0823b((CardView) view, appCompatTextView, appCompatTextView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0823b m37931c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0786e.custom_list_filter_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37933a(inflate);
    }

    @Override // p201g.p270x.InterfaceC8209a
    /* renamed from: b */
    public CardView getRoot() {
        return this.f2315a;
    }
}
