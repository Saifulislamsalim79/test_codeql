package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewAccountsInsuranceBinding implements InterfaceC8209a {
    public final ConstraintLayout cashInsuranceContainer;
    public final TextView insuranceContaineerText;
    public final ImageView insuranceeContainerImage;
    public final TextView kycLevelValueView;
    private final CardView rootView;
    public final KudiTextView textView41;
    public final TextView textView42;
    public final TextView upgradeAccountTextView;
    public final View viewTop;

    private ViewAccountsInsuranceBinding(CardView cardView, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, KudiTextView kudiTextView, TextView textView3, TextView textView4, View view) {
        this.rootView = cardView;
        this.cashInsuranceContainer = constraintLayout;
        this.insuranceContaineerText = textView;
        this.insuranceeContainerImage = imageView;
        this.kycLevelValueView = textView2;
        this.textView41 = kudiTextView;
        this.textView42 = textView3;
        this.upgradeAccountTextView = textView4;
        this.viewTop = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewAccountsInsuranceBinding bind(View view) {
        int $i0 = C0001R.C0003id.cash_insurance_container;
        View $r1 = view.findViewById(C0001R.C0003id.cash_insurance_container);
        ConstraintLayout $r2 = (ConstraintLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.insurance_containeer_text;
            View $r12 = view.findViewById(C0001R.C0003id.insurance_containeer_text);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.insurancee_container_image;
                View $r13 = view.findViewById(C0001R.C0003id.insurancee_container_image);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0001R.C0003id.kycLevelValueView;
                    View $r14 = view.findViewById(C0001R.C0003id.kycLevelValueView);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.textView41;
                        View $r15 = view.findViewById(C0001R.C0003id.textView41);
                        KudiTextView kudiTextView = (KudiTextView) $r15;
                        if (kudiTextView != null) {
                            $i0 = C0001R.C0003id.textView42;
                            View $r16 = view.findViewById(C0001R.C0003id.textView42);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                $i0 = C0001R.C0003id.upgradeAccountTextView;
                                View $r17 = view.findViewById(C0001R.C0003id.upgradeAccountTextView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.viewTop;
                                    View $r18 = view.findViewById(C0001R.C0003id.viewTop);
                                    if ($r18 != null) {
                                        CardView $r10 = (CardView) view;
                                        ViewAccountsInsuranceBinding $r9 = new ViewAccountsInsuranceBinding($r10, $r2, textView, imageView, textView2, kudiTextView, textView3, $r8, $r18);
                                        return $r9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewAccountsInsuranceBinding inflate(LayoutInflater layoutInflater) {
        ViewAccountsInsuranceBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewAccountsInsuranceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_accounts_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewAccountsInsuranceBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public CardView getRoot() {
        CardView r1 = this.rootView;
        return r1;
    }
}
