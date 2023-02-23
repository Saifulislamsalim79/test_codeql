package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentInsuranceDeactivationReasonsBinding implements InterfaceC8209a {
    public final KudiButton insuranceReasonContinueButton;
    public final KudiInputField insuranceReasonInputField;
    public final RecyclerView insuranceReasonsList;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;

    private FragmentInsuranceDeactivationReasonsBinding(CoordinatorLayout coordinatorLayout, KudiButton kudiButton, KudiInputField kudiInputField, RecyclerView recyclerView, Toolbar toolbar) {
        this.rootView = coordinatorLayout;
        this.insuranceReasonContinueButton = kudiButton;
        this.insuranceReasonInputField = kudiInputField;
        this.insuranceReasonsList = recyclerView;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentInsuranceDeactivationReasonsBinding bind(View view) {
        int $i0 = C0001R.C0003id.insurance_reason_continue_button;
        View $r1 = view.findViewById(C0001R.C0003id.insurance_reason_continue_button);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.insurance_reason_input_field;
            View $r12 = view.findViewById(C0001R.C0003id.insurance_reason_input_field);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.insurance_reasons_list;
                View $r13 = view.findViewById(C0001R.C0003id.insurance_reasons_list);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.toolbar;
                    View $r14 = view.findViewById(C0001R.C0003id.toolbar);
                    Toolbar toolbar = (Toolbar) $r14;
                    if (toolbar != null) {
                        FragmentInsuranceDeactivationReasonsBinding $r6 = new FragmentInsuranceDeactivationReasonsBinding((CoordinatorLayout) view, $r2, $r3, $r4, toolbar);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentInsuranceDeactivationReasonsBinding inflate(LayoutInflater layoutInflater) {
        FragmentInsuranceDeactivationReasonsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentInsuranceDeactivationReasonsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_insurance_deactivation_reasons, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentInsuranceDeactivationReasonsBinding $r3 = bind($r2);
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
