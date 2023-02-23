package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentEnterPhoneNoBinding implements InterfaceC8209a {
    public final TextView headerText;
    public final KudiInputField phoneNumberInputField;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final KudiButton sendOtp;
    public final TextView subtitleText;
    public final BottomLoginViewBinding view;

    private FragmentEnterPhoneNoBinding(ConstraintLayout constraintLayout, TextView textView, KudiInputField kudiInputField, ScrollView scrollView, KudiButton kudiButton, TextView textView2, BottomLoginViewBinding bottomLoginViewBinding) {
        this.rootView = constraintLayout;
        this.headerText = textView;
        this.phoneNumberInputField = kudiInputField;
        this.scrollView = scrollView;
        this.sendOtp = kudiButton;
        this.subtitleText = textView2;
        this.view = bottomLoginViewBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEnterPhoneNoBinding bind(View view) {
        int $i0 = C0001R.C0003id.headerText;
        View $r1 = view.findViewById(C0001R.C0003id.headerText);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.phoneNumberInputField;
            View $r12 = view.findViewById(C0001R.C0003id.phoneNumberInputField);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.scroll_view;
                View $r13 = view.findViewById(C0001R.C0003id.scroll_view);
                ScrollView scrollView = (ScrollView) $r13;
                if (scrollView != null) {
                    $i0 = C0001R.C0003id.sendOtp;
                    View $r14 = view.findViewById(C0001R.C0003id.sendOtp);
                    KudiButton kudiButton = (KudiButton) $r14;
                    if (kudiButton != null) {
                        $i0 = C0001R.C0003id.subtitleText;
                        View $r15 = view.findViewById(C0001R.C0003id.subtitleText);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.view;
                            View $r16 = view.findViewById(C0001R.C0003id.view);
                            if ($r16 != null) {
                                BottomLoginViewBinding $r7 = BottomLoginViewBinding.bind($r16);
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentEnterPhoneNoBinding $r8 = new FragmentEnterPhoneNoBinding($r9, $r2, $r3, scrollView, kudiButton, textView, $r7);
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
    public static FragmentEnterPhoneNoBinding inflate(LayoutInflater layoutInflater) {
        FragmentEnterPhoneNoBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEnterPhoneNoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_enter_phone_no, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentEnterPhoneNoBinding $r3 = bind($r2);
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
