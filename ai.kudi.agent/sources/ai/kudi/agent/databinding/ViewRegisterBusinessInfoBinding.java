package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewRegisterBusinessInfoBinding implements InterfaceC8209a {
    public final KudiInputField businessAddressField;
    public final KudiInputField businessEmail;
    public final KudiInputField businessNameField;
    public final KudiInputField bussinessInfoAreaInpuitField;
    public final KudiButton continueToNextPage;
    public final KudiInputField lgaField;
    public final TextView pageSubtitle;
    public final TextView pageTitle;
    public final ProgressBar primaryBusinessProgressBar;
    private final ScrollView rootView;
    public final KudiInputField specifyPrimaryBusiness;
    public final KudiInputField stateField;

    private ViewRegisterBusinessInfoBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiInputField kudiInputField2, KudiInputField kudiInputField3, KudiInputField kudiInputField4, KudiButton kudiButton, KudiInputField kudiInputField5, TextView textView, TextView textView2, ProgressBar progressBar, KudiInputField kudiInputField6, KudiInputField kudiInputField7) {
        this.rootView = scrollView;
        this.businessAddressField = kudiInputField;
        this.businessEmail = kudiInputField2;
        this.businessNameField = kudiInputField3;
        this.bussinessInfoAreaInpuitField = kudiInputField4;
        this.continueToNextPage = kudiButton;
        this.lgaField = kudiInputField5;
        this.pageSubtitle = textView;
        this.pageTitle = textView2;
        this.primaryBusinessProgressBar = progressBar;
        this.specifyPrimaryBusiness = kudiInputField6;
        this.stateField = kudiInputField7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewRegisterBusinessInfoBinding bind(View view) {
        int $i0 = C0001R.C0003id.businessAddressField;
        View $r1 = view.findViewById(C0001R.C0003id.businessAddressField);
        KudiInputField kudiInputField = (KudiInputField) $r1;
        if (kudiInputField != null) {
            $i0 = C0001R.C0003id.businessEmail;
            View $r12 = view.findViewById(C0001R.C0003id.businessEmail);
            KudiInputField kudiInputField2 = (KudiInputField) $r12;
            if (kudiInputField2 != null) {
                $i0 = C0001R.C0003id.businessNameField;
                View $r13 = view.findViewById(C0001R.C0003id.businessNameField);
                KudiInputField kudiInputField3 = (KudiInputField) $r13;
                if (kudiInputField3 != null) {
                    $i0 = C0001R.C0003id.bussinessInfoAreaInpuitField;
                    View $r14 = view.findViewById(C0001R.C0003id.bussinessInfoAreaInpuitField);
                    KudiInputField kudiInputField4 = (KudiInputField) $r14;
                    if (kudiInputField4 != null) {
                        $i0 = C0001R.C0003id.continueToNextPage;
                        View $r15 = view.findViewById(C0001R.C0003id.continueToNextPage);
                        KudiButton kudiButton = (KudiButton) $r15;
                        if (kudiButton != null) {
                            $i0 = C0001R.C0003id.lgaField;
                            View $r16 = view.findViewById(C0001R.C0003id.lgaField);
                            KudiInputField kudiInputField5 = (KudiInputField) $r16;
                            if (kudiInputField5 != null) {
                                $i0 = C0001R.C0003id.page_subtitle;
                                View $r17 = view.findViewById(C0001R.C0003id.page_subtitle);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.page_title;
                                    View $r18 = view.findViewById(C0001R.C0003id.page_title);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.primaryBusinessProgressBar;
                                        View $r19 = view.findViewById(C0001R.C0003id.primaryBusinessProgressBar);
                                        ProgressBar $r10 = (ProgressBar) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.specifyPrimaryBusiness;
                                            View $r110 = view.findViewById(C0001R.C0003id.specifyPrimaryBusiness);
                                            KudiInputField $r11 = (KudiInputField) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.stateField;
                                                View $r111 = view.findViewById(C0001R.C0003id.stateField);
                                                KudiInputField $r122 = (KudiInputField) $r111;
                                                if ($r122 != null) {
                                                    ScrollView $r142 = (ScrollView) view;
                                                    ViewRegisterBusinessInfoBinding $r132 = new ViewRegisterBusinessInfoBinding($r142, kudiInputField, kudiInputField2, kudiInputField3, kudiInputField4, kudiButton, kudiInputField5, $r8, $r9, $r10, $r11, $r122);
                                                    return $r132;
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
        Resources $r152 = view.getResources();
        String $r162 = $r152.getResourceName($i0);
        NullPointerException $r172 = new NullPointerException("Missing required view with ID: ".concat($r162));
        throw $r172;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewRegisterBusinessInfoBinding inflate(LayoutInflater layoutInflater) {
        ViewRegisterBusinessInfoBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewRegisterBusinessInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_register_business_info, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewRegisterBusinessInfoBinding $r3 = bind($r2);
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
