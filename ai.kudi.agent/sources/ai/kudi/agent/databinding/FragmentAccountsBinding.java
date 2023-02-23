package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAccountsBinding implements InterfaceC8209a {
    public final ConstraintLayout accountNumbersContainer;
    public final KudiTextView accountNumbersContainerTitle;
    public final ViewAccountsInsuranceBinding insuranceContainer;
    private final NestedScrollView rootView;

    private FragmentAccountsBinding(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, KudiTextView kudiTextView, ViewAccountsInsuranceBinding viewAccountsInsuranceBinding) {
        this.rootView = nestedScrollView;
        this.accountNumbersContainer = constraintLayout;
        this.accountNumbersContainerTitle = kudiTextView;
        this.insuranceContainer = viewAccountsInsuranceBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAccountsBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountNumbersContainer;
        View $r1 = view.findViewById(C0001R.C0003id.accountNumbersContainer);
        ConstraintLayout $r2 = (ConstraintLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.accountNumbersContainerTitle;
            View $r12 = view.findViewById(C0001R.C0003id.accountNumbersContainerTitle);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.insurance_container;
                View $r13 = view.findViewById(C0001R.C0003id.insurance_container);
                if ($r13 != null) {
                    ViewAccountsInsuranceBinding $r4 = ViewAccountsInsuranceBinding.bind($r13);
                    NestedScrollView $r6 = (NestedScrollView) view;
                    FragmentAccountsBinding $r5 = new FragmentAccountsBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAccountsBinding inflate(LayoutInflater layoutInflater) {
        FragmentAccountsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAccountsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_accounts, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAccountsBinding $r3 = bind($r2);
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
