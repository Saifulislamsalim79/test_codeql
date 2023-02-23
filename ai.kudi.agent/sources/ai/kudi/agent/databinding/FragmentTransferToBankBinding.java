package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentTransferToBankBinding implements InterfaceC8209a {
    public final SpinKitView accountLookupLoader;
    public final TextView accountNameField;
    public final KudiInputField accountNumberField;
    public final KudiInputField bankField;
    public final NestedScrollView container;
    public final KudiButton continueToNextPage;
    public final TextView errorMessage;
    public final View footer;
    public final PinpadView keyboard;
    public final ConstraintLayout otherFields;
    public final RecyclerView recentTransfers;
    private final ConstraintLayout rootView;
    public final AppCompatButton sendToMultipleButton;
    public final SpinKitView transferTnxLookupLoader;

    private FragmentTransferToBankBinding(ConstraintLayout constraintLayout, SpinKitView spinKitView, TextView textView, KudiInputField kudiInputField, KudiInputField kudiInputField2, NestedScrollView nestedScrollView, KudiButton kudiButton, TextView textView2, View view, PinpadView pinpadView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AppCompatButton appCompatButton, SpinKitView spinKitView2) {
        this.rootView = constraintLayout;
        this.accountLookupLoader = spinKitView;
        this.accountNameField = textView;
        this.accountNumberField = kudiInputField;
        this.bankField = kudiInputField2;
        this.container = nestedScrollView;
        this.continueToNextPage = kudiButton;
        this.errorMessage = textView2;
        this.footer = view;
        this.keyboard = pinpadView;
        this.otherFields = constraintLayout2;
        this.recentTransfers = recyclerView;
        this.sendToMultipleButton = appCompatButton;
        this.transferTnxLookupLoader = spinKitView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountLookupLoader;
        View $r1 = view.findViewById(C0001R.C0003id.accountLookupLoader);
        SpinKitView spinKitView = (SpinKitView) $r1;
        if (spinKitView != null) {
            $i0 = C0001R.C0003id.accountNameField;
            View $r12 = view.findViewById(C0001R.C0003id.accountNameField);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.accountNumberField;
                View $r13 = view.findViewById(C0001R.C0003id.accountNumberField);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.bankField;
                    View $r14 = view.findViewById(C0001R.C0003id.bankField);
                    KudiInputField kudiInputField2 = (KudiInputField) $r14;
                    if (kudiInputField2 != null) {
                        $i0 = C0001R.C0003id.container;
                        View $r15 = view.findViewById(C0001R.C0003id.container);
                        NestedScrollView nestedScrollView = (NestedScrollView) $r15;
                        if (nestedScrollView != null) {
                            $i0 = C0001R.C0003id.continueToNextPage;
                            View $r16 = view.findViewById(C0001R.C0003id.continueToNextPage);
                            KudiButton kudiButton = (KudiButton) $r16;
                            if (kudiButton != null) {
                                $i0 = C0001R.C0003id.error_message;
                                View $r17 = view.findViewById(C0001R.C0003id.error_message);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.footer;
                                    View $r18 = view.findViewById(C0001R.C0003id.footer);
                                    if ($r18 != null) {
                                        $i0 = C0001R.C0003id.keyboard;
                                        View $r9 = view.findViewById(C0001R.C0003id.keyboard);
                                        PinpadView $r10 = (PinpadView) $r9;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.other_fields;
                                            View $r92 = view.findViewById(C0001R.C0003id.other_fields);
                                            ConstraintLayout $r11 = (ConstraintLayout) $r92;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.recent_transfers;
                                                View $r93 = view.findViewById(C0001R.C0003id.recent_transfers);
                                                RecyclerView $r122 = (RecyclerView) $r93;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.sendToMultipleButton;
                                                    View $r94 = view.findViewById(C0001R.C0003id.sendToMultipleButton);
                                                    AppCompatButton $r132 = (AppCompatButton) $r94;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.transferTnxLookupLoader;
                                                        View $r95 = view.findViewById(C0001R.C0003id.transferTnxLookupLoader);
                                                        SpinKitView $r142 = (SpinKitView) $r95;
                                                        if ($r142 != null) {
                                                            ConstraintLayout $r162 = (ConstraintLayout) view;
                                                            FragmentTransferToBankBinding $r152 = new FragmentTransferToBankBinding($r162, spinKitView, textView, kudiInputField, kudiInputField2, nestedScrollView, kudiButton, $r8, $r18, $r10, $r11, $r122, $r132, $r142);
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
        NullPointerException $r19 = new NullPointerException("Missing required view with ID: ".concat($r182));
        throw $r19;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankBinding inflate(LayoutInflater layoutInflater) {
        FragmentTransferToBankBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentTransferToBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_transfer_to_bank, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentTransferToBankBinding $r3 = bind($r2);
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
