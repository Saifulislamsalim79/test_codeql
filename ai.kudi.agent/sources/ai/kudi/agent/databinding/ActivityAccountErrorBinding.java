package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityAccountErrorBinding implements InterfaceC8209a {
    public final KudiButton callSupportButton;
    public final BottomCreateAcctViewBinding createAccountView;
    public final TextView descriptionView;
    public final LinearLayout reasonsContainer;
    private final ConstraintLayout rootView;
    public final TextView tipView;
    public final TextView titleView;

    private ActivityAccountErrorBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, BottomCreateAcctViewBinding bottomCreateAcctViewBinding, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.callSupportButton = kudiButton;
        this.createAccountView = bottomCreateAcctViewBinding;
        this.descriptionView = textView;
        this.reasonsContainer = linearLayout;
        this.tipView = textView2;
        this.titleView = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityAccountErrorBinding bind(View view) {
        int $i0 = C0001R.C0003id.call_support_button;
        KudiButton $r2 = (KudiButton) view.findViewById(C0001R.C0003id.call_support_button);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.create_account_view;
            View $r1 = view.findViewById(C0001R.C0003id.create_account_view);
            if ($r1 != null) {
                BottomCreateAcctViewBinding $r3 = BottomCreateAcctViewBinding.bind($r1);
                $i0 = C0001R.C0003id.description_view;
                TextView $r4 = (TextView) view.findViewById(C0001R.C0003id.description_view);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.reasons_container;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(C0001R.C0003id.reasons_container);
                    if (linearLayout != null) {
                        $i0 = C0001R.C0003id.tip_view;
                        TextView textView = (TextView) view.findViewById(C0001R.C0003id.tip_view);
                        if (textView != null) {
                            $i0 = C0001R.C0003id.title_view;
                            TextView textView2 = (TextView) view.findViewById(C0001R.C0003id.title_view);
                            if (textView2 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                ActivityAccountErrorBinding $r8 = new ActivityAccountErrorBinding($r9, $r2, $r3, $r4, linearLayout, textView, textView2);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r12 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityAccountErrorBinding inflate(LayoutInflater layoutInflater) {
        ActivityAccountErrorBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityAccountErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_account_error, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityAccountErrorBinding $r3 = bind($r2);
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
