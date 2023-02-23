package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransferToBankAmountBinding implements InterfaceC8209a {
    public final TextView accountNameLabel;
    public final TextView amountEditText;
    public final RecyclerView amountSuggestionRecyclerView;
    public final TextView bankDetailsLabel;
    public final ConstraintLayout constraintLayout3;
    public final TextView currency;
    public final TextView editLabelTextView;
    public final TextView enterAmountTextViewLabel;
    public final TextView errorMessage;
    public final View footer;
    public final ImageView ivLoader;
    public final PinpadView keyboard;
    public final FloatingActionButton nextButton;
    private final ConstraintLayout rootView;

    private FragmentTransferToBankAmountBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view, ImageView imageView, PinpadView pinpadView, FloatingActionButton floatingActionButton) {
        this.rootView = constraintLayout;
        this.accountNameLabel = textView;
        this.amountEditText = textView2;
        this.amountSuggestionRecyclerView = recyclerView;
        this.bankDetailsLabel = textView3;
        this.constraintLayout3 = constraintLayout2;
        this.currency = textView4;
        this.editLabelTextView = textView5;
        this.enterAmountTextViewLabel = textView6;
        this.errorMessage = textView7;
        this.footer = view;
        this.ivLoader = imageView;
        this.keyboard = pinpadView;
        this.nextButton = floatingActionButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankAmountBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountNameLabel;
        View $r1 = view.findViewById(C0001R.C0003id.accountNameLabel);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.amountEditText;
            View $r12 = view.findViewById(C0001R.C0003id.amountEditText);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0001R.C0003id.amountSuggestionRecyclerView;
                View $r13 = view.findViewById(C0001R.C0003id.amountSuggestionRecyclerView);
                RecyclerView recyclerView = (RecyclerView) $r13;
                if (recyclerView != null) {
                    $i0 = C0001R.C0003id.bankDetailsLabel;
                    View $r14 = view.findViewById(C0001R.C0003id.bankDetailsLabel);
                    TextView textView3 = (TextView) $r14;
                    if (textView3 != null) {
                        $i0 = C0001R.C0003id.constraintLayout3;
                        View $r15 = view.findViewById(C0001R.C0003id.constraintLayout3);
                        ConstraintLayout constraintLayout = (ConstraintLayout) $r15;
                        if (constraintLayout != null) {
                            $i0 = C0001R.C0003id.currency;
                            View $r16 = view.findViewById(C0001R.C0003id.currency);
                            TextView textView4 = (TextView) $r16;
                            if (textView4 != null) {
                                $i0 = C0001R.C0003id.editLabelTextView;
                                View $r17 = view.findViewById(C0001R.C0003id.editLabelTextView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.enterAmountTextViewLabel;
                                    View $r18 = view.findViewById(C0001R.C0003id.enterAmountTextViewLabel);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.error_message;
                                        View $r19 = view.findViewById(C0001R.C0003id.error_message);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.footer;
                                            View $r110 = view.findViewById(C0001R.C0003id.footer);
                                            if ($r110 != null) {
                                                $i0 = C0001R.C0003id.iv_loader;
                                                View $r11 = view.findViewById(C0001R.C0003id.iv_loader);
                                                ImageView $r122 = (ImageView) $r11;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.keyboard;
                                                    View $r112 = view.findViewById(C0001R.C0003id.keyboard);
                                                    PinpadView $r132 = (PinpadView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.nextButton;
                                                        View $r113 = view.findViewById(C0001R.C0003id.nextButton);
                                                        FloatingActionButton $r142 = (FloatingActionButton) $r113;
                                                        if ($r142 != null) {
                                                            ConstraintLayout $r162 = (ConstraintLayout) view;
                                                            FragmentTransferToBankAmountBinding $r152 = new FragmentTransferToBankAmountBinding($r162, textView, textView2, recyclerView, textView3, constraintLayout, textView4, $r8, $r9, $r10, $r110, $r122, $r132, $r142);
                                                            return $r152;
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
        Resources $r172 = view.getResources();
        String $r182 = $r172.getResourceName($i0);
        NullPointerException $r192 = new NullPointerException("Missing required view with ID: ".concat($r182));
        throw $r192;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankAmountBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransferToBankAmountBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_transfer_to_bank_amount, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransferToBankAmountBinding $r3 = bind($r2);
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
