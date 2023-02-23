package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAgentReferredListBinding implements InterfaceC8209a {
    public final WalletLoaderViewBinding createReferralProgressBar;
    public final View divider1;
    public final KudiInputField firstNameEditText;
    public final KudiInputField lastNameEditText;
    public final ScrollView mainContainer;
    public final TextView openList;
    public final CardView openListContainer;
    public final KudiInputField phoneEditText;
    public final KudiButton referralButton;
    private final ConstraintLayout rootView;

    private FragmentAgentReferredListBinding(ConstraintLayout constraintLayout, WalletLoaderViewBinding walletLoaderViewBinding, View view, KudiInputField kudiInputField, KudiInputField kudiInputField2, ScrollView scrollView, TextView textView, CardView cardView, KudiInputField kudiInputField3, KudiButton kudiButton) {
        this.rootView = constraintLayout;
        this.createReferralProgressBar = walletLoaderViewBinding;
        this.divider1 = view;
        this.firstNameEditText = kudiInputField;
        this.lastNameEditText = kudiInputField2;
        this.mainContainer = scrollView;
        this.openList = textView;
        this.openListContainer = cardView;
        this.phoneEditText = kudiInputField3;
        this.referralButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAgentReferredListBinding bind(View view) {
        int $i0 = C0001R.C0003id.createReferralProgressBar;
        View $r1 = view.findViewById(C0001R.C0003id.createReferralProgressBar);
        if ($r1 != null) {
            WalletLoaderViewBinding $r2 = WalletLoaderViewBinding.bind($r1);
            $i0 = C0001R.C0003id.divider1;
            View $r12 = view.findViewById(C0001R.C0003id.divider1);
            if ($r12 != null) {
                $i0 = C0001R.C0003id.first_name_edit_text;
                View $r3 = view.findViewById(C0001R.C0003id.first_name_edit_text);
                KudiInputField kudiInputField = (KudiInputField) $r3;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.last_name_edit_text;
                    View $r32 = view.findViewById(C0001R.C0003id.last_name_edit_text);
                    KudiInputField kudiInputField2 = (KudiInputField) $r32;
                    if (kudiInputField2 != null) {
                        $i0 = C0001R.C0003id.mainContainer;
                        View $r33 = view.findViewById(C0001R.C0003id.mainContainer);
                        ScrollView scrollView = (ScrollView) $r33;
                        if (scrollView != null) {
                            $i0 = C0001R.C0003id.open_list;
                            View $r34 = view.findViewById(C0001R.C0003id.open_list);
                            TextView textView = (TextView) $r34;
                            if (textView != null) {
                                $i0 = C0001R.C0003id.open_list_container;
                                View $r35 = view.findViewById(C0001R.C0003id.open_list_container);
                                CardView cardView = (CardView) $r35;
                                if (cardView != null) {
                                    $i0 = C0001R.C0003id.phone_edit_text;
                                    View $r36 = view.findViewById(C0001R.C0003id.phone_edit_text);
                                    KudiInputField $r9 = (KudiInputField) $r36;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.referralButton;
                                        View $r37 = view.findViewById(C0001R.C0003id.referralButton);
                                        KudiButton $r10 = (KudiButton) $r37;
                                        if ($r10 != null) {
                                            ConstraintLayout $r122 = (ConstraintLayout) view;
                                            FragmentAgentReferredListBinding $r11 = new FragmentAgentReferredListBinding($r122, $r2, $r12, kudiInputField, kudiInputField2, scrollView, textView, cardView, $r9, $r10);
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
     */
    public static FragmentAgentReferredListBinding inflate(LayoutInflater layoutInflater) {
        FragmentAgentReferredListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAgentReferredListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_agent_referred_list, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAgentReferredListBinding $r3 = bind($r2);
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
