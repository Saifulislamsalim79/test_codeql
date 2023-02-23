package ai.kudi.dip.library.p045i;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* compiled from: RatingBarItemBinding.java */
/* renamed from: ai.kudi.dip.library.i.f */
/* loaded from: classes2.dex */
public final class C0827f implements InterfaceC8209a {

    /* renamed from: a */
    private final ConstraintLayout f2326a;

    /* renamed from: b */
    public final ImageView f2327b;

    private C0827f(ConstraintLayout constraintLayout, ImageView imageView) {
        this.f2326a = constraintLayout;
        this.f2327b = imageView;
    }

    /* renamed from: a */
    public static C0827f m37921a(View view) {
        int i = C0785d.ratingBarImageView;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            return new C0827f((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0827f m37919c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0786e.rating_bar_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37921a(inflate);
    }

    @Override // p201g.p270x.InterfaceC8209a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f2326a;
    }
}
