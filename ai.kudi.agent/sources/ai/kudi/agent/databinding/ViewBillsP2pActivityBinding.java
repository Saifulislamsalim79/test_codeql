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
public final class ViewBillsP2pActivityBinding implements InterfaceC8209a {
    public final EditText amountEditText;
    public final Button checkAccountName;
    public final ProgressBar progressBar;
    public final EditText reasonEditText;
    public final EditText recipientPhoneEditText;
    public final TextView resolvedResult;
    private final ScrollView rootView;
    public final LinearLayout successLayout;
    public final Button transferButton;
    public final LinearLayout transferParamForm;

    private ViewBillsP2pActivityBinding(ScrollView scrollView, EditText editText, Button button, ProgressBar progressBar, EditText editText2, EditText editText3, TextView textView, LinearLayout linearLayout, Button button2, LinearLayout linearLayout2) {
        this.rootView = scrollView;
        this.amountEditText = editText;
        this.checkAccountName = button;
        this.progressBar = progressBar;
        this.reasonEditText = editText2;
        this.recipientPhoneEditText = editText3;
        this.resolvedResult = textView;
        this.successLayout = linearLayout;
        this.transferButton = button2;
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
    public static ViewBillsP2pActivityBinding bind(View view) {
        int $i0 = C0001R.C0003id.amountEditText;
        View $r1 = view.findViewById(C0001R.C0003id.amountEditText);
        EditText $r2 = (EditText) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.checkAccountName;
            View $r12 = view.findViewById(C0001R.C0003id.checkAccountName);
            Button button = (Button) $r12;
            if (button != null) {
                $i0 = C0001R.C0003id.progressBar;
                View $r13 = view.findViewById(C0001R.C0003id.progressBar);
                ProgressBar progressBar = (ProgressBar) $r13;
                if (progressBar != null) {
                    $i0 = C0001R.C0003id.reasonEditText;
                    View $r14 = view.findViewById(C0001R.C0003id.reasonEditText);
                    EditText editText = (EditText) $r14;
                    if (editText != null) {
                        $i0 = C0001R.C0003id.recipientPhoneEditText;
                        View $r15 = view.findViewById(C0001R.C0003id.recipientPhoneEditText);
                        EditText editText2 = (EditText) $r15;
                        if (editText2 != null) {
                            $i0 = C0001R.C0003id.resolvedResult;
                            View $r16 = view.findViewById(C0001R.C0003id.resolvedResult);
                            TextView textView = (TextView) $r16;
                            if (textView != null) {
                                $i0 = C0001R.C0003id.successLayout;
                                View $r17 = view.findViewById(C0001R.C0003id.successLayout);
                                LinearLayout $r8 = (LinearLayout) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.transferButton;
                                    View $r18 = view.findViewById(C0001R.C0003id.transferButton);
                                    Button $r9 = (Button) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.transfer_param_form;
                                        View $r19 = view.findViewById(C0001R.C0003id.transfer_param_form);
                                        LinearLayout $r10 = (LinearLayout) $r19;
                                        if ($r10 != null) {
                                            ScrollView $r122 = (ScrollView) view;
                                            ViewBillsP2pActivityBinding $r11 = new ViewBillsP2pActivityBinding($r122, $r2, button, progressBar, editText, editText2, textView, $r8, $r9, $r10);
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
        Resources $r132 = view.getResources();
        String $r142 = $r132.getResourceName($i0);
        NullPointerException $r152 = new NullPointerException("Missing required view with ID: ".concat($r142));
        throw $r152;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static ViewBillsP2pActivityBinding inflate(LayoutInflater layoutInflater) {
        ViewBillsP2pActivityBinding $r0 = inflate(layoutInflater, null, false);
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
    public static ViewBillsP2pActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_bills_p2p_activity, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewBillsP2pActivityBinding $r3 = bind($r2);
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
