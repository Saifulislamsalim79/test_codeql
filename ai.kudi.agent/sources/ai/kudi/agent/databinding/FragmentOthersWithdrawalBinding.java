package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOthersWithdrawalBinding implements InterfaceC8209a {
    public final EditText amountEditText;
    public final IncludeAddServiceFeeCheckBinding includeAddServiceFeeCheck;
    public final IncludeCardMethodsBinding includeCardMethods;
    public final Button performWithdrawalButton;
    public final EditText phoneNumberEditText;
    private final ScrollView rootView;
    public final LinearLayout serviceFeeLayout;
    public final ProgressBar serviceFeeProgressBar;
    public final TextView serviceFeeTextView;
    public final LinearLayout transferParamForm;

    private FragmentOthersWithdrawalBinding(ScrollView scrollView, EditText editText, IncludeAddServiceFeeCheckBinding includeAddServiceFeeCheckBinding, IncludeCardMethodsBinding includeCardMethodsBinding, Button button, EditText editText2, LinearLayout linearLayout, ProgressBar progressBar, TextView textView, LinearLayout linearLayout2) {
        this.rootView = scrollView;
        this.amountEditText = editText;
        this.includeAddServiceFeeCheck = includeAddServiceFeeCheckBinding;
        this.includeCardMethods = includeCardMethodsBinding;
        this.performWithdrawalButton = button;
        this.phoneNumberEditText = editText2;
        this.serviceFeeLayout = linearLayout;
        this.serviceFeeProgressBar = progressBar;
        this.serviceFeeTextView = textView;
        this.transferParamForm = linearLayout2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static FragmentOthersWithdrawalBinding bind(View view) {
        int $i0 = C0001R.C0003id.amountEditText;
        EditText $r2 = (EditText) view.findViewById(C0001R.C0003id.amountEditText);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.include_add_service_fee_check;
            View $r1 = view.findViewById(C0001R.C0003id.include_add_service_fee_check);
            if ($r1 != null) {
                IncludeAddServiceFeeCheckBinding $r3 = IncludeAddServiceFeeCheckBinding.bind($r1);
                $i0 = C0001R.C0003id.include_card_methods;
                View $r12 = view.findViewById(C0001R.C0003id.include_card_methods);
                if ($r12 != null) {
                    IncludeCardMethodsBinding $r4 = IncludeCardMethodsBinding.bind($r12);
                    $i0 = C0001R.C0003id.performWithdrawalButton;
                    Button button = (Button) view.findViewById(C0001R.C0003id.performWithdrawalButton);
                    if (button != null) {
                        $i0 = C0001R.C0003id.phoneNumberEditText;
                        EditText editText = (EditText) view.findViewById(C0001R.C0003id.phoneNumberEditText);
                        if (editText != null) {
                            $i0 = C0001R.C0003id.serviceFeeLayout;
                            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0001R.C0003id.serviceFeeLayout);
                            if (linearLayout != null) {
                                $i0 = C0001R.C0003id.serviceFeeProgressBar;
                                ProgressBar progressBar = (ProgressBar) view.findViewById(C0001R.C0003id.serviceFeeProgressBar);
                                if (progressBar != null) {
                                    $i0 = C0001R.C0003id.serviceFeeTextView;
                                    TextView $r9 = (TextView) view.findViewById(C0001R.C0003id.serviceFeeTextView);
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.transfer_param_form;
                                        LinearLayout $r10 = (LinearLayout) view.findViewById(C0001R.C0003id.transfer_param_form);
                                        if ($r10 != null) {
                                            ScrollView $r122 = (ScrollView) view;
                                            FragmentOthersWithdrawalBinding $r11 = new FragmentOthersWithdrawalBinding($r122, $r2, $r3, $r4, button, editText, linearLayout, progressBar, $r9, $r10);
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
        Resources $r13 = view.getResources();
        String $r14 = $r13.getResourceName($i0);
        NullPointerException $r15 = new NullPointerException("Missing required view with ID: ".concat($r14));
        throw $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static FragmentOthersWithdrawalBinding inflate(LayoutInflater layoutInflater) {
        FragmentOthersWithdrawalBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static FragmentOthersWithdrawalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_others_withdrawal, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOthersWithdrawalBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
