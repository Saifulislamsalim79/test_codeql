package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityChildOutletInformationBinding implements InterfaceC8209a {
    public final KudiButton btnSubmit;
    public final KudiInputField etAddress;
    public final KudiInputField etFirstName;
    public final KudiInputField etLastName;
    public final KudiInputField etLga;
    public final KudiInputField etName;
    public final KudiInputField etPhoneNum;
    public final KudiInputField etState;
    public final ConstraintLayout outletFilledState;
    public final ListLoaderViewBinding outletLoadingView;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;
    public final View viewShadow;

    private ActivityChildOutletInformationBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiInputField kudiInputField4, KudiInputField kudiInputField5, KudiInputField kudiInputField6, KudiInputField kudiInputField7, ConstraintLayout constraintLayout2, ListLoaderViewBinding listLoaderViewBinding, Toolbar toolbar, View view) {
        this.rootView = constraintLayout;
        this.btnSubmit = kudiButton;
        this.etAddress = kudiInputField;
        this.etFirstName = kudiInputField2;
        this.etLastName = kudiInputField3;
        this.etLga = kudiInputField4;
        this.etName = kudiInputField5;
        this.etPhoneNum = kudiInputField6;
        this.etState = kudiInputField7;
        this.outletFilledState = constraintLayout2;
        this.outletLoadingView = listLoaderViewBinding;
        this.toolbar = toolbar;
        this.viewShadow = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityChildOutletInformationBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_submit;
        View $r1 = view.findViewById(C0001R.C0003id.btn_submit);
        KudiButton kudiButton = (KudiButton) $r1;
        if (kudiButton != null) {
            $i0 = C0001R.C0003id.et_address;
            View $r12 = view.findViewById(C0001R.C0003id.et_address);
            KudiInputField kudiInputField = (KudiInputField) $r12;
            if (kudiInputField != null) {
                $i0 = C0001R.C0003id.et_first_name;
                View $r13 = view.findViewById(C0001R.C0003id.et_first_name);
                KudiInputField kudiInputField2 = (KudiInputField) $r13;
                if (kudiInputField2 != null) {
                    $i0 = C0001R.C0003id.et_last_name;
                    View $r14 = view.findViewById(C0001R.C0003id.et_last_name);
                    KudiInputField kudiInputField3 = (KudiInputField) $r14;
                    if (kudiInputField3 != null) {
                        $i0 = C0001R.C0003id.et_lga;
                        View $r15 = view.findViewById(C0001R.C0003id.et_lga);
                        KudiInputField kudiInputField4 = (KudiInputField) $r15;
                        if (kudiInputField4 != null) {
                            $i0 = C0001R.C0003id.et_name;
                            View $r16 = view.findViewById(C0001R.C0003id.et_name);
                            KudiInputField kudiInputField5 = (KudiInputField) $r16;
                            if (kudiInputField5 != null) {
                                $i0 = C0001R.C0003id.et_phone_num;
                                View $r17 = view.findViewById(C0001R.C0003id.et_phone_num);
                                KudiInputField $r8 = (KudiInputField) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.et_state;
                                    View $r18 = view.findViewById(C0001R.C0003id.et_state);
                                    KudiInputField $r9 = (KudiInputField) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.outletFilledState;
                                        View $r19 = view.findViewById(C0001R.C0003id.outletFilledState);
                                        ConstraintLayout $r10 = (ConstraintLayout) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.outletLoadingView;
                                            View $r110 = view.findViewById(C0001R.C0003id.outletLoadingView);
                                            if ($r110 != null) {
                                                ListLoaderViewBinding $r11 = ListLoaderViewBinding.bind($r110);
                                                $i0 = C0001R.C0003id.toolbar;
                                                View $r111 = view.findViewById(C0001R.C0003id.toolbar);
                                                Toolbar $r122 = (Toolbar) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.view_shadow;
                                                    View $r112 = view.findViewById(C0001R.C0003id.view_shadow);
                                                    if ($r112 != null) {
                                                        ConstraintLayout $r142 = (ConstraintLayout) view;
                                                        ActivityChildOutletInformationBinding $r132 = new ActivityChildOutletInformationBinding($r142, kudiButton, kudiInputField, kudiInputField2, kudiInputField3, kudiInputField4, kudiInputField5, $r8, $r9, $r10, $r11, $r122, $r112);
                                                        return $r132;
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
        Resources $r152 = view.getResources();
        String $r162 = $r152.getResourceName($i0);
        NullPointerException $r172 = new NullPointerException("Missing required view with ID: ".concat($r162));
        throw $r172;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityChildOutletInformationBinding inflate(LayoutInflater layoutInflater) {
        ActivityChildOutletInformationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityChildOutletInformationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_child_outlet_information, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityChildOutletInformationBinding $r3 = bind($r2);
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
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
