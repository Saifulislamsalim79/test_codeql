package ai.kudi.dip.library.p045i;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KudiCustomButtonBinding.java */
/* renamed from: ai.kudi.dip.library.i.c */
/* loaded from: classes2.dex */
public final class C0824c implements InterfaceC8209a {

    /* renamed from: a */
    private final ConstraintLayout f2318a;

    /* renamed from: b */
    public final CamomileSpinner f2319b;

    private C0824c(ConstraintLayout constraintLayout, CamomileSpinner camomileSpinner) {
        this.f2318a = constraintLayout;
        this.f2319b = camomileSpinner;
    }

    /* renamed from: a */
    public static C0824c m37930a(View view) {
        int i = C0785d.loader;
        CamomileSpinner camomileSpinner = (CamomileSpinner) view.findViewById(i);
        if (camomileSpinner != null) {
            return new C0824c((ConstraintLayout) view, camomileSpinner);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0824c m37928c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0786e.kudi_custom_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37930a(inflate);
    }

    @Override // p201g.p270x.InterfaceC8209a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f2318a;
    }
}
