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
public final class FragmentPhoneBinding implements InterfaceC8209a {
    public final KudiButton continueButton;
    public final BottomLoginViewBinding loginView;
    public final TextView nameView;
    public final TextView phoneNoView;
    public final KudiInputField phoneNumberInputField;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;

    private FragmentPhoneBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, BottomLoginViewBinding bottomLoginViewBinding, TextView textView, TextView textView2, KudiInputField kudiInputField, ScrollView scrollView) {
        this.rootView = constraintLayout;
        this.continueButton = kudiButton;
        this.loginView = bottomLoginViewBinding;
        this.nameView = textView;
        this.phoneNoView = textView2;
        this.phoneNumberInputField = kudiInputField;
        this.scrollView = scrollView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPhoneBinding bind(View view) {
        int $i0 = C0001R.C0003id.continueButton;
        KudiButton $r2 = (KudiButton) view.findViewById(C0001R.C0003id.continueButton);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.loginView;
            View $r1 = view.findViewById(C0001R.C0003id.loginView);
            if ($r1 != null) {
                BottomLoginViewBinding $r3 = BottomLoginViewBinding.bind($r1);
                $i0 = C0001R.C0003id.nameView;
                TextView $r4 = (TextView) view.findViewById(C0001R.C0003id.nameView);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.phoneNoView;
                    TextView textView = (TextView) view.findViewById(C0001R.C0003id.phoneNoView);
                    if (textView != null) {
                        $i0 = C0001R.C0003id.phoneNumberInputField;
                        KudiInputField kudiInputField = (KudiInputField) view.findViewById(C0001R.C0003id.phoneNumberInputField);
                        if (kudiInputField != null) {
                            $i0 = C0001R.C0003id.scroll_view;
                            ScrollView scrollView = (ScrollView) view.findViewById(C0001R.C0003id.scroll_view);
                            if (scrollView != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                FragmentPhoneBinding $r8 = new FragmentPhoneBinding($r9, $r2, $r3, $r4, textView, kudiInputField, scrollView);
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
    public static FragmentPhoneBinding inflate(LayoutInflater layoutInflater) {
        FragmentPhoneBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPhoneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_phone, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPhoneBinding $r3 = bind($r2);
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
