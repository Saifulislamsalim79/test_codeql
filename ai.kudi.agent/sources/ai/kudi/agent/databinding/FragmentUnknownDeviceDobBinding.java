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
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentUnknownDeviceDobBinding implements InterfaceC8209a {
    public final KudiInputField bvnInputField;
    public final KudiInputField dobInputField;
    public final TextView pageSubtitle;
    public final TextView pageTitle;
    private final ScrollView rootView;
    public final KudiButton verifyButton;

    private FragmentUnknownDeviceDobBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiInputField kudiInputField2, TextView textView, TextView textView2, KudiButton kudiButton) {
        this.rootView = scrollView;
        this.bvnInputField = kudiInputField;
        this.dobInputField = kudiInputField2;
        this.pageSubtitle = textView;
        this.pageTitle = textView2;
        this.verifyButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUnknownDeviceDobBinding bind(View view) {
        int $i0 = C0001R.C0003id.bvnInputField;
        View $r1 = view.findViewById(C0001R.C0003id.bvnInputField);
        KudiInputField $r2 = (KudiInputField) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.dobInputField;
            View $r12 = view.findViewById(C0001R.C0003id.dobInputField);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.page_subtitle;
                View $r13 = view.findViewById(C0001R.C0003id.page_subtitle);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.page_title;
                    View $r14 = view.findViewById(C0001R.C0003id.page_title);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.verifyButton;
                        View $r15 = view.findViewById(C0001R.C0003id.verifyButton);
                        KudiButton kudiButton = (KudiButton) $r15;
                        if (kudiButton != null) {
                            ScrollView $r8 = (ScrollView) view;
                            FragmentUnknownDeviceDobBinding $r7 = new FragmentUnknownDeviceDobBinding($r8, $r2, $r3, $r4, textView, kudiButton);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUnknownDeviceDobBinding inflate(LayoutInflater layoutInflater) {
        FragmentUnknownDeviceDobBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUnknownDeviceDobBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_unknown_device_dob, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentUnknownDeviceDobBinding $r3 = bind($r2);
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
