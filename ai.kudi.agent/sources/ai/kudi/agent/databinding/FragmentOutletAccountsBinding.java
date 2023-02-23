package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOutletAccountsBinding implements InterfaceC8209a {
    public final TextView accountGetPosTextView;
    public final ConstraintLayout accountNumbersContainer;
    public final TextView accountNumbersContainerTitle;
    public final TextView activateFreePosView;
    public final KudiButton buyPosButton;
    public final View divider;
    public final PosAccountEmptyStateBinding emptyPosView;
    public final ViewAccountsInsuranceBinding insuranceContainer;
    public final ViewCashInsuranceOutletMgtBinding insuranceOutletMgtContainer;
    public final ConstraintLayout posContainer;
    public final TextView posContainerTitle;
    public final ProgressBar posDetailsLoader;
    public final ViewPosInfoBinding posInfo;
    public final TextView posStatusDesc;
    private final NestedScrollView rootView;
    public final ViewTrackPosBinding trackPOS;

    private FragmentOutletAccountsBinding(NestedScrollView nestedScrollView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, KudiButton kudiButton, View view, PosAccountEmptyStateBinding posAccountEmptyStateBinding, ViewAccountsInsuranceBinding viewAccountsInsuranceBinding, ViewCashInsuranceOutletMgtBinding viewCashInsuranceOutletMgtBinding, ConstraintLayout constraintLayout2, TextView textView4, ProgressBar progressBar, ViewPosInfoBinding viewPosInfoBinding, TextView textView5, ViewTrackPosBinding viewTrackPosBinding) {
        this.rootView = nestedScrollView;
        this.accountGetPosTextView = textView;
        this.accountNumbersContainer = constraintLayout;
        this.accountNumbersContainerTitle = textView2;
        this.activateFreePosView = textView3;
        this.buyPosButton = kudiButton;
        this.divider = view;
        this.emptyPosView = posAccountEmptyStateBinding;
        this.insuranceContainer = viewAccountsInsuranceBinding;
        this.insuranceOutletMgtContainer = viewCashInsuranceOutletMgtBinding;
        this.posContainer = constraintLayout2;
        this.posContainerTitle = textView4;
        this.posDetailsLoader = progressBar;
        this.posInfo = viewPosInfoBinding;
        this.posStatusDesc = textView5;
        this.trackPOS = viewTrackPosBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletAccountsBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountGetPosTextView;
        View $r1 = view.findViewById(C0001R.C0003id.accountGetPosTextView);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.accountNumbersContainer;
            View $r12 = view.findViewById(C0001R.C0003id.accountNumbersContainer);
            ConstraintLayout constraintLayout = (ConstraintLayout) $r12;
            if (constraintLayout != null) {
                $i0 = C0001R.C0003id.accountNumbersContainerTitle;
                View $r13 = view.findViewById(C0001R.C0003id.accountNumbersContainerTitle);
                TextView textView2 = (TextView) $r13;
                if (textView2 != null) {
                    $i0 = C0001R.C0003id.activateFreePosView;
                    View $r14 = view.findViewById(C0001R.C0003id.activateFreePosView);
                    TextView textView3 = (TextView) $r14;
                    if (textView3 != null) {
                        $i0 = C0001R.C0003id.buyPosButton;
                        View $r15 = view.findViewById(C0001R.C0003id.buyPosButton);
                        KudiButton kudiButton = (KudiButton) $r15;
                        if (kudiButton != null) {
                            $i0 = C0001R.C0003id.divider;
                            View $r16 = view.findViewById(C0001R.C0003id.divider);
                            if ($r16 != null) {
                                $i0 = C0001R.C0003id.emptyPosView;
                                View $r7 = view.findViewById(C0001R.C0003id.emptyPosView);
                                if ($r7 != null) {
                                    PosAccountEmptyStateBinding $r8 = PosAccountEmptyStateBinding.bind($r7);
                                    $i0 = C0001R.C0003id.insurance_container;
                                    View $r72 = view.findViewById(C0001R.C0003id.insurance_container);
                                    if ($r72 != null) {
                                        ViewAccountsInsuranceBinding $r9 = ViewAccountsInsuranceBinding.bind($r72);
                                        $i0 = C0001R.C0003id.insurance_outlet_mgt_container;
                                        View $r73 = view.findViewById(C0001R.C0003id.insurance_outlet_mgt_container);
                                        if ($r73 != null) {
                                            ViewCashInsuranceOutletMgtBinding $r10 = ViewCashInsuranceOutletMgtBinding.bind($r73);
                                            $i0 = C0001R.C0003id.posContainer;
                                            ConstraintLayout $r11 = (ConstraintLayout) view.findViewById(C0001R.C0003id.posContainer);
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.posContainerTitle;
                                                TextView $r122 = (TextView) view.findViewById(C0001R.C0003id.posContainerTitle);
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.posDetailsLoader;
                                                    ProgressBar $r132 = (ProgressBar) view.findViewById(C0001R.C0003id.posDetailsLoader);
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.posInfo;
                                                        View $r74 = view.findViewById(C0001R.C0003id.posInfo);
                                                        if ($r74 != null) {
                                                            ViewPosInfoBinding $r142 = ViewPosInfoBinding.bind($r74);
                                                            $i0 = C0001R.C0003id.posStatusDesc;
                                                            TextView $r152 = (TextView) view.findViewById(C0001R.C0003id.posStatusDesc);
                                                            if ($r152 != null) {
                                                                $i0 = C0001R.C0003id.trackPOS;
                                                                View $r75 = view.findViewById(C0001R.C0003id.trackPOS);
                                                                if ($r75 != null) {
                                                                    ViewTrackPosBinding $r162 = ViewTrackPosBinding.bind($r75);
                                                                    NestedScrollView $r18 = (NestedScrollView) view;
                                                                    FragmentOutletAccountsBinding $r17 = new FragmentOutletAccountsBinding($r18, textView, constraintLayout, textView2, textView3, kudiButton, $r16, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162);
                                                                    return $r17;
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
                        }
                    }
                }
            }
        }
        Resources $r19 = view.getResources();
        String $r20 = $r19.getResourceName($i0);
        NullPointerException $r21 = new NullPointerException("Missing required view with ID: ".concat($r20));
        throw $r21;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletAccountsBinding inflate(LayoutInflater layoutInflater) {
        FragmentOutletAccountsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletAccountsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_outlet_accounts, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOutletAccountsBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
