package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentVerifiedInformationBinding implements InterfaceC8209a {
    private final ScrollView rootView;
    public final KudiTextView textView12;
    public final KudiTextView verifiedBvnView;
    public final TextView verifiedDobView;
    public final TextView verifiedGenderView;
    public final TextView verifiedNameView;
    public final AppCompatTextView verifiedPhoneNoView;

    private FragmentVerifiedInformationBinding(ScrollView scrollView, KudiTextView kudiTextView, KudiTextView kudiTextView2, TextView textView, TextView textView2, TextView textView3, AppCompatTextView appCompatTextView) {
        this.rootView = scrollView;
        this.textView12 = kudiTextView;
        this.verifiedBvnView = kudiTextView2;
        this.verifiedDobView = textView;
        this.verifiedGenderView = textView2;
        this.verifiedNameView = textView3;
        this.verifiedPhoneNoView = appCompatTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentVerifiedInformationBinding bind(View view) {
        int $i0 = C0001R.C0003id.textView12;
        View $r1 = view.findViewById(C0001R.C0003id.textView12);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.verifiedBvnView;
            View $r12 = view.findViewById(C0001R.C0003id.verifiedBvnView);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.verifiedDobView;
                View $r13 = view.findViewById(C0001R.C0003id.verifiedDobView);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.verifiedGenderView;
                    View $r14 = view.findViewById(C0001R.C0003id.verifiedGenderView);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.verifiedNameView;
                        View $r15 = view.findViewById(C0001R.C0003id.verifiedNameView);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.verifiedPhoneNoView;
                            View $r16 = view.findViewById(C0001R.C0003id.verifiedPhoneNoView);
                            AppCompatTextView appCompatTextView = (AppCompatTextView) $r16;
                            if (appCompatTextView != null) {
                                ScrollView $r9 = (ScrollView) view;
                                FragmentVerifiedInformationBinding $r8 = new FragmentVerifiedInformationBinding($r9, $r2, $r3, textView, textView2, textView3, appCompatTextView);
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
    public static FragmentVerifiedInformationBinding inflate(LayoutInflater layoutInflater) {
        FragmentVerifiedInformationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentVerifiedInformationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_verified_information, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentVerifiedInformationBinding $r3 = bind($r2);
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
