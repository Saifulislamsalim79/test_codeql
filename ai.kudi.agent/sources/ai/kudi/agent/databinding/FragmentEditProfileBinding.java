package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentEditProfileBinding implements InterfaceC8209a {
    public final KudiInputField businessAddressView;
    public final KudiInputField businessNameView;
    public final KudiInputField emailTextView;
    public final KudiInputField lgaView;
    private final ScrollView rootView;
    public final ScrollView scrollView2;
    public final KudiInputField stateView;
    public final KudiButton submitButton;
    public final KudiTextView textView8;
    public final AppCompatTextView viewVerifiedInfoView;

    private FragmentEditProfileBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiInputField kudiInputField4, ScrollView scrollView2, KudiInputField kudiInputField5, KudiButton kudiButton, KudiTextView kudiTextView, AppCompatTextView appCompatTextView) {
        this.rootView = scrollView;
        this.businessAddressView = kudiInputField;
        this.businessNameView = kudiInputField2;
        this.emailTextView = kudiInputField3;
        this.lgaView = kudiInputField4;
        this.scrollView2 = scrollView2;
        this.stateView = kudiInputField5;
        this.submitButton = kudiButton;
        this.textView8 = kudiTextView;
        this.viewVerifiedInfoView = appCompatTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEditProfileBinding bind(View view) {
        int $i0 = C0001R.C0003id.businessAddressView;
        View $r1 = view.findViewById(C0001R.C0003id.businessAddressView);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.businessNameView;
            View $r12 = view.findViewById(C0001R.C0003id.businessNameView);
            KudiInputField kudiInputField = (KudiInputField) $r12;
            if (kudiInputField != null) {
                $i0 = C0001R.C0003id.email_text_view;
                View $r13 = view.findViewById(C0001R.C0003id.email_text_view);
                KudiInputField kudiInputField2 = (KudiInputField) $r13;
                if (kudiInputField2 != null) {
                    $i0 = C0001R.C0003id.lgaView;
                    View $r14 = view.findViewById(C0001R.C0003id.lgaView);
                    KudiInputField kudiInputField3 = (KudiInputField) $r14;
                    if (kudiInputField3 != null) {
                        ScrollView scrollView = (ScrollView) view;
                        $i0 = C0001R.C0003id.stateView;
                        View $r15 = view.findViewById(C0001R.C0003id.stateView);
                        KudiInputField kudiInputField4 = (KudiInputField) $r15;
                        if (kudiInputField4 != null) {
                            $i0 = C0001R.C0003id.submitButton;
                            View $r16 = view.findViewById(C0001R.C0003id.submitButton);
                            KudiButton $r8 = (KudiButton) $r16;
                            if ($r8 != null) {
                                $i0 = C0001R.C0003id.textView8;
                                View $r17 = view.findViewById(C0001R.C0003id.textView8);
                                KudiTextView $r9 = (KudiTextView) $r17;
                                if ($r9 != null) {
                                    $i0 = C0001R.C0003id.viewVerifiedInfoView;
                                    View $r18 = view.findViewById(C0001R.C0003id.viewVerifiedInfoView);
                                    AppCompatTextView $r10 = (AppCompatTextView) $r18;
                                    if ($r10 != null) {
                                        FragmentEditProfileBinding $r11 = new FragmentEditProfileBinding(scrollView, $r2, kudiInputField, kudiInputField2, kudiInputField3, scrollView, kudiInputField4, $r8, $r9, $r10);
                                        return $r11;
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
    public static FragmentEditProfileBinding inflate(LayoutInflater layoutInflater) {
        FragmentEditProfileBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEditProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_edit_profile, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentEditProfileBinding $r3 = bind($r2);
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
