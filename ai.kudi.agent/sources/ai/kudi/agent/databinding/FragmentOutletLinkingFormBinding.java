package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOutletLinkingFormBinding implements InterfaceC8209a {
    public final KudiButton btnAddOutlet;
    public final KudiInputField etOutletPhoneNum;
    public final KudiInputField etOutletPin;
    public final ImageView icLink;
    private final ScrollView rootView;
    public final KudiTextView tvDesc;
    public final KudiTextView tvTitle;

    private FragmentOutletLinkingFormBinding(ScrollView scrollView, KudiButton kudiButton, KudiInputField kudiInputField, KudiInputField kudiInputField2, ImageView imageView, KudiTextView kudiTextView, KudiTextView kudiTextView2) {
        this.rootView = scrollView;
        this.btnAddOutlet = kudiButton;
        this.etOutletPhoneNum = kudiInputField;
        this.etOutletPin = kudiInputField2;
        this.icLink = imageView;
        this.tvDesc = kudiTextView;
        this.tvTitle = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletLinkingFormBinding bind(View view) {
        int $i0 = C0001R.C0003id.btn_add_outlet;
        View $r1 = view.findViewById(C0001R.C0003id.btn_add_outlet);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.et_outlet_phone_num;
            View $r12 = view.findViewById(C0001R.C0003id.et_outlet_phone_num);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.et_outlet_pin;
                View $r13 = view.findViewById(C0001R.C0003id.et_outlet_pin);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.ic_link;
                    View $r14 = view.findViewById(C0001R.C0003id.ic_link);
                    ImageView imageView = (ImageView) $r14;
                    if (imageView != null) {
                        $i0 = C0001R.C0003id.tv_desc;
                        View $r15 = view.findViewById(C0001R.C0003id.tv_desc);
                        KudiTextView kudiTextView = (KudiTextView) $r15;
                        if (kudiTextView != null) {
                            $i0 = C0001R.C0003id.tv_title;
                            View $r16 = view.findViewById(C0001R.C0003id.tv_title);
                            KudiTextView kudiTextView2 = (KudiTextView) $r16;
                            if (kudiTextView2 != null) {
                                ScrollView $r9 = (ScrollView) view;
                                FragmentOutletLinkingFormBinding $r8 = new FragmentOutletLinkingFormBinding($r9, $r2, $r3, kudiInputField, imageView, kudiTextView, kudiTextView2);
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
    public static FragmentOutletLinkingFormBinding inflate(LayoutInflater layoutInflater) {
        FragmentOutletLinkingFormBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOutletLinkingFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_outlet_linking_form, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOutletLinkingFormBinding $r3 = bind($r2);
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
