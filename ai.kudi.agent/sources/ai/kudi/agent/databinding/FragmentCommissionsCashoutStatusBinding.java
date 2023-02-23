package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentCommissionsCashoutStatusBinding implements InterfaceC8209a {
    public final AppCompatImageButton closeButton;
    public final KudiButton closeCashoutStatusButton;
    public final AppCompatImageView iconSuccess;
    public final TextView messageText;
    private final ConstraintLayout rootView;

    private FragmentCommissionsCashoutStatusBinding(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, KudiButton kudiButton, AppCompatImageView appCompatImageView, TextView textView) {
        this.rootView = constraintLayout;
        this.closeButton = appCompatImageButton;
        this.closeCashoutStatusButton = kudiButton;
        this.iconSuccess = appCompatImageView;
        this.messageText = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCommissionsCashoutStatusBinding bind(View view) {
        int $i0 = C0001R.C0003id.close_button;
        View $r1 = view.findViewById(C0001R.C0003id.close_button);
        AppCompatImageButton $r2 = (AppCompatImageButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.close_cashout_status_button;
            View $r12 = view.findViewById(C0001R.C0003id.close_cashout_status_button);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.icon_success;
                View $r13 = view.findViewById(C0001R.C0003id.icon_success);
                AppCompatImageView $r4 = (AppCompatImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.message_text;
                    View $r14 = view.findViewById(C0001R.C0003id.message_text);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        FragmentCommissionsCashoutStatusBinding $r6 = new FragmentCommissionsCashoutStatusBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
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
    public static FragmentCommissionsCashoutStatusBinding inflate(LayoutInflater layoutInflater) {
        FragmentCommissionsCashoutStatusBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCommissionsCashoutStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_commissions_cashout_status, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCommissionsCashoutStatusBinding $r3 = bind($r2);
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
