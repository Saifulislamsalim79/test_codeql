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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewUsersCashoutBinding implements InterfaceC8209a {
    public final ProgressBar accountNameProgressBar;
    public final TextView accountNameTextView;
    public final EditText accountNoEditText;
    public final EditText amountEditText;
    public final EditText chooseBankEditText;
    public final RelativeLayout chooseBankLayout;
    public final TextInputLayout chooseBankLayout1;
    private final LinearLayout rootView;
    public final Button transferToBankButton;

    private ViewUsersCashoutBinding(LinearLayout linearLayout, ProgressBar progressBar, TextView textView, EditText editText, EditText editText2, EditText editText3, RelativeLayout relativeLayout, TextInputLayout textInputLayout, Button button) {
        this.rootView = linearLayout;
        this.accountNameProgressBar = progressBar;
        this.accountNameTextView = textView;
        this.accountNoEditText = editText;
        this.amountEditText = editText2;
        this.chooseBankEditText = editText3;
        this.chooseBankLayout = relativeLayout;
        this.chooseBankLayout1 = textInputLayout;
        this.transferToBankButton = button;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersCashoutBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountNameProgressBar;
        View $r1 = view.findViewById(C0001R.C0003id.accountNameProgressBar);
        ProgressBar $r2 = (ProgressBar) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.accountNameTextView;
            View $r12 = view.findViewById(C0001R.C0003id.accountNameTextView);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.accountNoEditText;
                View $r13 = view.findViewById(C0001R.C0003id.accountNoEditText);
                EditText editText = (EditText) $r13;
                if (editText != null) {
                    $i0 = C0001R.C0003id.amountEditText;
                    View $r14 = view.findViewById(C0001R.C0003id.amountEditText);
                    EditText editText2 = (EditText) $r14;
                    if (editText2 != null) {
                        $i0 = C0001R.C0003id.chooseBankEditText;
                        View $r15 = view.findViewById(C0001R.C0003id.chooseBankEditText);
                        EditText editText3 = (EditText) $r15;
                        if (editText3 != null) {
                            $i0 = C0001R.C0003id.choose_bank_layout;
                            View $r16 = view.findViewById(C0001R.C0003id.choose_bank_layout);
                            RelativeLayout relativeLayout = (RelativeLayout) $r16;
                            if (relativeLayout != null) {
                                $i0 = C0001R.C0003id.chooseBankLayout;
                                View $r17 = view.findViewById(C0001R.C0003id.chooseBankLayout);
                                TextInputLayout $r8 = (TextInputLayout) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.transferToBankButton;
                                    View $r18 = view.findViewById(C0001R.C0003id.transferToBankButton);
                                    Button $r9 = (Button) $r18;
                                    if ($r9 != null) {
                                        LinearLayout $r11 = (LinearLayout) view;
                                        ViewUsersCashoutBinding $r10 = new ViewUsersCashoutBinding($r11, $r2, textView, editText, editText2, editText3, relativeLayout, $r8, $r9);
                                        return $r10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r122 = view.getResources();
        String $r132 = $r122.getResourceName($i0);
        NullPointerException $r142 = new NullPointerException("Missing required view with ID: ".concat($r132));
        throw $r142;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersCashoutBinding inflate(LayoutInflater layoutInflater) {
        ViewUsersCashoutBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersCashoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_users_cashout, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewUsersCashoutBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
