package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityFormFieldsDemoBinding implements InterfaceC8209a {
    public final LinearLayout formWrapper;
    public final LinearLayout optionsWrapper;
    private final ScrollView rootView;
    public final KudiButton submitButton;

    private ActivityFormFieldsDemoBinding(ScrollView scrollView, LinearLayout linearLayout, LinearLayout linearLayout2, KudiButton kudiButton) {
        this.rootView = scrollView;
        this.formWrapper = linearLayout;
        this.optionsWrapper = linearLayout2;
        this.submitButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityFormFieldsDemoBinding bind(View view) {
        int $i0 = R$id.form_wrapper;
        View $r1 = view.findViewById($i0);
        LinearLayout $r2 = (LinearLayout) $r1;
        if ($r2 != null) {
            $i0 = R$id.options_wrapper;
            View $r12 = view.findViewById($i0);
            LinearLayout $r3 = (LinearLayout) $r12;
            if ($r3 != null) {
                $i0 = R$id.submit_button;
                View $r13 = view.findViewById($i0);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    ScrollView $r6 = (ScrollView) view;
                    ActivityFormFieldsDemoBinding $r5 = new ActivityFormFieldsDemoBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityFormFieldsDemoBinding inflate(LayoutInflater layoutInflater) {
        ActivityFormFieldsDemoBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityFormFieldsDemoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.activity_form_fields_demo;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityFormFieldsDemoBinding $r3 = bind($r2);
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
