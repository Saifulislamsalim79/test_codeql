package ai.kudi.dip.library.p045i;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* compiled from: LayoutSingleOptionItemBinding.java */
/* renamed from: ai.kudi.dip.library.i.e */
/* loaded from: classes2.dex */
public final class C0826e implements InterfaceC8209a {

    /* renamed from: a */
    private final LinearLayout f2323a;

    /* renamed from: b */
    public final ImageView f2324b;

    /* renamed from: c */
    public final TextView f2325c;

    private C0826e(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        this.f2323a = linearLayout;
        this.f2324b = imageView;
        this.f2325c = textView;
    }

    /* renamed from: a */
    public static C0826e m37924a(View view) {
        int i = C0785d.iv_check_icon;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = C0785d.tv_check_text;
            TextView textView = (TextView) view.findViewById(i2);
            if (textView != null) {
                return new C0826e(linearLayout, imageView, linearLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0826e m37922c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0786e.layout_single_option_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37924a(inflate);
    }

    @Override // p201g.p270x.InterfaceC8209a
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f2323a;
    }
}
