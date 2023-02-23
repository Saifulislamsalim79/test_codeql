package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentBankTransferBinding implements InterfaceC8209a {
    public final ConstraintLayout accountDetailsContainer;
    public final ImageView cancelInstruction;
    public final EmptyHistoryBinding emptyHistoryView;
    public final LinearLayout instructionLayout;
    public final ConstraintLayout instructionTextView;
    public final TextView instructionTitle;
    public final TextView instructionView;
    public final RecyclerView ktaRecyclerView;
    public final KudiButton payWithUssdButton;
    private final ScrollView rootView;
    public final TextView textView44;

    private FragmentBankTransferBinding(ScrollView scrollView, ConstraintLayout constraintLayout, ImageView imageView, EmptyHistoryBinding emptyHistoryBinding, LinearLayout linearLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, RecyclerView recyclerView, KudiButton kudiButton, TextView textView3) {
        this.rootView = scrollView;
        this.accountDetailsContainer = constraintLayout;
        this.cancelInstruction = imageView;
        this.emptyHistoryView = emptyHistoryBinding;
        this.instructionLayout = linearLayout;
        this.instructionTextView = constraintLayout2;
        this.instructionTitle = textView;
        this.instructionView = textView2;
        this.ktaRecyclerView = recyclerView;
        this.payWithUssdButton = kudiButton;
        this.textView44 = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBankTransferBinding bind(View view) {
        int $i0 = C0001R.C0003id.account_details_container;
        View $r1 = view.findViewById(C0001R.C0003id.account_details_container);
        ConstraintLayout constraintLayout = (ConstraintLayout) $r1;
        if (constraintLayout != null) {
            $i0 = C0001R.C0003id.cancelInstruction;
            View $r12 = view.findViewById(C0001R.C0003id.cancelInstruction);
            ImageView imageView = (ImageView) $r12;
            if (imageView != null) {
                $i0 = C0001R.C0003id.empty_history_view;
                View $r13 = view.findViewById(C0001R.C0003id.empty_history_view);
                if ($r13 != null) {
                    EmptyHistoryBinding $r4 = EmptyHistoryBinding.bind($r13);
                    $i0 = C0001R.C0003id.instructionLayout;
                    View $r14 = view.findViewById(C0001R.C0003id.instructionLayout);
                    LinearLayout linearLayout = (LinearLayout) $r14;
                    if (linearLayout != null) {
                        $i0 = C0001R.C0003id.instructionTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.instructionTextView);
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) $r15;
                        if (constraintLayout2 != null) {
                            $i0 = C0001R.C0003id.instruction_title;
                            View $r16 = view.findViewById(C0001R.C0003id.instruction_title);
                            TextView textView = (TextView) $r16;
                            if (textView != null) {
                                $i0 = C0001R.C0003id.instructionView;
                                View $r17 = view.findViewById(C0001R.C0003id.instructionView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.kta_recycler_view;
                                    View $r18 = view.findViewById(C0001R.C0003id.kta_recycler_view);
                                    RecyclerView $r9 = (RecyclerView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.pay_with_ussd_button;
                                        View $r19 = view.findViewById(C0001R.C0003id.pay_with_ussd_button);
                                        KudiButton $r10 = (KudiButton) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.textView44;
                                            View $r110 = view.findViewById(C0001R.C0003id.textView44);
                                            TextView $r11 = (TextView) $r110;
                                            if ($r11 != null) {
                                                ScrollView $r132 = (ScrollView) view;
                                                FragmentBankTransferBinding $r122 = new FragmentBankTransferBinding($r132, constraintLayout, imageView, $r4, linearLayout, constraintLayout2, textView, $r8, $r9, $r10, $r11);
                                                return $r122;
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
        Resources $r142 = view.getResources();
        String $r152 = $r142.getResourceName($i0);
        NullPointerException $r162 = new NullPointerException("Missing required view with ID: ".concat($r152));
        throw $r162;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBankTransferBinding inflate(LayoutInflater layoutInflater) {
        FragmentBankTransferBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBankTransferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_bank_transfer, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentBankTransferBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
