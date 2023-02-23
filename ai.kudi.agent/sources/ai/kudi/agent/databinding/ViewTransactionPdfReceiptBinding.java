package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewTransactionPdfReceiptBinding implements InterfaceC8209a {
    public final LinearLayout banner;
    public final View customerDetailsDivider;
    public final TextView customerDetailsLabel;
    public final TextView customerNameLabel;
    public final TextView customerNameText;
    public final TextView customerPhoneLabel;
    public final TextView customerPhoneText;
    public final View reasonDivider;
    public final TextView reasonLabel;
    public final TextView reasonText;
    public final View referenceDivider;
    public final TextView referenceLabel;
    public final TextView referenceText;
    private final LinearLayout rootView;
    public final TextView title;
    public final LinearLayout transactionDetailsWrapper;

    private ViewTransactionPdfReceiptBinding(LinearLayout linearLayout, LinearLayout linearLayout2, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2, TextView textView6, TextView textView7, View view3, TextView textView8, TextView textView9, TextView textView10, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.banner = linearLayout2;
        this.customerDetailsDivider = view;
        this.customerDetailsLabel = textView;
        this.customerNameLabel = textView2;
        this.customerNameText = textView3;
        this.customerPhoneLabel = textView4;
        this.customerPhoneText = textView5;
        this.reasonDivider = view2;
        this.reasonLabel = textView6;
        this.reasonText = textView7;
        this.referenceDivider = view3;
        this.referenceLabel = textView8;
        this.referenceText = textView9;
        this.title = textView10;
        this.transactionDetailsWrapper = linearLayout3;
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
    public static ViewTransactionPdfReceiptBinding bind(View view) {
        int $i0 = C0001R.C0003id.banner;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0001R.C0003id.banner);
        if (linearLayout != null) {
            $i0 = C0001R.C0003id.customer_details_divider;
            View $r1 = view.findViewById(C0001R.C0003id.customer_details_divider);
            if ($r1 != null) {
                $i0 = C0001R.C0003id.customer_details_label;
                View $r3 = view.findViewById(C0001R.C0003id.customer_details_label);
                TextView textView = (TextView) $r3;
                if (textView != null) {
                    $i0 = C0001R.C0003id.customer_name_label;
                    View $r32 = view.findViewById(C0001R.C0003id.customer_name_label);
                    TextView textView2 = (TextView) $r32;
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.customer_name_text;
                        View $r33 = view.findViewById(C0001R.C0003id.customer_name_text);
                        TextView textView3 = (TextView) $r33;
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.customer_phone_label;
                            View $r34 = view.findViewById(C0001R.C0003id.customer_phone_label);
                            TextView textView4 = (TextView) $r34;
                            if (textView4 != null) {
                                $i0 = C0001R.C0003id.customer_phone_text;
                                View $r35 = view.findViewById(C0001R.C0003id.customer_phone_text);
                                TextView $r8 = (TextView) $r35;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.reason_divider;
                                    View $r36 = view.findViewById(C0001R.C0003id.reason_divider);
                                    if ($r36 != null) {
                                        $i0 = C0001R.C0003id.reason_label;
                                        View $r9 = view.findViewById(C0001R.C0003id.reason_label);
                                        TextView $r10 = (TextView) $r9;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.reason_text;
                                            View $r92 = view.findViewById(C0001R.C0003id.reason_text);
                                            TextView $r11 = (TextView) $r92;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.reference_divider;
                                                View $r93 = view.findViewById(C0001R.C0003id.reference_divider);
                                                if ($r93 != null) {
                                                    $i0 = C0001R.C0003id.reference_label;
                                                    View $r12 = view.findViewById(C0001R.C0003id.reference_label);
                                                    TextView $r13 = (TextView) $r12;
                                                    if ($r13 != null) {
                                                        $i0 = C0001R.C0003id.reference_text;
                                                        View $r122 = view.findViewById(C0001R.C0003id.reference_text);
                                                        TextView $r14 = (TextView) $r122;
                                                        if ($r14 != null) {
                                                            $i0 = C0001R.C0003id.title;
                                                            View $r123 = view.findViewById(C0001R.C0003id.title);
                                                            TextView $r15 = (TextView) $r123;
                                                            if ($r15 != null) {
                                                                $i0 = C0001R.C0003id.transaction_details_wrapper;
                                                                View $r124 = view.findViewById(C0001R.C0003id.transaction_details_wrapper);
                                                                LinearLayout $r16 = (LinearLayout) $r124;
                                                                if ($r16 != null) {
                                                                    LinearLayout $r18 = (LinearLayout) view;
                                                                    ViewTransactionPdfReceiptBinding $r17 = new ViewTransactionPdfReceiptBinding($r18, linearLayout, $r1, textView, textView2, textView3, textView4, $r8, $r36, $r10, $r11, $r93, $r13, $r14, $r15, $r16);
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
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static ViewTransactionPdfReceiptBinding inflate(LayoutInflater layoutInflater) {
        ViewTransactionPdfReceiptBinding $r0 = inflate(layoutInflater, null, false);
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
    public static ViewTransactionPdfReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_transaction_pdf_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewTransactionPdfReceiptBinding $r3 = bind($r2);
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
        LinearLayout $r1 = getRoot();
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
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
