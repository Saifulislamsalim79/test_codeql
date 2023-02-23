package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAddBankAcctBinding implements InterfaceC8209a {
    public final TextView accountName;
    public final ProgressBar acctNameLoadingProgress;
    public final KudiInputField acctNoView;
    public final TextView nameErrorView;
    private final ConstraintLayout rootView;
    public final KudiButton saveBankAccountView;
    public final KudiInputField selectedBankView;

    private FragmentAddBankAcctBinding(ConstraintLayout constraintLayout, TextView textView, ProgressBar progressBar, KudiInputField kudiInputField, TextView textView2, KudiButton kudiButton, KudiInputField kudiInputField2) {
        this.rootView = constraintLayout;
        this.accountName = textView;
        this.acctNameLoadingProgress = progressBar;
        this.acctNoView = kudiInputField;
        this.nameErrorView = textView2;
        this.saveBankAccountView = kudiButton;
        this.selectedBankView = kudiInputField2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAddBankAcctBinding bind(View view) {
        int $i0 = C0001R.C0003id.account_name;
        View $r1 = view.findViewById(C0001R.C0003id.account_name);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.acctNameLoadingProgress;
            View $r12 = view.findViewById(C0001R.C0003id.acctNameLoadingProgress);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.acctNoView;
                View $r13 = view.findViewById(C0001R.C0003id.acctNoView);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.nameErrorView;
                    View $r14 = view.findViewById(C0001R.C0003id.nameErrorView);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.saveBankAccountView;
                        View $r15 = view.findViewById(C0001R.C0003id.saveBankAccountView);
                        KudiButton kudiButton = (KudiButton) $r15;
                        if (kudiButton != null) {
                            $i0 = C0001R.C0003id.selectedBankView;
                            View $r16 = view.findViewById(C0001R.C0003id.selectedBankView);
                            KudiInputField kudiInputField2 = (KudiInputField) $r16;
                            if (kudiInputField2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentAddBankAcctBinding $r8 = new FragmentAddBankAcctBinding($r9, $r2, $r3, kudiInputField, textView, kudiButton, kudiInputField2);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAddBankAcctBinding inflate(LayoutInflater layoutInflater) {
        FragmentAddBankAcctBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAddBankAcctBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_add_bank_acct, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAddBankAcctBinding $r3 = bind($r2);
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
