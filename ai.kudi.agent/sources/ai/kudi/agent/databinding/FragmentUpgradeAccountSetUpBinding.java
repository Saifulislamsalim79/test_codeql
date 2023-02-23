package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentUpgradeAccountSetUpBinding implements InterfaceC8209a {
    public final ConstraintLayout rootView;
    private final ConstraintLayout rootView_;
    public final KycViewBinding setUpKycView;

    private FragmentUpgradeAccountSetUpBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, KycViewBinding kycViewBinding) {
        this.rootView_ = constraintLayout;
        this.rootView = constraintLayout2;
        this.setUpKycView = kycViewBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUpgradeAccountSetUpBinding bind(View view) {
        ConstraintLayout $r1 = (ConstraintLayout) view;
        View $r2 = view.findViewById(C0001R.C0003id.set_up_kyc_view);
        if ($r2 != null) {
            KycViewBinding $r3 = KycViewBinding.bind($r2);
            FragmentUpgradeAccountSetUpBinding $r4 = new FragmentUpgradeAccountSetUpBinding($r1, $r1, $r3);
            return $r4;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName(C0001R.C0003id.set_up_kyc_view);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUpgradeAccountSetUpBinding inflate(LayoutInflater layoutInflater) {
        FragmentUpgradeAccountSetUpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUpgradeAccountSetUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_upgrade_account_set_up, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentUpgradeAccountSetUpBinding $r3 = bind($r2);
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
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView_;
        return r1;
    }
}
