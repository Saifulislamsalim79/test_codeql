package ai.kudi.dip.library.p045i;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BottomEnterEmailAddressBinding.java */
/* renamed from: ai.kudi.dip.library.i.a */
/* loaded from: classes2.dex */
public final class C0822a implements InterfaceC8209a {

    /* renamed from: a */
    private final ConstraintLayout f2311a;

    /* renamed from: b */
    public final ImageView f2312b;

    /* renamed from: c */
    public final KudiButton f2313c;

    /* renamed from: d */
    public final KudiInputField f2314d;

    private C0822a(ConstraintLayout constraintLayout, ImageView imageView, KudiButton kudiButton, KudiInputField kudiInputField, CardView cardView, TextView textView) {
        this.f2311a = constraintLayout;
        this.f2312b = imageView;
        this.f2313c = kudiButton;
        this.f2314d = kudiInputField;
    }

    /* renamed from: a */
    public static C0822a m37937a(View view) {
        int i = C0785d.close;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C0785d.continueButton;
            KudiButton kudiButton = (KudiButton) view.findViewById(i);
            if (kudiButton != null) {
                i = C0785d.emailInputField;
                KudiInputField kudiInputField = (KudiInputField) view.findViewById(i);
                if (kudiInputField != null) {
                    i = C0785d.notch;
                    CardView cardView = (CardView) view.findViewById(i);
                    if (cardView != null) {
                        i = C0785d.textView16;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            return new C0822a((ConstraintLayout) view, imageView, kudiButton, kudiInputField, cardView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0822a m37935c(LayoutInflater layoutInflater) {
        return m37934d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C0822a m37934d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0786e.bottom_enter_email_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37937a(inflate);
    }

    @Override // p201g.p270x.InterfaceC8209a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f2311a;
    }
}
