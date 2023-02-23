package ai.kudi.dip.library.p045i;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* compiled from: LayoutFilterBottomSheetBinding.java */
/* renamed from: ai.kudi.dip.library.i.d */
/* loaded from: classes2.dex */
public final class C0825d implements InterfaceC8209a {

    /* renamed from: a */
    private final LinearLayout f2320a;

    /* renamed from: b */
    public final ImageView f2321b;

    /* renamed from: c */
    public final RecyclerView f2322c;

    private C0825d(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, CardView cardView) {
        this.f2320a = linearLayout;
        this.f2321b = imageView;
        this.f2322c = recyclerView;
    }

    /* renamed from: a */
    public static C0825d m37927a(View view) {
        int i = C0785d.close;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C0785d.filterItemsRecyclerView;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
            if (recyclerView != null) {
                i = C0785d.notch;
                CardView cardView = (CardView) view.findViewById(i);
                if (cardView != null) {
                    return new C0825d((LinearLayout) view, imageView, recyclerView, cardView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0825d m37925c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0786e.layout_filter_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37927a(inflate);
    }

    @Override // p201g.p270x.InterfaceC8209a
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f2320a;
    }
}
