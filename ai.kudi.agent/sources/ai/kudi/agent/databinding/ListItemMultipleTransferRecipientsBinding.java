package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ListItemMultipleTransferRecipientsBinding implements InterfaceC8209a {
    public final TextView accountNameText;
    public final TextView bankDetailText;
    public final AppCompatButton editButton;
    public final TextView paymentDetailText;
    private final ConstraintLayout rootView;

    private ListItemMultipleTransferRecipientsBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, AppCompatButton appCompatButton, TextView textView3) {
        this.rootView = constraintLayout;
        this.accountNameText = textView;
        this.bankDetailText = textView2;
        this.editButton = appCompatButton;
        this.paymentDetailText = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemMultipleTransferRecipientsBinding bind(View view) {
        int $i0 = C0001R.C0003id.account_name_text;
        View $r1 = view.findViewById(C0001R.C0003id.account_name_text);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.bank_detail_text;
            View $r12 = view.findViewById(C0001R.C0003id.bank_detail_text);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.edit_button;
                View $r13 = view.findViewById(C0001R.C0003id.edit_button);
                AppCompatButton $r4 = (AppCompatButton) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.payment_detail_text;
                    View $r14 = view.findViewById(C0001R.C0003id.payment_detail_text);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        ListItemMultipleTransferRecipientsBinding $r6 = new ListItemMultipleTransferRecipientsBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
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
    public static ListItemMultipleTransferRecipientsBinding inflate(LayoutInflater layoutInflater) {
        ListItemMultipleTransferRecipientsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemMultipleTransferRecipientsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.list_item_multiple_transfer_recipients, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ListItemMultipleTransferRecipientsBinding $r3 = bind($r2);
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
