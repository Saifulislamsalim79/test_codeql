package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.settings.insurance.p026ui.widget.NameValuePairView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentCashInsuranceBinding implements InterfaceC8209a {
    public final TextView amountPaidKoboText;
    public final TextView amountPaidLabel;
    public final TextView amountPaidText;
    public final LinearLayout employeesWrapper;
    public final ConstraintLayout fullScreenLoader;
    public final NameValuePairView insuranceDailyWithdrawalView;
    public final NameValuePairView insuranceDateCreatedView;
    private final CoordinatorLayout rootView;
    public final ConstraintLayout screenContentWrapper;
    public final Toolbar toolbar;
    public final View topDivider;

    private FragmentCashInsuranceBinding(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, ConstraintLayout constraintLayout, NameValuePairView nameValuePairView, NameValuePairView nameValuePairView2, ConstraintLayout constraintLayout2, Toolbar toolbar, View view) {
        this.rootView = coordinatorLayout;
        this.amountPaidKoboText = textView;
        this.amountPaidLabel = textView2;
        this.amountPaidText = textView3;
        this.employeesWrapper = linearLayout;
        this.fullScreenLoader = constraintLayout;
        this.insuranceDailyWithdrawalView = nameValuePairView;
        this.insuranceDateCreatedView = nameValuePairView2;
        this.screenContentWrapper = constraintLayout2;
        this.toolbar = toolbar;
        this.topDivider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCashInsuranceBinding bind(View view) {
        int $i0 = C0001R.C0003id.amount_paid_kobo_text;
        View $r1 = view.findViewById(C0001R.C0003id.amount_paid_kobo_text);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.amount_paid_label;
            View $r12 = view.findViewById(C0001R.C0003id.amount_paid_label);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0001R.C0003id.amount_paid_text;
                View $r13 = view.findViewById(C0001R.C0003id.amount_paid_text);
                TextView textView3 = (TextView) $r13;
                if (textView3 != null) {
                    $i0 = C0001R.C0003id.employees_wrapper;
                    View $r14 = view.findViewById(C0001R.C0003id.employees_wrapper);
                    LinearLayout linearLayout = (LinearLayout) $r14;
                    if (linearLayout != null) {
                        $i0 = C0001R.C0003id.full_screen_loader;
                        View $r15 = view.findViewById(C0001R.C0003id.full_screen_loader);
                        ConstraintLayout constraintLayout = (ConstraintLayout) $r15;
                        if (constraintLayout != null) {
                            $i0 = C0001R.C0003id.insurance_daily_withdrawal_view;
                            View $r16 = view.findViewById(C0001R.C0003id.insurance_daily_withdrawal_view);
                            NameValuePairView nameValuePairView = (NameValuePairView) $r16;
                            if (nameValuePairView != null) {
                                $i0 = C0001R.C0003id.insurance_date_created_view;
                                View $r17 = view.findViewById(C0001R.C0003id.insurance_date_created_view);
                                NameValuePairView $r8 = (NameValuePairView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.screen_content_wrapper;
                                    View $r18 = view.findViewById(C0001R.C0003id.screen_content_wrapper);
                                    ConstraintLayout $r9 = (ConstraintLayout) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.toolbar;
                                        View $r19 = view.findViewById(C0001R.C0003id.toolbar);
                                        Toolbar $r10 = (Toolbar) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.top_divider;
                                            View $r110 = view.findViewById(C0001R.C0003id.top_divider);
                                            if ($r110 != null) {
                                                CoordinatorLayout $r122 = (CoordinatorLayout) view;
                                                FragmentCashInsuranceBinding $r11 = new FragmentCashInsuranceBinding($r122, textView, textView2, textView3, linearLayout, constraintLayout, nameValuePairView, $r8, $r9, $r10, $r110);
                                                return $r11;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r132 = view.getResources();
        String $r142 = $r132.getResourceName($i0);
        NullPointerException $r152 = new NullPointerException("Missing required view with ID: ".concat($r142));
        throw $r152;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCashInsuranceBinding inflate(LayoutInflater layoutInflater) {
        FragmentCashInsuranceBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCashInsuranceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_cash_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCashInsuranceBinding $r3 = bind($r2);
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
    public CoordinatorLayout getRoot() {
        CoordinatorLayout r1 = this.rootView;
        return r1;
    }
}
